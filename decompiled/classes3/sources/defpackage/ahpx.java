package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahpx implements android.view.View.OnLongClickListener {
    final /* synthetic */ ahpz a;
    final /* synthetic */ int b;
    final /* synthetic */ java.lang.String c;
    final /* synthetic */ android.view.View.OnLongClickListener d;

    public ahpx(ahpz ahpzVar, int i, java.lang.String str, android.view.View.OnLongClickListener onLongClickListener) {
        this.a = ahpzVar;
        this.b = i;
        this.c = str;
        this.d = onLongClickListener;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        aooh.f(view, "view");
        android.view.View.OnLongClickListener onLongClickListener = this.d;
        ahok ahokVarF = this.a.f(this.b, this.c);
        try {
            boolean zOnLongClick = onLongClickListener.onLongClick(view);
            ajsz.ak(ahokVarF, (java.lang.Throwable) null);
            return zOnLongClick;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahokVarF, th);
                throw th2;
            }
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClickUseDefaultHapticFeedback(android.view.View view) {
        aooh.f(view, "view");
        return aabo$.ExternalSyntheticApiModelOutline0.m(this.d, view);
    }
}
