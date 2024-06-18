package datos;

import datos.EnvioCorreo;

public class Correos {

  public void CorreoBienvenida(String email, String name) {
    String subject = "¡Bienvenido a la familia Acantilados FC!";
    String content = "<html><body>"
            + "<h1>¡Atención Taurón!</h1>"
            + "<p>Estimado/a " + name + ",</p>"
            + "<p>¡Nos llena de alegría darte la bienvenida a la gran familia Acantilados FC!</p>"
            + "<p>Tu pasión por el fútbol y tu apoyo a nuestro equipo son fundamentales para seguir cosechando éxitos en la cancha.</p>"
            + "<p>Como nuevo miembro, podrás disfrutar de los siguientes beneficios:</p>"
            + "<ul>"
            + "<li>Entrada gratuita a los partidos de local de las filiales</li>"
            + "<li>50% de descuento en los partidos de primera</li>"
            + "<li>Descuentos exclusivos en el merchandising oficial del club</li>"
            + "<li>Invitaciones a eventos exclusivos del club</li>"
            + "<li>Oportunidad de participar en sorteos y concursos</li>"
            + "</ul>"
            + "<p>¡Te esperamos en el próximo partido!</p>"
            + "<p>¡Acantilados FC, pasión que nos une!</p>"
            + "<p>#AcantiladosFC #Taurones #PasiónQueNosUne</p>"
            + "<img src=\"cid:image\">"
            + "</body></html>";

    String imagePath = "src/com/emailPics/BIENVENIDA.png";
    EnvioCorreo envio = new EnvioCorreo(email, subject, content, imagePath);
    envio.createEmail();
    envio.sendEmail();
}

    public void CorreoDeuda(String email) {
        String subject = "NOTIFICACION DE DEUDA:"; // Título de bandeja de entrada
        String content = "<html><body>"
                + "<h1>¡Atención Tauron!</h1>" // Título en negrita
                + "<p>Es hora de demostrar tu pasión por Acantilados FC.<br>"
                + "El equipo que nos llena de orgullo y emoción necesita tu apoyo para seguir brillando en la cancha.<br>"
                + "¡No te quedes atrás!<br>"
                + "Regulariza tu situación de pago y sé parte de la victoria.</p>" // Texto
                + "<img src=\"cid:image\">" // Imagen
                + "</body></html>";
        String imagePath = "src/emailPics/DEUDA.png"; // Ubicación y nombre de la imagen
        EnvioCorreo envio = new EnvioCorreo(email, subject, content, imagePath);
        envio.createEmail();
        envio.sendEmail();
    }

    public void CorreoPagoSalario(String email, String name) {
        String subject = "¡Gracias por tu trabajo!"; // Título de bandeja de entrada
        String content = "<html><body>"
                + "<h1>Estimado/a " + name + "</h1>" // Título en negrita
                + "<p>Te informamos que tu sueldo ha sido abonado correctamente.<br>"
                + "Si tienes alguna duda o consulta sobre tu salario, no dudes en comunicarte con el departamento de recursos humanos o con la administración.<br>"
                + "¡Gracias por tu compromiso y dedicación a Acantilados FC!<br>"
                + "¡Juntos, somos más fuertes!<br>"
                + "¡Acantilados FC, pasión que nos une!<br>"
                + "#AcantiladosFC #Taurones #PasiónQueNosUne #GraciasPorTuTrabajo</p>" // Texto
                + "<img src=\"cid:image\">" // Imagen
                + "</body></html>";
        String imagePath = "src/emailPics/SUELDO.png"; // Ubicación y nombre de la imagen
        EnvioCorreo envio = new EnvioCorreo(email, subject, content, imagePath);
        envio.createEmail();
        envio.sendEmail();
    }

    public void CorreoPagoSocio(String email, String name, String date, double payment) {
        String subject = "Recibo Pago de la Cuota"; // Título de bandeja de entrada
        String content = "<html><body>"
                + "<h1>¡Gracias por tu pago!</h1>" // Título en negrita
                + "<p>Estimado/a " + name + ",<br>"
                + "¡Muchas gracias por regularizar tu situación de pago!<br>"
                + "Tu apoyo es fundamental para el éxito de Acantilados FC.<br>"
                + "A continuación, te detallamos los datos de tu pago:<br>"
                + "Fecha de pago: " + date + "<br>"
                + "Monto del pago: $" + payment + "<br>"
                + "Te invitamos a seguir apoyando a nuestro equipo con pasión.<br>"
                + "¡Juntos, somos más fuertes!<br>"
                + "¡Acantilados FC, pasión que nos une!<br>"
                + "#AcantiladosFC #Taurones #PasiónQueNosUne #GraciasPorTuApoyo</p>" // Texto
                + "<img src=\"cid:image\">" // Imagen
                + "</body></html>";
        String imagePath = "src/com/emailPics/PAGO_SOCIO.png"; // Ubicación y nombre de la imagen
        EnvioCorreo envio = new EnvioCorreo(email, subject, content, imagePath);
        envio.createEmail();
        envio.sendEmail();
    }

    public void CorreoAptoMedicoRequerido(String email, String name) {
        String subject = "¡Importante! Apto Médico Requerido";
        String content = "<html><body>"
                + "<h1>Estimado/a " + name + ",</h1>"
                + "<p>Queremos recordarte que es necesario realizar tu apto médico para poder continuar participando en las actividades de Acantilados FC.<br>"
                + "Por favor, agenda una cita con tu médico lo antes posible y envíanos el certificado correspondiente.<br>"
                + "Tu salud y bienestar son nuestra prioridad.</p>"
                + "<p>¡Gracias por tu cooperación!</p>"
                + "<p>Atentamente,<br>Acantilados FC</p>"
                + "<img src=\"cid:image\">" // Imagen opcional
                + "</body></html>";
        String imagePath = "src/emailPics/APTO_MEDICO_REQUERIDO.png"; // Ubicación y nombre de la imagen
        EnvioCorreo envio = new EnvioCorreo(email, subject, content, imagePath);
        envio.createEmail();
        envio.sendEmail();
    }

    public void CorreoAptoMedicoExitoso(String email, String name) {
        String subject = "¡Apto Médico Exitoso!";
        String content = "<html><body>"
                + "<h1>¡Atención Taurón!</h1>"
                + "<p>¡Felicitaciones"+  name +" </p>"
                + "<p>Nos complace informarte que has pasado satisfactoriamente tu apto médico.<br>"
                + "Ahora puedes continuar participando en todas las actividades de Acantilados FC sin ningún inconveniente.<br>"
                + "Gracias por cuidar de tu salud y por ser parte de nuestro equipo."
                + "<ul>"
                + "<p>¡Vamos por más éxitos juntos!</p>" +
                "<p>Atentamente,<br>Acantilados FC</p>"
                + "</ul>"
                + "<p>¡Acantilados FC, pasión que nos une!</p>"
                + "<p>#AcantiladosFC #Taurones #PasiónQueNosUne</p>"
                + "<img src=\"cid:image\">"
                + "</body></html>";

        String imagePath = "src/com/emailPics/APTO_MEDICO_EXITOSO.png";
        EnvioCorreo envio = new EnvioCorreo(email, subject, content, imagePath);
        envio.createEmail();
        envio.sendEmail();
    }
    public void CorreoAptoMedicoRechazado(String email, String name, String mensaje) {
        String subject = "Situacion apto medico";
        String content = "<html><body>"
                + "<h1>¡Atención Taurón!</h1>"
                + "<p>Estimado " +  name +" </p>"
                + "<p>Lamentamos informarte que el certificado médico que presentaste ha sido rechazado con el siguiente motivo: " + mensaje + "</p>"+
                "<p> Para resolver esta situación, te recomendamos que te comuniques con el Dr. Salvetti del Club Deportivo para poder realizar nuevamente la certificacion cuando hayas realizado tu tratamiento!</p>" +
                "<p>Gracias por tu atención y colaboración.</p>" +
                "<p>Atentamente,<br>Acantilados FC</p>"
                + "</ul>"
                + "<p>¡Acantilados FC, pasión que nos une!</p>"
                + "<p>#AcantiladosFC #Taurones #PasiónQueNosUne</p>"
                + "<img src=\"cid:image\">"
                + "</body></html>";

        String imagePath = "src/com/emailPics/APTO_MEDICO_RECHAZADO.png";
        EnvioCorreo envio = new EnvioCorreo(email, subject, content, imagePath);
        envio.createEmail();
        envio.sendEmail();
    }
}
