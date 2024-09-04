package hulk.drugs.stepDef;

import cucumber.api.java.en.When;
import hulk.drugs.pageAction.DrugsSearchPageActions;

public class DrugsSearchPageSteps {
	DrugsSearchPageActions DrugsSearchPageActionsobj= new DrugsSearchPageActions();
	
	@When("^enters the drug name$")
	public void enters_the_drug_name() throws Throwable {
		 DrugsSearchPageActionsobj.DrugName();
	}

@When("^enters Adderall in the search box$")
public void enters_Adderall_in_the_search_box() throws Throwable {
    DrugsSearchPageActionsobj.sideEffectsDrug();
}
	@When("^clicks on the search button$")
	public void clicks_on_the_search_button() throws Throwable {
		 DrugsSearchPageActionsobj.ClickSearchBtn();
	}
	@When("^clicks on the search$")
	public void clicks_on_the_search() throws Throwable {
		 DrugsSearchPageActionsobj.SideESearch();
	}
	
	}

