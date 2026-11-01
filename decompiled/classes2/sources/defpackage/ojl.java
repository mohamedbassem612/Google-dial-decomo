package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ojl extends android.widget.LinearLayout implements amyq, ahei {
    private ahgs a;
    private boolean b;
    private defpackage.oji c;
    private android.content.Context d;

    @java.lang.Deprecated
    public ojl(android.content.Context context) {
        super(context);
        if (!isInEditMode() && !this.b) {
            this.b = true;
            ((defpackage.ojk) B()).D();
        }
        d();
    }

    private final void d() {
        if (this.c == null) {
            this.c = ((defpackage.ojj) agab.aC(this, defpackage.ojj.class)).m();
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
    public final ahgs b() {
        ahgs ahgsVar = this.a;
        if (ahgsVar != null) {
            return ahgsVar;
        }
        ahgs ahgsVar2 = new ahgs(this);
        this.a = ahgsVar2;
        return ahgsVar2;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final defpackage.oji y() {
        defpackage.oji ojiVar = this.c;
        if (ojiVar != null) {
            return ojiVar;
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
            } else {
                boolean z = true;
                if (context != contextO && !afsq.P(context)) {
                    z = false;
                }
                ahvr.bZ(z, "onAttach called multiple times with different parent Contexts");
            }
        }
        d();
        defpackage.oji ojiVar = this.c;
        aoov.an(ojiVar.b, (aolr) null, 0, new defpackage.nfu(ojiVar, (aoxh) new aoyp(ojiVar.c().a, ojiVar.c().b, new defpackage.ojh(null)), (aonj) new defpackage.npi(ojiVar, 16), (aoln) null, 2), 3);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        d();
    }
}
