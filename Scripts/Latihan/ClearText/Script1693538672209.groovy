import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://demoqa.com/text-box')
WebUI.setText(findTestObject('Object Repository/Clear/input_Full Name_userName'), username)
WebUI.setText(findTestObject('Object Repository/Clear/input_Email_userEmail'), email)
WebUI.setText(findTestObject('Object Repository/Clear/textarea_Current Address_currentAddress'), "Cileungsi")
WebUI.setText(findTestObject('Object Repository/Clear/textarea_Permanent Address_permanentAddress'), "Cileungsi")
WebUI.delay(5)
WebUI.clearText(findTestObject('Object Repository/Clear/input_Full Name_userName'))
WebUI.delay(5)
WebUI.clearText(findTestObject('Object Repository/Clear/input_Email_userEmail'))
WebUI.delay(5)
WebUI.clearText(findTestObject('Object Repository/Clear/textarea_Current Address_currentAddress'))
WebUI.delay(5)
WebUI.clearText(findTestObject('Object Repository/Clear/textarea_Permanent Address_permanentAddress'))
WebUI.delay(5)

