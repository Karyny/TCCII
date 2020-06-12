package dataBase;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.*;


public class controllerBase {


    private SQLiteDatabase db;
    private createBase drSmart;

    public controllerBase(Context context){
        drSmart = new createBase(context);
    }

    public controllerBase() {

    }

    public String insertLogin(String nome, String email, String senha){
        ContentValues valores;
        long resultado;

        /*private static final String TABELA = "login";
        private static final String ID = "_id";
        private static final String NOME = "_nome";
        private static final String EMAIL = "_email";
        private static final String SENHA = "_senha";
        private static final int VERSAO = 1;*/


        db = drSmart.getWritableDatabase();
        valores = new ContentValues();
        valores.put(createBase.NOME, nome);
        valores.put(createBase.EMAIL, email);
        valores.put(createBase.SENHA, senha);

        resultado = db.insert(createBase.TABELA, null, valores);
        db.close();

        if (resultado ==-1)
            return "Erro ao inserir registro";
        else {
            String s = "Registro Inserido com sucesso";
            return s;
        }


    }

}
