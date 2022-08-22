object Q5 extends App{

   def addEven(n:Int):Int = {

      if(n%2==0){
         if(n==0)
            return 0
         else
            n + addEven(n-1)
      }
      else{
         addEven(n-1)
      }
   }

   print("Enter number : ")
   var n = scala.io.StdIn.readInt()

   println("Addition of even numbers: "+addEven(n))

}