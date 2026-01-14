fun getStudentListStatus(student: List<Student>?, onResult: (StudentListStatus) -> Unit){
    student?.let{ students->
        val status = when{
            students.isEmpty() ->
                StudentListStatus.STUDENT_LIST_EMPTY
            else ->
                StudentListStatus.STUDENT_LIST_SUCCESS
        }
        onResult(status)
        return
    }
    onResult(StudentListStatus.STUDENT_LIST_EMPTY)
}