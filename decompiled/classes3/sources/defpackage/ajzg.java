package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ajzg extends org.chromium.net.UrlRequest.Callback {
    public final ajdd a;
    final defpackage.ajzm b;
    private final java.util.concurrent.Executor e;
    public final ajyi d = new ajyi();
    public final java.util.List c = new java.util.ArrayList();

    public ajzg(ajdd ajddVar, java.util.concurrent.Executor executor, defpackage.ajzm ajzmVar) {
        this.a = ajddVar;
        this.e = executor;
        this.b = ajzmVar;
    }

    public static final aiii b(java.util.Map map) {
        aifz aifzVar = new aifz();
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.util.Iterator it = ((java.util.List) entry.getValue()).iterator();
            while (it.hasNext()) {
                aifzVar.b(defpackage.ajzj.a((java.lang.String) entry.getKey()), (java.lang.String) it.next());
            }
        }
        return aifzVar.a();
    }

    public final int a(org.chromium.net.UrlResponseInfo urlResponseInfo) {
        if ("head".equalsIgnoreCase(this.b.g)) {
            return 1;
        }
        java.util.Map allHeaders = urlResponseInfo.getAllHeaders();
        if (!allHeaders.containsKey("content-length")) {
            return 32768;
        }
        int i = java.lang.Integer.parseInt((java.lang.String) ((java.util.List) allHeaders.get("content-length")).get(0));
        return allHeaders.containsKey("content-encoding") ? java.lang.Math.max(java.lang.Math.min(i << 1, 32768), 1) : 1 + i;
    }

    public final void onCanceled(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo) {
        this.e.execute(new defpackage.ahts(this, 11));
    }

    public final void onFailed(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo, org.chromium.net.CronetException cronetException) {
        this.e.execute(new defpackage.agrz(this, cronetException, 15));
    }

    public final void onReadCompleted(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo, java.nio.ByteBuffer byteBuffer) {
        this.d.a(byteBuffer);
        if (byteBuffer.hasRemaining()) {
            urlRequest.read(byteBuffer);
        } else {
            urlRequest.read(java.nio.ByteBuffer.allocateDirect(32768));
        }
    }

    public final void onRedirectReceived(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo, java.lang.String str) {
        if (this.b.e) {
            this.c.add(str);
            urlRequest.followRedirect();
            return;
        }
        ajdd ajddVar = this.a;
        defpackage.ajzq ajzqVar = new defpackage.ajzq();
        ajzqVar.a(b(urlResponseInfo.getAllHeaders()));
        ajzqVar.b(java.nio.ByteBuffer.allocateDirect(0));
        ajzqVar.d = urlResponseInfo.getHttpStatusCode();
        ajddVar.o(new defpackage.alic(ajzqVar));
        urlRequest.cancel();
    }

    public final void onResponseStarted(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo) {
        java.nio.ByteBuffer byteBufferAllocateDirect = java.nio.ByteBuffer.allocateDirect(a(urlResponseInfo));
        this.d.a(byteBufferAllocateDirect);
        urlRequest.read(byteBufferAllocateDirect);
    }

    public final void onSucceeded(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo) {
        this.e.execute(new defpackage.agrz(this, urlResponseInfo, 14));
    }
}
