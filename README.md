# Katalon Studio Test Automation Project

This repository contains the Katalon Studio project for automating the Pos Malaysia Assessment.

## Project Overview

This Katalon Studio project includes the test cases, feature files, and scripts needed to automate tests for the Pos Malaysia shipping and API systems.

## Instructions

1. Import the Katalon project into Katalon Studio.
2. Follow the documentation in Katalon Studio for the details on how to execute each test case.

## Test Cases Covered

1. **PosMalaysiaAssessment**: A test case for verifying Pos Malaysia's shipping information.
2. **PosMalaysiaAssessment.feature**: The Gherkin feature file that describes the behavior in a structured format.
3. **PosMalaysiaAssessment.groovy**: Groovy script that implements the logic for the test case.

## How to Import the Project into Katalon Studio

1. Open Katalon Studio.
2. Click on **File** in the top-left corner and select **Import**.
3. Choose **Existing Projects into Workspace** and click **Next**.
4. Browse for the cloned project directory and select it.
5. Click **Finish** to import the project into Katalon Studio.

## How to Run Tests

1. Open the imported project in Katalon Studio.
2. Navigate to the **Test Cases** section on the left side panel.
3. Right-click on the **PosMalaysiaAssessment** test case and click **Run** to execute the test.
4. Alternatively, select **Run** from the toolbar to run the test case.

## How to View Reports

1. After executing the tests, go to the **Reports** folder in your project directory.
2. Open the latest report file (e.g., `.html` or `.xml`) to view the test execution results.

## Running Tests from Command Line

1. You can also run the tests from the command line using Katalon’s built-in command line tool. To do this, use the following command:

   ```bash
   katalon -noSplash -runMode=console -consoleLog -projectPath="<path_to_project>" -testSuitePath="Test Suites/PosMalaysiaAssessment"
