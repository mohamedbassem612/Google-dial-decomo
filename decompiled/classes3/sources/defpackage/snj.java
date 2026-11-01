package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final /* synthetic */ class snj extends aoof implements aonj {
    public static final defpackage.snj a = new defpackage.snj();

    public snj() {
        super(1, snl.class, "toRecentCallEntry", "toRecentCallEntry-JfnmSAo(Landroid/database/Cursor;)Lcom/android/dialer/peertopeer/capabilities/registrar/impl/cache/batch/RecentCallEntry;", 1);
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        android.database.Cursor cursor = ((defpackage.aguo) obj).a;
        java.lang.String strA = snl.a(cursor, cursor.getColumnIndex("number"));
        java.lang.String strA2 = snl.a(cursor, cursor.getColumnIndex("normalized_number"));
        int columnIndex = cursor.getColumnIndex("date");
        return new defpackage.snu(strA, strA2, cursor.isNull(columnIndex) ? null : java.lang.Long.valueOf(cursor.getLong(columnIndex)), snl.a(cursor, cursor.getColumnIndex("countryiso")));
    }
}
