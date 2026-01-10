fun main(){
    val total: Double = 10.0
    val result = when (total){
        in 0.0..4.9 -> "yếu"
        in 5.0..6.4 -> "Trung Bình"
        in 6.5..7.9 -> "Khá"
        in 8.0..10.0 -> "Giỏi"
        else -> "không có dữ liệu"
    }
}