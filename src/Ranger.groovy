
class Ranger {
    static void main(args) {
        def range = 0..4
        println range.class
        assert range instanceof List
        
        def coll = ["Groovy", "Java", "Ruby"]
        coll.add("Python")
        coll<<"Smalltalk"
        coll[5]="Perl"
        assert coll instanceof Collection
        assert coll instanceof ArrayList
        assert coll[1]=="Java"
        println coll[2]
		coll.add("CoffeeScript")
        assert coll == ["Groovy", "Java", "Ruby", "Python", "Smalltalk", "Perl", "CoffeeScript"]
        println coll[6]
		
		def numbers = [1,2,3,4]
		assert numbers +5 == [1,2,3,4,5]
		assert numbers -[2,3] == [1,4]
		assert numbers.join("-") == "1-2-3-4"
		assert [1,2,3,4,3].count(3) == 2
		
		def counter = [1,2,3,4,3,4,4,3,2,4]
		println counter.count(4)
		println counter.count(3)
		println counter.count(2)
		println counter.count(1)
		
		def jointest = [1,2,3,4]
		jointest = jointest.join(",")
		println jointest
		
		assert ["JAVA", "GROOVY"] == ["Java", "Groovy"]*.toUpperCase()
		def capsTest = ["java", "groovy"]
		capsTest[1] = capsTest[1].toUpperCase()
		assert capsTest[1] == "GROOVY"
	}
}