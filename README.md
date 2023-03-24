### Atribuições do profissional backend
- Criar camada de persistência da aplicação
- Implementar as regras de negócio
- Modelar objetos e banco de dados
- Criar e disponibilizar API's

## Lógica Condicional e Controle De Fluxos

- Operadores relacionais
São símbolos capazes de realizar comparações de similaridade e/ou tamanho. Em similaridade se compara igualdade e diferença. E o de tamanho maior/menor e maior/menor igual. Não é possível utilizar os símbolos para comparar tamanho de uma string, boleanos e comparações de tipos diferentes. `Exemplos: boolA <= intA`

- Operadores Relacionais
Realizam comparações lógicoas de operandos ou expressões  dos tipos de conjunção, disjunção, disjunção exclusiva, Negação. São mais restritivos em relação ao uso.
> - Conjunção só retorna verdadeiro quando ambos são verdade. Símbolo &&, termo `and`.
> - Disjunção só retorna falsa quan ambos são falsos. Símbolo ||, termo `or`.
> - Disjunção exclusiva só apresenta verdade quando ambos são opostos. E falso quando ambos são similares. Símbolo ^, termo `xor`.
> - Negaçao inverte o valor lógico. Símbolo !.
> Operadores bitwise (& e |); e Operadores shift ( ^, >>, >>>, <<)

- Controle de Fluxo
Estruturas que direcionam o fluxo de execução de um programa.
Tipos: Decisão(if, else, else if, switch, operador ternário), repetição(for, while, do while) e interrupçã (break, continue e return). if avalia expressões booleanas.

- Boas práticas
Crie variáveis auxiliarea para guardar resultados intermediários

-Tipod de blocos de execução são locais (dentro de metodos), estático e de instancia(ambos dentro de classe).

## Estrutura de Repetição
Loop: Repetir uma operação ou uma sequeência de comandos várias vezes.
- `while` teste no início (Entrada, Expressão, Sentença, Fim do Programa)
- `do while` teste no final (Entrada, Sentença, Expressão, Fim do Programa)
- `for` contada (Entrada, Inicialização, Expressão/Teste, Sentença, Atualização, Fim do Programa)
- `break` e o `continue`

### Incrementos pré-fixados e pós-fixados
Pré-fixados: ++num ou --num, ele altera o valor da variável;
Pós-fixados: num++ ou num--, ele altera o valor da variável, mas retorna o valor original

### Arrays
Objeto utilizado para armazenar dados sequenciais do mesmo tipo
Existem o array unidimensional (lista), e o array multidimensional (tabela/matriz).

Referência: [https://github.com/cami-la/loops-e-arrays](https://github.com/cami-la/loops-e-arrays)

## Formatação de arquivo .md

- `src`: the folder to maintain sources
[here](https://github.com/deisekinsk/condicionalJava).
> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.
