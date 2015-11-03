set JAR="TicTacToeSjosund.jar"
set TAR="TicTacToeSjosund.tar"
set ZIP="TicTacToeSjosund.zip"
set LOCATION="C:\temp"

REM Clean, build and deploy
call bin\clean.bat
call bin\build.bat
call bin\package.bat

REM remove the jar file if it exists
if exist %LOCATION%%JAR% del /F %LOCATION%%JAR%

REM if destination folder doesnt exist, create it
if not exist "%LOCATION%" mkdir %LOCATION%

copy build\libs\%JAR% %LOCATION%

REM Run application
java -jar %LOCATION%\\%JAR%