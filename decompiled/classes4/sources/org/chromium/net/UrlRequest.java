package org.chromium.net;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public abstract class UrlRequest {

    /* JADX INFO: compiled from: PG */
    public @interface Experimental {
    }

    /* JADX INFO: compiled from: PG */
    public abstract class StatusListener {
        public abstract void onStatus(int i);
    }

    public abstract void cancel();

    public abstract void followRedirect();

    public abstract void getStatus(org.chromium.net.UrlRequest.StatusListener statusListener);

    public abstract boolean isDone();

    public abstract void read(java.nio.ByteBuffer byteBuffer);

    public abstract void start();

    /* JADX INFO: compiled from: PG */
    public abstract class Builder {
        public static final int REQUEST_PRIORITY_HIGHEST = 4;
        public static final int REQUEST_PRIORITY_IDLE = 0;
        public static final int REQUEST_PRIORITY_LOW = 2;
        public static final int REQUEST_PRIORITY_LOWEST = 1;
        public static final int REQUEST_PRIORITY_MEDIUM = 3;

        public abstract org.chromium.net.UrlRequest.Builder addHeader(java.lang.String str, java.lang.String str2);

        public abstract org.chromium.net.UrlRequest.Builder allowDirectExecutor();

        public abstract org.chromium.net.UrlRequest build();

        public abstract org.chromium.net.UrlRequest.Builder disableCache();

        public abstract org.chromium.net.UrlRequest.Builder setHttpMethod(java.lang.String str);

        public abstract org.chromium.net.UrlRequest.Builder setPriority(int i);

        public abstract org.chromium.net.UrlRequest.Builder setUploadDataProvider(org.chromium.net.UploadDataProvider uploadDataProvider, java.util.concurrent.Executor executor);

        public org.chromium.net.UrlRequest.Builder addRequestAnnotation(java.lang.Object obj) {
            return this;
        }

        public org.chromium.net.UrlRequest.Builder bindToNetwork(long j) {
            return this;
        }

        public org.chromium.net.UrlRequest.Builder setRequestFinishedListener(org.chromium.net.RequestFinishedInfo.Listener listener) {
            return this;
        }

        public org.chromium.net.UrlRequest.Builder setTrafficStatsTag(int i) {
            return this;
        }

        public org.chromium.net.UrlRequest.Builder setTrafficStatsUid(int i) {
            return this;
        }

        public org.chromium.net.UrlRequest.Builder setRawCompressionDictionary(byte[] bArr, java.nio.ByteBuffer byteBuffer, java.lang.String str) {
            return this;
        }
    }

    /* JADX INFO: compiled from: PG */
    public abstract class Callback {
        public abstract void onFailed(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo, org.chromium.net.CronetException cronetException);

        public abstract void onReadCompleted(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo, java.nio.ByteBuffer byteBuffer);

        public abstract void onRedirectReceived(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo, java.lang.String str);

        public abstract void onResponseStarted(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo);

        public abstract void onSucceeded(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo);

        public void onCanceled(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo) {
        }
    }
}
