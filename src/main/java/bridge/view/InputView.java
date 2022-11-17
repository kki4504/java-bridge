package bridge.view;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */

/**
 * 제공된 InputView 클래스를 활용해 구현해야 한다.
 * InputView의 패키지는 변경할 수 있다.
 * InputView의 메서드의 시그니처(인자, 이름)와 반환 타입은 변경할 수 있다.
 * 사용자 값 입력을 위해 필요한 메서드를 추가할 수 있다.
 */
public class InputView {
    private static final String ERROR_INPUT_LENGTH_ZERO = "[ERROR] 아무것도 입력하지 않았습니다.";
    private static final String ERROR_NOT_INTEGER = "[ERROR] 숫자를 입력해야 합니다.";
    private static final int EMPTY_LENGTH_VALUE = 0;

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize(String readLine) {
        return validateStringToInt(validateNotEmpty(readLine));
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        return null;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        return null;
    }

    private String validateNotEmpty(String readLine) {
        if (readLine.length() > EMPTY_LENGTH_VALUE) {
            return readLine;
        }
        throw new IllegalArgumentException(ERROR_INPUT_LENGTH_ZERO);
    }

    private int validateStringToInt(String readLine) {
        try {
            return Integer.parseInt(validateNotEmpty(readLine));
        } catch (NumberFormatException numberFormatException) {
            throw new IllegalArgumentException(ERROR_NOT_INTEGER);
        }
    }
}
