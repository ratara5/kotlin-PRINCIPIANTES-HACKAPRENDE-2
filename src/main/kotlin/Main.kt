fun main(args: Array<String>) {
    //14
    val totalEpisodes=3

    if(totalEpisodes==1){
        println("Play a movie")
    }else if(totalEpisodes>1){
        println("Play a series")
    }else{
        println("Error, totalEpisodes=0")
    }

    //15
    if(totalEpisodes==1){
        println("Play a movie")
    }else if(totalEpisodes>1 && totalEpisodes<=5){
        println("Play a miniseries")
    }else if(totalEpisodes>5){
        println("Play a series")
    } else{
        println("Error, totalEpisodes=0")
    }

    //16
    var dayOfWeek=3
    when (dayOfWeek) {
        1->{ // solo una linea, se pueden quitar los corchetes
            print("Comedy Monday")
        }
        2->{
            print("Drama Tuesday")
        }
        3->{
            print("Family Wednesday")
        }
        4->{
            print("Animated Thursday")
        }
        5->{
            print("Romance Friday")
        }
        6-> {
            print("Documentary Saturday")
        }
        7->{
            print("Wildcard Sunday")
        }
        else->{
            print("Wrong selection")
        }
    }

    //17
    println("")
    println("For cycle")
    val duration=10

    for(i in 0..duration){
        println("Play min $i")
    }

    for(i in 0 until duration+1 step 2){
        println("Play min $i")
    }
    println("")

    //18
    println("While cycle")
    var minutes=0
    while(minutes<=duration){
        println("Play min $minutes")
        minutes++
    }
    minutes=0
    println("")
    println("Do while cycle")
    do{
        println("Play min $minutes")
        minutes++
    }while(minutes<=duration)
}