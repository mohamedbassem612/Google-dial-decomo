package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class amy extends defpackage.amk {
    private cvm j;
    private cuf k;

    public amy(defpackage.kaw kawVar, defpackage.any anyVar, boolean z, boolean z2, java.lang.String str, defpackage.dib dibVar, defpackage.aomy aomyVar) {
        super(kawVar, anyVar, z, z2, str, dibVar, aomyVar);
    }

    private final void I(boolean z) {
        if (z) {
            this.k = null;
        } else {
            this.j = null;
        }
        g(z);
        this.d = "idle";
    }

    @Override // defpackage.amk
    protected final void E(android.view.KeyEvent keyEvent) {
        r();
    }

    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // defpackage.amk, defpackage.cug
    public final void F(alic alicVar, cvg cvgVar) {
        super.F(alicVar, cvgVar);
        int i = 0;
        if (cvgVar != cvg.b) {
            if (cvgVar == cvg.c) {
                if (this.k != null) {
                    ?? r9 = alicVar.c;
                    int size = r9.size();
                    while (i < size) {
                        cuf cufVar = (cuf) r9.get(i);
                        if (cufVar.g && !defpackage.aooh.n(cufVar, this.k)) {
                            I(true);
                            break;
                        }
                        i++;
                    }
                }
                if (defpackage.aooh.n(this.d, "recognized")) {
                    this.d = "idle";
                    return;
                }
                return;
            }
            return;
        }
        if (this.k == null) {
            ?? r10 = alicVar.c;
            int size2 = r10.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (rq.i((cuf) r10.get(i2))) {
                    cuf cufVar2 = (cuf) r10.get(0);
                    cufVar2.a();
                    this.k = cufVar2;
                    if (this.a) {
                        this.d = "waiting";
                        i(cufVar2);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        ?? r11 = alicVar.c;
        int size3 = r11.size();
        for (int i3 = 0; i3 < size3; i3++) {
            if (!defpackage.den.bi((cuf) r11.get(i3))) {
                float fB = ((defpackage.dgk) defpackage.cfo.G(this, defpackage.dfo.n)).b();
                int size4 = r11.size();
                while (i < size4) {
                    cuf cufVar3 = (cuf) r11.get(i);
                    long j = cufVar3.c;
                    cuf cufVar4 = this.k;
                    if (cufVar4 == null) {
                        defpackage.aooh.g();
                    }
                    float fAbs = java.lang.Math.abs(defpackage.cpm.a(defpackage.mni.aM(j, cufVar4.c)));
                    if (cufVar3.g || fAbs > fB) {
                        I(true);
                        return;
                    }
                    i++;
                }
                return;
            }
        }
        ((cuf) r11.get(0)).a();
        if (this.a) {
            this.d = "recognized";
            cuf cufVar5 = this.k;
            if (cufVar5 == null) {
                defpackage.aooh.g();
            }
            h(cufVar5.c, true);
            r();
        }
        this.k = null;
    }

    @Override // defpackage.cug
    public final void H() {
        I(true);
    }

    @Override // defpackage.amk, defpackage.ddb
    public final void n() {
        super.n();
        I(false);
    }

    @Override // defpackage.amk, defpackage.ddb
    public final void p(defpackage.cvf cvfVar, cvg cvgVar, long j) {
        super.p(cvfVar, cvgVar, j);
        if (cvgVar != cvg.b) {
            if (cvgVar == cvg.c) {
                if (this.j != null) {
                    java.util.List list = cvfVar.a;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        cvm cvmVar = (cvm) list.get(i);
                        if (cvmVar.c() && !defpackage.aooh.n(cvmVar, this.j)) {
                            I(false);
                            break;
                        }
                    }
                }
                if (defpackage.aooh.n(this.d, "recognized")) {
                    this.d = "idle";
                    return;
                }
                return;
            }
            return;
        }
        if (this.j == null) {
            if (atv.a(cvfVar, true, false)) {
                cvm cvmVar2 = (cvm) cvfVar.a.get(0);
                cvmVar2.b();
                this.j = cvmVar2;
                if (this.a) {
                    this.d = "waiting";
                    j(cvmVar2);
                    return;
                }
                return;
            }
            return;
        }
        java.util.List list2 = cvfVar.a;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!defpackage.uu.s((cvm) list2.get(i2))) {
                long jA = a(j);
                int size3 = list2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    cvm cvmVar3 = (cvm) list2.get(i3);
                    if (cvmVar3.c() || defpackage.uu.u(cvmVar3, j, jA)) {
                        I(false);
                        return;
                    }
                }
                return;
            }
        }
        ((cvm) list2.get(0)).b();
        if (this.a) {
            this.d = "recognized";
            cvm cvmVar4 = this.j;
            if (cvmVar4 == null) {
                defpackage.aooh.g();
            }
            h(cvmVar4.c, false);
            r();
        }
        this.j = null;
    }

    @Override // defpackage.amk
    protected final boolean z(android.view.KeyEvent keyEvent) {
        return false;
    }
}
