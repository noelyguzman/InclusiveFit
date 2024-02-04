public enum Exercise {
    NECK_ROTATIONS_SEATED("Neck Rotations", false, true, true, ExerciseArea.NECK),
    NECK_TILT_HOLDS_SEATED("Neck Tilt Holds", false, true, true, ExerciseArea.NECK),
    ARM_CIRCLES_SEATED("Arm Circles", false, true, true, ExerciseArea.ARM),
    CHEST_EXPANSIONS_SEATED("Chest Expansions", false, true, true, ExerciseArea.CHEST),
    UPWARD_PUNCHES_SEATED("Upward Punches", false, true, true, ExerciseArea.ARM),
    BICEP_CURLS_SEATED("Bicep Curls", true, true, true, ExerciseArea.ARM),
    CHEST_PRESS_SEATED("Chest Press", true, false, true, ExerciseArea.CHEST),
    TRICEP_EXTENSIONS_SEATED("Tricep Extensions", true, true, true, ExerciseArea.ARM),
    ARM_CROSS_OVER_HOLDS_SEATED("Arm Cross-Over Holds", false, true, true, ExerciseArea.ARM),
    ELBOW_TO_HEAD_HOLD_SEATED("Elbow to Head Hold", false, true, true, ExerciseArea.ARM),
    LATERAL_ARM_RAISES_SEATED("Lateral Arm Raises", true, true, true, ExerciseArea.SHOULDER),
    FRONT_ARM_RAISES_SEATED("Front Arm Raises", true, true, true, ExerciseArea.SHOULDER),
    SEATED_ARNOLD_PRESS("Seated Arnold Press", true, true, true, ExerciseArea.SHOULDER),
    SEATED_TORSO_TWISTS("Seated Torso Twists", false, true, true, ExerciseArea.ABDOMINAL),
    SEATED_ABDOMINAL_CRUNCHES("Seated Abdominal Crunches", false, true, true, ExerciseArea.ABDOMINAL),
    SEATED_CAT_COW_STRETCH("Seated Cat-Cow Stretch", false, true, true, ExerciseArea.ABDOMINAL),
    SEATED_RUSSIAN_TWISTS("Seated Russian Twists", true, true, true, ExerciseArea.ABDOMINAL),
    SEATED_OVERHEAD_CRUNCHES("Seated Overhead Crunches", true, true, true, ExerciseArea.ABDOMINAL),
    SEATED_LEG_EXTENSIONS("Seated Leg Extensions", true, true, true, ExerciseArea.LOWER_BODY),
    SEATED_LEG_PRESS("Seated Leg Press", true, true, true, ExerciseArea.LOWER_BODY),
    SEATED_CALF_RAISES("Seated Calf Raises", true, true, true, ExerciseArea.LOWER_BODY),
    SEATED_ANKLE_CIRCLES("Seated Ankle Circles", false, true, true, ExerciseArea.LOWER_BODY),
    SEATED_HIP_ABDUCTION("Seated Hip Abduction", true, true, true, ExerciseArea.LOWER_BODY),
    LUNGES("Lunges", true, false, false, ExerciseArea.LOWER_BODY),
    SQUATS("Squats", true, false, false, ExerciseArea.LOWER_BODY),
    LATERAL_LEG_RAISES("Lateral Leg Raises", false, false, false, ExerciseArea.LOWER_BODY),
    CURTSY_LUNGES("Curtsy Lunges", true, false, false, ExerciseArea.LOWER_BODY),
    HIP_ROTATIONS("Hip Rotations", false, true, false, ExerciseArea.LOWER_BODY),
    ROMANIAN_DEADLIFTS("Romanian Deadlifts", true, true, false, ExerciseArea.LOWER_BODY),
    WALKING_LUNGES("Walking Lunges", true, false, false, ExerciseArea.LOWER_BODY),
    RUNNING_IN_PLACE("Running in Place", false, false, false, ExerciseArea.LOWER_BODY),
    HIGH_KNEES("High Knees", false, false, false, ExerciseArea.LOWER_BODY);

    private final String name;
    private final boolean isWeighted;
    private final boolean isFlexibilityFocused;
    private final boolean isWheelChairFriendly;
    private final ExerciseArea exerciseArea;

    Exercise(String name, boolean isWeighted, boolean isFlexibilityFocused, boolean isWheelChairFriendly, ExerciseArea exerciseArea) {
        this.name = name;
        this.isWeighted = isWeighted;
        this.isFlexibilityFocused = isFlexibilityFocused;
        this.isWheelChairFriendly = isWheelChairFriendly;
        this.exerciseArea = exerciseArea;
    }

    // Getters
    public String getName() { return name; }
    public boolean isWeighted() { return isWeighted; }
    public boolean isFlexibilityFocused() { return isFlexibilityFocused; }
    public boolean isWheelChairFriendly() { return isWheelChairFriendly; }
    public ExerciseArea getExerciseArea() { return exerciseArea; }
}

enum ExerciseArea {
    UPPER_BODY, LOWER_BODY, CORE, NECK, ARM, SHOULDER, CHEST, ABDOMINAL;
}
