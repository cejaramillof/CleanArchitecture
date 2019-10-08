package app.demo.api.rest;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SeatsService {

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, path = "/movies/assign")
    public int assignTask() {
        return 1;
    }

    @Data
    private static class AssignTaskData {
        private String taskId;
        private String userId;
    }
}
