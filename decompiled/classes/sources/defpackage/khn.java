package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class khn {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/calllog/halo/impl/calllauncher/HaloCallLauncher");
    public final defpackage.jxe b;
    public final defpackage.khr c;
    public final defpackage.rlv d;
    public final defpackage.gpd e;
    private final defpackage.aolr f;

    public khn(defpackage.jxe jxeVar, defpackage.khr khrVar, defpackage.gpd gpdVar, defpackage.aolr aolrVar, defpackage.rlv rlvVar) {
        if (gpdVar == null) {
            defpackage.aooh.i("haloCallLogReader");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("lightweightContext");
        }
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        this.b = jxeVar;
        this.c = khrVar;
        this.e = gpdVar;
        this.f = aolrVar;
        this.d = rlvVar;
    }

    public final java.lang.Object a(java.lang.String str, int i, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.f, new kgx(str, this, i, (defpackage.aoln) null, 2), aolnVar);
    }
}
