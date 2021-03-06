import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://toris-demo.solute.us/Extranet/default.aspx?MSG=200')

WebUI.click(findTestObject('TORIS-449 RE Expiration Tracker Ship filter functionality/Page_ATG Extranet/input_Your session has expired'))

WebUI.setText(findTestObject('TORIS-449 RE Expiration Tracker Ship filter functionality/Page_ATG Extranet/input_Username_ctl00cphtbx_use'), 
    'Saa')

WebUI.setEncryptedText(findTestObject('TORIS-449 RE Expiration Tracker Ship filter functionality/Page_ATG Extranet/input_Password_ctl00cphtbx_pas'), 
    '0cU2R0tWEjl49ICU6OTr2A==')

WebUI.click(findTestObject('TORIS-449 RE Expiration Tracker Ship filter functionality/Page_ATG Extranet/input_By entering the requeste'))

WebUI.click(findTestObject('TORIS-449 RE Expiration Tracker Ship filter functionality/Page_ATG Extranet/a_Ship View'))

WebUI.click(findTestObject('TORIS-449 RE Expiration Tracker Ship filter functionality/Page_Ship View/a_RE Expiration Tracker'))

WebUI.click(findTestObject('TORIS-449 RE Expiration Tracker Ship filter functionality/Page_Ship View/div_ESSEX (LHD 2)Ship'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject(null), 'a')

WebUI.click(findTestObject('TORIS-449 RE Expiration Tracker Ship filter functionality/Page_Ship View/span_ANZIO (CG 68)'))

WebUI.click(findTestObject('TORIS-449 RE Expiration Tracker Ship filter functionality/Page_Ship View/div_ANZIO (CG 68)Ship'))

WebUI.click(findTestObject('TORIS-449 RE Expiration Tracker Ship filter functionality/Page_Ship View/span_ARLEIGH BURKE (DDG 51)'))

WebUI.click(findTestObject('TORIS-449 RE Expiration Tracker Ship filter functionality/Page_Ship View/div_ARLEIGH BURKE (DDG 51)Ship'))

WebUI.click(findTestObject('TORIS-449 RE Expiration Tracker Ship filter functionality/Page_Ship View/span_ARLINGTON (LPD 24)'))

WebUI.click(findTestObject('TORIS-449 RE Expiration Tracker Ship filter functionality/Page_Ship View/div_ARLINGTON (LPD 24)Ship'))

WebUI.sendKeys(findTestObject(null), 'm')

WebUI.click(findTestObject('TORIS-449 RE Expiration Tracker Ship filter functionality/Page_Ship View/span_MAHAN (DDG 72)'))

WebUI.click(findTestObject('TORIS-449 RE Expiration Tracker Ship filter functionality/Page_Ship View/div_MAHAN (DDG 72)Ship'))

WebUI.click(findTestObject('TORIS-449 RE Expiration Tracker Ship filter functionality/Page_Ship View/span_MAKIN ISLAND (LHD 8)'))

WebUI.click(findTestObject('TORIS-449 RE Expiration Tracker Ship filter functionality/Page_Ship View/div_MAKIN ISLAND (LHD 8)Ship'))

WebUI.click(findTestObject('TORIS-449 RE Expiration Tracker Ship filter functionality/Page_Ship View/span_MASON (DDG 87)'))

WebUI.verifyElementText(findTestObject('TORIS-449 RE Expiration Tracker Ship filter functionality/3M/Page_Ship View/th_3M'), 
    '3M')

