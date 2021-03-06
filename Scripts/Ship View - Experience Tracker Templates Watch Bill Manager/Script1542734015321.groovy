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

WebUI.setText(findTestObject('Object Repository/TORIS-268 Ship View - Experience Tracker Templates Watch Bill Manager/Page_ATG Extranet/input_Username_ctl00cphtbx_use'), 
    'Saa')

WebUI.setEncryptedText(findTestObject('Object Repository/TORIS-268 Ship View - Experience Tracker Templates Watch Bill Manager/Page_ATG Extranet/input_Password_ctl00cphtbx_pas'), 
    '0cU2R0tWEjl49ICU6OTr2A==')

WebUI.click(findTestObject('Object Repository/TORIS-268 Ship View - Experience Tracker Templates Watch Bill Manager/Page_ATG Extranet/input_By entering the requeste'))

WebUI.click(findTestObject('Object Repository/TORIS-268 Ship View - Experience Tracker Templates Watch Bill Manager/Page_ATG Extranet/a_Ship View'))

WebUI.click(findTestObject('Object Repository/TORIS-268 Ship View - Experience Tracker Templates Watch Bill Manager/Page_Ship View/a_Experience Tracker'))

WebUI.click(findTestObject('Object Repository/TORIS-268 Ship View - Experience Tracker Templates Watch Bill Manager/Page_Ship View/button_Watch Bill Manager'))

WebUI.click(findTestObject('Object Repository/TORIS-268 Ship View - Experience Tracker Templates Watch Bill Manager/Page_Ship View/h3_Template DownloadUpload'))

WebUI.click(findTestObject('Object Repository/TORIS-268 Ship View - Experience Tracker Templates Watch Bill Manager/Page_Ship View/span_Template Type'))

WebUI.click(findTestObject('Object Repository/TORIS-268 Ship View - Experience Tracker Templates Watch Bill Manager/Page_Ship View/span_Modify Current'))

WebUI.click(findTestObject('Object Repository/TORIS-268 Ship View - Experience Tracker Templates Watch Bill Manager/Page_Ship View/span_Watch Bill Type'))

WebUI.click(findTestObject('Object Repository/TORIS-268 Ship View - Experience Tracker Templates Watch Bill Manager/Page_Ship View/span_COND III'))

WebUI.click(findTestObject('Object Repository/TORIS-268 Ship View - Experience Tracker Templates Watch Bill Manager/Page_Ship View/div_LabelLabel'))

WebUI.click(findTestObject('Object Repository/TORIS-268 Ship View - Experience Tracker Templates Watch Bill Manager/Page_Ship View/span_Copy Short Test'))

WebUI.click(findTestObject('Object Repository/TORIS-268 Ship View - Experience Tracker Templates Watch Bill Manager/Page_Ship View/button_DOWNLOAD'))

