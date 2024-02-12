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

WebUI.click(findTestObject('Object Repository/Checkout/Page_Advantage Shopping/svg_CHECKOUT  (0.00)_menuUser'))

WebUI.setText(findTestObject('Object Repository/Checkout/Page_Advantage Shopping/input_OR_username'), 'dika12')

WebUI.setEncryptedText(findTestObject('Object Repository/Checkout/Page_Advantage Shopping/input_Username_password'), 'fXA3uZeumTE=')

WebUI.sendKeys(findTestObject('Object Repository/Checkout/Page_Advantage Shopping/input_Username_password'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Advantage Shopping/div_TABLETS                        Shop Now'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Advantage Shopping/svg_SHOP NOW_menuCart'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Advantage Shopping/span_Color_rabbit'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Advantage Shopping/div_Quantity_plus'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Advantage Shopping/button_ADD TO CART'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Advantage Shopping/svg_SHOP NOW_menuCart'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Advantage Shopping/a_EDIT'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Advantage Shopping/div_Quantity_minus'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Advantage Shopping/button_ADD TO CART'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Advantage Shopping/button_CHECKOUT (1,488.00)'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Advantage Shopping/button_NEXT'))

WebUI.setText(findTestObject('Object Repository/Checkout/Page_Advantage Shopping/input__safepay_username'), 'dika12')

WebUI.setEncryptedText(findTestObject('Object Repository/Checkout/Page_Advantage Shopping/input__safepay_password'), 'fXA3uZeumTE=')

WebUI.click(findTestObject('Object Repository/Checkout/Page_Advantage Shopping/button_PAY NOW'))

