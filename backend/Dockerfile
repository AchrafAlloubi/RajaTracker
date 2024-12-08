# Utiliser une image de base OpenJDK
FROM openjdk:17

# Définir le répertoire de travail
WORKDIR /app

# Copier le fichier JAR de l'application
COPY target/backend-raja-tracker-0.0.1-SNAPSHOT.jar app.jar

# Exposer le port 8080
EXPOSE 8080

# Démarrer l'application Java
CMD ["java", "-jar", "app.jar"]