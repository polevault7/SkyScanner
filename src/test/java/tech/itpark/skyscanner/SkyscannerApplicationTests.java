package tech.itpark.skyscanner;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class SkyscannerApplicationTests {
    @Autowired
    MockMvc mockMvc;

//    @Test
//    void crudTest() throws Exception {
//        mockMvc.perform(get("/flights"))
//                .andExpect(
//                        content()
//                                .json("[\n" +
//                                        "  {\n" +
//                                        "    \"id\": 1,\n" +
//                                        "    \"aircraftId\": 1,\n" +
//                                        "    \"sourceCity\": \"KAZAN\",\n" +
//                                        "    \"destCity\": \"MOSCOW\",\n" +
//                                        "    \"departureTime\": 1607979600000,\n" +
//                                        "    \"arrivalTime\": 1500000,\n" +
//                                        "    \"journeyDuration\": 100000,\n" +
//                                        "    \"price\": 30000\n" +
//                                        "  },\n" +
//                                        "  {\n" +
//                                        "    \"id\": 2,\n" +
//                                        "    \"aircraftId\": 2,\n" +
//                                        "    \"sourceCity\": \"KAZAN\",\n" +
//                                        "    \"destCity\": \"MOSCOW\",\n" +
//                                        "    \"departureTime\": 1607979600000,\n" +
//                                        "    \"arrivalTime\": 1500000,\n" +
//                                        "    \"journeyDuration\": 10000,\n" +
//                                        "    \"price\": 5000\n" +
//                                        "  },\n" +
//                                        "  {\n" +
//                                        "    \"id\": 3,\n" +
//                                        "    \"aircraftId\": 2,\n" +
//                                        "    \"sourceCity\": \"KAZAN\",\n" +
//                                        "    \"destCity\": \"MOSCOW\",\n" +
//                                        "    \"departureTime\": 1607979600000,\n" +
//                                        "    \"arrivalTime\": 1500000,\n" +
//                                        "    \"journeyDuration\": 50000,\n" +
//                                        "    \"price\": 1000\n" +
//                                        "  }\n" +
//                                        "]")
//                );
//
//
//        mockMvc.perform(get("/flights/1"))
//                .andExpect(
//                        content()
//                                .json(
//                                        "{\n" +
//                                                "    \"id\": 1,\n" +
//                                                "    \"aircraftId\": 1,\n" +
//                                                "    \"sourceCity\": \"KAZAN\",\n" +
//                                                "    \"destCity\": \"MOSCOW\",\n" +
//                                                "    \"departureTime\": 1607979600000,\n" +
//                                                "    \"arrivalTime\": 1500000,\n" +
//                                                "    \"journeyDuration\": 100000,\n" +
//                                                "    \"price\": 30000\n" +
//                                                "  }")
//                );
//
//        mockMvc.perform(get("/flights/search")
//                .queryParam("sourceCity", "KAZ")
//                .queryParam("destCity", "MOSCOW")
//                .queryParam("departureTime", "15.12.2020")
//        )
//                .andExpect(
//                        content()
//                                .json(
//                                        "[\n" +
//                                                "  {\n" +
//                                                "    \"id\": 1,\n" +
//                                                "    \"aircraftId\": 1,\n" +
//                                                "    \"sourceCity\": \"KAZAN\",\n" +
//                                                "    \"destCity\": \"MOSCOW\",\n" +
//                                                "    \"departureTime\": 1607979600000,\n" +
//                                                "    \"arrivalTime\": 1500000,\n" +
//                                                "    \"journeyDuration\": 100000,\n" +
//                                                "    \"price\": 30000\n" +
//                                                "  },\n" +
//                                                "  {\n" +
//                                                "    \"id\": 2,\n" +
//                                                "    \"aircraftId\": 2,\n" +
//                                                "    \"sourceCity\": \"KAZAN\",\n" +
//                                                "    \"destCity\": \"MOSCOW\",\n" +
//                                                "    \"departureTime\": 1607979600000,\n" +
//                                                "    \"arrivalTime\": 1500000,\n" +
//                                                "    \"journeyDuration\": 10000,\n" +
//                                                "    \"price\": 5000\n" +
//                                                "  },\n" +
//                                                "  {\n" +
//                                                "    \"id\": 3,\n" +
//                                                "    \"aircraftId\": 2,\n" +
//                                                "    \"sourceCity\": \"KAZAN\",\n" +
//                                                "    \"destCity\": \"MOSCOW\",\n" +
//                                                "    \"departureTime\": 1607979600000,\n" +
//                                                "    \"arrivalTime\": 1500000,\n" +
//                                                "    \"journeyDuration\": 50000,\n" +
//                                                "    \"price\": 1000\n" +
//                                                "  }\n" +
//                                                "]")
//                );
//        mockMvc.perform(
//                post("/flights")
//                        .contentType("application/json")
//                        .content("{\n" +
//                                "    \"id\": 0,\n" +
//                                "    \"aircraftId\": 1,\n" +
//                                "    \"sourceCity\": \"KAZAN\",\n" +
//                                "    \"destCity\": \"MILAN\",\n" +
//                                "    \"departureTime\": 1607979600000,\n" +
//                                "    \"arrivalTime\": 1500000,\n" +
//                                "    \"journeyDuration\": 100000,\n" +
//                                "    \"price\": 30000\n" +
//                                "  }")
//        )
//                .andExpect(
//                        content()
//                                .json(
//                                        "{\n" +
//                                                "    \"id\": 4,\n" +
//                                                "    \"aircraftId\": 1,\n" +
//                                                "    \"sourceCity\": \"KAZAN\",\n" +
//                                                "    \"destCity\": \"MILAN\",\n" +
//                                                "    \"departureTime\": 1607979600000,\n" +
//                                                "    \"arrivalTime\": 1500000,\n" +
//                                                "    \"journeyDuration\": 100000,\n" +
//                                                "    \"price\": 30000\n" +
//                                                "  }")
//                );
//
//
//
//    }

    @Test
    void deleteAndGetAllTest() throws Exception{
        mockMvc.perform(delete("/flights/4"))
                .andExpect(
                        content()
                                .json(
                                        "{\n" +
                                                "  \"id\": 4,\n" +
                                                "  \"aircraftId\": 2,\n" +
                                                "  \"sourceCity\": \"MILAN\",\n" +
                                                "  \"destCity\": \"PARIS\",\n" +
                                                "  \"departureTime\": 1608163200000,\n" +
                                                "  \"arrivalTime\": 1500000,\n" +
                                                "  \"journeyDuration\": 50000,\n" +
                                                "  \"price\": 1000\n" +
                                                "}")
                );

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
                                        "    \"id\": 5,\n" +
                                        "    \"aircraftId\": 5,\n" +
                                        "    \"sourceCity\": \"LOS-ANGELES\",\n" +
                                        "    \"destCity\": \"PARIS\",\n" +
                                        "    \"departureTime\": 1608163200000,\n" +
                                        "    \"arrivalTime\": 1500000,\n" +
                                        "    \"journeyDuration\": 50000,\n" +
                                        "    \"price\": 1000\n" +
                                        "  }\n" +
                                        "]")
                );
    }

}
