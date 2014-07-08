set dirProp=D:\workspace\admins\src\main\resources
set dirTC=D:\Tomcat

copy %dirProp%\db01.properties %dirProp%\db.properties 
call mvn clean package -DskipTests
rmdir %dirTC%\webapps\admins01 /S /Q
copy target\admins.war %dirTC%\webapps\admins01.war

copy %dirProp%\db02.properties %dirProp%\db.properties 
call mvn clean package -DskipTests
rmdir %dirTC%\webapps\admins02 /S /Q
copy target\admins.war %dirTC%\webapps\admins02.war

call %dirTC%\bin\startup.bat
