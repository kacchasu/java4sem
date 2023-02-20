package visitor;

class CarVisitor implements Visitor {
    public void visit(SportCar computer) {
        print("car");
    }

    public void visit(Engine engine) {
        print("engine");
    }

    public void visit(Whell whell) {
        print("whell");
    }

    private void print(String string) {
        System.out.println(string);
    }
}
