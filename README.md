# Aplicação de Filtros de Imagem

Esta é uma aplicação Java para aplicar vários filtros de imagem a imagens carregadas. A aplicação fornece uma interface gráfica do usuário (GUI) para carregar uma imagem e aplicar diferentes operações de processamento de imagem, incluindo suavização, binarização, inversão de cores e detecção de bordas. A aplicação é estruturada em várias classes, cada uma responsável por uma operação específica de processamento de imagem.

## Começando

Para usar esta aplicação, siga as etapas abaixo:

1. Clone ou baixe este repositório para o seu computador local.
2. Abra o projeto em seu ambiente de desenvolvimento Java preferido.

## Uso

1. Inicie a aplicação executando a classe `Main`.
2. A janela principal da aplicação aparecerá.

## Recursos

### Carregar Imagem
- Clique no botão "Carregar Imagem" para carregar uma imagem do seu sistema de arquivos local. Os formatos de imagem suportados incluem JPEG, PNG e outros.

### Suavização
- Clique no botão "Suavizar Imagem" para aplicar um filtro de suavização à imagem carregada. Este filtro reduz o ruído e cria uma aparência mais suave.

### Binarização
- Clique no botão "Binarizar Imagem" para converter a imagem carregada em uma imagem binária, tornando-a adequada para análise de imagem.

### Inverter Cores
- Clique no botão "Inverter Cores da Imagem" para inverter as cores da imagem carregada. Essa operação troca as cores preto e branco.

### Detecção de Bordas
- Clique em um dos botões "Bordas" (por exemplo, "Bordas 1") para detectar bordas na imagem carregada usando diferentes algoritmos de detecção de bordas. Cada algoritmo destaca as bordas da imagem de uma maneira única.

## Bibliotecas Utilizadas
- Java Swing: Para criar a interface gráfica do usuário.
- Java AWT: Para manipulação de imagens e processamento de pixels.
