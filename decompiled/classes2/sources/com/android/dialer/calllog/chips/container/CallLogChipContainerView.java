package com.android.dialer.calllog.chips.container;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class CallLogChipContainerView extends defpackage.jyq implements ahei {
    private defpackage.jyn a;
    private android.content.Context b;

    @java.lang.Deprecated
    public CallLogChipContainerView(android.content.Context context) {
        super(context);
        e();
    }

    private final void e() {
        if (this.a == null) {
            this.a = ((defpackage.jyo) agab.aC(this, defpackage.jyo.class)).f();
            android.content.Context context = getContext();
            while ((context instanceof android.content.ContextWrapper) && !(context instanceof amyp) && !(context instanceof amyf) && !(context instanceof ahgi)) {
                context = ((android.content.ContextWrapper) context).getBaseContext();
            }
            if (!(context instanceof ahfx)) {
                throw new java.lang.IllegalStateException(hgb.d(this));
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final defpackage.jyn y() {
        defpackage.jyn jynVar = this.a;
        if (jynVar != null) {
            return jynVar;
        }
        throw new java.lang.IllegalStateException("peer() called before initialized.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (afsq.N(getContext())) {
            android.content.Context contextO = afsq.O(this);
            android.content.Context context = this.b;
            if (context == null) {
                this.b = contextO;
                return;
            }
            boolean z = true;
            if (context != contextO && !afsq.P(context)) {
                z = false;
            }
            ahvr.bZ(z, "onAttach called multiple times with different parent Contexts");
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        e();
    }

    public CallLogChipContainerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CallLogChipContainerView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CallLogChipContainerView(ahey aheyVar) {
        super(aheyVar);
        e();
    }
}
