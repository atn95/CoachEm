package server.controllers.exercises;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseService {
    private final ExerciseRepository exerciseRepository;

    @Autowired
    public ExerciseService(ExerciseRepository exerciseRepository){
        this.exerciseRepository = exerciseRepository;
    }

    public List<Exercise> getExercises() {
        return List.of(new Exercise("Test name", "Test Description", "http://localhost", 1));
    }


}
