package com.shape;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;

@DisplayName("ShapeCollector Test")
public class ShapeCollectorTest {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Beginning of tests");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Tests are done");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Starting test...");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Tests are Done");

    }

    @Nested
    @DisplayName("Test for adding and removing figures")
    class AddAndRemove {
        @Test
        public void testAddFigure() {
            //Given

            ShapeCollector testList = new ShapeCollector(new ArrayList(Arrays.asList(
                    new Square(10),
                    new Triangle(15, 20))));
            ShapeCollector expectedList = new ShapeCollector(new ArrayList(Arrays.asList(
                    new Circle(26),
                    new Triangle(15, 20),
                    new Square(10))));
            int expectedListSize = expectedList.getShapeList().size();
            //When
            testList.addFigure(new Circle(26));
            int actualListSize = testList.getShapeList().size();

            //Then
            Assertions.assertEquals(expectedListSize, actualListSize);
        }

        @Test
        public void testRemoveFigure() {
            //Given

           Circle circle = new Circle(26);
           Square square = new Square(10);
           Triangle triangle = new Triangle(15, 20);

           ShapeCollector testList = new ShapeCollector(new ArrayList(Arrays.asList(circle, square, triangle)));
            ShapeCollector expectedList = new ShapeCollector(new ArrayList(Arrays.asList( square, triangle)));


            int expectedListSize = expectedList.getShapeList().size();
            //When
            testList.removeFigure(circle);
            int actualListSize = testList.getShapeList().size();

            //Then
            Assertions.assertEquals(expectedListSize, actualListSize);

        }
    }

    @Nested
    @DisplayName("Test for getting and showing figures")
    class GetAndShow {
        @Test
        public void testGetFigure() {
            //Given

            Circle circle = new Circle(26);
            Triangle triangle = new Triangle(15, 20);
            Square square = new Square(10);
            ShapeCollector testList = new ShapeCollector(new ArrayList(Arrays.asList(circle, triangle, square)));
            //When
            testList.addFigure(circle);
            testList.addFigure(square);
            testList.addFigure(triangle);
            Shape shape0 = testList.getFigure(0);
            Shape shape1 = testList.getFigure(1);
            Shape shape2 = testList.getFigure(2);

            Assertions.assertEquals(circle, shape0);
            Assertions.assertEquals(triangle, shape1);
            Assertions.assertEquals(square, shape2);


        }
        @Test
        public void testShowFigure() {
            //Given

            Circle circle = new Circle(26);
            Square square = new Square(10);
            Triangle triangle = new Triangle(15, 20);

            ArrayList<Shape> testList = new ArrayList(Arrays.asList(circle, square, triangle));
            ShapeCollector shapeCollector = new ShapeCollector(testList);

             //Then
            Assertions.assertEquals(testList, shapeCollector.showFigures());
        }
    }
}




