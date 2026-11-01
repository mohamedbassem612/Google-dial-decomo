package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cjc implements cdv {
    public final cfc a = new cfc(new cdw[16]);
    private final java.util.Set b;

    public cjc(java.util.Set set) {
        this.b = set;
    }

    public final void j() {
        cfc cfcVar = this.a;
        java.lang.Object[] objArr = cfcVar.a;
        int i = cfcVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            cdv cdvVarA = ((cdw) objArr[i2]).a();
            this.b.remove(cdvVarA);
            cdvVarA.j();
        }
    }

    public final void h() {
    }

    public final void i() {
    }
}
