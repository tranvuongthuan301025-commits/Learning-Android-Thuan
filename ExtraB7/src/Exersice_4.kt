fun findStudentDetail(student: List<Student>, idCanTim: Int, onResult: (StudentDetailStatus, Student?)-> Unit){
    student.find {
        it.id == idCanTim
    }.also {
        val status = when{
            it?.id != null -> StudentDetailStatus.DETAIL_FOUND
            else -> StudentDetailStatus.DETAIL_NOT_FOUND
        }
        return onResult(status,it)
    }
}