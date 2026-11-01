package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class achd implements afii {
    public final /* synthetic */ ache a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ albh c;

    public /* synthetic */ achd(ache acheVar, java.lang.String str, albh albhVar) {
        this.a = acheVar;
        this.b = str;
        this.c = albhVar;
    }

    public final void a(adag adagVar) {
        android.content.ContentValues contentValues = new android.content.ContentValues(3);
        ache acheVar = this.a;
        contentValues.put("account", acheVar.c);
        contentValues.put("key", this.b);
        contentValues.put("value", this.c.i());
        if (adagVar.k(acheVar.b, contentValues, 5) == -1) {
            throw new android.database.SQLException("Failed to put() to DB.");
        }
    }
}
