package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jzy {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/calllog/compose/data/CallLogUiModelMapper");
    public final defpackage.sou b;
    public final defpackage.kih c;
    public final defpackage.jyi d;
    public final defpackage.ssq e;
    public final android.content.Context f;
    public final defpackage.gou g;
    public final defpackage.gpd h;
    public final defpackage.aeqx i;
    public final defpackage.rsr j;
    public final defpackage.rsr k;
    private final defpackage.kgz l;

    public jzy(defpackage.zjm zjmVar, defpackage.gou gouVar, defpackage.aeqx aeqxVar, defpackage.sou souVar, defpackage.rsr rsrVar, defpackage.kih kihVar, defpackage.jyi jyiVar, defpackage.ssq ssqVar, defpackage.rsr rsrVar2, defpackage.gpd gpdVar, android.content.Context context) {
        if (souVar == null) {
            defpackage.aooh.i("phoneAccountInfoFetcher");
        }
        if (kihVar == null) {
            defpackage.aooh.i("callLogIcons");
        }
        if (jyiVar == null) {
            defpackage.aooh.i("callLogChips");
        }
        if (ssqVar == null) {
            defpackage.aooh.i("phoneNumberHelper");
        }
        if (context == null) {
            defpackage.aooh.i("context");
        }
        this.g = gouVar;
        this.i = aeqxVar;
        this.b = souVar;
        this.k = rsrVar;
        this.c = kihVar;
        this.d = jyiVar;
        this.e = ssqVar;
        this.j = rsrVar2;
        this.h = gpdVar;
        this.f = context;
        j$.util.Optional optionalG = zjmVar.g();
        defpackage.aooh.e(optionalG, "getFeature(...)");
        if (optionalG == null) {
            defpackage.aooh.i("<this>");
        }
        this.l = (defpackage.kgz) optionalG.orElse((java.lang.Object) null);
    }

    public final defpackage.kgu a(defpackage.kiu kiuVar) {
        defpackage.kgz kgzVar = this.l;
        if (kgzVar != null) {
            return kgzVar.b(kiuVar);
        }
        return null;
    }
}
