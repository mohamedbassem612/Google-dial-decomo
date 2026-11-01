package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apus extends org.chromium.net.ICronetEngineBuilder {
    private static boolean a;
    private boolean b;
    private final android.content.Context c;
    private final android.net.http.HttpEngine.Builder d;

    public apus(android.content.Context context, android.net.http.HttpEngine.Builder builder) {
        this.c = context;
        this.d = builder;
    }

    private static int a(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            return i2 != 2 ? 0 : 2;
        }
        return 1;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final org.chromium.net.ICronetEngineBuilder addPublicKeyPins(java.lang.String str, java.util.Set set, boolean z, java.util.Date date) {
        this.d.addPublicKeyPins(str, set, z, j$.time.TimeConversions.convert(j$.util.DateRetargetClass.toInstant(date)));
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final org.chromium.net.ICronetEngineBuilder addQuicHint(java.lang.String str, int i, int i2) {
        this.d.addQuicHint(str, i, i2);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final org.chromium.net.ExperimentalCronetEngine build() {
        if (!this.b) {
            setUserAgent(getDefaultUserAgent());
        }
        return new defpackage.aput(this.d.build());
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final org.chromium.net.ICronetEngineBuilder enableBrotli(boolean z) {
        this.d.setEnableBrotli(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final org.chromium.net.ICronetEngineBuilder enableHttp2(boolean z) {
        this.d.setEnableHttp2(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final org.chromium.net.ICronetEngineBuilder enableHttpCache(int i, long j) {
        this.d.setEnableHttpCache(i, j);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final org.chromium.net.ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        if (!a) {
            android.util.Log.i("cn_HttpEngBuilderWrap", "NetworkQualityEstimator is unsupported when HttpEngineNativeProvider is used");
            a = true;
        }
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final org.chromium.net.ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        this.d.setEnablePublicKeyPinningBypassForLocalTrustAnchors(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final org.chromium.net.ICronetEngineBuilder enableQuic(boolean z) {
        this.d.setEnableQuic(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final java.lang.String getDefaultUserAgent() {
        return defpackage.apwv.a(this.c, defpackage.apvp.CRONET_SOURCE_PLATFORM, android.net.http.HttpEngine.getVersionString());
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final java.util.Set getSupportedConfigOptions() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(4);
        return j$.util.DesugarCollections.unmodifiableSet(hashSet);
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final org.chromium.net.ICronetEngineBuilder setExperimentalOptions(java.lang.String str) {
        defpackage.apzy apzyVar = new defpackage.apzy(str);
        android.net.http.ConnectionMigrationOptions.Builder builder = new android.net.http.ConnectionMigrationOptions.Builder();
        builder.setDefaultNetworkMigration(a(apzyVar.k()));
        builder.setPathDegradationMigration(a(anty.aN((java.lang.Boolean) apzyVar.f("QUIC", "allow_port_migration", null, java.lang.Boolean.class))));
        int iJ = apzyVar.j();
        builder.setAllowNonDefaultNetworkUsage(a(iJ));
        if (iJ == 2) {
            builder.setPathDegradationMigration(a(2));
        }
        android.net.http.HttpEngine.Builder builder2 = this.d;
        builder2.setConnectionMigrationOptions(builder.build());
        android.net.http.DnsOptions.StaleDnsOptions.Builder builder3 = new android.net.http.DnsOptions.StaleDnsOptions.Builder();
        int iC = apzyVar.c();
        if (iC != -1) {
            builder3.setFreshLookupTimeout(j$.time.TimeConversions.convert(j$.time.Duration.ofMillis(iC)));
        }
        int iD = apzyVar.d();
        if (iD != -1) {
            builder3.setMaxExpiredDelay(j$.time.TimeConversions.convert(j$.time.Duration.ofMillis(iD)));
        }
        builder3.setAllowCrossNetworkUsage(a(apzyVar.l())).setUseStaleOnNameNotResolved(a(apzyVar.o()));
        android.net.http.DnsOptions.Builder builder4 = new android.net.http.DnsOptions.Builder();
        builder4.setUseHttpStackDnsResolver(a(apzyVar.i())).setStaleDns(a(apzyVar.m())).setStaleDnsOptions(builder3.build()).setPreestablishConnectionsToStaleDnsResults(a(anty.aN((java.lang.Boolean) apzyVar.f("QUIC", "race_stale_dns_on_connection", null, java.lang.Boolean.class)))).setPersistHostCache(a(apzyVar.n()));
        int iE = apzyVar.e();
        if (iE != -1) {
            builder4.setPersistHostCachePeriod(j$.time.TimeConversions.convert(j$.time.Duration.ofMillis(iE)));
        }
        builder2.setDnsOptions(builder4.build());
        android.net.http.QuicOptions.Builder builder5 = new android.net.http.QuicOptions.Builder();
        if (apzyVar.g() != null) {
            for (java.lang.String str2 : apzyVar.g().split(",")) {
                builder5.addAllowedQuicHost(str2);
            }
        }
        int iB = apzyVar.b();
        if (iB != -1) {
            builder5.setInMemoryServerConfigsCacheSize(iB);
        }
        java.lang.String str3 = (java.lang.String) apzyVar.f("QUIC", "user_agent_id", null, java.lang.String.class);
        if (str3 != null) {
            builder5.setHandshakeUserAgent(str3);
        }
        int iA = apzyVar.a();
        if (iA != -1) {
            builder5.setIdleConnectionTimeout(j$.time.TimeConversions.convert(j$.time.Duration.ofSeconds(iA)));
        }
        builder2.setQuicOptions(builder5.build());
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final org.chromium.net.ICronetEngineBuilder setProxyOptionsV2(org.chromium.net.ProxyOptions proxyOptions) {
        org.chromium.net.AndroidProxyOptions.apply(this.d, proxyOptions);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final org.chromium.net.ICronetEngineBuilder setStoragePath(java.lang.String str) {
        this.d.setStoragePath(str);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final org.chromium.net.ICronetEngineBuilder setUserAgent(java.lang.String str) {
        this.d.setUserAgent(str);
        this.b = str != null;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final org.chromium.net.ICronetEngineBuilder enableSdch(boolean z) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    @java.lang.Deprecated
    public final org.chromium.net.ICronetEngineBuilder setLibraryLoader(org.chromium.net.CronetEngine$Builder.LibraryLoader libraryLoader) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final org.chromium.net.ICronetEngineBuilder setThreadPriority(int i) {
        return this;
    }
}
