package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class sud {
    public static final defpackage.aigf a = defpackage.aigf.m("data_id", "data_id", "preferred_phone_account_component_name", "preferred_phone_account_component_name", "preferred_phone_account_id", "preferred_phone_account_id");
    public final defpackage.suh b;

    public sud(android.content.Context context) {
        this.b = new defpackage.suh(context);
    }

    public final int a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("data_id", str);
        contentValues.put("preferred_phone_account_component_name", str2);
        contentValues.put("preferred_phone_account_id", str3);
        long jReplace = this.b.getWritableDatabase().replace("preferred_sim", null, contentValues);
        if (jReplace != -1) {
            return (int) jReplace;
        }
        throw new java.lang.IllegalStateException("update failed");
    }
}
