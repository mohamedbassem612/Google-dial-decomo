package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dfv implements android.view.GestureDetector.OnGestureListener {
    final /* synthetic */ defpackage.dfw a;

    public dfv(defpackage.dfw dfwVar) {
        this.a = dfwVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(android.view.MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
        defpackage.dfw dfwVar = this.a;
        if (!dfwVar.d) {
            int i = dfwVar.c;
            if (defpackage.a.x(i, 1)) {
                if (java.lang.Math.abs(f) > java.lang.Math.abs(f2)) {
                    dfwVar.b.a(new cok(f > 0.0f ? 1 : 2));
                }
            } else if (defpackage.a.x(i, 2) && java.lang.Math.abs(f2) > java.lang.Math.abs(f)) {
                dfwVar.b.a(new cok(f2 > 0.0f ? 1 : 2));
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(android.view.MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(android.view.MotionEvent motionEvent) {
    }
}
