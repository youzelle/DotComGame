import java.util.*;
import java.io.*;

public class DotComBust {

    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> DotComList;
    private int numOfGuesses = 0;

    private void setUpGame() {
        // create three DotCom objects
        // set a name for each
        // add each to DotComList

        DotCom one = new DotCom();
        one.setName("o2.com");

        // for each
        // use helper to generate location cells;
        // set locationCells of each DotCom object;

    }

    public static void main(String[] args) {

    }

}

class GameHelper {
    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.print(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) {
                return null;
            }
        } catch (IOException e) {
            System.out.println(("IOException: " + e));
        }
        return inputLine;
    }
}

class DotCom {
    private String name;
    private ArrayList<String> locationCells;

    public void setName(String n) {
        name = n;
    }

    public void setLocationCells(ArrayList<String> location) {
        locationCells = location;
    }

    public String checkLocationCells(String userInput) {
        String result = "miss";
        // take userInput
        // check locationCells for match
        // if match delete from array
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println("You sunk " + name + "!");
            } else {
                result = "hit";
                System.out.println("You hit " + name + "!");
            }
        }

        return result;

    }

}