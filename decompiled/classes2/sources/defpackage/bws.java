package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bws {
    public static final aiq a = den.bv(500, 0, new ajb(0.2f, 0.0f, 0.0f, 1.0f), 2);
    public static final aiq b = den.bv(500, 0, new ajb(0.3f, 0.0f, 0.8f, 0.15f), 2);

    public static final void a(aomy aomyVar, cmw cmwVar, long j, long j2, csm csmVar, csm csmVar2, float f, aonj aonjVar, cav cavVar, int i) {
        int i2;
        long j3;
        long j4;
        float f2;
        aonj aonjVar2;
        aomy aomyVar2 = aomyVar;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-1437375010);
        if (i3 == 0) {
            i2 = (true != cbtVarB.D(aomyVar2) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            j3 = j;
            i2 |= true != cbtVarB.A(j3) ? 128 : 256;
        } else {
            j3 = j;
        }
        if ((i & 3072) == 0) {
            j4 = j2;
            i2 |= true != cbtVarB.A(j4) ? 1024 : 2048;
        } else {
            j4 = j2;
        }
        if ((i & 24576) == 0) {
            i2 |= true != ((32768 & i) == 0 ? cbtVarB.B(csmVar) : cbtVarB.D(csmVar)) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != ((262144 & i) == 0 ? cbtVarB.B(csmVar2) : cbtVarB.D(csmVar2)) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            f2 = f;
            i2 |= true != cbtVarB.y(f2) ? 524288 : 1048576;
        } else {
            f2 = f;
        }
        if ((12582912 & i) == 0) {
            aonjVar2 = aonjVar;
            i2 |= true != cbtVarB.D(aonjVar2) ? 4194304 : 8388608;
        } else {
            aonjVar2 = aonjVar;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != cbtVarB.y(75.398224f) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i2 |= true != cbtVarB.y(0.0f) ? 268435456 : 536870912;
        }
        int i4 = i2;
        if (cbtVarB.H((306783379 & i4) != 306783378, i4 & 1)) {
            cbt cbtVar = cbtVarB;
            cbtVar.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) != 0 && !cbtVarB.E()) {
                cbtVarB.s();
            }
            cbtVarB.l();
            float f3 = defpackage.bwq.a;
            aomyVar2 = aomyVar;
            cmw cmwVarA = azm.g(cmwVar, defpackage.bwq.a).a(new defpackage.byb(aomyVar2, j3, j4, csmVar, csmVar2, f2, aonjVar2));
            int i5 = i4 & 14;
            java.lang.Object objR = cbtVar.R();
            if (i5 == 4 || objR == cau.a) {
                objR = new defpackage.bru(aomyVar2, 12);
                cbtVar.ab(objR);
            }
            den.aR(dig.b(cmwVarA, true, (aonj) objR), cbtVarB);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bwr(aomyVar2, cmwVar, j, j2, csmVar, csmVar2, f, aonjVar, i, 0);
        }
    }
}
