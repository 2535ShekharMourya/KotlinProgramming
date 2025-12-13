package enumAndSealedClasses.sealedclasses

sealed class FileSystemItem

data class File(val name: String, val size: Int) : FileSystemItem()
data class Directory(val name: String, val contents: List<FileSystemItem>) : FileSystemItem()

fun printFileSystemStructure(item: FileSystemItem, indent: String = "") {
    when (item) {
        is File -> println("$indent- File: ${item.name} (Size: ${item.size}KB)")
        is Directory -> {
            println("$indent- Directory: ${item.name}")
            item.contents.forEach { printFileSystemStructure(it, indent + "  ") }
        }
    }
}

fun main() {
    val file1 = File("file1.txt", 20)
    val file2 = File("file2.txt", 30)
    val subDirectory = Directory("SubDirectory", listOf(file1))
    val rootDirectory = Directory("RootDirectory", listOf(file2, subDirectory))

    printFileSystemStructure(rootDirectory)
}
