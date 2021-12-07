package hw4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TriangleTest {

    @Test
     void egyptTriangleTest() {
         Triangle triangle = new Triangle(3, 4, 5);
        int actualResult = triangle.calculateArea();
        assertEquals(6,actualResult);

    }
}
