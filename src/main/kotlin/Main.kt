fun main() {
length (arrayOf("Elizabeth","Ruth","Caren","Daniel","Catherine"))
  oddNumbers()
  serveAges(2)
    serveAges(13)
    serveAges(19)
     Division()

}

fun oddNumbers(){
  for (i in 1..100){
      if(i%2!=0){
          println("odd number$i")
      }
  }
}

fun length(names:Array<String>):Int{
    var name = 0
    for (r in names){
        if (r.length>5){
            name ++
        }
    }
    return(name)
}

fun serveAges(age:Int){
    when (age){
        in 0..6 -> println("serve Milk")
        in  6..15-> println("serve Fanta")
        else -> println("serve Coca Cola")
    }
}

fun Division(){
    for (n in 1..100){
        if (n%3==0 && n%5==0) {
            println("FizzBuzz")
        }else if (n%3==0){
            println("Fizz")

        }
        else if (n%5==0){
            println("Buzz")
        }
    }
}