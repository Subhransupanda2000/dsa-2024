package com.example.array;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
public class RotateMatrixTest {

    @Test
    public void testRotateSquareMatrix() {
        int[][] originalMatrix = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        int[][] expectedRotatedMatrix = {{13, 9, 5, 1},
                {14, 10, 6, 2},
                {15, 11, 7, 3},
                {16, 12, 8, 4}};

        RotateMatrix.rotateMatrixClockwise(originalMatrix);

        assertArrayEquals(expectedRotatedMatrix, originalMatrix);
    }
}