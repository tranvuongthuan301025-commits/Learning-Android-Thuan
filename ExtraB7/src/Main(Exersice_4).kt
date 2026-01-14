fun main(){
    val students: List<Student> = listOf(
        Student(1221, "Thuan", 5.0),
        Student(121, "Hung", 5.0),
        Student(11, "Hieu", 5.0),
    )
    findStudentDetail(students, 121){ status,it->
        println(status.message)
        println("${it?.id}, ${it?.name}, ${it?.score}")
    }
}