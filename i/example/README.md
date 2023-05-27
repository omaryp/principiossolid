# principio I -> principio de segregación de interfaces
En el ejemplo <strong>(paquete example/mal)</strong> inicialmente se creo una interfaz Reloj con los métodos de obtener hora, 
al implementarlo en RelojImpl vemos que es una utilidad básica , pero cuando se trata de un
reloj inteligente se necesita agregar dos funcionalidades más en la interfaz reloj , 
pero esto obliga a que todas las clases que implementen esta interfaz usen métodos que no 
utilizan.

La solución para este es segregar las interfaces, crear interfaces de acuerdo a un grupo de
funcionalidades, como ocurre el la paquete <strong>example/bien</strong>
