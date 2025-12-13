package enumAndSealedClasses.sealedclasses

sealed class ApiResponse

//data class Success(val data: String) : ApiResponse()
//data class Error(val errorMessage: String) : ApiResponse()
//data class Loading(val progress: Int) : ApiResponse()
//
//fun handleApiResponse(response: ApiResponse) {
//    when (response) {
//        is Success -> println("Success: ${response.data}")
//        is Error -> println("Error: ${response.errorMessage}")
//        is Loading -> println("Loading: ${response.progress}%")
//    }
//}
//
//fun main() {
//    val successResponse = Success("Data fetched successfully.")
//    val errorResponse = Error("Failed to fetch data.")
//    val loadingResponse = Loading(50)
//
//    handleApiResponse(successResponse)
//    handleApiResponse(errorResponse)
//    handleApiResponse(loadingResponse)
//}
