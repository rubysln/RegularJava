import org.junit.Test;

import java.util.Scanner;


public class RegularJava {
    public boolean timeCheck(String line){
        String[] inputArray = line.split("\\s+");
        for(var e: inputArray){
            if(e.matches("\\d+:\\d+")){
                String[] numbers = e.split(":");
                return Integer.parseInt(numbers[0]) < 24 && Integer.parseInt(numbers[1]) < 60;
            }
        }
        return false;
    }
    public boolean macAdressCheck(String line){
        return line.matches("([A-Fa-f0-9]{2}:){5}[A-Fa-f0-9]{2}");
    }
    public boolean emailAdressCheck(String line){
        return line.matches("([A-Za-z0-9]+@[^@].+\\.[a-z])|([A-Za-z0-9]+@[^@].+)");
    }
    public boolean passwordCheck(String line){
        return false;
    }
}
