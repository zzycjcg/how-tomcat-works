@echo off
set "CURRENT_PATH=%cd%"
cd ..
set "APP_HOME=%cd%"
set "JAVA_OPTS=-server -Dapp.home=%APP_HOME%"
set "CLASSPATH=%APP_HOME%\lib\*;%APP_HOME%\conf\*"

rem return bin dir
cd %CURRENT_PATH%
java %JAVA_OPTS% -classpath %CLASSPATH% com.github.zzycjcg.simple.httpserver.Main