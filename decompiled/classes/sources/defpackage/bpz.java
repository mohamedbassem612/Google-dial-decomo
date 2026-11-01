package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bpz {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.cmw b = defpackage.azm.g(defpackage.cmw.c, 24.0f);

    /* JADX WARN: Code duplicated, block: B:76:0x0126  */
    public static final void a(defpackage.css cssVar, java.lang.String str, defpackage.cmw cmwVar, long j, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cmw cmwVarB;
        defpackage.cmw cmwVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-2142239481);
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cavVarB.B(cssVar) : cavVarB.D(cssVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.A(j) ? 1024 : 2048;
        }
        if (cavVarB.H((i2 & 1171) != 1170, i2 & 1)) {
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            cbtVar.Z(-127, null, 0, null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            if ((((i2 & 7168) ^ 3072) <= 2048 || !cavVarB.A(j)) && (i2 & 3072) != 2048) {
                z = false;
            }
            java.lang.Object objR = cbtVar.R();
            if (z || objR == defpackage.cau.a) {
                defpackage.cqa cqaVar = defpackage.anty.ah(j, defpackage.cfd.S()) ? null : new defpackage.cqa(j, 5);
                cbtVar.ab(cqaVar);
                objR = cqaVar;
            }
            defpackage.cqh cqhVar = (defpackage.cqh) objR;
            if (str != null) {
                cavVarB.u(-537002883);
                int i4 = i2 & 112;
                defpackage.cmt cmtVar = defpackage.cmw.c;
                java.lang.Object objR2 = cbtVar.R();
                if (i4 == 32 || objR2 == defpackage.cau.a) {
                    objR2 = new bln(str, 20);
                    cbtVar.ab(objR2);
                }
                cmwVarB = defpackage.dig.b(cmtVar, false, (defpackage.aonj) objR2);
                cbtVar.W(false);
            } else {
                cavVarB.u(-536844101);
                cbtVar.W(false);
                cmwVarB = defpackage.cmw.c;
            }
            defpackage.cmw cmwVar3 = cmwVarB;
            if (defpackage.anty.ah(cssVar.a(), 9205357640488583168L)) {
                cmwVar2 = b;
            } else {
                long jA = cssVar.a();
                if (java.lang.Float.isInfinite(java.lang.Float.intBitsToFloat((int) (jA >> 32))) && java.lang.Float.isInfinite(java.lang.Float.intBitsToFloat((int) (jA & 4294967295L)))) {
                    cmwVar2 = b;
                } else {
                    cmwVar2 = defpackage.cmw.c;
                }
            }
            defpackage.awo.c(defpackage.ru.j(cmwVar.a(cmwVar2), cssVar, null, defpackage.cwx.b, 0.0f, cqhVar, 22).a(cmwVar3), cavVarB, 0);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bpy(cssVar, str, cmwVar, j, i, 2);
        }
    }

    public static final void b(defpackage.csx csxVar, java.lang.String str, defpackage.cmw cmwVar, long j, defpackage.cav cavVar, int i) {
        int i2;
        java.lang.String str2;
        defpackage.cmw cmwVar2;
        long j2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-126890956);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(csxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.A(j) ? 1024 : 2048;
        }
        if (cavVarB.H((i2 & 1171) != 1170, i2 & 1)) {
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            str2 = str;
            cmwVar2 = cmwVar;
            j2 = j;
            a(defpackage.sl.f(csxVar, cavVarB), str2, cmwVar2, j2, cavVarB, (i2 & 112) | 8 | (i2 & 896) | (i2 & 7168));
        } else {
            str2 = str;
            cmwVar2 = cmwVar;
            j2 = j;
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bpy(csxVar, str2, cmwVar2, j2, i, 1);
        }
    }

    public static final void c(defpackage.cpu cpuVar, java.lang.String str, defpackage.cmw cmwVar, long j, defpackage.cav cavVar, int i) {
        int i2;
        java.lang.String str2;
        defpackage.cmw cmwVar2;
        long j2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1092052280);
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cavVarB.B(cpuVar) : cavVarB.D(cpuVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.A(j) ? 1024 : 2048;
        }
        if (cavVarB.H((i2 & 1171) != 1170, i2 & 1)) {
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            cbtVar.Z(-127, null, 0, null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !cavVarB.B(cpuVar))) {
                z = false;
            }
            java.lang.Object objR = cbtVar.R();
            if (z || objR == defpackage.cau.a) {
                objR = new csq(cpuVar);
                cbtVar.ab(objR);
            }
            str2 = str;
            cmwVar2 = cmwVar;
            j2 = j;
            a((csq) objR, str2, cmwVar2, j2, cavVarB, (i2 & 112) | 8 | (i2 & 896) | (i2 & 7168));
        } else {
            str2 = str;
            cmwVar2 = cmwVar;
            j2 = j;
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bpy(cpuVar, str2, cmwVar2, j2, i, 0);
        }
    }
}
