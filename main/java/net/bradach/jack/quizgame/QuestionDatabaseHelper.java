package net.bradach.jack.quizgame;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by jack on 27/10/13.
 */
public class QuestionDatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "QuizGame";
    private static final int DATABASE_VERSION = 1;

    /* Database creation string.  Creates a single-table DB with entries for the
     * question, a correct answer, a up to three incorrect answers.  At least one
     * incorrect answer is required.
     */
    private static final String DATABASE_CREATE =
            "CREATE TABLE Questions (" +
            "id integer primary key," +
            "question test not null" +
            "answer_correct not null" +
            "answer_wrong_a not null" +
            "answer_wrong_b" +
            "answer_wrong_c" +
            ");";


    public QuestionDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database) {


    }
}