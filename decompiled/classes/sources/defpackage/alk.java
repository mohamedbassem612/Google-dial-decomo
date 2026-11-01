package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class alk {
    public static final defpackage.aonj a = new defpackage.afv(9);

    public static final void a(defpackage.alg algVar, ale aleVar, java.lang.Object obj, java.lang.Object obj2, defpackage.ajl ajlVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(867041821);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(algVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(aleVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? cavVarB.B(obj) : cavVarB.D(obj)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & 4096) == 0 ? cavVarB.B(obj2) : cavVarB.D(obj2)) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != ((32768 & i) == 0 ? cavVarB.B(ajlVar) : cavVarB.D(ajlVar)) ? 8192 : 16384;
        }
        if (!cavVarB.H((i2 & 9363) != 9362, i2 & 1)) {
            cavVarB.s();
        } else if (algVar.C()) {
            aleVar.l(obj, obj2, ajlVar);
        } else {
            aleVar.m(obj2, ajlVar, (java.lang.Object) null, (defpackage.aiw) null);
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new alh(algVar, aleVar, obj, obj2, ajlVar, i, 0);
        }
    }

    public static final defpackage.alg b(defpackage.alg algVar, java.lang.Object obj, java.lang.Object obj2, defpackage.cav cavVar, int i) {
        int i2 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i2 > 4 && cavVar.B(algVar)) || (i & 6) == 4;
        java.lang.Object objG = cavVar.g();
        if (z2 || objG == defpackage.cau.a) {
            objG = new defpackage.alg(new defpackage.akc(obj), algVar);
            cavVar.w(objG);
        }
        defpackage.alg algVar2 = (defpackage.alg) objG;
        if ((i2 <= 4 || !cavVar.B(algVar)) && (i & 6) != 4) {
            z = false;
        }
        boolean zB = z | cavVar.B(algVar2);
        java.lang.Object objG2 = cavVar.g();
        if (zB || objG2 == defpackage.cau.a) {
            objG2 = new defpackage.nz(algVar, algVar2, 13);
            cavVar.w(objG2);
        }
        defpackage.cbp.c(algVar2, (defpackage.aonj) objG2, cavVar);
        if (algVar.C()) {
            long j = algVar.e;
            algVar2.E(obj, obj2);
        } else {
            algVar2.z(obj2);
            algVar2.t(false);
        }
        return algVar2;
    }

    public static final defpackage.alg c(defpackage.all allVar, defpackage.cav cavVar, int i) {
        int i2 = (i & 14) ^ 6;
        boolean z = (i2 > 4 && cavVar.B(allVar)) || (i & 6) == 4;
        java.lang.Object objG = cavVar.g();
        if (z || objG == defpackage.cau.a) {
            defpackage.cko ckoVar = (defpackage.cko) defpackage.ckw.i.i();
            defpackage.aonj aonjVarI = ckoVar != null ? ckoVar.i() : null;
            defpackage.cko ckoVarH = defpackage.cfd.h(ckoVar);
            try {
                java.lang.Object ajeVar = allVar instanceof ajf ? new aje((ajf) allVar) : new defpackage.alg(allVar, null);
                defpackage.cfd.i(ckoVar, ckoVarH, aonjVarI);
                cavVar.w(ajeVar);
                objG = ajeVar;
            } catch (java.lang.Throwable th) {
                defpackage.cfd.i(ckoVar, ckoVarH, aonjVarI);
                throw th;
            }
        }
        defpackage.alg algVar = (defpackage.alg) objG;
        if (allVar instanceof akr) {
            cavVar.u(-1357398105);
            java.lang.Object objG2 = cavVar.g();
            java.lang.Object obj = defpackage.cau.a;
            if (objG2 == obj) {
                java.lang.Object cdyVar = new defpackage.cdy(cavVar.h(), defpackage.aols.a);
                cavVar.w(cdyVar);
                objG2 = cdyVar;
            }
            java.lang.Object obj2 = (defpackage.aoss) objG2;
            boolean zD = cavVar.D(obj2) | ((i2 > 4 && cavVar.D(allVar)) || (i & 6) == 4);
            java.lang.Object objG3 = cavVar.g();
            if (zD || objG3 == obj) {
                objG3 = new defpackage.nz(allVar, obj2, 12);
                cavVar.w(objG3);
            }
            defpackage.cbp.c(obj2, (defpackage.aonj) objG3, cavVar);
            akr akrVar = (akr) allVar;
            java.lang.Object objA = akrVar.a();
            java.lang.Object objB = akrVar.b();
            boolean z2 = (i2 > 4 && cavVar.D(allVar)) || (i & 6) == 4;
            java.lang.Object objG4 = cavVar.g();
            if (z2 || objG4 == obj) {
                objG4 = new hnj(allVar, (defpackage.aoln) null, 1);
                cavVar.w(objG4);
            }
            defpackage.cbp.f(objA, objB, (defpackage.aonn) objG4, cavVar);
            cavVar.o();
        } else {
            cavVar.u(-1356407283);
            algVar.i(allVar.b(), cavVar, 0);
            if (allVar instanceof ajf) {
                throw null;
            }
            cavVar.o();
        }
        boolean zB = cavVar.B(algVar);
        java.lang.Object objG5 = cavVar.g();
        if (zB || objG5 == defpackage.cau.a) {
            objG5 = new defpackage.agb(algVar, 10);
            cavVar.w(objG5);
        }
        defpackage.cbp.c(algVar, (defpackage.aonj) objG5, cavVar);
        return algVar;
    }

    public static final defpackage.alg d(java.lang.Object obj, defpackage.cav cavVar, int i) {
        defpackage.cbt cbtVar = (defpackage.cbt) cavVar;
        java.lang.Object objR = cbtVar.R();
        java.lang.Object obj2 = defpackage.cau.a;
        if (objR == obj2) {
            objR = new defpackage.alg(new defpackage.akc(obj), null);
            cbtVar.ab(objR);
        }
        defpackage.alg algVar = (defpackage.alg) objR;
        algVar.i(obj, cavVar, (i & 8) | 48 | (i & 14));
        java.lang.Object objR2 = cbtVar.R();
        if (objR2 == obj2) {
            objR2 = new defpackage.afz(algVar, 2);
            cbtVar.ab(objR2);
        }
        defpackage.cbp.c(algVar, (defpackage.aonj) objR2, cavVar);
        return algVar;
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [aonj, java.lang.Object] */
    public static final defpackage.cer e(defpackage.alg algVar, java.lang.Object obj, java.lang.Object obj2, defpackage.ajl ajlVar, defpackage.nf nfVar, defpackage.cav cavVar, int i) {
        java.lang.Object obj3;
        java.lang.Object obj4;
        int i2 = i & 14;
        int i3 = i2 ^ 6;
        boolean z = (i3 > 4 && cavVar.B(algVar)) || (i & 6) == 4;
        java.lang.Object objG = cavVar.g();
        byte[] bArr = null;
        if (z || objG == defpackage.cau.a) {
            defpackage.cko ckoVar = (defpackage.cko) defpackage.ckw.i.i();
            defpackage.aonj aonjVarI = ckoVar != null ? ckoVar.i() : null;
            defpackage.cko ckoVarH = defpackage.cfd.h(ckoVar);
            try {
                obj3 = obj2;
                defpackage.aiw aiwVar = (defpackage.aiw) nfVar.a.a(obj3);
                aiwVar.d();
                obj4 = obj;
                java.lang.Object aleVar = new ale(algVar, obj4, aiwVar, nfVar);
                defpackage.cfd.i(ckoVar, ckoVarH, aonjVarI);
                cavVar.w(aleVar);
                objG = aleVar;
            } catch (java.lang.Throwable th) {
                defpackage.cfd.i(ckoVar, ckoVarH, aonjVarI);
                throw th;
            }
        } else {
            obj4 = obj;
            obj3 = obj2;
        }
        int i4 = (i >> 3) & 8;
        int i5 = i << 3;
        int i6 = (i5 & 57344) | i2 | (i4 << 6) | (i5 & 896) | (i4 << 9) | (i5 & 7168);
        ale aleVar2 = (ale) objG;
        a(algVar, aleVar2, obj4, obj3, ajlVar, cavVar, i6);
        boolean zB = ((i3 > 4 && cavVar.B(algVar)) || (i & 6) == 4) | cavVar.B(aleVar2);
        java.lang.Object objG2 = cavVar.g();
        if (zB || objG2 == defpackage.cau.a) {
            objG2 = new defpackage.nz(algVar, aleVar2, 16, bArr);
            cavVar.w(objG2);
        }
        defpackage.cbp.c(aleVar2, (defpackage.aonj) objG2, cavVar);
        return aleVar2;
    }

    public static final ett f(defpackage.alg algVar, defpackage.nf nfVar, defpackage.cav cavVar, int i) {
        alb albVarB;
        int i2 = (i & 14) ^ 6;
        boolean z = (i2 > 4 && cavVar.B(algVar)) || (i & 6) == 4;
        java.lang.Object objG = cavVar.g();
        if (z || objG == defpackage.cau.a) {
            objG = new ett(algVar, nfVar);
            cavVar.w(objG);
        }
        ett ettVar = (ett) objG;
        boolean zD = ((i2 > 4 && cavVar.B(algVar)) || (i & 6) == 4) | cavVar.D(ettVar);
        java.lang.Object objG2 = cavVar.g();
        if (zD || objG2 == defpackage.cau.a) {
            objG2 = new defpackage.nz(algVar, ettVar, 14, null);
            cavVar.w(objG2);
        }
        defpackage.cbp.c(ettVar, (defpackage.aonj) objG2, cavVar);
        if (algVar.C() && (albVarB = ettVar.b()) != null) {
            defpackage.alg algVar2 = (defpackage.alg) ettVar.b;
            albVarB.a.l(albVarB.c.a(algVar2.e().b()), albVarB.c.a(algVar2.e().c()), (defpackage.ajl) albVarB.b.a(algVar2.e()));
        }
        return ettVar;
    }
}
