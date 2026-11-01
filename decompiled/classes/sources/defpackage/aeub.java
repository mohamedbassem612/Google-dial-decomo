package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aeub implements android.view.ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ defpackage.aeuc a;
    private final java.util.concurrent.atomic.AtomicReference b;

    public aeub(defpackage.aeuc aeucVar, android.view.View view) {
        j$.util.Objects.requireNonNull(aeucVar);
        this.a = aeucVar;
        this.b = new java.util.concurrent.atomic.AtomicReference(view);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        android.view.View view = (android.view.View) this.b.getAndSet(null);
        if (view == null) {
            return true;
        }
        try {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
            android.os.Handler handlerA = defpackage.afec.a();
            defpackage.aeuc aeucVar = this.a;
            j$.util.Objects.requireNonNull(aeucVar);
            handlerA.postAtFrontOfQueue(new defpackage.abqg(aeucVar, 8));
            j$.util.Objects.requireNonNull(aeucVar);
            defpackage.afec.a().post(new defpackage.abqg(aeucVar, 9));
            return true;
        } catch (java.lang.RuntimeException e) {
            android.util.Log.d("PrimesStartupMeasure", "Error handling StartupMeasure's onPreDraw", e);
            return true;
        }
    }
}
