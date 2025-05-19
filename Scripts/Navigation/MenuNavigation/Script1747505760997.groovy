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

Mobile.startApplication('C:\\Users\\asus\\Desktop\\Course QA\\Katalon\\happyDayShopping\\APK\\HappyDayShopping.apk', false)
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

List<Map> menuItems = [
    [menuBtn: 'Navigation/MenuNavigation/promotionsBtn', scrollText: 'PROMO - Vitress Hair Refresher x2'],
    [menuBtn: 'Navigation/MenuNavigation/newproductBtn', scrollText: 'Wasabi Crispy Sea Snack with Wasabi'],
    [menuBtn: 'Navigation/MenuNavigation/foodBtn',
        submenuItems: [
			[subMenu: 'Navigation/MenuNavigation/FOOD/snacksBtn',
				subSubMenuItems: [
					[subSubMenu: 'Navigation/MenuNavigation/FOOD/Snacks/chipsBtn', scrollText: 'Vcut Potato Chips Spicy Barbecue Flavor 60g'],
					[subSubMenu: 'Navigation/MenuNavigation/FOOD/Snacks/coockiescrackersBtn', scrollText: 'Tiffany Break Wafer'],
					[subSubMenu: 'Navigation/MenuNavigation/FOOD/Snacks/snackcakesBtn', scrollText: 'Mochi Green Tea Flavored Glutinous Rice Cake 24g'],
					[subSubMenu: 'Navigation/MenuNavigation/FOOD/Snacks/nutsdriedfruitBtn', scrollText: 'WL Muncher Green Peas Original Flavor 70g'],
					[subSubMenu: 'Navigation/MenuNavigation/FOOD/Snacks/sweetsBtn', scrollText: 'Yonkers Peanut Power']
				],
			],
			[subMenu: 'Navigation/MenuNavigation/FOOD/drinksBtn',
				subSubMenuItems: [
					[subSubMenu: 'Navigation/MenuNavigation/FOOD/Drinks/slimmingdrinksBtn', scrollText: 'Tokyo Vanilla Coffee 21 Grams x 10 Sachets'],
					[subSubMenu: 'Navigation/MenuNavigation/FOOD/Drinks/fruitjuiceBtn', scrollText: 'Topfruit Red Mix Fruit Drink'],
					[subSubMenu: 'Navigation/MenuNavigation/FOOD/Drinks/coffeeteaBtn', scrollText: 'Tokyo Vanilla Coffee 21 Grams x 10 Sachets'],
					[subSubMenu: 'Navigation/MenuNavigation/FOOD/Drinks/softdrinksBtn', scrollText: 'Thumbs Up 330ml'],
					[subSubMenu: 'Navigation/MenuNavigation/FOOD/Drinks/dairyBtn', scrollText: 'Teptip Melon Milk Drink Original 290ml'],
					[subSubMenu: 'Navigation/MenuNavigation/FOOD/Drinks/waterBtn', scrollText: 'Schweppes Tonic Water Zero Sugar 250ml'],
					[subSubMenu: 'Navigation/MenuNavigation/FOOD/Drinks/sportenergydrinksBtn', scrollText: 'Sting Power Drink 250ml']
				],
			],
            [subMenu: 'Navigation/MenuNavigation/FOOD/frozenBtn', scrollText: 'Thermal Bag'],
			[subMenu: 'Navigation/MenuNavigation/FOOD/herbsspicesseasoningBtn', scrollText: 'UFC Ready Recipes Menudo Sauce 200g'],
			[subMenu: 'Navigation/MenuNavigation/FOOD/instantnoodlesBtn', scrollText: 'Samyang Hot Chicken Flavor Ramen Buldak'],
			[subMenu: 'Navigation/MenuNavigation/FOOD/breadbakeryBtn', scrollText: 'Tres Marias Sputnik Bread'],
			[subMenu: 'Navigation/MenuNavigation/FOOD/condimentsBtn', scrollText: 'UFC Banana Sauce Tamis(hot & spicy) Anghang 560g'],
			[subMenu: 'Navigation/MenuNavigation/FOOD/bakingflourBtn', scrollText: 'White King Puto Pinoy Favorites 400g'],
			[subMenu: 'Navigation/MenuNavigation/FOOD/spreadsjamsBtn', scrollText: 'Star Margarine Classic 100g'],
            [subMenu: 'Navigation/MenuNavigation/FOOD/bagoongBtn', scrollText: 'Siblings Tiny Crab Paste (taba ng talangka) 227g']
        ]
    ],
	[menuBtn: 'Navigation/MenuNavigation/beautyBtn',
		submenuItems: [
			[subMenu: 'Navigation/MenuNavigation/BEAUTY/beautysetsBtn', scrollText: 'Yasuy Beauty Set'],
			[subMenu: 'Navigation/MenuNavigation/BEAUTY/lotionfacecreamBtn', scrollText: 'Wrinkle Care Face Cream 50g (Made in Vietnam)'],
			[subMenu: 'Navigation/MenuNavigation/BEAUTY/tonerBtn', scrollText: 'Vibrant Glamour Retinol Essence Toner 100ml'],
			[subMenu: 'Navigation/MenuNavigation/BEAUTY/bathbodysoapBtn', scrollText: 'You Glow Beauty White Soap 5 pcs x 70g'],
			[subMenu: 'Navigation/MenuNavigation/BEAUTY/deodorantsBtn', scrollText: 'Vitamin E Whitening Moisturizing Roll On'],
			[subMenu: 'Navigation/MenuNavigation/BEAUTY/serumwhiteningproductsBtn', scrollText: 'Vitamin E Gold Serum Vitamin C HYA  10ml'],
			[subMenu: 'Navigation/MenuNavigation/BEAUTY/hairshampooBtn', scrollText: 'Sunsilk Shampoo Pack (Strong and Long) (1pc)'],
			[subMenu: 'Navigation/MenuNavigation/BEAUTY/hairconditionerBtn', scrollText: 'Pantene Pro-V Collagen Miracle Intensive Serum Conditioner'],
			[subMenu: 'Navigation/MenuNavigation/BEAUTY/hairgelmaskBtn', scrollText: 'Vatika Styling Gel (Wet Look 3) 250ml'],
			[subMenu: 'Navigation/MenuNavigation/BEAUTY/haircolorhennaBtn', scrollText: 'Merry Sun Super Decoloring']
		]
	],
	[menuBtn: 'Navigation/MenuNavigation/healthnutritionBtn',
		submenuItems: [
			[subMenu: 'Navigation/MenuNavigation/HEALTH n NUTRITION/vitaminssupplementsBtn', scrollText: 'Vita Bears Detox Vitamins 60pc'],
			[subMenu: 'Navigation/MenuNavigation/HEALTH n NUTRITION/medicationsBtn', scrollText: 'Tuseran (we sell per capsule only)'],
			[subMenu: 'Navigation/MenuNavigation/HEALTH n NUTRITION/oilmassageBtn', scrollText: 'Wells Castor Oil 70ml'],
			[subMenu: 'Navigation/MenuNavigation/HEALTH n NUTRITION/firstaidalcoholbtn', scrollText: 'Santavik Band Aid'],
			[subMenu: 'Navigation/MenuNavigation/HEALTH n NUTRITION/beautypillsBtn', scrollText: 'YOU Glow Babe Beauty White 30 Capsules 4 in 1']
		]
	],
	[menuBtn: 'Navigation/MenuNavigation/clothingaccesoriesBtn',
		submenuItems: [
			[subMenu: 'Navigation/MenuNavigation/CLOTHING n ACCESORIES/bagsBtn', scrollText: 'Native Bag - 5'],
			[subMenu: 'Navigation/MenuNavigation/CLOTHING n ACCESORIES/underwearBtn', scrollText: 'SOEN Panty - Design 5 BBC642'],
			[subMenu: 'Navigation/MenuNavigation/CLOTHING n ACCESORIES/capsBtn', scrollText: 'Cap - Underarmor Teal Blue'],
			[subMenu: 'Navigation/MenuNavigation/CLOTHING n ACCESORIES/slippersBtn', scrollText: 'Slippers - Sweet Red'],
			[subMenu: 'Navigation/MenuNavigation/CLOTHING n ACCESORIES/clothsBtn', scrollText: 'Umbrella (for Car)'],
			[subMenu: 'Navigation/MenuNavigation/CLOTHING n ACCESORIES/braceletsBtn', scrollText: 'Bracelet Turtle Design'],
			[subMenu: 'Navigation/MenuNavigation/CLOTHING n ACCESORIES/ringsBtn', scrollText: 'Ring - Ethnic Style Yellow'],
			[subMenu: 'Navigation/MenuNavigation/CLOTHING n ACCESORIES/sunglassesBtn', scrollText: 'Sunglasses 9'],
			[subMenu: 'Navigation/MenuNavigation/CLOTHING n ACCESORIES/earringsBtn', scrollText: 'Earrings - Vintage Simple Faux']
		]
	],
	[menuBtn: 'Navigation/MenuNavigation/electronicsBtn',
		submenuItems: [
			[subMenu: 'Navigation/MenuNavigation/ELECTRONICS/earphonesheadphonesBtn', scrollText: 'Powero Stripes Wireless Earbuds'],
			[subMenu: 'Navigation/MenuNavigation/ELECTRONICS/houseapplianceBtn', scrollText: 'Sonashi Waffle Maker 2 Year Warranty'],
			[subMenu: 'Navigation/MenuNavigation/ELECTRONICS/watchBtn', scrollText: 'Swiss Military Watch for Men (Grey & White) with free'],
			[subMenu: 'Navigation/MenuNavigation/ELECTRONICS/cellphonerelatedBtn', scrollText: 'Y33S VIVO'],
			[subMenu: 'Navigation/MenuNavigation/ELECTRONICS/smallapplicancesBtn', scrollText: 'Regrsi Car USB 2 USB Port'],
			[subMenu: 'Navigation/MenuNavigation/ELECTRONICS/hairelectronicsBtn', scrollText: 'Sonashi Hair Straightener SHS 2081'],
			[subMenu: 'Navigation/MenuNavigation/ELECTRONICS/speakerskaraokeBtn', scrollText: 'Sonashi 1.2CH Speaker (USB CARD SLOT and FM RADIO)'],
			[subMenu: 'Navigation/MenuNavigation/ELECTRONICS/chargercableBtn', scrollText: 'X-Scoot Charging Cable 1200mm (Iphone Cable)']
		]
	],
	[menuBtn: 'Navigation/MenuNavigation/householdBtn',
		submenuItems: [
			[subMenu: 'Navigation/MenuNavigation/HOUSEHOLD/laundryBtn', scrollText: 'Venus Fast Dyes - Jobus - Yellow'],
			[subMenu: 'Navigation/MenuNavigation/HOUSEHOLD/cleaningproductsBtn', scrollText: 'Reflect Handwash Sea Breeze 330ml'],
			[subMenu: 'Navigation/MenuNavigation/HOUSEHOLD/cleaningtoolsBtn', scrollText: 'Walis Tingting'],
			[subMenu: 'Navigation/MenuNavigation/HOUSEHOLD/paperplasticproductsBtn', scrollText: 'Plates - Hard Plastic'],
			[subMenu: 'Navigation/MenuNavigation/HOUSEHOLD/airfreshenersincenseBtn', scrollText: 'Raysut Bokhur'],
			[subMenu: 'Navigation/MenuNavigation/HOUSEHOLD/foodstorageBtn', scrollText: 'Smiley Aluminum Wide 30cm'],
			[subMenu: 'Navigation/MenuNavigation/HOUSEHOLD/insecticidespestcontrolBtn', scrollText: 'Tox Kills Flying and Crawling Insects 300ml'],
			[subMenu: 'Navigation/MenuNavigation/HOUSEHOLD/householdessentialsBtn', scrollText: 'White Thread'],
			[subMenu: 'Navigation/MenuNavigation/HOUSEHOLD/grillingessentialsBtn', scrollText: 'The Flower Basket Safety Matches']
		]
	],
    [menuBtn: 'Navigation/MenuNavigation/rechargecardsBtn', scrollText: 'Renna Recharge 7 Rials'],
    [menuBtn: 'Navigation/MenuNavigation/childrenproductsBtn', scrollText: 'Toy Spiderman'],
    [menuBtn: 'Navigation/MenuNavigation/buy2savemoreBtn', scrollText: 'Promo -Icare Brazlian x2'],
	[menuBtn: 'Navigation/MenuNavigation/celebrationsBtn',
		submenuItems: [
			[subMenu: 'Navigation/MenuNavigation/CELEBRATIONS/birthdaycakesBtn', scrollText: 'Numnums Bento Vanilla Caramel'],
			[subMenu: 'Navigation/MenuNavigation/CELEBRATIONS/celebrationgiftsBtn', scrollText: 'Sunflower Flower Set 2'],
			[subMenu: 'Navigation/MenuNavigation/CELEBRATIONS/partyfoodBtn', scrollText: 'Party Set - Sisig']
		]
	],
    [menuBtn: 'Navigation/MenuNavigation/cargoessentialsBtn', scrollText: 'ZA1 - Luggage Set - 9']
]

for (def item : menuItems) {
	Mobile.tap(findTestObject('Navigation/tabMenuBtn'), 0)
	Mobile.tap(findTestObject(item.menuBtn), 0)
	Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
	if (item.containsKey('submenuItems')) {
		for (def subItem : item.submenuItems) {
			Mobile.tap(findTestObject(subItem.subMenu), 0)
			Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
			if (subItem.containsKey('subSubMenuItems')) {
				for (def subSubItem : subItem.subSubMenuItems) {
					Mobile.tap(findTestObject(subSubItem.subSubMenu), 0)
					Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
					Mobile.scrollToText(subSubItem.scrollText, FailureHandling.STOP_ON_FAILURE)
					Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)
					Mobile.tap(findTestObject('Navigation/tabMenuBtn'), 0)
				}
				Mobile.tap(findTestObject('Navigation/MenuNavigation/backBtn'), 0)
			} else {
				Mobile.scrollToText(subItem.scrollText, FailureHandling.STOP_ON_FAILURE)
				Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
				Mobile.tap(findTestObject('Navigation/tabMenuBtn'), 0)
			}
		}
		Mobile.tap(findTestObject('Navigation/MenuNavigation/backBtn'), 0)
	} else {
		Mobile.scrollToText(item.scrollText, FailureHandling.STOP_ON_FAILURE)
		Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)
	}
}

Mobile.closeApplication()

