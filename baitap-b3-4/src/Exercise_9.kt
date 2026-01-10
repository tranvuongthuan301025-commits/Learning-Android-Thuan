data class user(val name: String, val total: Double){

}
fun main(){
    val information: List<user> = listOf(
        user("An", 4.9),
        user("Hieu", 5.9),
        user("Hung", 5.0),
        user("Thuan", 9.9),
        user("Tai", 6.9),
    )
    val dau = information.filter {
         it.total > 5.0
    }
    dau.forEach {
        if(it.total > 5.0)  println("${it.name},${it.total}") else println("không có ai trên 5 hết ")
    }
    val nhandoi = dau.map {
        println("${it.total * 2}:  ${it.name}")
    }
}