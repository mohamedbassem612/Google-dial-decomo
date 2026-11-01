package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aezi {
    public final defpackage.ahzi a;
    private final android.content.Context c;
    private final defpackage.ahzi d;
    private final defpackage.ahzi e;
    private volatile int f = 0;
    public final java.util.concurrent.CopyOnWriteArrayList b = new java.util.concurrent.CopyOnWriteArrayList();
    private final java.lang.Object g = new java.lang.Object();
    private volatile defpackage.ajcq h = null;

    public aezi(android.content.Context context, defpackage.ahzi ahziVar, defpackage.ahzi ahziVar2, defpackage.ahzi ahziVar3) {
        this.c = context;
        this.d = ahziVar;
        this.e = ahziVar2;
        this.a = ahziVar3;
    }

    public final void a(defpackage.ajsw ajswVar, defpackage.aezg aezgVar) {
        defpackage.ajcq ajcqVar;
        defpackage.aezm aezmVar = (defpackage.aezm) this.e.eZ();
        if (aezmVar == null) {
            defpackage.ajcq ajcqVar2 = defpackage.ajcm.a;
            return;
        }
        int i = 1 << ajswVar.h;
        if ((this.f & i) == 0) {
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.b;
            synchronized (copyOnWriteArrayList) {
                int i2 = this.f;
                if ((i2 & i) == 0) {
                    copyOnWriteArrayList.add(aezgVar);
                    this.f = i2 | i;
                }
            }
        }
        if (this.h == null) {
            synchronized (this.g) {
                if (this.h == null) {
                    android.content.Context context = this.c;
                    if (defpackage.abyl.h(context)) {
                        defpackage.ajcq ajcqVarJ = ((defpackage.aexi) this.a.eZ()).j(new defpackage.aezh(this, aezmVar));
                        this.h = ajcqVarJ;
                        ajcqVar = ajcqVarJ;
                    } else {
                        fvl fvlVar = new fvl(18);
                        defpackage.ahzi ahziVar = this.d;
                        defpackage.ajcq ajcqVarE = defpackage.abyl.e(context, fvlVar, (java.util.concurrent.Executor) ahziVar.eZ());
                        adot adotVar = new adot(this, aezmVar, 7);
                        java.util.concurrent.Executor executor = (java.util.concurrent.Executor) ahziVar.eZ();
                        int i3 = defpackage.ajan.c;
                        defpackage.ajal ajalVar = new defpackage.ajal(ajcqVarE, adotVar);
                        ajcqVarE.c(ajalVar, defpackage.aiql.t(executor, ajalVar));
                        this.h = ajalVar;
                        ajcqVar = ajalVar;
                    }
                    ajcqVar.c(new defpackage.abqg(ajcqVar, 13), (java.util.concurrent.Executor) this.d.eZ());
                }
            }
        }
    }
}
