package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class apve extends org.chromium.net.ExperimentalUrlRequest {
    private final android.net.http.UrlRequest a;
    private final defpackage.aput b;
    private final java.lang.String c;
    private final java.util.Collection d;
    private final defpackage.apww e;

    public apve(android.net.http.UrlRequest urlRequest, defpackage.aput aputVar, java.lang.String str, java.util.Collection collection, org.chromium.net.RequestFinishedInfo.Listener listener) {
        this.a = urlRequest;
        this.b = aputVar;
        this.c = str;
        this.d = collection;
        this.e = listener == null ? null : new defpackage.apww(listener);
    }

    final void a(int i, defpackage.apvf apvfVar, org.chromium.net.CronetException cronetException) {
        defpackage.apux.a(this.b, this.c, this.d, this.e, i, apvfVar, cronetException);
    }

    @Override // org.chromium.net.UrlRequest
    public final void cancel() {
        this.a.cancel();
    }

    @Override // org.chromium.net.UrlRequest
    public final void followRedirect() {
        this.a.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest
    public final void getStatus(org.chromium.net.UrlRequest.StatusListener statusListener) {
        this.a.getStatus(new defpackage.apvd(statusListener));
    }

    @Override // org.chromium.net.UrlRequest
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // org.chromium.net.UrlRequest
    public final void read(java.nio.ByteBuffer byteBuffer) {
        this.a.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest
    public final void start() {
        this.a.start();
    }
}
