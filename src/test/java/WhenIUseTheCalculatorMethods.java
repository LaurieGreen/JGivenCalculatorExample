import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;

public class WhenIUseTheCalculatorMethods extends Stage<GivenCalculatorObjectInitalised> {


	@ExpectedScenarioState
	Calculator calculator;

	@ProvidedScenarioState
	int calculatorResult;

	public WhenIUseTheCalculatorMethods additionIsTestedUsing(int a, int b){
		calculatorResult = calculator.addition( a, b );
		return this;
	}

	public WhenIUseTheCalculatorMethods subtractionIsTestedUsing(int a, int b){
		calculatorResult = calculator.subtraction( a, b );
		return this;
	}
}
