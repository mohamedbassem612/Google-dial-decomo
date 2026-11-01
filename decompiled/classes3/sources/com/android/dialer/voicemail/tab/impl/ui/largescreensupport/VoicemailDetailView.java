package com.android.dialer.voicemail.tab.impl.ui.largescreensupport;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class VoicemailDetailView extends defpackage.vyn implements ahei {
    private defpackage.vys j;
    private android.content.Context k;

    @java.lang.Deprecated
    public VoicemailDetailView(android.content.Context context) {
        super(context);
        h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void h() {
        if (this.j == null) {
            this.j = ((defpackage.vyt) agab.aC(this, defpackage.vyt.class)).v();
            android.content.Context context = getContext();
            while ((context instanceof android.content.ContextWrapper) && !(context instanceof amyp) && !(context instanceof amyf) && !(context instanceof ahgi)) {
                context = ((android.content.ContextWrapper) context).getBaseContext();
            }
            if (!(context instanceof ahfx)) {
                throw new java.lang.IllegalStateException(hgb.d(this));
            }
        }
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final defpackage.vys y() {
        defpackage.vys vysVar = this.j;
        if (vysVar != null) {
            return vysVar;
        }
        throw new java.lang.IllegalStateException("peer() called before initialized.");
    }

    protected final /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new dtv();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (afsq.N(getContext())) {
            android.content.Context contextO = afsq.O(this);
            android.content.Context context = this.k;
            if (context == null) {
                this.k = contextO;
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
        h();
    }

    public VoicemailDetailView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoicemailDetailView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public VoicemailDetailView(defpackage.ahey aheyVar) {
        super(aheyVar);
        h();
    }
}
