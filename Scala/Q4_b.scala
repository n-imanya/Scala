object Q4 extends App {

    print("Enter the ticket price : ");
    var price = scala.io.StdIn.readInt();

    def attendees(price:Int):Int = 120+(15-price)/5*20;
    def revenue(price:Int):Int = attendees(price)*price;
    def cost(price:Int):Int = 500+attendees(price);
    def profit(price:Int):Int =  revenue(price) - cost(price);

    println("Profit is : "+profit(price));

}

