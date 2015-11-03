set JAR="TicTacToeSjosund.jar"
set TAR="TicTacToeSjosund.tar"
set ZIP="TicTacToeSjosund.zip"
set LOCATION="C:\temp"

REM Clean, build and deploy
call bin\clean.bat
call bin\build.bat
call bin\package.bat
call bin\convert_doc.bat
call bin\unit_test.bat

REM If directory exists, remove it
if exist %LOCATION% del /F %LOCATION%

REM If destionation folder doesn't exist, create it
if not exist "%LOCATION%" mkdir %LOCATION%


REM Copy the packaged files/report to directory outside working directory.
copy build\libs\%JAR% %LOCATION%
copy build\distributions\%TAR% %LOCATION%
copy build\distributions\%ZIP% %LOCATION%
xcopy build\reports %LOCATION% /s /e /y
xcopy docs\html %LOCATION$% /s /e /y

REM Run application once
java -jar %LOCATION%\\%JAR%