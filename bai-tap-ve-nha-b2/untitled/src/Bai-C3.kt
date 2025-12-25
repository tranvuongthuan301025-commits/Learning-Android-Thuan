fun main(){
    var text: String ?= null

    println(text!!.length)
}
//1. không
//2. lỗi không biên dịch được
//3. bởi vì text đang khằng định không null nhưng khi khai báo phần text đang để dấu ?. có nghĩa là có thể null nê giá trị bị sai