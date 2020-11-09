/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploFrame;

/**
 *
 * @author borja
 */
public class EjemploFrameAPP extends java.awt.Frame {

    /**
     * Creates new form EjemploFrameAPP
     */
    public EjemploFrameAPP() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws InterruptedException {
        int ancho = 600, alto = 400;

        EjemploFrameAPP f = new EjemploFrameAPP();
        f.setSize(ancho, alto);
        f.setTitle("Ejemplo de Frame");
        VistaCanvas cv = new VistaCanvas(ancho, alto);
        f.add(cv);
        f.setVisible(true);

        Recurso r = new Recurso(cv);
        Thread h1 = new Thread(new Sumador(r, 0));
        Thread h2 = new Thread(new Sumador(r, 1));
        Thread h3 = new Thread(new Sumador(r, 1));
        h1.start();
        h2.start();
        h3.start();
        h1.join();
        h2.join();
        h3.join();
        int[] valores = r.getContadores();
        System.out.println("MAIN: Los contadores valen: " + valores[0] + " " + valores[1]);
        
        Thread.sleep(5000);
        System.exit(0);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}