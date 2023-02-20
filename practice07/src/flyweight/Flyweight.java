package flyweight;

class Flyweight {
    private int row;
    public Flyweight(int row) {
        this.row = row;
        System.out.println("row: " + this.row);
    }
    void report(int col) {
        System.out.print(" " + row + col);
    }
}

