<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
xmlns:My="localhost" 
xmlns:msxsl="urn:schemas-microsoft-com:xslt"
exclude-result-prefixes="My msxsl">

<xsl:output encoding="UTF-8" omit-xml-declaration="yes" indent="yes" method="text" />
<xsl:variable name="Schema" select="//Schema/@Name" />
<xsl:param name="Ident" />

<!--==============================================-->
<xsl:template match="/" name="tmpMain">
	<xsl:apply-templates select="//Entity[@Class = $Ident]" />
</xsl:template>
<!--==============================================-->

<!--==========================================-->
<xsl:template match="Entity" >
	<xsl:variable name="Table" select="concat($Schema, '.', @Table)" />
	<xsl:variable name="Key">
		<xsl:choose>
			<xsl:when test="F[@Name = 'id']">Long</xsl:when>
			<xsl:otherwise><xsl:value-of select="concat(@Class, 'Key')"/></xsl:otherwise>
		</xsl:choose>
	</xsl:variable>
	//Generated <xsl:value-of select="My:Now()" />
	package models;

	import java.util.*;
	import javax.persistence.*;
	import app.*;
	import org.apache.commons.validator.routines.DateValidator;

	@Entity
	@Table(name="<xsl:value-of select="$Table" />")
	public class <xsl:value-of select="@Class" /> implements app.IEntity
	{

	private static final long serialVersionUID = 2L;
	static final String ident = "<xsl:value-of select="@Name"/>";
	static final String type = "<xsl:value-of select="@Class"/>";
	public String getIdent() {return ident;}
	public String getType() {return type;}
	public String getFullInfo() {String s = toString(); s = (s != null) ? s : Const.NEW; return String.format("%s: %s ", type, s);}
	public static String takeIdent() {return ident;}
	public static String takeType() {return type;}
	public static String takeUrlCreate()	{	return app.ObjectUrl.takeUrlCreate(takeIdent(), 0L);	}

	//public static final String ref = "<xsl:value-of select="concat(@Name, '_id')"/>";

	//mapping database fields to entity parameters
	public static Map&lt;String, String&gt; DbE = new HashMap&lt;String, String&gt;();

	static {
	//fill DbE
	<xsl:if test="F[@Name = 'id']">
		DbE.put("<xsl:value-of select="concat(@Name, '_id')"/>", "id");
	</xsl:if>
	<xsl:for-each select="F[@Name != 'id']">
		DbE.put("<xsl:value-of select="@Name"/>", "<xsl:value-of select="@Name"/>");
	</xsl:for-each>
	}//static


	@Override
	public String getUrlEdit()	{		return app.ObjectUrl.takeUrlEdit(getIdent(), id);	}//method

	@Override
	public String toString()
	{
		String Ret = super.toString();

		<xsl:choose>
			<xsl:when test="@Class = 'CurrencyParam'">
				Ret = getCode() + " " + getCurrency_code();
			</xsl:when>
			<xsl:when test="@Class = 'WhlAccount'">
				WhiteLabel ref = getWhl_id();
				String s = ref != null ? ref.getName() : "";
				Ret = getName() + " (" + s + ")";
			</xsl:when>
			<xsl:when test="@Class = 'WhlAccountCurrencyParam'">
				Ret = getCode() + " " + getCurrency_code();
			</xsl:when>
			<xsl:when test="@Class = 'WhlWalletType'">
				WhiteLabel ref = getWhl_id();
				String s = ref != null ? ref.getName() : "";
				Ret = getWallet_type_id().getCode() + " (" + s + ")";
			</xsl:when>
			<xsl:when test="@Class = 'WhlCurrency'">
				WhiteLabel ref = getWhl_id();
				String s = ref != null ? ref.getName() : "";
				Ret = getCurrency_code() + " (" + s + ")";
			</xsl:when>

			<xsl:when test="F[@Name = 'name'] and F[@Name = 'code']">
				Ret = getName();
				if (Ret == null || Ret.length() == 0)
					Ret = getCode();
			</xsl:when>
			<xsl:when test="F[@Name = 'name']">
				Ret = getName();
			</xsl:when>
			<xsl:when test="F[@Name = 'code']">
				Ret = getCode();
			</xsl:when>

		</xsl:choose>
		return Ret;
	}//method

	@Override
	public void fillDefaults()
	{
		<xsl:for-each select="F[@scDef]">
			this.<xsl:value-of select="@Name"/> = <xsl:value-of select="@scDef"/>;
		</xsl:for-each>
	}//function

	public void fill(<![CDATA[Map<String, String[]>]]> values)
	{
	String value;
	<xsl:apply-templates select="F[@Name != 'id']" mode="map" />
	}//function

	//id =====================
	<!--entity has id ?-->
	<xsl:if test="F[@Name='id']">
	@Id
	@Column(name="<xsl:value-of select="@Name" />_id")
		<xsl:if test="F[@AutoInc]">
			<xsl:variable name="SeqName" select="concat(@Table, '_', @Name, '_id_seq')"/>
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="<xsl:value-of select="$SeqName"/>")
	@SequenceGenerator(name="<xsl:value-of select="$SeqName"/>", sequenceName="<xsl:value-of select="concat($Schema, '.', $SeqName)"/>")
		</xsl:if>
	private Long id=0L;
	public Long getId() {return id;}
	public void setId(Long aid) {id = aid;}
	</xsl:if>
	//id =====================

	//fields =====================
	<xsl:apply-templates select="F[@Name != 'id']" />
	//fields =====================

}//class

</xsl:template>
<!--==========================================-->

	<!--==========================================-->
	<xsl:template match="F">
		<xsl:variable name="EntityName" select="substring-before(@Name, '_id')" />
		<xsl:variable name="Type">
			<xsl:choose>
				<xsl:when test="contains(@Name, '_id') and not(@NoRef)">
					<xsl:value-of select="//Entity[@Name=$EntityName]/@Class" />
				</xsl:when>
				<xsl:when test="@Type='text'">String</xsl:when>
				<xsl:when test="contains(@Type, 'char')">String</xsl:when>
				<xsl:when test="@Type='integer'">Integer</xsl:when>
				<xsl:when test="@Type='smallint'">Integer</xsl:when>
				<xsl:when test="@Type='bigint'">Long</xsl:when>
				<xsl:when test="@Type='boolean'">boolean</xsl:when>
				<xsl:when test="@Type='double'">double</xsl:when>
				<xsl:when test="contains(@Type, 'timestamp')">Date</xsl:when>
			</xsl:choose>
		</xsl:variable>

		<xsl:if test="string-length($Type) != 0">

			<xsl:if test="contains(@Name, '_id')" >
			@ManyToOne(fetch=FetchType.EAGER)
			@JoinColumn(name="<xsl:value-of select="@Name" />")
			</xsl:if>
			private <xsl:value-of select="concat($Type, ' ', @Name)" />;
			public <xsl:value-of select="$Type"/> get<xsl:value-of select="My:UpF(string(@Name))"/>() {return <xsl:value-of select="@Name"/>;} //getter
			public void <xsl:value-of select="My:Setter(string(@Name))"/>(<xsl:value-of select="$Type"/> arg_value) {<xsl:value-of select="@Name"/> = arg_value;} //setter
			<xsl:if test="$Type='boolean'">
				public <xsl:value-of select="$Type"/> is<xsl:value-of select="My:UpF(string(@Name))"/>() {return <xsl:value-of select="@Name"/>;} //getter is
			</xsl:if>
		</xsl:if>

	</xsl:template>
	<!--==========================================-->

	<!--=============================-->
	<xsl:template match="F" mode="map">
		value = Utils.getFirst(values.get("<xsl:value-of select="@Name"/>"));
		<xsl:if test="@Type='boolean'">
			this.<xsl:value-of select="My:Setter(string(@Name))"/>((value != null));
		</xsl:if>
		if (value != null)
		{
		<xsl:choose>
			<xsl:when test="contains(@Name, '_id')">
				<xsl:variable name="EntityName" select="substring-before(@Name, '_id')" />
				<xsl:variable name="ClassRef" select="//Entity[@Name=$EntityName]/@Class" />
				Long ent_id = Long.parseLong(value);
				IEntity ent = this.<xsl:value-of select="My:Getter(string(@Name))"/>;
				if (ent == null || ent.getId().equals(ent_id) == false)
				{
					this.<xsl:value-of select="My:Setter(string(@Name))"/>((<xsl:value-of select="$ClassRef"/>)Finder.get(<xsl:value-of select="$ClassRef"/>.takeIdent(), ent_id));
				}//if
			</xsl:when>
			<xsl:when test="@Type='boolean'">
				;//this.<xsl:value-of select="My:Setter(string(@Name))"/>(Boolean.parseBoolean(value));
			</xsl:when>
			<xsl:when test="@Type='integer' or @Type='smallint'">
				this.<xsl:value-of select="My:Setter(string(@Name))"/>(Integer.parseInt(value));
			</xsl:when>
			<xsl:when test="@Type='double'">
				this.<xsl:value-of select="My:Setter(string(@Name))"/>(Double.parseDouble(value));
			</xsl:when>
			<xsl:when test="contains(@Type, 'timestamp')">
				this.<xsl:value-of select="My:Setter(string(@Name))"/>(DateValidator.getInstance().validate(value, Const.FMT_DATE_FULL));
			</xsl:when>
			<xsl:otherwise>
				this.<xsl:value-of select="My:Setter(string(@Name))"/>(value);
			</xsl:otherwise>
		</xsl:choose>
		}//if
	</xsl:template>
	<!--=============================-->


	<!-- recycle bin
	name="{My:IfId(string(@Name), string($FullId))}"

	============-->

<msxsl:script language="VBScript" implements-prefix="My">
<![CDATA[ 
function Now()
	Now = FormatDateTime(Date()) & " " & FormatDateTime(Time())
end function

function UpF(s)
	UpF = UCase(Left(s, 1)) &  Mid(s, 2)
end function

function Setter(s)
	Setter = "set" & UCase(Left(s, 1)) &  Mid(s, 2)
end function

function Getter(s)
	Getter = "get" & UCase(Left(s, 1)) &  Mid(s, 2) & "()"
end function

]]> 
</msxsl:script> 
</xsl:stylesheet>