import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:57065/account/login')

WebUI.setText(findTestObject('Login_OR/Page_Login/input_UserName'), 'KHilmi')

WebUI.setText(findTestObject('Login_OR/Page_Login/input_Password'), 'P@ssw0rd')

WebUI.click(findTestObject('Login_OR/Page_Login/input_btn btn-primary'))

WebUI.click(findTestObject('Login_OR/Page_Asset Management System/h2_Dashboard'))

WebUI.verifyElementPresent(findTestObject('Login_OR/Page_Asset Management System/h2_Dashboard'), 0)

WebUI.click(findTestObject('Nav_OR/Page_Asset Management System/a_Setting'))

WebUI.click(findTestObject('Nav_OR/Page_Asset Management System/a_ Asset Model'))

WebUI.verifyElementPresent(findTestObject('PageVerification_OR/Page_Asset Management System/h2_Asset Model'), 0)

WebUI.closeBrowser()

