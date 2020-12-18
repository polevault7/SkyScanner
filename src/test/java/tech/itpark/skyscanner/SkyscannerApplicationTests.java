package tech.itpark.skyscanner;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
@AutoConfigureMockMvc
class SkyscannerApplicationTests {
    @Autowired
    MockMvc mockMvc;

    @Test
    void crudTest() throws Exception{
        mockMvc.perform(get("/flights"))
                .andExpect(
                        content()
                                .json("[\n" +
                                        "  {\n" +
                                        "    \"id\": 1,\n" +
                                        "    \"aircraftId\": 1,\n" +
                                        "    \"sourceCity\": \"KAZAN\",\n" +
                                        "    \"destCity\": \"MOSCOW\",\n" +
                                        "    \"departureTime\": 1608163200000,\n" +
                                        "    \"arrivalTime\": 1500000,\n" +
                                        "    \"journeyDuration\": 100000,\n" +
                                        "    \"price\": 30000\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 2,\n" +
                                        "    \"aircraftId\": 2,\n" +
                                        "    \"sourceCity\": \"KAZAN\",\n" +
                                        "    \"destCity\": \"MOSCOW\",\n" +
                                        "    \"departureTime\": 1608163200000,\n" +
                                        "    \"arrivalTime\": 1500000,\n" +
                                        "    \"journeyDuration\": 10000,\n" +
                                        "    \"price\": 5000\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 3,\n" +
                                        "    \"aircraftId\": 2,\n" +
                                        "    \"sourceCity\": \"KAZAN\",\n" +
                                        "    \"destCity\": \"MOSCOW\",\n" +
                                        "    \"departureTime\": 1608163200000,\n" +
                                        "    \"arrivalTime\": 1500000,\n" +
                                        "    \"journeyDuration\": 50000,\n" +
                                        "    \"price\": 1000\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 4,\n" +
                                        "    \"aircraftId\": 2,\n" +
                                        "    \"sourceCity\": \"MILAN\",\n" +
                                        "    \"destCity\": \"PARIS\",\n" +
                                        "    \"departureTime\": 1608163200000,\n" +
                                        "    \"arrivalTime\": 1500000,\n" +
                                        "    \"journeyDuration\": 50000,\n" +
                                        "    \"price\": 1000\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 5,\n" +
                                        "    \"aircraftId\": 5,\n" +
                                        "    \"sourceCity\": \"TOKYO\",\n" +
                                        "    \"destCity\": \"MELBOURNE\",\n" +
                                        "    \"departureTime\": 1608422400000,\n" +
                                        "    \"arrivalTime\": 1500000,\n" +
                                        "    \"journeyDuration\": 50000,\n" +
                                        "    \"price\": 1000\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 6,\n" +
                                        "    \"aircraftId\": 3,\n" +
                                        "    \"sourceCity\": \"TOKYO\",\n" +
                                        "    \"destCity\": \"VANCOUVER\",\n" +
                                        "    \"departureTime\": 1608422400000,\n" +
                                        "    \"arrivalTime\": 1500000,\n" +
                                        "    \"journeyDuration\": 50000,\n" +
                                        "    \"price\": 1000\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 7,\n" +
                                        "    \"aircraftId\": 15,\n" +
                                        "    \"sourceCity\": \"OSAKA\",\n" +
                                        "    \"destCity\": \"QUEBEC\",\n" +
                                        "    \"departureTime\": 1608422400000,\n" +
                                        "    \"arrivalTime\": 1500000,\n" +
                                        "    \"journeyDuration\": 50000,\n" +
                                        "    \"price\": 1000\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 8,\n" +
                                        "    \"aircraftId\": 10,\n" +
                                        "    \"sourceCity\": \"BRISBANE\",\n" +
                                        "    \"destCity\": \"CHICAGO\",\n" +
                                        "    \"departureTime\": 1608422400000,\n" +
                                        "    \"arrivalTime\": 1500000,\n" +
                                        "    \"journeyDuration\": 50000,\n" +
                                        "    \"price\": 1000\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 9,\n" +
                                        "    \"aircraftId\": 2,\n" +
                                        "    \"sourceCity\": \"MOSCOW\",\n" +
                                        "    \"destCity\": \"KAZAN\",\n" +
                                        "    \"departureTime\": 1608854400000,\n" +
                                        "    \"arrivalTime\": 1500000,\n" +
                                        "    \"journeyDuration\": 50000,\n" +
                                        "    \"price\": 1000\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 10,\n" +
                                        "    \"aircraftId\": 4,\n" +
                                        "    \"sourceCity\": \"MOSCOW\",\n" +
                                        "    \"destCity\": \"KAZAN\",\n" +
                                        "    \"departureTime\": 1608854400000,\n" +
                                        "    \"arrivalTime\": 1500000,\n" +
                                        "    \"journeyDuration\": 50000,\n" +
                                        "    \"price\": 1000\n" +
                                        "  }\n" +
                                        "]")
                );


        mockMvc.perform(delete("/flights/1"))
                .andExpect(
                        content()
                                .json(
                                        "{\n" +
                                                "  \"id\": 1,\n" +
                                                "  \"aircraftId\": 1,\n" +
                                                "  \"sourceCity\": \"KAZAN\",\n" +
                                                "  \"destCity\": \"MOSCOW\",\n" +
                                                "  \"departureTime\": 1608163200000,\n" +
                                                "  \"arrivalTime\": 1500000,\n" +
                                                "  \"journeyDuration\": 100000,\n" +
                                                "  \"price\": 30000\n" +
                                                "}")
                );

        mockMvc.perform(get("/flights"))
                .andExpect(
                        content()
                                .json("[\n" +
                                        "  {\n" +
                                        "    \"id\": 2,\n" +
                                        "    \"aircraftId\": 2,\n" +
                                        "    \"sourceCity\": \"KAZAN\",\n" +
                                        "    \"destCity\": \"MOSCOW\",\n" +
                                        "    \"departureTime\": 1608163200000,\n" +
                                        "    \"arrivalTime\": 1500000,\n" +
                                        "    \"journeyDuration\": 10000,\n" +
                                        "    \"price\": 5000\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 3,\n" +
                                        "    \"aircraftId\": 2,\n" +
                                        "    \"sourceCity\": \"KAZAN\",\n" +
                                        "    \"destCity\": \"MOSCOW\",\n" +
                                        "    \"departureTime\": 1608163200000,\n" +
                                        "    \"arrivalTime\": 1500000,\n" +
                                        "    \"journeyDuration\": 50000,\n" +
                                        "    \"price\": 1000\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 4,\n" +
                                        "    \"aircraftId\": 2,\n" +
                                        "    \"sourceCity\": \"MILAN\",\n" +
                                        "    \"destCity\": \"PARIS\",\n" +
                                        "    \"departureTime\": 1608163200000,\n" +
                                        "    \"arrivalTime\": 1500000,\n" +
                                        "    \"journeyDuration\": 50000,\n" +
                                        "    \"price\": 1000\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 5,\n" +
                                        "    \"aircraftId\": 5,\n" +
                                        "    \"sourceCity\": \"TOKYO\",\n" +
                                        "    \"destCity\": \"MELBOURNE\",\n" +
                                        "    \"departureTime\": 1608422400000,\n" +
                                        "    \"arrivalTime\": 1500000,\n" +
                                        "    \"journeyDuration\": 50000,\n" +
                                        "    \"price\": 1000\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 6,\n" +
                                        "    \"aircraftId\": 3,\n" +
                                        "    \"sourceCity\": \"TOKYO\",\n" +
                                        "    \"destCity\": \"VANCOUVER\",\n" +
                                        "    \"departureTime\": 1608422400000,\n" +
                                        "    \"arrivalTime\": 1500000,\n" +
                                        "    \"journeyDuration\": 50000,\n" +
                                        "    \"price\": 1000\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 7,\n" +
                                        "    \"aircraftId\": 15,\n" +
                                        "    \"sourceCity\": \"OSAKA\",\n" +
                                        "    \"destCity\": \"QUEBEC\",\n" +
                                        "    \"departureTime\": 1608422400000,\n" +
                                        "    \"arrivalTime\": 1500000,\n" +
                                        "    \"journeyDuration\": 50000,\n" +
                                        "    \"price\": 1000\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 8,\n" +
                                        "    \"aircraftId\": 10,\n" +
                                        "    \"sourceCity\": \"BRISBANE\",\n" +
                                        "    \"destCity\": \"CHICAGO\",\n" +
                                        "    \"departureTime\": 1608422400000,\n" +
                                        "    \"arrivalTime\": 1500000,\n" +
                                        "    \"journeyDuration\": 50000,\n" +
                                        "    \"price\": 1000\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 9,\n" +
                                        "    \"aircraftId\": 2,\n" +
                                        "    \"sourceCity\": \"MOSCOW\",\n" +
                                        "    \"destCity\": \"KAZAN\",\n" +
                                        "    \"departureTime\": 1608854400000,\n" +
                                        "    \"arrivalTime\": 1500000,\n" +
                                        "    \"journeyDuration\": 50000,\n" +
                                        "    \"price\": 1000\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 10,\n" +
                                        "    \"aircraftId\": 4,\n" +
                                        "    \"sourceCity\": \"MOSCOW\",\n" +
                                        "    \"destCity\": \"KAZAN\",\n" +
                                        "    \"departureTime\": 1608854400000,\n" +
                                        "    \"arrivalTime\": 1500000,\n" +
                                        "    \"journeyDuration\": 50000,\n" +
                                        "    \"price\": 1000\n" +
                                        "  }\n" +
                                        "]")
                );

        mockMvc.perform(
                post("/flights")
                        .contentType("application/json")
                        .content("{\n" +
                                "    \"id\": 0,\n" +
                                "    \"aircraftId\": 1,\n" +
                                "    \"sourceCity\": \"KAZAN\",\n" +
                                "    \"destCity\": \"MILAN\",\n" +
                                "    \"departureTime\": 1607979600000,\n" +
                                "    \"arrivalTime\": 1500000,\n" +
                                "    \"journeyDuration\": 100000,\n" +
                                "    \"price\": 30000\n" +
                                "  }")
        )
                .andExpect(
                        content()
                                .json(
                                        "{\n" +
                                                "    \"id\": 11,\n" +
                                                "    \"aircraftId\": 1,\n" +
                                                "    \"sourceCity\": \"KAZAN\",\n" +
                                                "    \"destCity\": \"MILAN\",\n" +
                                                "    \"departureTime\": 1607979600000,\n" +
                                                "    \"arrivalTime\": 1500000,\n" +
                                                "    \"journeyDuration\": 100000,\n" +
                                                "    \"price\": 30000\n" +
                                                "  }")
                );
        mockMvc.perform(
                post("/flights")
                        .contentType("application/json")
                        .content("{\n" +
                                "    \"id\": 11,\n" +
                                "    \"aircraftId\": 1,\n" +
                                "    \"sourceCity\": \"BERLIN\",\n" +
                                "    \"destCity\": \"MILAN\",\n" +
                                "    \"departureTime\": 1607979600000,\n" +
                                "    \"arrivalTime\": 1500000,\n" +
                                "    \"journeyDuration\": 100000,\n" +
                                "    \"price\": 30000\n" +
                                "  }")
        )
                .andExpect(
                        content()
                                .json(
                                        "{\n" +
                                                "    \"id\": 11,\n" +
                                                "    \"aircraftId\": 1,\n" +
                                                "    \"sourceCity\": \"BERLIN\",\n" +
                                                "    \"destCity\": \"MILAN\",\n" +
                                                "    \"departureTime\": 1607979600000,\n" +
                                                "    \"arrivalTime\": 1500000,\n" +
                                                "    \"journeyDuration\": 100000,\n" +
                                                "    \"price\": 30000\n" +
                                                "  }")
                );

        mockMvc.perform(get("/flights/2"))
                .andExpect(
                        content()
                                .json("{\n" +
                                        "    \"id\": 2,\n" +
                                        "    \"aircraftId\": 2,\n" +
                                        "    \"sourceCity\": \"KAZAN\",\n" +
                                        "    \"destCity\": \"MOSCOW\",\n" +
                                        "    \"departureTime\": 1608163200000,\n" +
                                        "    \"arrivalTime\": 1500000,\n" +
                                        "    \"journeyDuration\": 10000,\n" +
                                        "    \"price\": 5000\n" +
                                        "  }")
                );

    }

}
