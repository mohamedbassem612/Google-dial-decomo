package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class czl {
    public static final defpackage.czk a = new defpackage.czk();
    public static final java.lang.Object b = new java.lang.Object();

    public static final void a(defpackage.cmw cmwVar, defpackage.aonn aonnVar, defpackage.cav cavVar, int i, int i2) {
        int i3;
        defpackage.cav cavVarB = cavVar.b(-1298353104);
        if (i2 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.D(aonnVar) ? 16 : 32;
        }
        if (cavVarB.H((i3 & 19) != 18, i3 & 1)) {
            if (i2 != 0) {
                cmwVar = defpackage.cmw.c;
            }
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if (objR == defpackage.cau.a) {
                objR = new defpackage.adnp((defpackage.czq) cym.a);
                cbtVar.ab(objR);
            }
            b((defpackage.adnp) objR, cmwVar, aonnVar, cavVarB, (i3 << 3) & 1008);
        } else {
            cavVarB.s();
        }
        defpackage.cmw cmwVar2 = cmwVar;
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bbu(cmwVar2, aonnVar, i, i2, 2);
        }
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [aonn, java.lang.Object] */
    public static final void b(defpackage.adnp adnpVar, defpackage.cmw cmwVar, defpackage.aonn aonnVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-511989831);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(adnpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.D(aonnVar) ? 128 : 256;
        }
        if (cavVarB.H((i2 & 147) != 146, i2 & 1)) {
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            long j = cbtVar.x;
            long j2 = j ^ (j >>> 32);
            defpackage.caz cazVarC = cavVarB.c();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVar);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.aomy aomyVar = defpackage.dbk.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, adnpVar, adnpVar.c);
            defpackage.cev.c(cavVarB, cazVarC, adnpVar.d);
            defpackage.cev.c(cavVarB, aonnVar, adnpVar.b);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            cavVarB.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf((int) j2), defpackage.dam.f);
            cbtVar.W(true);
            if (cavVarB.G()) {
                cavVarB.u(-1259187287);
                cbtVar.W(false);
            } else {
                cavVarB.u(-1259245908);
                boolean zD = cavVarB.D(adnpVar);
                java.lang.Object objR = cbtVar.R();
                if (zD || objR == defpackage.cau.a) {
                    objR = new defpackage.bpa(adnpVar, 10);
                    cbtVar.ab(objR);
                }
                cavVarB.r((defpackage.aomy) objR);
                cbtVar.W(false);
            }
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new aoz(adnpVar, cmwVar, aonnVar, i, 12, (byte[]) null);
        }
    }
}
