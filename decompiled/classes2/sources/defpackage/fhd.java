package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fhd implements defpackage.fgv {
    public final defpackage.fgv a;
    final /* synthetic */ defpackage.fhe b;

    public fhd(defpackage.fhe fheVar, defpackage.fgv fgvVar) {
        j$.util.Objects.requireNonNull(fheVar);
        this.b = fheVar;
        this.a = fgvVar;
    }

    @Override // defpackage.fgv
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.fgv
    public final int b(long j) {
        return this.a.b(j - this.b.b);
    }

    @Override // defpackage.fgv
    public final void c() {
        this.a.c();
    }

    @Override // defpackage.fgv
    public final boolean e() {
        return this.a.e();
    }

    @Override // defpackage.fgv
    public final int f(defpackage.hiz hizVar, defpackage.ewu ewuVar, int i) {
        int iF = this.a.f(hizVar, ewuVar, i);
        if (iF != -4) {
            return iF;
        }
        ewuVar.f += this.b.b;
        return -4;
    }
}
