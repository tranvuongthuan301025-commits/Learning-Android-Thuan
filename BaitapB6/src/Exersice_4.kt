
fun main(){
    val Score: Double? = null
    val chay = Score?.run{
             println(
                 if(Score >= 5) "PASS" else "FAIL"
             )
    } ?: println("INVALID")
}