package oop.nested;

public class Bicycle {
    private Integer maxSpeed = 100;

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public class Weel {
        public void repair() {
            maxSpeed += 10;
        }
    }

    public static class Mechanic {
        public void damage(Bicycle bicycle) {
            bicycle.maxSpeed -= 50;
        }
    }
}
