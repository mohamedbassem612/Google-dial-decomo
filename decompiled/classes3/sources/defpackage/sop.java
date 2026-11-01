package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sop implements mhp {
    private final defpackage.aprf a;

    public sop(defpackage.aprf aprfVar) {
        this.a = aprfVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final ajcq a(mfu mfuVar) {
        akzx akzxVarM = mhh.a.m();
        aigb aigbVar = new aigb(4);
        ahbq ahbqVar = (ahbq) this.a.a;
        for (java.util.Map.Entry entry : ahbqVar.b.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            ahce ahceVar = (ahce) entry.getValue();
            ahyn ahynVar = (ahyn) ahbqVar.d;
            if (ahynVar.f()) {
                ailj ailjVarK = ((ahbc) ahceVar.i.a()).b().k();
                while (ailjVarK.hasNext()) {
                    java.lang.String str2 = (java.lang.String) ailjVarK.next();
                    aigbVar.i(a.bE(str2, (byte) 32, str), ahbq.m(ahceVar, str2, (xtq) ahynVar.b()));
                }
            } else {
                for (java.util.Map.Entry entry2 : ((ahcz) ((java.util.concurrent.atomic.AtomicReference) ahceVar.e().a).get()).c.entrySet()) {
                    java.lang.String str3 = (java.lang.String) entry2.getKey();
                    aigbVar.i(str + ' ' + str3, (ahbb) entry2.getValue());
                }
            }
        }
        j$.util.Map.-EL.forEach(aigbVar.e(true), new jwx(akzxVarM, 6));
        return aiql.z(mni.aJ(akzxVarM.p(), new mhs(2)));
    }
}
