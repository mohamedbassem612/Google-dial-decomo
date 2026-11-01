package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class veh implements defpackage.aguq {
    private final veg a;

    public veh(veg vegVar) {
        this.a = vegVar;
    }

    @Override // defpackage.agva
    public final /* synthetic */ defpackage.ajcq a(androidx.work.WorkerParameters workerParameters) {
        return defpackage.agab.aX();
    }

    @Override // defpackage.aguq, defpackage.agva
    public final defpackage.ajcq b(androidx.work.WorkerParameters workerParameters) {
        int iA = workerParameters.b.a("id", -1);
        if (iA == -1) {
            return defpackage.aiql.z(new gsd());
        }
        veg vegVar = this.a;
        defpackage.ajas pthVar = new pth(vegVar, iA, 3);
        return ((java.lang.Boolean) vegVar.g.a()).booleanValue() ? vegVar.i.h(pthVar, vegVar.c) : defpackage.ahvr.G(pthVar, vegVar.d);
    }

    @Override // defpackage.agva
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.agva
    public final /* synthetic */ void h(java.util.function.Supplier supplier) {
    }
}
