enum class students(val message: String){
    STUDENT_LIST_EMPTY("dữ liệu rỗng"),
    STUDENT_LIST_SUCCESS("Thành Công")
}
class student(val name: String?, val id_name: Int)
fun main(){
    val studentList: List<student?> = listOf(
        student("thuận", 1),
        student("Hùng", 2),
        student("Quân", 4),
        student("Tài", 3),
        student("Hiếu", 1)
    )

    val status = if(studentList.size == 0)  students.STUDENT_LIST_EMPTY else students.STUDENT_LIST_SUCCESS
    val message = when(status){
        students.STUDENT_LIST_EMPTY -> students.STUDENT_LIST_EMPTY.message
        students.STUDENT_LIST_SUCCESS -> students.STUDENT_LIST_SUCCESS.message
    }
    println(message)
}