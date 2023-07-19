package co.com.coding.together.designpatterns.structural.adapter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;

public class XMLReportAdapter implements ProductsReport {
    private XMLReport xmlReport;

    public XMLReportAdapter(XMLReport xmlReport) {
        this.xmlReport = xmlReport;
    }

    @Override
    public String generateReport() throws IOException {
        String xmlReportData = xmlReport.generateXMLReport();

        String jsonReportData = adaptXMLtoJSON(xmlReportData);

        return jsonReportData;
    }

    private String adaptXMLtoJSON(String xmlData) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        ObjectMapper jsonMapper = new ObjectMapper();

        JsonNode jsonNode = xmlMapper.readTree(xmlData);

        String jsonData = jsonMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode);

        return jsonData;
    }
}