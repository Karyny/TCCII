package dataBase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.Calendar;
import java.util.Date;




public class createBase extends SQLiteOpenHelper {


    private static final String NOME_BANCO = "drSmart.db";



    public static final String TABELA_LOGIN = "login";
    public static final String ID = "_id";
    public static final String NOME = "nome";
    public static final String EMAIL = "_email";
    public static final String SENHA = "_senha";
    public static final int VERSAO = 1;


    public static final String TABELA_MEDICINES = "medicines";
    public static final String ID_MED = "_id";
    public static final String DATA_INICIAL  = "yyyy-MM-dd";
    public static final String NOME_MED = "nomeMed";
    public static final Boolean PILLS_LIQUID = true;
    public static final String HORARIO = "00:00";
    public static final String DATA_FINAL = "yyyy-MM-dd";

    public static final String TABELA_HEALT = "healt";
    public static final String ID_HEALT = "_id";
    public static final String DATA_SINTOMA = "_data";
    public static final String SINTOMA = "_sintoma";
    public static final String INTENSIDADE_SINTOMA = "_intensidade";



    public createBase(Context context){
            super(context, NOME_BANCO,null,VERSAO);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {

        //criação da tabela de login
            String sql = "CREATE TABLE"+TABELA_LOGIN+"("
                    + ID + " integer primary key autoincrement,"
                    + NOME + " text,"
                    + EMAIL + " text"
                    + SENHA + " text,"
                    +")";

        //criação da tabela de medicamentos
            String sql_medicines = "CREATE TABLE"+TABELA_MEDICINES+"("
                    + ID_MED + " integer primary key autoincrement,"
                    + DATA_INICIAL + " date,"
                    + NOME_MED + " text"
                    + PILLS_LIQUID + " boolean,"
                    + HORARIO + " text,"
                    + DATA_FINAL + " text"
                    +")";

        //criação da tabela de dados de saúde
            String sql_heatl = "CREATE TABLE"+TABELA_HEALT+"("
                    + ID_HEALT + " integer primary key autoincrement,"
                    + DATA_SINTOMA + " text,"
                    + SINTOMA + " text"
                    + INTENSIDADE_SINTOMA + " text"
                    +")";
        }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


        /*public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS" + TABELA);
            onCreate(db);
        }*/
    }
    }