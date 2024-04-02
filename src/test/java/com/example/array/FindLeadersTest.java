package com.example.array;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;
public class FindLeadersTest {
    @Test
    public void findLeaderTest() {
       int n=6;
        int [] arr={1,2,3,4,6,100};
        List actual=FindLeaders.printLeaders(arr,n);
        String expected= "[100]";
        assertEquals(expected,actual.toString());
    }
}

