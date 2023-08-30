# FutureH - Drone Feeder

Seja muito bem-vindo!! Aqui você vai ter a oportunidade de conhecer a última novidade implementada pela FutureH, a entrega por drones, não, você não ouviu errado,
veja mais abaixo sobre o desenvolvimento do backend Drone Feeder que é essencial para que esse novo serviço seja possível!!

<br />

# Subindo com docker-compose 🐳

obs: aplique o comando na raiz do projeto! Lembre-se de conferir se as portas 8080 e 3306 estão disponíveis para o uso!

```
docker-compose up -d
```

<br />

# Rotas 🌐

**Rota para ler o drone e suas respectivas entregas (GET):**

```
http://localhost:8080/drone
```

Exemplo de retorno: 

```
[
    {
        "id": 1,
        "model": "TCR-352",
        "deliveries": [
            {
                "id": 1,
                "video": "src/main/video.mp4",
                "deliveryDate": "2023-08-30T15:40:35",
                "deliveryCep": "03859078",
                "deliveryNumber": 258
            }
        ]
    }
]
```

<hr />

**Rota para criar um drone (POST):**

```
http://localhost:8080/drone
```

Exemplo corpo da requisição:

```
{
    "model": "KPC-356"
}
```


Retorno: status 201 (created)


<hr />

**Rota para atualizar um drone (PUT):**

obs: 1 se refere ao id do drone que será atualizado.

```
http://localhost:8080/drone/1
```

Exemplo corpo da requisição: 

```
{
    "model": "DDL-142"
}
```

Retorno: status 200 (ok)

<hr />

**Rota para deletar um drone (DELETE):**

obs: 1 se refere ao id do drone que será deletado.

```
http://localhost:8080/drone/1
```

Retorno: status 200 (ok)

<hr />

**Rota para criar uma delivery (POST):**

```
http://localhost:8080/delivery
```

Exemplo corpo da requisição: 

```
{
    "droneId": 1,
    "cep": "03859078",
    "number": 258
}
```

Retorno: status 201 (created)

<hr />

**Rota para ler as deliveries (GET):** 

```
http://localhost:8080/delivery
```

Exemplo de retorno: 

```
[
    {
        "id": 1,
        "video": src/main/video.mp4,
        "deliveryDate": "2023-08-30T17:20:53",
        "drone": {
            "id": 1,
            "model": "DDL-142"
        },
        "deliveryCep": "03859078",
        "deliveryNumber": 258
    }
]
```


<hr />

**Rota para atualizar a delivery (PUT):**

obs: o 1 se refere ao id da delivery que está sendo atualizada.

```
http://localhost:8080/delivery/1
```

Exemplo corpo da requisição:

obs: Aqui está sendo trocado qual drone fez a entrega.

```
{
    "droneId": 2
}
```

Retorno: status 200 (ok)

<hr />


**Rota para deletar uma delivery (DELETE):**

obs: o 1 se refere a delivery que está sendo deletada.

```
http://localhost:8080/delivery/1
```

Retorno: status 200 (ok)

<hr />

**Rota para pegar todos os vídeos das entregas (GET):**

```
http://localhost:8080/delivery/videos
```

Exemplo de retorno: 

```
[
    {
        "video": "src/main/video.mp4"
    },
    {
        "video": "src/main/video2.mp4"
    }
]
```

<hr />

**Rota para fazer o download de um vídeo (GET):**

obs: o 1 se refere a delivery que você quer baixar o vídeo.

```
http://localhost:8080/delivery/download/video/1
```

Exemplo de retorno:

```
{
    "video": "src/main/video.mp4"
}
```

<hr />

**Rota para adicionar um vídeo (POST):**

obs: o 1 se refere a delivery na qual o vídeo vai ser colocado.

```
http://localhost:8080/delivery/add/video/1
```

Retorno: status 200  (ok)

<hr />
<br />

# Testando a aplicação:

```
mvn test
```
<hr />
<br />

# Tecnologias Utlizadas 💻

- Java
- Spring-Boot
- MySQL
- JUnit
- Docker
