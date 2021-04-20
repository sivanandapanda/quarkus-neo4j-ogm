#!/bin/bash

#cypher-shell -u neo4j -p test --file test-data.cypher --format verbose
cypher-shell -u neo4j -p test --file $1 --format verbose
