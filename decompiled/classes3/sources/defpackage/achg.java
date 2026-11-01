package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class achg implements afii {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ achg(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection] */
    public final void a(adag adagVar) throws defpackage.acgq {
        if (this.$cid != 0) {
            ache acheVar = (ache) this.a;
            adagVar.j(acheVar.b, "(account = ? AND key = ?)", new java.lang.String[]{acheVar.c, (java.lang.String) this.b});
            return;
        }
        for (defpackage.achu achuVar : this.b) {
            if (achuVar.b > achuVar.c) {
                throw new defpackage.acgq();
            }
            android.content.ContentValues contentValues = new android.content.ContentValues(4);
            java.lang.String str = achuVar.d;
            if (str == null) {
                str = "signedout";
            }
            java.lang.Object obj = this.a;
            contentValues.put("account", str);
            contentValues.put("key", achuVar.e);
            contentValues.put("message", achuVar.a.i());
            contentValues.put("windowStartTimestamp", java.lang.Long.valueOf(achuVar.b));
            contentValues.put("windowEndTimestamp", java.lang.Long.valueOf(achuVar.c));
            if (adagVar.k(((achh) obj).a, contentValues, 5) == -1) {
                throw new android.database.SQLException("Failed to put() to DB.");
            }
        }
    }
}
