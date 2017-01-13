object Factorial {
	
	def factorial(n : Int) : Int = {
		@annotation.tailrec
		def go (n: Int, acc: Int): Int = {
			if (n <= 0) acc
			else go(n-1, n*acc)
		}
		
		go(n, 1)
	}

	def main(args: Array[String]): Unit = {
		println(factorial(10))
	}
}