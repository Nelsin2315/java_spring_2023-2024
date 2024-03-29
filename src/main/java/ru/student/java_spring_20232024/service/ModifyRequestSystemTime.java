package ru.student.java_spring_20232024.service;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.student.java_spring_20232024.model.Request;

@Service
public class ModifyRequestSystemTime implements ModifyRequestService{
    @Override

    public void modifyRq(Request request) {
        request.setSystemTime("time");

        HttpEntity<Request> httpEntity = new HttpEntity<>(request);

        new RestTemplate().exchange("http://localhost:8082/feedback",
                HttpMethod.POST,
                httpEntity,
                new ParameterizedTypeReference<>() {
                });
    }
}
