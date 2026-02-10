package com.pharma.cloud.functions;

import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;
import software.amazon.awssdk.services.dynamodb.model.PutItemRequest;
import java.util.Map;
import java.util.function.Function;
import org.springframework.stereotype.Component;

@Component
public class ProductHandler implements Function<Map<String, String>, String> {

    private final DynamoDbClient ddb = DynamoDbClient.create();

    @Override
    public String apply(Map<String, String> input) {
        // Lógica de redução de custo: Processamento Serverless
        PutItemRequest request = PutItemRequest.builder()
                .tableName("PharmaEstoque")
                .item(Map.of(
                    "id", AttributeValue.builder().s(input.get("id")).build(),
                    "nome", AttributeValue.builder().s(input.get("nome")).build(),
                    "preco", AttributeValue.builder().s(input.get("preco")).build()
                ))
                .build();

        ddb.putItem(request);
        return "Produto armazenado com sucesso no DynamoDB!";
    }
}
