fun main(){
    val studens: List<Course> = listOf(
        Course("32323", "Thuan"),
        Course("32323", "Thuan"),
        Course("32323", "Thuan"),
    )
    getCourseListStatus(studens){status->
        println(status.message)
    }
}