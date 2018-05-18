package cinema.dto;

public enum  CapacityOfHalls {

    FULLCAPACITY(200);

    private final int capacityOfHalls;

    CapacityOfHalls(int capacityOfHalls) {
        this.capacityOfHalls = capacityOfHalls;
    }

    public int getCapacityOfHalls() {
        return capacityOfHalls;
    }

    @Override
    public String toString() {
        return "CapacityOfHalls{" +
                "capacityOfHalls=" + capacityOfHalls +
                '}';
    }
}
