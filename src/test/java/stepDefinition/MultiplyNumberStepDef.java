package stepDefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultiplyNumberStepDef
{
    int multiply;
    @When("^User enter the first number$")
    public void user_enter_the_first_number()
    {
        System.out.println("Enter first number :"+10);
    }

    @When("^User enter the second number$")
    public void user_enter_the_second_number()
    {
        System.out.println("Enter second number :"+20);
    }

    @When("^User enter the third number$")
    public void user_enter_the_third_number()
    {
        System.out.println("Enter third number :"+30);
    }

    @Then("^User multiply this two number$")
    public void user_multiply_this_two_number()
    {
        multiply = 10*20;
    }

    @Then("^User multiply this three number$")

    public void user_multiply_this_three_number()
    {
        multiply =10*20*30;
    }
    @Then("^Print the multiplication$")
    public void print_the_mulitply()
    {
        System.out.println("Multiplication is  :"+multiply);
    }

}