# Demo app with composite design patterm

Demo to manager project App which elements of a composite pattern can be represented as a project structure.



## Installation

create a image docker from app

```bash
docker build -t jsn-composite .
```

this command execute image docker from app and do the setting to allow the communication to  with system outside from docker container

```bash
docker run --net=host -p 8080:8080 jsn-composite
```
