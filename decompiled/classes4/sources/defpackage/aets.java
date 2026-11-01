package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aets extends org.chromium.net.RequestFinishedInfo.Listener {
    @Override // org.chromium.net.RequestFinishedInfo.Listener
    public final void onRequestFinished(org.chromium.net.RequestFinishedInfo requestFinishedInfo) {
        int i;
        java.util.Map allHeaders;
        java.util.List list;
        if (!aenl.a().a.i()) {
            aenr.a.d().l("com/google/android/libraries/performance/primes/metrics/network/RequestFinishedListener", "onRequestFinished", 61, "RequestFinishedListener.java").v("onRequestFinished is skipped as primes preconditions failed.");
            return;
        }
        if (requestFinishedInfo == null) {
            aenr.a.d().l("com/google/android/libraries/performance/primes/metrics/network/RequestFinishedListener", "onRequestFinished", 65, "RequestFinishedListener.java").v("Un-expected null UrlRequestInfo from cronet's RequestFinishedListener,  skipping current NetworkEvent");
            return;
        }
        org.chromium.net.RequestFinishedInfo.Metrics metrics = requestFinishedInfo.getMetrics();
        if (metrics == null) {
            aenr.a.d().l("com/google/android/libraries/performance/primes/metrics/network/RequestFinishedListener", "onRequestFinished", 72, "RequestFinishedListener.java").v("un-expected null metrics from cronet's RequestFinishedListener, skipping current request");
            return;
        }
        if (requestFinishedInfo.getAnnotations() != null) {
            java.util.Iterator it = requestFinishedInfo.getAnnotations().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof abzk) {
                    return;
                }
            }
        }
        java.util.Date requestStart = metrics.getRequestStart();
        aeto aetoVar = new aeto((java.lang.String) null, requestFinishedInfo.getUrl(), false, requestStart == null ? j$.time.Instant.now().toEpochMilli() : requestStart.getTime());
        org.chromium.net.UrlResponseInfo responseInfo = requestFinishedInfo.getResponseInfo();
        if (responseInfo != null && (allHeaders = responseInfo.getAllHeaders()) != null && (list = (java.util.List) allHeaders.get("Content-Type")) != null && !list.isEmpty()) {
            aetoVar.k = (java.lang.String) list.get(0);
        }
        java.lang.Long receivedByteCount = metrics.getReceivedByteCount();
        if (receivedByteCount != null) {
            aetoVar.d = receivedByteCount.intValue();
        }
        java.lang.Long sentByteCount = metrics.getSentByteCount();
        if (sentByteCount != null) {
            aetoVar.e = sentByteCount.intValue();
        }
        java.lang.Long ttfbMs = metrics.getTtfbMs();
        if (ttfbMs != null) {
            aetoVar.b = ttfbMs.longValue();
        }
        java.lang.Long totalTimeMs = metrics.getTotalTimeMs();
        if (totalTimeMs != null) {
            aetoVar.c = totalTimeMs.longValue();
        }
        org.chromium.net.UrlResponseInfo responseInfo2 = requestFinishedInfo.getResponseInfo();
        if (responseInfo2 != null) {
            int httpStatusCode = responseInfo2.getHttpStatusCode();
            if (httpStatusCode >= 0) {
                aetoVar.j = httpStatusCode;
            }
            java.lang.String negotiatedProtocol = responseInfo2.getNegotiatedProtocol();
            if (negotiatedProtocol != null && !negotiatedProtocol.isEmpty()) {
                aetoVar.i = negotiatedProtocol;
            }
        }
        int finishedReason = requestFinishedInfo.getFinishedReason();
        int i2 = 4;
        if (finishedReason == 0) {
            i = 2;
        } else if (finishedReason != 1) {
            i = finishedReason != 2 ? 1 : 4;
        } else {
            i = 3;
        }
        aetoVar.v = i;
        org.chromium.net.CronetException exception = requestFinishedInfo.getException();
        if (exception != null) {
            if (exception instanceof org.chromium.net.NetworkException) {
                switch (((org.chromium.net.NetworkException) exception).getErrorCode()) {
                    case 1:
                        i2 = 3;
                        break;
                    case 2:
                        break;
                    case 3:
                        i2 = 5;
                        break;
                    case 4:
                        i2 = 6;
                        break;
                    case 5:
                        i2 = 7;
                        break;
                    case 6:
                        i2 = 8;
                        break;
                    case 7:
                        i2 = 9;
                        break;
                    case 8:
                        i2 = 10;
                        break;
                    case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                        i2 = 11;
                        break;
                    case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                        i2 = 12;
                        break;
                    case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                        i2 = 13;
                        break;
                    default:
                        i2 = 1;
                        break;
                }
                aetoVar.u = i2;
            } else if (exception instanceof org.chromium.net.CallbackException) {
                aetoVar.u = 2;
            } else {
                aetoVar.u = 1;
            }
            if (exception instanceof org.chromium.net.QuicException) {
                aetoVar.n = java.lang.Integer.valueOf(((org.chromium.net.QuicException) exception).getQuicDetailedErrorCode());
            }
        }
        aetoVar.r = 2;
        aenl.a().e(aetoVar);
    }
}
