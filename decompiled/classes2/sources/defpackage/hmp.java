package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class hmp extends aoof implements aonj {
    public static final defpackage.hmp a = new defpackage.hmp();

    public hmp() {
        super(1, defpackage.hmr.class, "toCompactContact", "toCompactContact-JfnmSAo(Landroid/database/Cursor;)Lcom/android/dialer/androidauto/impl/contacts/CompactContact;", 1);
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        android.database.Cursor cursor = ((aguo) obj).a;
        return new defpackage.hmg(cursor.getLong(cursor.getColumnIndex("contact_id")), ajsz.aY(new defpackage.hmu(cursor.getInt(cursor.getColumnIndex("data2")), defpackage.hmr.a(cursor, "data3"), defpackage.hmr.a(cursor, "data1"))), defpackage.hmr.a(cursor, "display_name"), cursor.getLong(cursor.getColumnIndex("photo_id")), defpackage.hmr.a(cursor, "photo_thumb_uri"), defpackage.hmr.a(cursor, "lookup"));
    }
}
