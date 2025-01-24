package reusableComponents;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.util.Strings;

public class CommonMethod {

	// Common method for select drodown option
	public void selectDropdownOption(WebElement element, String valueToBeSelected) {
		Select os = new Select(element);
		try {
			os.selectByVisibleText(valueToBeSelected);
		} catch (Exception e) {
			new Exception("Value is not present in the dropdown for the given element: " + valueToBeSelected);
		}
	}

	// Select Radio button Value (Male/Female)
	public void selectRadioButtonValue(List<WebElement> element, String valueToBeSelected) {
		for (WebElement ref : element) {
			if (ref.getText().equalsIgnoreCase(valueToBeSelected)) {
				ref.click();
				break;
			}
		}
	}

	// Select Check boxes
	public void selectCheckboxes(List<WebElement> element, String checks) {
		String[] checksArray = checks.split(",");
		for (String str : checksArray) { //speeding,others
			for (WebElement ele : element) {
				if (ele.getText().equalsIgnoreCase(str)) {
					ele.click();
					break;
				}
			}
		}
	}

	// get dropdown option as List to compare
	public List<String> getDropdownOptionCommon(WebElement element) {
		Select os = new Select(element);

		List<WebElement> list_Webelement_model = os.getOptions();
		List<String> actualContents = new ArrayList<String>();
		for (WebElement ref : list_Webelement_model) {
			actualContents.add(ref.getText());
		}
		return actualContents;
	}

}
