#!/bin/bash

### Invoke the java class App.java for comparing the xml files

JAVA_HOME=C:\Program Files\Java\jdk1.8.0_131
CLASSPATH=C:\workspace\pdsm\target\classes\com\fedex\myproject\App.jar

$JAVA_HOME/bin/java -mx384m -cp $CLASSPATH com.fedex.pdsm.App.java $*

if [ $? -ne 0 ]; then
	echo "Failed to run xmlCompare job"
	exit 100
else
	echo "Successfully completed the xmlCompare job"
fi