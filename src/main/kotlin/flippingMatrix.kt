/*
 * Complete the 'flippingMatrix' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
 */

fun flippingMatrix(matrix: Array<Array<Int>>): Int {
    // Write your code here

    //Flipping the column before the last one
    for(i in matrix.size -1 downTo 0){
        //println("i is $i")
        for(j in i downTo 0){
           // println("j is $j")
           val temp = matrix[i][2]
            matrix[i][2]=matrix[j][2]
          //  println("matrix[$i][2] is ${matrix[i][2]}")
            matrix[j][2] = temp
          //  println("matrix[$j][2] is ${matrix[j][2]}")
        }
    }

    //Flipping the first row
    for(i in matrix.size -1 downTo 0){
      //  println("i is $i")
        for(j in i downTo 0){
          //  println("j is $j")
            val temp = matrix[0][i]
            matrix[0][i]=matrix[0][j]
         //   println("matrix[0][$i] is ${matrix[0][i]}")
            matrix[0][j] = temp
         //   println("matrix[0][$j] is ${matrix[0][j]}")
        }
    }

    // Sum of lift quad

    var sumA:Int= 0
    for(i in 0 until 2){
        for(j in 0 until 2){
            sumA+= matrix[i][j]
        }
    }
  //  println(matrix.toList())
    return sumA
}

fun main(args: Array<String>) {
    // Enter the number of matrices
    val q = readLine()!!.trim().toInt()

    for (qItr in 1..q) {
        // Enter the size of the matrix
        val n = readLine()!!.trim().toInt()
        // The entry of array of array
        val matrix = Array<Array<Int>>(2 * n, { Array<Int>(2 * n, { 0 }) })

        for (i in 0 until 2 * n) {
            matrix[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
        }

        val result = flippingMatrix(matrix)

        println(result)
    }
}
