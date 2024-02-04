import java.util.Scanner;

public class UserInputCollector {
    private static Scanner scanner;

    public UserInputCollector() {
        this.scanner = new Scanner(System.in);
    }


    public static UserProfile collectUserProfile() {
        UserProfile userProfile = new UserProfile();

        System.out.println("Welcome! Can we ask a few questions to customize your experience? (y/n)");
        if (!scanner.nextLine().trim().equalsIgnoreCase("y")) {
            System.out.println("Exiting setup.");
            return userProfile; // Early exit if user does not consent to questions.
        }

        // Basic Preferences and Abilities
        userProfile.setPrefersSeatedExercises(askQuestion("Do you prefer exercises that can be done while seated?"));
        userProfile.setIncludeStandingExercises(askQuestion("Would you like to include standing exercises in your routine?"));

        // Specific Mobility Questions
        userProfile.setLowerBodyMobilityMostlyUnrestricted(askQuestion("Is your lower body mobility mostly unrestricted?"));
        if (!userProfile.isLowerBodyMobilityMostlyUnrestricted()) {
            userProfile.setInterestedInCardiovascularLowerBodyActivities(askQuestion("Can you engage in cardiovascular activities that primarily involve your lower body?"));
            userProfile.setInterestedInWeightedLowerBodyExercises(askQuestion("Are you interested in weighted exercises for your lower body?"));
        }

        userProfile.setUpperBodyMobilityMostlyUnrestricted(askQuestion("Is your upper body mobility mostly unrestricted?"));
        if (userProfile.isUpperBodyMobilityMostlyUnrestricted()) {
            userProfile.setInterestedInHighIntensityUpperBodyExercises(askQuestion("Are you interested in high-intensity upper body exercises?"));
            userProfile.setInterestedInArmExercises(askQuestion("Are you interested in arm exercises?"));
        }

        // Equipment and Accessibility
        userProfile.setHasFitnessEquipment(askQuestion("Do you have access to any fitness equipment?"));

        // Adaptability and Support
        userProfile.setNeedsWheelchairAdaptabilityLowerBody(askQuestion("LOWER BODY: Do you need exercises that are adaptable for wheelchairs?"));
        userProfile.setNeedsWheelchairAdaptabilityUpperBody(askQuestion("UPPER BODY: Do you need exercises that are adaptable for wheelchairs?"));


        // Endurance and Intensity Preferences
        userProfile.setInterestedInLowIntensityExercises(askQuestion("Are you interested in low-intensity exercises to start?"));
        userProfile.setInterestedInHighIntensityExercises(askQuestion("Would you be interested in eventually incorporating high-intensity exercises?"));

        // Safety and Health Considerations
        userProfile.setAvoidRapidDirectionChanges(askQuestion("Should we avoid exercises that involve rapid changes in direction or position?"));
        userProfile.setExercisesGentleOnJoints(askQuestion("Do you require exercises that are gentle on the joints?"));

        // Closing the scanner can lead to issues if this method is called multiple times or if the scanner is used elsewhere.
        // It's generally safer to leave the scanner open or manage it outside of this method/class.

        return userProfile;
    }

    private static boolean askQuestion(String question) {
        System.out.println(question + " (y/n)");
        return scanner.nextLine().trim().equalsIgnoreCase("y");
    }
}
