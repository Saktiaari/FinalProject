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

WebUI.click(findTestObject('Object Repository/Register/Page_Advantage Shopping/svg_CHECKOUT  (0.00)_menuUser'))

WebUI.click(findTestObject('Object Repository/Register/Page_Advantage Shopping/a_CREATE NEW ACCOUNT'))

WebUI.setText(findTestObject('Object Repository/Register/Page_Advantage Shopping/input__usernameRegisterPage'), Username)

WebUI.setText(findTestObject('Object Repository/Register/Page_Advantage Shopping/input_Email_emailRegisterPage'), Email)

WebUI.setText(findTestObject('Object Repository/Register/Page_Advantage Shopping/input__passwordRegisterPage'), 
    Password)

WebUI.setText(findTestObject('Object Repository/Register/Page_Advantage Shopping/input__confirm_passwordRegisterPage'), 
    Confirm_Password)

//WebUI.setText(findTestObject('Object Repository/Register/Page_Advantage Shopping/input_PERSONAL DETAILS_first_nameRegisterPage'), 
//    'Demo')
//
//WebUI.setText(findTestObject('Object Repository/Register/Page_Advantage Shopping/input_- Use maximum 30 character_last_nameR_6ef033'), 
//    '12')

String username = WebUI.getAttribute(findTestObject('Object Repository/Register/Page_Advantage Shopping/input__usernameRegisterPage'), 'value')
String email = WebUI.getAttribute(findTestObject('Object Repository/Register/Page_Advantage Shopping/input_Email_emailRegisterPage'), 'value')
String password = WebUI.getAttribute(findTestObject('Object Repository/Register/Page_Advantage Shopping/input__passwordRegisterPage'),'value')
String ConfirmPassword = WebUI.getAttribute(findTestObject('Object Repository/Register/Page_Advantage Shopping/input__confirm_passwordRegisterPage'),'value')
if (username != "" && email != "" && password != "" && ConfirmPassword != "") {
	WebUI.check(findTestObject('Object Repository/Register/Page_Advantage Shopping/Page_Advantage Shopping/input_Receive exclusive offers and promotions from Advantage_i_agree'))
	WebUI.click(findTestObject('Object Repository/Register/Page_Advantage Shopping/button_REGISTER'))
} else {
	println("isi data dulu bos")
}
//WebUI.check(findTestObject('Object Repository/Register/Page_Advantage Shopping/Page_Advantage Shopping/input_Receive exclusive offers and promotions from Advantage_i_agree'))
//WebUI.click(findTestObject('Object Repository/Register/Page_Advantage Shopping/button_REGISTER'))
def verif = WebUI.verifyElementVisible(findTestObject('Object Repository/Register/Page_Advantage Shopping/namaakun'),FailureHandling.OPTIONAL)
if (verif) {
	println("Akun berhasil didaftarkan")
} else {
	println("Akun sudah terdaftar, silahkan login atau klik lupa password")
}

//WebUI.verifyElementVisible(findTestObject('Object Repository/Register/Page_Advantage Shopping/namaakun'))