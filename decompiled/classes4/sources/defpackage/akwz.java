package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class akwz {
    public static final aihd a = new aile(defpackage.akxy.WORKSPACE_PROCESSING_USER_CONSENT_V2);
    public static final aihd b;
    public static final defpackage.apjb d;
    public final java.util.concurrent.Executor c;
    private final aigf e;
    private final j$.util.Optional f;

    static {
        aile aileVar = new aile(defpackage.akxy.DMA52_DATA_SHARING_V7);
        b = aileVar;
        d = new defpackage.apjb(aileVar.g(), aike.a);
    }

    public akwz(aigf aigfVar, java.util.concurrent.Executor executor, j$.util.Optional optional) {
        this.e = aigfVar;
        this.c = executor;
        this.f = optional;
    }

    public static defpackage.akxy b(int i) {
        defpackage.akxy akxyVarB = defpackage.akxy.b(i);
        return akxyVarB == null ? defpackage.akxy.UNSPECIFIED_POLICY : akxyVarB;
    }

    public static defpackage.akxx e(defpackage.akxy akxyVar, int i) {
        akzx akzxVarM = defpackage.akxx.a.m();
        int iA = akxyVar.a();
        akzxVarM.u();
        defpackage.akxx akxxVar = (defpackage.akxx) akzxVarM.b;
        akxxVar.b |= 1;
        akxxVar.c = iA;
        akzx akzxVarM2 = defpackage.akxz.a.m();
        akzxVarM2.u();
        defpackage.akxz akxzVar = (defpackage.akxz) akzxVarM2.b;
        akxzVar.c = 2;
        akxzVar.b |= 1;
        akzxVarM2.u();
        defpackage.akxz akxzVar2 = (defpackage.akxz) akzxVarM2.b;
        akxzVar2.b |= 2;
        akxzVar2.d = i - 2;
        akzxVarM.u();
        defpackage.akxx akxxVar2 = (defpackage.akxx) akzxVarM.b;
        defpackage.akxz akxzVar3 = (defpackage.akxz) akzxVarM2.p();
        j$.util.Objects.requireNonNull(akxzVar3);
        akxxVar2.d = akxzVar3;
        akxxVar2.b |= 2;
        return (defpackage.akxx) akzxVarM.p();
    }

    public final aify a(java.util.List list, defpackage.akxw akxwVar, defpackage.alfr alfrVar, defpackage.akxt akxtVar) {
        aift aiftVarD = aify.d(((aike) list).d);
        ailk ailkVarY = ((aify) list).y(0);
        while (ailkVarY.hasNext()) {
            defpackage.akxy akxyVar = (defpackage.akxy) ailkVarY.next();
            defpackage.akxe akxeVar = (defpackage.akxe) this.e.get(akxyVar);
            aiftVarD.i(akxeVar != null ? aizu.f(akxeVar.a(alfrVar, akxwVar, akxtVar), java.lang.Exception.class, new ahds(akxyVar, 14), ajbm.a) : aiql.z(e(akxyVar, 10013)));
        }
        return aiftVarD.h();
    }

    public final void c(boolean z, defpackage.alfr alfrVar, defpackage.akxt akxtVar, defpackage.akxy akxyVar, int i, akxf akxfVar) {
        defpackage.akwy akwyVar = new defpackage.akwy(akxtVar, alfrVar, akxyVar, z, i, akxfVar);
        j$.util.Optional optional = this.f;
        optional.isPresent();
        defpackage.akxt akxtVar2 = akwyVar.a;
        defpackage.alfr alfrVar2 = akwyVar.b;
        defpackage.akxy akxyVar2 = akwyVar.c;
        boolean z2 = akwyVar.d;
        int i2 = akwyVar.e;
        akxf akxfVar2 = akwyVar.f;
        ((akxm) optional.get()).a(new ahiw(akxtVar2, 18), new ahiw(alfrVar2, 19), akxyVar2, z2, i2, akxfVar2);
    }

    public final void d(java.util.List list, defpackage.alfr alfrVar, defpackage.akxt akxtVar, akxf akxfVar) {
        if (this.f.isEmpty()) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.akxx akxxVar = (defpackage.akxx) it.next();
            defpackage.akxy akxyVarB = b(akxxVar.c);
            defpackage.akxz akxzVar = akxxVar.d;
            if (akxzVar == null) {
                akxzVar = defpackage.akxz.a;
            }
            int iAQ = a.aQ(akxzVar.c);
            boolean z = iAQ != 0 && iAQ == 2;
            defpackage.akxz akxzVar2 = akxxVar.d;
            if (akxzVar2 == null) {
                akxzVar2 = defpackage.akxz.a;
            }
            c(z, alfrVar, akxtVar, akxyVarB, akxzVar2.d, akxfVar);
        }
    }
}
