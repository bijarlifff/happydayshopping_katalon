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

Mobile.startApplication('C:\\Users\\asus\\Desktop\\Course QA\\Katalon\\happyDayShopping\\APK\\HappyDayShopping.apk', true)
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

List<Map> categories = [
	[
		('menuBtn') : 'Shopping Bag/promotionsBtn',
		('items') : ['Shopping Bag/item1Btn', 'Shopping Bag/item2Btn']
	],
	[
		('menuBtn') : 'Shopping Bag/newproductsBtn',
		('items') : ['Shopping Bag/item3Btn', 'Shopping Bag/item4Btn']
	]
]

for (def category : categories) {
    Mobile.tap(findTestObject(category.menuBtn), 0)
    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)
    for (def itemBtn : category.items) {
        Mobile.tap(findTestObject(itemBtn), 0)
        Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)
        Mobile.tap(findTestObject('Shopping Bag/addtoBagBtn'), 0)
        Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)
        Mobile.pressBack()
        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)
    }
    Mobile.pressBack()
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)
}

Mobile.tap(findTestObject('Shopping Bag/tabYourBagBtn'), 0)
Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Shopping Bag/allBagBtn'), 0)
Mobile.tap(findTestObject('Shopping Bag/clearBagBtn'), 0)
Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)
Mobile.tap(findTestObject('Shopping Bag/yesClearBtn'), 0)
Mobile.verifyElementExist(findTestObject('Shopping Bag/elementYourBag'), 0)
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

