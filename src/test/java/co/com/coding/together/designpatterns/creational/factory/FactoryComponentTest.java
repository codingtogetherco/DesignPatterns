package co.com.coding.together.designpatterns.creational.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.slf4j.Logger;

import static org.mockito.Mockito.*;

class FactoryComponentTest {
    @Mock
    MyFactory factory;
    @Mock
    Logger log;
    @InjectMocks
    @Spy
    FactoryComponent factoryComponent;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testRun() throws Exception {
        when(factory.getImplementation(anyString())).thenReturn(new Paypal());
        when(factoryComponent.getImplementation()).thenReturn(Mockito.mock(Paypal.class));
        factoryComponent.run("args");
    }


    @Test
    void testmyNewMethod() throws Exception {
        String result = factoryComponent.myNewMethod();
        Assertions.assertEquals("Mystring", result);
    }

}

