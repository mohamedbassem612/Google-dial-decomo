package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ddo extends defpackage.ddm {
    public static defpackage.ddo b;
    public dkw c;

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
        int iE;
        if (a().length() > 0 && i < a().length()) {
            dkw dkwVar = this.c;
            if (i < 0) {
                if (dkwVar == null) {
                    aooh.j("layoutResult");
                    dkwVar = null;
                }
                iE = dkwVar.e(0);
            } else {
                if (dkwVar == null) {
                    aooh.j("layoutResult");
                    dkwVar = null;
                }
                int iE2 = dkwVar.e(i);
                iE = e(iE2, 2) == i ? iE2 : iE2 + 1;
            }
            dkw dkwVar2 = this.c;
            if (dkwVar2 == null) {
                aooh.j("layoutResult");
                dkwVar2 = null;
            }
            if (iE < dkwVar2.c()) {
                return b(e(iE, 2), e(iE, 1) + 1);
            }
        }
        return null;
    }

    @Override // defpackage.ddr
    public final int[] d(int i) {
        int iE;
        if (a().length() > 0 && i > 0) {
            int length = a().length();
            dkw dkwVar = this.c;
            if (i > length) {
                if (dkwVar == null) {
                    aooh.j("layoutResult");
                    dkwVar = null;
                }
                iE = dkwVar.e(a().length());
            } else {
                if (dkwVar == null) {
                    aooh.j("layoutResult");
                    dkwVar = null;
                }
                int iE2 = dkwVar.e(i);
                iE = e(iE2, 1) + 1 == i ? iE2 : iE2 - 1;
            }
            if (iE >= 0) {
                return b(e(iE, 2), e(iE, 1) + 1);
            }
        }
        return null;
    }
}
