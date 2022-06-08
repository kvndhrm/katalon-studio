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

Mobile.startApplication('C:\\Users\\kevan\\Downloads\\SehatQ Doctor Consultation_v3.1.0_apkpure.com.apk', true)

Mobile.getText(findTestObject('Object Repository/Edit Profile Page/android.widget.TextView - Paket Medical check-up'), 0)

Mobile.tap(findTestObject('Object Repository/Edit Profile Page/android.widget.ImageView'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Edit Profile Page/android.widget.EditText - Email'), 'kevandharma@mailinator.com')

Mobile.sendKeys(findTestObject('Object Repository/Edit Profile Page/android.widget.EditText - 123qweQWE'), '123qwe')

Mobile.tap(findTestObject('Object Repository/Edit Profile Page/android.widget.Button - Log In'), 0)

Mobile.tap(findTestObject('Object Repository/Edit Profile Page/android.widget.TextView - Lewati'), 0)

Mobile.tap(findTestObject('Object Repository/Edit Profile Page/android.widget.TextView - Ya'), 0)

Mobile.closeApplication()

