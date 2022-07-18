object Q3 extends App {

    print("Enter radius: ");
    var radius = scala.io.StdIn.readFloat();

    def volume(radius:Float):Float = 4/3 * 3.14F * radius * radius * radius;

    println("Volume = "+ volume(radius));

}