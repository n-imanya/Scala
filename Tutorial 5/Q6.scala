import scala.util.control.Breaks.break

object Q6 extends App{

    def fibo(n:Int):Int = {
        
        if(n<=1)
            return n
        else
            fibo(n-1) + fibo(n-2) 
    }

    def printFibo(n:Int,i:Int):Unit = {

        if(n==i)
            break
        else
            println(fibo(i))
            printFibo(n,i+1) 
    }

    print("Enter number : ")
    var n = scala.io.StdIn.readInt()

    printFibo(n,0)

}