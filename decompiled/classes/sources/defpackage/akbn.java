package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class akbn extends defpackage.anmc {
    public final defpackage.akcg a;
    private final java.lang.String b;
    private final defpackage.ajyx c;
    private final java.lang.Object d;
    private final j$.util.concurrent.ConcurrentHashMap e;

    public akbn(java.lang.String str, defpackage.ajyx ajyxVar, defpackage.akcg akcgVar) {
        if (str == null) {
            defpackage.aooh.i("preferredHostname");
        }
        if (ajyxVar == null) {
            defpackage.aooh.i("channelConfig");
        }
        if (akcgVar == null) {
            defpackage.aooh.i("streamzWrapper");
        }
        this.b = str;
        this.c = ajyxVar;
        this.a = akcgVar;
        this.d = new java.lang.Object();
        this.e = new j$.util.concurrent.ConcurrentHashMap();
    }

    private static final java.net.URI c(java.lang.String str) {
        try {
            java.net.URI uri = new java.net.URI(null, str, null, null, null);
            return uri.getPort() == -1 ? new java.net.URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), 443, uri.getPath(), uri.getQuery(), uri.getFragment()) : uri;
        } catch (java.net.URISyntaxException e) {
            throw new java.lang.IllegalStateException("Malformed endpoint authority", e);
        }
    }

    @Override // defpackage.anmc
    public final java.lang.String a() {
        return this.b;
    }

    @Override // defpackage.anmc
    public final defpackage.ajsz b(anpk anpkVar, defpackage.anmb anmbVar) {
        akbk akbkVar;
        defpackage.aooh.f(anmbVar, "callOptions");
        java.lang.String str = (java.lang.String) anmbVar.f(ajzu.a);
        if (str == null) {
            str = this.b;
        }
        java.net.URI uriC = c(str);
        if (android.text.TextUtils.isEmpty(uriC.getAuthority())) {
            throw new java.lang.IllegalStateException("Could not parse channel authority");
        }
        defpackage.ajyx ajyxVar = this.c;
        java.lang.Integer num = (java.lang.Integer) anmbVar.f(akch.a);
        java.lang.Integer num2 = (java.lang.Integer) anmbVar.f(akch.b);
        java.lang.Integer num3 = (java.lang.Integer) anmbVar.f(ajzr.a);
        java.lang.Long l = (java.lang.Long) ((defpackage.ahzm) ajyxVar.j).a;
        defpackage.aooh.c(l);
        akbm akbmVar = new akbm(uriC, l.longValue(), ajyxVar.l, ajyxVar.m, num, num2, num3);
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.e;
        akbk akbkVar2 = (akbk) concurrentHashMap.get(akbmVar);
        if (akbkVar2 == null) {
            synchronized (this.d) {
                java.lang.Object objComputeIfAbsent = j$.util.concurrent.ConcurrentMap.-EL.computeIfAbsent(concurrentHashMap, akbmVar, new aite(new akbl(ajyxVar, akbmVar, this), 4));
                defpackage.aooh.c(objComputeIfAbsent);
                akbkVar = (akbk) objComputeIfAbsent;
            }
            akbkVar2 = akbkVar;
        }
        return akbkVar2.b(anpkVar, anmbVar);
    }
}
