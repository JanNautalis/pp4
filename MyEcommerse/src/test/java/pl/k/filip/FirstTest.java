package pl.k.filip;

import org.junit.jupiter.api.Test;
public class FirstTest {
    @Test
    void testIt() {
        assert  true==true;
    }

    @Test
    void testIt2() {
        String myName = "Filip";
        String output = String.format("Hello "+ myName);

        assert output.equals("Hello Filip");
    }

    @Test
    void baseSchema(){
        //Arrange // Given  //Input
        //Act     // When   //Interaction
        //Assert  // Then   //Output
    }
}
