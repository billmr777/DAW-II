# Proyecto: Servidor de Aplicaciones Tomcat

## Grado de completitud
- Secciones completadas:
  - Instalación y configuración de Tomcat en Windows y Linux
  - Configuración de usuarios y roles en `tomcat-users.xml`
  - Despliegue de la aplicación Sample.war
  - Configuración de HTTPS con certificado SSL
  - Integración con IDE (VS Code / Community Server Connectors)
  - Cuestiones teóricas sobre versiones, otros servidores, carga y monitorización

- Secciones con posibles dudas:
  - Integración exacta con Visual Studio Community en Linux, dado que no existe la versión completa de VS Community en Linux; se utilizó VS Code con Community Server Connectors como alternativa funcional.
  - Configuración avanzada de SSL en Tomcat 11 puede requerir ajustes menores según la versión de Java y permisos del keystore.

---

## Accesibilidad del ejercicio
- En general, los ejercicios fueron **accesibles**.
- Me permitió comprender:
  - Cómo instalar y configurar Tomcat en Windows y Linux.
  - Cómo gestionar usuarios y roles para Manager/Host Manager.
  - Cómo desplegar aplicaciones `.war` y habilitar HTTPS.
  - Cómo integrar Tomcat con un IDE y realizar depuración remota.
  - Herramientas de carga y monitorización de rendimiento.
- El ejercicio refuerza la comprensión del **funcionamiento básico de un servidor de aplicaciones**, su gestión y despliegue de aplicaciones web Java.

---

## Observaciones
- Tomcat 11 requiere el uso de `<SSLHostConfig>` para HTTPS, diferente de versiones anteriores.
- VS Code con Community Server Connectors funciona como alternativa a Visual Studio Community en Linux para gestionar Tomcat.
- Algunas configuraciones pueden variar ligeramente según la versión de Java y el sistema operativo.

---

## Repositorio
> Este proyecto aún no está subido a GitHub. Se puede crear un repositorio propio y añadir todos los scripts, configuraciones (`server.xml`, `tomcat-users.xml`), archivos `.war` y este `readme.md`.

