### vendas_api

O sistema está sendo construído utilizando a stack Spring e fazendo uso de conteiners no docker para virtualização. 

#### banco de dados
A imagem docker do banco de dados está no diretório /DockerfileDB.
O arquivo possui apenas a referência da imagem PostgresSQL e as variáveis de ambiente que representam usuário e senha. 



#### aplicação
A imagem docker da aplicação está na raiz do projeto. 
A aplicação está configurada para se comunicar com o banco de dados através da porta 5432 e banco chamado vendas_api, portanto, para que a aplicação funcione corretamente, é necessário essas confiurações sejam realizadas.
