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

'validate chiller types listview appearance'
MobileBuiltInKeywords.verifyElementText(findTestObject('ShopOpen/ChillerUtilization/ChillerTypeNotAvailable/Validate_SelectAppropriateTypeScreen'), 
    'Select appropriate type')

'select different chiller type'
CustomKeywords.'com.ct.qa.keywords.ChillerVisitingScenariosKeywords.selectDifferentChillerType'()

'validate camera screen appearance'
Mobile.verifyElementExist(findTestObject('CommonScreenElements/Validate_CameraScreen'), 0)

'tap on take picture button'
MobileBuiltInKeywords.tap(findTestObject('CommonScreenElements/TakePictureButton'), 0)

'delay of 5 seconds while taking picture'
MobileBuiltInKeywords.delay(5)

'tap on done button'
MobileBuiltInKeywords.tap(findTestObject('CommonScreenElements/DoneButton'), 0)

'Visit "Chiller Available" flow for "Chiller Type Not Available"'
WebUI.callTestCase(findTestCase('ShopOpen/ChillerUtilization/ChillerAvailable/VisitChillerAvailable'), [:], FailureHandling.STOP_ON_FAILURE)

