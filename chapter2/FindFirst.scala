
object FindFirst {
	
	def findFirst(ss : Array[String], key: String) : Int = {
		@annotation.tailrec
		def loop (n: Int): Int = {
			if (n >= ss.length) -1
			else if (ss(n) == key) n
			else loop(n + 1)
		}
		
		loop(0)
	}

	def findFirst[A](ss : Array[A], p: A => Boolean) : Int = {
		@annotation.tailrec
		def loop (n: Int): Int = {
			if (n >= ss.length) -1
			else if (p(ss(n))) n
			else loop(n + 1)
		}
		
		loop(0)
	}

	def main(args: Array[String]): Unit = {
		var list = Array("AAA", "BBB", "CCC", "DDD")
		println(findFirst(list, "CCC"))
		println(findFirst(Array(7, 9, 13), (x: Int) => x == 9))
	}
}