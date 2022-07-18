object Q2 extends App {

    print("Enter temperature in celsius: ");
    var temC = scala.io.StdIn.readFloat();

    var tempF = temC * 9 / 5 + 32;

    println("Temperature in F = "+ tempF);

}