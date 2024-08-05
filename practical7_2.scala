import scala.io.StdIn.readLine

object hello{

	def calculateSquare(list:List[Int]):List[Int]={
	
		var newList = list.map(x => x*x);
		newList;
	}
  
	def main(args:Array[String]):Unit = {
		
		var list = List(1,2,3,4,5);
		
		println("input : " + list);
		
		var newList = calculateSquare(list);
		
		println("\nOutput : " + newList);
	}

}
