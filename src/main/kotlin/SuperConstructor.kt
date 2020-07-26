fun main() {
    val premiumCustomer = PremiumCustomerSatu("Eko", 110)
    println(premiumCustomer.name)
    println(premiumCustomer.balance)

    val executiveCustomer = PremiumCustomerDua("Budi", 10000)
    println(executiveCustomer.name)
    println(executiveCustomer.type)
    println(executiveCustomer.balance)
}