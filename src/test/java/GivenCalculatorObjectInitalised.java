import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import com.tngtech.jgiven.annotation.ScenarioState;

public class GivenCalculatorObjectInitalised extends Stage<GivenCalculatorObjectInitalised> {

	// all do the same thing but Provided and Expected just give a bit more context,
//	@ScenarioState
//	@ProvidedScenarioState
//	@ExpectedScenarioState

	@ProvidedScenarioState
	Calculator calculator;

	public GivenCalculatorObjectInitalised getIntialisedCalculatorObject(){
		calculator = new Calculator();
		return this;
	}


}
