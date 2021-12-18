const val MIN_COMMISSION = 35_00

fun main(args: Array<String>) {
    val amount = 10000_00
    transfer(amount)
}
fun transfer(amount: Int){
    val commission: Int = (amount * 75)/10000
    if (commission < MIN_COMMISSION) {
        val transferAmount = amount - MIN_COMMISSION
        println("Сумма перевода " + (amount / 100) + " руб. " + (amount % 100) + " коп. " +
                "Комиссия составит " + (MIN_COMMISSION / 100) + " руб. " +
                "Сумма перевода с учетом комиссии " + (transferAmount / 100) + " руб." + (amount % 100) + " коп. ")

    } else {
        val transferAmount = amount - commission
        println("Сумма перевода " + (amount / 100) + " руб. " + (amount % 100) + " коп. " +
                "Комиссия составит " + (commission / 100) + " руб. " + (commission % 100) + " коп. " +
                "Сумма перевода с учетом комиссии " + (transferAmount / 100) + " руб." + (amount % 100) + " коп. ")
    }
}

