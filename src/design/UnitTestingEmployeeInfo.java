package design;

import org.testng.Assert;

public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.
        Assert.assertEquals(EmployeeInfo.calculateEmployeeBonus(10000,9),1000.0);
        Assert.assertEquals(EmployeeInfo.calculateEmployeePension(10000),1000);
        //workplace

    }
}
