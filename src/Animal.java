public class Animal implements Animalskill {
    private double DistanceRun, DistanceJump, DistanceSwim;

    Animal(double DistanceRun, double DistanceJump, double DistanceSwim) {
        this.DistanceRun = DistanceRun;
        this.DistanceJump = DistanceJump;
        this.DistanceSwim = DistanceSwim;
    }

    public boolean run(double value) {
        return DistanceRun > value;
    }
    public boolean jump(double value) {
        return DistanceJump > value;
    }
    public boolean swim(double value) {
        return DistanceSwim > value;
    }

    double getDistanceRun() {
        return DistanceRun;
    }
    double getDistanceJump() {
        return DistanceJump;
    }
    double getDistanceSwim() {
        return DistanceSwim;
    }
}