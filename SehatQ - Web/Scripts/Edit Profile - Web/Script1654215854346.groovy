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

WebUI.navigateToUrl('https://www.sehatq.com/')

WebUI.click(findTestObject('Object Repository/SehatQ Main Page/img_SehatQ For Corporate_sc-jzJRlG fXwot'))

WebUI.click(findTestObject('Object Repository/SehatQ Edit Profile Page/span_Email'))

WebUI.click(findTestObject('Object Repository/SehatQ Edit Profile Page/span_Email'))

WebUI.setText(findTestObject('SehatQ Login Page/input_email'), 'kevandharma@mailinator.com')

WebUI.setEncryptedText(findTestObject('SehatQ Login Page/input_password'), 'ncdVy7ZxgTI=')

WebUI.click(findTestObject('Object Repository/SehatQ Edit Profile Page/button_Login'))

WebUI.click(findTestObject('Object Repository/SehatQ Edit Profile Page/span_Lewati'))

WebUI.click(findTestObject('Object Repository/SehatQ Main Page/account_icon'))

WebUI.click(findTestObject('Object Repository/SehatQ Main Page/a_Profil'))

WebUI.click(findTestObject('Object Repository/SehatQ Profile Page/a_Edit Profil'))

WebUI.click(findTestObject('Object Repository/SehatQ Edit Profile Page/button_Pilih Jenis Kelamin'))

WebUI.click(findTestObject('Object Repository/SehatQ Edit Profile Page/a_Laki-laki'))

WebUI.click(findTestObject('Object Repository/SehatQ Edit Profile Page/i_Tanggal Lahir_sc-EHOje kIWGLy'))

WebUI.click(findTestObject('Object Repository/SehatQ Edit Profile Page/div_1'))

WebUI.click(findTestObject('Object Repository/SehatQ Edit Profile Page/span_Tinggi Badan (cm)'))

WebUI.clearText(findTestObject('SehatQ Edit Profile Page/input_Jenis Kelamin_height'))

WebUI.setText(findTestObject('Object Repository/SehatQ Edit Profile Page/input_Jenis Kelamin_height'), '175')

WebUI.click(findTestObject('Object Repository/SehatQ Edit Profile Page/span_Berat Badan (kg)'))

WebUI.clearText(findTestObject('SehatQ Edit Profile Page/input_Tinggi Badan (cm)_weight'))

WebUI.setText(findTestObject('Object Repository/SehatQ Edit Profile Page/input_Tinggi Badan (cm)_weight'), '75')

WebUI.click(findTestObject('Object Repository/SehatQ Edit Profile Page/span_Alamat'))

WebUI.setText(findTestObject('Object Repository/SehatQ Edit Profile Page/textarea_Jalan Jakarta'), 'Jalan Jakarta')

WebUI.click(findTestObject('Object Repository/SehatQ Edit Profile Page/button_Simpan'))

WebUI.closeBrowser()

