import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.ct.qa.constants.ProjectConstants as ProjectConstants
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

'validate shop category detail screen appearance'
MobileBuiltInKeywords.verifyElementText(findTestObject('ShopOpen/RemainingCategories/Validate_RemainingCategoriesDetailScreen'), 
    'Display Space Available')

'tap on "No Space For Display"'
MobileBuiltInKeywords.tap(findTestObject('ShopOpen/RemainingCategories/NoSpaceForDisplay'), 0)

'validate no space for display detail screen appearance'
MobileBuiltInKeywords.verifyElementText(findTestObject('ShopOpen/RemainingCategories/Validate_ProductCategoryAssetScreen'), 
    'Facing')

'tap on "Facing"'
MobileBuiltInKeywords.tap(findTestObject('ShopOpen/RemainingCategories/Facing'), 0)

'validate facing detail screen appearance'
MobileBuiltInKeywords.verifyElementText(findTestObject('ShopOpen/RemainingCategories/Validate_FacingScreen'), 'Facing')

'visit category products with facing'
CustomKeywords.'com.ct.qa.keywords.ChannelProductsDataKeywords.visitChannelWiseProductsData'(ProjectConstants.CHANNEL_NSFD_OVERWRITEFACING)

'tap on submit button'
MobileBuiltInKeywords.tap(findTestObject('ShopOpen/RemainingCategories/SubmitButton'), 0)

'validate no space for display detail screen appearance'
MobileBuiltInKeywords.verifyElementText(findTestObject('ShopOpen/RemainingCategories/Validate_ProductCategoryAssetScreen'), 
    'Facing')

'tap on "Stock Taking"'
MobileBuiltInKeywords.tap(findTestObject('ShopOpen/RemainingCategories/StockTaking'), 0)

'validate stock taking detail screen appearance'
MobileBuiltInKeywords.verifyElementText(findTestObject('ShopOpen/RemainingCategories/Validate_StockTakingScreen'), 'Stock Taking')

'visit category products with stock taking'
CustomKeywords.'com.ct.qa.keywords.ChannelProductsDataKeywords.visitChannelWiseProductsData'(ProjectConstants.CHANNEL_NSFD_OVERWRITESTOCKTAKING)

'tap on submit button'
MobileBuiltInKeywords.tap(findTestObject('ShopOpen/RemainingCategories/SubmitButton'), 0)

'validate no space for display detail screen appearance'
MobileBuiltInKeywords.verifyElementText(findTestObject('ShopOpen/RemainingCategories/Validate_ProductCategoryAssetScreen'), 
    'Facing')

'tap on "Planogram" imageview'
MobileBuiltInKeywords.tap(findTestObject('ShopOpen/RemainingCategories/planogram_ImageView'), 0)

'find planogram imageview availability'
CustomKeywords.'com.ct.qa.keywords.CommonKeywords.checkPlanogramAvailability'()

'tap on planogram close button'
CustomKeywords.'com.ct.qa.keywords.CommonKeywords.closePlanogram'()

'validate no space for display detail screen appearance'
MobileBuiltInKeywords.verifyElementText(findTestObject('ShopOpen/RemainingCategories/Validate_ProductCategoryAssetScreen'), 
    'Facing')

'find "Picture" imageview and take picture for category'
CustomKeywords.'com.ct.qa.keywords.CommonKeywords.findPictureImageView'()

'validate no space for display detail screen appearance'
MobileBuiltInKeywords.verifyElementText(findTestObject('ShopOpen/RemainingCategories/Validate_ProductCategoryAssetScreen'), 
    'Facing')

'tap on back button'
MobileBuiltInKeywords.tap(findTestObject('ShopOpen/RemainingCategories/ProductCategoryAsset_BackButton'), 0)

'validate shop\'s categories screen appearance'
MobileBuiltInKeywords.verifyElementExist(findTestObject('ShopOpen/Validate_ShopCategoriesListScreen'), 0)

