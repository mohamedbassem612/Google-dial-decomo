package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class bgl implements java.lang.Runnable {
    public final /* synthetic */ dkz a;
    public final /* synthetic */ dpq b;
    public final /* synthetic */ java.util.List c;
    public final /* synthetic */ dji d;
    public final /* synthetic */ dpf e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ dnx g;
    public final /* synthetic */ gat h;

    public /* synthetic */ bgl(dkz dkzVar, dpq dpqVar, java.util.List list, dji djiVar, dpf dpfVar, gat gatVar, boolean z, dnx dnxVar) {
        this.a = dkzVar;
        this.b = dpqVar;
        this.c = list;
        this.d = djiVar;
        this.e = dpfVar;
        this.h = gatVar;
        this.f = z;
        this.g = dnxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = bgn.a;
        android.os.Trace.beginSection("BackgroundTextMeasurement");
        dpf dpfVar = this.e;
        gat gatVar = this.h;
        boolean z = this.f;
        dnx dnxVar = this.g;
        dji djiVar = this.d;
        dkz dkzVar = this.a;
        dpq dpqVar = this.b;
        try {
            ckk ckkVarK = cfd.k((aonj) null, (aonj) null);
            try {
                cko ckoVarW = ckkVarK.w();
                try {
                    dkz dkzVarF = dff.f(dkzVar, dpqVar);
                    aokc aokcVar = this.c;
                    if (aokcVar == null) {
                        aokcVar = aokc.a;
                    }
                    new djz(djiVar, dkzVarF, aokcVar, dpfVar, gatVar, z, dnxVar).a();
                    bgn.a();
                    ckw.i.j(ckoVarW);
                    ckkVarK.c().a();
                    ckkVarK.d();
                    android.os.Trace.endSection();
                } catch (java.lang.Throwable th) {
                    ckw.i.j(ckoVarW);
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                try {
                    throw th2;
                } catch (java.lang.Throwable th3) {
                    ckkVarK.d();
                    throw th3;
                }
            }
        } catch (java.lang.Throwable th4) {
            android.os.Trace.endSection();
            throw th4;
        }
    }
}
