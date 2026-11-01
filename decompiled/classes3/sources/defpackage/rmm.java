package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class rmm implements android.view.View.OnTouchListener {
    public final /* synthetic */ rmo a;
    public final /* synthetic */ int b;

    public /* synthetic */ rmm(rmo rmoVar, int i) {
        this.a = rmoVar;
        this.b = i;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        this.a.C(this.b);
        view.performClick();
        return true;
    }
}
