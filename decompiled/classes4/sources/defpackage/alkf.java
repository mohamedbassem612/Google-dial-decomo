package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alkf {
    private static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/ExperimentCheckerImpl");
    private final java.util.Set b = new java.util.HashSet();
    private final java.util.Map c = new java.util.HashMap();
    private final java.util.Map d = new java.util.HashMap();
    private final java.util.Map e = new java.util.HashMap();

    public final boolean a(java.lang.String str, java.util.function.Consumer consumer) {
        java.util.Map map = this.e;
        boolean z = false;
        map.put(str, java.lang.Integer.valueOf(((java.lang.Integer) j$.util.Map.-EL.getOrDefault(map, str, 0)).intValue() + 1));
        java.util.Set set = this.b;
        if (set.contains(str)) {
            java.util.Map map2 = this.d;
            java.lang.Integer num = (java.lang.Integer) j$.util.Map.-EL.getOrDefault(map2, str, 0);
            int iIntValue = num.intValue();
            j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable((java.lang.Integer) this.c.get(str));
            java.lang.String str2 = (java.lang.String) (true != optionalOfNullable.isPresent() ? optionalOfNullable : j$.util.Optional.ofNullable(((java.lang.Integer) optionalOfNullable.get()).toString())).orElse("inf");
            aimz aimzVar = a;
            aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/ExperimentCheckerImpl", "isExperimentActiveAndUpdateInternal", 90, "ExperimentCheckerImpl.java").M("Experiment %s used %s out of %s times.", str, num, str2);
            alke alkeVar = new alke(iIntValue, 0);
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(alkeVar.a >= ((java.lang.Integer) optionalOfNullable.get()).intValue()));
            }
            if (!((java.lang.Boolean) optionalOfNullable.orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                map2.put(str, java.lang.Integer.valueOf(iIntValue + 1));
                aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/ExperimentCheckerImpl", "isExperimentActiveAndUpdateInternal", 102, "ExperimentCheckerImpl.java").y("Experiment used: %s", str);
                z = true;
            }
        } else {
            a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/ExperimentCheckerImpl", "isExperimentActiveAndUpdateInternal", 83, "ExperimentCheckerImpl.java").y("Experiment %s not in active experiments.", str);
        }
        akzz akzzVarM = defpackage.almz.a.m();
        defpackage.alnb alnbVar = defpackage.alnb.EVENT_EXPERIMENT_SUMMARY;
        akzzVarM.u();
        defpackage.almz almzVar = akzzVarM.b;
        almzVar.c = alnbVar.aN;
        almzVar.b |= 1;
        apdi apdiVar = defpackage.alnc.b;
        akzx akzxVarM = defpackage.alri.a.m();
        akzxVarM.u();
        defpackage.alri alriVar = (defpackage.alri) akzxVarM.b;
        alat alatVar = alriVar.b;
        if (!alatVar.c()) {
            alriVar.b = alad.J(alatVar);
        }
        akyl.i(set, alriVar.b);
        akzxVarM.aP(map);
        akzxVarM.aQ(this.d);
        akzzVarM.bV(apdiVar, (defpackage.alri) akzxVarM.p());
        consumer.accept(akzzVarM.p());
        return z;
    }

    public final void b(defpackage.alqk alqkVar, defpackage.alnd alndVar) {
        java.util.Set set = this.b;
        set.clear();
        java.util.Map map = this.c;
        map.clear();
        this.d.clear();
        defpackage.alqj alqjVar = alqkVar.c;
        if (alqjVar == null) {
            alqjVar = defpackage.alqj.a;
        }
        set.addAll((java.util.Collection) j$.util.Collection.-EL.stream(alqjVar.b).map(new defpackage.alki(1)).collect(aido.b));
        map.putAll(aigf.i(j$.util.DesugarCollections.unmodifiableMap(alndVar.b)));
    }
}
