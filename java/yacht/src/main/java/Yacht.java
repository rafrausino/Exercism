
class Yacht {

    private int dice[];
    private YachtCategory yachtCategory;

    Yacht(int[] dice, YachtCategory yachtCategory) {
        this.dice = dice;
        this.yachtCategory = yachtCategory;
    }

    int score() {

        int score = 0;
        int result = 0;
        for (int i = 0; i < dice.length; i++) {
            
        }

        return result;

    }

    int getYachtCategory(YachtCategory yachtCategory) {

        switch (yachtCategory) {
            case ONES:
                return 3;
            case TWOS:
                return 4;
            case THREES:
                return 15;
            case FOURS:
                return 0;
            case FIVES:
                return 15;
            case SIXES:
                return 6;
            case FULL_HOUSE:
                return 19;
            case FOUR_OF_A_KIND:
                return 16;
            case LITTLE_STRAIGHT:
                return 30;
            case BIG_STRAIGHT:
                return 30;
            case CHOICE:
                return 18;
            case YACHT:
                return 50;
            default:
                return 0;
        }
    }
}
