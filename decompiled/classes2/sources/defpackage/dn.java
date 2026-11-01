package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class dn extends android.support.v7.widget.ContentFrameLayout {
    final /* synthetic */ dq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn(dq dqVar, android.content.Context context) {
        super(context);
        this.a = dqVar;
    }

    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return this.a.J(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                dq dqVar = this.a;
                dqVar.C(dqVar.P(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(den.bO(getContext(), i));
    }
}
