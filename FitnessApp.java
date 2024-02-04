import java.util.List;

public class FitnessApp {
    public static void main(String[] args) {
        // Initialize the UserInputCollector
        UserInputCollector inputCollector = new UserInputCollector();

        // Collect user preferences into a UserProfile object
        UserProfile userProfile = inputCollector.collectUserProfile();

        // Generate a personalized workout plan based on the collected user profile
        List<Exercise> workoutPlan = WorkoutPlanGenerator.generateWorkoutPlan(userProfile);

        // Print the generated workout plan
        System.out.println("Your personalized workout plan:");
        for (Exercise exercise : workoutPlan) {
            System.out.println("- " + exercise.getName());
        }

        // Additional logic can be added here, such as saving the user profile,
        // scheduling workouts, tracking progress, or integrating with other systems.
    }
}
