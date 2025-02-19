# 🏎️ Simulación de una carrera entre dos coches 🏁

## 📄 Descripción del Proyecto

Este proyecto es una aplicación de consola que simula una carrera entre dos coches, un coche deportivo y un coche familiar, en el circuito de Spa-Francorchamps, Bélgica. Los coches compiten para ver quién puede recorrer una distancia total de 230 km (distancia elegida de manera totalmente arbitraria) en el menor número de vueltas posible. El proyecto está desarrollado en Java y utiliza una estructura de clases para representar los coches y la carrera.

## 📂 Estructura y características del Proyecto 

El proyecto está compuesto por los siguientes archivos y paquetes:

- `src/Entrada.java`: Contiene el método `main` que inicia la carrera.
- `src/controller/Carrera.java`: La clase `Carrera` gestiona la carrera entre dos coches, incluyendo la lógica para acelerar los coches, comparar sus distancias recorridas y determinar el ganador.
- `src/model/Coche.java`: La clase `Coche` representa un coche con atributos como piloto, marca, modelo, caballos de fuerza (cv), cilindrada (cc), matrícula, velocidad y kilómetros recorridos. También incluye una lista para almacenar las velocidades alcanzadas en cada aceleración. Todos estos datos pueden ser llamados y modificados si se desea mediante los métodos setter y getter implementados.

## ⚙️ Funcionamiento

1. **Inicio de la Carrera**: La carrera comienza con la creación de dos objetos `Coche`, uno deportivo y uno familiar.
2. **Aceleración**: Los coches aceleran en cada vuelta, y sus velocidades se almacenan en una lista.
3. **Comparación**: Se comparan las distancias recorridas por los coches en cada vuelta hasta que uno de ellos alcanza o supera la distancia total de 230 km.
4. **Resultados**: Al final de la carrera, se muestra el ganador y un desglose del rendimiento de los coches, incluyendo la velocidad media tras cada aceleración y los kilómetros recorridos.

### 🛠️ Proyecto realizado por Lucas Pardo
