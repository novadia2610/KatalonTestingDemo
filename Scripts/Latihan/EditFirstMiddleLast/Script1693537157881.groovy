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

CustomKeywords.'login.loginCustom.loginOrange'(GlobalVariable.url, GlobalVariable.username, GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Latihan/Infomation'))

WebUI.click(findTestObject('Object Repository/Latihan/firstName'))

WebUI.clearText(findTestObject('Object Repository/Latihan/firstName'))

WebUI.setText(findTestObject('Object Repository/Latihan/firstName'), FirstName)

WebUI.clearText(findTestObject('Object Repository/Latihan/middleName'))

WebUI.setText(findTestObject('Object Repository/Latihan/middleName'), MiddleName)

WebUI.clearText(findTestObject('Object Repository/Latihan/lastName'))

WebUI.setText(findTestObject('Object Repository/Latihan/lastName'), LastName)

WebUI.click(findTestObject('Object Repository/Latihan/btnSave'))

WebUI.verifyTextPresent(FirstName, false)
