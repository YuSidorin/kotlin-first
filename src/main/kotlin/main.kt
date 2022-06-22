fun main(){
// first one
    val fee = calculateFee(100_000_000)

// second one
    val likes: Int = 5
    getLikesWord(likes)
}

// third one

private fun calculateFee(amount: Int): Int {
    val standartFee = 3500
    var fee: Int = amount / 100 * 75
    if (fee < standartFee) {
        fee = standartFee
    }
    return fee
}

private fun getLikesWord(likes: Int): String {
    val firstCase = " людей"
    val secondCase = " человека"
    val thirdCase = " человек"
    var string = ""
    if (likes === 2 || likes === 3 || likes === 4){
        string = secondCase
    } else if (likes === 1){
        string = thirdCase
    } else {
        string = firstCase
    }
    return string


}