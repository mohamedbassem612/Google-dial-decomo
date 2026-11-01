package org.chromium.net;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class CronetEngine {
    public static final int ACTIVE_REQUEST_COUNT_UNKNOWN = -1;
    public static final int CONNECTION_METRIC_UNKNOWN = -1;
    public static final int EFFECTIVE_CONNECTION_TYPE_2G = 3;
    public static final int EFFECTIVE_CONNECTION_TYPE_3G = 4;
    public static final int EFFECTIVE_CONNECTION_TYPE_4G = 5;
    public static final int EFFECTIVE_CONNECTION_TYPE_OFFLINE = 1;
    public static final int EFFECTIVE_CONNECTION_TYPE_SLOW_2G = 2;
    public static final int EFFECTIVE_CONNECTION_TYPE_UNKNOWN = 0;
    private static final java.lang.String TAG = "CronetEngine";
    public static final long UNBIND_NETWORK_HANDLE = -1;

    public abstract java.net.URLStreamHandlerFactory createURLStreamHandlerFactory();

    public int getActiveRequestCount() {
        return -1;
    }

    public int getDownstreamThroughputKbps() {
        return -1;
    }

    public int getEffectiveConnectionType() {
        return 0;
    }

    @java.lang.Deprecated
    public abstract byte[] getGlobalMetricsDeltas();

    public int getHttpRttMs() {
        return -1;
    }

    public int getTransportRttMs() {
        return -1;
    }

    public abstract java.lang.String getVersionString();

    public org.chromium.net.BidirectionalStream.Builder newBidirectionalStreamBuilder(java.lang.String str, org.chromium.net.BidirectionalStream.Callback callback, java.util.concurrent.Executor executor) {
        throw new java.lang.UnsupportedOperationException("Not implemented.");
    }

    public abstract org.chromium.net.UrlRequest.Builder newUrlRequestBuilder(java.lang.String str, org.chromium.net.UrlRequest.Callback callback, java.util.concurrent.Executor executor);

    public abstract java.net.URLConnection openConnection(java.net.URL url);

    public abstract void shutdown();

    public abstract void startNetLogToFile(java.lang.String str, boolean z);

    public abstract void stopNetLog();

    public void addRequestFinishedListener(org.chromium.net.RequestFinishedInfo.Listener listener) {
    }

    public void addRttListener(org.chromium.net.NetworkQualityRttListener networkQualityRttListener) {
    }

    public void addThroughputListener(org.chromium.net.NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    public void bindToNetwork(long j) {
    }

    public void removeRequestFinishedListener(org.chromium.net.RequestFinishedInfo.Listener listener) {
    }

    public void removeRttListener(org.chromium.net.NetworkQualityRttListener networkQualityRttListener) {
    }

    public void removeThroughputListener(org.chromium.net.NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    public void configureNetworkQualityEstimatorForTesting(boolean z, boolean z2, boolean z3) {
    }

    public void startNetLogToDisk(java.lang.String str, boolean z, int i) {
    }
}
