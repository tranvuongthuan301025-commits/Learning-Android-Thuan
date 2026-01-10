enum class search(val message: String){
    DETAIL_FOUND("Tìm Thấy Sinh Viên"),
    DETAIL_NOT_FOUND("Không Tìm Thấy Sinh Viên")
}
data class sinhvien(val name: String?, val id_name: String?, val id_can_tim: String?)

fun timkiemtensv(): search {
    val danhSachSinhVien: List<sinhvien?> = listOf(
        sinhvien("thuận", "123thuan", "1234"),
        sinhvien("Hiếu", "abc1", "12"),
        sinhvien("Hùng", "123th", "13")
    )
    println("nhập id cần tìm : ")
    val user1: String? = readLine()?.trim()
    danhSachSinhVien.forEach {
        if (it?.id_can_tim == user1) {
            return search.DETAIL_FOUND
        } else {
            return search.DETAIL_NOT_FOUND
        }
    }
    return search.DETAIL_NOT_FOUND
}
fun main(){
    val user = timkiemtensv()
    val result = when(user){
        search.DETAIL_NOT_FOUND -> search.DETAIL_NOT_FOUND.message
        search.DETAIL_FOUND -> search.DETAIL_FOUND.message
        else -> "lỗi"
    }
    println(result)
}