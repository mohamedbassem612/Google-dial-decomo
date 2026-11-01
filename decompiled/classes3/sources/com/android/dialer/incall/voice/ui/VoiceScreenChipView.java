package com.android.dialer.incall.voice.ui;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class VoiceScreenChipView extends defpackage.rcu implements ahei {
    private defpackage.rdp ab;
    private android.content.Context ac;

    @java.lang.Deprecated
    public VoiceScreenChipView(android.content.Context context) {
        super(context);
        ax();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ax() {
        if (this.ab == null) {
            this.ab = ((defpackage.rdq) agab.aC(this, defpackage.rdq.class)).p();
            android.content.Context context = getContext();
            while ((context instanceof android.content.ContextWrapper) && !(context instanceof amyp) && !(context instanceof amyf) && !(context instanceof ahgi)) {
                context = ((android.content.ContextWrapper) context).getBaseContext();
            }
            if (!(context instanceof ahfx)) {
                throw new java.lang.IllegalStateException(hgb.d(this));
            }
        }
    }

    /* JADX INFO: renamed from: aw, reason: merged with bridge method [inline-methods] */
    public final defpackage.rdp y() {
        defpackage.rdp rdpVar = this.ab;
        if (rdpVar != null) {
            return rdpVar;
        }
        throw new java.lang.IllegalStateException("peer() called before initialized.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (afsq.N(getContext())) {
            android.content.Context contextO = afsq.O(this);
            android.content.Context context = this.ac;
            if (context == null) {
                this.ac = contextO;
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
        ax();
    }

    public VoiceScreenChipView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceScreenChipView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public VoiceScreenChipView(defpackage.ahey aheyVar) {
        super(aheyVar);
        ax();
    }
}
