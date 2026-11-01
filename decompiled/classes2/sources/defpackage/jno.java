package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jno implements defpackage.oqb {
    private static final aimz a = aimz.i("com/android/dialer/callannouncer/impl/growthkit/CallAnnouncerPromoController");
    private final rlv b;
    private final ipc c;

    public jno(ipc ipcVar, rlv rlvVar) {
        aooh.f(rlvVar, "loggingBindings");
        this.c = ipcVar;
        this.b = rlvVar;
    }

    @Override // defpackage.oqb
    public final acky a(aclc aclcVar) {
        android.content.Intent intent = (android.content.Intent) aclcVar.a.get(ackw.b);
        if (intent == null || !aooh.n("com.android.dialer.callannouncer.impl.growthkit.ACTION_SHOW_SETTINGS", intent.getAction())) {
            return null;
        }
        return new acky(true, 1);
    }

    @Override // defpackage.oqb
    public final void b(int i, ackw ackwVar) {
        if (i == 2) {
            if (ackwVar == ackw.b) {
                a.b().l("com/android/dialer/callannouncer/impl/growthkit/CallAnnouncerPromoController", "handleUserAction", 33, "CallAnnouncerPromoController.kt").v("ACTION_POSITIVE clicked, go to the call announcer settings.");
                this.b.o(rmx.eq);
            } else if (ackwVar == ackw.d) {
                a.b().l("com/android/dialer/callannouncer/impl/growthkit/CallAnnouncerPromoController", "handleUserAction", 41, "CallAnnouncerPromoController.kt").v("ACTION_DISMISS clicked, user accepted the new call announcer settings.");
                this.c.bm(rmu.H);
                this.b.o(rmx.ep);
            }
        }
    }
}
