package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class bgm implements java.lang.Runnable {
    public final /* synthetic */ dkz a;
    public final /* synthetic */ dpq b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ dpf d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ dnx f;
    public final /* synthetic */ gat g;

    public /* synthetic */ bgm(dkz dkzVar, dpq dpqVar, java.lang.String str, dpf dpfVar, gat gatVar, boolean z, dnx dnxVar) {
        this.a = dkzVar;
        this.b = dpqVar;
        this.c = str;
        this.d = dpfVar;
        this.g = gatVar;
        this.e = z;
        this.f = dnxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = bgn.a;
        android.os.Trace.beginSection("BackgroundTextMeasurement");
        gat gatVar = this.g;
        dnx dnxVar = this.f;
        dpf dpfVar = this.d;
        boolean z = this.e;
        java.lang.String str = this.c;
        dkz dkzVar = this.a;
        dpq dpqVar = this.b;
        try {
            ckk ckkVarK = cfd.k((aonj) null, (aonj) null);
            try {
                cko ckoVarW = ckkVarK.w();
                try {
                    dkz dkzVarF = dff.f(dkzVar, dpqVar);
                    aokc aokcVar = aokc.a;
                    new djc(str, dkzVarF, aokcVar, aokcVar, gatVar, dnxVar, dpfVar, z).a();
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
