#!/bin/bash
cd ..
APP_HOME=`pwd`
JAVA_OPTS="-server -Dapp.home=$APP_HOME"
CLASSPATH="$APP_HOME/lib/*:$APP_HOME/conf/*"
                        
java $JAVA_OPTS -classpath $CLASSPATH com.github.zzycjcg.simple.httpserver.Main &