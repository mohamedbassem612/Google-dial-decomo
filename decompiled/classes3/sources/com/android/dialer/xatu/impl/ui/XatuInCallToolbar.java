package com.android.dialer.xatu.impl.ui;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class XatuInCallToolbar extends defpackage.wry implements ahei {
    private defpackage.wts B;
    private android.content.Context C;

    @java.lang.Deprecated
    public XatuInCallToolbar(android.content.Context context) {
        super(context);
        H();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void H() {
        if (this.B == null) {
            this.B = ((defpackage.wtt) agab.aC(this, defpackage.wtt.class)).z();
            android.content.Context context = getContext();
            while ((context instanceof android.content.ContextWrapper) && !(context instanceof amyp) && !(context instanceof amyf) && !(context instanceof ahgi)) {
                context = ((android.content.ContextWrapper) context).getBaseContext();
            }
            if (!(context instanceof ahfx)) {
                throw new java.lang.IllegalStateException(hgb.d(this));
            }
        }
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public final defpackage.wts y() {
        defpackage.wts wtsVar = this.B;
        if (wtsVar != null) {
            return wtsVar;
        }
        throw new java.lang.IllegalStateException("peer() called before initialized.");
    }

    protected final /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new lu();
    }

    protected final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return D(layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (afsq.N(getContext())) {
            android.content.Context contextO = afsq.O(this);
            android.content.Context context = this.C;
            if (context == null) {
                this.C = contextO;
            } else {
                boolean z = true;
                if (context != contextO && !afsq.P(context)) {
                    z = false;
                }
                ahvr.bZ(z, "onAttach called multiple times with different parent Contexts");
            }
        }
        H();
        defpackage.wts wtsVar = this.B;
        wtsVar.e = j$.util.Optional.of(((defpackage.voc) wtsVar.a).g((com.airbnb.lottie.LottieAnimationView) wtsVar.d));
        java.lang.Object obj = wtsVar.c;
        ajwr ajwrVar = (ajwr) obj;
        ajwrVar.g((android.view.View) wtsVar.b, new defpackage.wtr());
    }

    protected final void onFinishInflate() {
        super.onFinishInflate();
        H();
    }

    public XatuInCallToolbar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public XatuInCallToolbar(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public XatuInCallToolbar(defpackage.ahey aheyVar) {
        super(aheyVar);
        H();
    }
}
