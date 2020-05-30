object Main extends App{
    println("------------------------------------------")
    println("Question-01");
    def prime(n:Int, i:Int=2):Boolean ={
        if(i<n){
            if(n%i==0 && i !=n ){
                return false;
            }
            prime(n, i+1);
        }
        else{
            return true;
        }
    }
    println("5 = "+prime(5));
    println("8 = "+prime(8));

    println("------------------------------------------");
    println("Question-02");
    def primeSequence(n:Int):Unit = {
        if(n<2){
            return
        }
        if(prime(n)){
            println(n);
        }
        primeSequence(n-1);
    }
    primeSequence(10);

    println("------------------------------------------");
    println("Question-03");
    def sum(n:Int):Int = {
        if(n>0){
            return n + sum(n-1);
        }
        else{
            return 0;
        }
    }
    println("sum(5) = "+sum(5));

    println("------------------------------------------");
    println("Question-04");
    def even(n:Int):Boolean = {
        if(n==0){
            return true;
        }
        else if(n==1){
            return false;
        }
        else{
            return even(n-2);
        }
        }
        println("11 is Even ="+even(11));
        println("12 is Even ="+even(12));

        println("------------------------------------------");
        println("Question-05");
        def allEvenSum(n:Int, i:Int=0):Int = {
            if(n<2){
                return 0;
            }
            if(even(n)){
                return n-2 + allEvenSum(n-2, i+1);
            }
            else{
                return n-1 + allEvenSum(n-2,i+1);
            }
        }
        println(allEvenSum(12));

         println("------------------------------------------");
        println("Question-06");
        def fibonacci(n:Int):Int={
            if(n<1) return 0;
            if(n==1) return 1;
            else{
                fibonacci(n-1) + fibonacci(n-2);
            }
        }
        def febSequence(n:Int) : Unit = {
            if(n>=0){
                febSequence(n-1);
                println(fibonacci(n));
            }
        }
        febSequence(10);

    }
