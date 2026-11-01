package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class ddl extends android.view.ViewGroup {
    private java.lang.ref.WeakReference a;
    private android.os.IBinder b;
    private volatile defpackage.cay c;
    private final java.lang.Object d;
    private boolean e;
    private defpackage.caz f;
    private defpackage.aomy g;
    private boolean h;

    public ddl(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        this.d = new java.lang.Object();
        this.g = defpackage.dgi.b.a(this);
    }

    private final defpackage.caz a() {
        defpackage.caz cazVar;
        defpackage.caz cazVar2 = this.f;
        if (cazVar2 != null) {
            return cazVar2;
        }
        defpackage.caz cazVarB = defpackage.dgx.b(this);
        if (cazVarB != null) {
            n(cazVarB);
        } else {
            cazVarB = null;
        }
        if (cazVarB != null) {
            return cazVarB;
        }
        java.lang.ref.WeakReference weakReference = this.a;
        if (weakReference == null || (cazVar = (defpackage.caz) weakReference.get()) == null || true != o(cazVar)) {
            cazVar = null;
        }
        if (cazVar != null) {
            return cazVar;
        }
        defpackage.cds cdsVarD = defpackage.dgx.d(this);
        n(cdsVarD);
        return cdsVarD;
    }

    private final defpackage.dfl c(android.view.View view, defpackage.dfl dflVar) {
        defpackage.caz cazVarA = a();
        defpackage.emx emxVarK = defpackage.dzo.k(view);
        defpackage.eoi eoiVarI = defpackage.dzo.i(view);
        defpackage.gii giiVarN = defpackage.dzk.N(view);
        if (cazVarA == dflVar.a() && emxVarK == dflVar.b() && eoiVarI == dflVar.c() && giiVarN == dflVar.d()) {
            return dflVar;
        }
        if (cazVarA.d() != dflVar.a().d()) {
            g();
        }
        if (emxVarK == null) {
            emxVarK = dflVar.b();
        }
        defpackage.emx emxVar = emxVarK;
        if (giiVarN == null) {
            giiVarN = dflVar.d();
        }
        defpackage.dfl dflVar2 = new defpackage.dfl(dflVar, view, cazVarA, emxVar, giiVarN, eoiVarI);
        view.setTag(2131427459, new java.lang.ref.WeakReference(dflVar2));
        return dflVar2;
    }

    private final void l() {
        if (this.e) {
            return;
        }
        throw new java.lang.UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0030  */
    /* JADX WARN: Code duplicated, block: B:66:0x0104 A[Catch: all -> 0x0153, TryCatch #0 {all -> 0x0153, blocks: (B:13:0x0018, B:15:0x001f, B:17:0x0027, B:20:0x002d, B:22:0x0031, B:24:0x003b, B:27:0x0047, B:30:0x004f, B:31:0x0056, B:32:0x0057, B:35:0x0060, B:38:0x0068, B:39:0x006f, B:40:0x0070, B:43:0x0079, B:46:0x0081, B:48:0x009e, B:50:0x00b9, B:51:0x00da, B:53:0x00e3, B:54:0x00e4, B:56:0x00eb, B:57:0x00ec, B:58:0x00ed, B:60:0x00f3, B:62:0x00fb, B:66:0x0104, B:67:0x0112, B:69:0x0120, B:71:0x0125, B:72:0x013d, B:63:0x00fe, B:47:0x009a, B:52:0x00db), top: B:89:0x0018, outer: #1, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0120 A[Catch: all -> 0x0153, TryCatch #0 {all -> 0x0153, blocks: (B:13:0x0018, B:15:0x001f, B:17:0x0027, B:20:0x002d, B:22:0x0031, B:24:0x003b, B:27:0x0047, B:30:0x004f, B:31:0x0056, B:32:0x0057, B:35:0x0060, B:38:0x0068, B:39:0x006f, B:40:0x0070, B:43:0x0079, B:46:0x0081, B:48:0x009e, B:50:0x00b9, B:51:0x00da, B:53:0x00e3, B:54:0x00e4, B:56:0x00eb, B:57:0x00ec, B:58:0x00ed, B:60:0x00f3, B:62:0x00fb, B:66:0x0104, B:67:0x0112, B:69:0x0120, B:71:0x0125, B:72:0x013d, B:63:0x00fe, B:47:0x009a, B:52:0x00db), top: B:89:0x0018, outer: #1, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0125 A[Catch: all -> 0x0153, TryCatch #0 {all -> 0x0153, blocks: (B:13:0x0018, B:15:0x001f, B:17:0x0027, B:20:0x002d, B:22:0x0031, B:24:0x003b, B:27:0x0047, B:30:0x004f, B:31:0x0056, B:32:0x0057, B:35:0x0060, B:38:0x0068, B:39:0x006f, B:40:0x0070, B:43:0x0079, B:46:0x0081, B:48:0x009e, B:50:0x00b9, B:51:0x00da, B:53:0x00e3, B:54:0x00e4, B:56:0x00eb, B:57:0x00ec, B:58:0x00ed, B:60:0x00f3, B:62:0x00fb, B:66:0x0104, B:67:0x0112, B:69:0x0120, B:71:0x0125, B:72:0x013d, B:63:0x00fe, B:47:0x009a, B:52:0x00db), top: B:89:0x0018, outer: #1, inners: #2 }] */
    private final void m() {
        defpackage.dfl dflVar;
        defpackage.dfl dflVarC;
        defpackage.deg degVar;
        defpackage.dha dhaVar;
        defpackage.eoi eoiVar;
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null && !this.e) {
                    this.e = true;
                    try {
                        android.os.Trace.beginSection("Compose:initializeView");
                        try {
                            if (getChildCount() != 0) {
                                android.view.View childAt = getChildAt(0);
                                defpackage.deg degVar2 = childAt instanceof defpackage.deg ? (defpackage.deg) childAt : null;
                                if (degVar2 != null) {
                                    dflVar = degVar2.e;
                                } else {
                                    dflVar = null;
                                }
                            } else {
                                dflVar = null;
                            }
                            android.view.View viewD = defpackage.dfa.d(this);
                            defpackage.dfl dflVarE = defpackage.dfa.e(viewD);
                            if (dflVarE == null) {
                                defpackage.caz cazVarA = a();
                                defpackage.emx emxVarK = defpackage.dzo.k(viewD);
                                if (emxVarK == null) {
                                    emxVarK = dflVar != null ? dflVar.b() : null;
                                    if (emxVarK == null) {
                                        throw new java.lang.IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                                    }
                                }
                                defpackage.emx emxVar = emxVarK;
                                defpackage.gii giiVarN = defpackage.dzk.N(viewD);
                                if (giiVarN == null) {
                                    giiVarN = dflVar != null ? dflVar.d() : null;
                                    if (giiVarN == null) {
                                        throw new java.lang.IllegalStateException("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                                    }
                                }
                                defpackage.gii giiVar = giiVarN;
                                defpackage.eoi eoiVarI = defpackage.dzo.i(viewD);
                                if (eoiVarI != null) {
                                    eoiVar = eoiVarI;
                                } else if (dflVar != null) {
                                    eoiVarI = dflVar.c();
                                    eoiVar = eoiVarI;
                                } else {
                                    eoiVar = null;
                                }
                                dflVarC = new defpackage.dfl(defpackage.dfa.e(defpackage.dfa.d(viewD)), viewD, cazVarA, emxVar, giiVar, eoiVar);
                                viewD.setTag(2131427459, new java.lang.ref.WeakReference(dflVarC));
                            } else {
                                dflVarC = c(viewD, dflVarE);
                            }
                            defpackage.cja cjaVar = new defpackage.cja(-2086174082, true, new defpackage.bae(this, 14));
                            android.view.ViewGroup.LayoutParams layoutParams = defpackage.dhc.a;
                            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = defpackage.dft.a;
                            if (defpackage.dft.a.compareAndSet(false, true)) {
                                defpackage.aowi aowiVarH = defpackage.aooh.H(1, 0, null, 6);
                                defpackage.aoov.an(defpackage.aosv.n((defpackage.aolr) defpackage.det.a.a()), null, 0, new defpackage.dfs(aowiVarH, null), 3);
                                defpackage.ddz ddzVar = new defpackage.ddz(aowiVarH, 6);
                                synchronized (defpackage.ckw.b) {
                                    defpackage.ckw.g = defpackage.ajsz.bU(defpackage.ckw.g, ddzVar);
                                }
                                defpackage.ckw.l(defpackage.ckw.a);
                            }
                            if (getChildCount() > 0) {
                                android.view.View childAt2 = getChildAt(0);
                                if (childAt2 instanceof defpackage.deg) {
                                    degVar = (defpackage.deg) childAt2;
                                }
                                if (degVar == null) {
                                    degVar = new defpackage.deg(getContext(), dflVarC);
                                    addView(degVar, defpackage.dhc.a);
                                }
                                degVar.ak(dflVarC);
                                java.lang.Object tag = degVar.getTag(2131429523);
                                dhaVar = tag instanceof defpackage.dha ? (defpackage.dha) tag : null;
                                if (dhaVar == null) {
                                    dhaVar = new defpackage.dha(degVar, new defpackage.cbb(dflVarC.a(), new defpackage.ddi(degVar.n)));
                                    degVar.setTag(2131429523, dhaVar);
                                }
                                dhaVar.e(cjaVar);
                                degVar.f = new defpackage.dhb(dflVarC.a());
                                this.c = dhaVar;
                                android.os.Trace.endSection();
                                this.e = false;
                            } else {
                                removeAllViews();
                            }
                            degVar = null;
                            if (degVar == null) {
                                degVar = new defpackage.deg(getContext(), dflVarC);
                                addView(degVar, defpackage.dhc.a);
                            }
                            degVar.ak(dflVarC);
                            java.lang.Object tag2 = degVar.getTag(2131429523);
                            if (tag2 instanceof defpackage.dha) {
                            }
                            if (dhaVar == null) {
                                dhaVar = new defpackage.dha(degVar, new defpackage.cbb(dflVarC.a(), new defpackage.ddi(degVar.n)));
                                degVar.setTag(2131429523, dhaVar);
                            }
                            dhaVar.e(cjaVar);
                            degVar.f = new defpackage.dhb(dflVarC.a());
                            this.c = dhaVar;
                            android.os.Trace.endSection();
                            this.e = false;
                        } catch (java.lang.Throwable th) {
                            android.os.Trace.endSection();
                            throw th;
                        }
                    } catch (java.lang.Throwable th2) {
                        this.e = false;
                        throw th2;
                    }
                }
            }
        }
    }

    private final void n(defpackage.caz cazVar) {
        if (true != o(cazVar)) {
            cazVar = null;
        }
        if (cazVar != null) {
            this.a = new java.lang.ref.WeakReference(cazVar);
        }
    }

    private static final boolean o(defpackage.caz cazVar) {
        return !(cazVar instanceof defpackage.cds) || ((defpackage.cdm) ((defpackage.cds) cazVar).k.c()).compareTo(defpackage.cdm.b) > 0;
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view) {
        l();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    protected final boolean addViewInLayout(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        l();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public abstract void b(defpackage.cav cavVar, int i);

    protected boolean d() {
        throw null;
    }

    public final void e() {
        if (isAttachedToWindow()) {
            android.os.IBinder windowToken = getWindowToken();
            defpackage.deg degVar = null;
            if (this.b != windowToken) {
                this.b = windowToken;
                this.a = null;
            }
            if (getChildCount() != 0) {
                android.view.View childAt = getChildAt(0);
                if (childAt instanceof defpackage.deg) {
                    degVar = (defpackage.deg) childAt;
                }
            }
            if (degVar != null) {
                degVar.ak(c(defpackage.dfa.d(this), degVar.e));
            }
            if (d()) {
                m();
            }
        }
    }

    public final void f() {
        if (this.f == null && !isAttachedToWindow()) {
            throw new java.lang.IllegalStateException("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        }
        m();
    }

    public final void g() {
        synchronized (this.d) {
            android.view.View childAt = getChildAt(0);
            if (childAt instanceof defpackage.deg) {
            }
            defpackage.cay cayVar = this.c;
            if (cayVar != null) {
                cayVar.d();
            }
            this.c = null;
            requestLayout();
        }
    }

    public void h(boolean z, int i, int i2, int i3, int i4) {
        android.view.View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public void i(int i, int i2) {
        android.view.View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, (android.view.View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), android.view.View.MeasureSpec.getMode(i)), android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, (android.view.View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), android.view.View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.h || super.isTransitionGroup();
    }

    public final void j(defpackage.caz cazVar) {
        if (this.f != cazVar) {
            this.f = cazVar;
            if (cazVar != null) {
                this.a = null;
            }
            synchronized (this.d) {
                defpackage.cay cayVar = this.c;
                if (cayVar != null) {
                    cayVar.d();
                    this.c = null;
                    if (isAttachedToWindow()) {
                        m();
                    }
                }
            }
        }
    }

    public final void k(defpackage.dgj dgjVar) {
        defpackage.aomy aomyVar = this.g;
        if (aomyVar != null) {
            aomyVar.a();
        }
        this.g = dgjVar.a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (defpackage.dgx.a(this).getParent() == null) {
            getHandler().postAtFrontOfQueue(new jd(this, 17, (byte[]) null));
        } else {
            e();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        h(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        m();
        i(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        android.view.View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    @Override // android.view.ViewGroup
    public final void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.h = true;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i) {
        l();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    protected final boolean addViewInLayout(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams, boolean z) {
        l();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i, int i2) {
        l();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        l();
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        l();
        super.addView(view, layoutParams);
    }

    public ddl(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ddl(android.content.Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ddl(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, defpackage.aooc aoocVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
