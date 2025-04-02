# 🛒 DSCommerce - API REST com Spring Boot

## 📜 Descrição
O **DSCommerce** é uma API REST desenvolvida em **Java 17** utilizando o **Spring Boot 3.4.4**, projetada para servir como backend de um sistema de e-commerce. A aplicação utiliza **JPA/Hibernate** para persistência de dados e um banco de dados em memória **H2**, facilitando o desenvolvimento e testes.

---

## 🚀 Tecnologias Utilizadas
- ⚡ **Java 17** - Linguagem de programação principal
- 🔥 **Spring Boot 3.4.4** - Framework para desenvolvimento backend
- 🌐 **Spring Boot Starter Web** - Para criação da API REST
- 💾 **Spring Boot Starter Data JPA** - Para interação com o banco de dados
- 🗄️ **Banco de Dados H2** - Banco de dados em memória para testes
- ✅ **Hibernate Validator** - Validação de dados com Jakarta Validation
- 🧪 **JUnit e Spring Boot Starter Test** - Testes automatizados
- 📦 **Maven** - Gerenciador de dependências e build

---

## 🛠️ Configuração do Ambiente
### 1️⃣ Requisitos
Antes de iniciar, garanta que você tem instalados:
- ☕ **JDK 17 ou superior**
- 🏗️ **Maven**
- 🔗 **Git**

### 2️⃣ Clonar o Repositório
```sh
git clone https://github.com/AugustoIseppe/java-dscommerce.git
cd java-dscommerce
```

### 3️⃣ Configurar e Executar a API
O projeto usa um banco de dados **H2** que roda em memória. Basta iniciar a aplicação sem configurações adicionais.
```sh
mvn spring-boot:run
```
A API estará acessível em: [http://localhost:8080](http://localhost:8080)

### 4️⃣ Acessar o Console do H2
Para visualizar os dados no banco H2, acesse:
```
http://localhost:8080/h2-console
```
Configuração:
- **JDBC URL**: `jdbc:h2:mem:testdb`
- **Usuário**: `sa`
- **Senha**: (deixe em branco)

---

## 📂 Estrutura do Projeto
```
java-dscommerce/
├── src/main/java/com/augustoiseppe/dscommerce/
│   ├── controllers/   # Controladores REST
│   ├── entities/      # Entidades JPA
│   ├── repositories/  # Repositórios JPA
│   ├── services/      # Lógica de negócio
│   └── Application.java  # Classe principal
├── src/main/resources/
│   ├── application.properties  # Configurações da aplicação
│   ├── data.sql  # Scripts de inicialização do banco
│   └── schema.sql  # Definição do esquema de banco
└── pom.xml  # Dependências do Maven
```

---

## ✅ Testes
Para rodar os testes automatizados:
```sh
mvn test
```

---

## 🤝 Contribuição
Caso queira contribuir, siga os seguintes passos:
1. 🚀 Faça um fork do projeto
2. 🌿 Crie uma branch (`git checkout -b feature-minha-feature`)
3. 💾 Commit suas alterações (`git commit -m 'Adiciona minha nova feature'`)
4. 📤 Envie para o repositório remoto (`git push origin feature-minha-feature`)
5. 🛎️ Abra um Pull Request

---

## 📜 Licença
Este projeto é distribuído sob a licença MIT. Consulte o arquivo `LICENSE` para mais informações.

---

## 👤 Autor
Desenvolvido por **Augusto Iseppe**. 🚀

