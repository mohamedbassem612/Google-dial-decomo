package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agiv extends android.text.method.LinkMovementMethod {
    public boolean a = false;
    public android.view.MotionEvent b;

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(android.widget.TextView textView, android.text.Spannable spannable, android.view.MotionEvent motionEvent) {
        this.b = motionEvent;
        boolean zOnTouchEvent = super.onTouchEvent(textView, spannable, motionEvent);
        if (motionEvent.getAction() == 0) {
            this.a = android.text.Selection.getSelectionStart(spannable) != -1;
        } else {
            this.a = zOnTouchEvent;
        }
        return zOnTouchEvent;
    }
}
