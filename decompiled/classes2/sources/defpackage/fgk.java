package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fgk implements defpackage.fgv {
    public final int a;
    final /* synthetic */ defpackage.fgm b;
    private final boolean c;

    public fgk(defpackage.fgm fgmVar, int i, boolean z) {
        j$.util.Objects.requireNonNull(fgmVar);
        this.b = fgmVar;
        this.a = i;
        this.c = z;
    }

    @Override // defpackage.fgv
    public final int a() {
        return this.c ? 4 : 0;
    }

    @Override // defpackage.fgv
    public final int b(long j) throws java.lang.Throwable {
        defpackage.fgm fgmVar = this.b;
        defpackage.fgj fgjVar = fgmVar.g;
        if (fgjVar.g()) {
            return 0;
        }
        int i = this.a;
        fgmVar.v(i);
        defpackage.fgu fguVar = fgmVar.j[i];
        int iH = fguVar.h(j, fgjVar.e());
        fguVar.t(iH);
        if (iH != 0) {
            return iH;
        }
        fgmVar.w(i);
        return 0;
    }

    @Override // defpackage.fgv
    public final void c() throws java.io.IOException {
        defpackage.fgm fgmVar = this.b;
        defpackage.fgu fguVar = fgmVar.j[this.a];
        defpackage.fcs fcsVar = fguVar.e;
        if (fcsVar == null || fcsVar.a() != 1) {
            fgmVar.x();
        } else {
            defpackage.fcr fcrVarB = fguVar.e.b();
            ahvr.ci(fcrVarB);
            throw fcrVarB;
        }
    }

    @Override // defpackage.fgv
    public final boolean e() {
        defpackage.fgm fgmVar = this.b;
        defpackage.fgj fgjVar = fgmVar.g;
        if (!fgjVar.g()) {
            if (fgmVar.j[this.a].w(fgjVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.fgv
    public final int f(defpackage.hiz hizVar, defpackage.ewu ewuVar, int i) {
        defpackage.fgm fgmVar = this.b;
        defpackage.fgj fgjVar = fgmVar.g;
        if (fgjVar.g()) {
            return -3;
        }
        int i2 = this.a;
        fgmVar.v(i2);
        defpackage.fgu fguVar = fgmVar.j[i2];
        int i3 = i & 2;
        boolean zE = fgjVar.e();
        defpackage.fgs fgsVar = fguVar.b;
        int iB = fguVar.B(hizVar, ewuVar, i3 != 0, zE, fgsVar);
        if (iB == -4) {
            if (!ewuVar.dL(4)) {
                int i4 = i & 1;
                if ((i & 4) == 0) {
                    if (i4 != 0) {
                        defpackage.fgr fgrVar = fguVar.a;
                        defpackage.fgr.b(fgrVar.d, ewuVar, fgsVar, fgrVar.b);
                    } else {
                        defpackage.fgr fgrVar2 = fguVar.a;
                        fgrVar2.d = defpackage.fgr.b(fgrVar2.d, ewuVar, fgsVar, fgrVar2.b);
                        fguVar.l++;
                    }
                } else if (i4 == 0) {
                    fguVar.l++;
                }
            }
            iB = -4;
        }
        if (iB == -3) {
            fgmVar.w(i2);
        }
        return iB;
    }
}
