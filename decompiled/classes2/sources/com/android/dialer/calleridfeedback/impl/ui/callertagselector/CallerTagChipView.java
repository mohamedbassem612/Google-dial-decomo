package com.android.dialer.calleridfeedback.impl.ui.callertagselector;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class CallerTagChipView extends defpackage.jvo implements ahei {
    private defpackage.juz h;
    private android.content.Context i;

    @java.lang.Deprecated
    public CallerTagChipView(android.content.Context context) {
        super(context);
        r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void r() {
        if (this.h == null) {
            this.h = ((defpackage.jva) agab.aC(this, defpackage.jva.class)).d();
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
    public final defpackage.juz y() {
        defpackage.juz juzVar = this.h;
        if (juzVar != null) {
            return juzVar;
        }
        throw new java.lang.IllegalStateException("peer() called before initialized.");
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
        r();
    }

    public final void setChecked(boolean z) {
        super.setChecked(z);
        r();
        afrz afrzVar = ((com.google.android.material.chip.Chip) this.h.b).c;
        if (afrzVar != null) {
            afrzVar.n(!z);
        }
    }

    public CallerTagChipView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CallerTagChipView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CallerTagChipView(ahey aheyVar) {
        super(aheyVar);
        r();
    }
}
