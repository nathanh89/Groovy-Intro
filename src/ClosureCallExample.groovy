
class ClosureCallExample {
    static void main (args){
        def excite = {word ->
            println "${word}!!"
        }
            
        def exciteTest = ["This","is","pretty","fucking","sweet"]
        exciteTest.each excite
    
	
		def borify = {word ->
			return word.toLowerCase()
		}
		
		assert "groovy" == borify("GROOVY")
    }

}