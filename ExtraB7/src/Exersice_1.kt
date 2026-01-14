fun loginTraditional(account: UserAccount?): LoginStatus{
    if(account?.email.isNullOrBlank() && account?.password.isNullOrBlank()){
        LoginStatus.LOGIN_EMPTY
    }
    return LoginStatus.LOGIN_ERROR
}

fun checkLogin(account: UserAccount?, onResult: (LoginStatus) -> Unit ){
    account?.let{user->
        val status = when{
            user.email.isEmpty() && user.password.isEmpty() ->
                LoginStatus.LOGIN_EMPTY
            user.email == "admin" && user.password == "123" ->
                LoginStatus.LOGIN_SUCCESS
            else ->
                LoginStatus.LOGIN_ERROR
        }
        onResult(status)
        return
    }
    onResult(LoginStatus.LOGIN_ERROR)
}
