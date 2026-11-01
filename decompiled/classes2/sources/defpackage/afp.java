package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class afp implements aonn {
    public final /* synthetic */ alg a;
    public final /* synthetic */ ajl b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ aono d;

    public /* synthetic */ afp(alg algVar, ajl ajlVar, java.lang.Object obj, aono aonoVar) {
        this.a = algVar;
        this.b = ajlVar;
        this.c = obj;
        this.d = aonoVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [ajl, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object objF;
        cav cavVar = (cav) obj;
        int iIntValue = ((java.lang.Integer) obj2).intValue();
        int i = iIntValue & 3;
        if (cavVar.H(i != 2, iIntValue & 1)) {
            ajl ajlVar = this.b;
            alg algVar = this.a;
            defpackage.ant antVar = new defpackage.ant(ajlVar, 1);
            nf nfVar = alo.a;
            if (algVar.C()) {
                cavVar.u(1666827533);
                cavVar.o();
                objF = algVar.f();
            } else {
                cavVar.u(1666573488);
                boolean zB = cavVar.B(algVar);
                objF = cavVar.g();
                if (zB || objF == cau.a) {
                    cko ckoVar = (cko) ckw.i.i();
                    aonj aonjVarI = ckoVar != null ? ckoVar.i() : null;
                    cko ckoVarH = cfd.h(ckoVar);
                    try {
                        java.lang.Object objF2 = algVar.f();
                        cfd.i(ckoVar, ckoVarH, aonjVarI);
                        cavVar.w(objF2);
                        objF = objF2;
                    } catch (java.lang.Throwable th) {
                        cfd.i(ckoVar, ckoVarH, aonjVarI);
                        throw th;
                    }
                }
                cavVar.o();
            }
            java.lang.Object obj3 = this.c;
            cavVar.u(1378811975);
            float f = true != aooh.n(objF, obj3) ? 0.0f : 1.0f;
            cavVar.o();
            java.lang.Float fValueOf = java.lang.Float.valueOf(f);
            boolean zB2 = cavVar.B(algVar);
            java.lang.Object objG = cavVar.g();
            if (zB2 || objG == cau.a) {
                defpackage.mq mqVar = new defpackage.mq(algVar, 2);
                ajxw ajxwVar = ceo.a;
                objG = new cbk(mqVar, (cen) null);
                cavVar.w(objG);
            }
            java.lang.Object objA = ((cer) objG).a();
            cavVar.u(1378811975);
            float f2 = true == aooh.n(objA, obj3) ? 1.0f : 0.0f;
            cavVar.o();
            java.lang.Float fValueOf2 = java.lang.Float.valueOf(f2);
            boolean zB3 = cavVar.B(algVar);
            java.lang.Object objG2 = cavVar.g();
            if (zB3 || objG2 == cau.a) {
                defpackage.bmx bmxVar = new defpackage.bmx(algVar, 1);
                ajxw ajxwVar2 = ceo.a;
                objG2 = new cbk(bmxVar, (cen) null);
                cavVar.w(objG2);
            }
            cer cerVarE = alk.e(algVar, fValueOf, fValueOf2, (ajl) antVar.a(((cer) objG2).a(), cavVar, 0), nfVar, cavVar, 0);
            boolean zB4 = cavVar.B(cerVarE);
            java.lang.Object objG3 = cavVar.g();
            if (zB4 || objG3 == cau.a) {
                objG3 = new nm(cerVarE, 15);
                cavVar.w(objG3);
            }
            cqb cqbVar = new cqb((aonj) objG3);
            cye cyeVarB = awo.b(cmh.a, false);
            long jA = cavVar.a();
            long j = jA ^ (jA >>> 32);
            cje cjeVarM = cavVar.M();
            cmw cmwVarM = cfo.m(cavVar, cqbVar);
            aomy aomyVar = dam.a;
            cavVar.L();
            cavVar.v();
            if (cavVar.F()) {
                cavVar.j(aomyVar);
            } else {
                cavVar.x();
            }
            aono aonoVar = this.d;
            cev.c(cavVar, cyeVarB, dam.e);
            cev.c(cavVar, cjeVarM, dam.d);
            cev.a(cavVar, java.lang.Integer.valueOf((int) j), dam.f);
            cavVar.i(aojh.a, new bae(dam.g, 7));
            cev.c(cavVar, cmwVarM, dam.c);
            aonoVar.a(obj3, cavVar, 0);
            cavVar.n();
        } else {
            cavVar.s();
        }
        return aojh.a;
    }
}
