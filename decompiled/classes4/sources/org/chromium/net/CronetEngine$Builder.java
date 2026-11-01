package org.chromium.net;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public class CronetEngine$Builder {
    public static final int HTTP_CACHE_DISABLED = 0;
    public static final int HTTP_CACHE_DISK = 3;
    public static final int HTTP_CACHE_DISK_NO_HTTP = 2;
    public static final int HTTP_CACHE_IN_MEMORY = 1;
    private static final java.lang.String TAG = "CronetEngine.Builder";
    protected final org.chromium.net.ICronetEngineBuilder mBuilderDelegate;
    private final java.util.List mExperimentalOptionsPatches;
    protected org.json.JSONObject mParsedExperimentalOptions;

    /* JADX INFO: compiled from: PG */
    @java.lang.Deprecated
    public abstract class LibraryLoader {
        @java.lang.Deprecated
        public abstract void loadLibrary(java.lang.String str);
    }

    public CronetEngine$Builder(org.chromium.net.ICronetEngineBuilder iCronetEngineBuilder) {
        this.mExperimentalOptionsPatches = new java.util.ArrayList();
        this.mBuilderDelegate = iCronetEngineBuilder;
    }

    private static org.chromium.net.ICronetEngineBuilder createBuilderDelegate(android.content.Context context) {
        new xkn("CronetEngine#createBuilderDelegate", 3, (byte[]) null);
        try {
            long jUptimeMillis = android.os.SystemClock.uptimeMillis();
            defpackage.apuc preferredCronetProvider = getPreferredCronetProvider(context, new java.util.ArrayList(org.chromium.net.CronetProvider.getAllProviderInfos(context)));
            defpackage.apvs apvsVarA = defpackage.apvt.a(context, preferredCronetProvider.c);
            defpackage.apvo apvoVar = new defpackage.apvo();
            try {
                apvoVar.d = java.lang.Boolean.FALSE;
                apvoVar.h = 1;
                apvoVar.c = preferredCronetProvider.c;
                apvoVar.g = android.os.Process.myUid();
                apvoVar.e = new defpackage.apvr(org.chromium.net.ApiVersion.getCronetVersion());
                if (android.util.Log.isLoggable(TAG, 3)) {
                    aodc.q(TAG, java.lang.String.format("Using '%s' provider for creating CronetEngine.Builder.", preferredCronetProvider.a), new java.lang.Object[0]);
                }
                org.chromium.net.ICronetEngineBuilder iCronetEngineBuilder = preferredCronetProvider.a.createBuilder().mBuilderDelegate;
                java.lang.String implCronetVersion = getImplCronetVersion(iCronetEngineBuilder);
                if (implCronetVersion != null) {
                    apvoVar.f = new defpackage.apvr(implCronetVersion);
                }
                apvoVar.a = iCronetEngineBuilder.getLogCronetInitializationRef();
                apvoVar.d = java.lang.Boolean.TRUE;
                apvoVar.b = (int) (android.os.SystemClock.uptimeMillis() - jUptimeMillis);
                apvsVarA.b(apvoVar);
                android.os.Trace.endSection();
                return iCronetEngineBuilder;
            } catch (java.lang.Throwable th) {
                apvoVar.b = (int) (android.os.SystemClock.uptimeMillis() - jUptimeMillis);
                apvsVarA.b(apvoVar);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            try {
                android.os.Trace.endSection();
            } catch (java.lang.Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static int getImplApiLevel(org.chromium.net.ICronetEngineBuilder iCronetEngineBuilder) {
        try {
            java.lang.reflect.Method implVersionMethod = getImplVersionMethod(iCronetEngineBuilder, "getApiLevel");
            if (implVersionMethod == null) {
                return -1;
            }
            return ((java.lang.Integer) implVersionMethod.invoke(null, null)).intValue();
        } catch (java.lang.ReflectiveOperationException e) {
            throw new java.lang.RuntimeException("Failed to retrieve Cronet impl API level", e);
        }
    }

    private static java.lang.String getImplCronetVersion(org.chromium.net.ICronetEngineBuilder iCronetEngineBuilder) {
        try {
            java.lang.reflect.Method implVersionMethod = getImplVersionMethod(iCronetEngineBuilder, "getCronetVersion");
            if (implVersionMethod != null) {
                return (java.lang.String) implVersionMethod.invoke(null, null);
            }
            return null;
        } catch (java.lang.ReflectiveOperationException e) {
            throw new java.lang.RuntimeException("Failed to retrieve Cronet impl version", e);
        }
    }

    private static java.lang.reflect.Method getImplVersionMethod(org.chromium.net.ICronetEngineBuilder iCronetEngineBuilder, java.lang.String str) {
        try {
            return iCronetEngineBuilder.getClass().getClassLoader().loadClass("org.chromium.net.impl.ImplVersion").getMethod(str, null);
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused) {
            return null;
        }
    }

    private int getMaximumApiLevel() {
        return 49;
    }

    static defpackage.apuc getPreferredCronetProvider(android.content.Context context, java.util.List list) {
        if (list.isEmpty()) {
            throw new java.lang.RuntimeException("Unable to find any Cronet provider. Have you included all necessary jars?");
        }
        defpackage.apuc preferredCronetProviderUsingScore = getPreferredCronetProviderUsingScore(list);
        if (preferredCronetProviderUsingScore != null) {
            return preferredCronetProviderUsingScore;
        }
        throw new java.lang.RuntimeException("All available Cronet providers are disabled. A provider should be enabled before it can be used.");
    }

    private static defpackage.apuc getPreferredCronetProviderUsingScore(java.util.List list) {
        java.util.Collections.sort(list, new cph(11));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.apuc apucVar = (defpackage.apuc) it.next();
            if (apucVar.a.isEnabled()) {
                return apucVar;
            }
        }
        return null;
    }

    static /* synthetic */ void lambda$setConnectionMigrationOptions$0(org.chromium.net.ConnectionMigrationOptions connectionMigrationOptions, org.json.JSONObject jSONObject) throws org.json.JSONException {
        org.json.JSONObject jSONObjectN = defpackage.aoil.n(jSONObject, "QUIC");
        if (connectionMigrationOptions.getEnableDefaultNetworkMigration() != null) {
            jSONObjectN.put("migrate_sessions_on_network_change_v2", connectionMigrationOptions.getEnableDefaultNetworkMigration());
        }
        if (connectionMigrationOptions.getAllowServerMigration() != null) {
            jSONObjectN.put("allow_server_migration", connectionMigrationOptions.getAllowServerMigration());
        }
        if (connectionMigrationOptions.getMigrateIdleConnections() != null) {
            jSONObjectN.put("migrate_idle_sessions", connectionMigrationOptions.getMigrateIdleConnections());
        }
        if (connectionMigrationOptions.getIdleMigrationPeriodSeconds() != null) {
            jSONObjectN.put("idle_session_migration_period_seconds", connectionMigrationOptions.getIdleMigrationPeriodSeconds());
        }
        if (connectionMigrationOptions.getRetryPreHandshakeErrorsOnAlternateNetwork() != null) {
            jSONObjectN.put("retry_on_alternate_network_before_handshake", connectionMigrationOptions.getRetryPreHandshakeErrorsOnAlternateNetwork());
        }
        if (connectionMigrationOptions.getMaxTimeOnNonDefaultNetworkSeconds() != null) {
            jSONObjectN.put("max_time_on_non_default_network_seconds", connectionMigrationOptions.getMaxTimeOnNonDefaultNetworkSeconds());
        }
        if (connectionMigrationOptions.getMaxPathDegradingEagerMigrationsCount() != null) {
            jSONObjectN.put("max_migrations_to_non_default_network_on_path_degrading", connectionMigrationOptions.getMaxPathDegradingEagerMigrationsCount());
        }
        if (connectionMigrationOptions.getMaxWriteErrorEagerMigrationsCount() != null) {
            jSONObjectN.put("max_migrations_to_non_default_network_on_write_error", connectionMigrationOptions.getMaxWriteErrorEagerMigrationsCount());
        }
        if (connectionMigrationOptions.getEnablePathDegradationMigration() != null) {
            boolean zBooleanValue = connectionMigrationOptions.getEnablePathDegradationMigration().booleanValue();
            jSONObjectN.put("allow_port_migration", zBooleanValue);
            if (connectionMigrationOptions.getAllowNonDefaultNetworkUsage() != null) {
                boolean zBooleanValue2 = connectionMigrationOptions.getAllowNonDefaultNetworkUsage().booleanValue();
                if (zBooleanValue) {
                    if (zBooleanValue2) {
                        jSONObjectN.put("migrate_sessions_early_v2", true);
                        jSONObjectN.put("migrate_sessions_on_network_change_v2", true);
                        return;
                    }
                } else if (zBooleanValue2) {
                    throw new java.lang.IllegalArgumentException("Unable to turn on non-default network usage without path degradation migration!");
                }
                jSONObjectN.put("migrate_sessions_early_v2", false);
            }
        }
    }

    static /* synthetic */ void lambda$setDnsOptions$0(org.chromium.net.DnsOptions dnsOptions, org.json.JSONObject jSONObject) throws org.json.JSONException {
        org.json.JSONObject jSONObjectN = defpackage.aoil.n(jSONObject, "AsyncDNS");
        if (dnsOptions.getUseBuiltInDnsResolver() != null) {
            jSONObjectN.put("enable", dnsOptions.getUseBuiltInDnsResolver());
        }
        org.json.JSONObject jSONObjectN2 = defpackage.aoil.n(jSONObject, "StaleDNS");
        if (dnsOptions.getEnableStaleDns() != null) {
            jSONObjectN2.put("enable", dnsOptions.getEnableStaleDns());
        }
        if (dnsOptions.getPersistHostCache() != null) {
            jSONObjectN2.put("persist_to_disk", dnsOptions.getPersistHostCache());
        }
        if (dnsOptions.getPersistHostCachePeriodMillis() != null) {
            jSONObjectN2.put("persist_delay_ms", dnsOptions.getPersistHostCachePeriodMillis());
        }
        if (dnsOptions.getStaleDnsOptions() != null) {
            org.chromium.net.DnsOptions.StaleDnsOptions staleDnsOptions = dnsOptions.getStaleDnsOptions();
            if (staleDnsOptions.getAllowCrossNetworkUsage() != null) {
                jSONObjectN2.put("allow_other_network", staleDnsOptions.getAllowCrossNetworkUsage());
            }
            if (staleDnsOptions.getFreshLookupTimeoutMillis() != null) {
                jSONObjectN2.put("delay_ms", staleDnsOptions.getFreshLookupTimeoutMillis());
            }
            if (staleDnsOptions.getUseStaleOnNameNotResolved() != null) {
                jSONObjectN2.put("use_stale_on_name_not_resolved", staleDnsOptions.getUseStaleOnNameNotResolved());
            }
            if (staleDnsOptions.getMaxExpiredDelayMillis() != null) {
                jSONObjectN2.put("max_expired_time_ms", staleDnsOptions.getMaxExpiredDelayMillis());
            }
        }
        org.json.JSONObject jSONObjectN3 = defpackage.aoil.n(jSONObject, "QUIC");
        if (dnsOptions.getPreestablishConnectionsToStaleDnsResults() != null) {
            jSONObjectN3.put("race_stale_dns_on_connection", dnsOptions.getPreestablishConnectionsToStaleDnsResults());
        }
    }

    static /* synthetic */ void lambda$setQuicOptions$0(org.chromium.net.QuicOptions quicOptions, org.json.JSONObject jSONObject) throws org.json.JSONException {
        org.json.JSONObject jSONObjectN = defpackage.aoil.n(jSONObject, "QUIC");
        if (!quicOptions.getQuicHostAllowlist().isEmpty()) {
            jSONObjectN.put("host_whitelist", org.chromium.net.ExperimentalOptionsTranslator$$ExternalSyntheticBackport0.m(",", quicOptions.getQuicHostAllowlist()));
        }
        if (!quicOptions.getEnabledQuicVersions().isEmpty()) {
            jSONObjectN.put("quic_version", org.chromium.net.ExperimentalOptionsTranslator$$ExternalSyntheticBackport0.m(",", quicOptions.getEnabledQuicVersions()));
        }
        if (!quicOptions.getConnectionOptions().isEmpty()) {
            jSONObjectN.put("connection_options", org.chromium.net.ExperimentalOptionsTranslator$$ExternalSyntheticBackport0.m(",", quicOptions.getConnectionOptions()));
        }
        if (!quicOptions.getClientConnectionOptions().isEmpty()) {
            jSONObjectN.put("client_connection_options", org.chromium.net.ExperimentalOptionsTranslator$$ExternalSyntheticBackport0.m(",", quicOptions.getClientConnectionOptions()));
        }
        if (!quicOptions.getExtraQuicheFlags().isEmpty()) {
            jSONObjectN.put("set_quic_flags", org.chromium.net.ExperimentalOptionsTranslator$$ExternalSyntheticBackport0.m(",", quicOptions.getExtraQuicheFlags()));
        }
        if (quicOptions.getInMemoryServerConfigsCacheSize() != null) {
            jSONObjectN.put("max_server_configs_stored_in_properties", quicOptions.getInMemoryServerConfigsCacheSize());
        }
        if (quicOptions.getHandshakeUserAgent() != null) {
            jSONObjectN.put("user_agent_id", quicOptions.getHandshakeUserAgent());
        }
        if (quicOptions.getRetryWithoutAltSvcOnQuicErrors() != null) {
            jSONObjectN.put("retry_without_alt_svc_on_quic_errors", quicOptions.getRetryWithoutAltSvcOnQuicErrors());
        }
        if (quicOptions.getEnableTlsZeroRtt() != null) {
            jSONObjectN.put("disable_tls_zero_rtt", !quicOptions.getEnableTlsZeroRtt().booleanValue());
        }
        if (quicOptions.getPreCryptoHandshakeIdleTimeoutSeconds() != null) {
            jSONObjectN.put("max_idle_time_before_crypto_handshake_seconds", quicOptions.getPreCryptoHandshakeIdleTimeoutSeconds());
        }
        if (quicOptions.getCryptoHandshakeTimeoutSeconds() != null) {
            jSONObjectN.put("max_time_before_crypto_handshake_seconds", quicOptions.getCryptoHandshakeTimeoutSeconds());
        }
        if (quicOptions.getIdleConnectionTimeoutSeconds() != null) {
            jSONObjectN.put("idle_connection_timeout_seconds", quicOptions.getIdleConnectionTimeoutSeconds());
        }
        if (quicOptions.getRetransmittableOnWireTimeoutMillis() != null) {
            jSONObjectN.put("retransmittable_on_wire_timeout_milliseconds", quicOptions.getRetransmittableOnWireTimeoutMillis());
        }
        if (quicOptions.getCloseSessionsOnIpChange() != null) {
            jSONObjectN.put("close_sessions_on_ip_change", quicOptions.getCloseSessionsOnIpChange());
        }
        if (quicOptions.getGoawaySessionsOnIpChange() != null) {
            jSONObjectN.put("goaway_sessions_on_ip_change", quicOptions.getGoawaySessionsOnIpChange());
        }
        if (quicOptions.getInitialBrokenServicePeriodSeconds() != null) {
            jSONObjectN.put("initial_delay_for_broken_alternative_service_seconds", quicOptions.getInitialBrokenServicePeriodSeconds());
        }
        if (quicOptions.getIncreaseBrokenServicePeriodExponentially() != null) {
            jSONObjectN.put("exponential_backoff_on_initial_delay", quicOptions.getIncreaseBrokenServicePeriodExponentially());
        }
        if (quicOptions.getDelayJobsWithAvailableSpdySession() != null) {
            jSONObjectN.put("delay_main_job_with_available_spdy_session", quicOptions.getDelayJobsWithAvailableSpdySession());
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    private void maybeSetExperimentalOptions() {
        java.util.Iterator it;
        org.json.JSONObject jSONObject;
        java.util.List list = this.mExperimentalOptionsPatches;
        org.json.JSONObject jSONObject2 = this.mParsedExperimentalOptions;
        if (jSONObject2 != null) {
            it = list.iterator();
            while (it.hasNext()) {
                try {
                    ((defpackage.apud) it.next()).applyTo(jSONObject2);
                } catch (org.json.JSONException e) {
                    throw new java.lang.IllegalStateException("Unable to apply JSON patch!", e);
                }
            }
            jSONObject = jSONObject2;
        } else if (list.isEmpty()) {
            jSONObject = null;
        } else {
            jSONObject2 = new org.json.JSONObject();
            it = list.iterator();
            while (it.hasNext()) {
                ((defpackage.apud) it.next()).applyTo(jSONObject2);
            }
            jSONObject = jSONObject2;
        }
        if (jSONObject != null) {
            this.mBuilderDelegate.setExperimentalOptions(jSONObject.toString());
        }
    }

    public org.chromium.net.CronetEngine$Builder addPublicKeyPins(java.lang.String str, java.util.Set set, boolean z, java.util.Date date) {
        this.mBuilderDelegate.addPublicKeyPins(str, set, z, date);
        return this;
    }

    public org.chromium.net.CronetEngine$Builder addQuicHint(java.lang.String str, int i, int i2) {
        this.mBuilderDelegate.addQuicHint(str, i, i2);
        return this;
    }

    public org.chromium.net.CronetEngine build() {
        return buildExperimental();
    }

    protected org.chromium.net.ExperimentalCronetEngine buildExperimental() {
        int implApiLevel = getImplApiLevel(this.mBuilderDelegate);
        if (implApiLevel != -1 && implApiLevel < 49) {
            android.util.Log.w("cn_CronetEngine.Builder", "The implementation version is lower than the API version. Calls to methods added in API " + (implApiLevel + 1) + " and newer will likely have no effect.");
        }
        maybeSetExperimentalOptions();
        return this.mBuilderDelegate.build();
    }

    public org.chromium.net.CronetEngine$Builder enableBrotli(boolean z) {
        this.mBuilderDelegate.enableBrotli(z);
        return this;
    }

    public org.chromium.net.CronetEngine$Builder enableHttp2(boolean z) {
        this.mBuilderDelegate.enableHttp2(z);
        return this;
    }

    public org.chromium.net.CronetEngine$Builder enableHttpCache(int i, long j) {
        this.mBuilderDelegate.enableHttpCache(i, j);
        return this;
    }

    public org.chromium.net.CronetEngine$Builder enableNetworkQualityEstimator(boolean z) {
        this.mBuilderDelegate.enableNetworkQualityEstimator(z);
        return this;
    }

    public org.chromium.net.CronetEngine$Builder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        this.mBuilderDelegate.enablePublicKeyPinningBypassForLocalTrustAnchors(z);
        return this;
    }

    public org.chromium.net.CronetEngine$Builder enableQuic(boolean z) {
        this.mBuilderDelegate.enableQuic(z);
        return this;
    }

    public java.lang.String getDefaultUserAgent() {
        return this.mBuilderDelegate.getDefaultUserAgent();
    }

    public org.chromium.net.CronetEngine$Builder setConnectionMigrationOptions(final org.chromium.net.ConnectionMigrationOptions connectionMigrationOptions) {
        if (this.mBuilderDelegate.getSupportedConfigOptions().contains(1)) {
            this.mBuilderDelegate.setConnectionMigrationOptions(connectionMigrationOptions);
        } else {
            this.mExperimentalOptionsPatches.add(new defpackage.apud() { // from class: org.chromium.net.CronetEngine$Builder$$ExternalSyntheticLambda1
                @Override // defpackage.apud
                public final void applyTo(org.json.JSONObject jSONObject) throws org.json.JSONException {
                    org.chromium.net.CronetEngine$Builder.lambda$setConnectionMigrationOptions$0(connectionMigrationOptions, jSONObject);
                }
            });
        }
        return this;
    }

    public org.chromium.net.CronetEngine$Builder setDnsOptions(final org.chromium.net.DnsOptions dnsOptions) {
        if (this.mBuilderDelegate.getSupportedConfigOptions().contains(2)) {
            this.mBuilderDelegate.setDnsOptions(dnsOptions);
        } else {
            this.mExperimentalOptionsPatches.add(new defpackage.apud() { // from class: org.chromium.net.CronetEngine$Builder$$ExternalSyntheticLambda2
                @Override // defpackage.apud
                public final void applyTo(org.json.JSONObject jSONObject) throws org.json.JSONException {
                    org.chromium.net.CronetEngine$Builder.lambda$setDnsOptions$0(dnsOptions, jSONObject);
                }
            });
        }
        return this;
    }

    public org.chromium.net.CronetEngine$Builder setProxyOptions(org.chromium.net.ProxyOptions proxyOptions) {
        this.mBuilderDelegate.setProxyOptionsV2((org.chromium.net.ProxyOptions) j$.util.Objects.requireNonNull(proxyOptions));
        return this;
    }

    public org.chromium.net.CronetEngine$Builder setQuicOptions(final org.chromium.net.QuicOptions quicOptions) {
        if (this.mBuilderDelegate.getSupportedConfigOptions().contains(3)) {
            this.mBuilderDelegate.setQuicOptions(quicOptions);
        } else {
            this.mExperimentalOptionsPatches.add(new defpackage.apud() { // from class: org.chromium.net.CronetEngine$Builder$$ExternalSyntheticLambda0
                @Override // defpackage.apud
                public final void applyTo(org.json.JSONObject jSONObject) throws org.json.JSONException {
                    org.chromium.net.CronetEngine$Builder.lambda$setQuicOptions$0(quicOptions, jSONObject);
                }
            });
        }
        return this;
    }

    public org.chromium.net.CronetEngine$Builder setStoragePath(java.lang.String str) {
        this.mBuilderDelegate.setStoragePath(str);
        return this;
    }

    @java.lang.Deprecated
    public org.chromium.net.CronetEngine$Builder setThreadPriority(int i) {
        this.mBuilderDelegate.setThreadPriority(i);
        return this;
    }

    public org.chromium.net.CronetEngine$Builder setUserAgent(java.lang.String str) {
        this.mBuilderDelegate.setUserAgent(str);
        return this;
    }

    public CronetEngine$Builder(android.content.Context context) {
        this(createBuilderDelegate(context));
    }

    public org.chromium.net.CronetEngine$Builder setConnectionMigrationOptions(org.chromium.net.ConnectionMigrationOptions.Builder builder) {
        return setConnectionMigrationOptions(builder.build());
    }

    public org.chromium.net.CronetEngine$Builder setDnsOptions(org.chromium.net.DnsOptions.Builder builder) {
        return setDnsOptions(builder.build());
    }

    public org.chromium.net.CronetEngine$Builder setQuicOptions(org.chromium.net.QuicOptions.Builder builder) {
        return setQuicOptions(builder.build());
    }

    @java.lang.Deprecated
    public org.chromium.net.CronetEngine$Builder enableSdch(boolean z) {
        return this;
    }

    @java.lang.Deprecated
    public org.chromium.net.CronetEngine$Builder setLibraryLoader(org.chromium.net.CronetEngine$Builder.LibraryLoader libraryLoader) {
        return this;
    }
}
