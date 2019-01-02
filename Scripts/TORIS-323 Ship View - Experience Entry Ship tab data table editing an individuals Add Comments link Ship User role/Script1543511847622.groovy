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

WebUI.click(findTestObject('Object Repository/TORIS-323 Ship View - Experience Entry Ship tab data table editing an individuals Add Comments link Ship User role/Page_ATG Extranet/input_Your session has expired'))

WebUI.setText(findTestObject('Object Repository/TORIS-323 Ship View - Experience Entry Ship tab data table editing an individuals Add Comments link Ship User role/Page_ATG Extranet/input_Username_ctl00cphtbx_use'), 
    'Saa')

WebUI.setEncryptedText(findTestObject('Object Repository/TORIS-323 Ship View - Experience Entry Ship tab data table editing an individuals Add Comments link Ship User role/Page_ATG Extranet/input_Password_ctl00cphtbx_pas'), 
    '0cU2R0tWEjl49ICU6OTr2A==')

WebUI.click(findTestObject('Object Repository/TORIS-323 Ship View - Experience Entry Ship tab data table editing an individuals Add Comments link Ship User role/Page_ATG Extranet/input_By entering the requeste'))

WebUI.click(findTestObject('Object Repository/TORIS-323 Ship View - Experience Entry Ship tab data table editing an individuals Add Comments link Ship User role/Page_ATG Extranet/a_Ship View'))

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/TORIS-323 Ship View - Experience Entry Ship tab data table editing an individuals Add Comments link Ship User role/Page_Ship View/a_Experience Tracker'))

WebUI.delay(3)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/TORIS-323 Ship View - Experience Entry Ship tab data table editing an individuals Add Comments link Ship User role/Page_Ship View/div_Ship'))

WebUI.click(findTestObject('Object Repository/TORIS-323 Ship View - Experience Entry Ship tab data table editing an individuals Add Comments link Ship User role/Page_Ship View/button_ADD EXPERIENCE ENTRY'))

WebUI.click(findTestObject('Object Repository/TORIS-323 Ship View - Experience Entry Ship tab data table editing an individuals Add Comments link Ship User role/Page_Ship View/div_Watch Bill TypeWatch Bill'))

WebUI.click(findTestObject('Object Repository/TORIS-323 Ship View - Experience Entry Ship tab data table editing an individuals Add Comments link Ship User role/Page_Ship View/span_COND III'))

WebUI.click(findTestObject('Object Repository/TORIS-323 Ship View - Experience Entry Ship tab data table editing an individuals Add Comments link Ship User role/Page_Ship View/div_LabelLabel'))

WebUI.click(findTestObject('Object Repository/TORIS-323 Ship View - Experience Entry Ship tab data table editing an individuals Add Comments link Ship User role/Page_Ship View/span_Copy Short Test'))

WebUI.click(findTestObject('Object Repository/TORIS-323 Ship View - Experience Entry Ship tab data table editing an individuals Add Comments link Ship User role/Page_Ship View/div_SectionSection'))

WebUI.click(findTestObject('Object Repository/TORIS-323 Ship View - Experience Entry Ship tab data table editing an individuals Add Comments link Ship User role/Page_Ship View/span_1'))

WebUI.click(findTestObject('Object Repository/TORIS-323 Ship View - Experience Entry Ship tab data table editing an individuals Add Comments link Ship User role/Page_Ship View/button_Start Date_mat-icon-but'))

WebUI.click(findTestObject('Object Repository/TORIS-323 Ship View - Experience Entry Ship tab data table editing an individuals Add Comments link Ship User role/Page_Ship View/div_12'))

WebUI.click(findTestObject('Object Repository/TORIS-323 Ship View - Experience Entry Ship tab data table editing an individuals Add Comments link Ship User role/Page_Ship View/button_End Date_mat-icon-butto'))

WebUI.click(findTestObject('Object Repository/TORIS-323 Ship View - Experience Entry Ship tab data table editing an individuals Add Comments link Ship User role/Page_Ship View/div_27'))

WebUI.click(findTestObject('Object Repository/TORIS-323 Ship View - Experience Entry Ship tab data table editing an individuals Add Comments link Ship User role/Page_Ship View/button_SAVE'))

WebUI.click(findTestObject('Object Repository/TORIS-323 Ship View - Experience Entry Ship tab data table editing an individuals Add Comments link Ship User role/Page_Ship View/button_Add Comments'))

WebUI.setText(findTestObject('Object Repository/TORIS-323 Ship View - Experience Entry Ship tab data table editing an individuals Add Comments link Ship User role/Page_Ship View/textarea_ABADILLA KENNY ABH2 ('), 
    'asdf')

WebUI.click(findTestObject('Object Repository/TORIS-323 Ship View - Experience Entry Ship tab data table editing an individuals Add Comments link Ship User role/Page_Ship View/button_OK'))

WebUI.click(findTestObject('Object Repository/TORIS-323 Ship View - Experience Entry Ship tab data table editing an individuals Add Comments link Ship User role/Page_Ship View/button_Edit Comments'))

WebUI.click(findTestObject('Object Repository/TORIS-323 Ship View - Experience Entry Ship tab data table editing an individuals Add Comments link Ship User role/Page_Ship View/button_CANCEL'))

WebUI.click(findTestObject('Object Repository/TORIS-323 Ship View - Experience Entry Ship tab data table editing an individuals Add Comments link Ship User role/Page_Ship View/button_SAVE'))

