public enum PlaneType {

    BOEING747(416, 2000),
    G500(10, 200)

    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight){
        this.capacity = capacity;
        this.weight = weight;
    }
}
