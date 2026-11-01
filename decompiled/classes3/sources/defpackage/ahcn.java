package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahcn implements android.content.ComponentCallbacks2 {
    final /* synthetic */ defpackage.ahcp a;
    final /* synthetic */ aosy b;
    final /* synthetic */ aows c;

    public ahcn(defpackage.ahcp ahcpVar, aosy aosyVar, aows aowsVar) {
        this.a = ahcpVar;
        this.b = aosyVar;
        this.c = aowsVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        aooh.f(configuration, "newConfig");
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        java.lang.Object objB;
        if (i >= 40) {
            defpackage.ahck ahckVarA = this.a.a(null);
            if (ahckVarA instanceof defpackage.ahcj) {
                aimz aimzVar = ahco.a;
                aimzVar.b().l("com/google/apps/tiktok/experiments/phenotype/ProcessReaperComponentCallbacks$getReaperEvents$<anonymous>$<anonymous>", "onTrimMemory", 81, "ProcessReaperComponentCallbacks.kt").w("onTrimMemory=%d.", i);
                aosy aosyVar = this.b;
                if (aosyVar.x()) {
                    java.lang.Throwable thFJ = aosyVar.fJ();
                    objB = thFJ == null ? aosyVar.b() : aooc.ae(thFJ);
                } else {
                    objB = aooc.ae(new java.util.concurrent.TimeoutException("Job did not complete in time."));
                }
                java.lang.Throwable thC = aoiw.c(objB);
                if (thC != null) {
                    aimzVar.d().k(thC).l("com/google/apps/tiktok/experiments/phenotype/ProcessReaperComponentCallbacks$getReaperEvents$<anonymous>$<anonymous>", "onTrimMemory$<anonymous>", 88, "ProcessReaperComponentCallbacks.kt").v("Success logging preparation did not complete.");
                }
                defpackage.ajxi ajxiVar = (defpackage.ajxi) (true != (objB instanceof aoiv) ? objB : null);
                if (ajxiVar != null) {
                    ajxiVar.a();
                }
            }
            java.lang.Object objH = aoil.h(this.c, ahckVarA);
            if (objH instanceof aowl) {
                ahco.a.c().k(aowm.b(objH)).l("com/google/apps/tiktok/experiments/phenotype/ProcessReaperComponentCallbacks$getReaperEvents$<anonymous>$<anonymous>", "onTrimMemory$<anonymous>", 94, "ProcessReaperComponentCallbacks.kt").y("Failed to send %s", ahckVarA);
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}
