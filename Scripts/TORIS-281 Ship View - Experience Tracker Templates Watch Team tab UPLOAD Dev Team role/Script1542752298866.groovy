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

WebUI.navigateToUrl('https://toris-demo.solute.us/Extranet/Default.aspx')

WebUI.setText(findTestObject('Object Repository/TORIS-281 TORIS-281 Ship View - Experience Tracker Templates Watch Team tab UPLOAD Dev Team role/Page_ATG Extranet/input_Username_ctl00cphtbx_use'), 
    'saa')

WebUI.setEncryptedText(findTestObject('Object Repository/TORIS-281 TORIS-281 Ship View - Experience Tracker Templates Watch Team tab UPLOAD Dev Team role/Page_ATG Extranet/input_Password_ctl00cphtbx_pas'), 
    '0cU2R0tWEjl49ICU6OTr2A==')

WebUI.click(findTestObject('Object Repository/TORIS-281 TORIS-281 Ship View - Experience Tracker Templates Watch Team tab UPLOAD Dev Team role/Page_ATG Extranet/input_By entering the requeste'))

WebUI.click(findTestObject('Object Repository/TORIS-281 TORIS-281 Ship View - Experience Tracker Templates Watch Team tab UPLOAD Dev Team role/Page_ATG Extranet/a_Ship View'))

WebUI.click(findTestObject('Object Repository/TORIS-281 TORIS-281 Ship View - Experience Tracker Templates Watch Team tab UPLOAD Dev Team role/Page_Ship View/a_Experience Tracker'))

WebUI.click(findTestObject('Object Repository/TORIS-281 TORIS-281 Ship View - Experience Tracker Templates Watch Team tab UPLOAD Dev Team role/Page_Ship View/button_Experience Entry'))

WebUI.click(findTestObject('Object Repository/TORIS-281 TORIS-281 Ship View - Experience Tracker Templates Watch Team tab UPLOAD Dev Team role/Page_Ship View/div_Watch Team'))

WebUI.click(findTestObject('Object Repository/TORIS-281 TORIS-281 Ship View - Experience Tracker Templates Watch Team tab UPLOAD Dev Team role/Page_Ship View/h3_Template DownloadUpload'))

WebUI.click(findTestObject('Object Repository/TORIS-281 TORIS-281 Ship View - Experience Tracker Templates Watch Team tab UPLOAD Dev Team role/Page_Ship View/span_Upload a Watch Team Exper'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/TORIS-281 TORIS-281 Ship View - Experience Tracker Templates Watch Team tab UPLOAD Dev Team role/Page_Ship View/button_UPLOAD'))

'Take this time to click the date picker 5 seconds.'
WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/TORIS-281 TORIS-281 Ship View - Experience Tracker Templates Watch Team tab UPLOAD Dev Team role/Page_Ship View/div_Date_mat-checkbox-inner-co'))

WebUI.click(findTestObject('Object Repository/TORIS-281 TORIS-281 Ship View - Experience Tracker Templates Watch Team tab UPLOAD Dev Team role/Page_Ship View/div_AreaArea'))

WebUI.click(findTestObject('Object Repository/TORIS-281 TORIS-281 Ship View - Experience Tracker Templates Watch Team tab UPLOAD Dev Team role/Page_Ship View/span_OPEN OCEAN'))

WebUI.click(findTestObject('Object Repository/TORIS-281 TORIS-281 Ship View - Experience Tracker Templates Watch Team tab UPLOAD Dev Team role/Page_Ship View/div_Traffic DensityTraffic Den'))

WebUI.click(findTestObject('Object Repository/TORIS-281 TORIS-281 Ship View - Experience Tracker Templates Watch Team tab UPLOAD Dev Team role/Page_Ship View/span_Low'))

WebUI.setText(findTestObject('Object Repository/TORIS-281 TORIS-281 Ship View - Experience Tracker Templates Watch Team tab UPLOAD Dev Team role/Page_Ship View/input_Traffic Density_mat-inpu'), 
    '0800')

WebUI.click(findTestObject('Object Repository/TORIS-281 TORIS-281 Ship View - Experience Tracker Templates Watch Team tab UPLOAD Dev Team role/Page_Ship View/div_Start Time_mat-radio-outer'))

WebUI.click(findTestObject('Object Repository/TORIS-281 TORIS-281 Ship View - Experience Tracker Templates Watch Team tab UPLOAD Dev Team role/Page_Ship View/div_FleetFleet'))

WebUI.click(findTestObject('Object Repository/TORIS-281 TORIS-281 Ship View - Experience Tracker Templates Watch Team tab UPLOAD Dev Team role/Page_Ship View/span_3'))

WebUI.setText(findTestObject('Object Repository/TORIS-281 TORIS-281 Ship View - Experience Tracker Templates Watch Team tab UPLOAD Dev Team role/Page_Ship View/input_Fleet_mat-input-9'), 
    'San Diego')

WebUI.click(findTestObject('Object Repository/TORIS-281 TORIS-281 Ship View - Experience Tracker Templates Watch Team tab UPLOAD Dev Team role/Page_Ship View/button_Events (0)'))

WebUI.click(findTestObject('Object Repository/TORIS-281 TORIS-281 Ship View - Experience Tracker Templates Watch Team tab UPLOAD Dev Team role/Page_Ship View/button_Add Event'))

WebUI.click(findTestObject('Object Repository/TORIS-281 TORIS-281 Ship View - Experience Tracker Templates Watch Team tab UPLOAD Dev Team role/Page_Ship View/div_EventEvent'))

WebUI.click(findTestObject('Object Repository/TORIS-281 TORIS-281 Ship View - Experience Tracker Templates Watch Team tab UPLOAD Dev Team role/Page_Ship View/span_Aircraft Refueling'))

WebUI.setText(findTestObject('Object Repository/TORIS-281 TORIS-281 Ship View - Experience Tracker Templates Watch Team tab UPLOAD Dev Team role/Page_Ship View/input_Event_mat-input-11'), 
    '10')

WebUI.click(findTestObject('Object Repository/TORIS-281 TORIS-281 Ship View - Experience Tracker Templates Watch Team tab UPLOAD Dev Team role/Page_Ship View/button_OK'))

WebUI.click(findTestObject('Object Repository/TORIS-281 TORIS-281 Ship View - Experience Tracker Templates Watch Team tab UPLOAD Dev Team role/Page_Ship View/button_Special Conditions (0)'))

WebUI.click(findTestObject('Object Repository/TORIS-281 TORIS-281 Ship View - Experience Tracker Templates Watch Team tab UPLOAD Dev Team role/Page_Ship View/button_Add Special Condition'))

WebUI.click(findTestObject('Object Repository/TORIS-281 TORIS-281 Ship View - Experience Tracker Templates Watch Team tab UPLOAD Dev Team role/Page_Ship View/div_Special Condition_mat-sele'))

WebUI.click(findTestObject('Object Repository/TORIS-281 TORIS-281 Ship View - Experience Tracker Templates Watch Team tab UPLOAD Dev Team role/Page_Ship View/span_High Traffic Density'))

WebUI.setText(findTestObject('Object Repository/TORIS-281 TORIS-281 Ship View - Experience Tracker Templates Watch Team tab UPLOAD Dev Team role/Page_Ship View/input_Special Condition_mat-in'), 
    '10')

WebUI.click(findTestObject('Object Repository/TORIS-281 TORIS-281 Ship View - Experience Tracker Templates Watch Team tab UPLOAD Dev Team role/Page_Ship View/button_OK'))

WebUI.click(findTestObject('Object Repository/TORIS-281 TORIS-281 Ship View - Experience Tracker Templates Watch Team tab UPLOAD Dev Team role/Page_Ship View/button_Add Comments'))

WebUI.setText(findTestObject('Object Repository/TORIS-281 TORIS-281 Ship View - Experience Tracker Templates Watch Team tab UPLOAD Dev Team role/Page_Ship View/textarea_ABADILLA KENNY ABH2 ('), 
    'asdfsdfa')

WebUI.click(findTestObject('Object Repository/TORIS-281 TORIS-281 Ship View - Experience Tracker Templates Watch Team tab UPLOAD Dev Team role/Page_Ship View/button_OK'))

WebUI.click(findTestObject('Object Repository/TORIS-281 TORIS-281 Ship View - Experience Tracker Templates Watch Team tab UPLOAD Dev Team role/Page_Ship View/button_SUBMIT'))

WebUI.closeBrowser()

