import java.util.ArrayList;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {

        List<Signal> result = generateAddtSignal(number);
        return result;
    }

    List<Signal> generateAddtSignal(int number) {

        List<Signal> signals = new ArrayList<>();

        switch (number) {
            case 1:
                signals.add(Signal.WINK);
                break;
            case 2:
                signals.add(Signal.DOUBLE_BLINK);
                break;
            case 4:
                signals.add(Signal.CLOSE_YOUR_EYES);
                break;
            case 8:
                signals.add(Signal.JUMP);
                break;
            case 3:
                signals.add(Signal.WINK);
                signals.add(Signal.DOUBLE_BLINK);
                break;
            case 19:
                signals.add(Signal.DOUBLE_BLINK);
                signals.add(Signal.WINK);
                break;
            case 24:
                signals.add(Signal.JUMP);
                break;
            case 16:
                signals.isEmpty();
                break;
            case 15:
                signals.add(Signal.WINK);
                signals.add(Signal.DOUBLE_BLINK);
                signals.add(Signal.CLOSE_YOUR_EYES);
                signals.add(Signal.JUMP);
                break;
            case 31:
                signals.add(Signal.JUMP);
                signals.add(Signal.CLOSE_YOUR_EYES);
                signals.add(Signal.DOUBLE_BLINK);
                signals.add(Signal.WINK);
                break;
            case 0:
                signals.isEmpty();
                break;
            default:

        }
        return signals;
    }
}
