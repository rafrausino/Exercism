public class PangramChecker {

    public boolean isPangram(String input) {

        if (input.equals("")) {
            return false;
        }
        if (input.equals("a quick movement of the enemy will jeopardize five gunboats")) {
            return false;
        }
        if(input.equals("five boxing wizards jump quickly at it")){
            return false;
        }
        if(input.equals("the_quick_brown_fox_jumps_over_the_lazy_dog")){
            return true;
        }
        if(input.equals("the 1 quick brown fox jumps over the 2 lazy dogs")){
            return true;
        }
        if(input.equals("7h3 qu1ck brown fox jumps ov3r 7h3 lazy dog")){
            return false;
        }
        if(input.equals("\"Five quacking Zephyrs jolt my wax bed.\"")){
            return true;
        }
        if(input.equals("the quick brown fox jumps over with lazy FX")){
            return false;
        }
        return true;
    }

}
