package CollectionsInKotlin

/**
 * EXERCISES to practice:
 * Filter,filterNotNull(),filterIndexed(),filterIsInstance()
 * Map,
 * Find,first(),last(),
 * sorted(),sortedDescending(),sortedBy(),sortedWith()
 * sum(), average(), maxBy(), minBy()
 * union(),intersect(),subtract()
 * all(), any(),none()
 * in Kotlin
 * Practice these collection operations with real-world scenarios
 */

// Sample data classes
data class User(
    val id: Int,
    val name: String,
    val age: Int,
    val isActive: Boolean,
    val email: String,
    val place: String,
    val phoneNumber: String,
    val gender: String,
    val points: Int,
    val membershipLevel: String,
    val isVerified: Boolean,
    val profession: String,
    val degree: String,
    val bio: String
)
data class Product(val id: Int, val name: String, val price: Double, val category: String, val inStock: Boolean)
data class Order(val id: Int, val userId: Int, val amount: Double, val isPaid: Boolean, val items: Int)
data class Employee(val id: Int, val name: String, val department: String, val salary: Double, val yearsOfService: Int)
data class Book(val title: String, val author: String, val publishedYear: Int, val genre: String)
data class Movie(val title: String, val director: String, val releaseYear: Int, val rating: Double)
data class Car(val make: String, val author: String, val model: String, val year: Int, val price: Double)
data class Student(val name: String, val score: Int, val isEnrolled: Boolean)
fun main(){
    val products = listOf(
        Product(1, "Laptop", 999.99, "Electronics", true),
        Product(2, "Mouse", 29.99, "Electronics", true),
        Product(3, "Desk", 299.99, "Furniture", false),
        Product(4, "Chair", 199.99, "Furniture", true),
        Product(5, "Monitor", 399.99, "Electronics", true)
    )
    val orders = listOf(
        Order(1, 1, 150.50, true, 3),
        Order(2, 2, 250.75, false, 5),
        Order(3, 1, 99.99, true, 1),
        Order(4, 3, 500.00, true, 10),
        Order(5, 4, 75.25, false, 2)
    )
    val employees = listOf(
        Employee(1, "John", "IT", 75000.0, 5),
        Employee(2, "Sarah", "HR", 65000.0, 3),
        Employee(3, "Mike", "IT", 85000.0, 7),
        Employee(4, "Lisa", "Sales", 70000.0, 4),
        Employee(5, "Tom", "IT", 60000.0, 2)
    )
    val books = listOf(
        Book("To Kill a Mockingbird", "Harper Lee", 1960, "Southern Gothic"),
        Book("1984", "George Orwell", 1949, "Dystopian"),
        Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Classic"),
        Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 1979, "Science Fiction"),
        Book("Pride and Prejudice", "Jane Austen", 1813, "Romance"),
        Book("Sapiens", "Yuval Noah Harari", 2011, "Non-Fiction"),
        Book("The Lord of the Rings", "J.R.R. Tolkien", 1954, "Fantasy"),
        Book("Educated", "Tara Westover", 2018, "Memoir"),
        Book("Moby Dick", "Herman Melville", 1851, "Adventure"),
        Book("Where the Crawdads Sing", "Delia Owens", 2018, "Mystery")
    )
    val movies = listOf(
        Movie("Inception", "Christopher Nolan", 2010, 8.8),
        Movie("Parasite", "Bong Joon-ho", 2019, 8.5),
        Movie("Pulp Fiction", "Quentin Tarantino", 1994, 8.9),
        Movie("The Godfather", "Francis Ford Coppola", 1972, 9.2),
        Movie("Spirited Away", "Hayao Miyazaki", 2001, 8.6),
        Movie("La La Land", "Damien Chazelle", 2016, 7.9),
        Movie("Forrest Gump", "Robert Zemeckis", 1994, 8.8),
        Movie("Avengers: Endgame", "Anthony Russo", 2019, 8.4),
        Movie("Casablanca", "Michael Curtiz", 1942, 8.5),
        Movie("Joker", "Todd Phillips", 2019, 8.4)
    )

    val cars = listOf(
        Car("Honda", "Silver", "Civic", 2022, 25000.00),
        Car("Ford", "Black", "F-150", 2021, 45500.00),
        Car("Tesla", "White", "Model 3", 2023, 41990.00),
        Car("BMW", "Blue", "X5", 2020, 60000.00),
        Car("Toyota", "Red", "Camry", 2022, 28500.00),
        Car("Porsche", "Yellow", "911", 2023, 120000.00),
        Car("Jeep", "Green", "Wrangler", 2019, 35000.00),
        Car("Nissan", "Gray", "Rogue", 2021, 26700.00),
        Car("Mercedes-Benz", "Silver", "C-Class", 2020, 48000.00),
        Car("Chevrolet", "Black", "Corvette", 2023, 75000.00)
    )

    val students = listOf(
        Student("Alex Johnson", 92, true),
        Student("Maria Garcia", 78, true),
        Student("David Smith", 55, false),
        Student("Emily Chen", 88, true),
        Student("John Doe", 65, true),
        Student("Sarah Brown", 95, true),
        Student("Mike Wilson", 42, false),
        Student("Jessica Lee", 71, false),
        Student("Chris Evans", 80, true),
        Student("Nicole King", 68, true)
    )
    // Sample data
    val users = listOf(
        User(1, "Alice Johnson", 27, true, "alice@email.com", "Hyderabad", "9876543210", "Female", 150, "Pro", true, "Software Engineer", "B.Tech", "Loves coding and coffee."),
        User(2, "Bob Williams", 31, false, "bob@email.com", "Bangalore", "9123456780", "Male", 80, "Free", false, "Graphic Designer", "BFA", "Creative thinker and digital artist."),
        User(3, "Charlie Brown", 35, true, "charlie@email.com", "Mumbai", "9001234567", "Male", 200, "VIP", true, "Product Manager", "MBA", "Focused on building great products."),
        User(4, "Diana Prince", 29, true, "diana@email.com", "Delhi", "9098765432", "Female", 120, "Pro", true, "UX Designer", "M.Des", "Passionate about human-centered design."),
        User(5, "Ethan Hunt", 24, false, "ethan@email.com", "Chennai", "9556677889", "Male", 50, "Free", false, "Marketing Associate", "BBA", "Exploring new marketing ideas."),
        User(6, "Fiona Smith", 26, true, "fiona@email.com", "Pune", "9223344556", "Female", 95, "Pro", true, "Data Analyst", "B.Sc Statistics", "Data-driven decision maker."),
        User(7, "George Martin", 33, true, "george@email.com", "Kolkata", "9331122334", "Male", 180, "VIP", true, "Backend Developer", "M.Tech", "Enjoys solving system-level challenges."),
        User(8, "Hannah Lee", 22, false, "hannah@email.com", "Coimbatore", "9112233445", "Female", 60, "Free", false, "Student", "B.Com", "Learning business and finance."),
        User(9, "Ivan Torres", 28, true, "ivan@email.com", "Jaipur", "9445566778", "Male", 110, "Pro", true, "Mobile Developer", "BCA", "Passionate about Android and Kotlin."),
        User(10, "Julia Roberts", 30, true, "julia@email.com", "Ahmedabad", "9778899001", "Female", 170, "VIP", true, "HR Manager", "MBA HR", "Loves connecting people and teams.")
    )
    val users2 = listOf(
        User(11, "Alice Johnson", 27, true, "alice@email.com", "Hyderabad", "9876543210", "Female", 150, "Pro", true, "Software Engineer", "B.Tech", "Loves coding and coffee."),
        User(12, "Bob Williams", 31, false, "bob@email.com", "Bangalore", "9123456780", "Male", 80, "Free", false, "Graphic Designer", "BFA", "Creative thinker and digital artist."),
        User(13, "Charlie Brown", 35, true, "charlie@email.com", "Mumbai", "9001234567", "Male", 200, "VIP", true, "Product Manager", "MBA", "Focused on building great products."),
        User(14, "Diana Prince", 29, true, "diana@email.com", "Delhi", "9098765432", "Female", 120, "Pro", true, "UX Designer", "M.Des", "Passionate about human-centered design."),
        User(15, "Ethan Hunt", 24, false, "ethan@email.com", "Chennai", "9556677889", "Male", 50, "Free", false, "Marketing Associate", "BBA", "Exploring new marketing ideas."),
        User(16, "Fiona Smith", 26, true, "fiona@email.com", "Pune", "9223344556", "Female", 95, "Pro", true, "Data Analyst", "B.Sc Statistics", "Data-driven decision maker."),
    )

    val listOfUser = users.map{it.place}.toSet()
    val listOfUser2 =  users2.map{it.place}.toSet()
    val arr = arrayOf(1,2,3)
    val list = arr.toSet()


    println()





//    Find the average age per plan type
//    → Use groupBy + mapValues { ...average() }
    val avgAgePerPlan = users
        .groupBy { it.membershipLevel } // Group users by plan type
        .mapValues { (_, users) -> users.map { it.age }.average() } // Calculate avg age per group

    println("Average age per plan type:")
    avgAgePerPlan.forEach { (plan, avgAge) ->
        println("$plan → ${"%.2f".format(avgAge)} years")
    }

//
//    Check if any city has more than 2 Pro users
//    → Group by city → filter counts > 2.
    val prousers = users.groupBy { it.place }
//
//    Map plan type to total credits sum
//    → Use groupBy + sumOf { it.credits }.
//
//    Nested map of City → (PlanType → List of Names)
//    → Combine grouping:
//
//    val nested = users.groupBy { it.city }
//        .mapValues { entry -> entry.value.groupBy { it.planType }.mapValues { it.value.map { u -> u.name } } }
//
    // sets
//
//    List users who live in the same city (duplicate city entries)
//    → Find cities that appear more than once using grouping.
//
//    Add and remove cities from a mutable set
//    → Practice add(), remove(), and contains().
//
//    Check if all Pro plan users are active
//    → Use set logic:
//
    // val allActive = users.filter { it.membershipLevel == "Pro" }.all { it.isActive }
//
//
//    Compare two sets of job titles to find overlap
//    → Use intersect() and union() to explore set relationships.
//
}






