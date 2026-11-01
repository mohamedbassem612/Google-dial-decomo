package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aelo implements android.view.View.OnAttachStateChangeListener {
    public final /* synthetic */ defpackage.aljf a;
    private final aehj b;

    public aelo(defpackage.aljf aljfVar, android.view.View view) {
        j$.util.Objects.requireNonNull(aljfVar);
        this.a = aljfVar;
        this.b = new defpackage.aeln(this, view);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [aeit, java.lang.Object] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        ?? r2 = this.a.d;
        aehj aehjVar = this.b;
        r2.b(aehjVar);
        if (((aeiv) r2).e) {
            aehjVar.t(r2.a());
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [aeit, java.lang.Object] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        this.a.d.c(this.b);
    }
}
