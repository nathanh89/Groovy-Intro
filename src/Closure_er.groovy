
class Closure_er {
	static void main(args){
		def acoll = ["Groovy", "Java", "Ruby"]
		for (Iterator iter = acoll.iterator(); iter.hasNext();){
			println iter.next()
		}
		
		acoll.each{
			println it
		}
		
		acoll.each{value -> 
			println value
		}
		
		"ITERATION".each{
			println it.toLowerCase()
		}
	}

}
