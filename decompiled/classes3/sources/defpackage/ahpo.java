package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ahpo implements android.view.View.OnLayoutChangeListener {
    public final /* synthetic */ ahpz a;
    public final /* synthetic */ int b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ android.view.View.OnLayoutChangeListener d;

    public /* synthetic */ ahpo(ahpz ahpzVar, int i, java.lang.String str, android.view.View.OnLayoutChangeListener onLayoutChangeListener) {
        this.a = ahpzVar;
        this.b = i;
        this.c = str;
        this.d = onLayoutChangeListener;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        android.view.View.OnLayoutChangeListener onLayoutChangeListener = this.d;
        if (!agab.aw()) {
            onLayoutChangeListener.onLayoutChange(view, i, i2, i3, i4, i5, i6, i7, i8);
            return;
        }
        ahok ahokVarF = this.a.f(this.b, this.c);
        try {
            onLayoutChangeListener.onLayoutChange(view, i, i2, i3, i4, i5, i6, i7, i8);
            ajsz.ak(ahokVarF, (java.lang.Throwable) null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahokVarF, th);
                throw th2;
            }
        }
    }
}
