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

WebUI.navigateToUrl('https://toris-demo.solute.us/Extranet/Default.aspx?MSG=100')

WebUI.click(findTestObject('Object Repository/TORIS-272 Ship View - Experience Tracker Templates Watch Bill Manager UPLOAD Ship App Admin role/Page_ATG Extranet/input_You have logged outThank'))

WebUI.setText(findTestObject('Object Repository/TORIS-272 Ship View - Experience Tracker Templates Watch Bill Manager UPLOAD Ship App Admin role/Page_ATG Extranet/input_Username_ctl00cphtbx_use'), 
    'Saa')

WebUI.setEncryptedText(findTestObject('Object Repository/TORIS-272 Ship View - Experience Tracker Templates Watch Bill Manager UPLOAD Ship App Admin role/Page_ATG Extranet/input_Password_ctl00cphtbx_pas'), 
    '0cU2R0tWEjl49ICU6OTr2A==')

WebUI.click(findTestObject('Object Repository/TORIS-272 Ship View - Experience Tracker Templates Watch Bill Manager UPLOAD Ship App Admin role/Page_ATG Extranet/input_By entering the requeste'))

WebUI.click(findTestObject('Object Repository/TORIS-272 Ship View - Experience Tracker Templates Watch Bill Manager UPLOAD Ship App Admin role/Page_ATG Extranet/a_Ship View'))

WebUI.click(findTestObject('Object Repository/TORIS-272 Ship View - Experience Tracker Templates Watch Bill Manager UPLOAD Ship App Admin role/Page_Ship View/a_Experience Tracker'))

WebUI.click(findTestObject('Object Repository/TORIS-272 Ship View - Experience Tracker Templates Watch Bill Manager UPLOAD Ship App Admin role/Page_Ship View/button_Watch Bill Manager'))

WebUI.click(findTestObject('Object Repository/TORIS-272 Ship View - Experience Tracker Templates Watch Bill Manager UPLOAD Ship App Admin role/Page_Ship View/mat-expansion-panel-header_Tem'))

WebUI.click(findTestObject('Object Repository/TORIS-272 Ship View - Experience Tracker Templates Watch Bill Manager UPLOAD Ship App Admin role/Page_Ship View/button_Choose a file..._mat-ic'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/TORIS-272 Ship View - Experience Tracker Templates Watch Bill Manager UPLOAD Ship App Admin role/Page_Ship View/button_UPLOAD'))

WebUI.click(findTestObject('Object Repository/TORIS-272 Ship View - Experience Tracker Templates Watch Bill Manager UPLOAD Ship App Admin role/Page_Ship View/button_SAVE'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/TORIS-272 Ship View - Experience Tracker Templates Watch Bill Manager UPLOAD Ship App Admin role/Page_Ship View/div_Watch bill saved.'))

