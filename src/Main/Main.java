package Main;

import Methods.Binarizar;
import Methods.DetectarBordas;
import Methods.InverterCores;
import Methods.Suavizar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.File;


public class Main {

    private static JFrame frame;
    private static JButton carregarImagem;
    private static JLabel imageLabel;
    private static JButton suavizarImagem;
    private static JButton binarizarImagem;
    private static JButton inverterCores;
    private static JButton bordas1;
    private static JButton bordas2;
    private static JButton bordas3;
    private static JButton bordas4;
    private static JButton bordas5;
    private static JButton bordas6;
    private static JButton bordas7;

    private static BufferedImage imagem;

    public Main() {

        frame = new JFrame("Filtros de Imagem");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        imageLabel = new JLabel();
        JScrollPane scrollPane = new JScrollPane(imageLabel);
        frame.add(scrollPane, BorderLayout.CENTER);

        JPanel barraDeBotoes = new JPanel();
        carregarImagem = new JButton("Carregar Imagem");
        suavizarImagem = new JButton("Suavizar Imagem");
        binarizarImagem = new JButton("Binarizar Imagem");
        inverterCores = new JButton("Inverter Cores da Imagem");
        bordas1 = new JButton("Bordas 1");
        bordas2 = new JButton("Bordas 2");
        bordas3 = new JButton("Bordas 3");
        bordas4 = new JButton("Bordas 4");
        bordas5 = new JButton("Bordas 5");
        bordas6 = new JButton("Bordas 6");
        bordas7 = new JButton("Bordas 7");

        barraDeBotoes.add(carregarImagem);
        barraDeBotoes.add(suavizarImagem);
        barraDeBotoes.add(binarizarImagem);
        barraDeBotoes.add(inverterCores);
        barraDeBotoes.add(bordas1);
        barraDeBotoes.add(bordas2);
        barraDeBotoes.add(bordas3);
        barraDeBotoes.add(bordas4);
        barraDeBotoes.add(bordas5);
        barraDeBotoes.add(bordas6);
        barraDeBotoes.add(bordas7);

        frame.add(barraDeBotoes, BorderLayout.SOUTH);

        carregarImagem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    try {
                        imagem = ImageIO.read(selectedFile);
                        exibirImagem(imagem);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        suavizarImagem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (imagem != null) {
                    BufferedImage imagemSaida = null;
                    try {
                        imagemSaida = Suavizar.aplicarFiltro(imagem);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    exibirImagem(imagemSaida);
                }
            }
        });

        binarizarImagem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (imagem != null) {
                    BufferedImage imagemSaida = null;
                    try {
                        imagemSaida = Binarizar.binarizarImagem(imagem);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    exibirImagem(imagemSaida);
                }
            }
        });

        inverterCores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (imagem != null) {
                    BufferedImage imagemSaida = null;
                    try {
                        imagemSaida = InverterCores.inverterCores(imagem);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    exibirImagem(imagemSaida);
                }
            }
        });

        bordas1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (imagem != null) {
                    BufferedImage imagemSaida = null;
                    try {
                        imagemSaida = DetectarBordas.tipo1(imagem);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    exibirImagem(imagemSaida);
                }
            }
        });

        bordas2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (imagem != null) {
                    BufferedImage imagemSaida = null;
                    try {
                        imagemSaida = DetectarBordas.tipo2(imagem);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    exibirImagem(imagemSaida);
                }
            }
        });

        bordas3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (imagem != null) {
                    BufferedImage imagemSaida = null;
                    try {
                        imagemSaida = DetectarBordas.tipo3(imagem);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    exibirImagem(imagemSaida);
                }
            }
        });

        bordas4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (imagem != null) {
                    BufferedImage imagemSaida = null;
                    try {
                        imagemSaida = DetectarBordas.tipo4(imagem);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    exibirImagem(imagemSaida);
                }
            }
        });

        bordas5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (imagem != null) {
                    BufferedImage imagemSaida = null;
                    try {
                        imagemSaida = DetectarBordas.tipo5(imagem);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    exibirImagem(imagemSaida);
                }
            }
        });

        bordas6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (imagem != null) {
                    BufferedImage imagemSaida = null;
                    try {
                        imagemSaida = DetectarBordas.tipo6(imagem);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    exibirImagem(imagemSaida);
                }
            }
        });

        bordas7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (imagem != null) {
                    BufferedImage imagemSaida = null;
                    try {
                        imagemSaida = DetectarBordas.tipo7(imagem);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    exibirImagem(imagemSaida);
                }
            }
        });

        frame.setVisible(true);
    }






    private static void exibirImagem(BufferedImage image) {
        ImageIcon imageIcon = new ImageIcon(image);
        imageLabel.setIcon(imageIcon);
        imageLabel.revalidate();
        imageLabel.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });
    }
}
