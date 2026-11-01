package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class drk extends defpackage.mr {
    public aomy a;
    public defpackage.drh b;
    public final defpackage.drg c;
    private final android.view.View d;
    private final float e;
    private boolean f;

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View, drg] */
    public drk(aomy aomyVar, defpackage.drh drhVar, android.view.View view, dpq dpqVar, dpf dpfVar, java.util.UUID uuid) throws aois {
        super(new android.view.ContextThemeWrapper(view.getContext(), 2132083282), 0);
        this.a = aomyVar;
        this.b = drhVar;
        this.d = view;
        this.e = 8.0f;
        android.view.Window window = getWindow();
        if (window == null) {
            throw new java.lang.IllegalStateException("Dialog has no window");
        }
        android.view.Window window2 = getWindow();
        if (window2 != null) {
            android.view.WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.type = 2;
            window2.setAttributes(attributes);
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        dzn.c(window, true);
        window.setGravity(17);
        ?? drgVar = new defpackage.drg(getContext(), window);
        setTitle(this.b.d);
        java.util.Objects.toString(uuid);
        drgVar.setTag(2131427791, "Dialog:".concat(java.lang.String.valueOf(uuid)));
        drgVar.setClipChildren(false);
        drgVar.setElevation(dpfVar.dl(8.0f));
        drgVar.setOutlineProvider(new defpackage.drj());
        this.c = drgVar;
        android.view.View decorView = window.getDecorView();
        android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
        if (viewGroup != null) {
            b(viewGroup);
        }
        setContentView((android.view.View) drgVar);
        dzo.l((android.view.View) drgVar, dzo.k(view));
        dzo.j((android.view.View) drgVar, dzo.i(view));
        dzk.O((android.view.View) drgVar, dzk.N(view));
        a(this.a, this.b, dpqVar, dpfVar);
        nf nfVarFc = fc();
        dih dihVar = new dih(this, 12);
        aooh.f(nfVarFc, "<this>");
        nfVarFc.d(this, new defpackage.ng(dihVar));
    }

    private static final void b(android.view.ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof defpackage.drg) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            android.view.ViewGroup viewGroup2 = childAt instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                b(viewGroup2);
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final void a(aomy aomyVar, defpackage.drh drhVar, dpq dpqVar, dpf dpfVar) throws aois {
        int i;
        this.a = aomyVar;
        this.b = drhVar;
        int i2 = drhVar.g;
        cbd cbdVar = defpackage.dra.a;
        boolean zBh = mni.bh(this.d);
        android.view.Window window = getWindow();
        aooh.c(window);
        window.setFlags(true != zBh ? -8193 : 8192, 8192);
        int iOrdinal = dpqVar.ordinal();
        if (iOrdinal == 0) {
            i = 0;
        } else {
            if (iOrdinal != 1) {
                throw new aois();
            }
            i = 1;
        }
        defpackage.drg drgVar = this.c;
        drgVar.setLayoutDirection(i);
        boolean z = drhVar.c;
        boolean z2 = (drgVar.d && drgVar.b && drgVar.c) ? false : true;
        drgVar.b = true;
        drgVar.c = true;
        if (z2) {
            android.view.Window window2 = drgVar.a;
            if (window2.getAttributes().width != -2 || !drgVar.d) {
                window2.setLayout(-2, -2);
                drgVar.d = true;
            }
        }
        boolean z3 = drhVar.b;
        setCanceledOnTouchOutside(true);
        android.view.Window window3 = getWindow();
        if (window3 != null) {
            window3.setBackgroundDrawableResource(android.R.color.transparent);
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                float f = drhVar.e;
                float f2 = drhVar.f;
            }
            window3.setSoftInputMode(0);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, android.view.KeyEvent keyEvent) {
        boolean z = this.b.a;
        if (!keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.a.a();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x007a  */
    /* JADX WARN: Code duplicated, block: B:26:0x007e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0087  */
    /* JADX WARN: Code duplicated, block: B:29:0x008a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // android.app.Dialog
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int actionMasked;
        defpackage.drg drgVar;
        android.view.View childAt;
        int i;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        boolean z = this.b.b;
        if (java.lang.Math.abs(motionEvent.getX()) > Float.MAX_VALUE || java.lang.Math.abs(motionEvent.getY()) > Float.MAX_VALUE || (childAt = (drgVar = this.c).getChildAt(0)) == null) {
            actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                this.f = true;
            } else if (actionMasked != 1) {
                if (actionMasked != 3) {
                    return zOnTouchEvent;
                }
            } else {
                if (this.f) {
                    return zOnTouchEvent;
                }
                this.a.a();
                this.f = false;
            }
            return true;
        }
        int left = drgVar.getLeft() + childAt.getLeft();
        int width = childAt.getWidth() + left;
        int top = drgVar.getTop() + childAt.getTop();
        int height = childAt.getHeight() + top;
        int i2 = aopc.i(motionEvent.getX());
        if (left > i2 || i2 > width || top > (i = aopc.i(motionEvent.getY())) || i > height) {
            actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                this.f = true;
            } else if (actionMasked != 1) {
                if (actionMasked != 3) {
                    return zOnTouchEvent;
                }
            } else {
                if (this.f) {
                    return zOnTouchEvent;
                }
                this.a.a();
                this.f = false;
            }
            return true;
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 != 0 && actionMasked2 != 1 && actionMasked2 != 3) {
            return zOnTouchEvent;
        }
        this.f = false;
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
