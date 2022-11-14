import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.keyword.excel.ExcelKeywords

//WebUI.openBrowser()

//WebUI.navigateToUrl(Url)

//WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), Username)
//WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), findTestData('Login').getValue(1, 1))

//WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_txtPassword'), Password)
//WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_txtPassword'), findTestData('Login').getValue(2, 1))
//WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Password_Submit'))

//WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/b_Dashboard'))

//WebUI.closeBrowser()

String excelLogin = 'C:\\Users\\fathi\\Documents\\BDD Project\\Document\\user.xlsx'

workBookLogin = ExcelKeywords.getWorkbook(excelLogin)

SheetUser = ExcelKeywords.getExcelSheet(workBookLogin, 'user')

NameLogin = ExcelKeywords.getCellValueByAddress (SheetUser, 'A2')

PasswordLogin = ExcelKeywords.getCellValueByAddress (SheetUser, 'B2')

WebUI.openBrowser('https://opensource-demo.orangehrmlive.com/')

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), NameLogin)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_txtPassword'), PasswordLogin)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Password_Submit'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/b_Dashboard'))

WebUI.closeBrowser()


