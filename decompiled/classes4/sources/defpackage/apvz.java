package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apvz extends defpackage.apvk {
    private static final java.util.concurrent.atomic.AtomicLong m = new java.util.concurrent.atomic.AtomicLong(0);

    public apvz(android.content.Context context) {
        super(context, defpackage.apvp.CRONET_SOURCE_FALLBACK);
    }

    @Override // defpackage.apvk, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ org.chromium.net.ICronetEngineBuilder addPublicKeyPins(java.lang.String str, java.util.Set set, boolean z, java.util.Date date) {
        super.c(str, set, date);
        return this;
    }

    @Override // defpackage.apvk, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ org.chromium.net.ICronetEngineBuilder addQuicHint(java.lang.String str, int i, int i2) {
        super.d(str);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final org.chromium.net.ExperimentalCronetEngine build() {
        if (this.e == null) {
            this.e = getDefaultUserAgent();
        }
        return new defpackage.apvy(this);
    }

    @Override // defpackage.apvk, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ org.chromium.net.ICronetEngineBuilder enableBrotli(boolean z) {
        this.i = z;
        return this;
    }

    @Override // defpackage.apvk, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ org.chromium.net.ICronetEngineBuilder enableHttp2(boolean z) {
        this.h = z;
        return this;
    }

    @Override // defpackage.apvk, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ org.chromium.net.ICronetEngineBuilder enableHttpCache(int i, long j) {
        super.a(i);
        return this;
    }

    @Override // defpackage.apvk, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ org.chromium.net.ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        this.l = z;
        return this;
    }

    @Override // defpackage.apvk, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ org.chromium.net.ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        this.d = z;
        return this;
    }

    @Override // defpackage.apvk, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ org.chromium.net.ICronetEngineBuilder enableQuic(boolean z) {
        this.g = z;
        return this;
    }

    @Override // defpackage.apvk, org.chromium.net.ICronetEngineBuilder
    protected final long getLogCronetInitializationRef() {
        java.util.concurrent.atomic.AtomicLong atomicLong = m;
        atomicLong.compareAndSet(0L, this.b.a());
        return atomicLong.get();
    }

    @Override // defpackage.apvk, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ org.chromium.net.ICronetEngineBuilder setExperimentalOptions(java.lang.String str) {
        this.k = str;
        return this;
    }

    @Override // defpackage.apvk, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ org.chromium.net.ICronetEngineBuilder setProxyOptionsV2(org.chromium.net.ProxyOptions proxyOptions) {
        new org.chromium.net.VersionSafeProxyOptions(proxyOptions);
        return this;
    }

    @Override // defpackage.apvk, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ org.chromium.net.ICronetEngineBuilder setStoragePath(java.lang.String str) {
        super.b(str);
        return this;
    }

    @Override // defpackage.apvk, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ org.chromium.net.ICronetEngineBuilder setUserAgent(java.lang.String str) {
        this.e = str;
        return this;
    }

    @Override // defpackage.apvk, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ org.chromium.net.ICronetEngineBuilder enableSdch(boolean z) {
        return this;
    }

    @Override // defpackage.apvk, org.chromium.net.ICronetEngineBuilder
    @java.lang.Deprecated
    public final /* bridge */ /* synthetic */ org.chromium.net.ICronetEngineBuilder setLibraryLoader(org.chromium.net.CronetEngine$Builder.LibraryLoader libraryLoader) {
        return this;
    }

    @Override // defpackage.apvk, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ org.chromium.net.ICronetEngineBuilder setThreadPriority(int i) {
        return this;
    }
}
