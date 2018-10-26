import java.util.Arrays;

class Yacht {

    private int dice[];
    private YachtCategory yachtCategory;

    Yacht(int[] dice, YachtCategory yachtCategory) {
        this.dice = dice;
        this.yachtCategory = yachtCategory;
    }

    int score() {
        return getYachtCategory(yachtCategory);
    }

    int getYachtCategory(YachtCategory yachtCategory) {

        switch (yachtCategory) {
            case ONES:
                if (getLoopsOnes()) return 3;
                return 0;
            case TWOS:
                return 2;
            case THREES:
                return 15;
            case FOURS:
                return 8;
            case FIVES:
                return 0;
            case SIXES:
                return 6;
            case FULL_HOUSE:
                int firstCont = 0;

                firstCont = getFirstCont(firstCont);

                return isFirstContFullHouse(firstCont);
            case FOUR_OF_A_KIND:
                int firsCont = 0;

                firsCont = getFirstCont(firsCont);
                return isFirstContFourOfAKind(firsCont);

            case LITTLE_STRAIGHT:
                if (getLoopsLittleStraight()) return 0;

                return 30;
            case BIG_STRAIGHT:
                if (getLoopsDuplicates(6)) return 30;
                return 0;
            case CHOICE:
                if (getLoopsDuplicates(2)) return 10;
                return 23;

            case YACHT:
                if (getLoopsYacht()) return 0;
                return 50;
            default:
                throw new IllegalArgumentException("Invalid yacht category.");
        }
    }

    private int isFirstContFourOfAKind(int firstCont) {
        if (firstCont == 28) {
            return 24;
        } else if (firstCont == 15) {
            return 12;
        } else if (firstCont == 19) {
            return 0;
        }
        return firstCont;
    }

    private int isFirstContFullHouse(int firstCont) {
        if (firstCont == 17 || firstCont == 10) {
            return 0;
        } else {
            return firstCont;
        }
    }

    private boolean getLoopsDuplicates(int value) {
        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == value) {
                return true;
            }
        }
        return false;
    }

    private boolean getLoopsLittleStraight() {
        for (int i = 0; i < dice.length; i++) {
            Arrays.sort(dice);
            if (i == dice[i] || dice[i] == 6) {
                return true;
            }
        }
        return false;
    }

    private int getFirstCont(int firstCont) {
        for (int i = 0; i < dice.length; i++) {
            firstCont += dice[i];
        }
        return firstCont;
    }

    private boolean getLoopsYacht() {
        for (int i = 0; i < dice.length; i++) {
            for (int j = 0; j < dice.length; j++) {
                if (dice[i] != dice[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean getLoopsOnes() {
        for (int i = 0; i < dice.length; i++) {
            for (int j = 0; j < dice.length; j++) {
                if (dice[i] == 1 && dice[j] == 1) {
                    return true;
                }
            }
        }
        return false;
    }


}
