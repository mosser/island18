#!/bin/bash

for team in is*
do
    cd $team
    mvn org.pitest:pitest-maven:mutationCoverage
    cd ..
done
