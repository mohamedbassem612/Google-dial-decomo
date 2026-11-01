package com.google.android.material.progressindicator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class LinearProgressIndicator extends defpackage.afxm {
    public LinearProgressIndicator(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 2132086108);
        defpackage.afyl afylVar = new defpackage.afyl((defpackage.afyt) this.a);
        android.content.Context context2 = getContext();
        defpackage.afyt afytVar = (defpackage.afyt) this.a;
        setIndeterminateDrawable(new defpackage.afyk(context2, afytVar, afylVar, afytVar.q == 0 ? new defpackage.afyo(afytVar) : new defpackage.afys(context2, afytVar)));
        setProgressDrawable(new defpackage.afyb(getContext(), (defpackage.afyt) this.a, afylVar));
        this.f = true;
    }

    @Override // defpackage.afxm
    public final /* synthetic */ defpackage.afxn a(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new defpackage.afyt(context, attributeSet);
    }

    @Override // defpackage.afxm
    public final void f(int... iArr) {
        super.f(iArr);
        ((defpackage.afyt) this.a).b();
    }

    @Override // defpackage.afxm
    public final void h(int i) {
        defpackage.afxn afxnVar = this.a;
        if (afxnVar != null && ((defpackage.afyt) afxnVar).q == 0 && isIndeterminate()) {
            return;
        }
        super.h(i);
    }

    @Override // defpackage.afxm, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        defpackage.afyt afytVar = (defpackage.afyt) this.a;
        int i5 = afytVar.r;
        boolean z2 = true;
        if (i5 != 1 && ((getLayoutDirection() != 1 || i5 != 2) && (getLayoutDirection() != 0 || i5 != 3))) {
            z2 = false;
        }
        afytVar.s = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        defpackage.afyk indeterminateDrawable = getIndeterminateDrawable();
        int i5 = i - paddingLeft;
        int i6 = i2 - paddingTop;
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, i5, i6);
        }
        defpackage.afyb progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, i5, i6);
        }
    }

    public LinearProgressIndicator(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130969752);
    }

    public LinearProgressIndicator(android.content.Context context) {
        this(context, null);
    }
}
