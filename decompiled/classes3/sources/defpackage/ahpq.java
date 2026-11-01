package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ahpq implements android.widget.PopupWindow.OnDismissListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ ahpq(ahpz ahpzVar, android.widget.PopupWindow.OnDismissListener onDismissListener, int i) {
        this.$cid = i;
        this.a = ahpzVar;
        this.b = onDismissListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.widget.PopupWindow$OnDismissListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.view.ViewTreeObserver$OnGlobalLayoutListener, java.lang.Object] */
    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        int i = this.$cid;
        ?? r1 = this.b;
        if (i != 0) {
            android.view.ViewTreeObserver viewTreeObserver = ((ic) r1).d.getViewTreeObserver();
            if (viewTreeObserver != 0) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.a);
                return;
            }
            return;
        }
        if (!agab.aw()) {
            r1.onDismiss();
            return;
        }
        ahok ahokVarF = ((ahpz) this.a).f(1258, "TooltipFragment");
        try {
            r1.onDismiss();
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

    public ahpq(ic icVar, android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, int i) {
        this.$cid = i;
        this.a = onGlobalLayoutListener;
        this.b = icVar;
    }
}
