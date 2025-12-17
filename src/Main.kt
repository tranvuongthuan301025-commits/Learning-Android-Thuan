data class BankAccont private constructor(val balance: Int){
    companion object {
        fun create (intitalBalance: Int) : BankAccont {
            return BankAccont(intitalBalance)
        }
    }
    fun deposit(amount: Int) : BankAccont {
        return BankAccont(balance + amount)
    }
    fun withdraw(amount: Int) : BankAccont {
        return BankAccont(balance - amount)
    }
}

fun main(){
    val account1 = BankAccont.create(100)
    val account2 = account1.deposit(50)
    val account3 = account2.withdraw(30)

    println(account1.balance)
    println(account2.balance)
    println(account3.balance)
}