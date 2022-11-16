import org.junit.Assert;
import org.junit.Test;



public class Tests {
    RegularJava program = new RegularJava();

    @Test
    public void timeCheckTest(){
        //input
        String firstInput = "Завтрак в 9:00";
        String secondInput = "Обед в 12:00";
        String thirdInput = "Ужин в 18:00";
        String fourthInput = "Завтрак в 8:60";
        String fifthInput = "Обед в 24:00";
        String sixthInput = "Ужин в 24:60";

        //expected
        boolean firstCheck = program.timeCheck(fifthInput);
        boolean secondCheck = program.timeCheck(secondInput);
        boolean thirdCheck = program.timeCheck(thirdInput);
        boolean fourthCheck = program.timeCheck(fourthInput);
        boolean fifthCheck = program.timeCheck(fifthInput);
        boolean sixthCheck = program.timeCheck(sixthInput);

        //actual
        boolean firstActual = true;
        boolean secondActual = true;
        boolean thirdActual = true;
        boolean fourthActual = false;
        boolean fifthActual = false;
        boolean sixthActual = false;

        //test
        Assert.assertEquals(firstCheck, fifthActual);
        Assert.assertEquals(secondCheck, secondActual);
        Assert.assertEquals(thirdCheck, thirdActual);
        Assert.assertEquals(fourthCheck, fourthActual);
        Assert.assertEquals(fifthCheck, fifthActual);
        Assert.assertEquals(sixthCheck, sixthActual);
    }

    @Test
    public void macAdressCheckTest(){
        //input
        String firstInput = "aE:dC:cA:56:76:54";
        String secondInput = "aE:aC:bA:55:77:44";
        String thirdInput = "aE:aC:bA:55:77:48";
        String fourthInput = "01:23:45:67:89:Az";
        String fifthInput = "01:23:45:67:Ag:Az";
        String sixthInput = "01:23:45:FJ:89:Az";

        //expected
        boolean firstCheck = program.macAdressCheck(fifthInput);
        boolean secondCheck = program.macAdressCheck(secondInput);
        boolean thirdCheck = program.macAdressCheck(thirdInput);
        boolean fourthCheck = program.macAdressCheck(fourthInput);
        boolean fifthCheck = program.macAdressCheck(fifthInput);
        boolean sixthCheck = program.macAdressCheck(sixthInput);

        //actual
        boolean firstActual = true;
        boolean secondActual = true;
        boolean thirdActual = true;
        boolean fourthActual = false;
        boolean fifthActual = false;
        boolean sixthActual = false;

        //test
        Assert.assertEquals(firstCheck, fifthActual);
        Assert.assertEquals(secondCheck, secondActual);
        Assert.assertEquals(thirdCheck, thirdActual);
        Assert.assertEquals(fourthCheck, fourthActual);
        Assert.assertEquals(fifthCheck, fifthActual);
        Assert.assertEquals(sixthCheck, sixthActual);
    }

    @Test
    public void emailAdressCheckTest(){
        //input
        String firstInput = "user@example.com";
        String secondInput = "root@localhost";
        String thirdInput = "gabenloh@gmail.com";
        String fourthInput = "bug@@@com.ru";
        String fifthInput = "@val.ru";
        String sixthInput = "Just Text2";

        //expected
        boolean firstCheck = program.emailAdressCheck(fifthInput);
        boolean secondCheck = program.emailAdressCheck(secondInput);
        boolean thirdCheck = program.emailAdressCheck(thirdInput);
        boolean fourthCheck = program.emailAdressCheck(fourthInput);
        boolean fifthCheck = program.emailAdressCheck(fifthInput);
        boolean sixthCheck = program.emailAdressCheck(sixthInput);

        //actual
        boolean firstActual = true;
        boolean secondActual = true;
        boolean thirdActual = true;
        boolean fourthActual = false;
        boolean fifthActual = false;
        boolean sixthActual = false;

        //test
        Assert.assertEquals(firstCheck, fifthActual);
        Assert.assertEquals(secondCheck, secondActual);
        Assert.assertEquals(thirdCheck, thirdActual);
        Assert.assertEquals(fourthCheck, fourthActual);
        Assert.assertEquals(fifthCheck, fifthActual);
        Assert.assertEquals(sixthCheck, sixthActual);
    }

    @Test
    public void passwordCheckTest(){
        //input
        String firstInput = "C00l_Pass";
        String secondInput = "SupperPas1";
        String thirdInput = "Qwerty_1";
        String fourthInput = "Cool_pass";
        String fifthInput = "C00l";
        String sixthInput = "justtest2";

        //expected
        boolean firstCheck = program.passwordCheck(fifthInput);
        boolean secondCheck = program.passwordCheck(secondInput);
        boolean thirdCheck = program.passwordCheck(thirdInput);
        boolean fourthCheck = program.passwordCheck(fourthInput);
        boolean fifthCheck = program.passwordCheck(fifthInput);
        boolean sixthCheck = program.passwordCheck(sixthInput);

        //actual
        boolean firstActual = true;
        boolean secondActual = true;
        boolean thirdActual = true;
        boolean fourthActual = false;
        boolean fifthActual = false;
        boolean sixthActual = false;

        //test
        Assert.assertEquals(firstCheck, fifthActual);
        Assert.assertEquals(secondCheck, secondActual);
        Assert.assertEquals(thirdCheck, thirdActual);
        Assert.assertEquals(fourthCheck, fourthActual);
        Assert.assertEquals(fifthCheck, fifthActual);
        Assert.assertEquals(sixthCheck, sixthActual);
    }
}
