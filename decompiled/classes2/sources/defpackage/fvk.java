package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fvk implements defpackage.flj {
    private final /* synthetic */ int $cid;
    private final defpackage.etx a;
    private final defpackage.fmc b;

    public fvk(int i, byte[] bArr) {
        this.$cid = i;
        this.a = new defpackage.etx(4);
        this.b = new defpackage.fmc(-1, -1, "image/avif");
    }

    private final boolean h(defpackage.flk flkVar, int i) {
        defpackage.etx etxVar = this.a;
        etxVar.M(4);
        ((defpackage.flc) flkVar).n(etxVar.b, 0, 4, false);
        return etxVar.w() == ((long) i);
    }

    @Override // defpackage.flj
    public final /* synthetic */ java.util.List a() {
        return this.$cid != 0 ? aike.a : aike.a;
    }

    @Override // defpackage.flj
    public final void b(defpackage.fll fllVar) {
        int i = this.$cid;
        defpackage.fmc fmcVar = this.b;
        if (i != 0) {
            fmcVar.b(fllVar);
        } else {
            fmcVar.b(fllVar);
        }
    }

    @Override // defpackage.flj
    public final void d(long j, long j2) {
        int i = this.$cid;
        defpackage.fmc fmcVar = this.b;
        if (i != 0) {
            fmcVar.d(j, j2);
        } else {
            fmcVar.d(j, j2);
        }
    }

    @Override // defpackage.flj
    public final boolean e(defpackage.flk flkVar) {
        if (this.$cid != 0) {
            ((defpackage.flc) flkVar).m(4, false);
            if (h(flkVar, 1718909296) && h(flkVar, 1635150182)) {
                return true;
            }
        } else {
            defpackage.etx etxVar = this.a;
            etxVar.M(4);
            defpackage.flc flcVar = (defpackage.flc) flkVar;
            flcVar.n(etxVar.b, 0, 4, false);
            if (etxVar.w() == 1380533830) {
                flcVar.m(4, false);
                etxVar.M(4);
                flcVar.n(etxVar.b, 0, 4, false);
                if (etxVar.w() == 1464156752) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.flj
    public final int g(defpackage.flk flkVar, aesq aesqVar) {
        int i = this.$cid;
        defpackage.fmc fmcVar = this.b;
        return i != 0 ? fmcVar.g(flkVar, aesqVar) : fmcVar.g(flkVar, aesqVar);
    }

    @Override // defpackage.flj
    public final void c() {
    }

    @Override // defpackage.flj
    public final /* synthetic */ void f() {
    }

    public fvk(int i) {
        this.$cid = i;
        this.a = new defpackage.etx(4);
        this.b = new defpackage.fmc(-1, -1, "image/webp");
    }
}
