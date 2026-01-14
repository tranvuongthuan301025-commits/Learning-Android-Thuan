fun main(){
    val sinhvien: List<Student> = listOf(
        Student(1111, "thuan", 10.0),
        Student(1111, "thuan", 10.0),
        Student(1111, "thuan", 10.0)
    )
    getStudentListStatus(sinhvien){status ->
        println(status.message)
    }
}