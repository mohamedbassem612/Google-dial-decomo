package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ifs extends androidx.constraintlayout.widget.ConstraintLayout implements amyq, ahei {
    private amyh j;
    private boolean k;
    private defpackage.ifb l;
    private android.content.Context m;

    public ifs(ahey aheyVar) {
        super(aheyVar);
        if (!isInEditMode() && !this.k) {
            this.k = true;
            B();
        }
        g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void g() {
        if (this.l == null) {
            this.l = ((defpackage.ifc) agab.aC(this, defpackage.ifc.class)).a();
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final amyh b() {
        amyh amyhVar = this.j;
        if (amyhVar != null) {
            return amyhVar;
        }
        amyh amyhVar2 = new amyh(this);
        this.j = amyhVar2;
        return amyhVar2;
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final defpackage.ifb y() {
        defpackage.ifb ifbVar = this.l;
        if (ifbVar != null) {
            return ifbVar;
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
            android.content.Context context = this.m;
            if (context == null) {
                this.m = contextO;
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
        g();
    }
}
