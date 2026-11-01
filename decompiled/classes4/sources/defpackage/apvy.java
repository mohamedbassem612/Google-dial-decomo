package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apvy extends defpackage.apvi {
    private static final java.lang.String e = "apvy";
    public final int a;
    public final defpackage.apvs b;
    public final android.content.Context d;
    private final java.lang.String f;
    private final java.util.concurrent.ExecutorService g;
    public final java.util.concurrent.atomic.AtomicInteger c = new java.util.concurrent.atomic.AtomicInteger();
    private long h = -1;

    public apvy(defpackage.apvk apvkVar) {
        int i;
        new xkn("JavaCronetEngine#JavaCronetEngine", 3, (byte[]) null);
        try {
            android.content.Context context = apvkVar.c;
            this.d = context;
            int iHashCode = hashCode();
            this.a = iHashCode;
            this.f = apvkVar.e;
            this.g = new java.util.concurrent.ThreadPoolExecutor(10, 10, 50L, java.util.concurrent.TimeUnit.SECONDS, (java.util.concurrent.BlockingQueue<java.lang.Runnable>) new java.util.concurrent.LinkedBlockingQueue(), (java.util.concurrent.ThreadFactory) new ibm(this, 5));
            defpackage.apvp apvpVar = defpackage.apvp.CRONET_SOURCE_FALLBACK;
            defpackage.apvs apvsVarA = defpackage.apvt.a(context, apvpVar);
            this.b = apvsVarA;
            long j = iHashCode;
            try {
                boolean z = apvkVar.d;
                boolean z2 = apvkVar.g;
                boolean z3 = apvkVar.h;
                boolean z4 = apvkVar.i;
                int iOrdinal = apvkVar.j.ordinal();
                if (iOrdinal == 0) {
                    i = 0;
                } else if (iOrdinal == 1) {
                    i = 3;
                } else if (iOrdinal == 2) {
                    i = 2;
                } else {
                    if (iOrdinal != 3) {
                        throw new java.lang.IllegalArgumentException("Unknown internal builder cache mode");
                    }
                    i = 1;
                }
                apvsVarA.c(j, new defpackage.apvn(z, z2, z3, z4, i, apvkVar.k, apvkVar.l, apvkVar.getLogCronetInitializationRef()), new defpackage.apvr("CronetHttpURLConnection/".concat(org.chromium.net.impl.ImplVersion.getCronetVersionWithLastChange()).split("/")[1].split("@")[0]), apvpVar);
            } catch (java.lang.RuntimeException e2) {
                android.util.Log.e("cn_".concat(java.lang.String.valueOf(e)), "Error while trying to log JavaCronetEngine creation: ", e2);
            }
            android.util.Log.w("cn_".concat(java.lang.String.valueOf(e)), "using the fallback Cronet Engine implementation. Performance will suffer and many HTTP client features, including caching, will not work.");
            android.os.Trace.endSection();
        } catch (java.lang.Throwable th) {
            try {
                android.os.Trace.endSection();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    final void a() {
        this.c.decrementAndGet();
    }

    @Override // defpackage.apvi
    protected final org.chromium.net.ExperimentalBidirectionalStream b(java.lang.String str, org.chromium.net.BidirectionalStream.Callback callback, java.util.concurrent.Executor executor, java.lang.String str2, java.util.List list, int i, boolean z, java.util.Collection collection, boolean z2, int i2, boolean z3, int i3) {
        throw new java.lang.UnsupportedOperationException("Can't create a bidi stream - httpurlconnection doesn't have those APIs");
    }

    public final void bindToNetwork(long j) {
        this.h = j;
    }

    @Override // defpackage.apvi
    public final org.chromium.net.ExperimentalUrlRequest c(java.lang.String str, org.chromium.net.UrlRequest.Callback callback, java.util.concurrent.Executor executor, int i, java.util.Collection collection, boolean z, boolean z2, boolean z3, int i2, boolean z4, int i3, org.chromium.net.RequestFinishedInfo.Listener listener, long j, java.lang.String str2, java.util.ArrayList arrayList, org.chromium.net.UploadDataProvider uploadDataProvider, java.util.concurrent.Executor executor2) {
        if (j != -1) {
            this.h = j;
        }
        return new defpackage.apwm(this, callback, this.g, executor, str, this.f, z2, z3, i2, z4, i3, this.h, str2, arrayList, uploadDataProvider, executor2);
    }

    public final java.net.URLStreamHandlerFactory createURLStreamHandlerFactory() {
        return new defpackage.apvx(this);
    }

    public final int getActiveRequestCount() {
        return this.c.get();
    }

    public final int getDownstreamThroughputKbps() {
        return -1;
    }

    public final int getEffectiveConnectionType() {
        return 0;
    }

    public final byte[] getGlobalMetricsDeltas() {
        return new byte[0];
    }

    public final int getHttpRttMs() {
        return -1;
    }

    public final int getTransportRttMs() {
        return -1;
    }

    public final java.lang.String getVersionString() {
        return "CronetHttpURLConnection/".concat(org.chromium.net.impl.ImplVersion.getCronetVersionWithLastChange());
    }

    @Override // defpackage.apvi, org.chromium.net.ExperimentalCronetEngine
    public final org.chromium.net.ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(java.lang.String str, org.chromium.net.BidirectionalStream.Callback callback, java.util.concurrent.Executor executor) {
        throw new java.lang.UnsupportedOperationException("The bidirectional stream API is not supported by the Java implementation of Cronet Engine");
    }

    @Override // defpackage.apvi, org.chromium.net.ExperimentalCronetEngine
    /* JADX INFO: renamed from: newUrlRequestBuilder */
    public final /* synthetic */ org.chromium.net.UrlRequest.Builder mo44newUrlRequestBuilder(java.lang.String str, org.chromium.net.UrlRequest.Callback callback, java.util.concurrent.Executor executor) {
        return new defpackage.apws(str, callback, executor, this);
    }

    public final java.net.URLConnection openConnection(java.net.URL url) {
        return url.openConnection();
    }

    public final void shutdown() {
        this.g.shutdown();
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final java.net.URLConnection openConnection(java.net.URL url, java.net.Proxy proxy) {
        return url.openConnection(proxy);
    }

    public final void stopNetLog() {
    }

    public final void addRequestFinishedListener(org.chromium.net.RequestFinishedInfo.Listener listener) {
    }

    public final void addRttListener(org.chromium.net.NetworkQualityRttListener networkQualityRttListener) {
    }

    public final void addThroughputListener(org.chromium.net.NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    public final void removeRequestFinishedListener(org.chromium.net.RequestFinishedInfo.Listener listener) {
    }

    public final void removeRttListener(org.chromium.net.NetworkQualityRttListener networkQualityRttListener) {
    }

    public final void removeThroughputListener(org.chromium.net.NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    public final void startNetLogToFile(java.lang.String str, boolean z) {
    }

    public final void configureNetworkQualityEstimatorForTesting(boolean z, boolean z2, boolean z3) {
    }

    public final void startNetLogToDisk(java.lang.String str, boolean z, int i) {
    }
}
