fun main(){
val coche1 = Coche("ABC","18h30","19h30")
val coche2 = Coche ("ABD","18h45","20h")
//Inicializo 2 objetos de tipo Coche para el primer aparcamiento usando el constructor, uso val porque no voy a variarlos
val aparcamiento1 = Aparcamiento("Parking 123",20,18,coche1,coche2)
//Inicializo 1 objeto de tipo Aparcamiento usando el constructor
val coche3 = Coche("BCD","21h39","22h05")
val coche4 = Coche("CCD","21h50","22h10")
val aparcamiento2 = Aparcamiento("Parking 1234",50,48,coche3,coche4)
//Repito las 2 acciones anteriores para el siguiente aparcamiento
println("${aparcamiento1.nombre} tiene ${aparcamiento1.plazasTotales} plazas totales de las cuales " +
        "${aparcamiento1.plazasLibres} están libres y tiene los coches de matriculas ${aparcamiento1.Coche1.matricula} " +
        "y ${aparcamiento1.Coche2.matricula}")
println("${aparcamiento2.nombre} tiene ${aparcamiento2.plazasTotales} plazas totales de las cuales " +
        "${aparcamiento2.plazasLibres} están libres y tiene los coches de matriculas ${aparcamiento2.Coche1.matricula} " +
        "y ${aparcamiento2.Coche2.matricula}")
//Muestro los aparcamientos por pantalla con su nombre, plazasTotatel, plazasLibres y las matriculas de los Coches que tienen
}