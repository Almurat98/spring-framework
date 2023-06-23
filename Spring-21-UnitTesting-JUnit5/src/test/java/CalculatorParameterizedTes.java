import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

class CalculatorParameterizedTest {
    
    @ParameterizedTest
    @ValueSource(strings = {"abdc1","JS","TSS"})
    void testCase(String args){
        Assertions.assertFalse(args.isEmpty());
    }
    @ParameterizedTest
    @ValueSource(ints = {2,3,1,4})
    void testCase2(int number){
        Assertions.assertEquals(0,number%3);
    }
    @ParameterizedTest
    @ValueSource(strings = {"abdc1","JS","TSS"})
    @EmptySource
    @NullSource
    void testCase3(String args){
        Assertions.assertTrue(!args.isEmpty());
    }

    @ParameterizedTest
    @MethodSource
    void testCase4(String arg){
        Assertions.assertNotNull(arg);
    }

    static String[] stringProvider(){
        return  new String[]{"abdc1","JS","TSS"};
    }

    @ParameterizedTest
    @CsvSource({"10,20,30"})
    void testCase5(int n1,int n2, int result){
        Assertions.assertEquals(result,Calculator.add(n1,n2));
    }
}
