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

            default:
                throw new IllegalArgumentException("Invalid yacht category.");
        }

    }
}
