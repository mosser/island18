#!/bin/bash


for champ in week*
do
    for team in ../deliveries/is*
    do
	T=`echo $team | cut -d '/' -f3`
	TIME=`cat $champ/README.md | grep -A1 \\\\[$T\\\\] | grep -E -o '[0-9]*ms' | cut -d 'm' -f1`
	echo $champ $T $TIME 
    done
done
