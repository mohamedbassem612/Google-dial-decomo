package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class drq extends ddl implements fxz {
    private static final aonj m = new defpackage.dkq(13);
    public aomy a;
    public final android.view.View b;
    public final android.view.WindowManager c;
    public final android.view.WindowManager.LayoutParams d;
    public defpackage.drr e;
    public dpq f;
    public final ccp g;
    public final ccp h;
    public final cer i;
    public final fxy j;
    public final int[] k;
    public fyi l;
    private defpackage.drs n;
    private final boolean o;
    private dpo p;
    private final float q;
    private final android.graphics.Rect r;
    private final clk s;
    private final defpackage.drp t;
    private final ccp u;
    private boolean v;
    private final fyd w;

    /* JADX WARN: Code duplicated, block: B:18:0x0076  */
    /* JADX WARN: Multi-variable type inference failed */
    public drq(aomy aomyVar, defpackage.drs drsVar, android.view.View view, dpf dpfVar, defpackage.drr drrVar, java.util.UUID uuid, boolean z) {
        android.os.IBinder iBinder;
        super(view.getContext(), (android.util.AttributeSet) null, 0, 6, (aooc) null);
        this.a = aomyVar;
        this.n = drsVar;
        this.b = view;
        this.o = z;
        java.lang.Object systemService = view.getContext().getSystemService("window");
        aooh.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.c = (android.view.WindowManager) systemService;
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        defpackage.drs drsVar2 = this.n;
        cbd cbdVar = defpackage.dra.a;
        layoutParams.flags = defpackage.dra.a(drsVar2, mni.bh(view));
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            float f = this.n.f;
        }
        layoutParams.type = this.n.e;
        android.view.ViewGroup.LayoutParams layoutParams2 = view.getRootView().getLayoutParams();
        android.view.WindowManager.LayoutParams layoutParams3 = layoutParams2 instanceof android.view.WindowManager.LayoutParams ? (android.view.WindowManager.LayoutParams) layoutParams2 : null;
        android.os.IBinder applicationWindowToken = view.getApplicationWindowToken();
        if (layoutParams3 == null) {
            iBinder = null;
        } else {
            int i = layoutParams3.type;
            layoutParams3 = (i < 1000 || i >= 2000) ? null : layoutParams3;
            if (layoutParams3 != null) {
                iBinder = layoutParams3.token;
            } else {
                iBinder = null;
            }
        }
        layoutParams.token = iBinder != null ? iBinder : applicationWindowToken;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(2132018224));
        this.d = layoutParams;
        this.e = drrVar;
        this.f = dpq.a;
        cdu cduVar = cdu.c;
        this.g = new androidx.compose.runtime.ParcelableSnapshotMutableState((java.lang.Object) null, cduVar);
        this.h = new androidx.compose.runtime.ParcelableSnapshotMutableState((java.lang.Object) null, cduVar);
        this.i = new cbg(new defpackage.dqk(this, 6));
        this.q = 8.0f;
        this.r = new android.graphics.Rect();
        this.s = new clk(new dih(this, 14));
        fyd fydVar = new fyd();
        this.w = fydVar;
        defpackage.drp drpVar = new defpackage.drp(this, defpackage.fyc.a);
        this.t = drpVar;
        fxy fxyVar = new fxy((apnt) null);
        fxyVar.e(drpVar);
        fxyVar.a(fydVar);
        this.j = fxyVar;
        setId(android.R.id.content);
        dzo.l(this, dzo.k(view));
        dzo.j(this, dzo.i(view));
        dzk.O(this, dzk.N(view));
        if (this.n.a()) {
            dzl.j(this, this);
        }
        fxyVar.d(r());
        java.util.Objects.toString(uuid);
        setTag(2131427791, "Popup:".concat(java.lang.String.valueOf(uuid)));
        setClipChildren(false);
        setElevation(dpfVar.dl(8.0f));
        setOutlineProvider(new defpackage.dro());
        this.u = new androidx.compose.runtime.ParcelableSnapshotMutableState(defpackage.drd.a, cduVar);
        this.k = new int[2];
    }

    private final dpo q() {
        int i = this.n.a & 512;
        android.graphics.Rect rect = this.r;
        android.view.View view = this.b;
        if (i == 0) {
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            java.lang.Object systemService = view.getContext().getSystemService("window");
            aooh.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            rect.set(baa$.ExternalSyntheticApiModelOutline1.m(baa$.ExternalSyntheticApiModelOutline1.m((android.view.WindowManager) systemService)));
        }
        cbd cbdVar = defpackage.dra.a;
        return new dpo(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final boolean r() {
        if (!this.n.a()) {
            return false;
        }
        boolean z = this.n.c;
        return true;
    }

    public final cxi a() {
        return (cxi) this.h.a();
    }

    public final void b(cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(-857613600);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            ((aonn) this.u.a()).a(cavVarB, 0);
        } else {
            cavVarB.s();
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ajs(this, i, 12);
        }
    }

    public final dpp c() {
        return (dpp) this.g.a();
    }

    protected final boolean d() {
        return this.v;
    }

    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        boolean z = this.n.c;
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            android.view.KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
            } else if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                this.w.b();
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final fxy fd() {
        return this.j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(boolean z, int i, int i2, int i3, int i4) {
        super.h(z, i, i2, i3, i4);
        android.view.View childAt = getChildAt(0);
        if (childAt != null) {
            android.view.WindowManager.LayoutParams layoutParams = this.d;
            layoutParams.width = childAt.getMeasuredWidth();
            layoutParams.height = childAt.getMeasuredHeight();
            this.c.updateViewLayout(this, layoutParams);
        }
    }

    public final void i(int i, int i2) {
        dpo dpoVarQ = q();
        super.i(android.view.View.MeasureSpec.makeMeasureSpec(dpoVarQ.b(), Integer.MIN_VALUE), android.view.View.MeasureSpec.makeMeasureSpec(dpoVarQ.a(), Integer.MIN_VALUE));
    }

    public final void l(caz cazVar, aonn aonnVar) {
        super.j(cazVar);
        this.u.b(aonnVar);
        this.v = true;
    }

    public final void m() {
        cxi cxiVarA = a();
        if (cxiVarA != null) {
            if (true != cxiVarA.u()) {
                cxiVarA = null;
            }
            if (cxiVarA != null) {
                boolean z = this.o;
                long jH = cxiVarA.h();
                long jL = z ? cxiVarA.l(0L) : cxiVarA.m(0L);
                dpo dpoVarI = dfd.i((((long) java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (jL >> 32)))) << 32) | (((long) java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (jL & 4294967295L)))) & 4294967295L), jH);
                if (aooh.n(dpoVarI, this.p)) {
                    return;
                }
                this.p = dpoVarI;
                n();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n() {
        dpp dppVarC;
        final dpo dpoVar = this.p;
        if (dpoVar == null || (dppVarC = c()) == null) {
            return;
        }
        dpo dpoVarQ = q();
        int iB = dpoVarQ.b();
        long jA = dpoVarQ.a();
        final aoos aoosVar = new aoos();
        aoosVar.a = 0L;
        clk clkVar = this.s;
        final long j = dppVarC.a;
        final long j2 = (((long) iB) << 32) | (jA & 4294967295L);
        clkVar.c(this, m, new aomy() { // from class: drm
            public final java.lang.Object a() {
                defpackage.drq drqVar = this;
                aoosVar.a = drqVar.e.a(dpoVar, j2, drqVar.f, j);
                return aojh.a;
            }
        });
        android.view.WindowManager.LayoutParams layoutParams = this.d;
        layoutParams.x = dpn.a(aoosVar.a);
        layoutParams.y = dpn.b(aoosVar.a);
        fn$.ExternalSyntheticApiModelOutline0.m(this, ajsz.bd(new android.graphics.Rect[]{new android.graphics.Rect(0, 0, (int) (j2 >> 32), (int) (j2 & 4294967295L))}));
        this.c.updateViewLayout(this, layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(aomy aomyVar, defpackage.drs drsVar, dpq dpqVar, dpf dpfVar) {
        int i;
        this.a = aomyVar;
        if (!aooh.n(this.n, drsVar)) {
            this.n = drsVar;
            if (drsVar.a()) {
                dzl.j(this, this);
            } else {
                dzl.j(this, (fxz) null);
            }
            this.j.d(r());
            android.view.WindowManager.LayoutParams layoutParams = this.d;
            android.view.View view = this.b;
            cbd cbdVar = defpackage.dra.a;
            layoutParams.flags = defpackage.dra.a(drsVar, mni.bh(view));
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                float f = drsVar.f;
            }
            this.c.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = dpqVar.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                throw new aois();
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.s.d();
        boolean z = this.n.c;
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            fxy fxyVar = this.j;
            dih dihVar = new dih(this, 13);
            android.window.OnBackInvokedDispatcher onBackInvokedDispatcherM = ae$.ExternalSyntheticApiModelOutline0.m(this);
            if (onBackInvokedDispatcherM != null) {
                fyi fyiVar = new fyi(onBackInvokedDispatcherM);
                fxyVar.a(fyiVar);
                dihVar.a(fyiVar);
            }
        }
    }

    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clk clkVar = this.s;
        clkVar.e();
        clkVar.a();
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            fyi fyiVar = this.l;
            if (fyiVar != null) {
                fxy fxyVar = this.j;
                fxyVar.c();
                if (((ads) fxyVar.g).g(fyiVar)) {
                    ((fye) fxyVar.d).d(fyiVar);
                }
            }
            this.l = null;
        }
    }

    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z = this.n.d;
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            aomy aomyVar = this.a;
            if (aomyVar != null) {
                aomyVar.a();
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            aomy aomyVar2 = this.a;
            if (aomyVar2 != null) {
                aomyVar2.a();
            }
        }
        return true;
    }

    public final void setLayoutDirection(int i) {
    }
}
