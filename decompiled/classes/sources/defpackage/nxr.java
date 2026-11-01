package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class nxr implements defpackage.aguq {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/duo/data/synclet/MeetPhoneNumberWorker");
    public final nxz b;
    public final defpackage.nxg c;
    public final defpackage.nwu d;
    private final defpackage.aoss e;

    public nxr(defpackage.aoss aossVar, nxz nxzVar, defpackage.nxg nxgVar, defpackage.nwu nwuVar) {
        defpackage.aooh.f(aossVar, "backgroundScope");
        defpackage.aooh.f(nxgVar, "meetDataRepository");
        defpackage.aooh.f(nwuVar, "meetCallController");
        this.e = aossVar;
        this.b = nxzVar;
        this.c = nxgVar;
        this.d = nwuVar;
    }

    @Override // defpackage.agva
    public final /* synthetic */ defpackage.ajcq a(androidx.work.WorkerParameters workerParameters) {
        return defpackage.agab.aX();
    }

    @Override // defpackage.aguq, defpackage.agva
    public final defpackage.ajcq b(androidx.work.WorkerParameters workerParameters) {
        return defpackage.aosv.F(this.e, 0, new defpackage.nto(this, (defpackage.aoln) null, 12), 3);
    }

    @Override // defpackage.agva
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.agva
    public final /* synthetic */ void h(java.util.function.Supplier supplier) {
    }
}
