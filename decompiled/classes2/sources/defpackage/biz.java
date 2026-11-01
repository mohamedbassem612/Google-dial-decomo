package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class biz {
    public final dpq a;
    public final dkz b;
    public final dpf c;
    public final dnx d;
    public final gat e;
    private final dkz f;
    private float g = Float.NaN;
    private float h = Float.NaN;

    public biz(dpq dpqVar, dkz dkzVar, dpf dpfVar, gat gatVar, dnx dnxVar) {
        this.a = dpqVar;
        this.b = dkzVar;
        this.c = dpfVar;
        this.e = gatVar;
        this.d = dnxVar;
        this.f = dff.f(dkzVar, dpqVar);
    }

    public final long a(long j, int i) {
        int iC;
        float f = this.h;
        float f2 = this.g;
        if (java.lang.Float.isNaN(f) || java.lang.Float.isNaN(f2)) {
            dkz dkzVar = this.f;
            dpf dpfVar = this.c;
            gat gatVar = this.e;
            dnx dnxVar = this.d;
            java.lang.String str = defpackage.bja.a;
            aokc aokcVar = aokc.a;
            float f3 = new djb(new djc(str, dkzVar, aokcVar, aokcVar, gatVar, dnxVar, dpfVar, false), 1, 1, dpe.c(0, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY, 0, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY)).d;
            float f4 = new djb(new djc(defpackage.bja.b, dkzVar, aokcVar, aokcVar, gatVar, dnxVar, dpfVar, true), 2, 1, dpe.c(0, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY, 0, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY)).d - f3;
            this.h = f3;
            this.g = f4;
            f2 = f4;
            f = f3;
        }
        if (i != 1) {
            int iRound = java.lang.Math.round(f + (f2 * (i - 1)));
            iC = iRound >= 0 ? iRound : 0;
            int iA = dpd.a(j);
            if (iC > iA) {
                iC = iA;
            }
        } else {
            iC = dpd.c(j);
        }
        return dpe.c(dpd.d(j), dpd.b(j), iC, dpd.a(j));
    }
}
