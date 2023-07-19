package co.com.coding.together.designpatterns.structural.adapter;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;

public interface ProductsReport {

    String generateReport() throws IOException;
}
