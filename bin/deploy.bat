set JAR="TicTacToeSjosund.jar"
set TAR="TicTacToeSjosund.tar"
set ZIP="TicTacToeSjosund.zip"
set LOCATION="C:\temp"
set DOCLOCATION="c:\temp\docs"
set dr="designreport.html"
set am="administrationmanual.html"
set dm="developmentmanual.html"

REM Clean, build and deploy
call bin\clean.bat
call bin\build.bat
call bin\package.bat
call bin\convert_doc.bat
call bin\unit_test.bat

REM If directory exists, remove it
if exist %LOCATION% del /F %LOCATION%
if exist %DOCLOCATION% del /F %DOCLOCATION%

REM If destionation folder doesn't exist, create it
if not exist "%LOCATION%" mkdir %LOCATION%
if not exist "%DOCLOCATION%" mkdir %DOCLOCATION%


REM Copy the packaged files/report to directory outside working directory.
copy build\libs\%JAR% %LOCATION%
copy build\distributions\%TAR% %LOCATION%
copy build\distributions\%ZIP% %LOCATION%
xcopy build\reports %LOCATION% /s /e /y
copy docs\html\%am% %DOCLOCATION%
copy docs\html\%dr% %DOCLOCATION%
copy docs\html\%dm% %DOCLOCATION%

REM Run application once
java -jar %LOCATION%\\%JAR%
