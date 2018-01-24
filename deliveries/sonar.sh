#!/bin/bash

for team in is*
do
    cd $team
    mvn sonar:sonar \
      -Dsonar.host.url=http://localhost:9000 \
      -Dsonar.login=670eabbe264bd3b7518ad67c6bc8d31522309cbc
    cd ..
done
