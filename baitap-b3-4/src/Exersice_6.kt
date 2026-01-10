enum class subject(val message: String){
    COURSE_LIST_EMPTY("Danh sách môn học rỗng"),
    COURSE_LIST_SUCCESS("Có danh sách môn học")
}
data class monhoc( val id_sach: String?, val ma_sach: String?)
fun danhSachMonHoc(list: List<monhoc>): subject{
    if(list.size > 0){
        return subject.COURSE_LIST_SUCCESS
    }
    return subject.COURSE_LIST_EMPTY
}
fun main(){
    val listmonhoc: List<monhoc> =listOf(
        monhoc("123", "TPM12"),
        monhoc("145", "TPM13"),
        monhoc("234", "TPM14")
    )
    val result = when(danhSachMonHoc(listmonhoc)){
        subject.COURSE_LIST_EMPTY -> subject.COURSE_LIST_EMPTY.message
        subject.COURSE_LIST_SUCCESS -> subject.COURSE_LIST_SUCCESS.message
    }
    println(result)
}