package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afqj implements java.lang.Runnable {
    final /* synthetic */ com.google.android.material.behavior.SwipeDismissBehavior a;
    private final android.view.View b;
    private final boolean c;

    public afqj(com.google.android.material.behavior.SwipeDismissBehavior swipeDismissBehavior, android.view.View view, boolean z) {
        j$.util.Objects.requireNonNull(swipeDismissBehavior);
        this.a = swipeDismissBehavior;
        this.b = view;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        defpackage.aprf aprfVar;
        com.google.android.material.behavior.SwipeDismissBehavior swipeDismissBehavior = this.a;
        ecm ecmVar = swipeDismissBehavior.a;
        if (ecmVar != null && ecmVar.l()) {
            this.b.postOnAnimation(this);
        } else {
            if (!this.c || (aprfVar = swipeDismissBehavior.f) == null) {
                return;
            }
            aprfVar.l(this.b);
        }
    }
}
