package ru.student.java_spring_20232024.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.student.java_spring_20232024.model.Response;

@Service
@RequiredArgsConstructor
@Qualifier ("ModifyErrorMessage")
public class ModifyErrorMessage implements MyModifyService {

    @Qualifier
    public Response modify (Response response) {
        response.setErrorMessage("Что-то сломалось");

        return response;
    }
}
