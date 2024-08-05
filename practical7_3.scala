import scala.io.StdIn.readLine

object hello{

	def check(x: Int): Boolean = {
    		if (x <= 1) false
   		else if (x == 2) true
    		else if (x % 2 == 0) false
	        else {
	      		var sqrt = math.sqrt(x).toInt
	      		var isPrime = true
	      		for (i <- 3 to sqrt by 2 if isPrime) {
			if (x % i == 0) isPrime = false
	      		}
      		isPrime
    		}
  }

	def filterPrime(list: List[Int]): List[Int] = {
	       list.filter(check)
	  }

       def main(args: Array[String]): Unit = {
    		var list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    		println("input : " + list)
    		var newList = filterPrime(list)
    		println("\nOutput : " + newList)
  }	
}
