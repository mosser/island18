#!/bin/bash

OPTS="-DoutputFormats=XML -DtimestampedReports=false -Dthreads=4"

for team in is*
do
    cd $team
    mvn $OPTS org.pitest:pitest-maven:mutationCoverage
    cd ..
done
