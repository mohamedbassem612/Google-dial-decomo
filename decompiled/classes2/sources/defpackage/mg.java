package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mg extends android.view.GestureDetector.SimpleOnGestureListener {
    public boolean a = true;
    final /* synthetic */ defpackage.mj b;

    public mg(defpackage.mj mjVar) {
        this.b = mjVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(android.view.MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(android.view.MotionEvent motionEvent) {
        defpackage.mj mjVar;
        android.view.View viewC;
        ld ldVarH;
        if (!this.a || (viewC = (mjVar = this.b).c(motionEvent)) == null || (ldVarH = mjVar.p.h(viewC)) == null) {
            return;
        }
        mjVar.l.b(mjVar.p, ldVarH);
    }
}
