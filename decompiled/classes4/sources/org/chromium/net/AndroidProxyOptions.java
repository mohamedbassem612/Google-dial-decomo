package org.chromium.net;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class AndroidProxyOptions {
    private AndroidProxyOptions() {
    }

    public static void apply(android.net.http.HttpEngine.Builder builder, org.chromium.net.ProxyOptions proxyOptions) {
        if (!areProxyApisEnabled()) {
            throw new java.lang.UnsupportedOperationException("Proxy APIs are not supported");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        for (org.chromium.net.Proxy proxy : proxyOptions.getProxyList()) {
            int i2 = 1;
            if (proxy == null) {
                i = 1;
            } else {
                if (!areProxyApisEnabled()) {
                    throw new java.lang.AssertionError("AndroidProxy requires the proxy APIs to be enabled");
                }
                j$.util.Objects.requireNonNull(proxy);
                int scheme = proxy.getScheme();
                if (!areProxyApisEnabled()) {
                    throw new java.lang.AssertionError("AndroidProxy requires the proxy APIs to be enabled");
                }
                if (scheme == 0) {
                    i2 = 0;
                } else if (scheme != 1) {
                    throw new java.lang.AssertionError(java.lang.String.format("Unknown scheme %d", java.lang.Integer.valueOf(scheme)));
                }
                arrayList.add(android.net.http.Proxy.createHttpProxy(i2, proxy.getHost(), proxy.getPort(), proxy.getExecutor(), new defpackage.apua(proxy.getCallback())));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        builder.setProxyOptions(android.net.http.ProxyOptions.fromProxyList(arrayList, i));
    }

    public static boolean areProxyApisEnabled() {
        return android.os.ext.SdkExtensions.getExtensionVersion(31) >= 22;
    }
}
