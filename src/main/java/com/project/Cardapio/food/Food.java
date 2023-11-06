package com.project.Cardapio.food;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "foods") //Tabela de "foods" precisa estar criada no BD
@Entity(name = "foods") // Anotação Entity é usada para informar que uma que uma classe também é um entidade https://www.devmedia.com.br/jpa-como-usar-a-anotacao-entity/38410
@Getter //O método getter retorna o valor do atributo
@NoArgsConstructor //cria automaticamente um construtor com todas os atributos da classe como argumento
@AllArgsConstructor // cria automaticamente um construtor vazio
@EqualsAndHashCode(of = "id") //ssa anotação é parte da biblioteca Lombok, que é utilizada para reduzir a verbosidade do código em Java, gerando automaticamente métodos que são comumente necessários nas classes
public class Food { //Classe para criar o GET ALL, mostrar oque tem dentro
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)// No Deploy mudar para UIID
    private Long id; // Procura o ID
    private String title; // O titulo
    private String image; //  A imagem
    private Integer price; // Preço

    public Food(FoodRequestDTO data){ //Metodo para o POST, não precisa do id
        this.image = data.image(); // Imagem
        this.price = data.price(); // Preço
        this.title = data.title(); // Titulo

    }
}
