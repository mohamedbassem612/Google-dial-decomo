package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final /* synthetic */ class snp extends aoof implements aonj {
    public static final defpackage.snp a = new defpackage.snp();

    public snp() {
        super(1, defpackage.sns.class, "toContactEntry", "toContactEntry-JfnmSAo(Landroid/database/Cursor;)Lcom/android/dialer/peertopeer/capabilities/registrar/impl/cache/batch/ContactEntry;", 1);
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        android.database.Cursor cursor = ((defpackage.aguo) obj).a;
        java.lang.String strA = defpackage.aguo.a(cursor, cursor.getColumnIndex("data1"));
        int columnIndex = cursor.getColumnIndex("data4");
        return new defpackage.snm(strA, cursor.isNull(columnIndex) ? null : defpackage.aguo.a(cursor, columnIndex));
    }
}
