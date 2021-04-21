#!/bin/bash

#cypher-shell -u neo4j -p secret --file test-data.cypher --format verbose
cypher-shell -u neo4j -p secret --file $1 --format verbose
