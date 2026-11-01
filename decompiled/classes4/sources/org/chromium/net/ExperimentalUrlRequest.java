package org.chromium.net;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
@java.lang.Deprecated
public abstract class ExperimentalUrlRequest extends org.chromium.net.UrlRequest {

    /* JADX INFO: compiled from: PG */
    @java.lang.Deprecated
    public abstract class Builder extends org.chromium.net.UrlRequest.Builder {
        public static final int DEFAULT_IDEMPOTENCY = 0;
        public static final int IDEMPOTENT = 1;
        public static final int NOT_IDEMPOTENT = 2;

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract org.chromium.net.ExperimentalUrlRequest.Builder addHeader(java.lang.String str, java.lang.String str2);

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract org.chromium.net.ExperimentalUrlRequest.Builder allowDirectExecutor();

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract org.chromium.net.ExperimentalUrlRequest build();

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract org.chromium.net.ExperimentalUrlRequest.Builder disableCache();

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract org.chromium.net.ExperimentalUrlRequest.Builder setHttpMethod(java.lang.String str);

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract org.chromium.net.ExperimentalUrlRequest.Builder setPriority(int i);

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract org.chromium.net.ExperimentalUrlRequest.Builder setUploadDataProvider(org.chromium.net.UploadDataProvider uploadDataProvider, java.util.concurrent.Executor executor);

        @Override // org.chromium.net.UrlRequest.Builder
        public org.chromium.net.ExperimentalUrlRequest.Builder addRequestAnnotation(java.lang.Object obj) {
            return this;
        }

        @Override // org.chromium.net.UrlRequest.Builder
        public org.chromium.net.ExperimentalUrlRequest.Builder setRequestFinishedListener(org.chromium.net.RequestFinishedInfo.Listener listener) {
            return this;
        }

        @Override // org.chromium.net.UrlRequest.Builder
        public org.chromium.net.ExperimentalUrlRequest.Builder setTrafficStatsTag(int i) {
            return this;
        }

        @Override // org.chromium.net.UrlRequest.Builder
        public org.chromium.net.ExperimentalUrlRequest.Builder setTrafficStatsUid(int i) {
            return this;
        }

        public org.chromium.net.ExperimentalUrlRequest.Builder disableConnectionMigration() {
            return this;
        }

        public org.chromium.net.ExperimentalUrlRequest.Builder setIdempotency(int i) {
            return this;
        }
    }
}
