FROM node:12-alpine3.14
WORKDIR /app
COPY . /app
RUN npm install 
EXPOSE 3000
