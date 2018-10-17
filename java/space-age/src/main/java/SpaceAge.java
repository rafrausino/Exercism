class SpaceAge {

    private double ageInSeconds;
    private double earthYears;

    private double mercuryOrbit = 0.2408467;
    private double venusOrbit = 0.61519726;
    private double marsOrbit = 1.8808158;
    private double jupiterOrbit = 11.862615;
    private double saturnOrbit = 29.447498;
    private double uranusOrbit = 84.016846;
    private double neptuneOrbit = 164.79132;


    SpaceAge(double seconds) {
        this.ageInSeconds = seconds;
        this.earthYears = seconds / 365.25 / 60 / 60 / 24;
    }

    double getSeconds() {
        return ageInSeconds;
    }

    double onEarth() {
        return earthYears;
    }

    double onMercury() {
        return earthYears / mercuryOrbit;
    }

    double onVenus() {
        return earthYears / venusOrbit;
    }

    double onMars() {
        return earthYears / marsOrbit;
    }

    double onJupiter() {
        return earthYears / jupiterOrbit;
    }

    double onSaturn() {
        return earthYears / saturnOrbit;
    }

    double onUranus() {
        return earthYears / uranusOrbit;
    }

    double onNeptune() {
        return earthYears / neptuneOrbit;
    }

}
