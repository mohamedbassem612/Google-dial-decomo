package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gcs extends defpackage.er {
    final /* synthetic */ gcr a;
    final /* synthetic */ gcr b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;

    public gcs(gcr gcrVar, gcr gcrVar2, int i, int i2) {
        this.a = gcrVar;
        this.b = gcrVar2;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.er
    public final int a() {
        return this.d;
    }

    @Override // defpackage.er
    public final int b() {
        return this.c;
    }

    @Override // defpackage.er
    public final java.lang.Object c(int i, int i2) {
        if (this.a.i(i) == this.b.i(i2)) {
            return java.lang.Boolean.TRUE;
        }
        return null;
    }

    @Override // defpackage.er
    public final boolean d(int i, int i2) {
        gcr gcrVar = this.b;
        java.lang.Object objI = this.a.i(i);
        java.lang.Object objI2 = gcrVar.i(i2);
        if (objI == objI2) {
            return true;
        }
        defpackage.lns lnsVar = (defpackage.lns) objI;
        defpackage.lns lnsVar2 = (defpackage.lns) objI2;
        aooh.f(lnsVar, "oldItem");
        aooh.f(lnsVar2, "newItem");
        return aooh.n(lnsVar, lnsVar2);
    }

    @Override // defpackage.er
    public final boolean e(int i, int i2) {
        gcr gcrVar = this.b;
        java.lang.Object objI = this.a.i(i);
        java.lang.Object objI2 = gcrVar.i(i2);
        if (objI == objI2) {
            return true;
        }
        defpackage.lns lnsVar = (defpackage.lns) objI;
        defpackage.lns lnsVar2 = (defpackage.lns) objI2;
        aooh.f(lnsVar, "oldItem");
        aooh.f(lnsVar2, "newItem");
        return lnsVar == lnsVar2;
    }
}
