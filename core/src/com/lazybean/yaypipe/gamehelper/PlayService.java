package com.lazybean.yaypipe.gamehelper;

public interface PlayService {
    int RC_SIGN_IN = 9001;
    int RC_ACHIEVEMENT_UI = 9003;


    void startSignInIntent();
    void signInSilently();
    void signOut();
    void unlockAchievement(AchievementType achievementType);
    void incrementAchievement(AchievementType achievementType, int count);
    void submitScore(int highScore);
    void showAchievement();
    void showLeaderBoards();
    boolean isSignedIn();

    void saveGame(String json);
    void loadGame();
}
