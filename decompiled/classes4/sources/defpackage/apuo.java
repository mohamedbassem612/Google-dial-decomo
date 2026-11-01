package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class apuo implements android.net.http.BidirectionalStream$Callback {
    public defpackage.apup a;
    private final org.chromium.net.BidirectionalStream.Callback b;

    public apuo(org.chromium.net.BidirectionalStream.Callback callback) {
        this.b = (org.chromium.net.BidirectionalStream.Callback) j$.util.Objects.requireNonNull(callback, "Callback is required.");
    }

    public final void onCanceled(android.net.http.BidirectionalStream bidirectionalStream, android.net.http.UrlResponseInfo urlResponseInfo) {
        defpackage.apvf apvfVarA = defpackage.apvf.a(urlResponseInfo);
        try {
            this.b.onCanceled(this.a, apvfVarA);
        } finally {
            this.a.a(2, apvfVarA, null);
        }
    }

    public final void onFailed(android.net.http.BidirectionalStream bidirectionalStream, android.net.http.UrlResponseInfo urlResponseInfo, android.net.http.HttpException httpException) {
        defpackage.apvf apvfVarA = defpackage.apvf.a(urlResponseInfo);
        org.chromium.net.CronetException cronetExceptionL = defpackage.aoil.l(httpException);
        try {
            this.b.onFailed(this.a, apvfVarA, cronetExceptionL);
        } finally {
            this.a.a(1, apvfVarA, cronetExceptionL);
        }
    }

    public final void onReadCompleted(android.net.http.BidirectionalStream bidirectionalStream, android.net.http.UrlResponseInfo urlResponseInfo, java.nio.ByteBuffer byteBuffer, boolean z) {
        this.b.onReadCompleted(this.a, defpackage.apvf.a(urlResponseInfo), byteBuffer, z);
    }

    public final void onResponseHeadersReceived(android.net.http.BidirectionalStream bidirectionalStream, android.net.http.UrlResponseInfo urlResponseInfo) {
        this.b.onResponseHeadersReceived(this.a, defpackage.apvf.a(urlResponseInfo));
    }

    public final void onResponseTrailersReceived(android.net.http.BidirectionalStream bidirectionalStream, android.net.http.UrlResponseInfo urlResponseInfo, android.net.http.HeaderBlock headerBlock) {
        this.b.onResponseTrailersReceived(this.a, defpackage.apvf.a(urlResponseInfo), new defpackage.apur(headerBlock));
    }

    public final void onStreamReady(android.net.http.BidirectionalStream bidirectionalStream) {
        this.b.onStreamReady(this.a);
    }

    public final void onSucceeded(android.net.http.BidirectionalStream bidirectionalStream, android.net.http.UrlResponseInfo urlResponseInfo) {
        defpackage.apvf apvfVarA = defpackage.apvf.a(urlResponseInfo);
        try {
            this.b.onSucceeded(this.a, apvfVarA);
        } finally {
            this.a.a(0, apvfVarA, null);
        }
    }

    public final void onWriteCompleted(android.net.http.BidirectionalStream bidirectionalStream, android.net.http.UrlResponseInfo urlResponseInfo, java.nio.ByteBuffer byteBuffer, boolean z) {
        this.b.onWriteCompleted(this.a, defpackage.apvf.a(urlResponseInfo), byteBuffer, z);
    }
}
