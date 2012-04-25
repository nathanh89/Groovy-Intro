import static org.junit.Assert.*;
import org.junit.Test;


class RangerTest {
	
	@Test
	void testClassTyping(){
		def coll = ["Groovy", "Java", "Ruby"]
		assert coll instanceof ArrayList
		assert coll instanceof Collection
	}
	
	@Test
	void testAddToCollection(){
		def coll = ["Groovy", "Java", "Ruby"]
		coll.add("Python")
		assert coll[3] == "Python"
		coll<<"Smalltalk"
		assert coll[4] == "Smalltalk"
		coll[5]="Perl"
		assert coll[5] == "Perl"
		assert coll == ["Groovy", "Java", "Ruby", "Python", "Smalltalk", "Perl"]
	}
	
	@Test
	void testCollectionAdditionSubtraction(){
		def numbers = [1,2,3,4]
		assert numbers +5 == [1,2,3,4,5]
		assert numbers -[2,3] == [1,4]
	}
	
	@Test
	void testMagicJoinMethod(){
		def numbers = [1,2,3,4]
		assert numbers.join(" ") == "1 2 3 4"
		assert numbers.join("-") == "1-2-3-4"
	}
	
	@Test
	void testMagicCountMethod(){
		def counter = [1,2,2,3,3,3,4,4,4,4]
		assert counter.count(4) == 4
		assert counter.count(3) == 3
		assert counter.count(2) == 2
		assert counter.count(1) == 1
	}
	
	@Test
	void testLetterCaseManipulation(){
		assert ["JAVA", "GROOVY"] == ["Java", "Groovy"]*.toUpperCase()
		assert ["java", "groovy"] == ["JAVA", "GROOVY"]*.toLowerCase()
		def capsTest = ["java", "groovy"]
		capsTest[1] = capsTest[1].toUpperCase()
		assert capsTest[1] == "GROOVY"
		capsTest[1] = capsTest[1].toLowerCase()
	}
	
}
