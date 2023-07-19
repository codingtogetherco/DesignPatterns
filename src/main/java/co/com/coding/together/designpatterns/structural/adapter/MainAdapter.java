package co.com.coding.together.designpatterns.structural.adapter;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;

public class MainAdapter {
    public static void main(String[] args) throws IOException {
        XMLReport xmlReport = new XMLReport();

        ProductsReport jsonReport = new XMLReportAdapter(xmlReport);

        String jsonReportData = jsonReport.generateReport();

        System.out.println(jsonReportData);
    }
}
