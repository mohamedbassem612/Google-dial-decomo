package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class afnl implements aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;
    public final /* synthetic */ java.lang.Object g;

    public /* synthetic */ afnl(cmw cmwVar, defpackage.fvx fvxVar, afov afovVar, afow afowVar, aonj aonjVar, aonj aonjVar2, ccp ccpVar, int i) {
        this.$cid = i;
        this.a = cmwVar;
        this.g = fvxVar;
        this.b = afovVar;
        this.c = afowVar;
        this.d = aonjVar;
        this.e = aonjVar2;
        this.f = ccpVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [cmw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [aonj, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            csj csjVar = (csj) obj;
            float fFloatValue = ((java.lang.Float) obj2).floatValue();
            cpn cpnVar = (cpn) this.f;
            if (cpnVar.i()) {
                return aojh.a;
            }
            java.lang.Object obj3 = this.e;
            java.lang.Object obj4 = this.d;
            float fQ = aooc.q(java.lang.Math.min((float) java.lang.Math.ceil(aooc.q(fFloatValue, 0.0f)), (float) java.lang.Math.ceil(cpnVar.a() / 2.0f)), 0.0f);
            float fA = cpnVar.a();
            aooq aooqVar = (aooq) obj4;
            if (aooqVar.a != fQ) {
                float f = fQ + fQ;
                java.lang.Object obj5 = this.a;
                java.lang.Object obj6 = this.g;
                cpx cpxVar = (cpx) obj6;
                cpxVar.k();
                cpo cpoVar = (cpo) obj5;
                cpxVar.q(cpoVar, 1);
                if (f <= fA) {
                    cpx cpxVar2 = (cpx) this.b;
                    cpxVar2.k();
                    cpxVar2.q(new cpo(cpoVar.a + fQ, cpoVar.b + fQ, cpoVar.c - fQ, cpoVar.d - fQ, mni.bq(cpoVar.e, fQ), mni.bq(cpoVar.f, fQ), mni.bq(cpoVar.g, fQ), mni.bq(cpoVar.h, fQ)), 1);
                    cpxVar.r(cpxVar, cpxVar2, 0);
                }
                ((aoot) obj3).a = obj6;
                aooqVar.a = fQ;
            }
            java.lang.Object obj7 = this.c;
            java.lang.Object obj8 = ((aoot) obj3).a;
            aooh.c(obj8);
            den.T(csjVar, (cpx) obj8, (cqd) obj7, 0.0f, (den) null, 60);
            return aojh.a;
        }
        cav cavVar = (cav) obj;
        int iIntValue = ((java.lang.Integer) obj2).intValue();
        int i = iIntValue & 3;
        int i2 = iIntValue & 1;
        aimz aimzVar = afny.a;
        if (cavVar.H(i != 2, i2)) {
            cmw cmwVarD = azm.d((cmw) this.a, 1.0f);
            java.lang.Object objG = cavVar.g();
            java.lang.Object obj9 = cau.a;
            if (objG == obj9) {
                objG = new afno(0);
                cavVar.w(objG);
            }
            aonj aonjVar = (aonj) objG;
            java.lang.Object objG2 = cavVar.g();
            if (objG2 == obj9) {
                objG2 = new afno(2);
                cavVar.w(objG2);
            }
            ?? r4 = this.e;
            ?? r15 = this.d;
            java.lang.Object obj10 = this.c;
            java.lang.Object obj11 = this.b;
            java.lang.Object obj12 = this.g;
            aonj aonjVar2 = (aonj) objG2;
            boolean zD = cavVar.D(obj11) | cavVar.B((java.lang.Object) r15) | cavVar.D(obj12) | cavVar.B((java.lang.Object) r4) | cavVar.D(obj10);
            java.lang.Object objG3 = cavVar.g();
            if (zD || objG3 == obj9) {
                afnp afnpVar = new afnp((afov) obj11, (aonj) r15, (defpackage.fvx) obj12, (aonj) r4, (afow) obj10, (ccp) this.f);
                cavVar.w(afnpVar);
                objG3 = afnpVar;
            }
            defpackage.hgu.ae((defpackage.fvx) obj12, cmwVarD, null, aonjVar, aonjVar2, null, null, null, null, (aonj) objG3, cavVar, 1769520, 0);
        } else {
            cavVar.s();
        }
        return aojh.a;
    }

    public /* synthetic */ afnl(cpn cpnVar, aooq aooqVar, aoot aootVar, cpx cpxVar, cpx cpxVar2, cpo cpoVar, cqd cqdVar, int i) {
        this.$cid = i;
        this.f = cpnVar;
        this.d = aooqVar;
        this.e = aootVar;
        this.g = cpxVar;
        this.b = cpxVar2;
        this.a = cpoVar;
        this.c = cqdVar;
    }
}
