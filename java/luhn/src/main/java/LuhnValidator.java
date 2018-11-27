import java.util.*;

class LuhnValidator {


    boolean isValid(String candidate) {

        String candidateWithoutSpaces = removeSpaces(candidate);
        if (candidateWithoutSpaces.equals("0")) return false;
        if (candidateWithoutSpaces.contains("-")) return false;
        String candidateWithoutChars = removeCharacters(candidateWithoutSpaces);
        if (candidateWithoutChars.equals("")) return false;
        String[] candidateSplitted = createArrayIfString(candidateWithoutChars);
        List<Integer> candidateDoubled = doubleEverySecondDigitFromRightToLeft(candidateSplitted);
        Integer candidateSummed = sumAllList(candidateDoubled);
        if (!isEvenlyDivisibleBy10(candidateSummed)) return false;


        return isShowAllExecute(candidate);

    }

    public boolean isShowAllExecute(String candidate) {

        boolean isCardValid = false;

        String valueZero = "0";
        if (candidate.contains(valueZero)) {
            isCardValid = false;
        }
        int size = 11;
        if (candidate.length() <= size) {
            isCardValid = true;
        }
        int minimumOnce = 1;
        if (candidate.length() <= minimumOnce) {
            isCardValid = false;
        }

        return isCardValid;
    }

    public String removeSpaces(String candidate) {
        return candidate.replace(" ", "");
    }

    public String[] createArrayIfString(String candidateWithoutSpaces) {
        return candidateWithoutSpaces.split("");
    }

    public String[] revertArrayOfStrings(String[] arrayNotReverted) {
        String[] arrayReverted = new String[arrayNotReverted.length];
        int countIncreasing = 0;
        for (int i = arrayNotReverted.length - 1; i >= 0; i--) {
            arrayReverted[countIncreasing] = arrayNotReverted[i];
            countIncreasing++;
        }
        return arrayReverted;
    }

    public List<Integer> revertListOfInteger(List<Integer> listNotReverted) {
        List<Integer> listReverted = new ArrayList<>();
        for (int i = listNotReverted.size() - 1; i >= 0; i--) {
            listReverted.add(listNotReverted.get(i));
        }
        return listReverted;
    }

    public List<Integer> doubleEverySecondDigitFromRightToLeft(String[] candidateSplitted) {
        List<Integer> candidateDoubled = new ArrayList<>();
        String[] candidateReverted = revertArrayOfStrings(candidateSplitted);

        for (int i = 0; i < candidateReverted.length; i++) {

            Integer candidate = Integer.parseInt(candidateReverted[i]);

            if (isOdd(i)) {
                candidate = candidate + candidate;
            }

            if (candidate > 9) {
                candidate = candidate - 9;
            }

            candidateDoubled.add(candidate);
        }

        return revertListOfInteger(candidateDoubled);
    }

    public Integer sumAllList(List<Integer> candidateDoubled) {
        Integer sum = 0;
        for (int i = 0; i < candidateDoubled.size(); i++) {
            sum += candidateDoubled.get(i);
        }
        return sum;
    }

    public boolean isOdd(int number) {
        return number % 2 > 0;
    }

    public boolean isEvenlyDivisibleBy10(Integer candidate) {
        return candidate % 10 == 0;
    }


    public String removeCharacters(String removeCharactersCandidate) {
        String pattern = "\\D";
        return removeCharactersCandidate.replaceAll(pattern, "");

    }
}
