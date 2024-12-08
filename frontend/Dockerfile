# Utiliser une image de base Node.js
FROM node:14

# Définir le répertoire de travail
WORKDIR /app

# Copier les fichiers package.json et package-lock.json
COPY package*.json ./

# Installer les dépendances
RUN npm install

# Copier le reste des fichiers de l'application
COPY . .

# Construire l'application Angular
RUN npm run build

# Exposer le port 4200
EXPOSE 4200

# Démarrer l'application Angular
CMD ["npm", "start"]