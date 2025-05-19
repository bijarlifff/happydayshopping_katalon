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
// ------------
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory

import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.nativekey.AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent

Mobile.startApplication('C:\\Users\\asus\\Desktop\\Course QA\\Katalon\\happyDayShopping\\APK\\HappyDayShopping.apk', false)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Search Product/searchBtn'), 0)

Mobile.setText(findTestObject('Search Product/searchBox'), 'samsung', 0)

MobileDriverFactory.getDriver().pressKey(new KeyEvent(AndroidKey.ENTER))

Mobile.scrollToText('Samsung Galaxy A16 5G Cellphone (original) with 1 year warranty', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Search Product/Samsung Galaxy A16 5G Cellphone (original) with 1 year warranty'), 
    10)

Mobile.closeApplication()

