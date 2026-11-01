package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class apvc implements android.net.http.UrlRequest$Callback {
    public final org.chromium.net.UrlRequest.Callback a;
    public defpackage.apve b;

    public apvc(org.chromium.net.UrlRequest.Callback callback) {
        this.a = (org.chromium.net.UrlRequest.Callback) j$.util.Objects.requireNonNull(callback, "Callback is required.");
    }

    public final void onCanceled(android.net.http.UrlRequest urlRequest, android.net.http.UrlResponseInfo urlResponseInfo) {
        defpackage.apvf apvfVarB = defpackage.apvf.b(urlResponseInfo);
        try {
            this.a.onCanceled(this.b, apvfVarB);
        } finally {
            this.b.a(2, apvfVarB, null);
        }
    }

    public final void onFailed(android.net.http.UrlRequest urlRequest, android.net.http.UrlResponseInfo urlResponseInfo, android.net.http.HttpException httpException) {
        defpackage.apvf apvfVarB = defpackage.apvf.b(urlResponseInfo);
        org.chromium.net.CronetException cronetExceptionL = defpackage.aoil.l(httpException);
        try {
            this.a.onFailed(this.b, apvfVarB, cronetExceptionL);
        } finally {
            this.b.a(1, apvfVarB, cronetExceptionL);
        }
    }

    public final void onReadCompleted(android.net.http.UrlRequest urlRequest, android.net.http.UrlResponseInfo urlResponseInfo, java.nio.ByteBuffer byteBuffer) throws java.lang.Exception {
        defpackage.aoil.k(new defpackage.apvb(this, urlResponseInfo, byteBuffer, 1), java.lang.Exception.class);
    }

    public final void onRedirectReceived(android.net.http.UrlRequest urlRequest, android.net.http.UrlResponseInfo urlResponseInfo, java.lang.String str) throws java.lang.Exception {
        defpackage.aoil.k(new defpackage.apvb(this, urlResponseInfo, str, 0), java.lang.Exception.class);
    }

    public final void onResponseStarted(android.net.http.UrlRequest urlRequest, android.net.http.UrlResponseInfo urlResponseInfo) throws java.lang.Exception {
        defpackage.aoil.k(new defpackage.apva(this, urlResponseInfo, 0), java.lang.Exception.class);
    }

    public final void onSucceeded(android.net.http.UrlRequest urlRequest, android.net.http.UrlResponseInfo urlResponseInfo) {
        defpackage.apvf apvfVarB = defpackage.apvf.b(urlResponseInfo);
        try {
            this.a.onSucceeded(this.b, apvfVarB);
        } finally {
            this.b.a(0, apvfVarB, null);
        }
    }
}
