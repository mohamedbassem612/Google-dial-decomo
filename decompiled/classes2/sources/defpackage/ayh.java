package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ayh extends defpackage.ayi {
    public boolean a = true;
    public int b;

    public ayh(int i) {
        this.b = i;
    }

    @Override // defpackage.ayi
    public final boolean d() {
        return this.a;
    }

    @Override // defpackage.ayi
    public final int e(cxf cxfVar, cxe cxeVar, int i) {
        return this.b == 1 ? cxeVar.e(i) : cxeVar.c(i);
    }

    @Override // defpackage.ayi
    public final long g(cyd cydVar, long j) {
        if (this.a && dpd.i(j)) {
            return j;
        }
        int iE = this.b == 1 ? cydVar.e(dpd.b(j)) : cydVar.c(dpd.b(j));
        if (iE < 0) {
            iE = 0;
        }
        return dpe.f(0, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY, iE, iE);
    }

    @Override // defpackage.ayi
    public final int i(cxf cxfVar, cxe cxeVar, int i) {
        return this.b == 1 ? cxeVar.e(i) : cxeVar.c(i);
    }
}
