package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aput extends defpackage.apvi {
    public static final /* synthetic */ int b = 0;
    private static boolean c;
    private static boolean d;
    public final android.net.http.HttpEngine a;
    private final java.util.Map e = j$.util.DesugarCollections.synchronizedMap(new java.util.HashMap());

    public aput(android.net.http.HttpEngine httpEngine) {
        this.a = httpEngine;
    }

    private static final android.net.Network d(long j) {
        if (j == -1) {
            return null;
        }
        return android.net.Network.fromNetworkHandle(j);
    }

    final void a(org.chromium.net.RequestFinishedInfo requestFinishedInfo, defpackage.apww apwwVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Map map = this.e;
        synchronized (map) {
            arrayList.addAll(map.values());
        }
        if (apwwVar != null) {
            arrayList.add(apwwVar);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            defpackage.apww apwwVar2 = (defpackage.apww) arrayList.get(i);
            try {
                apwwVar2.getExecutor().execute(new anxz(apwwVar2, requestFinishedInfo, 13, (byte[]) null));
            } catch (java.util.concurrent.RejectedExecutionException e) {
                android.util.Log.e("cn_HttpEngineWrapper", "Exception posting task to executor", e);
            }
        }
    }

    public final void addRequestFinishedListener(org.chromium.net.RequestFinishedInfo.Listener listener) {
        this.e.put(listener, new defpackage.apww(listener));
    }

    @Override // defpackage.apvi
    public final org.chromium.net.ExperimentalBidirectionalStream b(java.lang.String str, org.chromium.net.BidirectionalStream.Callback callback, java.util.concurrent.Executor executor, java.lang.String str2, java.util.List list, int i, boolean z, java.util.Collection collection, boolean z2, int i2, boolean z3, int i3) {
        defpackage.apuo apuoVar = new defpackage.apuo(callback);
        android.net.http.BidirectionalStream.Builder builderNewBidirectionalStreamBuilder = this.a.newBidirectionalStreamBuilder(str, executor, apuoVar);
        builderNewBidirectionalStreamBuilder.setHttpMethod(str2);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            builderNewBidirectionalStreamBuilder.addHeader((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        builderNewBidirectionalStreamBuilder.setPriority(i);
        builderNewBidirectionalStreamBuilder.setDelayRequestHeadersUntilFirstFlushEnabled(z);
        if (z2) {
            builderNewBidirectionalStreamBuilder.setTrafficStatsTag(i2);
        }
        if (z3) {
            builderNewBidirectionalStreamBuilder.setTrafficStatsUid(i3);
        }
        defpackage.apup apupVar = new defpackage.apup(builderNewBidirectionalStreamBuilder.build(), this, str, collection);
        apuoVar.a = apupVar;
        return apupVar;
    }

    public final void bindToNetwork(long j) {
        this.a.bindToNetwork(d(j));
    }

    @Override // defpackage.apvi
    public final org.chromium.net.ExperimentalUrlRequest c(java.lang.String str, org.chromium.net.UrlRequest.Callback callback, java.util.concurrent.Executor executor, int i, java.util.Collection collection, boolean z, boolean z2, boolean z3, int i2, boolean z4, int i3, org.chromium.net.RequestFinishedInfo.Listener listener, long j, java.lang.String str2, java.util.ArrayList arrayList, org.chromium.net.UploadDataProvider uploadDataProvider, java.util.concurrent.Executor executor2) {
        defpackage.apvc apvcVar = new defpackage.apvc(callback);
        android.net.http.UrlRequest.Builder builderNewUrlRequestBuilder = this.a.newUrlRequestBuilder(str, executor, apvcVar);
        builderNewUrlRequestBuilder.setPriority(i);
        if (z) {
            builderNewUrlRequestBuilder.setCacheDisabled(true);
        }
        if (z2) {
            builderNewUrlRequestBuilder.setDirectExecutorAllowed(true);
        }
        if (z3) {
            builderNewUrlRequestBuilder.setTrafficStatsTag(i2);
        }
        if (z4) {
            builderNewUrlRequestBuilder.setTrafficStatsUid(i3);
        }
        builderNewUrlRequestBuilder.bindToNetwork(d(j));
        builderNewUrlRequestBuilder.setHttpMethod(str2);
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            java.util.Map.Entry entry = (java.util.Map.Entry) arrayList.get(i4);
            builderNewUrlRequestBuilder.addHeader((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        if (uploadDataProvider != null) {
            builderNewUrlRequestBuilder.setUploadDataProvider(new defpackage.apuy(uploadDataProvider), executor2);
        }
        defpackage.apve apveVar = new defpackage.apve(builderNewUrlRequestBuilder.build(), this, str, collection, listener);
        apvcVar.b = apveVar;
        return apveVar;
    }

    public final java.net.URLStreamHandlerFactory createURLStreamHandlerFactory() {
        return this.a.createUrlStreamHandlerFactory();
    }

    public final byte[] getGlobalMetricsDeltas() {
        if (!d) {
            android.util.Log.i("cn_HttpEngineWrapper", "GlobalMetricsDelta is unsupported when HttpEngineNativeProvider is used. An empty protobuf is returned.");
            d = true;
        }
        return new byte[0];
    }

    public final java.lang.String getVersionString() {
        return android.net.http.HttpEngine.getVersionString();
    }

    @Override // defpackage.apvi, org.chromium.net.ExperimentalCronetEngine
    public final /* synthetic */ org.chromium.net.BidirectionalStream.Builder newBidirectionalStreamBuilder(java.lang.String str, org.chromium.net.BidirectionalStream.Callback callback, java.util.concurrent.Executor executor) {
        return new defpackage.apvg(str, callback, executor, this);
    }

    @Override // defpackage.apvi, org.chromium.net.ExperimentalCronetEngine
    /* JADX INFO: renamed from: newUrlRequestBuilder */
    public final /* synthetic */ org.chromium.net.UrlRequest.Builder mo44newUrlRequestBuilder(java.lang.String str, org.chromium.net.UrlRequest.Callback callback, java.util.concurrent.Executor executor) {
        return new defpackage.apws(str, callback, executor, this);
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final java.net.URLConnection openConnection(java.net.URL url, java.net.Proxy proxy) {
        if (proxy.type() != java.net.Proxy.Type.DIRECT) {
            throw new java.lang.UnsupportedOperationException();
        }
        java.lang.String protocol = url.getProtocol();
        if ("http".equals(protocol) || "https".equals(protocol)) {
            return openConnection(url);
        }
        throw new java.lang.UnsupportedOperationException("Unexpected protocol:".concat(java.lang.String.valueOf(protocol)));
    }

    public final void removeRequestFinishedListener(org.chromium.net.RequestFinishedInfo.Listener listener) {
        this.e.remove(listener);
    }

    public final void shutdown() {
        this.a.shutdown();
    }

    public final void startNetLogToFile(java.lang.String str, boolean z) {
        if (c) {
            return;
        }
        android.util.Log.i("cn_HttpEngineWrapper", "Netlog is unsupported when HttpEngineNativeProvider is used.");
        c = true;
    }

    @Override // defpackage.apvi, org.chromium.net.ExperimentalCronetEngine
    public final org.chromium.net.ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(java.lang.String str, org.chromium.net.BidirectionalStream.Callback callback, java.util.concurrent.Executor executor) {
        return new defpackage.apvg(str, callback, executor, this);
    }

    public final void stopNetLog() {
    }

    public final java.net.URLConnection openConnection(java.net.URL url) {
        return (java.net.URLConnection) defpackage.aoil.k(new defpackage.apva(this, url, 1), java.io.IOException.class);
    }
}
