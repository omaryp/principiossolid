# principio O -> abierto cerrado
En este caso vemos que se ha creado una interfaz para colocar la funcionalida base,
luego se creó la clase Coche para implementar dicha funcionalidad. Pero cuando se necesita nueva funcionalidad
como es el caso de CocheElectrico no se modificó la interfaz ni la clase Coche en su lugar se creo una clase
implementando la interfaz y agegando la nueva funcionalidad sin modificar las entidades iniciales, eso es el 
principio de abierto cerrado.

*** Se recuerda que este principio, en el caso de java, se puede implementar ya sea con interfaces ó clases abstractas

*** Cerrada para modificaciones, abierta para ampliaciones