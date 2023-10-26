package Methods;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class DetectarBordas {

    static final String CAMINHO_PADRAO = "C:\\Users\\Administrator\\IdeaProjects\\PDIGui\\src\\Imagem\\";

    public static BufferedImage tipo1(BufferedImage imagemOriginal) throws IOException {
        int largura = imagemOriginal.getWidth();
        int altura = imagemOriginal.getHeight();
        BufferedImage imagemBordas = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);

        for (int x = 1; x < largura - 1; x++) {
            for (int y = 1; y < altura - 1; y++) {
                int[][] kernel = {
                        {1, 1, 1},
                        {0, 0, 0},
                        {-1, -1, -1}
                };

                int novoValor = 0;

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        Color pixel = new Color(imagemOriginal.getRGB(x + i - 1, y + j - 1));
                        int grayscaleValue = (pixel.getRed() + pixel.getGreen() + pixel.getBlue()) / 3;
                        novoValor += kernel[i][j] * grayscaleValue;
                    }
                }

                novoValor = Math.min(255, Math.max(0, novoValor));
                Color novaCor = new Color(novoValor, novoValor, novoValor);
                imagemBordas.setRGB(x, y, novaCor.getRGB());
            }
        }
        return imagemBordas;
    }


    public static BufferedImage tipo2(BufferedImage imagemOriginal) throws IOException {
        int largura = imagemOriginal.getWidth();
        int altura = imagemOriginal.getHeight();
        BufferedImage imagemBordas2 = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);

        for (int x = 1; x < largura - 1; x++) {
            for (int y = 1; y < altura - 1; y++) {
                int[][] kernel = {
                        {1, 0, -1},
                        {1, 0, -1},
                        {1, 0, -1}
                };

                int novoValor = 0;

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        Color pixel = new Color(imagemOriginal.getRGB(x + i - 1, y + j - 1));
                        int grayscaleValue = (pixel.getRed() + pixel.getGreen() + pixel.getBlue()) / 3;
                        novoValor += kernel[i][j] * grayscaleValue;
                    }
                }

                novoValor = Math.min(255, Math.max(0, novoValor));
                Color novaCor = new Color(novoValor, novoValor, novoValor);
                imagemBordas2.setRGB(x, y, novaCor.getRGB());
            }
        }
        return imagemBordas2;
    }

    public static BufferedImage tipo3(BufferedImage imagemOriginal) throws IOException {
        int largura = imagemOriginal.getWidth();
        int altura = imagemOriginal.getHeight();
        BufferedImage imagemBordas3 = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);

        for (int x = 1; x < largura - 1; x++) {
            for (int y = 1; y < altura - 1; y++) {
                int[][] kernel = {
                        {-1, -1, -1},
                        {-1, 8, -1},
                        {-1, -1, -1}
                };

                int novoValor = 0;

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        Color pixel = new Color(imagemOriginal.getRGB(x + i - 1, y + j - 1));
                        int grayscaleValue = (pixel.getRed() + pixel.getGreen() + pixel.getBlue()) / 3;
                        novoValor += kernel[i][j] * grayscaleValue;
                    }
                }

                novoValor = Math.min(255, Math.max(0, novoValor));
                Color novaCor = new Color(novoValor, novoValor, novoValor);
                imagemBordas3.setRGB(x, y, novaCor.getRGB());
            }
        }
        return imagemBordas3;
    }


    public static BufferedImage tipo4(BufferedImage imagemOriginal) throws IOException {
        int largura = imagemOriginal.getWidth();
        int altura = imagemOriginal.getHeight();
        BufferedImage imagemBordas4 = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);

        for (int x = 1; x < largura - 1; x++) {
            for (int y = 1; y < altura - 1; y++) {
                int[][] kernel = {
                        {0, -1, 0},
                        {-1, 5, -1},
                        {0, -1, 0}
                };

                int novoValor = 0;

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        Color pixel = new Color(imagemOriginal.getRGB(x + i - 1, y + j - 1));
                        int grayscaleValue = (pixel.getRed() + pixel.getGreen() + pixel.getBlue()) / 3;
                        novoValor += kernel[i][j] * grayscaleValue;
                    }
                }

                novoValor = Math.min(255, Math.max(0, novoValor));
                Color novaCor = new Color(novoValor, novoValor, novoValor);
                imagemBordas4.setRGB(x, y, novaCor.getRGB());
            }
        }
        return imagemBordas4;
    }

    public static BufferedImage tipo5(BufferedImage imagemOriginal) throws IOException {
        int largura = imagemOriginal.getWidth();
        int altura = imagemOriginal.getHeight();
        BufferedImage imagemBordas5 = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);

        for (int x = 1; x < largura - 1; x++) {
            for (int y = 1; y < altura - 1; y++) {
                int[][] kernel = {
                        {0, 0, 0},
                        {-1, 1, 0},
                        {0, 0, 0}
                };

                int novoValor = 0;

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        Color pixel = new Color(imagemOriginal.getRGB(x + i - 1, y + j - 1));
                        int grayscaleValue = (pixel.getRed() + pixel.getGreen() + pixel.getBlue()) / 3;
                        novoValor += kernel[i][j] * grayscaleValue;
                    }
                }

                novoValor = Math.min(255, Math.max(0, novoValor));
                Color novaCor = new Color(novoValor, novoValor, novoValor);
                imagemBordas5.setRGB(x, y, novaCor.getRGB());
            }
        }
        return imagemBordas5;
    }

    public static BufferedImage tipo6(BufferedImage imagemOriginal) throws IOException {
        int largura = imagemOriginal.getWidth();
        int altura = imagemOriginal.getHeight();
        BufferedImage imagemBordas6 = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);

        for (int x = 1; x < largura - 1; x++) {
            for (int y = 1; y < altura - 1; y++) {
                int[][] kernel = {
                        {0, 1, 0},
                        {1, -4, 1},
                        {0, 1, 0}
                };

                int novoValor = 0;

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        Color pixel = new Color(imagemOriginal.getRGB(x + i - 1, y + j - 1));
                        int grayscaleValue = (pixel.getRed() + pixel.getGreen() + pixel.getBlue()) / 3;
                        novoValor += kernel[i][j] * grayscaleValue;
                    }
                }

                novoValor = Math.min(255, Math.max(0, novoValor));
                Color novaCor = new Color(novoValor, novoValor, novoValor);
                imagemBordas6.setRGB(x, y, novaCor.getRGB());
            }
        }
        return imagemBordas6;
    }

    public static BufferedImage tipo7(BufferedImage imagemOriginal) throws IOException {
        int largura = imagemOriginal.getWidth();
        int altura = imagemOriginal.getHeight();
        BufferedImage imagemBordas7 = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);

        for (int x = 1; x < largura - 1; x++) {
            for (int y = 1; y < altura - 1; y++) {
                int[][] kernel = {
                        {-2, -1, 0},
                        {-1, 1, 1},
                        {0, 1, 2}
                };

                int novoValor = 0;

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        Color pixel = new Color(imagemOriginal.getRGB(x + i - 1, y + j - 1));
                        int grayscaleValue = (pixel.getRed() + pixel.getGreen() + pixel.getBlue()) / 3;
                        novoValor += kernel[i][j] * grayscaleValue;
                    }
                }

                novoValor = Math.min(255, Math.max(0, novoValor));
                Color novaCor = new Color(novoValor, novoValor, novoValor);
                imagemBordas7.setRGB(x, y, novaCor.getRGB());
            }
        }
        return imagemBordas7;
    }
}
