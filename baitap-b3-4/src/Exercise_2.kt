fun login (Ustatus: Boolean = false): String{
    var message: String = "vui lòng kiểm tra"
    if(Ustatus){
        println(message+"Bạn đã đăng nhập ")
    }else{
        println("Vui lòng đăng nhập")
    }
    return "eroor"
}
fun main(){
    val n: Boolean = false
    login(n)
}