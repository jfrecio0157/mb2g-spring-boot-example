# mb2g-spring-boot-example
Ejemplo de spring boot

Se crean dos modulos web-app y web-model.
El web-app es el modulo de arranque de la aplicacion, al que se trasladan las dependencias del pom.xml del root y las carpetas src y test. Se incluye tambien la dependencia al web-model
El web-model en su pom.xml se añaden las depencias para el JSON

En el web-model se crea la clase ShippingAddress desde un JSON (src-> main -> resources -> schema -> shipping.address.json)
En el web-app, se crea la clase ExampleController (src -> main -> java -> com.example.springboot -> controller) en el que se crea el metodo getShippingAddress para devolver un ShippingAddress

