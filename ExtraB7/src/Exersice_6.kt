fun getCourseListStatus(courses: List<Course>?, onResult: (CourseListStatus) -> Unit){
    courses?.let {check->
        val status = when{
            check.size < 0 ->
                CourseListStatus.COURSE_LIST_EMPTY
            else -> CourseListStatus.COURSE_LIST_SUCCESS
        }
        onResult(status)
        return
    }
    onResult(CourseListStatus.COURSE_LIST_EMPTY)
}