package com.google.android.setupdesign.view;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class HeaderRecyclerView extends android.support.v7.widget.RecyclerView {
    public android.view.View ab;
    private int ac;
    private boolean ad;

    public HeaderRecyclerView(android.content.Context context) {
        super(context);
        this.ad = false;
        a(null, 0);
    }

    private final void a(android.util.AttributeSet attributeSet, int i) {
        if (isInEditMode()) {
            return;
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, defpackage.aggy.l, i, 0);
        this.ac = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void Y(kh khVar) {
        if (this.ab != null && khVar != null) {
            defpackage.agim agimVar = new defpackage.agim(khVar);
            agimVar.a = this.ab;
            khVar = agimVar;
        }
        super.Y(khVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void aa(kp kpVar) {
        super.aa(kpVar);
        if (kpVar == null || this.ab != null || this.ac == 0) {
            return;
        }
        this.ab = android.view.LayoutInflater.from(getContext()).inflate(this.ac, (android.view.ViewGroup) this, false);
    }

    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        android.view.View viewFindFocus;
        boolean z = false;
        if (this.ad && keyEvent.getAction() == 1) {
            this.ad = false;
            return true;
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                android.view.View viewFindFocus2 = findFocus();
                if (viewFindFocus2 != null) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewFindFocus2.getLocationInWindow(iArr);
                    getLocationInWindow(iArr2);
                    int i = iArr[1] - iArr2[1];
                    if (i < 0) {
                        aq(0, java.lang.Math.max((int) (getMeasuredHeight() * (-0.7f)), i), false);
                        z = true;
                    }
                }
            } else if (keyCode == 20 && (viewFindFocus = findFocus()) != null) {
                int[] iArr3 = new int[2];
                int[] iArr4 = new int[2];
                viewFindFocus.getLocationInWindow(iArr3);
                getLocationInWindow(iArr4);
                int measuredHeight = (iArr3[1] + viewFindFocus.getMeasuredHeight()) - (iArr4[1] + getMeasuredHeight());
                if (measuredHeight > 0) {
                    aq(0, java.lang.Math.min((int) (getMeasuredHeight() * 0.7f), measuredHeight), false);
                    z = true;
                }
            }
            this.ad = z;
            if (z) {
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        int i = this.ab != null ? 1 : 0;
        accessibilityEvent.setItemCount(accessibilityEvent.getItemCount() - i);
        accessibilityEvent.setFromIndex(java.lang.Math.max(accessibilityEvent.getFromIndex() - i, 0));
        accessibilityEvent.setToIndex(java.lang.Math.max(accessibilityEvent.getToIndex() - i, 0));
    }

    public HeaderRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ad = false;
        a(attributeSet, 0);
    }

    public HeaderRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ad = false;
        a(attributeSet, i);
    }
}
