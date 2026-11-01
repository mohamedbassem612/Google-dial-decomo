package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vww extends android.widget.LinearLayout implements amyq, ahei {
    private defpackage.ahgs a;
    private boolean b;
    private defpackage.vws c;
    private android.content.Context d;

    public vww(defpackage.ahey aheyVar) {
        super(aheyVar);
        if (!isInEditMode() && !this.b) {
            this.b = true;
            ((defpackage.vwu) B()).O();
        }
        d();
    }

    private final void d() {
        if (this.c == null) {
            this.c = ((defpackage.vwt) agab.aC(this, defpackage.vwt.class)).t();
            android.content.Context context = getContext();
            while ((context instanceof android.content.ContextWrapper) && !(context instanceof amyp) && !(context instanceof amyf) && !(context instanceof ahgi)) {
                context = ((android.content.ContextWrapper) context).getBaseContext();
            }
            if (!(context instanceof ahfx)) {
                throw new java.lang.IllegalStateException(hgb.d(this));
            }
        }
    }

    public final java.lang.Object B() {
        return b().B();
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final defpackage.ahgs b() {
        defpackage.ahgs ahgsVar = this.a;
        if (ahgsVar != null) {
            return ahgsVar;
        }
        defpackage.ahgs ahgsVar2 = new defpackage.ahgs(this);
        this.a = ahgsVar2;
        return ahgsVar2;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final defpackage.vws y() {
        defpackage.vws vwsVar = this.c;
        if (vwsVar != null) {
            return vwsVar;
        }
        throw new java.lang.IllegalStateException("peer() called before initialized.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (afsq.N(getContext())) {
            android.content.Context contextO = afsq.O(this);
            android.content.Context context = this.d;
            if (context == null) {
                this.d = contextO;
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
}
