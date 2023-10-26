package Methods;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Binarizar {

    static final String CAMINHO_PADRAO = "C:\\Users\\Administrator\\IdeaProjects\\PDIGui\\src\\Imagem\\";

    public static BufferedImage binarizarImagem(BufferedImage imagem) throws IOException {
        int largura = imagem.getWidth();
        int altura = imagem.getHeight();

        BufferedImage novaImagem = new BufferedImage(largura, altura, BufferedImage.TYPE_BYTE_BINARY);

        for (int linha = 0; linha < largura; linha++) {
            for (int coluna = 0; coluna < altura; coluna++) {
                int pixel = imagem.getRGB(linha, coluna);
                Color cor = new Color(pixel);

                int intensidadeCinza = (cor.getRed() + cor.getGreen() + cor.getBlue()) / 3;

                int threshold = 128;
                if (intensidadeCinza < threshold) {
                    novaImagem.setRGB(linha, coluna, Color.BLACK.getRGB());
                } else {
                    novaImagem.setRGB(linha, coluna, Color.WHITE.getRGB());
                }
            }
        }
        return novaImagem;
    }
}