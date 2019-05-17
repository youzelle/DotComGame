public class SimpleDotComTestDrive {

    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = { 2, 3, 4 };
        dot.setLocationCells(locations);
        String userGuess = "2";
        dot.checkLocationCells(userGuess);
    }

}

class SimpleDotCom {

    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }

    public String checkLocationCells(String locationGuessStr) {
        int locationGuess = Integer.parseInt(locationGuessStr);
        String result = "miss";

        for (int cell : locationCells) {
            if (locationGuess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        }

        if (numOfHits == locationCells.length) {
            result = "kill";
        }

        System.out.println(result);
        return result;

    }
}