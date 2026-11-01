package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ddp extends defpackage.ddm {
    public static defpackage.ddp b;
    public dkw c;
    public dij d;

    public ddp() {
        new android.graphics.Rect();
    }

    private final int e(int i, int i2) {
        dkw dkwVar = this.c;
        dkw dkwVar2 = null;
        if (dkwVar == null) {
            aooh.j("layoutResult");
            dkwVar = null;
        }
        int iG = dkwVar.g(i);
        dkw dkwVar3 = this.c;
        if (dkwVar3 == null) {
            aooh.j("layoutResult");
            dkwVar3 = null;
        }
        int iO = dkwVar3.o(iG);
        dkw dkwVar4 = this.c;
        if (i2 != iO) {
            if (dkwVar4 == null) {
                aooh.j("layoutResult");
            } else {
                dkwVar2 = dkwVar4;
            }
            return dkwVar2.g(i);
        }
        if (dkwVar4 == null) {
            aooh.j("layoutResult");
        } else {
            dkwVar2 = dkwVar4;
        }
        return dkwVar2.d(i, false) - 1;
    }

    @Override // defpackage.ddr
    public final int[] c(int i) {
        int iC;
        dkw dkwVar = null;
        if (a().length() > 0 && i < a().length()) {
            try {
                dij dijVar = this.d;
                if (dijVar == null) {
                    aooh.j("node");
                    dijVar = null;
                }
                cpn cpnVarB = dijVar.b();
                int iRound = java.lang.Math.round(cpnVarB.e - cpnVarB.c);
                int iT = aooc.t(0, i);
                dkw dkwVar2 = this.c;
                if (dkwVar2 == null) {
                    aooh.j("layoutResult");
                    dkwVar2 = null;
                }
                int iE = dkwVar2.e(iT);
                dkw dkwVar3 = this.c;
                if (dkwVar3 == null) {
                    aooh.j("layoutResult");
                    dkwVar3 = null;
                }
                float fB = dkwVar3.b(iE) + iRound;
                dkw dkwVar4 = this.c;
                if (dkwVar4 == null) {
                    aooh.j("layoutResult");
                    dkwVar4 = null;
                }
                dkw dkwVar5 = this.c;
                if (dkwVar5 == null) {
                    aooh.j("layoutResult");
                    dkwVar5 = null;
                }
                float fB2 = dkwVar4.b(dkwVar5.c() - 1);
                dkw dkwVar6 = this.c;
                if (fB < fB2) {
                    if (dkwVar6 == null) {
                        aooh.j("layoutResult");
                    } else {
                        dkwVar = dkwVar6;
                    }
                    iC = dkwVar.f(fB);
                } else {
                    if (dkwVar6 == null) {
                        aooh.j("layoutResult");
                    } else {
                        dkwVar = dkwVar6;
                    }
                    iC = dkwVar.c();
                }
                return b(iT, e(iC - 1, 1) + 1);
            } catch (java.lang.IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.ddr
    public final int[] d(int i) {
        int iF;
        dkw dkwVar = null;
        if (a().length() > 0 && i > 0) {
            try {
                dij dijVar = this.d;
                if (dijVar == null) {
                    aooh.j("node");
                    dijVar = null;
                }
                cpn cpnVarB = dijVar.b();
                int iRound = java.lang.Math.round(cpnVarB.e - cpnVarB.c);
                int iU = aooc.u(a().length(), i);
                dkw dkwVar2 = this.c;
                if (dkwVar2 == null) {
                    aooh.j("layoutResult");
                    dkwVar2 = null;
                }
                int iE = dkwVar2.e(iU);
                dkw dkwVar3 = this.c;
                if (dkwVar3 == null) {
                    aooh.j("layoutResult");
                    dkwVar3 = null;
                }
                float fB = dkwVar3.b(iE) - iRound;
                if (fB > 0.0f) {
                    dkw dkwVar4 = this.c;
                    if (dkwVar4 == null) {
                        aooh.j("layoutResult");
                    } else {
                        dkwVar = dkwVar4;
                    }
                    iF = dkwVar.f(fB);
                } else {
                    iF = 0;
                }
                if (iU == a().length() && iF < iE) {
                    iF++;
                }
                return b(e(iF, 2), iU);
            } catch (java.lang.IllegalStateException unused) {
            }
        }
        return null;
    }
}
