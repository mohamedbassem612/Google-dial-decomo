package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acrl extends dca {
    private final crd a;
    private final long b;
    private final int d;
    private final aonj e;

    public acrl(crd crdVar, long j) {
        aooh.f(crdVar, "shape");
        this.a = crdVar;
        this.b = j;
        this.d = 3;
        this.e = null;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.acrm(this.a, this.b);
    }

    public final /* synthetic */ void e(cmv cmvVar) {
        float fA;
        boolean z;
        defpackage.acrm acrmVar = (defpackage.acrm) cmvVar;
        aooh.f(acrmVar, com.android.onboarding.config.foregroundpriority.ForegroundPriority.KEY_NODE);
        crd crdVar = this.a;
        aooh.f(crdVar, "shape");
        if (((cmv) acrmVar).D) {
            cmy cmyVar = acrmVar.M().a.get(cmy.a);
            fA = cmyVar != null ? cmyVar.a() : 1.0f;
        } else {
            fA = acrmVar.d;
        }
        defpackage.acrr acrrVar = defpackage.acrr.a;
        defpackage.abna abnaVar = new defpackage.abna(7);
        defpackage.abna abnaVar2 = new defpackage.abna(8);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Map map = acrmVar.i;
        if (map.size() != linkedHashMap.size()) {
            z = true;
            break;
        }
        java.util.Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            int i = ((defpackage.acro) entry.getKey()).a;
            ajml ajmlVar = (ajml) entry.getValue();
            ajml ajmlVar2 = (ajml) linkedHashMap.get(new defpackage.acro(i));
            if (ajmlVar2 == null || !anty.ah(ajmlVar.a, ajmlVar2.a) || !aooh.n(ajmlVar.b, ajmlVar2.b)) {
                z = true;
                break;
            }
        }
        long j = this.b;
        boolean z2 = (aooh.n(acrmVar.a, crdVar) && anty.ah(acrmVar.b, j) && a.x(acrmVar.c, 3) && aooh.n(acrmVar.e, acrrVar) && acrmVar.f == 120 && acrmVar.g == abnaVar && acrmVar.h == abnaVar2 && !z && acrmVar.d == fA) ? false : true;
        acrmVar.a = crdVar;
        acrmVar.b = j;
        acrmVar.c = 3;
        acrmVar.e = acrrVar;
        acrmVar.f = 120;
        acrmVar.g = abnaVar;
        acrmVar.h = abnaVar2;
        map.clear();
        map.putAll(linkedHashMap);
        acrmVar.d = fA;
        if (z2 && ((cmv) acrmVar).D) {
            acrmVar.b();
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.acrl) {
            defpackage.acrl acrlVar = (defpackage.acrl) obj;
            if (aooh.n(this.a, acrlVar.a) && anty.ah(this.b, acrlVar.b)) {
                int i = acrlVar.d;
                if (a.x(3, 3)) {
                    aonj aonjVar = acrlVar.e;
                    if (aooh.n((java.lang.Object) null, (java.lang.Object) null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() * 31) + anty.M(this.b)) * 31) + 3) * 31;
    }

    public final java.lang.String toString() {
        return "EnergyEffectElement(shape=" + this.a + ", containerColor=" + cqg.g(this.b) + ", state=" + defpackage.acro.a(3) + ", configureEnergy=null)";
    }
}
