package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeua implements android.view.ViewTreeObserver.OnDrawListener {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ defpackage.aeuc a;
    private final java.util.concurrent.atomic.AtomicReference c;

    public aeua(defpackage.aeuc aeucVar, android.view.View view) {
        j$.util.Objects.requireNonNull(aeucVar);
        this.a = aeucVar;
        this.c = new java.util.concurrent.atomic.AtomicReference(view);
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        byte[] bArr = null;
        android.view.View view = (android.view.View) this.c.getAndSet(null);
        if (view != null) {
            try {
                android.os.Handler handlerA = defpackage.afec.a();
                defpackage.aeuc aeucVar = this.a;
                j$.util.Objects.requireNonNull(aeucVar);
                handlerA.postAtFrontOfQueue(new defpackage.abqg(aeucVar, 6));
                j$.util.Objects.requireNonNull(aeucVar);
                int i = 7;
                defpackage.afec.a().post(new defpackage.abqg(aeucVar, i));
                defpackage.afec.a().post(new defpackage.abqu(this, view, i, bArr));
            } catch (java.lang.RuntimeException e) {
                android.util.Log.d("PrimesStartupMeasure", "Error handling StartupMeasure's onDraw", e);
            }
        }
    }
}
