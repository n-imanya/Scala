object Q2 extends App {

    def OddEven(number: Int): String =  number match{
        case x if number<=0 => "Negative/zero input"
        case x if number%2==0 => "Even number is given"
        case x if number%2!=0 => "Odd number is given"
    }

    print("Enter number: ");
    var number = scala.io.StdIn.readInt();
    println(OddEven(number))
}