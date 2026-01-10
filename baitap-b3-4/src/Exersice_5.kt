
enum class Scores(val message: String){
    RESULT_INVALID("Không hợp lệ"),
    RESULT_FAIL("Sai"),
    RESULT_PASS("Đúng")
}
fun total(scrore: Double): Scores{
    if(scrore < 0 || scrore > 10){
        return Scores.RESULT_INVALID
    }else if(scrore >= 5.0){
        return Scores.RESULT_PASS
    }else{
        return Scores.RESULT_FAIL
    }
}
fun main(){
    val diem = 11.0
    val user = total(diem)
    val result = when(user){
        Scores.RESULT_INVALID -> Scores.RESULT_INVALID.message
        Scores.RESULT_FAIL -> Scores.RESULT_FAIL.message
        Scores.RESULT_PASS -> Scores.RESULT_PASS.message
        else -> "lỗi"
    }
    println(result)
}