package com.android.dialer.dobby.impl.settings.ui.radiogrouppreference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class RadioButtonPreferenceView extends defpackage.npz implements ahei {
    private defpackage.npw a;
    private android.content.Context b;

    @java.lang.Deprecated
    public RadioButtonPreferenceView(android.content.Context context) {
        super(context);
        d();
    }

    private final void d() {
        if (this.a == null) {
            this.a = ((defpackage.npx) agab.aC(this, defpackage.npx.class)).j();
            android.content.Context context = getContext();
            while ((context instanceof android.content.ContextWrapper) && !(context instanceof amyp) && !(context instanceof amyf) && !(context instanceof ahgi)) {
                context = ((android.content.ContextWrapper) context).getBaseContext();
            }
            if (!(context instanceof ahfx)) {
                throw new java.lang.IllegalStateException(hgb.d(this));
            }
        }
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
        d();
    }

    public final /* bridge */ /* synthetic */ java.lang.Object y() {
        defpackage.npw npwVar = this.a;
        if (npwVar != null) {
            return npwVar;
        }
        throw new java.lang.IllegalStateException("peer() called before initialized.");
    }

    public RadioButtonPreferenceView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RadioButtonPreferenceView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public RadioButtonPreferenceView(ahey aheyVar) {
        super(aheyVar);
        d();
    }
}
