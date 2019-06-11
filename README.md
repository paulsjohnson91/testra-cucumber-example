use a docker-compose file with something like the following:

testra_web:
    image: testra/testra-web
    container_name: testra-web
    restart: always
    ports:
    - 8001:80
    links:
    - testra_api
    environment:
    - TESTRA_API_URL=http://localhost:8082/api/v1

testra_api:
    image: testra/testra-api:1.0-m1
    container_name: testra-api
    restart: always
    ports:
      - 8082:8080
    links:
      - mongo

mongo:
    image: vepo/mongo
    container_name: testra-mongo
    restart: always
    ports:
    - 27017:27017
    volumes:
    - /var/data/testra-mongo-data:/data/db
    - /var/data/testra-mongo-bkp:/data/bkp
    environment:
    - AUTH=yes
    - ADMIN_USER=admin
    - ADMIN_PASS=admin
    - APPLICATION_DATABASE=testra
    - APPLICATION_USER=testra
    - APPLICATION_PASS=password