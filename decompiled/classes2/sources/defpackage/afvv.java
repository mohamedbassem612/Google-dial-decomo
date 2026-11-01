package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class afvv implements android.window.OnBackAnimationCallback {
    final /* synthetic */ afvt a;
    final /* synthetic */ afvw b;

    public afvv(afvw afvwVar, afvt afvtVar) {
        this.a = afvtVar;
        j$.util.Objects.requireNonNull(afvwVar);
        this.b = afvwVar;
    }

    public final void onBackCancelled() {
        if (this.b.d()) {
            this.a.j();
        }
    }

    public final void onBackInvoked() {
        this.a.l();
    }

    public final void onBackProgressed(android.window.BackEvent backEvent) {
        if (this.b.d()) {
            this.a.x(new defpackage.mk(backEvent));
        }
    }

    public final void onBackStarted(android.window.BackEvent backEvent) {
        if (this.b.d()) {
            this.a.v(new defpackage.mk(backEvent));
        }
    }
}
