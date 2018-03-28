#!/bin/bash

# The All Together


DIR=$1

cd $DIR

mvn org.jacoco:jacoco-maven-plugin:prepare-agent clean install

mvn -DoutputFormats=XML -Dthreads=4 \
      org.pitest:pitest-maven:mutationCoverage

mvn sonar:sonar \
      -Dsonar.host.url=http://localhost:9000 \
      -Dsonar.login=670eabbe264bd3b7518ad67c6bc8d31522309cbc

cd ..
