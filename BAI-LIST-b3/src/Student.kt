import kotlin.coroutines.CoroutineContext

data class Student(val id: Int, val name: String, val score: Int)

fun main() {
    val student: List<Student?> = listOf(
        Student( 1,"an",8),
        Student(2, "vu", 9),
        Student(3,"thuan", 7),
    )
//    Bài 1
//    a
    println(student)


//    b
    student.forEach {
        println(it?.name)
    }


//    c
    student.forEach {
        println(it!!.score >= 5)
    }


//    Bài 2
    val kt = student.any() {
        it!!.score < 5
    }
    println(kt)


//    Bài 3
    val dau = student.all { it!!.score >= 5 }
    println(dau)


//    Bài 4
    val timkiem = student.find { it?.id == 2 }
    println(timkiem)


//    Bài 5
//    a)
    val kill: Map<Int,Student?> = mapOf(
        1 to Student( 1,"an",8),
        2 to Student(2, "vu", 9),
        3 to Student(3,"thuan", 7)
    )
    println("Danh sách Map: ${kill}")


//    b)
//    Cách 1
    for((key, value) in kill) {
        if(key==3){
            println("Cách 1: ${value}")
        }
    }

//    Cách 2
    kill.forEach {
        if(it.key == 3){
            println("cách 2:${it.value}")
        }
    }
}


