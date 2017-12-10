# zac-itest

Zoo Adoption Center (zac) is web application for adoption of animal. The web testing is covered with Cucumber and Selenium tests.

# Instructions

Clone the repo:

Git:
```
$ git clone git@github.com:pallavim19/zac-itest.git
```

Or download a ZIP of master [manually](https://github.com/pallavim19/zac-itest.git) and expand the contents someplace on your system

## Prerequisites

In order to run browser tests, Selenium will need to be able to drive a browser
installed to your system.

## Verify installation

## Use Maven

Open a command window and run:

    mvn clean -Dwebdriver.gecko.driver="<path of geckodriver.exe>" -Dbrowser=firefox test

This runs Cucumber features using Cucumber's JUnit runner. 
