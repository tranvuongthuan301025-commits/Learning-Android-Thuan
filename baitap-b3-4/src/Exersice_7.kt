enum class logout(val message: String){
    LOGOUT_CANCELLED("Đăng Xuất Thất Bại"),
    LOGOUT_SUCCESS("Đăng Xuất Thành Công")
}
fun userLogout(status: String): logout{
    if(status == "y" || status == "yes" || status == "Y" || status == "YES"){
        return logout.LOGOUT_SUCCESS
    }
    return logout.LOGOUT_CANCELLED
}
fun main(){
    print("Nhập yes/no để đăng xuất hệ thống: ")
    val user: String  = readln()
    val result = when(userLogout(user)){
        logout.LOGOUT_CANCELLED -> logout.LOGOUT_CANCELLED.message
        logout.LOGOUT_SUCCESS -> logout.LOGOUT_SUCCESS.message
    }
    println(result)
}