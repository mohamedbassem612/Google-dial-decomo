package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adcg implements defpackage.affk {
    public final defpackage.acvy a;
    private final android.content.Context b;
    private final adbf c;
    private final java.util.concurrent.atomic.AtomicLong d = new java.util.concurrent.atomic.AtomicLong();
    private final java.util.concurrent.atomic.AtomicLong e = new java.util.concurrent.atomic.AtomicLong();

    public adcg(android.content.Context context, adbf adbfVar, defpackage.acvy acvyVar) {
        this.b = context;
        this.c = adbfVar;
        this.a = acvyVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    @Override // defpackage.affk
    public final void a(long j) {
        android.net.ConnectivityManager connectivityManager;
        defpackage.acwb acwbVar;
        try {
            connectivityManager = (android.net.ConnectivityManager) this.b.getSystemService("connectivity");
        } catch (java.lang.SecurityException unused) {
            adbe.c("%s: Couldn't retrieve ConnectivityManager.", "NetworkUsageMonitor");
            connectivityManager = null;
        }
        android.net.NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo != null) {
            if (activeNetworkInfo.getType() != 1 && activeNetworkInfo.getType() != 9 && activeNetworkInfo.getType() != 17) {
                this.e.getAndAdd(j);
            }
            acwbVar = this.a.c;
            if (acwbVar == null) {
                acwbVar = defpackage.acwb.a;
            }
            java.lang.String str = acwbVar.c;
            this.d.get();
            this.e.get();
            int i = adbe.a;
        }
        adbe.c("%s: Fail to get network type ", "NetworkUsageMonitor");
        this.d.getAndAdd(j);
        acwbVar = this.a.c;
        if (acwbVar == null) {
            acwbVar = defpackage.acwb.a;
        }
        java.lang.String str2 = acwbVar.c;
        this.d.get();
        this.e.get();
        int i2 = adbe.a;
    }

    @Override // defpackage.affk
    public final void b() {
        try {
            ahoq ahoqVarX = ahvr.X(1475, "MDD Network Usage Flush", ahot.a, false);
            try {
                adbf adbfVar = this.c;
                akzx akzxVarP = this.a.p();
                long andSet = this.e.getAndSet(0L);
                akzxVarP.u();
                defpackage.acvy acvyVar = (defpackage.acvy) akzxVarP.b;
                acvyVar.b |= 16;
                acvyVar.g = andSet;
                long andSet2 = this.d.getAndSet(0L);
                akzxVarP.u();
                defpackage.acvy acvyVar2 = (defpackage.acvy) akzxVarP.b;
                acvyVar2.b |= 32;
                acvyVar2.h = andSet2;
                ahvr.J(adbfVar.e((defpackage.acvy) akzxVarP.p()), new defpackage.uwo(this, 8), ajbm.a);
                ahoqVarX.close();
            } catch (java.lang.Throwable th) {
                try {
                    ahoqVarX.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.lang.Exception e) {
            adbe.g(e, "%s: Failed to flush counters", new java.lang.Object[]{"NetworkUsageMonitor"});
        }
    }
}
