
class Mapper {
    static void main(args){
        def hash = [name:"Andy", "VPN-#":45]
        assert hash.getClass() == java.util.LinkedHashMap
        hash.put("id", 23)
        assert hash.get("name") == "Andy"
        assert hash.get("id") == 23
        println hash
        hash.dob = "03/15/1989"
        println hash
        hash["gender"] = "male"
        assert hash["gender"] == "male"
        assert hash.gender == "male"
        assert hash.get("gender") == "male"
        println hash
        println " "
        hash.each{key, value ->
            println "${key}:${value}"
        }
    }
}