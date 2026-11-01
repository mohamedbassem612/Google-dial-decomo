package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class agxb implements agxe {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ agxb(android.net.Uri uri, android.content.ContentValues contentValues, int i) {
        this.$cid = i;
        this.b = uri;
        this.a = contentValues;
    }

    public final java.lang.Object a(apni apniVar) {
        if (this.$cid != 0) {
            return apniVar.o((android.net.Uri) this.b, (android.content.ContentValues) this.a);
        }
        return apniVar.q((java.lang.String) this.a, (java.util.ArrayList) this.b);
    }

    public /* synthetic */ agxb(java.lang.String str, java.util.ArrayList arrayList, int i) {
        this.$cid = i;
        this.a = str;
        this.b = arrayList;
    }
}
