package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class apvb implements defpackage.apvm {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ defpackage.apvc a;
    public final /* synthetic */ android.net.http.UrlResponseInfo b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ apvb(defpackage.apvc apvcVar, android.net.http.UrlResponseInfo urlResponseInfo, java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = apvcVar;
        this.b = urlResponseInfo;
        this.c = obj;
    }

    @Override // defpackage.apvm
    public final java.lang.Object a() {
        int i = this.$cid;
        android.net.http.UrlResponseInfo urlResponseInfo = this.b;
        if (i != 0) {
            defpackage.apvc apvcVar = this.a;
            java.lang.Object obj = this.c;
            defpackage.apvf apvfVarB = defpackage.apvf.b(urlResponseInfo);
            apvcVar.a.onReadCompleted(apvcVar.b, apvfVarB, (java.nio.ByteBuffer) obj);
        } else {
            defpackage.apvc apvcVar2 = this.a;
            java.lang.Object obj2 = this.c;
            defpackage.apvf apvfVarB2 = defpackage.apvf.b(urlResponseInfo);
            apvcVar2.a.onRedirectReceived(apvcVar2.b, apvfVarB2, (java.lang.String) obj2);
        }
        return null;
    }
}
