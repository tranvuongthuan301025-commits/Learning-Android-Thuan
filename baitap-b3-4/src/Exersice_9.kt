enum class searchData(val message: String){
    EMPTY_REWORK("Dữ liệu keywork rỗng"),
    SEARCH_NO_RESULT("Không có kết quả"),
    SEARCH_SUCCESS("Có Kết quả")
}
data class data(val keywork: String?, val soluong: Int?, val itemName: String?)
fun check(): searchData{
    val dataLogin: List<data> = listOf(
        data("abc23", 1, "Thuận"),
        data("abc24", 2, "Hùng"),
        data("abc25", 3, "Hiếu"),
    )
    print("Nhập keywork của bạn: ")
    val n = readLine()?.trim()
    dataLogin.forEach {
        if(it.keywork.isNullOrBlank()){
            return searchData.EMPTY_REWORK
        }else if(it.keywork == n){
            return searchData.SEARCH_SUCCESS
        }
    }
    return searchData.SEARCH_NO_RESULT
}
fun main(){
    val user = check()
    val result = when(user){
        searchData.EMPTY_REWORK -> searchData.EMPTY_REWORK.message
        searchData.SEARCH_SUCCESS -> searchData.SEARCH_SUCCESS.message
        else -> searchData.SEARCH_NO_RESULT.message
    }
    println(result)
}