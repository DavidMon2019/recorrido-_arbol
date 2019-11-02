package arbol_principal;

import arbol_funciones.funciones_recorrido;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JTextField;

/**
 *
 * @author Verlaine
 */
public class Recorrido_v2 extends javax.swing.JInternalFrame {

    public Recorrido_v2() {
        initComponents();
        this.setTitle("Recorrido de Árboles");

        limitarJtext(JT1);
        limitarJtext(JT2);
        limitarJtext(JT3);
        limitarJtext(JT4);
        limitarJtext(JT5);
        limitarJtext(JT6);
        limitarJtext(JT7);
        limitarJtext(JT8);
        limitarJtext(JT9);
        limitarJtext(JT10);
        limitarJtext(JT11);
        limitarJtext(JT12);
        limitarJtext(JT13);
        limitarJtext(JT14);
        limitarJtext(JT15);
        limitarJtext(JT16);
        limitarJtext(JT17);
        limitarJtext(JT18);
        limitarJtext(JT19);
        limitarJtext(JT20);
        limitarJtext(JT21);
        limitarJtext(JT22);
        limitarJtext(JT23);
        limitarJtext(JT24);
        limitarJtext(JT25);
        limitarJtext(JT26);
        limitarJtext(JT27);
        limitarJtext(JT28);
        limitarJtext(JT29);
        limitarJtext(JT30);
        limitarJtext(JT31);
    }

    public void limitarJtext(JTextField text) {
        text.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                valChart(evt, text);
            }
        });
    }

    public void valChart(KeyEvent evt, JTextField txt) {

        char car = evt.getKeyChar();
        int limite = 2;

        if (Character.isLetter(car) || Character.isDigit(car)) {

        } else {
            evt.consume();
            getToolkit().beep();
        }
        if (txt.getText().length() == limite) {
            evt.consume();
        }
    }
    public void paint(Graphics g) {
        if (g instanceof Graphics2D) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setStroke(new BasicStroke(5.0f));

            super.paint(g);

            g.setColor(Color.MAGENTA);
            g.drawOval(662, 100, 50, 50);
            g.drawLine(662, 125, 387, 200);
            g.drawLine(712, 125, 987, 200);

            g.drawOval(362, 200, 50, 50);
            g.drawLine(362, 225, 237, 300);
            g.drawLine(412, 225, 537, 300);
            g.drawOval(962, 200, 50, 50);
            g.drawLine(962, 225, 837, 300);
            g.drawLine(1012, 225, 1137, 300);

            g.drawOval(212, 300, 50, 50);
            g.drawLine(212, 325, 163, 400);
            g.drawLine(262, 325, 312, 400);
            g.drawOval(512, 300, 50, 50);
            g.drawLine(512, 325, 462, 400);
            g.drawLine(562, 325, 612, 400);
            g.drawOval(812, 300, 50, 50);
            g.drawLine(812, 325, 762, 400);
            g.drawLine(862, 325, 912, 400);
            g.drawOval(1112, 300, 50, 50);
            g.drawLine(1112, 325, 1062, 400);
            g.drawLine(1162, 325, 1212, 400);

            g.drawOval(138, 400, 50, 50);
            g.drawLine(138, 425, 125, 500);
            g.drawLine(188, 425, 200, 500);
            g.drawOval(287, 400, 50, 50);
            g.drawLine(287, 425, 275, 500);
            g.drawLine(337, 425, 350, 500);
            g.drawOval(437, 400, 50, 50);
            g.drawLine(437, 425, 425, 500);
            g.drawLine(487, 425, 500, 500);
            g.drawOval(587, 400, 50, 50);
            g.drawLine(587, 425, 575, 500);
            g.drawLine(637, 425, 650, 500);
            g.drawOval(737, 400, 50, 50);
            g.drawLine(737, 425, 725, 500);
            g.drawLine(787, 425, 800, 500);
            g.drawOval(887, 400, 50, 50);
            g.drawLine(887, 425, 875, 500);
            g.drawLine(937, 425, 950, 500);
            g.drawOval(1037, 400, 50, 50);
            g.drawLine(1037, 425, 1025, 500);
            g.drawLine(1087, 425, 1100, 500);
            g.drawOval(1187, 400, 50, 50);
            g.drawLine(1187, 425, 1175, 500);
            g.drawLine(1237, 425, 1250, 500);

            g.drawOval(100, 500, 50, 50);
            g.drawOval(175, 500, 50, 50);
            g.drawOval(250, 500, 50, 50);
            g.drawOval(325, 500, 50, 50);
            g.drawOval(400, 500, 50, 50);
            g.drawOval(475, 500, 50, 50);
            g.drawOval(550, 500, 50, 50);
            g.drawOval(625, 500, 50, 50);
            g.drawOval(700, 500, 50, 50);
            g.drawOval(775, 500, 50, 50);
            g.drawOval(850, 500, 50, 50);
            g.drawOval(925, 500, 50, 50);
            g.drawOval(1000, 500, 50, 50);
            g.drawOval(1075, 500, 50, 50);
            g.drawOval(1150, 500, 50, 50);
            g.drawOval(1225, 500, 50, 50);
        }
    }
    public void valid() {
        if (JT15.getText() != "" && JT8.getText().isEmpty()) {
            JT15.setText("");
        }
        if (JT16.getText() != "" && JT8.getText().isEmpty()) {
            JT16.setText("");
        }
        if (JT17.getText() != "" && JT9.getText().isEmpty()) {
            JT17.setText("");
        }
        if (JT18.getText() != "" && JT9.getText().isEmpty()) {
            JT18.setText("");
        }
        if (JT8.getText() != "" && JT4.getText().isEmpty()) {
            JT8.setText("");
            JT15.setText("");
            JT16.setText("");
        }
        if (JT9.getText() != "" && JT4.getText().isEmpty()) {
            JT9.setText("");
            JT17.setText("");
            JT18.setText("");
        }
        if (JT4.getText() != "" && JT2.getText().isEmpty()) {
            JT4.setText("");
            JT8.setText("");
            JT9.setText("");
            JT15.setText("");
            JT16.setText("");
            JT17.setText("");
            JT18.setText("");
        }
        if (JT19.getText() != "" && JT11.getText().isEmpty()) {
            JT9.setText("");
        }
        if (JT20.getText() != "" && JT11.getText().isEmpty()) {
            JT20.setText("");
        }
        if (JT10.getText() != "" && JT5.getText().isEmpty()) {
            JT10.setText("");
        }
        if (JT11.getText() != "" && JT5.getText().isEmpty()) {
            JT11.setText("");
            JT19.setText("");
            JT20.setText("");
        }
        if (JT5.getText() != "" && JT2.getText().isEmpty()) {
            JT5.setText("");
            JT10.setText("");
            JT11.setText("");
            JT19.setText("");
            JT20.setText("");
        }
        if (JT21.getText() != "" && JT13.getText().isEmpty()) {
            JT21.setText("");
        }
        if (JT22.getText() != "" && JT13.getText().isEmpty()) {
            JT22.setText("");
        }
        if (JT12.getText() != "" && JT7.getText().isEmpty()) {
            JT12.setText("");
        }
        if (JT13.getText() != "" && JT7.getText().isEmpty()) {
            JT13.setText("");
        }
        if (JT6.getText() != "" && JT3.getText().isEmpty()) {
            JT6.setText("");
        }
        if (JT7.getText() != "" && JT3.getText().isEmpty()) {
            JT7.setText("");
            JT12.setText("");
            JT13.setText("");
            JT21.setText("");
            JT22.setText("");
        }
        if (JT2.getText() != "" && JT1.getText().isEmpty()) {
            JT2.setText("");
            JT4.setText("");
            JT5.setText("");
            JT8.setText("");
            JT9.setText("");
            JT10.setText("");
            JT11.setText("");
            JT15.setText("");
            JT16.setText("");
            JT17.setText("");
            JT18.setText("");
            JT19.setText("");
            JT20.setText("");
        }
        if (JT3.getText() != "" && JT1.getText().isEmpty()) {
            JT3.setText("");
            JT6.setText("");
            JT7.setText("");
            JT12.setText("");
            JT13.setText("");
            JT21.setText("");
            JT22.setText("");
        }
    }

    public static String strResultado;

    public void preOrderArchivo() {
        try {
            FileWriter escribir = new FileWriter("src\\recorridos_archivos\\" + "PRE ORDER" + ".txt");
            PrintWriter texto = new PrintWriter(escribir);
            //valores que contiene el archivo
            texto.println(
                    "Recorrido Final:\n" + strResultado.replace("-1,", "")
            );
            texto.close();
            System.out.println("Archivo guardado correctamente");
        } catch (IOException ex) {
            System.out.println("Error al guardar el recorrido " + strResultado + " " + ex);
        }
    }

    public void postOrderArchivo() {
        try {
            FileWriter escribir = new FileWriter("src\\recorridos_archivos\\" + "POST ORDER" + ".txt");
            PrintWriter texto = new PrintWriter(escribir);
            //valores que contiene el archivo
            texto.println(
                    "Recorrido Final:\n" + strResultado.replace("-1,", "")
            );
            texto.close();
            System.out.println("Archivo guardado correctamente");
        } catch (IOException ex) {
            System.out.println("Error al guardar el recorrido " + strResultado + " " + ex);
        }
    }

    public void inOrderArchivo() {
        try {
            FileWriter escribir = new FileWriter("src\\recorridos_archivos\\" + "IN ORDER" + ".txt");
            PrintWriter texto = new PrintWriter(escribir);
            //valores que contiene el archivo
            texto.println(
                    "Recorrido Final:\n" + strResultado.replace("-1,", "")
            );
            texto.close();
            System.out.println("Archivo guardado correctamente");
        } catch (IOException ex) {
            System.out.println("Error al guardar el recorrido " + strResultado + " " + ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTPanel = new javax.swing.JPanel();
        btnPreorder = new javax.swing.JButton();
        btnInorder = new javax.swing.JButton();
        btnPostorder = new javax.swing.JButton();
        JT1 = new javax.swing.JTextField();
        JT2 = new javax.swing.JTextField();
        JT3 = new javax.swing.JTextField();
        JT4 = new javax.swing.JTextField();
        JT5 = new javax.swing.JTextField();
        JT6 = new javax.swing.JTextField();
        JT7 = new javax.swing.JTextField();
        JT8 = new javax.swing.JTextField();
        JT9 = new javax.swing.JTextField();
        JT10 = new javax.swing.JTextField();
        JT11 = new javax.swing.JTextField();
        JT12 = new javax.swing.JTextField();
        JT13 = new javax.swing.JTextField();
        JT14 = new javax.swing.JTextField();
        JT15 = new javax.swing.JTextField();
        JT16 = new javax.swing.JTextField();
        JT17 = new javax.swing.JTextField();
        JT18 = new javax.swing.JTextField();
        JT19 = new javax.swing.JTextField();
        JT20 = new javax.swing.JTextField();
        JT21 = new javax.swing.JTextField();
        JT22 = new javax.swing.JTextField();
        JT23 = new javax.swing.JTextField();
        JT24 = new javax.swing.JTextField();
        JT25 = new javax.swing.JTextField();
        JT26 = new javax.swing.JTextField();
        JT27 = new javax.swing.JTextField();
        JT28 = new javax.swing.JTextField();
        JT29 = new javax.swing.JTextField();
        JT30 = new javax.swing.JTextField();
        JT31 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Resultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTPanel.setBackground(new java.awt.Color(255, 255, 255));
        JTPanel.setPreferredSize(new java.awt.Dimension(1400, 600));

        btnPreorder.setText("Pre order");
        btnPreorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreorderActionPerformed(evt);
            }
        });

        btnInorder.setText("In order");
        btnInorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInorderActionPerformed(evt);
            }
        });

        btnPostorder.setText("Post order");
        btnPostorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostorderActionPerformed(evt);
            }
        });

        JT1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JT1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JT1.setBorder(null);
        JT1.setHighlighter(null);
        JT1.setPreferredSize(new java.awt.Dimension(30, 30));
        JT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT1ActionPerformed(evt);
            }
        });
        JT1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JT1KeyTyped(evt);
            }
        });

        JT2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JT2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JT2.setBorder(null);
        JT2.setHighlighter(null);
        JT2.setPreferredSize(new java.awt.Dimension(30, 30));
        JT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT2ActionPerformed(evt);
            }
        });
        JT2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JT2KeyTyped(evt);
            }
        });

        JT3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JT3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JT3.setBorder(null);
        JT3.setHighlighter(null);
        JT3.setPreferredSize(new java.awt.Dimension(30, 30));
        JT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT3ActionPerformed(evt);
            }
        });

        JT4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JT4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JT4.setBorder(null);
        JT4.setHighlighter(null);
        JT4.setPreferredSize(new java.awt.Dimension(30, 30));
        JT4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT4ActionPerformed(evt);
            }
        });

        JT5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JT5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JT5.setBorder(null);
        JT5.setHighlighter(null);
        JT5.setPreferredSize(new java.awt.Dimension(30, 30));
        JT5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT5ActionPerformed(evt);
            }
        });

        JT6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JT6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JT6.setBorder(null);
        JT6.setHighlighter(null);
        JT6.setPreferredSize(new java.awt.Dimension(30, 30));
        JT6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT6ActionPerformed(evt);
            }
        });

        JT7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JT7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JT7.setBorder(null);
        JT7.setHighlighter(null);
        JT7.setPreferredSize(new java.awt.Dimension(30, 30));
        JT7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT7ActionPerformed(evt);
            }
        });

        JT8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JT8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JT8.setBorder(null);
        JT8.setHighlighter(null);
        JT8.setPreferredSize(new java.awt.Dimension(30, 30));
        JT8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT8ActionPerformed(evt);
            }
        });

        JT9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JT9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JT9.setBorder(null);
        JT9.setHighlighter(null);
        JT9.setPreferredSize(new java.awt.Dimension(30, 30));
        JT9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT9ActionPerformed(evt);
            }
        });

        JT10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JT10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JT10.setBorder(null);
        JT10.setHighlighter(null);
        JT10.setPreferredSize(new java.awt.Dimension(30, 30));
        JT10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT10ActionPerformed(evt);
            }
        });

        JT11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JT11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JT11.setBorder(null);
        JT11.setHighlighter(null);
        JT11.setPreferredSize(new java.awt.Dimension(30, 30));
        JT11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT11ActionPerformed(evt);
            }
        });

        JT12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JT12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JT12.setBorder(null);
        JT12.setHighlighter(null);
        JT12.setPreferredSize(new java.awt.Dimension(30, 30));
        JT12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT12ActionPerformed(evt);
            }
        });

        JT13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JT13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JT13.setBorder(null);
        JT13.setHighlighter(null);
        JT13.setPreferredSize(new java.awt.Dimension(30, 30));
        JT13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT13ActionPerformed(evt);
            }
        });

        JT14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JT14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JT14.setBorder(null);
        JT14.setHighlighter(null);
        JT14.setPreferredSize(new java.awt.Dimension(30, 30));
        JT14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT14ActionPerformed(evt);
            }
        });

        JT15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JT15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JT15.setBorder(null);
        JT15.setHighlighter(null);
        JT15.setPreferredSize(new java.awt.Dimension(30, 30));
        JT15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT15ActionPerformed(evt);
            }
        });

        JT16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JT16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JT16.setBorder(null);
        JT16.setHighlighter(null);
        JT16.setPreferredSize(new java.awt.Dimension(30, 30));
        JT16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT16ActionPerformed(evt);
            }
        });

        JT17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JT17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JT17.setBorder(null);
        JT17.setHighlighter(null);
        JT17.setPreferredSize(new java.awt.Dimension(30, 30));
        JT17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT17ActionPerformed(evt);
            }
        });

        JT18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JT18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JT18.setBorder(null);
        JT18.setHighlighter(null);
        JT18.setPreferredSize(new java.awt.Dimension(30, 30));
        JT18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT18ActionPerformed(evt);
            }
        });

        JT19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JT19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JT19.setBorder(null);
        JT19.setHighlighter(null);
        JT19.setPreferredSize(new java.awt.Dimension(30, 30));
        JT19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT19ActionPerformed(evt);
            }
        });

        JT20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JT20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JT20.setBorder(null);
        JT20.setHighlighter(null);
        JT20.setPreferredSize(new java.awt.Dimension(30, 30));
        JT20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT20ActionPerformed(evt);
            }
        });

        JT21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JT21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JT21.setBorder(null);
        JT21.setHighlighter(null);
        JT21.setPreferredSize(new java.awt.Dimension(30, 30));
        JT21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT21ActionPerformed(evt);
            }
        });

        JT22.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JT22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JT22.setBorder(null);
        JT22.setHighlighter(null);
        JT22.setPreferredSize(new java.awt.Dimension(30, 30));
        JT22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT22ActionPerformed(evt);
            }
        });

        JT23.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JT23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JT23.setBorder(null);
        JT23.setHighlighter(null);
        JT23.setPreferredSize(new java.awt.Dimension(30, 30));
        JT23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT23ActionPerformed(evt);
            }
        });

        JT24.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JT24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JT24.setBorder(null);
        JT24.setHighlighter(null);
        JT24.setPreferredSize(new java.awt.Dimension(30, 30));
        JT24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT24ActionPerformed(evt);
            }
        });

        JT25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JT25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JT25.setBorder(null);
        JT25.setHighlighter(null);
        JT25.setPreferredSize(new java.awt.Dimension(30, 30));
        JT25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT25ActionPerformed(evt);
            }
        });

        JT26.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JT26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JT26.setBorder(null);
        JT26.setHighlighter(null);
        JT26.setPreferredSize(new java.awt.Dimension(30, 30));
        JT26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT26ActionPerformed(evt);
            }
        });

        JT27.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JT27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JT27.setBorder(null);
        JT27.setHighlighter(null);
        JT27.setPreferredSize(new java.awt.Dimension(30, 30));
        JT27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT27ActionPerformed(evt);
            }
        });

        JT28.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JT28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JT28.setBorder(null);
        JT28.setHighlighter(null);
        JT28.setPreferredSize(new java.awt.Dimension(30, 30));
        JT28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT28ActionPerformed(evt);
            }
        });

        JT29.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JT29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JT29.setBorder(null);
        JT29.setHighlighter(null);
        JT29.setPreferredSize(new java.awt.Dimension(30, 30));
        JT29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT29ActionPerformed(evt);
            }
        });

        JT30.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JT30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JT30.setBorder(null);
        JT30.setHighlighter(null);
        JT30.setPreferredSize(new java.awt.Dimension(30, 30));
        JT30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT30ActionPerformed(evt);
            }
        });

        JT31.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JT31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JT31.setBorder(null);
        JT31.setHighlighter(null);
        JT31.setPreferredSize(new java.awt.Dimension(30, 30));
        JT31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT31ActionPerformed(evt);
            }
        });

        Resultado.setColumns(20);
        Resultado.setRows(5);
        jScrollPane1.setViewportView(Resultado);

        javax.swing.GroupLayout JTPanelLayout = new javax.swing.GroupLayout(JTPanel);
        JTPanel.setLayout(JTPanelLayout);
        JTPanelLayout.setHorizontalGroup(
            JTPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JTPanelLayout.createSequentialGroup()
                .addGap(357, 357, 357)
                .addComponent(JT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JT3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(412, 412, 412))
            .addGroup(JTPanelLayout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(JT4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(265, 265, 265)
                .addComponent(JT5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JT6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(265, 265, 265)
                .addComponent(JT7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(266, 266, 266))
            .addGroup(JTPanelLayout.createSequentialGroup()
                .addGroup(JTPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JTPanelLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(JT8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)
                        .addComponent(JT9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(JT10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)
                        .addComponent(JT11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(JT12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)
                        .addComponent(JT13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(JT14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)
                        .addComponent(JT15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JTPanelLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(JT16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(JT17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(JT18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(JT19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(JT20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(JT21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(JT22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(JT23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(JT24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(JT25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(JT26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(JT27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(JT28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(JT29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(JT30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(JT31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JTPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(JTPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(JTPanelLayout.createSequentialGroup()
                                .addComponent(btnPreorder, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnInorder, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPostorder, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(256, 256, 256)
                        .addComponent(JT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        JTPanelLayout.setVerticalGroup(
            JTPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JTPanelLayout.createSequentialGroup()
                .addGroup(JTPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JTPanelLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(JT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JTPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JTPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPreorder, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInorder, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPostorder, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addGroup(JTPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JT3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(JTPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JT5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JT6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JT7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JT4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(JTPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JT8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JT9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JT10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JT11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JT12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JT13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JT14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JT15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(JTPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JTPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JT24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JT25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JT26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JT27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JT28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JT29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JT30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JT31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JTPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JT20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JT21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JT22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JT23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JTPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JT18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JT19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JTPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JT16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JT17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(131, Short.MAX_VALUE))
        );

        getContentPane().add(JTPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPreorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreorderActionPerformed

        valid();
        String text1 = JT1.getText();
        String text2 = JT2.getText();
        String text3 = JT3.getText();
        String text4 = JT4.getText();
        String text5 = JT5.getText();
        String text6 = JT6.getText();
        String text7 = JT7.getText();
        String text8 = JT8.getText();
        String text9 = JT9.getText();
        String text10 = JT10.getText();
        String text11 = JT11.getText();
        String text12 = JT12.getText();
        String text13 = JT13.getText();
        String text15 = JT15.getText();
        String text16 = JT16.getText();
        String text17 = JT17.getText();
        String text18 = JT18.getText();
        String text19 = JT19.getText();
        String text20 = JT20.getText();
        String text21 = JT21.getText();
        String text22 = JT22.getText();

        Resultado.setText(text1 + "," + text2 + "," + text4 + "," + text8 + "," + text15 + "," + text16 + "," + text9
                + "," + text17 + "," + text18 + "," + text5 + "," + text10 + "," + text11 + "," + text19 + ","
                + text20 + "," + text3 + "," + text6 + "," + text7 + "," + text12 + "," + text13 + ","
                + text21 + "," + text22);
        strResultado = Resultado.getText();
        preOrderArchivo();
    }//GEN-LAST:event_btnPreorderActionPerformed

    private void btnInorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInorderActionPerformed

        valid();

        String text1 = JT1.getText();
        String text2 = JT12.getText();
        String text3 = JT3.getText();
        String text4 = JT4.getText();
        String text5 = JT5.getText();
        String text6 = JT6.getText();
        String text7 = JT7.getText();
        String text8 = JT8.getText();
        String text9 = JT9.getText();
        String text10 = JT10.getText();
        String text11 = JT11.getText();
        String text12 = JT12.getText();
        String text13 = JT13.getText();
        String text15 = JT15.getText();
        String text16 = JT16.getText();
        String text17 = JT17.getText();
        String text18 = JT18.getText();
        String text19 = JT19.getText();
        String text20 = JT20.getText();
        String text21 = JT21.getText();
        String text22 = JT22.getText();

        Resultado.setText(text15 + "," + text8 + "," + text16 + "," + text4 + "," + text17 + "," + text9 + "," + text18
                + "," + text2 + "," + text10 + "," + text5 + "," + text19 + "," + text11 + "," + text20 + ","
                + text1 + "," + text6 + "," + text3 + "," + text12 + "," + text7 + "," + text21 + ","
                + text13 + "," + text22);
        strResultado = Resultado.getText();
        inOrderArchivo();
    }//GEN-LAST:event_btnInorderActionPerformed

    private void btnPostorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostorderActionPerformed

        valid();
        String text1 = JT1.getText();
        String text2 = JT2.getText();
        String text3 = JT3.getText();
        String text4 = JT4.getText();
        String text5 = JT5.getText();
        String text6 = JT6.getText();
        String text7 = JT7.getText();
        String text8 = JT8.getText();
        String text9 = JT9.getText();
        String text10 = JT10.getText();
        String text11 = JT11.getText();
        String text12 = JT12.getText();
        String text13 = JT13.getText();
        String text15 = JT15.getText();
        String text16 = JT16.getText();
        String text17 = JT17.getText();
        String text18 = JT18.getText();
        String text19 = JT19.getText();
        String text20 = JT20.getText();
        String text21 = JT21.getText();
        String text22 = JT22.getText();

        Resultado.setText(text15 + "," + text16 + "," + text8 + "," + text17 + "," + text18 + "," + text9 + "," + text4
                + "," + text10 + "," + text19 + "," + text20 + "," + text11 + "," + text5 + "," + text2 + ","
                + text6 + "," + text12 + "," + text21 + "," + text22 + "," + text13 + "," + text7 + ","
                + text3 + "," + text1);
        strResultado = Resultado.getText();
        postOrderArchivo();
    }//GEN-LAST:event_btnPostorderActionPerformed

    private void JT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT1ActionPerformed

    private void JT1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JT1KeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_JT1KeyTyped

    private void JT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT2ActionPerformed

    private void JT2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JT2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JT2KeyTyped

    private void JT3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT3ActionPerformed

    private void JT4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT4ActionPerformed

    private void JT5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT5ActionPerformed

    private void JT6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT6ActionPerformed

    private void JT7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT7ActionPerformed

    private void JT8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT8ActionPerformed

    private void JT9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT9ActionPerformed

    private void JT10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT10ActionPerformed

    private void JT11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT11ActionPerformed

    private void JT12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT12ActionPerformed

    private void JT13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT13ActionPerformed

    private void JT14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT14ActionPerformed

    private void JT15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT15ActionPerformed

    private void JT16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT16ActionPerformed

    private void JT17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT17ActionPerformed

    private void JT18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT18ActionPerformed

    private void JT19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT19ActionPerformed

    private void JT20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT20ActionPerformed

    private void JT21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT21ActionPerformed

    private void JT22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT22ActionPerformed

    private void JT23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT23ActionPerformed

    private void JT24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT24ActionPerformed

    private void JT25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT25ActionPerformed

    private void JT26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT26ActionPerformed

    private void JT27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT27ActionPerformed

    private void JT28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT28ActionPerformed

    private void JT29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT29ActionPerformed

    private void JT30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT30ActionPerformed

    private void JT31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT31ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Recorrido_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recorrido_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recorrido_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recorrido_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recorrido_v2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JT1;
    private javax.swing.JTextField JT10;
    private javax.swing.JTextField JT11;
    private javax.swing.JTextField JT12;
    private javax.swing.JTextField JT13;
    private javax.swing.JTextField JT14;
    private javax.swing.JTextField JT15;
    private javax.swing.JTextField JT16;
    private javax.swing.JTextField JT17;
    private javax.swing.JTextField JT18;
    private javax.swing.JTextField JT19;
    private javax.swing.JTextField JT2;
    private javax.swing.JTextField JT20;
    private javax.swing.JTextField JT21;
    private javax.swing.JTextField JT22;
    private javax.swing.JTextField JT23;
    private javax.swing.JTextField JT24;
    private javax.swing.JTextField JT25;
    private javax.swing.JTextField JT26;
    private javax.swing.JTextField JT27;
    private javax.swing.JTextField JT28;
    private javax.swing.JTextField JT29;
    private javax.swing.JTextField JT3;
    private javax.swing.JTextField JT30;
    private javax.swing.JTextField JT31;
    private javax.swing.JTextField JT4;
    private javax.swing.JTextField JT5;
    private javax.swing.JTextField JT6;
    private javax.swing.JTextField JT7;
    private javax.swing.JTextField JT8;
    private javax.swing.JTextField JT9;
    private javax.swing.JPanel JTPanel;
    private javax.swing.JTextArea Resultado;
    private javax.swing.JButton btnInorder;
    private javax.swing.JButton btnPostorder;
    private javax.swing.JButton btnPreorder;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
