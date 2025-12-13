package CollectionsInKotlin

import CollectionsInKotlin.User

fun main(){
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

    // 🗺️ MAP Exercises
    val userMap = users.associate { it.name to it.place }
//    Map user email to full object
    val emailMap = users.associateBy { it.email }

//    Group users by city
    val groupedByCity = users.groupBy { it.place }

//    Group users by plan type (Pro, Free, VIP)
    val usersPlan = users.groupBy { it.membershipLevel }

//    Count how many users per city
    val userCountCity= users.groupingBy { it.place }.eachCount()

    //    Find the average age per plan type
//    → Use groupBy + mapValues { ...average() }
    val avgAgePerPlan = users
        .groupBy { it.membershipLevel } // Group users by plan type
        .mapValues { (_, users) -> users.map { it.age }.average() } // Calculate avg age per group
    avgAgePerPlan.forEach { (plan, avgAge) ->
        println("$plan → ${"%.2f".format(avgAge)} years")
    }
}