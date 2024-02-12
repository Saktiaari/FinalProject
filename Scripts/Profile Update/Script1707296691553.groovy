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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.click(findTestObject('Object Repository/Update Profile/Page_Advantage Shopping/a_My account                        My orde_124641'))

WebUI.setText(findTestObject('Object Repository/Update Profile/Page_Advantage Shopping/input_OR_username'), 'Demo12')

WebUI.setEncryptedText(findTestObject('Object Repository/Update Profile/Page_Advantage Shopping/input_Username_password'), 
    '2Z8wDPWkLz0=')

WebUI.sendKeys(findTestObject('Object Repository/Update Profile/Page_Advantage Shopping/input_Username_password'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Update Profile/Page_Advantage Shopping/a_Demo12                                   _9e9cae'))

WebUI.click(findTestObject('Object Repository/Update Profile/Page_Advantage Shopping/label_My account'))

WebUI.click(findTestObject('Object Repository/Update Profile/Page_Advantage Shopping/a_Edit'))

WebUI.setText(findTestObject('Object Repository/Update Profile/Page_Advantage Shopping/input__emailAccountDetails'), 'demo1234@gmail.com')

WebUI.setText(findTestObject('Object Repository/Update Profile/Page_Advantage Shopping/input_PERSONAL DETAILS_first_nameAccountDetails'), 
    'Demo112')

WebUI.selectOptionByValue(findTestObject('Object Repository/Update Profile/Page_Advantage Shopping/select_AfganistanAlbaniaAlgeriaAmerican Sam_3cef8a'), 
    'object:323', true)

WebUI.setText(findTestObject('Object Repository/Update Profile/Page_Advantage Shopping/input_Country_cityAccountDetails'), 
    'Jakarta')

WebUI.click(findTestObject('Object Repository/Update Profile/Page_Advantage Shopping/button_SAVE'))

