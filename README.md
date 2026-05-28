# SauceDemo Automation Framework 🚀

Este proyecto es un ecosistema de automatización de pruebas robusto y escalable diseñado para la plataforma **SauceLabs (SauceDemo)**. Utiliza el patrón de diseño **Page Object Model (POM)** y está optimizado para ejecutarse de manera local o en servidores de Integración Continua (CI/CD) como Jenkins.

---

## 🛠️ Tecnologías y Herramientas Utilizadas

El framework está construido sobre el ecosistema de Java y automatización moderna:

* **Lenguaje de Programación:** Java 21
* **Herramienta de Construcción:** Apache Maven 3.9.x
* **Framework de Pruebas:** TestNG 7.9.0 (Manejo de Suites, Asserts y Flujos)
* **Herramienta de Automatización:** Selenium WebDriver 4.43.0
* **Gestión de Drivers:** Selenium Manager Nativo / WebDriverManager
* **Reportes y Utilidades:** Apache Commons IO & TestNG Listeners

---

## ✨ Características Principales (Features)

* **Page Object Model (POM):** Separación limpia entre la lógica del negocio de las páginas (`BasePage`, `LoginPage`, `CartPage`) y la lógica de los scripts de prueba.
* **Clase Base de Páginas Centralizada:** Envoltorios personalizados (`Wrappers`) para métodos comunes como `click()`, `writeText()` e `isElementDisplayed()`, reduciendo la duplicación de código y aislando excepciones.
* **Capturas de Pantalla Automáticas:** Implementación de un `BaseListener` (`ITestListener`) que detecta fallos en tiempo real mediante Reflexión de Java y guarda capturas `.png` automáticamente en `target/screenshots/`.
* **Manejo Dinámico de Parámetros:** Lector de archivos de configuración (`.properties`) para centralizar URLs, credenciales y variables de entorno de forma segura.
* **Pruebas Estables (Anti-Flakiness):** Uso de esperas explícitas (`WebDriverWait`) e implícitas para soportar cargas dinámicas en el DOM.

---

## 🧪 Cobertura de Pruebas (Test Coverage)

Actualmente, el framework cubre los flujos críticos de la plataforma de e-commerce:

| Módulo | Tipo de Prueba | Descripción | Estado |
| :--- | :--- | :--- | :--- |
| **Autenticación** | Funcional / Negativo | Login exitoso con usuarios estándar y validación de manejo de errores de credenciales. | 🟢 Completado |
| **Carrito de Compras**| Funcional / UI | Validación de adición múltiple de productos y persistencia del contador del carrito. | 🟢 Completado |
| **Remoción de Ítems** | Funcional / DOM | Verificación de desaparición real de elementos del carrito al presionar el botón *Remove*. | 🟢 Completado |
| **Flujo de Checkout** | End-to-End (E2E) | Compra completa desde el carrito, ingreso de metadatos de envío y pantalla final de éxito. | 🟢 Completado |

---

## 🚀 Ejecución de Pruebas con Maven

Para ejecutar el set de pruebas completo desde tu terminal local (o desde el pipeline de Jenkins), asegúrate de estar en la raíz del proyecto y ejecuta el siguiente comando:

```bash
mvn clean test
