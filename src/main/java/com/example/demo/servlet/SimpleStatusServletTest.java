package com.example.demo.servlet;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class SimpleStatusServletTest {

    static class TestServlet extends SimpleStatusServlet {
        public void callDoGet(HttpServletRequest req, HttpServletResponse res) throws Exception {
            super.doGet(req, res);
        }
    }

    @Test
    void testDoGet() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);

        var writer = mock(java.io.PrintWriter.class);
        when(response.getWriter()).thenReturn(writer);

        TestServlet servlet = new TestServlet();
        servlet.callDoGet(request, response);

        verify(writer)
            .write("Digital Credential Verification Engine is running");
    }
}
