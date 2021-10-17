import kotlin.random.nextInt

fun main() {
    import kotlin.random.Random
            import kotlin.random.nextInt
            import kotlin.reflect.KFunction1

    fun main() {
        runSimulation()
    }
    var runsimulation("Guyal",greetingfunction)

    fun runSimulation() {
        val greetingFunction = configureGreetingFunction()
        println(greetingFunction("Guyal"))
        println(greetingFunction("Guyal"))
    }
    fun configureGreetingFunction(): (String) -> String {
        val structureType = "hospitals"
        var numBuildings = 5
        return { playerName: String ->
            val currentYear = 2018
            numBuildings += 1
            println("Adding $numBuildings $structureType")
            "Welcome to SimVillage, $playerName! (copyright $currentYear)"
        }
    }
    fun printConstructionCost(numBuildings: Int) {
        val cost = 500
        println("construction cost: ${cost * numBuildings}")
    }

}