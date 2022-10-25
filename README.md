1. A locadora trabalha com o aluguel de veículos, onde cada veículo tem, no mínimo, os
seguintes dados: placa, ano e valor da diária. Carro, ônibus e caminhão são tipos de
veículos que atualmente podem ser locados. Além dos atributos comuns de todos os
veículos, cada tipo possui um conjunto extra de dados:

Carro: número de passageiros, número de portas, média de quilômetros por
litro e ar-condicionado (sim ou não).

Ônibus: número de passageiros, categoria (leito, executivo ou convencional),
serviço de internet sem fio (sim ou não) e ar-condicionado (sim ou não).

Caminhão: número de eixos e carga máxima.

2. A relação de todos os veículos para locação, assim como os métodos para incluir, alterar e
capturar os dados de um ou mais veículos devem ser implementados por uma classe A de
processamento que implementa a interface IVeiculos (disponível no Moodle). A interação
entre o usuário e essa classe A deve ser implementada por uma classe de interface console
ou gráfica B.

3. Para realizar uma locação de veículo, um Cliente deve ser previamente cadastrado. Um
Cliente deve informar os seguintes dados: nome, CPF, número da carteira de motorista,
endereço e telefone.

4. A relação de todos os clientes, assim como os métodos para incluir, alterar e capturar os
dados de um ou mais clientes devem ser implementados por uma classe C de processamento que implementa a interface IClientes (disponível no Moodle). A interação entre o usuário e essa classe C deve ser implementada por uma classe de interface console
ou gráfica D.

5. Uma locação de veículo deve conter os seguintes dados: código da locação (que deve ser único), Cliente, Veiculo, seguro (sim ou não), data inicial e data final.

6. A relação de todas as locações, assim como os métodos para incluir, alterar e capturar os dados de uma ou mais locações devem ser implementados por uma classe E de processamento que implementa a interface ILocacoes(disponível no Moodle). A interação entre o usuário e essa classe E deve ser implementada por uma classe de interface console ou gráfica F.

7. Há inúmeras maneiras de simular o funcionamento da locadora de veículos. Utilizem a criatividade para usar as interfaces console ou gráfica implementadas pelas classes B, D e F.

8. Divida a sua aplicação em, pelo menos, dois pacotes.

9. Utilize o javadoc e faça comentários pertinentes no código.

