package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acpk {
    public static final defpackage.acpk a = new defpackage.acpk();

    public final void a(cmw cmwVar, float f, float f2, crd crdVar, long j, cav cavVar, int i) {
        cav cavVar2;
        cmw cmwVar2;
        float f3;
        float f4;
        crd crdVar2;
        long j2;
        cmw cmwVar3;
        crd crdVar3;
        long jT;
        float f5;
        float f6;
        cav cavVarB = cavVar.b(1578277453);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 = i | 22;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if (cavVarB.H((i2 & 9363) != 9362, i2 & 1)) {
            ((cbt) cavVarB).Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) == 0 || cavVarB.E()) {
                cmwVar3 = cmw.c;
                crdVar3 = den.am(cavVarB).e;
                jT = abrz.t(18, cavVarB);
                f5 = 4.0f;
                f6 = 32.0f;
            } else {
                cavVarB.s();
                cmwVar3 = cmwVar;
                f6 = f;
                f5 = f2;
                crdVar3 = crdVar;
                jT = j;
            }
            cavVarB.l();
            cavVar2 = cavVarB;
            bnc.a.a(cmwVar3, f6, f5, crdVar3, jT, cavVar2, (i2 & 14) | 196608);
            cmwVar2 = cmwVar3;
            f3 = f6;
            f4 = f5;
            crdVar2 = crdVar3;
            j2 = jT;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            cmwVar2 = cmwVar;
            f3 = f;
            f4 = f2;
            crdVar2 = crdVar;
            j2 = j;
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.acpj(this, cmwVar2, f3, f4, crdVar2, j2, i, 0);
        }
    }
}
