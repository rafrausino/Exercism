import org.junit.Test;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class TriangleTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test(expected = TriangleException.class)
    public void equilateralTrianglesHaveEqualSides() throws TriangleException {
        Triangle triangle = new Triangle(2, 2, 2);

        assertTrue(triangle.isEquilateral());
    }

    @Test(expected = TriangleException.class)
    public void trianglesWithOneUnequalSideAreNotEquilateral() throws TriangleException {
        Triangle triangle = new Triangle(2, 3, 2);

        assertFalse(triangle.isEquilateral());
    }

    @Test(expected = TriangleException.class)
    public void trianglesWithNoEqualSidesAreNotEquilateral() throws TriangleException {
        Triangle triangle = new Triangle(5, 4, 6);

        assertFalse(triangle.isEquilateral());
    }

    @Test(expected = TriangleException.class)
    public void trianglesWithNoSizeAreIllegal() throws TriangleException {
        new Triangle(0, 0, 0);
    }

    @Test(expected = TriangleException.class)
    public void verySmallTrianglesCanBeEquilateral() throws TriangleException {
        Triangle triangle = new Triangle(0.5, 0.5, 0.5);

        assertTrue(triangle.isEquilateral());
    }

    @Test(expected = TriangleException.class)
    public void isoscelesTrianglesHaveLastTwoSidesEqual() throws TriangleException {
        Triangle triangle = new Triangle(3, 4, 4);

        assertTrue(triangle.isIsosceles());
    }

    @Test(expected = TriangleException.class)
    public void isoscelesTrianglesHaveTwoFirstSidesEqual() throws TriangleException {
        Triangle triangle = new Triangle(4, 4, 3);

        assertTrue(triangle.isIsosceles());
    }

    @Test(expected = TriangleException.class)
    public void isoscelesTrianglesHaveFirstAndLastSidesEqual() throws TriangleException {
        Triangle triangle = new Triangle(4, 3, 4);

        assertTrue(triangle.isIsosceles());
    }

    @Test(expected = TriangleException.class)
    public void isoscelesTrianglesCanHaveAllSidesEqual() throws TriangleException {
        Triangle triangle = new Triangle(4, 4, 4);

        assertTrue(triangle.isIsosceles());
    }

    @Test(expected = TriangleException.class)
    public void isoscelesTrianglesMustHaveAtLeastTwoEqualSides() throws TriangleException {
        Triangle triangle = new Triangle(2, 3, 4);

        assertFalse(triangle.isIsosceles());
    }

    @Test(expected = TriangleException.class)
    public void testSidesThatViolateTriangleInequalityAreNotIsoscelesEvenIfTwoAreEqual() throws TriangleException {
        new Triangle(1, 1, 3);
    }

    @Test(expected = TriangleException.class)
    public void verySmallTrianglesCanBeIsosceles() throws TriangleException {
        Triangle triangle = new Triangle(0.5, 0.4, 0.5);

        assertTrue(triangle.isIsosceles());
    }

    @Test(expected = TriangleException.class)
    public void scaleneTrianglesHaveNoEqualSides() throws TriangleException {
        Triangle triangle = new Triangle(5, 4, 6);

        assertTrue(triangle.isScalene());
    }

    @Test(expected = TriangleException.class)
    public void trianglesWithAllSidesEqualAreNotScalene() throws TriangleException {
        Triangle triangle = new Triangle(4, 4, 4);

        assertFalse(triangle.isScalene());
    }

    @Test(expected = TriangleException.class)
    public void trianglesWithOneUnequalSideAreNotScalene() throws TriangleException {
        Triangle triangle = new Triangle(4, 4, 3);

        assertFalse(triangle.isScalene());
    }

    @Test(expected = TriangleException.class)
    public void testSidesThatViolateTriangleInequalityAreNotScaleneEvenIfTheyAreAllDifferent() throws TriangleException {
        new Triangle(7, 3, 2);
    }

    @Test(expected = TriangleException.class)
    public void verySmallTrianglesCanBeScalene() throws TriangleException {
        Triangle triangle = new Triangle(0.5, 0.4, 0.6);

        assertTrue(triangle.isScalene());
    }


    @Test(expected = TriangleException.class)
    public void triangleEquilateralPatternsEqual() throws TriangleException{

        Triangle triangle = new Triangle(3,3,3);
        assertTrue(triangle.isEquilateral());
    }

    @Test(expected = TriangleException.class)
    public void triangleEquilateralPatternsNotEqual() throws TriangleException{

        Triangle triangle = new Triangle(3,3,9);
        assertFalse(triangle.isEquilateral());
    }

    @Test(expected = TriangleException.class)
    public void triangleEquilateralPatternsZero() throws TriangleException{

        Triangle triangle = new Triangle(0,0,0);
        assertTrue(triangle.isEquilateral());
    }

}
