package com.Group_Srinivasan.scrumservice;

import com.Group_Srinivasan.scrumservice.controller.StartSimulationController;
import com.Group_Srinivasan.scrumservice.model.SprintBacklog;
import com.Group_Srinivasan.scrumservice.service.SprintBacklogService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class StartSimulationTestDevTeam {

    @Mock
    private SprintBacklogService sprintBacklogService;

    @InjectMocks
    private StartSimulationController controller;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testDisplayResultsDevTeam() {
        // Arrange
        List<SprintBacklog> sprintBacklogs = new ArrayList<>();
        sprintBacklogs.add(new SprintBacklog()); // You may need to adjust this based on your actual model

        when(sprintBacklogService.getAllSprintBacklog()).thenReturn(sprintBacklogs);

        // Act
        String result = controller.displayResultsDevTeam();

        // Assert
        // Adjust the assertion based on your actual expected result
        // For now, let's assume the result should contain "Development Team Result: 10"
        // Replace this with your actual expected result
        assertEquals("Result for dev team", result);
    }
}
