package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ayk extends defpackage.ayi {
    public int b = 2;
    public boolean a = true;

    @Override // defpackage.ayi
    public final boolean d() {
        return this.a;
    }

    @Override // defpackage.ayi
    public final int f(cxf cxfVar, cxe cxeVar, int i) {
        return this.b == 1 ? cxeVar.f(i) : cxeVar.d(i);
    }

    @Override // defpackage.ayi
    public final long g(cyd cydVar, long j) {
        if (this.a && dpd.j(j)) {
            return j;
        }
        int iF = this.b == 1 ? cydVar.f(dpd.a(j)) : cydVar.d(dpd.a(j));
        if (iF < 0) {
            iF = 0;
        }
        return dpe.f(iF, iF, 0, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY);
    }

    @Override // defpackage.ayi
    public final int j(cxf cxfVar, cxe cxeVar, int i) {
        return this.b == 1 ? cxeVar.f(i) : cxeVar.d(i);
    }
}
