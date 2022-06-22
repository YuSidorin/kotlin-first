fun main(){
// first one
    val fee = calculateFee(100_000_000)

// second one
    val likes: Int = 5
    getLikesWord(likes)

// third one
    calculateDiscount(10000, true)
}

private fun calculateFee(amount: Int): Int {
    val standartFee = 3500
    var fee: Int = amount / 100 * 75
    if (fee < standartFee) {
        fee = standartFee
    }
    println(fee)
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
    println(string)
    return string
}

private fun calculateDiscount(amount: Int, isClient: Boolean): Int {
    val discountFirstLevel = 1000
    val discountSecondLevel = 10000
    val discount = 100
    var result: Int = 0
    var maxDiscount = amount / 100 * 5
    var minDiscount = amount / 100 * 1
    if (amount <= discountFirstLevel) {
        result = amount
    } else if (amount > discountFirstLevel && amount < discountSecondLevel) {
        result = amount - discount
    } else if (amount > discountSecondLevel) {
        result = amount - maxDiscount
    }
    val totalResult = if (isClient) result - minDiscount else result
    println(totalResult)
    return totalResult

}