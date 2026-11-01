package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aoav implements defpackage.anqi {
    public static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.aoav.class.getName());
    private static final defpackage.aooc c = new defpackage.aooc();
    private static final defpackage.ahzi b = new defpackage.anxk(2);

    public aoav() {
        defpackage.ahzi ahziVar = b;
        defpackage.aooc aoocVar = c;
        ahziVar.getClass();
        aoocVar.getClass();
    }

    public static final anqh a(java.net.InetSocketAddress inetSocketAddress) throws java.io.IOException {
        annj annjVar;
        try {
            java.net.URI uri = new java.net.URI("https", null, inetSocketAddress.getHostString(), inetSocketAddress.getPort(), null, null, null);
            java.net.ProxySelector proxySelector = java.net.ProxySelector.getDefault();
            if (proxySelector == null) {
                a.logp(java.util.logging.Level.FINE, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "proxy selector is null, so continuing without proxy lookup");
                return null;
            }
            java.util.List<java.net.Proxy> listSelect = proxySelector.select(uri);
            if (listSelect == null || listSelect.isEmpty()) {
                java.lang.String name = proxySelector.getClass().getName();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ProxySelector ");
                sb.append(name);
                sb.append(" returned ");
                sb.append(listSelect == null ? "null" : "an empty list");
                sb.append(", which violates the java.net.ProxySelector#select(URI) contract");
                throw new java.io.IOException(sb.toString());
            }
            if (listSelect.size() > 1) {
                a.logp(java.util.logging.Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "More than 1 proxy detected, gRPC will select the first one");
            }
            java.net.Proxy proxy = listSelect.get(0);
            if (proxy.type() == java.net.Proxy.Type.DIRECT) {
                return null;
            }
            java.net.InetSocketAddress inetSocketAddress2 = (java.net.InetSocketAddress) proxy.address();
            java.net.PasswordAuthentication passwordAuthenticationAi = defpackage.aooc.ai(inetSocketAddress2.getHostString(), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort());
            java.net.InetSocketAddress inetSocketAddress3 = inetSocketAddress2.isUnresolved() ? new java.net.InetSocketAddress(java.net.InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort()) : inetSocketAddress2;
            java.util.Map map = java.util.Collections.EMPTY_MAP;
            defpackage.ahvr.cj(inetSocketAddress, "targetAddress");
            defpackage.ahvr.cj(inetSocketAddress3, "proxyAddress");
            if (passwordAuthenticationAi == null) {
                annjVar = new annj(inetSocketAddress3, inetSocketAddress, map, (java.lang.String) null, (java.lang.String) null);
            } else {
                annjVar = new annj(inetSocketAddress3, inetSocketAddress, map, passwordAuthenticationAi.getUserName(), passwordAuthenticationAi.getPassword() != null ? new java.lang.String(passwordAuthenticationAi.getPassword()) : null);
            }
            return annjVar;
        } catch (java.net.URISyntaxException e) {
            a.logp(java.util.logging.Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to construct URI for proxy lookup, proceeding without proxy", (java.lang.Throwable) e);
            return null;
        }
    }
}
