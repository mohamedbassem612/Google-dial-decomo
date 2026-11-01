package org.chromium.net;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
@java.lang.Deprecated
public abstract class ExperimentalCronetEngine extends org.chromium.net.CronetEngine {
    public static final int CONNECTION_METRIC_UNKNOWN = -1;
    public static final int EFFECTIVE_CONNECTION_TYPE_2G = 3;
    public static final int EFFECTIVE_CONNECTION_TYPE_3G = 4;
    public static final int EFFECTIVE_CONNECTION_TYPE_4G = 5;
    public static final int EFFECTIVE_CONNECTION_TYPE_OFFLINE = 1;
    public static final int EFFECTIVE_CONNECTION_TYPE_SLOW_2G = 2;
    public static final int EFFECTIVE_CONNECTION_TYPE_UNKNOWN = 0;
    private static final java.lang.String SHOULD_OVERRIDE_WITH_HTTPENGINE = "Cronet_OverrideWithHttpEngine";
    public static final long UNBIND_NETWORK_HANDLE = -1;

    public static boolean shouldOverrideWithHttpEngine(android.content.Context context) {
        defpackage.apun apunVar = (defpackage.apun) defpackage.aoil.p(context).br().get(SHOULD_OVERRIDE_WITH_HTTPENGINE);
        return apunVar != null && apunVar.b();
    }

    @Override // 
    public abstract org.chromium.net.ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(java.lang.String str, org.chromium.net.BidirectionalStream.Callback callback, java.util.concurrent.Executor executor);

    @Override // 
    /* JADX INFO: renamed from: newUrlRequestBuilder, reason: merged with bridge method [inline-methods] */
    public abstract org.chromium.net.ExperimentalUrlRequest.Builder mo44newUrlRequestBuilder(java.lang.String str, org.chromium.net.UrlRequest.Callback callback, java.util.concurrent.Executor executor);

    public java.net.URLConnection openConnection(java.net.URL url, java.net.Proxy proxy) {
        return url.openConnection(proxy);
    }

    /* JADX INFO: compiled from: PG */
    public class Builder extends org.chromium.net.CronetEngine$Builder {
        public Builder(android.content.Context context) {
            super(context);
        }

        public org.chromium.net.ICronetEngineBuilder getBuilderDelegate() {
            return this.mBuilderDelegate;
        }

        public org.chromium.net.ExperimentalCronetEngine.Builder setExperimentalOptions(java.lang.String str) {
            org.json.JSONObject jSONObject = null;
            if (str != null && !str.isEmpty()) {
                try {
                    jSONObject = new org.json.JSONObject(str);
                } catch (org.json.JSONException e) {
                    throw new java.lang.IllegalArgumentException("Experimental options parsing failed", e);
                }
            }
            this.mParsedExperimentalOptions = jSONObject;
            return this;
        }

        public Builder(org.chromium.net.ICronetEngineBuilder iCronetEngineBuilder) {
            super(iCronetEngineBuilder);
        }

        @Override // org.chromium.net.CronetEngine$Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder addPublicKeyPins(java.lang.String str, java.util.Set set, boolean z, java.util.Date date) {
            super.addPublicKeyPins(str, set, z, date);
            return this;
        }

        @Override // org.chromium.net.CronetEngine$Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder addQuicHint(java.lang.String str, int i, int i2) {
            super.addQuicHint(str, i, i2);
            return this;
        }

        @Override // org.chromium.net.CronetEngine$Builder
        public org.chromium.net.ExperimentalCronetEngine build() {
            return buildExperimental();
        }

        @Override // org.chromium.net.CronetEngine$Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder enableHttp2(boolean z) {
            super.enableHttp2(z);
            return this;
        }

        @Override // org.chromium.net.CronetEngine$Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder enableHttpCache(int i, long j) {
            super.enableHttpCache(i, j);
            return this;
        }

        @Override // org.chromium.net.CronetEngine$Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder enableNetworkQualityEstimator(boolean z) {
            super.enableNetworkQualityEstimator(z);
            return this;
        }

        @Override // org.chromium.net.CronetEngine$Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
            super.enablePublicKeyPinningBypassForLocalTrustAnchors(z);
            return this;
        }

        @Override // org.chromium.net.CronetEngine$Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder enableQuic(boolean z) {
            super.enableQuic(z);
            return this;
        }

        @Override // org.chromium.net.CronetEngine$Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder enableSdch(boolean z) {
            return this;
        }

        @Override // org.chromium.net.CronetEngine$Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder setConnectionMigrationOptions(org.chromium.net.ConnectionMigrationOptions connectionMigrationOptions) {
            super.setConnectionMigrationOptions(connectionMigrationOptions);
            return this;
        }

        @Override // org.chromium.net.CronetEngine$Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder setDnsOptions(org.chromium.net.DnsOptions dnsOptions) {
            super.setDnsOptions(dnsOptions);
            return this;
        }

        @Override // org.chromium.net.CronetEngine$Builder
        @java.lang.Deprecated
        public org.chromium.net.ExperimentalCronetEngine.Builder setLibraryLoader(org.chromium.net.CronetEngine$Builder.LibraryLoader libraryLoader) {
            return this;
        }

        @Override // org.chromium.net.CronetEngine$Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder setQuicOptions(org.chromium.net.QuicOptions quicOptions) {
            super.setQuicOptions(quicOptions);
            return this;
        }

        @Override // org.chromium.net.CronetEngine$Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder setStoragePath(java.lang.String str) {
            super.setStoragePath(str);
            return this;
        }

        @Override // org.chromium.net.CronetEngine$Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder setThreadPriority(int i) {
            super.setThreadPriority(i);
            return this;
        }

        @Override // org.chromium.net.CronetEngine$Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder setUserAgent(java.lang.String str) {
            super.setUserAgent(str);
            return this;
        }
    }
}
