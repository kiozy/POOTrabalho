## Universidade Federal Fluminense
### Instituto de Computa��o


### Disciplina: PROGRAMA��O ORIENTADA A OBJETOS (TCC00328)
Turma: C1
Professor: Flavia Bernardini � fcbernardini@ic.uff.br
Semestre: 2o de 2019 � 6as feiras das 18:00 �s 22:00

Trabalho Pr�tico

O objetivo do trabalho pr�tico de cada grupo � desenvolver uma parte de um sistema computacional para uma f�brica de bicicletas, sendo que o objetivo do sistema � apoiar a produ��o das bicicletas, garantindo que os recursos necess�rios sejam alocados (pessoas e materiais) a fim de entregar um produto no prazo e com qualidade para o cliente.
A f�brica possui os seguintes setores de funcionamento:
o PCP � Planejamento e Controle de Produ��o
o Financeiro
o Compras
o Vendas
o RH � Recursos Humanos

Os seguintes conceitos devem ser considerados para o desenvolvimento desse sistema:
o Para produ��o de um produto, h� um processo simplificado com tr�s etapas: Pedido, Projeto e Produto:

Na etapa Pedido, o setor de vendas recebe uma encomenda de um cliente, armazena seus dados e a quantidade de bicicletas a serem produzidas. O setor de vendas deve verificar se existem bicicletas daquele modelo prontas para entrega no estoque. Caso existam, o pedido � imediatamente processado e passa para a etapa de entrega. Caso contr�rio, o setor deve encaminhar a encomenda para o setor de PCP.
Deve ser feita uma baixa de itens vendidos no sistema, ap�s a venda ser conclu�da.
Na etapa Projeto e Produ��o, o setor de PCP deve verificar se existe um projeto que atenda os itens solicitados na encomenda. Se existir, o item deve ser encaminhado para a produ��o. Se n�o existir, o projeto � desenvolvido, e a capacidade de produ��o � verificada. Deve ser verificada a quantidade em estoque de materiais para a produ��o do item encomendado (banco, rodas, pneus, dentre outros). Caso haja falta de materiais, o setor de PCP deve encaminhar para o setor de Compras um pedido de novos materiais. Esse setor tamb�m � respons�vel por alocar o corpo t�cnico para a produ��o, o que implica em saber como est� a
aloca��o atual, e para qual prazo deve ocorrer essa nova aloca��o. Al�m do corpo t�cnico, um gerente de produ��o tamb�m deve ser alocado. Caso haja indisponibilidade de m�o de obra, o setor de PCP encaminha para o setor de RH um pedido de contrata��o. Caso todas as informa��es estejam disponibilizadas, o produto deve entrar em produ��o, sendo o projeto executado com pessoas e materiais necess�rios dispon�veis. Ap�s a produ��o, testes s�o realizados nos produtos. Se o produto est� funcionando, pode ser entregue; se o produto n�o estiver funcionando, a produ��o deve ser reiniciada.
Na etapa Produto, ap�s a realiza��o dos testes para verifica��o e valida��o do produto, o setor Financeiro emite a nota fiscal, recebe o pagamento e expede o produto para entrega. Em caso de aus�ncia no pagamento, o produto n�o ser� entregue e ser� expedida uma nota de aviso ao comprador.

o Admite-se que n�o faltam recursos financeiros para a produ��o, e assim nunca h� impedimento de compras e contrata��es (setor de RH);

o Os diversos setores podem ser atendidos por um mesmo m�dulo do sistema, ou um �nico setor pode ser atendido por mais de um m�dulo do sistema, ficando a crit�rio do projeto de software implementado.

Dada essa descri��o, cada grupo deve escolher uma parte do sistema para ser desenvolvido. Preferencialmente, tr�s a quatro grupos podem se organizar para construir o sistema completo. Cada grupo deve explicitar quais partes do processo seus m�dulos atender�o.

