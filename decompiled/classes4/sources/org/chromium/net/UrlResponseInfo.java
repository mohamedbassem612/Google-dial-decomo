package org.chromium.net;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public abstract class UrlResponseInfo {

    /* JADX INFO: compiled from: PG */
    public abstract class HeaderBlock {
        public abstract java.util.List getAsList();

        public abstract java.util.Map getAsMap();
    }

    public abstract java.util.Map getAllHeaders();

    public abstract java.util.List getAllHeadersAsList();

    public abstract int getHttpStatusCode();

    public abstract java.lang.String getHttpStatusText();

    public abstract java.lang.String getNegotiatedProtocol();

    public abstract java.lang.String getProxyServer();

    public abstract long getReceivedByteCount();

    public abstract java.lang.String getUrl();

    public abstract java.util.List getUrlChain();

    public abstract boolean wasCached();
}
