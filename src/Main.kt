fun main() {

    /**
     * Pairs in Kotlin

    val coordinates = Pair(3, 5)
    println(coordinates.first)
    println(coordinates.second)

    /** Alternate way of creating pairs in kotlin
     **/

    val coordinates_two = 3 to 5
    println(coordinates_two.first)
    println(coordinates_two.second)

    /** Another Approach
     * **/
    val (x, y) = coordinates;
    println(x)
    println(y)


    /**Triples in kotlin **/

    val coordinates3D = Triple(2,4,5)
    println(coordinates3D.first)
    println(coordinates3D.second)
    println(coordinates3D.third)

    val( p,q, r) = coordinates3D;
    println(p)
    println(q)
    println(r)

    /** FUZZ BUZZ using if-else condition */
    // multiple of 3 then write FIzz
    // multiple of 5 then write BUZZ
    // multiple of 3 and 5 then write Fizz and Buzz

    val number: String;
    number = readLine().orEmpty();
    var num  = number.toInt();

    if(num % 3 ==0){
        println("FIZZ")
    }
    else if(num % 5 == 0){
        println("BUZZ")
    }
    else if(num % 3 ==0 && num % 5 == 0){
        println("FIZZ BUZZ ")
    }

    /** Ranges */

    val closedRange = 0..5
    //Closed Range because 0 and 5 both are barred from the range

    for(index in closedRange){
        println(index)
    }

    val halfOpenRange = 0 until  5
    // 0 1 2 3 4 not including 5

    val decreasingRange = 5 downTo  0

    for(index in decreasingRange){
        println(index)
    }
*/

    /** Array */
    val myArray  = arrayOfNulls<String>(4)
    myArray[0] = "James"
    myArray[1] = "Lars"
    myArray[2] = "Kirk"

    println(myArray[1])

    val myNumberArray = intArrayOf(10,20,30,40)
    println(myNumberArray.get(1))
    println(myNumberArray.size)
   myNumberArray.set(1,44)
    println(myNumberArray.get(1))


    /** LISTS */
    //we dont have any limited capacity in Lists
    val myMusicians  = ArrayList<String>()
    myMusicians.add("James")
    myMusicians.add("Lawrs")

    println(myMusicians)
    myMusicians.add(1,"kritk")
    println(myMusicians)

    println(myMusicians.size)
    println(myMusicians.lastIndex)

    /** SETS */
    //Each number needs to be unique in the sets
    // This is not the case with List

    val mySet  = HashSet<String>()
    mySet.add("RAHUL")
    mySet.add("aman")
    mySet.add("RAHUL")

    println(mySet)
    println(mySet.size)


    /** MAPS **/
    val myHashMap  = HashMap<String,String>()
    myHashMap.put("name","James")
    myHashMap.put("Instrument","Guitar")

    println(myHashMap["Instrument"])
    println(myHashMap["name"])
    println(myHashMap.keys)
    println(myHashMap.values)
    println(myHashMap.entries)
    println(myHashMap.size)

    /** SWITCH WHEN */
     val day = 1
     var dayString = " "
    dayString = when(day){
        1 -> " MONDAY "
        2 -> " TUESDAY "
        3 -> " WEDNESDAY"
        4 -> " Thursday"
        5 -> " FRIDAY"
        else -> "Sunday "
    }

    println(dayString)

    /** LOOPS */

    val myNumbers = intArrayOf(12,33,54,65,643,432,443)
    val q = myNumbers[0]/3 * 5
    println(q)

    println("FOR LOOP")
    for (number in myNumbers){
        val z = number/3 * 5
        println(z)
    }

    println("FOR LOOP INDICES ")
    for(i in myNumbers.indices){
        val y  = myNumbers[i]/3 * 5
        println(y)
    }

    println("FOR Loop another approach")
    for(i in 0..9){
        println(i)
    }

    /** WHILE LOOP */
    println("WHILE LOOP")

    var  j  = 0
    while(j<10){
        val t = j*10/5*12
        println(t)
        j++
    }


}
