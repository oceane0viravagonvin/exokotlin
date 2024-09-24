class LewisCarrollBook{
    var name: String="Unnamed Book"
        get() {
            println("The name of book is $field")
            return field
        }
        set(value) {
            println("Now , a name of the book is $value")
            field = value
        }
    var author:String="Lewis Carrol"
        get() {
            println("The author of the book is $field")
            return field
        }
    var price:Int = 0
        get() {
            println("Putting a new price ...")
            return field
        }
        set(value) {
            println("The New price is $value")
            field = value
        }
}

/* fun main() {
    val alicesAdventuresInWonderland = LewisCarrollBook()
    alicesAdventuresInWonderland.name = "Alice's Adventures in Wonderland"

    println(alicesAdventuresInWonderland.author)
    alicesAdventuresInWonderland.price = 10
} */

fun main() {
    val lewisCarrollBook = LewisCarrollBook()
    var bookName = lewisCarrollBook.name
    lewisCarrollBook.name = "Alice's Adventures in Wonderland"
    bookName = lewisCarrollBook.name
    var authorName = lewisCarrollBook.author
    var bookPrice = lewisCarrollBook.price
    lewisCarrollBook.price = 1500
}