O PharmaCloud é um sistema de gerenciamento farmacêutico desenvolvido em Java 17 e Spring Cloud Function. O objetivo central é gerenciar o inventário e pedidos de uma farmácia fictícia utilizando a infraestrutura serverless da AWS para garantir que a empresa pague apenas pelo que processar, eliminando custos de servidores ociosos durante a madrugada.
2. Arquitetura Técnica
Linguagem: Java 17 (LTS).
Framework: Spring Cloud Function (permite rodar código Spring no AWS Lambda).
Banco de Dados: Amazon DynamoDB (NoSQL de alta performance).
Gerenciador de Dependências: Maven.
Infraestrutura:
AWS Lambda: Execução do backend Java.
Amazon API Gateway: Interface REST para o frontend.
Amazon S3: Hospedagem do frontend estático e receitas digitais (PDFs).
