package StepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class dataTableDemo {

    @When("i type the following names")
    public void i_type_the_following_names(DataTable dataTable) {
        List<List<String>> rows= dataTable.asLists(String.class);
        for (List<String> column : rows){
            System.out.println(column.get(0)+"  "+ column.get(1));
        }
      }

    @And("i click on ok button")
    public void i_click_on_ok_button() {
        System.out.println("clicked Ok");
    }

    @Then("i should see some java")
    public void i_should_see_some_java() {
        System.out.println("java");
    }
}
