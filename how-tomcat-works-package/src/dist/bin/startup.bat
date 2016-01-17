@echo off
cd ..
set "APP_HOME=%cd%"
set "JAVA_OPTS=-server -Dapp.home=%APP_HOME%"
set "CLASSPATH=%APP_HOME%\lib\*;%APP_HOME%\conf\*"
						
java %JAVA_OPTS% -classpath %CLASSPATH% com.github.zzycjcg.simple.httpserver.Main