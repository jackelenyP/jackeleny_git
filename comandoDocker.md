# DOCKER

## sacar imagenes 
> docker images

## images solo por id
> docker images -q

## eliminar docker, por id y completo
> docker rmi afstsgtsg
> docker rmi $(docker images -q)

## Para instalar el sonarqube
> docker pull sonarqube

## version de sonarqube
> docker --version

## sacar todas los contenedores del docker
> docker container list --all


## docker commands list help
Commands:
  attach      Attach local standard input, output, and error streams to a running container
  commit      Create a new image from a container's changes
  cp          Copy files/folders between a container and the local filesystem
  create      Create a new container
  diff        Inspect changes to files or directories on a container's filesystem
  exec        Run a command in a running container
  export      Export a container's filesystem as a tar archive
  inspect     Display detailed information on one or more containers
  kill        Kill one or more running containers
  logs        Fetch the logs of a container
  ls          List containers
  pause       Pause all processes within one or more containers
  port        List port mappings or a specific mapping for the container
  prune       Remove all stopped containers
  rename      Rename a container
  restart     Restart one or more containers
  rm          Remove one or more containers
  run         Run a command in a new container
  start       Start one or more stopped containers
  stats       Display a live stream of container(s) resource usage statistics
  stop        Stop one or more running containers
  top         Display the running processes of a container
  unpause     Unpause all processes within one or more containers
  update      Update configuration of one or more containers
  wait        Block until one or more containers stop, then print their exit codes
  
  
  ## INSTALACION DE SONARQUBE
  
  #Transformamos  en rooy (superusuario)
  > sudo su -
  
  # Un avez somos root, configuramos algunos variables que hacen falta en la maquina 
    sysctl -w vm.max_map_count=262144
    sysctl -w fs.file-max=65536
    ulimit -n 65536
    ulimit -u 4096
    
    # Dejo de ser root
    > exit
  
  # descarga imagen, crea contenedor llamado MISONARQUBE, se cambia el puerto por que amazon solo deja ejecutar 8080,8081,8082
  > docker run -d --name misonarqube -e SONAR_ES_BOOTSTRAP_CHECKS_DISABLE=true -p 8080:9000 sonarqube:latest