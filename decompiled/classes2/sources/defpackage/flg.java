package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class flg implements defpackage.fmk {
    private final byte[] a = new byte[4096];

    @Override // defpackage.fmk
    public final /* synthetic */ int a(defpackage.epz epzVar, int i, boolean z) {
        return f(epzVar, i, z);
    }

    @Override // defpackage.fmk
    public final /* synthetic */ void b(defpackage.etx etxVar, int i) {
        etxVar.R(i);
    }

    @Override // defpackage.fmk
    public final void c(defpackage.etx etxVar, int i, int i2) {
        etxVar.R(i);
    }

    @Override // defpackage.fmk
    public final int f(defpackage.epz epzVar, int i, boolean z) throws java.io.EOFException {
        int iA = epzVar.a(this.a, 0, java.lang.Math.min(4096, i));
        if (iA != -1) {
            return iA;
        }
        if (z) {
            return -1;
        }
        throw new java.io.EOFException();
    }

    @Override // defpackage.fmk
    public final /* synthetic */ void z() {
    }

    @Override // defpackage.fmk
    public final void p(defpackage.eqg eqgVar) {
    }

    @Override // defpackage.fmk
    public final void d(long j, int i, int i2, int i3, defpackage.fmj fmjVar) {
    }
}
