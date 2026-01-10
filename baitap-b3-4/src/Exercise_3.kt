fun main(){
    val checkLogin: Map<String,String?> = mapOf(
        "thuan" to "123456",
        "hung" to "1234567",
        "hieu" to "123" ,
    )
    print("Nhập Tài Khoản: ")
    val userName: String? = readLine()?.trim()
    print("Nhập Nhập mất khẩu: ")
    val password: String? = readLine()?.trim()
    if(userName.isNullOrBlank() || password.isNullOrBlank()){
        println("Sai Tài khoản")
        return
    }
    val result = checkLogin[userName]
    if(result != null && result == password){
        println("Đăng nhập thành công")
    }else{
        println("Sai tài khoản")
    }
}