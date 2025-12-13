package enumAndSealedClasses

class Animals(): UiState()

fun main(){

//    val day2 = DayEx.SUNDAY
//    println(day2)
//    println(day2.dayNumber)
//
//    for (i in Day.values()){
//     println(i)
//    }
//    day2.printFormattedDay()

//    val day = Day.SUNDAY
//    println(day)
//
//    val today = DayOfWeek.MONDAY
//    println("Is today a weekend? ${isWeekend(today)}")  // Output: Is today a weekend? false
//
//    val status = HttpStatusCode.NOT_FOUND
//    println(getHttpMessage(status))  // Output: Status 404: Not Found
//
//    val light = TrafficLight.GREEN
//    println("Action: ${actionForLight(light)}")  // Output: Action: Go
//
//    val role = UserRole.ADMIN
//    println("Role permissions: ${checkPermissions(role)}")  // Output: Role permissions: Has full access
//
//    val currentSeason = Season.SUMMER
//    println("Is it warm? ${isWarmSeason(currentSeason)}")  // Output: Is it warm? true
//
//    val paymentStatus = PaymentStatus.COMPLETED
//    println(updateOrderStatus(paymentStatus))  // Output: Payment completed successfully
//
//    val orderPriority = OrderPriority.HIGH
//    println(getPriorityMessage(orderPriority))  // Output: High priority order
//
//    val paymentMethod = PaymentMethod.PAYPAL
//    println(processPayment(paymentMethod))  // Output: Redirecting to PayPal
//
//    val carModel = CarModel.SUV
//    println(carDescription(carModel))  // Output: The SUV is: A large vehicle with higher ground clearance
//    val today1 = Weekday.WEDNESDAY
//    println("Next day after $today is ${today1.getNextDay()}")  // Output: Next day after WEDNESDAY is THURSDAY
//

   val day1 = Day.SUNDAY
    val day2 = Day.SUNDAY

}
enum class Day{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}
//Kotlin automatically creates one unique object for each value.
//So behind the scenes, you get
//Each of these is a singleton object — there’s only one Day.SUNDAY in the entire program.
open class Day1
object SUNDAY : Day1()
object MONDAY : Day1()
object TUESDAY : Day1()
object WEDNESDAY : Day1()
object THURSDAY : Day1()
object FRIDAY : Day1()
object SATURDAY : Day1()

enum class DayEx(val dayNumber: Int){
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);
    fun printFormattedDay(){
        println("Day is $this")
    }
}

enum class DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
fun isWeekend(day: DayOfWeek): Boolean {
    return day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY
}

enum class HttpStatusCode(val code: Int, val description: String) {
    OK(200, "Success"),
    CREATED(201, "Resource Created"),
    BAD_REQUEST(400, "Bad Request"),
    UNAUTHORIZED(401, "Unauthorized"),
    FORBIDDEN(403, "Forbidden"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error")
}

fun getHttpMessage(statusCode: HttpStatusCode): String {
    return "Status ${statusCode.code}: ${statusCode.description}"
}

enum class TrafficLight(val color: String) {
    RED("Red"),
    YELLOW("Yellow"),
    GREEN("Green")
}

fun actionForLight(trafficLight: TrafficLight): String {
    return when (trafficLight) {
        TrafficLight.RED -> "Stop"
        TrafficLight.YELLOW -> "Prepare to Stop"
        TrafficLight.GREEN -> "Go"
    }
}

enum class UserRole {
    ADMIN, MODERATOR, USER
}

fun checkPermissions(role: UserRole): String {
    return when (role) {
        UserRole.ADMIN -> "Has full access"
        UserRole.MODERATOR -> "Has limited admin access"
        UserRole.USER -> "Has read-only access"
    }
}

enum class Season(val averageTemperature: Int) {
    SPRING(15), SUMMER(30), AUTUMN(20), WINTER(5)
}

fun isWarmSeason(season: Season): Boolean {
    return season.averageTemperature > 20
}

enum class PaymentStatus {
    PENDING, COMPLETED, FAILED
}

fun updateOrderStatus(paymentStatus: PaymentStatus): String {
    return when (paymentStatus) {
        PaymentStatus.PENDING -> "Payment is pending"
        PaymentStatus.COMPLETED -> "Payment completed successfully"
        PaymentStatus.FAILED -> "Payment failed, please try again"
    }
}

enum class OrderPriority(val level: Int) {
    HIGH(1), MEDIUM(2), LOW(3)
}

fun getPriorityMessage(priority: OrderPriority): String {
    return when (priority) {
        OrderPriority.HIGH -> "High priority order"
        OrderPriority.MEDIUM -> "Medium priority order"
        OrderPriority.LOW -> "Low priority order"
    }
}

enum class PaymentMethod {
    CREDIT_CARD, DEBIT_CARD, PAYPAL, CASH_ON_DELIVERY
}

fun processPayment(method: PaymentMethod): String {
    return when (method) {
        PaymentMethod.CREDIT_CARD -> "Processing Credit Card payment"
        PaymentMethod.DEBIT_CARD -> "Processing Debit Card payment"
        PaymentMethod.PAYPAL -> "Redirecting to PayPal"
        PaymentMethod.CASH_ON_DELIVERY -> "Cash on delivery selected"
    }
}

enum class CarModel(val description: String) {
    SEDAN("A small, compact car"),
    SUV("A large vehicle with higher ground clearance"),
    TRUCK("A heavy-duty vehicle for hauling goods")
}

fun carDescription(model: CarModel): String {
    return "The ${model.name} is: ${model.description}"
}

enum class Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    // Function to get the next day
    fun getNextDay(): Weekday {
        return when (this) {
            MONDAY -> TUESDAY
            TUESDAY -> WEDNESDAY
            WEDNESDAY -> THURSDAY
            THURSDAY -> FRIDAY
            FRIDAY -> SATURDAY
            SATURDAY -> SUNDAY
            SUNDAY -> MONDAY
        }
    }
}

