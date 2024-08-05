

object hello{

	def filterEvenNumbers(list:List[Int]):List[Int] = {
		
		var newList = list.filter(x => x%2 == 0);
		newList;
	
	}
  
	def main(args:Array[String]):Unit = {
		
		var list = List(1,2,3,4,5,6,7,8,9,10);
		
		println("Input : " + list);
		
		var newList = filterEvenNumbers(list);
		
		println("\nOutput : " + newList);
	}

}
