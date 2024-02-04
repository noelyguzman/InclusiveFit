public class UserProfile {
    private boolean prefersSeatedExercises;
    private boolean includeStandingExercises;
    private boolean lowerBodyMobilityMostlyUnrestricted;
    private boolean interestedInCardiovascularLowerBodyActivities;
    private boolean interestedInWeightedLowerBodyExercises;
    private boolean upperBodyMobilityMostlyUnrestricted;
    private boolean interestedInHighIntensityUpperBodyExercises;
    private boolean interestedInArmExercises;
    private boolean hasFitnessEquipment;
    private boolean needsWheelchairAdaptabilityLowerBody;
    private boolean needsWheelchairAdaptabilityUpperBody;
    private boolean interestedInLowIntensityExercises;
    private boolean interestedInHighIntensityExercises;
    private boolean avoidRapidDirectionChanges;
    private boolean exercisesGentleOnJoints;

    // Constructor initializes default values
    public UserProfile() {
        // Default values are set to false implicitly for boolean fields
    }

    // Setters
    public void setPrefersSeatedExercises(boolean b) { prefersSeatedExercises = b; }
    public void setIncludeStandingExercises(boolean b) { includeStandingExercises = b; }
    public void setLowerBodyMobilityMostlyUnrestricted(boolean b) { lowerBodyMobilityMostlyUnrestricted = b; }
    public void setInterestedInCardiovascularLowerBodyActivities(boolean b) { interestedInCardiovascularLowerBodyActivities = b; }
    public void setInterestedInWeightedLowerBodyExercises(boolean b) { interestedInWeightedLowerBodyExercises = b; }
    public void setUpperBodyMobilityMostlyUnrestricted(boolean b) { upperBodyMobilityMostlyUnrestricted = b; }
    public void setInterestedInHighIntensityUpperBodyExercises(boolean b) { interestedInHighIntensityUpperBodyExercises = b; }
    public void setInterestedInArmExercises(boolean b) { interestedInArmExercises = b; }
    public void setHasFitnessEquipment(boolean b) { hasFitnessEquipment = b; }
    public void setNeedsWheelchairAdaptabilityLowerBody(boolean b) { needsWheelchairAdaptabilityLowerBody = b; }
    public void setNeedsWheelchairAdaptabilityUpperBody(boolean b) { needsWheelchairAdaptabilityUpperBody = b; }
    public void setInterestedInLowIntensityExercises(boolean b) { interestedInLowIntensityExercises = b; }
    public void setInterestedInHighIntensityExercises(boolean b) { interestedInHighIntensityExercises = b; }
    public void setAvoidRapidDirectionChanges(boolean b) { avoidRapidDirectionChanges = b; }
    public void setExercisesGentleOnJoints(boolean b) { exercisesGentleOnJoints = b; }

    // Getters
    public boolean prefersSeatedExercises() { return prefersSeatedExercises; }
    public boolean includeStandingExercises() { return includeStandingExercises; }
    public boolean lowerBodyMobilityMostlyUnrestricted() { return lowerBodyMobilityMostlyUnrestricted; }
    public boolean interestedInCardiovascularLowerBodyActivities() { return interestedInCardiovascularLowerBodyActivities; }
    public boolean interestedInWeightedLowerBodyExercises() { return interestedInWeightedLowerBodyExercises; }
    public boolean upperBodyMobilityMostlyUnrestricted() { return upperBodyMobilityMostlyUnrestricted; }
    public boolean interestedInHighIntensityUpperBodyExercises() { return interestedInHighIntensityUpperBodyExercises; }
    public boolean interestedInArmExercises() { return interestedInArmExercises; }

    public boolean isLowerBodyMobilityMostlyUnrestricted() {
        return lowerBodyMobilityMostlyUnrestricted;
    }

    public boolean isUpperBodyMobilityMostlyUnrestricted() {
        return upperBodyMobilityMostlyUnrestricted;
    }

    public boolean hasFitnessEquipment() {
        return hasFitnessEquipment;
    }

    public boolean needsWheelchairAdaptabilityLowerBody() {
        return needsWheelchairAdaptabilityLowerBody;
    }

    public boolean needsWheelchairAdaptabilityUpperBody() {
        return needsWheelchairAdaptabilityUpperBody;
    }

}
   
