package org.chromium.net;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class DnsOptions {
    private final java.lang.Boolean mEnableStaleDns;
    private final java.lang.Boolean mPersistHostCache;
    private final java.lang.Long mPersistHostCachePeriodMillis;
    private final java.lang.Boolean mPreestablishConnectionsToStaleDnsResults;
    private final org.chromium.net.DnsOptions.StaleDnsOptions mStaleDnsOptions;
    private final java.lang.Boolean mUseBuiltInDnsResolver;

    /* JADX INFO: compiled from: PG */
    public @interface Experimental {
    }

    /* JADX INFO: compiled from: PG */
    public class StaleDnsOptions {
        private final java.lang.Boolean mAllowCrossNetworkUsage;
        private final java.lang.Long mFreshLookupTimeoutMillis;
        private final java.lang.Long mMaxExpiredDelayMillis;
        private final java.lang.Boolean mUseStaleOnNameNotResolved;

        /* JADX INFO: compiled from: PG */
        public final class Builder {
            private java.lang.Boolean mAllowCrossNetworkUsage;
            private java.lang.Long mFreshLookupTimeoutMillis;
            private java.lang.Long mMaxExpiredDelayMillis;
            private java.lang.Boolean mUseStaleOnNameNotResolved;

            public org.chromium.net.DnsOptions.StaleDnsOptions.Builder allowCrossNetworkUsage(boolean z) {
                this.mAllowCrossNetworkUsage = java.lang.Boolean.valueOf(z);
                return this;
            }

            public org.chromium.net.DnsOptions.StaleDnsOptions build() {
                return new org.chromium.net.DnsOptions.StaleDnsOptions(this);
            }

            public org.chromium.net.DnsOptions.StaleDnsOptions.Builder setFreshLookupTimeout(j$.time.Duration duration) {
                j$.util.Objects.requireNonNull(duration);
                setFreshLookupTimeoutMillis(duration.toMillis());
                return this;
            }

            public org.chromium.net.DnsOptions.StaleDnsOptions.Builder setFreshLookupTimeoutMillis(long j) {
                this.mFreshLookupTimeoutMillis = java.lang.Long.valueOf(j);
                return this;
            }

            public org.chromium.net.DnsOptions.StaleDnsOptions.Builder setMaxExpiredDelay(j$.time.Duration duration) {
                j$.util.Objects.requireNonNull(duration);
                setMaxExpiredDelayMillis(duration.toMillis());
                return this;
            }

            public org.chromium.net.DnsOptions.StaleDnsOptions.Builder setMaxExpiredDelayMillis(long j) {
                this.mMaxExpiredDelayMillis = java.lang.Long.valueOf(j);
                return this;
            }

            public org.chromium.net.DnsOptions.StaleDnsOptions.Builder useStaleOnNameNotResolved(boolean z) {
                this.mUseStaleOnNameNotResolved = java.lang.Boolean.valueOf(z);
                return this;
            }
        }

        public StaleDnsOptions(org.chromium.net.DnsOptions.StaleDnsOptions.Builder builder) {
            this.mFreshLookupTimeoutMillis = builder.mFreshLookupTimeoutMillis;
            this.mMaxExpiredDelayMillis = builder.mMaxExpiredDelayMillis;
            this.mAllowCrossNetworkUsage = builder.mAllowCrossNetworkUsage;
            this.mUseStaleOnNameNotResolved = builder.mUseStaleOnNameNotResolved;
        }

        public static org.chromium.net.DnsOptions.StaleDnsOptions.Builder builder() {
            return new org.chromium.net.DnsOptions.StaleDnsOptions.Builder();
        }

        public java.lang.Boolean getAllowCrossNetworkUsage() {
            return this.mAllowCrossNetworkUsage;
        }

        public java.lang.Long getFreshLookupTimeoutMillis() {
            return this.mFreshLookupTimeoutMillis;
        }

        public java.lang.Long getMaxExpiredDelayMillis() {
            return this.mMaxExpiredDelayMillis;
        }

        public java.lang.Boolean getUseStaleOnNameNotResolved() {
            return this.mUseStaleOnNameNotResolved;
        }
    }

    public DnsOptions(org.chromium.net.DnsOptions.Builder builder) {
        this.mEnableStaleDns = builder.mEnableStaleDns;
        this.mStaleDnsOptions = builder.mStaleDnsOptions;
        this.mPersistHostCachePeriodMillis = builder.mPersistHostCachePeriodMillis;
        this.mPreestablishConnectionsToStaleDnsResults = builder.mPreestablishConnectionsToStaleDnsResults;
        this.mUseBuiltInDnsResolver = builder.mUseBuiltInDnsResolver;
        this.mPersistHostCache = builder.mPersistHostCache;
    }

    public static org.chromium.net.DnsOptions.Builder builder() {
        return new org.chromium.net.DnsOptions.Builder();
    }

    public java.lang.Boolean getEnableStaleDns() {
        return this.mEnableStaleDns;
    }

    public java.lang.Boolean getPersistHostCache() {
        return this.mPersistHostCache;
    }

    public java.lang.Long getPersistHostCachePeriodMillis() {
        return this.mPersistHostCachePeriodMillis;
    }

    public java.lang.Boolean getPreestablishConnectionsToStaleDnsResults() {
        return this.mPreestablishConnectionsToStaleDnsResults;
    }

    public org.chromium.net.DnsOptions.StaleDnsOptions getStaleDnsOptions() {
        return this.mStaleDnsOptions;
    }

    public java.lang.Boolean getUseBuiltInDnsResolver() {
        return this.mUseBuiltInDnsResolver;
    }

    /* JADX INFO: compiled from: PG */
    public final class Builder {
        private java.lang.Boolean mEnableStaleDns;
        private java.lang.Boolean mPersistHostCache;
        private java.lang.Long mPersistHostCachePeriodMillis;
        private java.lang.Boolean mPreestablishConnectionsToStaleDnsResults;
        private org.chromium.net.DnsOptions.StaleDnsOptions mStaleDnsOptions;
        private java.lang.Boolean mUseBuiltInDnsResolver;

        public org.chromium.net.DnsOptions build() {
            return new org.chromium.net.DnsOptions(this);
        }

        public org.chromium.net.DnsOptions.Builder enableStaleDns(boolean z) {
            this.mEnableStaleDns = java.lang.Boolean.valueOf(z);
            return this;
        }

        public org.chromium.net.DnsOptions.Builder persistHostCache(boolean z) {
            this.mPersistHostCache = java.lang.Boolean.valueOf(z);
            return this;
        }

        public org.chromium.net.DnsOptions.Builder preestablishConnectionsToStaleDnsResults(boolean z) {
            this.mPreestablishConnectionsToStaleDnsResults = java.lang.Boolean.valueOf(z);
            return this;
        }

        public org.chromium.net.DnsOptions.Builder setPersistDelay(j$.time.Duration duration) {
            j$.util.Objects.requireNonNull(duration);
            setPersistHostCachePeriodMillis(duration.toMillis());
            return this;
        }

        public org.chromium.net.DnsOptions.Builder setPersistHostCachePeriodMillis(long j) {
            this.mPersistHostCachePeriodMillis = java.lang.Long.valueOf(j);
            return this;
        }

        public org.chromium.net.DnsOptions.Builder setStaleDnsOptions(org.chromium.net.DnsOptions.StaleDnsOptions.Builder builder) {
            setStaleDnsOptions(builder.build());
            return this;
        }

        public org.chromium.net.DnsOptions.Builder useBuiltInDnsResolver(boolean z) {
            this.mUseBuiltInDnsResolver = java.lang.Boolean.valueOf(z);
            return this;
        }

        public org.chromium.net.DnsOptions.Builder setStaleDnsOptions(org.chromium.net.DnsOptions.StaleDnsOptions staleDnsOptions) {
            this.mStaleDnsOptions = staleDnsOptions;
            return this;
        }
    }
}
