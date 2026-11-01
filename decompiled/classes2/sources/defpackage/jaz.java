package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class jaz extends aomh implements aonn {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ jbm b;
    final /* synthetic */ android.telecom.PhoneAccountHandle c;
    final /* synthetic */ boolean d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jaz(jbm jbmVar, android.telecom.PhoneAccountHandle phoneAccountHandle, boolean z, int i, aoln aolnVar) {
        super(2, aolnVar);
        this.b = jbmVar;
        this.c = phoneAccountHandle;
        this.d = z;
        this.e = i;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((jbr) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        android.telecom.PhoneAccountHandle phoneAccountHandle;
        aooc.af(obj);
        jbr jbrVar = (jbr) this.a;
        alat alatVar = jbrVar.j;
        aooh.e(alatVar, "getBeeslyTimeoutDataList(...)");
        java.util.List arrayList = new java.util.ArrayList(ajsz.bl(alatVar, 10));
        java.util.Iterator it = alatVar.iterator();
        boolean z = false;
        while (true) {
            phoneAccountHandle = this.c;
            if (!it.hasNext()) {
                break;
            }
            jbo jboVarD = (jbo) it.next();
            jbq jbqVar = jboVarD.c;
            if (jbqVar == null) {
                jbqVar = jbq.a;
            }
            if (jbqVar.c.equals(phoneAccountHandle.getComponentName().flattenToString())) {
                jbq jbqVar2 = jboVarD.c;
                if (jbqVar2 == null) {
                    jbqVar2 = jbq.a;
                }
                if (aooh.n(jbqVar2.d, phoneAccountHandle.getId())) {
                    boolean z2 = this.d;
                    aooh.c(jboVarD);
                    defpackage.her herVarB = defpackage.hhe.B(jboVarD.p());
                    if (z2) {
                        herVarB.e(herVarB.a() + 1);
                        herVarB.f(0L);
                    } else {
                        herVarB.f(herVarB.b() + 1);
                        herVarB.e(0L);
                    }
                    jbm jbmVar = this.b;
                    if (herVarB.a() >= ((java.lang.Number) jbmVar.a.a()).longValue()) {
                        long jC = herVarB.c();
                        java.lang.Object objA = jbmVar.f.a();
                        aooh.e(objA, "get(...)");
                        herVarB.g(java.lang.Math.min(jC + ((java.lang.Number) objA).longValue(), 1000 * ((java.lang.Number) jbmVar.c.a()).longValue()));
                        herVarB.e(0L);
                    } else if (herVarB.b() >= ((java.lang.Number) jbmVar.b.a()).longValue()) {
                        double dC = herVarB.c();
                        java.lang.Object objA2 = jbmVar.e.a();
                        aooh.e(objA2, "get(...)");
                        herVarB.g(java.lang.Math.max((long) (dC * ((java.lang.Number) objA2).doubleValue()), 1000 * ((java.lang.Number) jbmVar.d.a()).longValue()));
                        herVarB.f(0L);
                    }
                    jboVarD = herVarB.d();
                    z = true;
                }
            }
            arrayList.add(jboVarD);
        }
        if (!z) {
            int i = this.e;
            defpackage.her herVarB2 = defpackage.hhe.B(jbo.a.m());
            akzx akzxVarM = jbq.a.m();
            aooh.f(akzxVarM, "builder");
            java.lang.String strFlattenToString = phoneAccountHandle.getComponentName().flattenToString();
            aooh.e(strFlattenToString, "flattenToString(...)");
            aooh.f(strFlattenToString, "value");
            akzxVarM.u();
            jbq jbqVar3 = akzxVarM.b;
            j$.util.Objects.requireNonNull(strFlattenToString);
            jbqVar3.b |= 1;
            jbqVar3.c = strFlattenToString;
            java.lang.String id = phoneAccountHandle.getId();
            aooh.e(id, "getId(...)");
            aooh.f(id, "value");
            akzxVarM.u();
            jbq jbqVar4 = akzxVarM.b;
            j$.util.Objects.requireNonNull(id);
            jbqVar4.b |= 2;
            jbqVar4.d = id;
            jbq jbqVarP = akzxVarM.p();
            aooh.e(jbqVarP, "build(...)");
            jbq jbqVar5 = jbqVarP;
            aooh.f(jbqVar5, "value");
            akzx akzxVar = (akzx) herVarB2.a;
            akzxVar.u();
            jbo jboVar = akzxVar.b;
            j$.util.Objects.requireNonNull(jbqVar5);
            jboVar.c = jbqVar5;
            jboVar.b |= 1;
            herVarB2.g(i);
            arrayList = ajsz.bU(arrayList, herVarB2.d());
        }
        kaw kawVarH = kcq.H(jbrVar.p());
        kawVarH.h();
        kawVarH.g();
        kawVarH.h();
        akzx akzxVar2 = (akzx) kawVarH.a;
        akzxVar2.u();
        jbr jbrVar2 = akzxVar2.b;
        alat alatVar2 = jbrVar2.j;
        if (!alatVar2.c()) {
            jbrVar2.j = alad.J(alatVar2);
        }
        akyl.i(arrayList, jbrVar2.j);
        return kawVarH.f();
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.jaz jazVar = new defpackage.jaz(this.b, this.c, this.d, this.e, aolnVar);
        jazVar.a = obj;
        return jazVar;
    }
}
