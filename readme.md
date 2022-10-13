### 🛠️ Para rodar o projeto:

Navegar até a pasta do projeto 


<li>Para rodar um container no Docker buildar a imagem.
Na pasta do projeto: </li>

```
sudo docker build -t minha-api-kotlin .
```


<li>Em seguida rodar a imagem: </li>

```
sudo docker run -p 8080:8080 minha-api-kotlin
```

#### OBS: 🗒
Você deve ter instalado um banco de dados configurado para rodar a aplicação no Docker

