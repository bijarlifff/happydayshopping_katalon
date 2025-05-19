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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent

Mobile.startApplication('C:\\Users\\asus\\Desktop\\Course QA\\Katalon\\happyDayShopping\\APK\\HappyDayShopping.apk', false)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Navigation/tabContactUsBtn'), 0)

Mobile.verifyElementExist(findTestObject('Navigation/elementContactUs'), 10)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Navigation/tabAboutBtn'), 0)

Mobile.scrollToText('Looking for even more products? Were just a message away!', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Navigation/elementAbout'), 10)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Navigation/tabYourBagBtn'), 0)

Mobile.verifyElementExist(findTestObject('Navigation/elementYourBag'), 10)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Navigation/tabCatalogBtn'), 0)

Mobile.scrollToText('Smart Simcard', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Navigation/elementCatalog'), 10)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Navigation/tabMenuBtn'), 0)

Mobile.verifyElementExist(findTestObject('Navigation/elementMenu'), 10)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Navigation/backBtn'), 0)

Mobile.closeApplication()

