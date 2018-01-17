#!/bin/bash

for team in is*
do
    cd $team
    mvn sonar:sonar
    cd ..
done 
