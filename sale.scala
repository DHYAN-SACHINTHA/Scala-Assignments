object sale extends App{
  println("Enter the num of books:");
  var p =scala.io.StdIn.readInt()
  if(p>=50){
    var total = 50*3+(p-50)*0.75+24.95-(24.95*0.4);
    println(total);
  }
  else{
    var total = p*3+24.95-(24.95*0.4);
    println(total);
  }
}

