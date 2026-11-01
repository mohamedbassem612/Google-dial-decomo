package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class agtz implements defpackage.agum {
    public final /* synthetic */ android.net.Uri a;
    public final /* synthetic */ android.content.ContentValues b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ java.lang.String[] d;

    public /* synthetic */ agtz(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        this.a = uri;
        this.b = contentValues;
        this.c = str;
        this.d = strArr;
    }

    @Override // defpackage.agum
    public final java.lang.Object a(android.content.ContentProviderClient contentProviderClient) {
        return java.lang.Integer.valueOf(contentProviderClient.update(this.a, this.b, this.c, this.d));
    }
}
