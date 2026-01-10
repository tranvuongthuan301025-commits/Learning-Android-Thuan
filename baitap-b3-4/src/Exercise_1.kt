fun main(){
    val name: String? = " "
    if(name!!.isNotBlank() &&  name!=null){
        println("xin chao $name")
    }else{
        println("Xin chao khach")
    }
}