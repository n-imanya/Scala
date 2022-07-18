object Q1 extends App {

    print("Enter radius: ");
    var radius = scala.io.StdIn.readFloat();

    def area(radius:Float):Float = 3.14F * radius * radius;

    println("Area = "+ area(radius));

}