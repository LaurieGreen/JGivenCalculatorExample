import org.junit.jupiter.api.Test;

import com.tngtech.jgiven.junit5.ScenarioTest;

public class CalculatorJGivenTest extends
		ScenarioTest<GivenCalculatorObjectInitalised, WhenIUseTheCalculatorMethods, ThenICanAssertCalculatedValues> {

	@Test
	public void testCalculatorAddition() {
		given().getIntialisedCalculatorObject();
		when().additionIsTestedUsing( 2,2 );
		then().assertCalculatorResultIsCorrect( 4 );
	}
}
