del __allModel.bat
msxsl EntityConfiguration.xml GenerateBat.xsl -o __allModel.bat -t one_bat=getModel
pause
call __allModel.bat
