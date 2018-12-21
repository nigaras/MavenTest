package stepDefinition;
import cucumber.api.java.en.Then;

public class AddNumberStepDef {

    int sum;

    @Then("^User add this two number$")
    public void user_add_this_two_number()
    {
        sum = 10+20;
    }

    @Then("^User add this three number$")
    public void user_add_this_three_number()
    {
        sum =10+20+30;
    }

    @Then("^Print the sum$")
    public void print_the_sum()
    {
        System.out.println("Sum is  :"+sum);
    }

}