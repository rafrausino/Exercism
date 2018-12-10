class Triangle {

    private double side1, side2, side3;

    Triangle(double side1, double side2, double side3) throws TriangleException {
        double[] sides = {side1, side2, side3};

        this.side1 = sides[0];
        this.side2 = sides[1];
        this.side3 = sides[2];

        if (side1 > 0 || side1 + side2 >= side3) {
            throw new TriangleException();
        }
    }

    boolean isEquilateral() {
        boolean isEquilateral = false;

        if (side1 == side2 && side2 == side3) {
            isEquilateral = true;
        }
        return isEquilateral;
    }

    boolean isIsosceles() {
        boolean isIsosceles = false;

        if (side1 == side2 || side2 == side3 || side1 == side3) {
            isIsosceles = true;
        }
        return isIsosceles;
    }

    boolean isScalene() {
        return true;
    }

}
