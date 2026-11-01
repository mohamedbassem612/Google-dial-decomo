package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anww extends defpackage.anpw {
    private static final boolean a = defpackage.ajsz.dq(defpackage.anww.class.getClassLoader());

    /* JADX INFO: Thrown type has an unknown type hierarchy: ahzr */
    @Override // defpackage.anps
    public final defpackage.anpv a(defpackage.anrg anrgVar, defpackage.anpq anpqVar) throws ahzr {
        java.lang.String string = null;
        if (!"dns".equals(anrgVar.k)) {
            return null;
        }
        defpackage.aift aiftVar = new defpackage.aift(4);
        defpackage.anrg.d(anrgVar.l, aiftVar);
        defpackage.aify aifyVarG = aiftVar.g();
        defpackage.ahvr.bW(!aifyVarG.isEmpty(), "expected 1 path segment in target %s but found %s", anrgVar, aifyVarG);
        java.lang.String str = (java.lang.String) aifyVarG.get(0);
        if (anrgVar.f()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            anrgVar.c(sb);
            string = sb.toString();
        }
        defpackage.anrg.a(string);
        return new defpackage.anwv(str, anpqVar, defpackage.anxo.o, new defpackage.ahzh(), a);
    }

    @Override // defpackage.anps
    public final defpackage.anpv b(java.net.URI uri, defpackage.anpq anpqVar) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        java.lang.String path = uri.getPath();
        defpackage.ahvr.cj(path, "targetPath");
        defpackage.ahvr.bW(path.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", path, uri);
        java.lang.String strSubstring = path.substring(1);
        uri.getAuthority();
        return new defpackage.anwv(strSubstring, anpqVar, defpackage.anxo.o, new defpackage.ahzh(), a);
    }

    @Override // defpackage.anps
    public final java.lang.String c() {
        return "dns";
    }

    @Override // defpackage.anpw
    public final int d() {
        return 5;
    }

    @Override // defpackage.anpw
    public final java.util.Collection e() {
        return java.util.Collections.singleton(java.net.InetSocketAddress.class);
    }

    @Override // defpackage.anpw
    protected final void f() {
    }
}
