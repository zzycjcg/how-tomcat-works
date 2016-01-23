#!/bin/bash
CURRENT_PATH=`cd`
cd ..
APP_HOME=`pwd`
JAVA_OPTS="-server -Dapp.home=$APP_HOME"
CLASSPATH="$APP_HOME/lib/*:$APP_HOME/conf/*"

# return bin dir
cd $CURRENT_PATH          
java $JAVA_OPTS -classpath $CLASSPATH com.github.zzycjcg.simple.httpserver.Main &