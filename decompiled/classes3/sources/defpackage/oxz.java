package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class oxz implements hru {
    boolean a;
    final /* synthetic */ android.animation.Animator b;

    public oxz(defpackage.oyc oycVar, android.animation.Animator animator) {
        this.b = animator;
        j$.util.Objects.requireNonNull(oycVar);
        this.a = false;
    }

    public final void a(boolean z) {
        if (this.a) {
            return;
        }
        this.b.setupStartValues();
        this.a = true;
    }
}
