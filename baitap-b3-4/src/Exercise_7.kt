fun main(){
    val datas: Map<String, Boolean> = mapOf(
        "An" to true,
        "Bình" to false
    )
    val result = datas.filter { it.value == true }
    result.forEach {
        println(
            if( it.value) "Đang Hoạt Động , ${it.key}"
            else "không có người hoạt động"
        )
    }
}