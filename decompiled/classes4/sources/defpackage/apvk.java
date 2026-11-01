package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public abstract class apvk extends org.chromium.net.ICronetEngineBuilder {
    protected final defpackage.apvs b;
    public final android.content.Context c;
    public boolean d;
    public java.lang.String e;
    public java.lang.String f;
    public boolean g;
    public boolean h;
    public boolean i;
    public defpackage.apvj j;
    public java.lang.String k;
    public boolean l;
    private final java.util.List n = new java.util.ArrayList();
    private final java.util.List o = new java.util.ArrayList();
    private final defpackage.apvp p;
    private static final java.util.regex.Pattern m = java.util.regex.Pattern.compile("^[0-9\\.]*$");
    static final int a = aoog.r();

    /* JADX WARN: Multi-variable type inference failed */
    public apvk(android.content.Context context, defpackage.apvp apvpVar) {
        long jUptimeMillis = android.os.SystemClock.uptimeMillis();
        android.content.Context applicationContext = context.getApplicationContext();
        this.c = applicationContext;
        this.p = apvpVar;
        this.b = defpackage.apvt.a(applicationContext, apvpVar);
        boolean z = false;
        java.lang.Object[] objArr = 0;
        int i = 0;
        java.lang.Object[] objArr2 = 0;
        boolean z2 = true;
        try {
            this.g = z2;
            this.h = z2;
            this.i = objArr2 == true ? 1 : 0;
            a(i);
            this.l = objArr == true ? 1 : 0;
            this.d = z2;
        } finally {
            e(jUptimeMillis, z, apvpVar);
        }
    }

    private final void e(long j, boolean z, defpackage.apvp apvpVar) {
        if (a < 30) {
            defpackage.apvo apvoVar = new defpackage.apvo();
            apvoVar.d = java.lang.Boolean.FALSE;
            try {
                apvoVar.h = 2;
                apvoVar.g = android.os.Process.myUid();
                apvoVar.f = new defpackage.apvr(org.chromium.net.impl.ImplVersion.getCronetVersion());
                apvoVar.c = apvpVar;
                apvoVar.e = new defpackage.apvr(org.chromium.net.ApiVersion.getCronetVersion());
                apvoVar.a = getLogCronetInitializationRef();
                apvoVar.d = java.lang.Boolean.valueOf(z);
            } finally {
                apvoVar.b = (int) (android.os.SystemClock.uptimeMillis() - j);
                this.b.b(apvoVar);
            }
        }
    }

    public final void a(int i) {
        defpackage.apvj apvjVar;
        defpackage.apvj apvjVar2 = defpackage.apvj.DISABLED;
        if (i == 0) {
            apvjVar = defpackage.apvj.DISABLED;
        } else if (i == 1) {
            apvjVar = defpackage.apvj.MEMORY;
        } else if (i == 2) {
            apvjVar = defpackage.apvj.DISK_NO_HTTP;
        } else {
            if (i != 3) {
                throw new java.lang.IllegalArgumentException("Unknown public builder cache mode");
            }
            apvjVar = defpackage.apvj.DISK;
        }
        if (apvjVar.e == 1 && this.f == null) {
            throw new java.lang.IllegalArgumentException("Storage path must be set");
        }
        this.j = apvjVar;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ org.chromium.net.ICronetEngineBuilder addPublicKeyPins(java.lang.String str, java.util.Set set, boolean z, java.util.Date date) {
        c(str, set, date);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ org.chromium.net.ICronetEngineBuilder addQuicHint(java.lang.String str, int i, int i2) {
        d(str);
        return this;
    }

    public final void b(java.lang.String str) {
        if (!new java.io.File(str).isDirectory()) {
            throw new java.lang.IllegalArgumentException("Storage path must be set to existing directory");
        }
        this.f = str;
    }

    public final void c(java.lang.String str, java.util.Set set, java.util.Date date) {
        j$.util.Objects.requireNonNull(str, "The hostname cannot be null.");
        j$.util.Objects.requireNonNull(set, "The set of SHA256 pins cannot be null.");
        j$.util.Objects.requireNonNull(date, "The pin expiration date cannot be null.");
        if (m.matcher(str).matches()) {
            throw new java.lang.IllegalArgumentException(a.bk(str, "Hostname ", " is illegal. A hostname should not consist of digits and/or dots only."));
        }
        if (str.length() > 253) {
            throw new java.lang.IllegalArgumentException(a.bk(str, "Hostname ", " is too long. The name of the host does not comply with RFC 1122 and RFC 1123."));
        }
        try {
            android.icu.text.IDNA idna = defpackage.aqac.a;
            if (idna == null) {
                java.net.IDN.toASCII(str, 2);
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                android.icu.text.IDNA.Info info = new android.icu.text.IDNA.Info();
                idna.nameToASCII(str, sb, info);
                if (info.hasErrors()) {
                    j$.util.StringJoiner stringJoiner = new j$.util.StringJoiner(", ");
                    java.util.Iterator it = info.getErrors().iterator();
                    while (it.hasNext()) {
                        stringJoiner.add(defpackage.aa$$ExternalSyntheticApiModelOutline1.m(it.next()).toString());
                    }
                    throw new java.lang.IllegalArgumentException("Failed to convert IDN to ASCII: ".concat(stringJoiner.toString()));
                }
                java.net.IDN.toASCII(sb.toString(), 2);
            }
            java.util.HashMap map = new java.util.HashMap();
            java.util.Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                byte[] bArr = (byte[]) it2.next();
                if (bArr == null || bArr.length != 32) {
                    throw new java.lang.IllegalArgumentException("Public key pin is invalid");
                }
                map.put(android.util.Base64.encodeToString(bArr, 0), bArr);
            }
            java.util.List list = this.o;
            list.add(new defpackage.aoil());
        } catch (java.lang.IllegalArgumentException e) {
            throw new java.lang.IllegalArgumentException(a.bk(str, "Hostname ", " is illegal. The name of the host does not comply with RFC 1122 and RFC 1123."), e);
        }
    }

    public final void d(java.lang.String str) {
        if (str.contains("/")) {
            throw new java.lang.IllegalArgumentException("Illegal QUIC Hint Host: ".concat(java.lang.String.valueOf(str)));
        }
        this.n.add(new defpackage.aoil());
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ org.chromium.net.ICronetEngineBuilder enableBrotli(boolean z) {
        this.i = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ org.chromium.net.ICronetEngineBuilder enableHttp2(boolean z) {
        this.h = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ org.chromium.net.ICronetEngineBuilder enableHttpCache(int i, long j) {
        a(i);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ org.chromium.net.ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        this.l = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ org.chromium.net.ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        this.d = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ org.chromium.net.ICronetEngineBuilder enableQuic(boolean z) {
        this.g = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final java.lang.String getDefaultUserAgent() {
        return defpackage.apwv.a(this.c, this.p, org.chromium.net.impl.ImplVersion.getCronetVersion());
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    protected long getLogCronetInitializationRef() {
        return 0L;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final java.util.Set getSupportedConfigOptions() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(4);
        return j$.util.DesugarCollections.unmodifiableSet(hashSet);
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ org.chromium.net.ICronetEngineBuilder setExperimentalOptions(java.lang.String str) {
        this.k = str;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ org.chromium.net.ICronetEngineBuilder setProxyOptionsV2(org.chromium.net.ProxyOptions proxyOptions) {
        new org.chromium.net.VersionSafeProxyOptions(proxyOptions);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ org.chromium.net.ICronetEngineBuilder setStoragePath(java.lang.String str) {
        b(str);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ org.chromium.net.ICronetEngineBuilder setUserAgent(java.lang.String str) {
        this.e = str;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ org.chromium.net.ICronetEngineBuilder enableSdch(boolean z) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ org.chromium.net.ICronetEngineBuilder setLibraryLoader(org.chromium.net.CronetEngine$Builder.LibraryLoader libraryLoader) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ org.chromium.net.ICronetEngineBuilder setThreadPriority(int i) {
        return this;
    }
}
