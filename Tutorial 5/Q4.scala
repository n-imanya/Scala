object Q4 extends App {

    def oddEven(n:Int):String = {
        if(n==0)
            "Even"
        else if(n==1)
            "Odd"
        else
            oddEven(n-2)
    }

    print("Enter number : ")
    var n = scala.io.StdIn.readInt()
    println(oddEven(n))
}