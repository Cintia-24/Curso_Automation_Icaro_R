# language: es

  Característica: Login

    Escenario: Login exitoso
      #Dado que el usuario ingresa al login(puede reemplazar los dos pasos que siguen debajo)
      Dado que el usuario ingresa a la pagina de Opencart
      Y el usuario ingresa al login
      Cuando el usuario ingresa credenciales validas
      Entonces se valida que el usuario se encuentra en su cuenta