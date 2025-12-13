package enumAndSealedClasses.sealedclasses

sealed class NetworkResult

object Loading : NetworkResult()
data class Success(val message: String) : NetworkResult()
data class Error(val errorMessage: String) : NetworkResult()

fun handleNetworkResult(result: NetworkResult) {
    when (result) {
        is Loading -> println("Loading...")
        is Success -> println("Success: ${result.message}")
        is Error -> println("Error: ${result.errorMessage}")
    }
}

fun main() {
    val loading = Loading
    val success = Success("Data fetched successfully")
    val error = Error("Network failure")

    handleNetworkResult(loading)
    handleNetworkResult(success)
    handleNetworkResult(error)
}
