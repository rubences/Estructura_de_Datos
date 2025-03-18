Caso Final Integrador: Misión Espacial Cronos

Contexto: Los alumnos son parte de un equipo de científicos y programadores en una misión espacial llamada "Cronos". La misión tiene como objetivo establecer una base en un nuevo planeta. Los estudiantes deben desarrollar un sistema de software integral que asista en la planificación, establecimiento, y mantenimiento de la base. Este sistema debe ser capaz de manejar tiempos precisos, calcular recursos, comunicarse con la Tierra, y asegurar la supervivencia y eficiencia de la base.

Descripción del Proyecto: El software desarrollado deberá integrar los siguientes módulos basados en los ejercicios propuestos:

Cronómetro Cósmico: Crear un sistema que calcule y muestre el tiempo en segundos, minutos, horas, días, y años en la Tierra, y lo convierta al equivalente en el nuevo planeta. Además, debe determinar y visualizar los mayores valores representables para diferentes tipos de datos en este entorno único.

Recursos y Suministros: Desarrollar un programa que calcule la cantidad y ritmo de consumo de recursos (como agua, comida, oxígeno) basado en múltiplos de 5 (días, semanas, meses). Incluir funcionalidades para calcular la media, mínimo, y máximo de recursos consumidos en diferentes periodos.

Sistema de Alerta y Monitoreo: Implementar un sistema que monitoree constantemente factores críticos como niveles de radiación, temperatura, y presión. Debe alertar a la tripulación sobre valores extremos y sugerir ajustes. Integrar una función que identifique y liste los N primeros eventos raros o críticos (números primos como metáfora de rareza). Además, descomponer problemas complejos (factores primos) para simplificar la toma de decisiones.

Planificador de Tareas: Un sistema que organice y distribuya las tareas diarias de cada miembro de la tripulación. Debe incluir la visualización de tablas de tareas (tablas de multiplicar como metáfora) y calcular la carga de trabajo óptima (producto escalar) para cada miembro.

Navegador Estelar: Diseñar un módulo para calcular y visualizar rutas de exploración y expansión de la base. Utilizar matrices para representar el terreno y planificar construcciones. Implementar una función que multiplique matrices para optimizar rutas y recursos.

Comunicador Interplanetario: Establecer un sistema de comunicación que analice y traduzca mensajes entre la Tierra y la base. Debe contar con funciones para contar vocales (como metáfora de señales importantes), invertir mensajes (descifrar códigos), y verificar la integridad de los mensajes (determinar si son palíndromos).


Módulos del Sistema:

Cronómetro Cósmico:

Funcionalidades:

Conversión de tiempo entre la Tierra y el nuevo planeta basado en su ciclo diario y anual.

Visualización del tiempo en varios formatos, ajustándose a las necesidades de los astronautas.

Identificación de los límites de representación de datos para evitar errores en cálculos críticos.

Aplicación de Conceptos:

Uso de variables de diferentes tipos para minimizar el uso de memoria.

Funciones para cálculos de conversión de tiempo.

Análisis de límites de datos en un contexto espacial.

Recursos y Suministros:

Funcionalidades:

Cálculo del consumo de recursos vitales y predicción de necesidades futuras.

Alertas cuando los niveles de recursos caen por debajo de un umbral seguro.

Estadísticas sobre el uso de recursos para mejorar la planificación.

Aplicación de Conceptos:

Iteración y cálculos sobre rangos y múltiplos para estimar consumos.

Funciones que devuelven arrays con proyecciones y estadísticas.

Uso de operaciones matemáticas básicas y estructuras de control.

Sistema de Alerta y Monitoreo:

Funcionalidades:

Monitoreo constante de variables ambientales críticas.

Identificación y notificación de eventos raros o críticos.

Descomposición de problemas complejos en factores más manejables.

Aplicación de Conceptos:

Algoritmos para detectar números primos y otros patrones inusuales.

Descomposición en factores primos para análisis simplificados.

Manejo de arrays y bucles para monitoreo constante.

Planificador de Tareas:

Funcionalidades:

Distribución automática y optimización de tareas diarias.

Visualización de horarios y cargas de trabajo.

Ajustes en tiempo real basados en el rendimiento y disponibilidad de la tripulación.

Aplicación de Conceptos:

Generación de tablas y matrices para representar horarios y tareas.

Cálculo de producto escalar para asignar eficientemente las tareas.

Algoritmos de optimización para balancear la carga de trabajo.

Navegador Estelar:

Funcionalidades:

Planificación de rutas y construcciones en la superficie del planeta.

Simulación de terrenos y obstáculos mediante matrices.

Optimización de rutas para conservar recursos y tiempo.

Aplicación de Conceptos:

Uso de matrices para representar y manipular datos espaciales.

Algoritmos de multiplicación de matrices para planificación de rutas.

Técnicas de simulación y visualización de datos.

Comunicador Interplanetario:

Funcionalidades:

Análisis y traducción de mensajes entre la Tierra y la base.

Verificación de la integridad y relevancia de la comunicación recibida.

Interfaz amigable para que la tripulación envíe y reciba mensajes fácilmente.

Aplicación de Conceptos:

Funciones para el conteo y análisis de caracteres específicos.

Algoritmos para revertir y verificar palíndromos en textos.

Manejo avanzado de strings y estructuras de datos para almacenamiento de mensajes.


Entregables: Los estudiantes presentarán un software que integre todos los módulos mencionados, con una interfaz que permita a los usuarios interactuar con cada funcionalidad. Deben demostrar cómo cada módulo contribuye al funcionamiento y éxito de la misión Cronos. Además, deberán presentar un informe detallado que describa el propósito, diseño, y funcionamiento de cada módulo, junto con los desafíos encontrados y cómo los superaron.


Software Integral: Un programa que integre todos los módulos mencionados con una interfaz unificada que permita a los usuarios acceder a cada funcionalidad de manera intuitiva y eficiente.

Informe de Proyecto: Documentación detallada que incluya:

Descripción de cada módulo y su propósito dentro de la misión.

Explicación de los algoritmos y estructuras de datos utilizados.

Desafíos encontrados durante el desarrollo y cómo se resolvieron.

Instrucciones de uso y casos de prueba para demostrar la funcionalidad.

Objetivos de Aprendizaje:

Aplicar conocimientos de algoritmos y estructuras de datos para resolver problemas complejos y reales.

Desarrollar habilidades de integración de sistemas y pensamiento crítico.

Fomentar la creatividad en la aplicación de conceptos de programación a escenarios no convencionales.

Mejorar habilidades de trabajo en equipo, comunicación, y presentación.

Esta misión espacial ficticia proporciona un contexto atractivo y complejo que requiere una comprensión profunda y aplicación de algoritmos y estructuras de datos, incentivando a los estudiantes a pensar más allá del aula y a vincular sus conocimientos con problemas del mundo real.

A continuación, se proporcionan sugerencias específicas para integrar pruebas unitarias y manejo de excepciones en los distintos módulos del proyecto:

Cronómetro Cósmico
Pruebas Unitarias:

Verificar la correcta conversión de unidades de tiempo entre la Tierra y el nuevo planeta.
Asegurar que los límites de representación de datos sean respetados para evitar overflow o underflow.
Captura de Excepciones:

Manejar excepciones para cálculos que excedan los límites de representación de datos.
Recursos y Suministros
Pruebas Unitarias:

Comprobar que el cálculo de consumo de recursos es correcto para múltiples intervalos de tiempo.
Validar que las alertas se activan correctamente cuando los niveles de recursos caen por debajo de los umbrales seguros.
Captura de Excepciones:

Prever y manejar casos en los que la entrada de datos sea incorrecta o insuficiente.
Sistema de Alerta y Monitoreo
Pruebas Unitarias:

Testear la detección y notificación de eventos raros o críticos basados en algoritmos específicos.
Asegurar que la descomposición de problemas complejos en factores más manejables sea correcta.
Captura de Excepciones:

Implementar manejo de excepciones para situaciones de monitoreo donde los datos sean anómalos o falten.
Planificador de Tareas
Pruebas Unitarias:

Verificar la correcta asignación y distribución de tareas diarias entre los miembros de la tripulación.
Asegurar que los cálculos de carga de trabajo se realicen adecuadamente.
Captura de Excepciones:

Manejar excepciones relacionadas con la asignación de tareas a miembros no disponibles o inexistentes.
Navegador Estelar
Pruebas Unitarias:

Probar la correcta generación y optimización de rutas de exploración y expansión.
Validar la adecuada representación del terreno y la planificación de construcciones.
Captura de Excepciones:

Prever errores en los cálculos de matrices, especialmente en la multiplicación de matrices para optimizar rutas.
Comunicador Interplanetario
Pruebas Unitarias:

Confirmar que el análisis y traducción de mensajes se realiza correctamente.
Testear la verificación de la integridad de los mensajes, incluyendo la detección de palíndromos.
Captura de Excepciones:

Implementar manejo de excepciones para errores en la decodificación o en la integridad de los mensajes.
Implementación General de Pruebas y Manejo de Excepciones
Para cada módulo, se deben desarrollar clases de prueba usando JUnit 5 que contengan métodos de prueba para cada funcionalidad importante. Estas pruebas deben ser capaces de ejecutarse automáticamente y verificar que tanto la lógica de negocio como el manejo de errores funcionen como se espera.

El manejo de excepciones debe ser implementado de manera que el sistema pueda recuperarse de errores inesperados, proporcionando mensajes claros al usuario o tomando acciones correctivas sin detener completamente la operación del sistema