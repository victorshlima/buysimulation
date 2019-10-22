package com.automationpratice.component.controller.util;

import com.automationpratice.component.controller.model.Order;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Class created to readFiles of downloader.
 *
 * @author jsouza.dbc
 * @version 1.0
 */
public class ReadFile {

    private static final Logger logger = LoggerFactory.getLogger(ReadFile.class);

    /**
     * Method to read all users from a file XML.
     *
     * @return users List<User>
     */
    @SuppressWarnings("unchecked")
    public List<Order> readUsersFromXML() {
        logger.debug("Iniciando metodo ReadFile.readUsersFromXML()");
        List<Order> usuarios = null;
        try {
            final XStream xStream = new XStream(new DomDriver());
            xStream.alias("users", List.class);
            xStream.alias("user", Order.class);
            final BufferedReader input = new BufferedReader(new FileReader(DriverUtil.getInstance().getPathOfUsersFile()));
            usuarios = (ArrayList<Order>) xStream.fromXML(input);
        } catch (final IOException ex) {
            logger.error("Erro ao carregar arquivo usuarios.xml" + ex.toString());
            ex.printStackTrace();
        }
        logger.debug("Finalizado com sucesso metodo ReadFile.readUsersFromXML()");
        return usuarios;
    }

}
