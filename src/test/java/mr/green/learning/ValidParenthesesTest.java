package mr.green.learning;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class ValidParenthesesTest {

    private final ValidParentheses tested = new ValidParentheses();

    @Test
    void emptyStringValid() {
        boolean actual = tested.isValid("");

        assertThat(actual).isTrue();
    }

    @ParameterizedTest
    @ValueSource(strings = { "{}", "()", "[]", "({}[])" })
    void openAndClosedParenthesesValid(String source) {
        boolean actual = tested.isValid(source);

        assertThat(actual).isTrue();
    }

    @ParameterizedTest
    @ValueSource(strings = { "{", "[(]", "{[{{)}}]}" })
    void notClosedParenthesesNotValid(String source) {
        boolean actual = tested.isValid(source);

        assertThat(actual).isFalse();
    }
}
