import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import qa.constants.ProjectConstants
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

'validate "Pop Application" detail screen appearance'
Mobile.verifyElementText(findTestObject('ShopOpen/POPApplication/Validate_POPApplicationDetailScreen' , [('package') : ProjectConstants.PACKAGENAME]), 'KPI :POP Application')

'tap on pop deployment yes radio button'
Mobile.tap(findTestObject('ShopOpen/POPApplication/POPDeployment_yes' , [('package') : ProjectConstants.PACKAGENAME]), 0)

'tap on take picture 1 button'
MobileBuiltInKeywords.tap(findTestObject('ShopOpen/POPApplication/TakePicture1' , [('package') : ProjectConstants.PACKAGENAME]), 0)

'validate camera screen appearance'
MobileBuiltInKeywords.verifyElementExist(findTestObject('CommonScreenElements/Validate_CameraScreen' , [('package') : ProjectConstants.PACKAGENAME]), 0)

'tap on take picture button'
MobileBuiltInKeywords.tap(findTestObject('CommonScreenElements/TakePictureButton' , [('package') : ProjectConstants.PACKAGENAME]), 0)

'delay of 5 seconds while taking picture'
MobileBuiltInKeywords.delay(5)

'tap on done button'
MobileBuiltInKeywords.tap(findTestObject('CommonScreenElements/DoneButton' , [('package') : ProjectConstants.PACKAGENAME]), 0)

'validate "Pop Application" detail screen appearance'
Mobile.verifyElementText(findTestObject('ShopOpen/POPApplication/Validate_POPApplicationDetailScreen' , [('package') : ProjectConstants.PACKAGENAME]), 'KPI :POP Application')

'tap on take picture 2 button'
MobileBuiltInKeywords.tap(findTestObject('ShopOpen/POPApplication/TakePicture2' , [('package') : ProjectConstants.PACKAGENAME]), 0)

'validate camera screen appearance'
MobileBuiltInKeywords.verifyElementExist(findTestObject('CommonScreenElements/Validate_CameraScreen' , [('package') : ProjectConstants.PACKAGENAME]), 0)

'tap on take picture button'
MobileBuiltInKeywords.tap(findTestObject('CommonScreenElements/TakePictureButton' , [('package') : ProjectConstants.PACKAGENAME]), 0)

'delay of 5 seconds while taking picture'
MobileBuiltInKeywords.delay(5)

'tap on done button'
MobileBuiltInKeywords.tap(findTestObject('CommonScreenElements/DoneButton' , [('package') : ProjectConstants.PACKAGENAME]), 0)

'validate "Pop Application" detail screen appearance'
Mobile.verifyElementText(findTestObject('ShopOpen/POPApplication/Validate_POPApplicationDetailScreen' , [('package') : ProjectConstants.PACKAGENAME]), 'KPI :POP Application')

'press device back button'
Mobile.pressBack()

'validate shop\'s categories screen appearance'
MobileBuiltInKeywords.verifyElementExist(findTestObject('ShopOpen/Validate_ShopCategoriesListScreen' , [('package') : ProjectConstants.PACKAGENAME]), 0)

