package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class bmc implements defpackage.blg {
    private final boolean a;
    private final int b;
    private final int c;
    private final defpackage.bko d;
    private final defpackage.bkl e;

    public bmc(boolean z, int i, int i2, defpackage.bko bkoVar, defpackage.bkl bklVar) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = bkoVar;
        this.e = bklVar;
    }

    @Override // defpackage.blg
    public final int a() {
        return this.c;
    }

    @Override // defpackage.blg
    public final int b() {
        return 1;
    }

    @Override // defpackage.blg
    public final int c() {
        return this.b;
    }

    @Override // defpackage.blg
    public final acx d(defpackage.bko bkoVar) {
        boolean z = bkoVar.c;
        defpackage.bkn bknVar = bkoVar.a;
        defpackage.bkn bknVar2 = bkoVar.b;
        int i = bknVar.a;
        int i2 = bknVar2.a;
        if (z ? i <= i2 : i > i2) {
            bkoVar = defpackage.bko.a(bkoVar, null, null, !z, 3);
        }
        return acy.b(this.e.a, bkoVar);
    }

    @Override // defpackage.blg
    public final defpackage.bkl e() {
        return this.e;
    }

    @Override // defpackage.blg
    public final defpackage.bkl f() {
        return this.e;
    }

    @Override // defpackage.blg
    public final defpackage.bkl g() {
        return this.e;
    }

    @Override // defpackage.blg
    public final defpackage.bkl h() {
        return this.e;
    }

    @Override // defpackage.blg
    public final defpackage.bkl i(long j) {
        defpackage.bkl bklVar = this.e;
        if (j != bklVar.a) {
            return null;
        }
        return bklVar;
    }

    @Override // defpackage.blg
    public final defpackage.bko j() {
        return this.d;
    }

    @Override // defpackage.blg
    public final boolean l() {
        return this.a;
    }

    @Override // defpackage.blg
    public final boolean m(defpackage.blg blgVar) {
        if (this.d != null && blgVar != null && (blgVar instanceof defpackage.bmc)) {
            defpackage.bmc bmcVar = (defpackage.bmc) blgVar;
            if (this.b == bmcVar.b && this.c == bmcVar.c && this.a == bmcVar.a && !this.e.e(bmcVar.e)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.blg
    public final int n() {
        int iF = this.e.f();
        if (iF != 3) {
            return iF;
        }
        int i = this.b;
        int i2 = this.c;
        if (i < i2) {
            return 2;
        }
        if (i > i2) {
            return 1;
        }
        return iF;
    }

    public final java.lang.String toString() {
        return "SingleSelectionLayout(isStartHandle=" + this.a + ", crossed=" + ((java.lang.Object) defpackage.akf.c(n())) + ", info=\n\t" + this.e + ')';
    }

    @Override // defpackage.blg
    public final void k(aonj aonjVar) {
    }
}
