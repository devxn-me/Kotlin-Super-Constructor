open class Customer(val name: String, val type: String, val balance: Long) {
    constructor(name: String, type: String) : this(name, type, 0)
    constructor(name: String, balance: Long) : this(name, "Standard")
}

// Cara Pertama
class PremiumCustomerSatu : Customer {
    constructor(name: String) : super(name, "Premium")
    constructor(name: String, balance: Long) : super(name,"Premium", balance)
}

// Cara Kedua
class PremiumCustomerDua(name: String, type: String, balance: Long) : Customer(name, "Premium") {
    constructor(name: String, balance: Long) : this(name,"Premium", balance)
}