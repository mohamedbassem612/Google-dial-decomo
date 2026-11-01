package org.chromium.net;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class VersionSafeProxyOptions {
    private static final int SET_PROXY_OPTIONS_API_LEVEL = 49;
    private final org.chromium.net.ProxyOptions mBackend;

    public VersionSafeProxyOptions(org.chromium.net.ProxyOptions proxyOptions) {
        if (!apiContainsProxyOptionsClass()) {
            throw new java.lang.AssertionError(java.lang.String.format("This should have not been created: the Cronet API being used has an ApiLevel of %s, but setProxyOptions was added in ApiLevel %s", java.lang.Integer.valueOf(aoog.r()), java.lang.Integer.valueOf(SET_PROXY_OPTIONS_API_LEVEL)));
        }
        org.chromium.net.ProxyOptions proxyOptions2 = (org.chromium.net.ProxyOptions) j$.util.Objects.requireNonNull(proxyOptions);
        this.mBackend = proxyOptions2;
        if (proxyOptions2.getProxyList().isEmpty()) {
            throw new java.lang.AssertionError("The list of proxies should never be empty, this is checked in the API layer");
        }
    }

    private static boolean apiContainsProxyOptionsClass() {
        return aoog.r() >= SET_PROXY_OPTIONS_API_LEVEL;
    }

    public java.util.List createProxyCallbackList() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (org.chromium.net.Proxy proxy : this.mBackend.getProxyList()) {
            arrayList.add(proxy == null ? null : new aoog(proxy.getExecutor(), proxy.getCallback()));
        }
        return j$.util.DesugarCollections.unmodifiableList(arrayList);
    }

    public defpackage.apxb createProxyOptionsProto() {
        defpackage.apyd apydVarH = defpackage.apxb.DEFAULT_INSTANCE.h();
        for (org.chromium.net.Proxy proxy : this.mBackend.getProxyList()) {
            defpackage.apyd apydVarH2 = defpackage.apxa.DEFAULT_INSTANCE.h();
            if (proxy == null) {
                apydVarH2.g(1);
            } else {
                java.lang.String host = proxy.getHost();
                apydVarH2.f();
                defpackage.apxa apxaVar = (defpackage.apxa) apydVarH2.b;
                host.getClass();
                apxaVar.bitField0_ |= 2;
                apxaVar.host_ = host;
                int port = proxy.getPort();
                apydVarH2.f();
                defpackage.apxa apxaVar2 = (defpackage.apxa) apydVarH2.b;
                apxaVar2.bitField0_ |= 4;
                apxaVar2.port_ = port;
                int scheme = proxy.getScheme();
                if (scheme == 0) {
                    apydVarH2.g(2);
                } else {
                    if (scheme != 1) {
                        throw new java.lang.AssertionError(java.lang.String.format("Unknown Proxy.Scheme: %s. This should have been caught by the API layer", java.lang.Integer.valueOf(scheme)));
                    }
                    apydVarH2.g(3);
                }
            }
            defpackage.apxa apxaVar3 = (defpackage.apxa) apydVarH2.c();
            apydVarH.f();
            defpackage.apxb apxbVar = (defpackage.apxb) apydVarH.b;
            apxaVar3.getClass();
            defpackage.apyi apyiVar = apxbVar.proxies_;
            if (!apyiVar.c()) {
                apxbVar.proxies_ = apyiVar.d(apyiVar.size() << 1);
            }
            apxbVar.proxies_.add(apxaVar3);
        }
        return (defpackage.apxb) apydVarH.c();
    }
}
