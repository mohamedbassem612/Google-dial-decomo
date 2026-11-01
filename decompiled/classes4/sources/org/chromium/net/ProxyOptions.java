package org.chromium.net;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class ProxyOptions {
    public static final int ALL_PROXIES_FAILED_BEHAVIOR_ALLOW_DIRECT = 1;
    public static final int ALL_PROXIES_FAILED_BEHAVIOR_DISALLOW_DIRECT = 0;
    private final java.util.List mProxyList;

    /* JADX INFO: compiled from: PG */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AllProxiesFailedBehavior {
    }

    private ProxyOptions(java.util.List list) {
        if (((java.util.List) j$.util.Objects.requireNonNull(list)).isEmpty()) {
            throw new java.lang.IllegalArgumentException("ProxyList cannot be empty");
        }
        int iIndexOf = list.indexOf(null);
        if (iIndexOf != -1 && iIndexOf != list.size() - 1) {
            throw new java.lang.IllegalArgumentException("Null is allowed only as the last element in the proxy list");
        }
        this.mProxyList = j$.util.DesugarCollections.unmodifiableList(list);
    }

    public static org.chromium.net.ProxyOptions fromProxyList(java.util.List list, int i) {
        if (((java.util.List) j$.util.Objects.requireNonNull(list)).isEmpty()) {
            throw new java.lang.IllegalArgumentException("proxyList cannot be empty");
        }
        if (list.contains(null)) {
            throw new java.lang.IllegalArgumentException("proxyList cannot contain null");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        if (i == 1) {
            arrayList.add(null);
        }
        return new org.chromium.net.ProxyOptions(arrayList);
    }

    public java.util.List getProxyList() {
        return this.mProxyList;
    }
}
