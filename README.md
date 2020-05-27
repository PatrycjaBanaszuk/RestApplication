zbudowanie  imagea aplikacji z uzyciem DockerFile
docker build -t patka/patka-development .

wystartowanie bazy danych za  pomoca dockera
docker-compose -f mysql.yml up --build



### Docker TAG ###
docker tag patka/patka-development benexcompany/benyrepo:patka-development

### Docker Hub Build ###
docker rmi benexcompany/benyrepo:patka-development

docker build -t benexcompany/benyrepo:patka-development .

### PUSH ###
docker push benexcompany/benyrepo:patka-development

### CLEAN ###
-- to czysci wszytkie contenery i image
docker kill $(docker ps -q)
docker rm $(docker ps -a -q)
docker rmi $(docker images -q)

docker stop benexcompany/benyrepo:patka-development
docker rm benexcompany/benyrepo:patka-development
docker rmi benexcompany/benyrepo:patka-development

### PULL ###
docker pull benexcompany/benyrepo:patka-development

### RUN ###
docker run --restart=always --name benexcompany/benyrepo:patka-development -p 8091:8091 -e environment=dev -d benexcompany/benyrepo:patka-development

 ToDo: logowanie do plikow
 ToDo: scheduler
 ToDo: service to service 
