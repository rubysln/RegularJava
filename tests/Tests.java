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
}
