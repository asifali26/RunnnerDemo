package Asif_Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="MyDemo_DDC2_Features",glue="DDC2_My_Step_Definitions",tags= {"@Sanity"},
plugin={"html:target/cucumber-htmlreport.html"})
public class My_Runner_class {

	
}
