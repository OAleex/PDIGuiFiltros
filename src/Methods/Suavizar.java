package Methods;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Suavizar {

    static final String CAMINHO_PADRAO = "C:\\Users\\Administrator\\IdeaProjects\\PDIGui\\src\\Imagem\\";


    private static final double[] filtro_gau = {
            0.0625, 0.125, 0.0625,
            0.125, 0.25, 0.125,
            0.0625, 0.125, 0.0625
    };

    public static BufferedImage aplicarFiltro(BufferedImage imagemOriginal) throws IOException {
        int largura = imagemOriginal.getWidth();
        int altura = imagemOriginal.getHeight();
        BufferedImage imagemSuavizada = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);

        for (int linha = 1; linha < largura - 1; linha++) {
            for (int coluna = 1; coluna < altura - 1; coluna++) {
                double red = 0.0;

                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        Color cor = new Color(imagemOriginal.getRGB(linha + i, coluna + j));
                        red += filtro_gau[(i + 1) * 3 + (j + 1)] * cor.getRed();
                    }
                }

                red = Math.min(255, Math.max(0, red));
                Color novaCor = new Color((int) red, (int) red, (int) red);
                imagemSuavizada.setRGB(linha, coluna, novaCor.getRGB());
            }
        }
        return imagemSuavizada;
    }
}
