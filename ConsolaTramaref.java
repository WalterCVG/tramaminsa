package hep.tramarefminsa;

import com.google.gson.Gson;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import org.json.simple.JSONObject;
import org.json.simple.parser.*;

/**
 *
 * @author Walter
 */
public class ConsolaTramaref extends javax.swing.JFrame {

    public ConsolaTramaref() {
        initComponents();
        EnvioTrama();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTxNroexped = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxPaso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTxCodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxMensaje = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jTxIdreferencia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTxNroreferencia = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Envio referencia");

        jLabel2.setText("Numero");

        jLabel3.setText("paso....");

        jLabel4.setText("Còdigo respuesta");

        jLabel5.setText("Mensaje");

        jTxMensaje.setColumns(20);
        jTxMensaje.setRows(5);
        jScrollPane1.setViewportView(jTxMensaje);

        jLabel6.setText("Id referencia");

        jLabel7.setText("Nro. referencia");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTxNroexped, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTxPaso)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxIdreferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTxNroreferencia, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxNroexped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTxPaso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTxIdreferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTxNroreferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsolaTramaref.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsolaTramaref.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsolaTramaref.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsolaTramaref.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
// if(args.length==1){
//     //le pasaron solo un parametro
//     String nroexp=args[0];
//  }
//  else if(args.length==2){
//       String nroexp=args[0];
//       String parametro2=args[1];
//  }
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsolaTramaref().setVisible(true);
            }
        });

//        instancia para llamar metodo no static
         ConsolaTramaref d=new ConsolaTramaref();
         d.EnvioTrama(); // to call the non-static method

//        EnvioTrama(nroexp);
    }

    private void EnvioTrama() {
        //Creo y llenamos nuestros objetos contenidos en TramaRefcon 
        PacienteControl nro = new PacienteControl();
        String nroexp = "";
        try {
            nroexp = nro.CogeNro();
            jTxNroexped.setText(nroexp);
        } catch (Exception ex) {
            Logger.getLogger(ConsolaTramaref.class.getName()).log(Level.SEVERE, null, ex);
        }

//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //Esta variable res la usaremos únicamente para dar un respuesta final
        String res = "";
        String URL = "https://dservicios.minsa.gob.pe/mcs-sihce-refcon/";
        try {
//Creo el cliente de conexión al API Restful
            Client client = ClientBuilder.newClient();
//Creo el target lo cuál es nuestra URL junto con el nombre del método a llamar
            WebTarget target = client.target(URL + "refcon/integracion/v1.0/referencia/saveReferencia");

            final String username = "00006212";
            final String ipclient = "179.49.70.195";

            MultivaluedMap<String, Object> myHeaders = new MultivaluedHashMap<String, Object>();
            myHeaders.add("username", username);
            myHeaders.add("ipclient", ipclient);
//Creo nuestra solicitud que realizará el request
            Invocation.Builder solicitud = target.request();
            solicitud.headers(myHeaders);

            //crear objeto de la clase PacienteControl
            PacienteControl obj = new PacienteControl();
//          Paciente pac = obj.PacienteLeer();
            Paciente pac = obj.PacienteLeer();
            System.out.println("paso pac " + pac.getApelpatpac());
             jTxNroexped.setText(nroexp);
 jTxPaso.setText("paso pac " + pac.getApelpatpac());

            //crear objeto de la clase ResponsableReferenciaControl
            ResponsableReferenciaControl obj1 = new ResponsableReferenciaControl();
//            Responsable_Referencia respref = obj1.RespRefLeer();
            Responsable_Referencia respref = obj1.RespRefLeer();
            System.out.println(respref.getNumdocref() + " " + respref.getApelpatrefiere() + " " + respref.getApelmatrefiere());
            System.out.println("paso respref ");
jTxPaso.setText("paso respref ");
            //crear objeto de la clase PersonaEstablecimientoControl
            PersonaEstablecimientoControl obj2 = new PersonaEstablecimientoControl();
//            Persona_Establecimiento persest = obj2.PersEstLeer();
            Persona_Establecimiento persest = obj2.PersEstLeer();
            System.out.println(persest.getNombper() + " - " + persest.getFechanac() + " - " + persest.getIdprofesion());
            System.out.println("paso persEstab ");

            //crear objeto de la clase ResponsableReferenciaControl
            PersonaAcompanaControl obj3 = new PersonaAcompanaControl();
//            Persona_Acompana persaco = obj3.PersAcoLeer();
            Persona_Acompana persaco = obj3.PersAcoLeer();
            System.out.println("paso persAcomp ");

            //crear objeto de la clase CitaControl
            CitaControl obj4 = new CitaControl();
            Cita cit = obj4.CitaLeer();
            System.out.println("paso Citas ");

            //crear objeto LIST de la clase Control
            DiagnosticoControl obj5 = new DiagnosticoControl();
            List<Diagnostico> diag = obj5.DiagListar();
            for (Diagnostico item : diag) {
                System.out.println(item.getDiagnostico() + " " + item.getTipo_diagnostico() + " " + item.getNro_diagnostico());
            };
            System.out.println("Dx ");

            //crear objeto LIST de la clase Control
            TratamientoControl obj6 = new TratamientoControl();
            if (obj6.TrataListar() != null) {
                List<Tratamiento> trata = obj6.TrataListar();
            } else {
                System.out.println("trata vacio");
            }
            System.out.println("paso trat ");

            //crear objeto List de la clase Cpt
            CptControl obj7 = new CptControl();
            Cpt c_pt = obj7.CptLeer();
            System.out.println("paso cpt ");

            //crear objeto de la clase Control  campos pertenecen a Datos_referencia
            MotivoReferenciaControl obj8 = new MotivoReferenciaControl();
            Motivo_Referencia motref = obj8.MotRefLeer();

            //crear objeto de la clase Datref
            DataReferControl obj9 = new DataReferControl();
            DataRefer datref = obj9.DatRefLeer();
            System.out.println(datref.getIdupsOrigen() + " " + datref.getIdupsdestino() + " " + datref.getCodEspecialidad());
            System.out.println("Fin Trama ");
jTxPaso.setText("Fin Trama ");
            //crear objeto de la clase DATOS_REFERENCIA
            Datos_Referencia dref = new Datos_Referencia();
            dref.setCodEspecialidad(datref.getCodEspecialidad());
            dref.setIdestabOrigen(datref.getIdestabOrigen());
            dref.setIdestabDestino(datref.getIdestabDestino());
            dref.setCondicion(datref.getCondicion());
            dref.setDesc_Cartera_servicio(datref.getDesc_Cartera_servicio());
            dref.setFechaReferencia(datref.getFechaReferencia());
            dref.setHoraReferencia(datref.getHoraReferencia());
            dref.setFgRegistro(datref.getFgRegistro());
            dref.setIdTipoAtencion(datref.getIdTipoAtencion());
            dref.setIdTipoTransporte(datref.getIdTipoTransporte());
            dref.setIdCarteraServicio(datref.getIdCarteraServicio());
            dref.setIdupsdestino(datref.getIdupsdestino());
            dref.setIdupsOrigen(datref.getIdupsOrigen());
            dref.setIdEnvio(datref.getIdEnvio());
            dref.setNotasObs(datref.getNotasObs());
            dref.setMotivo_referencia(motref);

            //crear objeto de la clase TramaRefcon que enviare
            TramaRefcon req = new TramaRefcon();

//          Insertar los arreglos de entidades pac, respref, persest, persaco, cit, diah, trata, c_pt, datref(motref)
            req.setPaciente(pac);
            System.out.println(" Req.pac ");
            req.setResponsable_referencia(respref);
            System.out.println(" Req.respref ");
            req.setPersona_establecimiento(persest);
            System.out.println(" Req.persEst ");
            req.setPersona_acompana(persaco);
            System.out.println(" Req.persAco ");
            req.setCita(cit);
            System.out.println(" Req.Cit ");
            req.setDiagnostico(diag);
            System.out.println(" Req.Dx ");
            req.setTratamiento(obj6.TrataListar());
            System.out.println(" Req.Trata ");
            req.setCpt(c_pt);
            System.out.println(" Req.Cpt ");
            req.setDatos_Referencia(dref);
            System.out.println(" Req.DatRef ");

            System.out.println("Fin carga objeto Req ");
jTxPaso.setText("Fin carga objeto Req ");
            //-Convertir string a archivo JSON  y grabar a disco 
            try ( BufferedWriter bw = new BufferedWriter(new FileWriter("c:/rpt/tr"+nroexp+".json"))) {
                Gson gson = new Gson();
                String jsonString = gson.toJson(req);
                bw.write(jsonString);
                System.out.println("Json grabado " + nroexp);
            } catch (IOException ex) {
                System.out.println("Error " + ex);
            }

            //-Convertimos el objeto req a un json
//            Gson gson = new Gson();
//            String jsonString = gson.toJson(req);
//            System.out.println(jsonString);

//-Enviamos nuestro json vía post al API Restful
//            Response post = solicitud.post(Entity.json(jsonString));
//            System.out.println("json enviado...");
//-Recibimos la respuesta y la leemos en una clase de tipo String, en caso de que el json sea tipo json y no string, debemos usar la clase de tipo JsonObject.class en lugar de String.class
//            String responseJson = post.readEntity(String.class);
//            res = responseJson;

//      {"respuesta":{"codRespuesta":"0000","mensajeRespuesta":"reg satisfactorio"},
//      "idReferencia":1360642,"nro_referencia":"6000-00279"} 
//      {"respuesta":{"codRespuesta":"0164","mensajeRespuesta":"Inconsistencia en el valor de 'idupsdestino'"},
//      "idReferencia":null,"nro_referencia":null}
//-Imprimimos el status de la solicitud cod_respuesta
//            System.out.println("Estatus: " + post.getStatus());


//            switch (post.getStatus()) {
//                case 200:
//                    //-grabar respuesta a disco 
//                    String Fileresp = "c:/rpt/rr"+nroexp+".json";
//                    try ( BufferedWriter bw = new BufferedWriter(new FileWriter(Fileresp))) {
//                        bw.write(res);
//                        System.out.println("file respuesta grabado " + nroexp);
//
//                        // Extraer valores del objeto JSON recibido         
//                        JSONParser parser = new JSONParser();
//                        try {
//                            Object objson = parser.parse(responseJson);
//                            JSONObject jsonObject = (JSONObject) objson;
//                            //long idRef = (Long) jsonObject.get("idReferencia");
//                            String idRef = (String) jsonObject.get("idReferencia");
//                            String nroRef = (String) jsonObject.get("nro_referencia");
////      JSONArray subjects = (JSONArray)jsonObject.get("Subjects");
//                            JSONObject respta = (JSONObject) jsonObject.get("respuesta");
//                            String codigo = (String) respta.get("codRespuesta");
//                            String mensaje = (String) respta.get("mensajeRespuesta");
//                            System.out.println("Exp. evaluado: " + nroexp);
//                            System.out.println("Codigo: " + codigo);
//                            System.out.println("Mensaje: " + mensaje);
//                            System.out.println("Idreferencia: " + idRef);
//                            System.out.println("Nro Referencia: " + nroRef);
//                            if (codigo.equals("0000") || (codigo == "0000")) {
////                             if (codigo == "0000") {    
////                                Grabaregistro(nroexp, idRef, nroRef);
//                            } else {
//                                System.out.println("No paso [[" + codigo + "]");
//                            };
//
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                        }
//
//                    } catch (IOException ex) {
//                        System.out.println("Error " + ex);
//                    }
//                    break;
//                default:
//                    res = "Error";
//                    break;
//            }
            
            
        } catch (Exception e) {
//-En caso de error envio de solicitud, llenaremos res con la exceptión que sucedió
            res = e.toString();
        }
        System.out.println("proceso completado..");
        jTxPaso.setText("completò proceso .."+nroexp);
    }
    ;
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTxCodigo;
    private javax.swing.JTextField jTxIdreferencia;
    private javax.swing.JTextArea jTxMensaje;
    private javax.swing.JTextField jTxNroexped;
    private javax.swing.JTextField jTxNroreferencia;
    private javax.swing.JTextField jTxPaso;
    // End of variables declaration//GEN-END:variables
}
