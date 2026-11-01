package com.android.dialer.blockreportspam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ScamFeedbackChipView extends defpackage.jmm implements ahei {
    private defpackage.jlr h;
    private android.content.Context i;

    @java.lang.Deprecated
    public ScamFeedbackChipView(android.content.Context context) {
        super(context);
        d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void d() {
        if (this.h == null) {
            this.h = ((defpackage.jls) agab.aC(this, defpackage.jls.class)).c();
            android.content.Context context = getContext();
            while ((context instanceof android.content.ContextWrapper) && !(context instanceof amyp) && !(context instanceof amyf) && !(context instanceof ahgi)) {
                context = ((android.content.ContextWrapper) context).getBaseContext();
            }
            if (!(context instanceof ahfx)) {
                throw new java.lang.IllegalStateException(hgb.d(this));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (afsq.N(getContext())) {
            android.content.Context contextO = afsq.O(this);
            android.content.Context context = this.i;
            if (context == null) {
                this.i = contextO;
                return;
            }
            boolean z = true;
            if (context != contextO && !afsq.P(context)) {
                z = false;
            }
            ahvr.bZ(z, "onAttach called multiple times with different parent Contexts");
        }
    }

    protected final void onFinishInflate() {
        super.onFinishInflate();
        d();
    }

    public final /* bridge */ /* synthetic */ java.lang.Object y() {
        defpackage.jlr jlrVar = this.h;
        if (jlrVar != null) {
            return jlrVar;
        }
        throw new java.lang.IllegalStateException("peer() called before initialized.");
    }

    public ScamFeedbackChipView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScamFeedbackChipView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ScamFeedbackChipView(ahey aheyVar) {
        super(aheyVar);
        d();
    }
}
