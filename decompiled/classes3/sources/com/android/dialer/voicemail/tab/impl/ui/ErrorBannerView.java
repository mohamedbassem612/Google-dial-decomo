package com.android.dialer.voicemail.tab.impl.ui;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ErrorBannerView extends defpackage.vwv implements ahei {
    private defpackage.vwk a;
    private android.content.Context b;

    @java.lang.Deprecated
    public ErrorBannerView(android.content.Context context) {
        super(context);
        e();
    }

    private final void e() {
        if (this.a == null) {
            this.a = ((defpackage.vwl) agab.aC(this, defpackage.vwl.class)).s();
            ajwr ajwrVarY = ahvr.y(this);
            ajwrVarY.a = this;
            defpackage.vwk vwkVar = this.a;
            ajwrVarY.f(((android.view.View) ajwrVarY.a).findViewById(2131428722), new defpackage.szl(vwkVar, 20));
            ajwrVarY.f(((android.view.View) ajwrVarY.a).findViewById(2131428902), new defpackage.vxa(vwkVar, 1));
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
    public final defpackage.vwk y() {
        defpackage.vwk vwkVar = this.a;
        if (vwkVar != null) {
            return vwkVar;
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

    public ErrorBannerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ErrorBannerView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ErrorBannerView(defpackage.ahey aheyVar) {
        super(aheyVar);
        e();
    }
}
