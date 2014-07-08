del __allJspItem.bat
msxsl EntityConfiguration.xml GenerateBat.xsl -o __allJspItem.bat -t one_bat=getJspItem
pause
call __allJspItem.bat
