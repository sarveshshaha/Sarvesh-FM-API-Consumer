package com.sarvesh.fm.jsonapiprocessor;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**UserAPITests Class for tests concerning the UserAPI
 * @author Sarvesh Shaha
 */
public class UserAPITests extends JsonapiprocessorApplicationTests {
    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    /**Initializes the mockMvc using the WebApplicationContext before each test
     */
    @BeforeEach
    public void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    /**Tests the get Users API
     * @throws Exception When the API call is not successful or returns a null result
     */
    @Test
    public void testUserAPI() throws Exception {
        MvcResult result = mockMvc.perform(get("/api/users")).andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andReturn();

        assertNotNull(result);
    }
}
