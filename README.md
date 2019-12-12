## Universidade Federal Fluminense
### Instituto de Computação


### Disciplina: PROGRAMAÇÃO ORIENTADA A OBJETOS (TCC00328)
Turma: C1
Professor: Flavia Bernardini - fcbernardini@ic.uff.br
Semestre: 2º de 2019 - 6ªs feiras das 18:00 às 22:00

Trabalho Prático

O objetivo do trabalho prático de cada grupo é desenvolver uma parte de um sistema computacional para uma fábrica de bicicletas, sendo que o objetivo do sistema é apoiar a produção das bicicletas, garantindo que os recursos necessários sejam alocados (pessoas e materiais) a fim de entregar um produto no prazo e com qualidade para o cliente.
A fábrica possui os seguintes setores de funcionamento:
o PCP - Planejamento e Controle de Produção
o Financeiro
o Compras
o Vendas
o RH - Recursos Humanos

Os seguintes conceitos devem ser considerados para o desenvolvimento desse sistema:
o Para produção de um produto, há um processo simplificado com três etapas: Pedido, Projeto e Produto:

Na etapa Pedido, o setor de vendas recebe uma encomenda de um cliente, armazena seus dados e a quantidade de bicicletas a serem produzidas. O setor de vendas deve verificar se existem bicicletas daquele modelo prontas para entrega no estoque. Caso existam, o pedido é imediatamente processado e passa para a etapa de entrega. Caso contrário, o setor deve encaminhar a encomenda para o setor de PCP.
Deve ser feita uma baixa de itens vendidos no sistema, após a venda ser concluída.
Na etapa Projeto e Produção, o setor de PCP deve verificar se existe um projeto que atenda os itens solicitados na encomenda. Se existir, o item deve ser encaminhado para a produção. Se não existir, o projeto é desenvolvido, e a capacidade de produção é verificada. Deve ser verificada a quantidade em estoque de materiais para a produção do item encomendado (banco, rodas, pneus, dentre outros). Caso haja falta de materiais, o setor de PCP deve encaminhar para o setor de Compras um pedido de novos materiais. Esse setor também é responsável por alocar o corpo técnico para a produção, o que implica em saber como está a
alocação atual, e para qual prazo deve ocorrer essa nova alocação. Além do corpo técnico, um gerente de produção também deve ser alocado. Caso haja indisponibilidade de mão de obra, o setor de PCP encaminha para o setor de RH um pedido de contratação. Caso todas as informações estejam disponibilizadas, o produto deve entrar em produção, sendo o projeto executado com pessoas e materiais necessários disponíveis. Após a produção, testes são realizados nos produtos. Se o produto está funcionando, pode ser entregue; se o produto não estiver funcionando, a produção deve ser reiniciada.
Na etapa Produto, após a realização dos testes para verificação e validação do produto, o setor Financeiro emite a nota fiscal, recebe o pagamento e expede o produto para entrega. Em caso de ausência no pagamento, o produto não será entregue e será expedida uma nota de aviso ao comprador.

o Admite-se que não faltam recursos financeiros para a produção, e assim nunca há impedimento de compras e contratações (setor de RH);

o Os diversos setores podem ser atendidos por um mesmo módulo do sistema, ou um único setor pode ser atendido por mais de um módulo do sistema, ficando a critério do projeto de software implementado.

Dada essa descrição, cada grupo deve escolher uma parte do sistema para ser desenvolvido. Preferencialmente, três a quatro grupos podem se organizar para construir o sistema completo. Cada grupo deve explicitar quais partes do processo seus módulos atenderão.

