object Q3 extends App{

    def addition(n:Int):Int={
        if(n==0)
            return 0
        else
            n+addition(n-1)
    }

    print("Enter number : ")
    var n = scala.io.StdIn.readInt()

    println("Addition = "+addition(n))

}