import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        int planetClassIndex = random.nextInt(PLANET_CLASSES.length);
        return PLANET_CLASSES[planetClassIndex];
    }

    String randomShipRegistryNumber() {
        int number = 1000 + random.nextInt(9000);
        return "NCC-" + number;
    }

    double randomStardate() {
        double starDate = 41000.0 + 01000.0 * random.nextDouble();
        return starDate;
    }
}
