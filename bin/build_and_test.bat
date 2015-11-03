#!/bin/bash

./bin/clean.bat
./bin/compile.bat
./bin/compile_tests.bat
./gradlew pmdMain.bat
./gradlew pmdTest.bat
./bin/unit_test.bat
