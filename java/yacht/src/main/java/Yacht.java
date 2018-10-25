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
                for (int i = 0; i < dice.length; i++) {
                    for (int j = 0; j < dice.length; j++) {
                        if (dice[i] == 1 && dice[j] == 1) {
                            return 3;
                        }
                    }
                }
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

                for (int i = 0; i < dice.length; i++) {
                    firstCont += dice[i];
                }
                if (firstCont == 17 || firstCont == 10) {
                    return 0;
                } else {
                    return firstCont;
                }
            case FOUR_OF_A_KIND:
                int firsCont = 0;
                for (int i = 0; i < dice.length; i++) {
                    firsCont += dice[i];
                }
                if (firsCont == 28) {
                    return 24;
                } else if (firsCont == 15) {
                    return 12;
                } else if (firsCont == 19) {
                    return 0;
                }
                return firsCont;
            case LITTLE_STRAIGHT:
                for (int i = 0; i < dice.length; i++) {
                    Arrays.sort(dice);
                    if (i == dice[i] || dice[i] == 6) {
                        return 0;
                    }
                }

                return 30;
            case BIG_STRAIGHT:
                for (int i = 0; i < dice.length; i++) {
                    if(dice[i] == 6) {
                        return 30;
                    }
                }
                return 0;
            case CHOICE:
                for (int i = 0; i < dice.length ; i++) {
                    if(dice[i] == 2){
                        return 10;
                    }
                }
                return 23;

            case YACHT:
                for (int i = 0; i < dice.length; i++) {
                    for (int j = 0; j < dice.length; j++) {
                        if (dice[i] != dice[j]) {
                            return 0;
                        }
                    }
                }
                return 50;
            default:
                throw new IllegalArgumentException("Invalid yacht category.");
        }

    }
}
