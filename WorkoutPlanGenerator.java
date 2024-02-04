import java.util.ArrayList;
import java.util.List;

public class WorkoutPlanGenerator {

    public static List<Exercise> generateWorkoutPlan(UserProfile userProfile) {
        List<Exercise> personalizedExercises = new ArrayList<>();

        for (Exercise exercise : Exercise.values()) {
            // Filter based on seated preference
            if (userProfile.prefersSeatedExercises() && !exercise.isWheelChairFriendly()) {
                continue;
            }

            // Filter out exercises that require equipment if the user doesn't have any
            if (!userProfile.hasFitnessEquipment() && exercise.isWeighted()) {
                continue;
            }

            // Filter based on wheelchair adaptability for lower body
            if (userProfile.needsWheelchairAdaptabilityLowerBody() && exercise.getExerciseArea() == ExerciseArea.LOWER_BODY && !exercise.isWheelChairFriendly()) {
                continue;
            }

            // Filter based on wheelchair adaptability for upper body
            if (userProfile.needsWheelchairAdaptabilityUpperBody() && exercise.getExerciseArea() == ExerciseArea.UPPER_BODY && !exercise.isWheelChairFriendly()) {
                continue;
            }

            // Additional filters can be implemented here based on other user preferences

            personalizedExercises.add(exercise);
        }

        return personalizedExercises;
    }
}
