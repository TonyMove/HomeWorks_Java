package test.com;

import com.company.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private final Main main = new Main();

    @ParameterizedTest
    @MethodSource("dataForSuccessGettingValuesAfterLastFour")
    void getValuesAfterLastFour(int[] originalArray, int[] expectedResultArray) {
        int[] aclualResultArray = main.getValuesAfterLastFour(originalArray);

        Assertions.assertArrayEquals(expectedResultArray, aclualResultArray);
    }

    private static Stream<Arguments> dataForSuccessGettingValuesAfterLastFour() {
        List<Arguments> arguments = new ArrayList<>();
        arguments.add(Arguments.arguments(new int[]{1, 2, 3, 4, 5}, new int[]{5}));
        arguments.add(Arguments.arguments(new int[]{1, 2, 3, 4}, new int[]{}));
        arguments.add(Arguments.arguments(new int[]{4, 1, 2, 4, 3, 4, 5}, new int[]{5}));
        arguments.add(Arguments.arguments(new int[]{4, 1, 2, 3, 5}, new int[]{1, 2, 3, 5}));

        return arguments.stream();
    }

    @Test
    void getValuesAfterLastFourFullArrayWaitException() {
        int[] originalArray = {1, 2, 3};
        Assertions.assertThrows(RuntimeException.class, () -> main.getValuesAfterLastFour(originalArray));
    }
    @Test
    void getValuesAfterLastFourEmptyArrayWaitException() {
        int[] empty = {};
        Assertions.assertThrows(RuntimeException.class, () -> main.getValuesAfterLastFour(empty));
    }

    @ParameterizedTest
    @MethodSource("dataForFindFourOrOneNumberInArray")
    void findFourOrOneNumberInArray(int[] array, boolean expectedResult) {
        boolean actualResult = main.findOneorFourNumberInArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> dataForFindFourOrOneNumberInArray() {
        List<Arguments> arguments = new ArrayList<>();
        arguments.add(Arguments.arguments(new int[]{1, 1, 1, 4, 4, 1, 4, 4}, true));
        arguments.add(Arguments.arguments(new int[]{1, 1, 1, 1, 1, 1}, false));
        arguments.add(Arguments.arguments(new int[]{4, 4, 4, 4}, false));
        arguments.add(Arguments.arguments(new int[]{1, 4, 4, 1, 1, 4, 3}, false));

        return arguments.stream();
    }

}