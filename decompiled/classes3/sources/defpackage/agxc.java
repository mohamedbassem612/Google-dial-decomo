package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class agxc implements defpackage.agxe {
    public final /* synthetic */ android.net.Uri a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ java.lang.String[] c;

    public /* synthetic */ agxc(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        this.a = uri;
        this.b = str;
        this.c = strArr;
    }

    @Override // defpackage.agxe
    public final java.lang.Object a(apni apniVar) {
        final android.net.Uri uri = this.a;
        final java.lang.String str = this.b;
        final java.lang.String[] strArr = this.c;
        java.lang.Integer num = (java.lang.Integer) apniVar.p(uri, new defpackage.agum() { // from class: ague
            @Override // defpackage.agum
            public final java.lang.Object a(android.content.ContentProviderClient contentProviderClient) {
                return java.lang.Integer.valueOf(contentProviderClient.delete(uri, str, strArr));
            }
        });
        num.intValue();
        return num;
    }
}
