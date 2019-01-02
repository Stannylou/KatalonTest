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

WebUI.click(findTestObject('Object Repository/Page_ATG Extranet/input_Your session has expired'))

WebUI.setText(findTestObject('Object Repository/Page_ATG Extranet/input_Username_ctl00cphtbx_use'), 'Saa')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ATG Extranet/input_Password_ctl00cphtbx_pas'), '0cU2R0tWEjl49ICU6OTr2A==')

WebUI.click(findTestObject('Object Repository/Page_ATG Extranet/input_By entering the requeste'))

WebUI.click(findTestObject('Object Repository/Page_ATG Extranet/a_Ship View'))

WebUI.click(findTestObject('Object Repository/Page_Ship View/a_Experience Tracker'))

WebUI.click(findTestObject('Object Repository/Page_Ship View/button_Experience Entry'))

WebUI.click(findTestObject('Object Repository/Page_Ship View/div_Ship'))

WebUI.click(findTestObject('Object Repository/Page_Ship View/button_ADD EXPERIENCE ENTRY'))

WebUI.click(findTestObject('Object Repository/Page_Ship View/div_Watch Bill TypeWatch Bill'))

WebUI.click(findTestObject('Object Repository/Page_Ship View/span_COND III'))

WebUI.click(findTestObject('Object Repository/Page_Ship View/div_LabelLabel'))

WebUI.click(findTestObject('Object Repository/Page_Ship View/span_Copy Short Test'))

WebUI.click(findTestObject('Object Repository/Page_Ship View/div_SectionSection'))

WebUI.click(findTestObject('Object Repository/Page_Ship View/span_1'))

WebUI.click(findTestObject('Object Repository/Page_Ship View/div_Start Date'))

WebUI.setText(findTestObject('Object Repository/Page_Ship View/input_Section_mat-input-6'), '11/16/2018')

WebUI.click(findTestObject('Object Repository/Page_Ship View/div_End Date'))

WebUI.setText(findTestObject('Object Repository/Page_Ship View/input_MMDDYYYY_mat-input-7'), '11/27/2018')

WebUI.click(findTestObject('Object Repository/Page_Ship View/button_SAVE'))

WebUI.click(findTestObject('Object Repository/Page_Ship View/div_Hours'))

WebUI.setText(findTestObject('Object Repository/Page_Ship View/input_Auto Populate_mat-input-'), '5')

WebUI.click(findTestObject('Object Repository/Page_Ship View/div_Watches'))

WebUI.setText(findTestObject('Object Repository/Page_Ship View/input_Hours_mat-input-21'), '10')

WebUI.click(findTestObject('Object Repository/Page_Ship View/button_Auto Populate'))

WebUI.click(findTestObject('Object Repository/Page_Ship View/button_SAVE'))

