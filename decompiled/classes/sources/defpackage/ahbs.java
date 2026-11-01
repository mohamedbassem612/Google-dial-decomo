package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahbs implements defpackage.ahbi {
    private final defpackage.ahbz a;
    private final defpackage.aewq b;
    private final java.util.Map c;
    private final java.lang.String d;

    public ahbs(defpackage.ahbz ahbzVar, defpackage.aewq aewqVar, java.util.Map map, java.lang.String str) {
        if (ahbzVar == null) {
            defpackage.aooh.i("gmsConfigurationCommitter");
        }
        if (aewqVar == null) {
            defpackage.aooh.i("phenotypeContext");
        }
        if (str == null) {
            defpackage.aooh.i("packageName");
        }
        this.a = ahbzVar;
        this.b = aewqVar;
        this.c = map;
        this.d = str;
    }

    private final defpackage.ajcq c(defpackage.aexf aexfVar) {
        return this.a.a(this.d, aexfVar);
    }

    private final void d(defpackage.akzc akzcVar) {
        if (akzcVar != null) {
            defpackage.aewq aewqVar = this.b;
            java.util.Map map = this.c;
            java.lang.String str = this.d;
            java.util.Set set = (java.util.Set) map.get(defpackage.aewo.c(str));
            if (set == null) {
                set = defpackage.aoke.a;
            }
            aewqVar.i.A(akzcVar, set, "", str, false, true);
        }
    }

    @Override // defpackage.ahbi
    public final defpackage.ajcq a(java.lang.String str, defpackage.akzc akzcVar, defpackage.aexf aexfVar) {
        if (aexfVar == null) {
            defpackage.aooh.i("commitProperties");
        }
        if (!defpackage.aooh.n(str, "")) {
            throw new java.lang.IllegalStateException("DEVICE tier packages may only commit with LOGGED_OUT_USER");
        }
        d(akzcVar);
        return c(aexfVar);
    }

    @Override // defpackage.ahbi
    public final defpackage.ajcq b(defpackage.akzc akzcVar, defpackage.aexf aexfVar) {
        defpackage.aooh.f(aexfVar, "commitProperties");
        d(akzcVar);
        return c(aexfVar);
    }
}
