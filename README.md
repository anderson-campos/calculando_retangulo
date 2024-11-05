<h1>Projeto: Cálculo da Área de um Retângulo em Java</h1>

<p>Este projeto em Java realiza o cálculo da área de um retângulo com base na largura e altura fornecidas pelo usuário. A implementação enfatiza a organização do código em classes separadas dentro do mesmo pacote, promovendo a modularidade e o encapsulamento, além de demonstrar o uso de métodos para simplificar o cálculo.</p>

<h2>Estrutura do Projeto</h2>

<p>O projeto é composto por duas classes, localizadas em arquivos distintos, mas no mesmo pacote:</p>

<ol>
    <li><strong>Classe <code>Main</code></strong>: Classe principal que executa o programa. Esta classe lida com a interação com o usuário, coleta os valores de altura e largura, e exibe o resultado da área.</li>
    <li><strong>Classe <code>areaRetangulo</code></strong>: Classe auxiliar que contém o método responsável pelo cálculo da área do retângulo, abstraindo a lógica de cálculo para facilitar a manutenção e reutilização.</li>
</ol>

<h3>Detalhes das Classes</h3>

<ul>
    <li><strong>Classe <code>Main</code></strong>
        <ul>
            <li>Importa a classe <code>Scanner</code> para capturar as entradas do usuário.</li>
            <li>Recebe os valores de largura e altura e os passa para o método da classe <code>areaRetangulo</code>.</li>
            <li>Exibe o resultado da área calculada.</li>
        </ul>
    </li>
    <li><strong>Classe <code>areaRetangulo</code></strong>
        <ul>
            <li>Contém o método estático <code>areDoRetangulo</code>, que realiza o cálculo da área.</li>
            <li>O método recebe os parâmetros <code>largura</code> e <code>altura</code>, multiplicando-os para retornar o valor da área.</li>
        </ul>
    </li>
</ul>

<h2>Objetivos do Projeto</h2>

<p>Este projeto visa:</p>

<ol>
    <li><strong>Modularização</strong>: Demonstrar a organização do código em arquivos separados, reforçando a modularidade.</li>
    <li><strong>Encapsulamento e Reutilização</strong>: Abstrair o cálculo em um método específico na classe <code>areaRetangulo</code>, tornando o código mais organizado e reutilizável.</li>
    <li><strong>Uso de Métodos</strong>: Mostrar como criar e utilizar métodos para realizar operações específicas.</li>
</ol>

<h2>Explicação dos Conceitos</h2>

<h3>1. Organização em Arquivos Separados</h3>
<p>O projeto organiza as classes <code>Main</code> e <code>areaRetangulo</code> em arquivos separados dentro do mesmo pacote. Essa prática facilita a leitura e manutenção do código, pois cada classe possui uma responsabilidade distinta.</p>

<h3>2. Método para Cálculo da Área</h3>
<p>A lógica de cálculo da área é isolada na classe <code>areaRetangulo</code>, permitindo que o método <code>areDoRetangulo</code> execute a operação e retorne o valor da área. Essa estrutura separa a lógica de negócios (cálculo da área) da lógica de entrada e saída de dados (interação com o usuário).</p>

<h3>3. Entrada de Dados</h3>
<p>A classe <code>Main</code> usa a classe <code>Scanner</code> para capturar a largura e a altura do retângulo, promovendo a interação com o usuário.</p>

<h2>Funcionalidades</h2>

<ul>
    <li><strong>Interação com o Usuário</strong>: Solicita a largura e a altura do retângulo.</li>
    <li><strong>Cálculo da Área</strong>: Utiliza o método <code>areDoRetangulo</code> da classe <code>areaRetangulo</code> para calcular a área com base nos valores fornecidos.</li>
    <li><strong>Exibição do Resultado</strong>: Mostra o valor da área calculada no console.</li>
</ul>

<h2>Conclusão</h2>

<p>Neste projeto, implementamos um programa em Java que calcula a área de um retângulo com base nas dimensões inseridas pelo usuário. Utilizando classes em arquivos separados dentro do mesmo pacote, o projeto reforça práticas de modularização e encapsulamento, além de mostrar o uso de métodos para simplificar operações de cálculo. Esta estrutura facilita a reutilização do método de cálculo e mantém o código mais organizado e legível.</p>
