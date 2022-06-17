public enum PlaneType {

    BOEING747(524, 103419),
    AIRBUS_A320(1473, 203957),
    BOEING777(657, 125876),
    AIRBUS_A330(1865,208856);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
