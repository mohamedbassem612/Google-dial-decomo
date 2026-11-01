package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final /* synthetic */ class snq extends aoof implements aonj {
    public static final defpackage.snq a = new defpackage.snq();

    public snq() {
        super(1, defpackage.sns.class, "toRawContactId", "toRawContactId-JfnmSAo(Landroid/database/Cursor;)J", 1);
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        android.database.Cursor cursor = ((defpackage.aguo) obj).a;
        return java.lang.Long.valueOf(cursor.getLong(cursor.getColumnIndex("_id")));
    }
}
