package com.android.dialer.audioplayback.impl.ui;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class AudioPlaybackView extends defpackage.ifu implements ahei {
    private defpackage.ifq j;
    private android.content.Context k;

    @java.lang.Deprecated
    public AudioPlaybackView(android.content.Context context) {
        super(context);
        h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void h() {
        if (this.j == null) {
            this.j = ((defpackage.ifr) agab.aC(this, defpackage.ifr.class)).b();
            ahvr.y(this).a = this;
            defpackage.ifq ifqVar = this.j;
            ahvr.f(this, defpackage.ifk.class, new defpackage.hwo(ifqVar, 3));
            ahvr.f(this, defpackage.ifl.class, new defpackage.iya(1));
            ahvr.f(this, defpackage.ifm.class, new defpackage.hwo(ifqVar, 4));
            ahvr.f(this, defpackage.ifn.class, new defpackage.hwo(ifqVar, 5));
            ahvr.f(this, defpackage.ifo.class, new defpackage.hwo(ifqVar, 6));
            android.content.Context context = getContext();
            while ((context instanceof android.content.ContextWrapper) && !(context instanceof amyp) && !(context instanceof amyf) && !(context instanceof ahgi)) {
                context = ((android.content.ContextWrapper) context).getBaseContext();
            }
            if (!(context instanceof ahfx)) {
                throw new java.lang.IllegalStateException(hgb.d(this));
            }
        }
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final defpackage.ifq y() {
        defpackage.ifq ifqVar = this.j;
        if (ifqVar != null) {
            return ifqVar;
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

    public AudioPlaybackView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AudioPlaybackView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AudioPlaybackView(ahey aheyVar) {
        super(aheyVar);
        h();
    }
}
