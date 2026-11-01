package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bnc {
    public static final defpackage.bnc a = new defpackage.bnc();

    public final void a(cmw cmwVar, final float f, final float f2, crd crdVar, long j, cav cavVar, int i) {
        int i2;
        cav cavVar2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(-1364277227);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.y(f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.y(f2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.B(crdVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.A(j) ? 8192 : 16384;
        }
        if (cavVarB.H((i2 & 9363) != 9362, i2 & 1)) {
            cbt cbtVar = (cbt) cavVarB;
            cbtVar.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            java.lang.String strAe = den.ae(2132019208, cavVarB);
            int i4 = defpackage.bto.a;
            cmw cmwVarAZ = den.aZ(cmwVar, 0.0f, 22.0f);
            boolean zB = cavVarB.B(strAe);
            java.lang.Object objR = cbtVar.R();
            if (zB || objR == cau.a) {
                objR = new defpackage.bln(strAe, 17);
                cbtVar.ab(objR);
            }
            cavVar2 = cavVarB;
            bvo.b(dig.b(cmwVarAZ, false, (aonj) objR), crdVar, j, 0L, 0.0f, 0.0f, (amu) null, cfo.j(-1039573072, new aonn() { // from class: bnb
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    cav cavVar3 = (cav) obj;
                    int iIntValue = ((java.lang.Integer) obj2).intValue();
                    int i5 = iIntValue & 3;
                    if (cavVar3.H(i5 != 2, iIntValue & 1)) {
                        awo.c(azm.i(cmw.c, f, f2), cavVar3, 0);
                    } else {
                        cavVar3.s();
                    }
                    return aojh.a;
                }
            }, cavVarB), cavVar2, 120);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new acpj(this, cmwVar, f, f2, crdVar, j, i, 1);
        }
    }
}
