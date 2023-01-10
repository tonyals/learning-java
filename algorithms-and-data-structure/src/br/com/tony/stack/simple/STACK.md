## Pilhas

Uma pilha é uma estrutura de dados que segue o princípio do LIFO (Last In First Out), que em tradução livre seria algo como **o último a entrar é o primeiro a sair**. <br>
Neste exemplo a implementação da fila é feita utilizando *generics* para tornar a sua tipagem mais dinâmica. <br>

A lógica implementada se baseia em um array de elementos do tipo `E` chamado `stack`onde estão sendo armazenados os itens da pilha, juntamente com uma variável `int count`com valor inicial de `0 zero` que é incrementada a cada adição ou decrementada a cada remoção de um item da pilha e é utilizada para obtermos informações como quantidade de itens, pilha vazia etc.

### Métodos da interface `IStack<E>`
* `void push(E element)`: responsável por adicionar um elemento do tipo `E` ao topo da pilha. Lança um `FullStackError` caso a pilha esteja cheia. <br>
* `E pop()`: remove o item no topo da pilha e o retorna. Lança um `EmptyStackError` caso a pilha esteja vazia. <br>
* `int size()`: retorna o tamanho da pilha. <br>
* `boolean isEmpty()`: indica se a pilha está vazia. <br>
* `E top()`: retorna o elemento no topo da pilha sem removê-lo. Lança um `EmptyStackError` caso a pilha esteja vazia. <br>