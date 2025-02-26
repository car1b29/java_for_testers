package ru.stqa.geometry.figures;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {


    @Test
    void canCalculeteArea (){
        var result = Triangle.TriangleArea(7.2, 2.1, 8.1);
        Assertions.assertEquals(7.188741197177705, result);



    }
}
