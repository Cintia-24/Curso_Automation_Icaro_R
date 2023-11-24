# language: es

Característica: Agregar a Favoritos
  Como usuario quiero agregar a Favoritos un producto para luego comprarlo.
      Escenario: Agregar un producto a Favoritos
        Dado que el usuario se encuentra en la pagina del producto que desea
        Cuando hace click en el boton de Agregar a Favoritos
        Entonces deberia validar que el producto se agrego a Favoritos