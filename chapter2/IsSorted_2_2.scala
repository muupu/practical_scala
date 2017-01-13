
object IsSorted_2_2 {
	

	def isSorted[A](as : Array[A], orderd: (A, A) => Boolean) : Boolean = {
		@annotation.tailrec
		def loop (n: Int): Boolean = {
			if (n >= as.length-1) true
			else if (!orderd(as(n), as(n+1))) false
			else loop(n + 1)
		}
		
		loop(0)
	}

	def main(args: Array[String]): Unit = {
		println(isSorted(Array(7, 9, 13, 15, 18, 21), (x: Int, y: Int) => x < y))
	}
}