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



class MakeAppoipment {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@And("I click on facility button")
	def clickFacility() {
		println ("\n I am inside clickFacility ")
		WebUI.selectOptionByValue(findTestObject('Object Repository/MakeAppoipment/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'),
		'Hongkong CURA Healthcare Center', true)
	}

	@And("I check on hospital readmission ")
	def checkReadmission() {
		println ("\n I am inside checkReadmission ")
		WebUI.click(findTestObject('Object Repository/MakeAppoipment/Page_CURA Healthcare Service/input_Apply for hospital readmission_hospit_63901f'))
	}

	@And("I check on healthcare program")
	def checkProgram(String username, String password) {
		println ("\n I am inside checkProgram ")
		WebUI.click(findTestObject('Object Repository/MakeAppoipment/Page_CURA Healthcare Service/input_Medicaid_programs'))
	}

	@And("I click on visit date")
	def clickVisit() {
		println ("\n I am inside clickVisit ")
		WebUI.click(findTestObject('Object Repository/MakeAppoipment/Page_CURA Healthcare Service/span_Visit Date (Required)_glyphicon glyphi_cada34'))
		WebUI.click(findTestObject('Object Repository/MakeAppoipment/Page_CURA Healthcare Service/td_16'))
	}

	@And("I click on comment")
	def clickComment() {
		println ("\n I am inside clickComment ")
		WebUI.setText(findTestObject('Object Repository/MakeAppoipment/Page_CURA Healthcare Service/textarea_Comment_comment'),
		'test make a appoipment')
	}

		@And("I click on book appoipment button")
		def clickBookAppoipment() {
			println ("\n I am inside clickBookAppoipment ")
			WebUI.click(findTestObject('Object Repository/MakeAppoipment/Page_CURA Healthcare Service/button_Book Appointment'))
		}

		@Then("Then I should be able to appoipment successfully")
		def bookAppoipmentSuccess() {
			println ("\n I am inside bookAppoipmentSuccess ")
			WebUI.click(findTestObject('Object Repository/MakeAppoipment/Page_CURA Healthcare Service/h2_Appointment Confirmation'))
			WebUI.closeBrowser()
		}
	}