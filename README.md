💱 Challenge Conversor de Moedas
Este projeto é um Conversor de Moedas em Java, desenvolvido como desafio para praticar conceitos como consumo de APIs externas, tratamento de exceções, manipulação de entrada de usuário e boas práticas de organização de classes.

📌 Funcionalidades
Consulta de cotação de moedas em tempo real via API.

Conversão entre as seguintes moedas:

Dólar (USD)

Real (BRL)

Peso Argentino (ARS)

Peso Colombiano (COP)

Validação de entrada de dados.

Loop de execução contínua até o usuário decidir sair.

📂 Estrutura de Pacotes
css
Copiar
Editar
src/
└── br/
└── alura/
└── conversor/
├── api/
│     └── ConsultaApi.java
├── modelos/
│     ├── Conversao.java
│     └── Verificacao.java
└── Main.java
🚀 Tecnologias Utilizadas
Java 17

API pública para consulta de câmbio (Exemplo: exchangerate-api.com)

IntelliJ IDEA (ou IDE de sua preferência)

✅ Como Executar
Clone o repositório:

bash
Copiar
Editar
git clone https://github.com/Joaoaraujo61/Challenge-Conversor-de-Moedas.git
Navegue até a pasta src e abra o projeto em sua IDE.

Execute a classe Main.java