package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fmz implements defpackage.flj {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;

    public fmz(int i, byte[] bArr) {
        this.$cid = i;
        this.a = new defpackage.fmc(35152, 2, "image/png");
    }

    @Override // defpackage.flj
    public final /* synthetic */ java.util.List a() {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? aike.a : aike.a;
        }
        return aike.a;
    }

    @Override // defpackage.flj
    public final void b(defpackage.fll fllVar) {
        int i = this.$cid;
        if (i == 0) {
            ((defpackage.fmc) this.a).b(fllVar);
            return;
        }
        if (i != 1) {
            ((defpackage.fmc) this.a).b(fllVar);
            return;
        }
        defpackage.fmk fmkVarR = fllVar.r(0, 3);
        fllVar.y(new defpackage.flz(-9223372036854775807L, 0L));
        fllVar.s();
        defpackage.eqg eqgVar = (defpackage.eqg) this.a;
        defpackage.eqf eqfVar = new defpackage.eqf(eqgVar);
        eqfVar.c("text/x-unknown");
        eqfVar.j = eqgVar.p;
        fmkVarR.p(new defpackage.eqg(eqfVar));
    }

    @Override // defpackage.flj
    public final void d(long j, long j2) {
        int i = this.$cid;
        if (i == 0) {
            ((defpackage.fmc) this.a).d(j, j2);
        } else if (i != 1) {
            ((defpackage.fmc) this.a).d(j, j2);
        }
    }

    @Override // defpackage.flj
    public final boolean e(defpackage.flk flkVar) {
        int i = this.$cid;
        if (i == 0) {
            return ((defpackage.fmc) this.a).e(flkVar);
        }
        if (i != 1) {
            return ((defpackage.fmc) this.a).e(flkVar);
        }
        return true;
    }

    @Override // defpackage.flj
    public final int g(defpackage.flk flkVar, aesq aesqVar) {
        int i = this.$cid;
        if (i == 0) {
            return ((defpackage.fmc) this.a).g(flkVar, aesqVar);
        }
        if (i != 1) {
            return ((defpackage.fmc) this.a).g(flkVar, aesqVar);
        }
        return flkVar.c(androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY) == -1 ? -1 : 0;
    }

    public fmz(int i) {
        this.$cid = i;
        this.a = new defpackage.fmc(16973, 2, "image/bmp");
    }

    public fmz(defpackage.eqg eqgVar, int i) {
        this.$cid = i;
        this.a = eqgVar;
    }

    @Override // defpackage.flj
    public final void c() {
    }

    @Override // defpackage.flj
    public final /* synthetic */ void f() {
    }
}
