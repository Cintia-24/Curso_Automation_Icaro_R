# language: es

  #@smoke
  Característica: Registro
    Escenario: Como usuario quiero crear una cuenta para poder comprar productos de la página
      Dado que el usuario ingresa a la pagina de Opencart
      Y entra a la página de registro
      Cuando ingresa cada uno de los datos requeridos y presiona continuar
      Entonces debería ingresar a la página de mi cuenta y ver un mensaje de exito


    Esquema del escenario: Crear cuenta parametrizada
      Dado que el usuario ingresa a la pagina de Opencart
      Y entra a la página de registro
      Cuando el usuario se registra con nombre "<nombre>", apellido "<apellido>", email "<email>", telefono "<telefono>", password "<password>"
      Entonces se verifica que la cuenta se creo correctamente

      Ejemplos:
      | nombre | apellido  |  email          | telefono | password |
      | Vanesa | Plata     |vpeerlta@gmail.com | 44244243 | rolio2222 |
      | Jorge  | riuz      |jrueeuz@gmail.com  | 43322234 | cas2a1111 |


  Escenario: Crear cuenta parametrizada
    Dado que el usuario ingresa a la pagina de Opencart
    Y entra a la página de registro
    Cuando el usuario se registra con los siguientes datos
      | nombre | apellido  |  email          | telefono | password |
      | Paula  | Robles    |preeob@gmail.com   | 4421112  | tatao22442 |
      | Esteban| Rivero    |ereeiv@gmail.com   | 4356334  | lalaa1111 |
    Entonces se verifica que la cuenta se creo correctamente




    #Esquema del escenario: Crear cuenta fallido
      #Dado que el usuario ingresa a la pagina de Opencart
      #Y entra a la página de registro
      #Cuando el usuario se registra con nombre "<nombre>", apellido "<apellido>", email "<email>", telefono "<telefono>", password "<password>"
      #Entonces se verifica el mensaje de error "<mensaje>"

      #Ejemplos:
        #| nombre | apellido  |  email          | telefono | password | mensaje |
        #|  | Prado     |cprado@gmail.com | 44244243 | rolio2222 | fallo por nombre  |
        #| Jorge  | Perez     |jperz@gmail.com  |  | casa1111 | fallo por telefono  |
