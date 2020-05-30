object Main extends App{
    ///////Question-1
    def workHours(hours:Int,n:Int):Int = {
        return hours*n;
    }
    def otHours(hours:Int,n:Int):Int = {
        return hours*n;
    }
    def income(h1:Int,h2:Int):Int = {
        return workHours(h1,150) + otHours(h2,75);
    } 
    def tax(income:Int, tax:Double):Double = {
        return income*0.1;
    }
    def takeHomeSalary(h1:Int,h2:Int):Double = {
        return income(h1,h2) - tax(income(h1,h2),0.1);
    }
    println("Take home salary = " + takeHomeSalary(40,20));

    ///////Question-2
    def attendees(price:Int):Int = {
        return 120 + (15-price)/5*20;
    }
    def revenue(price:Int):Int = {
       return attendees(price)*price;
    }
    def cost(price:Int):Int = {
        return 500 + 3 + attendees(price);
    }
    def profit(price:Int):Int = {
        return revenue(price) - cost(price);
    }
    println("profit when ticket price is " + 15 + " = " + profit(20));
}