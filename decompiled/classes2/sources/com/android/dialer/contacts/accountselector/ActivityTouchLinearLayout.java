package com.android.dialer.contacts.accountselector;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ActivityTouchLinearLayout extends android.widget.LinearLayout {
    public ActivityTouchLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        defpackage.jxj jxjVar = defpackage.jxj.a;
        jxjVar.b.set((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        return false;
    }
}
