package com.birante.todoapp.database;

import android.provider.BaseColumns;

/**
 * Created by macbookpro on 04/12/2017.
 */

public class TaskContract {

    public final static String DB_NAME = "com.birante.todoapp.database";
    public final static int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
    }
}
