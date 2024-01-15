# Java <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" width="40px"/>&nbsp;
#### Dois códigos foram criados, sendo eles:
### Simulação de troco de moedas
O código Java apresenta um programa simples para contar o número mínimo de moedas necessário para representar uma determinada quantia em centavos. 
### Simulação de troco de um supermercado
O código Java representa um programa para calcular o troco em notas e moedas após uma compra em um supermercado.
<h1></h1>

### Aqui está um resumo do código troco de moedas:

#### Entrada de Dados:

- Solicita ao usuário que insira a quantidade de dinheiro em centavos.

#### Variáveis:

- Declara e inicializa variáveis para representar diferentes valores de moedas (100, 50, 25, 10, 5, 1).
- Usa variáveis adicionais para armazenar a quantidade de cada tipo de moeda.
- Usa uma variável booleana finish para controlar o término do loop.

#### Loop para Contar Moedas:

- Utiliza um loop do-while para calcular a quantidade de cada tipo de moeda necessária.
- O loop continua até que finish seja verdadeiro.
- Dentro do loop, verifica se a quantia restante é maior ou igual ao valor da moeda, e, nesse caso, calcula a quantidade dessa moeda e ajusta a quantia restante.

#### Saída de Dados:

- Imprime a quantidade de cada tipo de moeda necessária para representar a quantia inserida.

### Observações:

O código assume que a quantia inserida é um número inteiro positivo.
O controle de saída do loop (finish) é acionado quando a quantia restante é menor que a moeda de 5 centavos ou quando a quantia é zero.
Em resumo, o programa efetua a contagem de moedas para representar uma quantia específica em centavos, usando moedas de diferentes valores.

<h1></h1>
<h2></h2>

### Abaixo está um resumo do código Troco em um Supermercado:

#### Entrada de Dados:

- Solicita ao usuário o valor total da compra (valCompra) e o valor pago em dinheiro (valDinheiro).

#### Cálculo do Troco:

- Calcula o troco subtraindo o valor pago do valor total da compra.

#### Separação de Parte Inteira e Fracionária do Troco:

- Separa a parte inteira do troco em notas.
- Separa a parte fracionária do troco em moedas.

#### Contagem de Notas e Moedas:

- Utiliza um loop do-while para contar as notas de diferentes valores (200, 100, 50, 20, 10, 5, 2, 1).
- Usa variáveis booleanas para controlar o término do loop.

#### Contagem de Moedas Menores (exceto 1 real):

- Utiliza um segundo loop do-while para contar as moedas de valores menores que 1 real (0,50, 0,25, 0,10, 0,05, 0,01).

#### Ajuda no Troco:

- Pergunta ao usuário se deseja uma visualização detalhada das notas e moedas a serem devolvidas como troco.
- Se o usuário optar por ajuda, o programa imprime a quantidade de cada nota e moeda.
- Caso contrário, apenas imprime "Finalizado com Sucesso!!".

### Observações:

O código assume que os valores de compra e pagamento são números em ponto flutuante.
Utiliza o tipo de dado float para representar os valores.
A ajuda no troco permite ao usuário visualizar a quantidade de cada nota e moeda a ser devolvida.
O programa fornece uma solução simples para calcular o troco e pode ser utilizado em cenários de transações comerciais.

<h1></h1>
