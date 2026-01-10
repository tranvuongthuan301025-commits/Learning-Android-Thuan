data class Students(val name: String? , val id: String?, var Score: Double)
fun main(){
    val students = Students("Thuan", "1234", 20.0 ).apply{
        Score = 10.0
        println("${name},${id},${Score}")
    }

}