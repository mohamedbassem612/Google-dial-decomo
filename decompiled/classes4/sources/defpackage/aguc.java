package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class aguc implements agum {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ aguc(android.net.Uri uri, android.content.ContentValues contentValues, int i) {
        this.$cid = i;
        this.a = uri;
        this.b = contentValues;
    }

    public final java.lang.Object a(android.content.ContentProviderClient contentProviderClient) {
        if (this.$cid != 0) {
            return contentProviderClient.applyBatch((java.lang.String) this.b, (java.util.ArrayList) this.a);
        }
        return contentProviderClient.insert((android.net.Uri) this.a, (android.content.ContentValues) this.b);
    }

    public /* synthetic */ aguc(java.lang.String str, java.util.ArrayList arrayList, int i) {
        this.$cid = i;
        this.b = str;
        this.a = arrayList;
    }
}
