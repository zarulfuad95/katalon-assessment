package common
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import org.openqa.selenium.Keys as Keys


class PosMalaysiaAssessment {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I want navigate to pos homepage")
	def Homepage() {
		WebUI.openBrowser('https://www.pos.com.my/send/ratecalculator')
		WebUI.maximizeWindow()
	}

	@When("I enter {string} as the postcode from Malaysia Country")
	def I_enter_value_postcode_from_Malaysia_Country(String postcode) {
		WebUI.setText(findTestObject('Object Repository/Pos_Malaysia/input_postcode'),postcode)
	}
	@And("I Click the dropdown country")
	def I_Click_the_dropdown_country() {
		WebUI.waitForElementPresent(findTestObject('Object Repository/Pos_Malaysia/div_dropdownCountry'), GlobalVariable.MIN_WAIT)
		WebUI.click(findTestObject('Object Repository/Pos_Malaysia/div_dropdownCountry'))
	}
	@And("I Enter {string} Country")
	def Enter_Country(String Country) {
		WebUI.waitForElementPresent(findTestObject('Object Repository/Pos_Malaysia/div_dropdownCountry'), GlobalVariable.MIN_WAIT)
		WebUI.sendKeys(findTestObject('Object Repository/Pos_Malaysia/div_dropdownCountry'), Keys.chord(Keys.CONTROL, 'a'))
		WebUI.sendKeys(findTestObject('Object Repository/Pos_Malaysia/div_dropdownCountry'), Keys.chord(Keys.BACK_SPACE))
		WebUI.setText(findTestObject('Object Repository/Pos_Malaysia/div_dropdownCountry'),Country)
			
	}
	@And("I select {string} with code {string}")
	def selectCountry(String countryName, String countryCode) {
		WebUI.waitForElementPresent(findTestObject('Object Repository/Pos_Malaysia/mat-option_country',['param1':countryName,'param2':countryCode]),GlobalVariable.MIN_WAIT)
		WebUI.click(findTestObject('Object Repository/Pos_Malaysia/mat-option_country',['param1':countryName,'param2':countryCode]))
	}
	@And("I insert {string} as Weight")
	def I_insert_Weight(String Weight) {  
		WebUI.waitForElementPresent(findTestObject('Object Repository/Pos_Malaysia/Input_itemweight'),GlobalVariable.MIN_WAIT)
		WebUI.setText(findTestObject('Object Repository/Pos_Malaysia/Input_itemweight'),Weight)
	}
	@Then("I Click Calculate button")
	def I_Click_Calculate_button() {
		WebUI.waitForElementPresent(findTestObject('Object Repository/Pos_Malaysia/a_CalculateButton'),GlobalVariable.MIN_WAIT)
		WebUI.click(findTestObject('Object Repository/Pos_Malaysia/a_CalculateButton'))
	}
	
	
	
}