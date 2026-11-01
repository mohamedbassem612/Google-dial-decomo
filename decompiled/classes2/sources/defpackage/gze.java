package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class gze implements defpackage.gzu {
    @Override // defpackage.gzu
    public final void a(java.lang.Object obj) {
        java.lang.Throwable th = (java.lang.Throwable) obj;
        defpackage.gzu gzuVar = com.airbnb.lottie.LottieAnimationView.a;
        java.lang.ThreadLocal threadLocal = defpackage.hgm.a;
        if (!(th instanceof java.net.SocketException) && !(th instanceof java.nio.channels.ClosedChannelException) && !(th instanceof java.io.InterruptedIOException) && !(th instanceof java.net.ProtocolException) && !(th instanceof javax.net.ssl.SSLException) && !(th instanceof java.net.UnknownHostException) && !(th instanceof java.net.UnknownServiceException)) {
            throw new java.lang.IllegalStateException("Unable to parse composition", th);
        }
        defpackage.hge.b("Unable to load composition.", th);
    }
}
