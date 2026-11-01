package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class deg extends android.view.ViewGroup implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener, android.view.ViewTreeObserver.OnTouchModeChangeListener, defpackage.dcv, defpackage.cpi, defpackage.cvv, defpackage.emj, defpackage.dcs, defpackage.coq, defpackage.dit {
    public static final defpackage.adq G = new defpackage.adq(16);
    public static java.lang.Class a;
    public static java.lang.reflect.Method b;
    public static java.lang.Runnable c;
    public static java.lang.reflect.Method d;
    public final defpackage.dab A;
    public android.view.MotionEvent B;
    public long C;
    public boolean D;
    public final defpackage.aomy E;
    public final defpackage.cou F;
    public final defpackage.aco H;
    public final defpackage.adq I;
    public defpackage.adq J;
    public final defpackage.cnf K;
    public final defpackage.ddv L;
    public final defpackage.enr M;
    public final defpackage.apkl N;
    public defpackage.kaw O;
    private long P;
    private final boolean Q;
    private defpackage.dgc R;
    private final java.lang.Runnable S;
    private final defpackage.ccp T;
    private android.view.View U;
    private boolean V;
    private final defpackage.cvc W;
    private final defpackage.dee aA;
    private final defpackage.adq aB;
    private final defpackage.cop aC;
    private dfe aD;
    private yj aE;
    private wt aF;
    private final defpackage.ipc aG;
    private defpackage.kaw aH;
    private defpackage.kaw aI;
    private final defpackage.kaw aJ;
    private final defpackage.ccp aa;
    private final defpackage.ccp ab;
    private final defpackage.cnb ac;
    private defpackage.dpd ad;
    private boolean ae;
    private long af;
    private final int[] ag;
    private final android.graphics.Matrix ah;
    private long ai;
    private boolean aj;
    private long ak;
    private final java.util.concurrent.atomic.AtomicReference al;
    private final defpackage.ccp am;
    private final defpackage.ccp an;
    private float ao;
    private float ap;
    private float aq;
    private float ar;
    private final java.lang.Runnable as;
    private defpackage.aonn at;
    private final defpackage.dfw au;
    private final defpackage.aomy av;
    private boolean aw;
    private boolean ax;
    private android.view.View ay;
    private final defpackage.deq az;
    public defpackage.dfl e;
    public defpackage.dgb f;
    public defpackage.dfq g;
    public defpackage.cjp h;
    public final defpackage.aojw i;
    public defpackage.aolr j;
    public final defpackage.cnq k;
    public final defpackage.ccp l;
    public final defpackage.czx m;
    public final defpackage.dbk n;
    public final defpackage.diw o;
    public final defpackage.dik p;
    public final defpackage.dem q;
    public final defpackage.cnn r;
    public boolean s;
    public boolean t;
    public final defpackage.dcy u;
    public dey v;
    public final defpackage.dbw w;
    public final float[] x;
    public final float[] y;
    public defpackage.aonj z;

    /* JADX WARN: Multi-variable type inference failed */
    public deg(android.content.Context context, defpackage.dfl dflVar) {
        super(context);
        this.e = dflVar;
        this.P = 9205357640488583168L;
        this.Q = true;
        this.h = defpackage.cjl.a;
        this.i = new defpackage.aojw();
        java.lang.Object[] objArr = 0;
        this.S = new defpackage.ddv(this, 0);
        this.T = new androidx.compose.runtime.ParcelableSnapshotMutableState(defpackage.dpe.m(context), defpackage.cdu.a);
        defpackage.cou couVar = new defpackage.cou(this, this);
        this.F = couVar;
        this.j = dflVar.a().d();
        defpackage.cnq cnqVar = new defpackage.cnq();
        this.k = cnqVar;
        this.az = defpackage.deq.a;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        defpackage.cdu cduVar = defpackage.cdu.c;
        this.l = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, cduVar);
        this.m = new defpackage.czx();
        defpackage.dbk dbkVar = new defpackage.dbk(0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        dbkVar.ac(defpackage.czh.a);
        dbkVar.aa(t());
        dbkVar.ae(q());
        defpackage.cmw defVar = new defpackage.def(this);
        defpackage.cmw cmwVar = couVar.e;
        dbkVar.ad((cmwVar != defpackage.cmw.c ? new defpackage.cmq(defVar, cmwVar) : defVar).a(cnqVar.c));
        this.n = dbkVar;
        defpackage.aco acoVar = defpackage.acp.a;
        defpackage.aco acoVar2 = new defpackage.aco(6);
        this.H = acoVar2;
        defpackage.diw diwVar = new defpackage.diw(acoVar2, this);
        this.o = diwVar;
        defpackage.dik dikVar = new defpackage.dik(dbkVar, new defpackage.dhx(), acoVar2);
        this.p = dikVar;
        defpackage.dem demVar = new defpackage.dem(this);
        this.q = demVar;
        defpackage.cnn cnnVar = new defpackage.cnn(this, new defpackage.ded(this, 0));
        this.r = cnnVar;
        this.N = new defpackage.apkl(this);
        defpackage.kaw kawVar = new defpackage.kaw(null, null, null, null);
        this.aJ = kawVar;
        this.I = new defpackage.adq(16);
        this.W = new defpackage.cvc();
        this.aC = new defpackage.cop(dbkVar);
        this.aa = new androidx.compose.runtime.ParcelableSnapshotMutableState(new android.content.res.Configuration(context.getResources().getConfiguration()), cduVar);
        this.ab = new androidx.compose.runtime.ParcelableSnapshotMutableState(aC(new defpackage.dxe(new defpackage.dxf(aa$.ExternalSyntheticApiModelOutline1.m(ab())))), cduVar);
        this.ac = new defpackage.cnb(this, kawVar);
        this.K = new defpackage.cnf(new defpackage.cnk(context), dikVar, this, diwVar, context.getPackageName());
        this.u = new defpackage.dcy(new defpackage.bjp(this, 19));
        this.w = new defpackage.dbw(dbkVar);
        this.af = 9223372034707292159L;
        this.ag = new int[]{0, 0};
        defpackage.cqt.e();
        this.ah = new android.graphics.Matrix();
        this.x = defpackage.cqt.e();
        this.y = defpackage.cqt.e();
        this.ai = -1L;
        this.ak = 9187343241974906880L;
        this.al = new java.util.concurrent.atomic.AtomicReference(null);
        this.am = dflVar.f;
        defpackage.dpq dpqVarC = defpackage.con.c(context.getResources().getConfiguration().getLayoutDirection());
        this.an = new androidx.compose.runtime.ParcelableSnapshotMutableState(dpqVarC == null ? defpackage.dpq.a : dpqVarC, cduVar);
        this.A = new defpackage.dab(this);
        this.M = new defpackage.enr((short[]) null);
        this.aB = new defpackage.adq(16);
        this.ao = Float.NaN;
        this.ap = Float.NaN;
        this.aq = Float.NaN;
        this.ar = Float.NaN;
        this.L = new defpackage.ddv(this, 3, null);
        this.as = new defpackage.ddv(this, 2);
        this.au = new defpackage.dfw(this, new defpackage.bjp(this, 20));
        this.av = new defpackage.ddw(this, 1);
        this.E = new defpackage.ddw(this, objArr == true ? 1 : 0);
        addOnAttachStateChangeListener(cnnVar);
        setWillNotDraw(false);
        setFocusable(true);
        defpackage.dez.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        defpackage.dzs.i(this, demVar);
        setOnDragListener(cnqVar);
        defpackage.dfa.b(this);
        if (ao()) {
            android.view.View view = new android.view.View(context);
            view.setLayoutParams(new android.view.ViewGroup.LayoutParams(1, 1));
            view.setTag(2131428330, java.lang.Boolean.TRUE);
            this.U = view;
            addView(view, -1);
        }
        this.aG = android.os.Build.VERSION.SDK_INT >= 31 ? new defpackage.ipc(null, null, null, null) : null;
        this.aA = new defpackage.dee(context, this);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0054  */
    private final void aA() {
        boolean z;
        int[] iArr = this.ag;
        getLocationOnScreen(iArr);
        long j = this.af;
        long j2 = j >> 32;
        int i = (int) (j & 4294967295L);
        int i2 = (int) j2;
        int i3 = iArr[0];
        if (i2 == i3 && i == iArr[1] && this.ai >= 0) {
            z = false;
        } else {
            this.af = (((long) i3) << 32) | (((long) iArr[1]) & 4294967295L);
            if (i2 == Integer.MAX_VALUE || i == Integer.MAX_VALUE) {
                z = false;
            } else {
                defpackage.cfc cfcVarJ = this.n.j();
                java.lang.Object[] objArr = cfcVarJ.a;
                int i4 = cfcVarJ.b;
                for (int i5 = 0; i5 < i4; i5++) {
                    ((defpackage.dbk) objArr[i5]).n().F();
                }
                z = true;
            }
        }
        ah();
        android.view.View rootView = this.ay;
        if (rootView == null) {
            rootView = getRootView();
            this.ay = rootView;
        }
        defpackage.diw diwVar = this.o;
        long j3 = this.af;
        long jL = defpackage.dfd.l(this.ak);
        float[] fArr = this.x;
        int width = rootView.getWidth();
        int height = rootView.getHeight();
        int length = fArr.length;
        int i6 = fArr[0] == 1.0f ? 1 : 0;
        int i7 = fArr[1] == 0.0f ? 1 : 0;
        int i8 = fArr[2] == 0.0f ? 1 : 0;
        int i9 = fArr[4] == 0.0f ? 1 : 0;
        int i10 = fArr[5] == 1.0f ? 1 : 0;
        int i11 = fArr[6] == 0.0f ? 1 : 0;
        int i12 = fArr[8] == 0.0f ? 1 : 0;
        int i13 = fArr[9] == 0.0f ? 1 : 0;
        if ((((((((((((i6 & i7) & i8) & i9) & i10) & i11) & i12) & i13) & (fArr[10] == 1.0f ? 1 : 0)) << 1) | ((fArr[12] == 0.0f ? 1 : 0) & (fArr[13] == 0.0f ? 1 : 0) & (fArr[14] == 0.0f ? 1 : 0) & (fArr[15] == 1.0f ? 1 : 0))) & 2) != 0) {
            fArr = null;
        }
        diwVar.e = diwVar.c.a(j3, jL, fArr, width, height) || diwVar.e;
        this.w.b(z);
        diwVar.c();
    }

    private final boolean aB(android.view.MotionEvent motionEvent) {
        android.view.MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.B) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    private static final defpackage.dnx aC(defpackage.dxe dxeVar) {
        if (dxeVar.g()) {
            dxeVar = new defpackage.dxe(new defpackage.dxf(aa$.ExternalSyntheticApiModelOutline1.m()));
        }
        int iA = dxeVar.a();
        java.util.ArrayList arrayList = new java.util.ArrayList(iA);
        for (int i = 0; i < iA; i++) {
            java.util.Locale localeF = dxeVar.f(i);
            if (localeF == null) {
                defpackage.aooh.g();
            }
            arrayList.add(new defpackage.dnw(localeF));
        }
        return new defpackage.dnx(arrayList);
    }

    private static final boolean aD(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2) {
        return (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true;
    }

    private static final boolean aE(android.view.MotionEvent motionEvent) {
        boolean z = (java.lang.Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (java.lang.Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (java.lang.Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (java.lang.Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (java.lang.Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (java.lang.Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || !defpackage.dfa.c(motionEvent, i);
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private final boolean aF(android.view.MotionEvent motionEvent, int i) {
        if (i == 5) {
            return true;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return x >= 0.0f && x <= ((float) getWidth()) && y >= 0.0f && y <= ((float) getHeight());
    }

    private static final long aG(int i) {
        int mode = android.view.View.MeasureSpec.getMode(i);
        int size = android.view.View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return size;
        }
        if (mode == 0) {
            return 2147483647L;
        }
        if (mode != 1073741824) {
            throw new java.lang.IllegalStateException();
        }
        long j = size;
        return (j << 32) | j;
    }

    private final void aH() {
        if (this.aH == null) {
            new defpackage.kaw((android.view.View) this, (byte[]) null);
            this.aH = new defpackage.kaw((android.view.View) this);
        }
    }

    public static final boolean al(defpackage.deg degVar, android.view.KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public static final boolean an(defpackage.deg degVar, android.view.MotionEvent motionEvent) {
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    public static final boolean ao() {
        return android.os.Build.VERSION.SDK_INT >= 35;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x007d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00dc  */
    private final int aq(android.view.MotionEvent motionEvent) throws java.lang.Throwable {
        java.lang.Throwable th;
        boolean z;
        defpackage.deg degVar;
        android.view.MotionEvent motionEvent2;
        int actionMasked;
        removeCallbacks(this.L);
        try {
            try {
                this.ai = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
                aw();
                long jA = defpackage.cqt.a(this.x, (((long) java.lang.Float.floatToRawIntBits(motionEvent.getX())) << 32) | (((long) java.lang.Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L));
                this.ak = (((long) java.lang.Float.floatToRawIntBits(motionEvent.getRawX() - java.lang.Float.intBitsToFloat((int) (jA >> 32)))) << 32) | (((long) java.lang.Float.floatToRawIntBits(motionEvent.getRawY() - java.lang.Float.intBitsToFloat((int) (jA & 4294967295L)))) & 4294967295L);
                boolean z2 = true;
                this.aj = true;
                w(false);
                defpackage.aoop aoopVar = new defpackage.aoop();
                android.os.Trace.beginSection("AndroidOwner:onTouch");
                try {
                    int actionMasked2 = motionEvent.getActionMasked();
                    android.view.MotionEvent motionEvent3 = this.B;
                    if (motionEvent3 != null) {
                        try {
                            if (motionEvent3.getToolType(0) == 3) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            android.os.Trace.endSection();
                            throw th;
                        }
                    } else {
                        z = false;
                    }
                    try {
                        if (motionEvent3 == null || !aD(motionEvent, motionEvent3)) {
                            degVar = this;
                        } else if (motionEvent3.getButtonState() != 0 || (actionMasked = motionEvent3.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                            degVar = this;
                            degVar.aC.c();
                        } else if (motionEvent3.getActionMasked() == 10 || !z) {
                            degVar = this;
                        } else {
                            degVar = this;
                            degVar.aj(motionEvent3, 10, motionEvent3.getEventTime(), true);
                        }
                        int toolType = motionEvent.getToolType(0);
                        if (z || toolType != 3 || actionMasked2 == 3) {
                            motionEvent2 = motionEvent;
                        } else if (actionMasked2 == 9) {
                            motionEvent2 = motionEvent;
                            actionMasked2 = 9;
                        } else if (degVar.aF(motionEvent, 1)) {
                            motionEvent2 = motionEvent;
                            degVar.aj(motionEvent2, 9, motionEvent.getEventTime(), true);
                        } else {
                            motionEvent2 = motionEvent;
                        }
                        int buttonState = motionEvent2.getButtonState();
                        if (actionMasked2 == 8 && buttonState == 0 && motionEvent3 != 0 && !motionEvent3.isFromSource(4098)) {
                            aoopVar.a = true;
                        }
                        android.view.MotionEvent motionEvent4 = degVar.B;
                        if (motionEvent4 != null && motionEvent4.getAction() == 10) {
                            android.view.MotionEvent motionEvent5 = degVar.B;
                            int pointerId = motionEvent5 != null ? motionEvent5.getPointerId(0) : -1;
                            if (motionEvent2.getAction() == 9 && motionEvent2.getHistorySize() == 0) {
                                if (pointerId >= 0) {
                                    degVar.W.d(pointerId);
                                }
                            } else if (motionEvent2.getAction() == 0 && motionEvent2.getHistorySize() == 0) {
                                android.view.MotionEvent motionEvent6 = degVar.B;
                                float x = motionEvent6 != null ? motionEvent6.getX() : Float.NaN;
                                android.view.MotionEvent motionEvent7 = degVar.B;
                                float y = motionEvent7 != null ? motionEvent7.getY() : Float.NaN;
                                float x2 = motionEvent2.getX();
                                float y2 = motionEvent2.getY();
                                if (x == x2 && y == y2) {
                                    z2 = false;
                                }
                                android.view.MotionEvent motionEvent8 = degVar.B;
                                long eventTime = motionEvent8 != null ? motionEvent8.getEventTime() : -1L;
                                long eventTime2 = motionEvent2.getEventTime();
                                if (z2 || eventTime != eventTime2) {
                                    if (pointerId >= 0) {
                                        degVar.W.d(pointerId);
                                    }
                                    degVar.aC.b();
                                }
                            }
                        }
                        if (motionEvent3 != 0) {
                            motionEvent3.recycle();
                        }
                        degVar.B = android.view.MotionEvent.obtainNoHistory(motionEvent2);
                        if (aoopVar.a) {
                            degVar.aj(motionEvent2, 10, motionEvent2.getEventTime(), true);
                        }
                        int iAa = degVar.aa(motionEvent2);
                        android.os.Trace.endSection();
                        if ((iAa & 4) == 0 && aoopVar.a) {
                            degVar.aC.b();
                            degVar.aj(motionEvent2, 9, motionEvent2.getEventTime(), true);
                        }
                        degVar.aj = false;
                        return iAa;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        th = th;
                        android.os.Trace.endSection();
                        throw th;
                    }
                } catch (java.lang.Throwable th4) {
                    th = th4;
                }
            } catch (java.lang.Throwable th5) {
                th = th5;
                java.lang.Throwable th6 = th;
                this.aj = false;
                throw th6;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            java.lang.Throwable th8 = th;
            this.aj = false;
            throw th8;
        }
    }

    private final void ar(defpackage.emx emxVar) {
        defpackage.ems emsVarP = emxVar.P();
        emsVarP.c(this);
        emsVarP.c(this.r);
    }

    private final void as(android.view.ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof defpackage.deg) {
                ((defpackage.deg) childAt).y();
            } else if (childAt instanceof android.view.ViewGroup) {
                as((android.view.ViewGroup) childAt);
            }
        }
    }

    private final void at() {
        if (this.V) {
            getViewTreeObserver().dispatchOnGlobalLayout();
            this.V = false;
        }
    }

    private final void au(defpackage.dbk dbkVar) {
        this.w.j(dbkVar, false);
        defpackage.cfc cfcVarJ = dbkVar.j();
        java.lang.Object[] objArr = cfcVarJ.a;
        int i = cfcVarJ.b;
        for (int i2 = 0; i2 < i; i2++) {
            au((defpackage.dbk) objArr[i2]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a9  */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    private final void av(android.view.ViewStructure viewStructure) {
        defpackage.cnf cnfVar = this.K;
        if (cnfVar != null) {
            defpackage.dik dikVar = cnfVar.a;
            android.view.autofill.AutofillId autofillId = cnfVar.e;
            java.lang.String str = cnfVar.d;
            defpackage.diw diwVar = cnfVar.c;
            defpackage.dbk dbkVar = dikVar.a;
            rt.i(viewStructure, dbkVar, autofillId, str, diwVar);
            defpackage.adq adqVarC = defpackage.adr.c(dbkVar, viewStructure);
            while (adqVarC.g()) {
                java.lang.Object objH = adqVarC.h(adqVarC.b - 1);
                if (objH == null) {
                    defpackage.aooh.h("null cannot be cast to non-null type android.view.ViewStructure");
                }
                android.view.ViewStructure viewStructure2 = (android.view.ViewStructure) objH;
                java.lang.Object objH2 = adqVarC.h(adqVarC.b - 1);
                if (objH2 == null) {
                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsInfo");
                }
                java.util.List listU = ((defpackage.dbk) objH2).u();
                int size = listU.size();
                for (int i = 0; i < size; i++) {
                    defpackage.dbk dbkVar2 = (defpackage.dbk) listU.get(i);
                    if (!dbkVar2.D && dbkVar2.al() && dbkVar2.am()) {
                        defpackage.die dieVarQ = dbkVar2.q();
                        if (dieVarQ != null) {
                            defpackage.adw adwVar = dieVarQ.c;
                            if (defpackage.adw.f(adwVar, defpackage.did.g) || defpackage.adw.f(adwVar, defpackage.did.h) || defpackage.adw.f(adwVar, defpackage.din.r) || defpackage.adw.f(adwVar, defpackage.din.s) || (android.os.Build.VERSION.SDK_INT >= 34 && defpackage.adw.f(adwVar, defpackage.dio.c))) {
                                android.view.ViewStructure viewStructureNewChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                rt.i(viewStructureNewChild, dbkVar2, cnfVar.e, str, diwVar);
                                adqVarC.q(dbkVar2);
                                adqVarC.q(viewStructureNewChild);
                            } else {
                                adqVarC.q(dbkVar2);
                                adqVarC.q(viewStructure2);
                            }
                        } else {
                            adqVarC.q(dbkVar2);
                            adqVarC.q(viewStructure2);
                        }
                    }
                }
            }
        }
        defpackage.cnb cnbVar = this.ac;
        if (cnbVar != null) {
            ?? r0 = cnbVar.c.a;
            if (r0.isEmpty()) {
                return;
            }
            int iAddChildCount = viewStructure.addChildCount(r0.size());
            java.util.Iterator it = r0.entrySet().iterator();
            if (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                int iIntValue = ((java.lang.Number) entry.getKey()).intValue();
                android.view.ViewStructure viewStructureNewChild2 = viewStructure.newChild(iAddChildCount);
                da$.ExternalSyntheticApiModelOutline1.m(viewStructureNewChild2, cnbVar.b, iIntValue);
                viewStructureNewChild2.setId(iIntValue, cnbVar.a.getContext().getPackageName(), null, null);
                da$.ExternalSyntheticApiModelOutline1.m(viewStructureNewChild2, defpackage.den.U(defpackage.cnh.b));
                throw null;
            }
        }
    }

    private final void aw() {
        float[] fArr = this.x;
        defpackage.dfa.a(this, fArr, this.ah, this.ag);
        defpackage.dfd.d(fArr, this.y);
    }

    private final void ax(defpackage.emx emxVar) {
        defpackage.ems emsVarP = emxVar.P();
        emsVarP.d(this.r);
        emsVarP.d(this);
    }

    private final void ay(boolean z) {
        this.l.b(java.lang.Boolean.valueOf(z));
    }

    private final void az(android.content.res.Configuration configuration) {
        android.content.res.Configuration configurationAb = ab();
        if (defpackage.aooh.n(configurationAb, configuration)) {
            return;
        }
        this.aa.b(new android.content.res.Configuration(configuration));
        if (configurationAb.fontScale != configuration.fontScale || configurationAb.densityDpi != configuration.densityDpi) {
            this.T.b(defpackage.dpe.m(getContext().createConfigurationContext(configuration)));
        }
        defpackage.dxe dxeVar = new defpackage.dxe(new defpackage.dxf(aa$.ExternalSyntheticApiModelOutline1.m(configuration)));
        if (defpackage.aooh.n(new defpackage.dxe(new defpackage.dxf(aa$.ExternalSyntheticApiModelOutline1.m(configurationAb))), dxeVar)) {
            return;
        }
        this.ab.b(aC(dxeVar));
    }

    @Override // defpackage.dcv
    public final void A(defpackage.dbk dbkVar, boolean z, boolean z2, boolean z3) {
        defpackage.dbk dbkVarK;
        defpackage.dbk dbkVarK2;
        defpackage.dbw dbwVar = this.w;
        if (!z) {
            if (dbwVar.j(dbkVar, z2) && z3) {
                ai(dbkVar);
                return;
            }
            return;
        }
        if (dbkVar.j == null) {
            defpackage.cwh.d("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iAv = dbkVar.av();
        int i = iAv - 1;
        if (iAv == 0) {
            throw null;
        }
        if (i != 0) {
            if (i == 1) {
                return;
            }
            if (i != 2 && i != 3) {
                if (i != 4) {
                    throw new defpackage.aois();
                }
                if (!dbkVar.aj() || z2) {
                    dbkVar.L();
                    dbkVar.M();
                    if (dbkVar.D) {
                        return;
                    }
                    if ((defpackage.aooh.n(dbkVar.r(), java.lang.Boolean.TRUE) || defpackage.dbw.m(dbkVar)) && ((dbkVarK = dbkVar.k()) == null || !dbkVarK.aj())) {
                        dbwVar.i.bA(dbkVar, 1);
                    } else if ((dbkVar.am() || defpackage.dbw.n(dbkVar)) && ((dbkVarK2 = dbkVar.k()) == null || !dbkVarK2.ak())) {
                        dbwVar.i.bA(dbkVar, 3);
                    }
                    if (dbwVar.c || !z3) {
                        return;
                    }
                    ai(dbkVar);
                    return;
                }
                return;
            }
        }
        dbwVar.f.n(new defpackage.agxg(dbkVar, true, z2));
        wo woVar = dbwVar.h;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021  */
    /* JADX WARN: Code duplicated, block: B:15:0x0027  */
    /* JADX WARN: Code duplicated, block: B:17:0x002d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX WARN: Code duplicated, block: B:22:0x004b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0065 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:38:0x007c  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.dcv
    public final void B(defpackage.dbk dbkVar, boolean z, boolean z2) {
        defpackage.dbw dbwVar = this.w;
        if (!z) {
            int iAv = dbkVar.av();
            int i = iAv - 1;
            if (iAv == 0) {
                throw null;
            }
            if (i == 0 || i == 1 || i == 2 || i == 3) {
                wo woVar = dbwVar.h;
                return;
            }
            if (i != 4) {
                throw new defpackage.aois();
            }
            defpackage.dbk dbkVarK = dbkVar.k();
            boolean z3 = dbkVarK == null || dbkVarK.am();
            if (!z2 && (dbkVar.ak() || (dbkVar.ah() && dbkVar.am() == z3 && dbkVar.am() == dbkVar.an()))) {
                wo woVar2 = dbwVar.h;
                return;
            }
            dbkVar.K();
            if (!dbkVar.D && dbkVar.an() && z3) {
                if (dbkVarK == null || (!dbkVarK.ah() && !dbkVarK.ak())) {
                    dbwVar.i.bA(dbkVar, 4);
                }
                if (dbwVar.c) {
                    return;
                }
                ai(null);
                return;
            }
            return;
        }
        int iAv2 = dbkVar.av();
        int i2 = iAv2 - 1;
        if (iAv2 == 0) {
            throw null;
        }
        if (i2 == 0) {
            if ((dbkVar.aj() && !dbkVar.ai()) || z2) {
                dbkVar.w.e();
                dbkVar.K();
                if (dbkVar.D) {
                    return;
                }
                defpackage.dbk dbkVarK2 = dbkVar.k();
                if (!defpackage.aooh.n(dbkVar.r(), java.lang.Boolean.TRUE) && (dbkVarK2 == null || (!dbkVarK2.aj() && !dbkVarK2.ai()))) {
                    dbwVar.i.bA(dbkVar, 2);
                } else if (dbkVar.am() && (dbkVarK2 == null || (!dbkVarK2.ah() && !dbkVarK2.ak()))) {
                    dbwVar.i.bA(dbkVar, 4);
                }
                if (dbwVar.c) {
                    return;
                }
                ai(null);
                return;
            }
        } else if (i2 != 1) {
            if (i2 == 2) {
                if (dbkVar.aj()) {
                }
                dbkVar.w.e();
                dbkVar.K();
                if (dbkVar.D) {
                    defpackage.dbk dbkVarK3 = dbkVar.k();
                    if (!defpackage.aooh.n(dbkVar.r(), java.lang.Boolean.TRUE)) {
                        if (dbkVar.am()) {
                            dbwVar.i.bA(dbkVar, 4);
                        }
                    } else if (dbkVar.am()) {
                        dbwVar.i.bA(dbkVar, 4);
                    }
                    if (dbwVar.c) {
                        ai(null);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new defpackage.aois();
                }
                if (dbkVar.aj()) {
                }
                dbkVar.w.e();
                dbkVar.K();
                if (dbkVar.D) {
                    defpackage.dbk dbkVarK4 = dbkVar.k();
                    if (!defpackage.aooh.n(dbkVar.r(), java.lang.Boolean.TRUE)) {
                        if (dbkVar.am()) {
                            dbwVar.i.bA(dbkVar, 4);
                        }
                    } else if (dbkVar.am()) {
                        dbwVar.i.bA(dbkVar, 4);
                    }
                    if (dbwVar.c) {
                        ai(null);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        wo woVar3 = dbwVar.h;
    }

    @Override // defpackage.dcv
    public final void C() {
        defpackage.dem demVar = this.q;
        demVar.l = true;
        android.os.Handler handlerN = demVar.n();
        if (demVar.C() && !demVar.p && handlerN != null) {
            demVar.p = true;
            handlerN.post(demVar.q);
        }
        defpackage.cnn cnnVar = this.r;
        cnnVar.b = true;
        android.os.Handler handlerG = cnnVar.g();
        if (!cnnVar.n() || cnnVar.c || handlerG == null) {
            return;
        }
        cnnVar.c = true;
        handlerG.post(cnnVar.d);
    }

    @Override // defpackage.dcv
    public final void D(defpackage.aomy aomyVar) {
        defpackage.adq adqVar = this.aB;
        if (adqVar.e(aomyVar)) {
            return;
        }
        adqVar.q(aomyVar);
    }

    @Override // defpackage.dcv
    public final void E(defpackage.dbk dbkVar) {
        this.w.d.b(dbkVar);
        ai(null);
    }

    @Override // defpackage.dcv
    public final void F(float f) {
        if (ao()) {
            if (f > 0.0f) {
                if (java.lang.Float.isNaN(this.ao) || f > this.ao) {
                    this.ao = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (java.lang.Float.isNaN(this.ap) || f < this.ap) {
                    this.ap = f;
                }
            }
        }
    }

    @Override // defpackage.dcv
    public final /* synthetic */ defpackage.cnb G() {
        return this.ac;
    }

    @Override // defpackage.dcv
    public final defpackage.cou H() {
        return this.F;
    }

    @Override // defpackage.dcv
    public final defpackage.dee I() {
        return this.aA;
    }

    @Override // defpackage.dcv
    public final defpackage.ddu J() {
        return this.e.e;
    }

    @Override // defpackage.dcv
    public final defpackage.deq K() {
        return this.az;
    }

    @Override // defpackage.dcv
    public final void L() {
        this.V = true;
    }

    @Override // defpackage.dcv
    public final dfe M() {
        dfe dfeVar = this.aD;
        if (dfeVar != null) {
            return dfeVar;
        }
        O();
        dfe dfeVar2 = new dfe();
        this.aD = dfeVar2;
        return dfeVar2;
    }

    @Override // defpackage.dcv
    public final defpackage.dez N() {
        return this.e.n;
    }

    @Override // defpackage.dcv
    public final yj O() {
        yj yjVar = this.aE;
        if (yjVar != null) {
            return yjVar;
        }
        aH();
        yj yjVar2 = new yj();
        this.aE = yjVar2;
        return yjVar2;
    }

    @Override // defpackage.dcv
    public final oq P() {
        return this.e.j();
    }

    @Override // defpackage.dcv
    public final wt Q() {
        wt wtVar = this.aF;
        if (wtVar != null) {
            return wtVar;
        }
        wt wtVar2 = new wt();
        this.aF = wtVar2;
        return wtVar2;
    }

    @Override // defpackage.dcv
    public final oq R() {
        defpackage.dfl dflVar = this.e;
        oq oqVar = dflVar.o;
        if (oqVar != null) {
            return oqVar;
        }
        oq oqVar2 = new oq(dflVar.a, (byte[]) null);
        dflVar.o = oqVar2;
        return oqVar2;
    }

    @Override // defpackage.dcv
    public final defpackage.apkl S() {
        return this.N;
    }

    @Override // defpackage.dcv
    public final defpackage.gat T() {
        return (defpackage.gat) this.am.a();
    }

    @Override // defpackage.dcv
    public final defpackage.vx U() {
        return this.e.k();
    }

    @Override // defpackage.dcv
    public final defpackage.kaw V() {
        return this.e.s;
    }

    @Override // defpackage.dcv
    public final defpackage.kaw W() {
        return this.e.t;
    }

    @Override // defpackage.dcv
    public final defpackage.kaw Y() {
        return this.e.u;
    }

    @Override // defpackage.dcv
    public final defpackage.kaw Z() {
        return this.aJ;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final int aa(android.view.MotionEvent motionEvent) throws java.lang.Throwable {
        java.lang.Object obj;
        int iD = 0;
        if (this.aw) {
            this.aw = false;
            defpackage.dfz dfzVar = this.e.i;
            dgo.a.b(new defpackage.cvt(motionEvent.getMetaState()));
        }
        defpackage.cvc cvcVar = this.W;
        wj wjVarF = cvcVar.f(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        if (wjVarF != null) {
            ?? r1 = wjVarF.b;
            int size = r1.size() - 1;
            if (size < 0) {
                obj = null;
                break;
            }
            while (true) {
                int i = size - 1;
                obj = r1.get(size);
                if (((cvo) obj).e) {
                    if (actionMasked != 0) {
                        if (actionMasked == 5) {
                            actionMasked = 5;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (i < 0) {
                    obj = null;
                    break;
                }
                size = i;
            }
            cvo cvoVar = (cvo) obj;
            if (cvoVar != null) {
                this.P = cvoVar.d;
            }
            iD = this.aC.d(wjVarF, this, aF(motionEvent, wjVarF.a));
            wjVarF.c = null;
            if ((actionMasked == 0 || actionMasked == 5) && (iD & 1) == 0) {
                cvcVar.d(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        } else {
            this.aC.c();
        }
        return iD;
    }

    public final android.content.res.Configuration ab() {
        return (android.content.res.Configuration) this.aa.a();
    }

    public final defpackage.deg ac() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    public final dey ad() {
        dey deyVar = this.v;
        if (deyVar != null) {
            return deyVar;
        }
        dey deyVar2 = new dey(getContext());
        addView((android.view.View) deyVar2, -1);
        requestLayout();
        this.v = deyVar2;
        return deyVar2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(java.util.ArrayList arrayList, int i, int i2) {
        defpackage.cpg cpgVar = this.F.c;
        if (!cpgVar.D) {
            return;
        }
        if (!cpgVar.t.D) {
            defpackage.cwh.d("visitSubtreeIf called on an unattached node");
        }
        defpackage.cfc cfcVar = new defpackage.cfc(new defpackage.cmv[16]);
        defpackage.cmv cmvVar = cpgVar.t;
        defpackage.cmv cmvVar2 = cmvVar.x;
        if (cmvVar2 == null) {
            defpackage.cfo.F(cfcVar, cmvVar);
        } else {
            cfcVar.n(cmvVar2);
        }
        while (true) {
            int i3 = cfcVar.b;
            if (i3 == 0) {
                return;
            }
            defpackage.cmv cmvVar3 = (defpackage.cmv) cfcVar.c(i3 - 1);
            if ((cmvVar3.v & 1024) != 0) {
                for (defpackage.cmv cmvVar4 = cmvVar3; cmvVar4 != null && cmvVar4.D; cmvVar4 = cmvVar4.x) {
                    if ((cmvVar4.u & 1024) != 0) {
                        defpackage.cmv cmvVarX = cmvVar4;
                        defpackage.cfc cfcVar2 = null;
                        while (cmvVarX != null) {
                            int i4 = 0;
                            if (cmvVarX instanceof defpackage.cpg) {
                                defpackage.cpg cpgVar2 = (defpackage.cpg) cmvVarX;
                                if (cpgVar2.D && cpgVar2.b().a) {
                                    super.addFocusables(arrayList, i, i2);
                                    if (cpgVar.D) {
                                        if (!cpgVar.t.D) {
                                            defpackage.cwh.d("visitSubtreeIf called on an unattached node");
                                        }
                                        defpackage.cfc cfcVar3 = new defpackage.cfc(new defpackage.cmv[16]);
                                        defpackage.cmv cmvVar5 = cpgVar.t;
                                        defpackage.cmv cmvVar6 = cmvVar5.x;
                                        if (cmvVar6 == null) {
                                            defpackage.cfo.F(cfcVar3, cmvVar5);
                                        } else {
                                            cfcVar3.n(cmvVar6);
                                        }
                                        while (true) {
                                            int i5 = cfcVar3.b;
                                            if (i5 == 0) {
                                                break;
                                            }
                                            defpackage.cmv cmvVar7 = (defpackage.cmv) cfcVar3.c(i5 - 1);
                                            if ((cmvVar7.v & 1024) != 0) {
                                                for (defpackage.cmv cmvVar8 = cmvVar7; cmvVar8 != null && cmvVar8.D; cmvVar8 = cmvVar8.x) {
                                                    if ((cmvVar8.u & 1024) != 0) {
                                                        defpackage.cmv cmvVarX2 = cmvVar8;
                                                        defpackage.cfc cfcVar4 = null;
                                                        while (cmvVarX2 != null) {
                                                            if (cmvVarX2 instanceof defpackage.cpg) {
                                                                defpackage.cpg cpgVar3 = (defpackage.cpg) cmvVarX2;
                                                                if (cpgVar3.D) {
                                                                    cox coxVarB = cpgVar3.b();
                                                                    if (cpgVar3.D && !cpgVar3.a && coxVarB.a) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((cmvVarX2.u & 1024) != 0 && (cmvVarX2 instanceof defpackage.dap)) {
                                                                int i6 = 0;
                                                                for (defpackage.cmv cmvVar9 = ((defpackage.dap) cmvVarX2).F; cmvVar9 != null; cmvVar9 = cmvVar9.x) {
                                                                    if ((cmvVar9.u & 1024) != 0) {
                                                                        i6++;
                                                                        if (i6 == 1) {
                                                                            cmvVarX2 = cmvVar9;
                                                                        } else {
                                                                            if (cfcVar4 == null) {
                                                                                cfcVar4 = new defpackage.cfc(new defpackage.cmv[16]);
                                                                            }
                                                                            if (cmvVarX2 != null) {
                                                                                cfcVar4.n(cmvVarX2);
                                                                            }
                                                                            cfcVar4.n(cmvVar9);
                                                                            cmvVarX2 = null;
                                                                        }
                                                                    }
                                                                }
                                                                if (i6 != 1) {
                                                                }
                                                            }
                                                            cmvVarX2 = defpackage.cfo.x(cfcVar4);
                                                        }
                                                    }
                                                }
                                            }
                                            defpackage.cfo.F(cfcVar3, cmvVar7);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((cmvVarX.u & 1024) != 0 && (cmvVarX instanceof defpackage.dap)) {
                                for (defpackage.cmv cmvVar10 = ((defpackage.dap) cmvVarX).F; cmvVar10 != null; cmvVar10 = cmvVar10.x) {
                                    if ((cmvVar10.u & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            cmvVarX = cmvVar10;
                                        } else {
                                            if (cfcVar2 == null) {
                                                cfcVar2 = new defpackage.cfc(new defpackage.cmv[16]);
                                            }
                                            if (cmvVarX != null) {
                                                cfcVar2.n(cmvVarX);
                                            }
                                            cfcVar2.n(cmvVar10);
                                            cmvVarX = null;
                                        }
                                    }
                                }
                                if (i4 != 1) {
                                }
                            }
                            cmvVarX = defpackage.cfo.x(cfcVar2);
                        }
                    }
                }
            }
            defpackage.cfo.F(cfcVar, cmvVar3);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i) {
        if (view == null) {
            defpackage.aooh.g();
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    public final defpackage.aonn ae() {
        defpackage.aonn aonnVar = this.at;
        if (aonnVar != null) {
            return aonnVar;
        }
        ddx ddxVar = new ddx(this);
        this.at = ddxVar;
        return ddxVar;
    }

    public final void af(int i, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, java.lang.String str) {
        int iD;
        defpackage.dem demVar = this.q;
        if (defpackage.aooh.n(str, demVar.n)) {
            int iD2 = demVar.v.d(i);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        if (!defpackage.aooh.n(str, demVar.o) || (iD = demVar.w.d(i)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iD);
    }

    public final void ag(defpackage.dbk dbkVar) {
        dbkVar.G();
        defpackage.cfc cfcVarJ = dbkVar.j();
        java.lang.Object[] objArr = cfcVarJ.a;
        int i = cfcVarJ.b;
        for (int i2 = 0; i2 < i; i2++) {
            ag((defpackage.dbk) objArr[i2]);
        }
    }

    public final void ah() {
        if (this.aj) {
            return;
        }
        long jCurrentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.ai) {
            this.ai = jCurrentAnimationTimeMillis;
            aw();
            android.view.ViewParent parent = getParent();
            android.view.View view = this;
            while (parent instanceof android.view.ViewGroup) {
                view = (android.view.View) parent;
                parent = ((android.view.ViewGroup) view).getParent();
            }
            int[] iArr = this.ag;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            this.ak = (((long) java.lang.Float.floatToRawIntBits(f - iArr[0])) << 32) | (((long) java.lang.Float.floatToRawIntBits(f2 - iArr[1])) & 4294967295L);
        }
    }

    public final void ai(defpackage.dbk dbkVar) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (dbkVar != null) {
            while (dbkVar != null && dbkVar.aw() == 1) {
                if (!this.ae) {
                    defpackage.dbk dbkVarK = dbkVar.k();
                    if (dbkVarK == null) {
                        break;
                    }
                    long j = dbkVarK.o().d;
                    if (defpackage.dpd.j(j) && defpackage.dpd.i(j)) {
                        break;
                    }
                }
                dbkVar = dbkVar.k();
            }
            if (dbkVar == this.n) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final void aj(android.view.MotionEvent motionEvent, int i, long j, boolean z) throws java.lang.Throwable {
        boolean z2;
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - ((actionIndex ^ (-1)) >>> 31);
        if (pointerCount != 0) {
            boolean z3 = i == 9 || i == 7 || i == 10;
            if (z3 && android.os.Build.VERSION.SDK_INT >= 34 && da$.ExternalSyntheticApiModelOutline0.m(motionEvent) == 3) {
                i2 = 0;
                z2 = true;
            } else {
                z2 = false;
                i2 = 0;
            }
            android.view.MotionEvent.PointerProperties[] pointerPropertiesArr = new android.view.MotionEvent.PointerProperties[pointerCount];
            for (int i3 = i2; i3 < pointerCount; i3++) {
                pointerPropertiesArr[i3] = new android.view.MotionEvent.PointerProperties();
            }
            int i4 = 1;
            android.view.MotionEvent.PointerCoords[] pointerCoordsArr = new android.view.MotionEvent.PointerCoords[pointerCount];
            for (int i5 = i2; i5 < pointerCount; i5++) {
                pointerCoordsArr[i5] = new android.view.MotionEvent.PointerCoords();
            }
            int i6 = i2;
            while (i6 < pointerCount) {
                int i7 = ((actionIndex < 0 || actionIndex > i6) ? i2 : i4) + i6;
                motionEvent.getPointerProperties(i7, pointerPropertiesArr[i6]);
                android.view.MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i6];
                motionEvent.getPointerCoords(i7, pointerCoords);
                long jK = k((((long) java.lang.Float.floatToRawIntBits(pointerCoords.x)) << 32) | (((long) java.lang.Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L));
                pointerCoords.x = java.lang.Float.intBitsToFloat((int) (jK >> 32));
                pointerCoords.y = java.lang.Float.intBitsToFloat((int) (jK & 4294967295L));
                if (z2) {
                    pointerCoords.setAxisValue(50, 0.0f);
                    pointerCoords.setAxisValue(51, 0.0f);
                }
                i6++;
                i2 = 0;
                i4 = 1;
            }
            int buttonState = z ? 0 : motionEvent.getButtonState();
            long downTime = motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime();
            android.view.MotionEvent motionEventA = android.os.Build.VERSION.SDK_INT >= 34 ? dfe.a(downTime, j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), buttonState, motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags(), z3 ? 0 : da$.ExternalSyntheticApiModelOutline0.m(motionEvent)) : android.view.MotionEvent.obtain(downTime, j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), buttonState, motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
            wj wjVarF = this.W.f(motionEventA, this);
            if (wjVarF == null) {
                defpackage.aooh.g();
            }
            this.aC.d(wjVarF, this, true);
            motionEventA.recycle();
        }
    }

    public final void ak(defpackage.dfl dflVar) {
        defpackage.dfl dflVar2 = this.e;
        if (dflVar != dflVar2) {
            if (isAttachedToWindow()) {
                dflVar2.f();
                dflVar.g();
                if (dflVar.b() != dflVar2.b()) {
                    ax(dflVar2.b());
                    ar(dflVar.b());
                }
            }
            this.e = dflVar;
            this.j = dflVar.a().d();
            this.f = new dec(dflVar.a());
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [cer, java.lang.Object] */
    public final boolean am() {
        defpackage.ipc ipcVar;
        if (android.os.Build.VERSION.SDK_INT >= 31 && (ipcVar = this.aG) != null && ((java.lang.Boolean) ipcVar.a.a()).booleanValue()) {
            return true;
        }
        for (android.view.ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof defpackage.deg) {
                return ((defpackage.deg) parent).am();
            }
        }
        return false;
    }

    @Override // defpackage.dcv
    /* JADX INFO: renamed from: ap, reason: merged with bridge method [inline-methods] */
    public final defpackage.kaw X() {
        defpackage.kaw kawVar = this.aI;
        if (kawVar == null) {
            kawVar = new defpackage.kaw(true != isInTouchMode() ? 2 : 1);
            this.aI = kawVar;
        }
        return kawVar;
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.util.Map] */
    @Override // android.view.View
    public final void autofill(android.util.SparseArray sparseArray) {
        defpackage.die dieVarQ;
        defpackage.aonj aonjVar;
        defpackage.aonj aonjVar2;
        defpackage.cnf cnfVar = this.K;
        if (cnfVar != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = sparseArray.keyAt(i);
                android.view.autofill.AutofillValue autofillValueM = da$.ExternalSyntheticApiModelOutline1.m(sparseArray.get(iKeyAt));
                defpackage.dbk dbkVar = (defpackage.dbk) cnfVar.a.b.a(iKeyAt);
                if (dbkVar != null && (dieVarQ = dbkVar.q()) != null) {
                    defpackage.dhr dhrVar = (defpackage.dhr) dieVarQ.g(defpackage.did.g);
                    if (dhrVar != null && (aonjVar2 = (defpackage.aonj) dhrVar.b) != null) {
                    }
                    defpackage.dhr dhrVar2 = (defpackage.dhr) dieVarQ.g(defpackage.did.h);
                    if (dhrVar2 != null && (aonjVar = (defpackage.aonj) dhrVar2.b) != null) {
                    }
                }
            }
        }
        defpackage.cnb cnbVar = this.ac;
        if (cnbVar != null) {
            ?? r9 = cnbVar.c.a;
            if (r9.isEmpty()) {
                return;
            }
            int size2 = sparseArray.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int iKeyAt2 = sparseArray.keyAt(i2);
                android.view.autofill.AutofillValue autofillValueM2 = da$.ExternalSyntheticApiModelOutline1.m(sparseArray.get(iKeyAt2));
                if (da$.ExternalSyntheticApiModelOutline1.m(autofillValueM2)) {
                    da$.ExternalSyntheticApiModelOutline1.m(autofillValueM2).toString();
                    if (((cng) r9.get(java.lang.Integer.valueOf(iKeyAt2))) != null) {
                        throw null;
                    }
                } else {
                    if (da$.ExternalSyntheticApiModelOutline1.m$1(autofillValueM2)) {
                        throw new defpackage.aoit("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (da$.ExternalSyntheticApiModelOutline1.m$2(autofillValueM2)) {
                        throw new defpackage.aoit("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (aa$.ExternalSyntheticApiModelOutline0.m(autofillValueM2)) {
                        throw new defpackage.aoit("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.q.A(false, i, this.P);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.q.A(true, i, this.P);
    }

    @Override // defpackage.coq
    public final void dA(defpackage.cpg cpgVar, defpackage.cpg cpgVar2) {
        int i;
        defpackage.dce dceVar;
        boolean z;
        defpackage.dce dceVar2;
        boolean z2;
        if (cpgVar != null) {
            if (!cpgVar.t.D) {
                defpackage.cwh.d("visitAncestors called on an unattached node");
            }
            defpackage.cmv cmvVar = cpgVar.t;
            defpackage.dbk dbkVarA = defpackage.cfo.A(cpgVar);
            defpackage.ady adyVar = null;
            java.util.ArrayList arrayList = null;
            while (true) {
                if (dbkVarA == null) {
                    break;
                }
                if ((dbkVarA.v.f.v & 2097152) != 0) {
                    while (cmvVar != null) {
                        if ((cmvVar.u & 2097152) != 0) {
                            defpackage.cmv cmvVarX = cmvVar;
                            defpackage.cfc cfcVar = null;
                            while (cmvVarX != null) {
                                if (cmvVarX instanceof defpackage.cug) {
                                    if (arrayList == null) {
                                        arrayList = new java.util.ArrayList();
                                    }
                                    arrayList.add(cmvVarX);
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2 && (cmvVarX.u & 2097152) != 0 && (cmvVarX instanceof defpackage.dap)) {
                                    int i2 = 0;
                                    for (defpackage.cmv cmvVar2 = ((defpackage.dap) cmvVarX).F; cmvVar2 != null; cmvVar2 = cmvVar2.x) {
                                        if ((cmvVar2.u & 2097152) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cmvVarX = cmvVar2;
                                            } else {
                                                if (cfcVar == null) {
                                                    cfcVar = new defpackage.cfc(new defpackage.cmv[16]);
                                                }
                                                if (cmvVarX != null) {
                                                    cfcVar.n(cmvVarX);
                                                }
                                                cfcVar.n(cmvVar2);
                                                cmvVarX = null;
                                            }
                                        }
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                cmvVarX = defpackage.cfo.x(cfcVar);
                            }
                        }
                        cmvVar = cmvVar.w;
                    }
                }
                dbkVarA = dbkVarA.k();
                cmvVar = (dbkVarA == null || (dceVar2 = dbkVarA.v) == null) ? null : dceVar2.e;
            }
            if (arrayList != null) {
                if (cpgVar2 != null) {
                    if (!cpgVar2.t.D) {
                        defpackage.cwh.d("visitAncestors called on an unattached node");
                    }
                    defpackage.cmv cmvVar3 = cpgVar2.t;
                    defpackage.dbk dbkVarA2 = defpackage.cfo.A(cpgVar2);
                    defpackage.ady adyVar2 = null;
                    while (dbkVarA2 != null) {
                        if ((dbkVarA2.v.f.v & 2097152) != 0) {
                            while (cmvVar3 != null) {
                                if ((cmvVar3.u & 2097152) != 0) {
                                    defpackage.cmv cmvVarX2 = cmvVar3;
                                    defpackage.cfc cfcVar2 = null;
                                    while (cmvVarX2 != null) {
                                        if (cmvVarX2 instanceof defpackage.cug) {
                                            if (adyVar2 == null) {
                                                defpackage.ady adyVar3 = defpackage.adz.a;
                                                adyVar2 = new defpackage.ady(6);
                                            }
                                            adyVar2.j(cmvVarX2);
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                        if (z && (cmvVarX2.u & 2097152) != 0 && (cmvVarX2 instanceof defpackage.dap)) {
                                            int i3 = 0;
                                            for (defpackage.cmv cmvVar4 = ((defpackage.dap) cmvVarX2).F; cmvVar4 != null; cmvVar4 = cmvVar4.x) {
                                                if ((cmvVar4.u & 2097152) != 0) {
                                                    i3++;
                                                    if (i3 == 1) {
                                                        cmvVarX2 = cmvVar4;
                                                    } else {
                                                        if (cfcVar2 == null) {
                                                            cfcVar2 = new defpackage.cfc(new defpackage.cmv[16]);
                                                        }
                                                        if (cmvVarX2 != null) {
                                                            cfcVar2.n(cmvVarX2);
                                                        }
                                                        cfcVar2.n(cmvVar4);
                                                        cmvVarX2 = null;
                                                    }
                                                }
                                            }
                                            if (i3 != 1) {
                                            }
                                        }
                                        cmvVarX2 = defpackage.cfo.x(cfcVar2);
                                    }
                                }
                                cmvVar3 = cmvVar3.w;
                            }
                        }
                        dbkVarA2 = dbkVarA2.k();
                        cmvVar3 = (dbkVarA2 == null || (dceVar = dbkVarA2.v) == null) ? null : dceVar.e;
                    }
                    adyVar = adyVar2;
                }
                int size = arrayList.size();
                for (i = 0; i < size; i++) {
                    defpackage.cug cugVar = (defpackage.cug) arrayList.get(i);
                    if (adyVar == null || !adyVar.a(cugVar)) {
                        cugVar.H();
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [cqf, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(android.graphics.Canvas canvas) {
        if (!isAttachedToWindow()) {
            ag(this.n);
        }
        w(true);
        defpackage.ckw.b().e();
        this.s = true;
        android.os.Trace.beginSection("AndroidOwner:draw");
        try {
            ?? r0 = this.e.v.a;
            android.graphics.Canvas canvas2 = ((defpackage.cpq) r0).a;
            ((defpackage.cpq) r0).a = canvas;
            this.n.A(r0, null);
            ((defpackage.cpq) r0).a = canvas2;
            defpackage.adq adqVar = this.I;
            if (adqVar.g()) {
                int i = adqVar.b;
                for (int i2 = 0; i2 < i; i2++) {
                    ((defpackage.dct) adqVar.c(i2)).h();
                }
            }
            int i3 = defpackage.dgm.b;
            adqVar.l();
            this.s = false;
            android.os.Trace.endSection();
            defpackage.adq adqVar2 = this.J;
            if (adqVar2 != null) {
                this.I.r(adqVar2);
                adqVar2.l();
            }
            if (ao()) {
                if (java.lang.Float.compare(this.ao, this.aq) != 0) {
                    float f = this.ao;
                    this.aq = f;
                    defpackage.dff.a(this, f);
                }
                android.view.View view = this.U;
                if (view != null) {
                    if (java.lang.Float.compare(this.ap, this.ar) != 0) {
                        float f2 = this.ap;
                        this.ar = f2;
                        defpackage.dff.a(view, f2);
                    }
                    if (!java.lang.Float.isNaN(this.ap)) {
                        view.invalidate();
                        drawChild(canvas, view, getDrawingTime());
                    }
                }
                this.ao = Float.NaN;
                this.ap = Float.NaN;
            }
        } catch (java.lang.Throwable th) {
            android.os.Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:206:0x0324  */
    /* JADX WARN: Code duplicated, block: B:207:0x034b  */
    /* JADX WARN: Code duplicated, block: B:212:0x0364  */
    /* JADX WARN: Code duplicated, block: B:215:0x036c  */
    /* JADX WARN: Code duplicated, block: B:217:0x037f  */
    /* JADX WARN: Code duplicated, block: B:235:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:376:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:382:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:385:0x05de  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [cmv] */
    /* JADX WARN: Type inference failed for: r4v30, types: [cmv] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v52, types: [cmv] */
    /* JADX WARN: Type inference failed for: r4v53, types: [cmv] */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38, types: [cfc] */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v67 */
    /* JADX WARN: Type inference failed for: r6v68 */
    /* JADX WARN: Type inference failed for: r6v69, types: [cfc] */
    /* JADX WARN: Type inference failed for: r6v70 */
    /* JADX WARN: Type inference failed for: r6v71 */
    /* JADX WARN: Type inference failed for: r6v72, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v73 */
    /* JADX WARN: Type inference failed for: r6v74 */
    /* JADX WARN: Type inference failed for: r6v75 */
    /* JADX WARN: Type inference failed for: r6v76 */
    /* JADX WARN: Type inference failed for: r6v77 */
    /* JADX WARN: Type inference failed for: r6v90 */
    /* JADX WARN: Type inference failed for: r6v91 */
    /* JADX WARN: Type inference failed for: r6v92 */
    /* JADX WARN: Type inference failed for: r6v93 */
    /* JADX WARN: Type inference failed for: r6v94 */
    /* JADX WARN: Type inference failed for: r6v95 */
    /* JADX WARN: Type inference failed for: r6v96 */
    /* JADX WARN: Type inference failed for: r6v97 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v40, types: [cfc] */
    /* JADX WARN: Type inference failed for: r7v59 */
    /* JADX WARN: Type inference failed for: r7v62 */
    /* JADX WARN: Type inference failed for: r7v63 */
    /* JADX WARN: Type inference failed for: r7v64 */
    /* JADX WARN: Type inference failed for: r7v65, types: [cfc] */
    /* JADX WARN: Type inference failed for: r7v67 */
    /* JADX WARN: Type inference failed for: r7v68 */
    /* JADX WARN: Type inference failed for: r7v69 */
    /* JADX WARN: Type inference failed for: r7v70 */
    /* JADX WARN: Type inference failed for: r7v71 */
    /* JADX WARN: Type inference failed for: r7v72 */
    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent motionEvent) {
        int i;
        int i2;
        alic alicVar;
        long j;
        long eventTime;
        float pressure;
        long eventTime2;
        long jFloatToRawIntBits;
        ?? r30;
        cuf cufVar;
        defpackage.cug cugVar;
        defpackage.dce dceVar;
        boolean z;
        ?? r4;
        defpackage.dce dceVar2;
        ?? r6;
        ?? X;
        defpackage.cug cugVar2;
        boolean z2;
        int size;
        int size2;
        defpackage.dce dceVar3;
        boolean z3;
        ?? r5;
        defpackage.dce dceVar4;
        ?? r7;
        ?? X2;
        defpackage.dfw dfwVar;
        int action;
        android.view.GestureDetector gestureDetector;
        defpackage.dea deaVar;
        int size3;
        defpackage.dce dceVar5;
        boolean z4;
        defpackage.cmv cmvVarX;
        defpackage.dce dceVar6;
        boolean z5 = false;
        if (this.D) {
            java.lang.Runnable runnable = this.as;
            removeCallbacks(runnable);
            if (motionEvent.getActionMasked() == 8) {
                this.D = false;
            } else {
                runnable.run();
            }
        }
        if (aE(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        byte b2 = -1;
        int i3 = 16;
        int i4 = 1;
        if (motionEvent.getActionMasked() != 8) {
            if (!motionEvent.isFromSource(2097152)) {
                return super.dispatchGenericMotionEvent(motionEvent);
            }
            defpackage.cvc cvcVar = this.W;
            int actionMasked = motionEvent.getActionMasked();
            cvcVar.c(motionEvent);
            if (actionMasked == 3) {
                cvcVar.a.clear();
                cvcVar.b.clear();
                i = 16;
                alicVar = null;
            } else {
                cvcVar.b(motionEvent);
                int actionIndex = actionMasked != 1 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
                boolean z6 = actionMasked == 0 || actionMasked == 2 || actionMasked == 5;
                int pointerCount = motionEvent.getPointerCount();
                java.util.ArrayList arrayList = new java.util.ArrayList(pointerCount);
                int i5 = 0;
                while (i5 < pointerCount) {
                    byte b3 = b2;
                    int i6 = pointerCount;
                    long jA = cvcVar.a(motionEvent.getPointerId(i5));
                    float x = motionEvent.getX(i5);
                    float y = motionEvent.getY(i5);
                    int i7 = i3;
                    long jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(x);
                    int i8 = i4;
                    boolean z7 = z6;
                    long jFloatToRawIntBits3 = java.lang.Float.floatToRawIntBits(y);
                    ?? r24 = i5 != actionIndex ? i8 : z5;
                    defpackage.adb adbVar = cvcVar.c;
                    cvb cvbVar = (cvb) adbVar.d(jA);
                    long j2 = (jFloatToRawIntBits2 << 32) | (jFloatToRawIntBits3 & 4294967295L);
                    if (i5 == actionIndex) {
                        adbVar.h(jA);
                    } else {
                        if (z7) {
                            j = 1;
                            adbVar.g(jA, new cvb(((motionEvent.getEventTime() & 2147483647L) << i8) | 1 | (((long) ((((short) java.lang.Float.intBitsToFloat((int) (j2 >> 32))) << 16) | ((char) ((short) java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)))))) << 32)));
                        }
                        eventTime = motionEvent.getEventTime();
                        long j3 = j;
                        pressure = motionEvent.getPressure(i5);
                        if (cvbVar != null) {
                            eventTime2 = (cvbVar.a >> i8) & 2147483647L;
                            int i9 = (int) (cvbVar.a >>> 32);
                            jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(i9 >> 16)) << 32) | (((long) java.lang.Float.floatToRawIntBits((short) ((char) i9))) & 4294967295L);
                        } else {
                            eventTime2 = motionEvent.getEventTime();
                            jFloatToRawIntBits = j2;
                        }
                        if (cvbVar != null || (cvbVar.a & j3) == 0) {
                            r30 = 0;
                        } else {
                            r30 = i8;
                        }
                        if (motionEvent.getHistorySize() > 0) {
                            cufVar = new cuf(jA, eventTime, j2, (boolean) r24, pressure, eventTime2, jFloatToRawIntBits, (boolean) r30, new cuh(motionEvent, i5));
                        } else {
                            cufVar = new cuf(jA, eventTime, j2, (boolean) r24, pressure, eventTime2, jFloatToRawIntBits, (boolean) r30);
                        }
                        arrayList.add(cufVar);
                        i5++;
                        b2 = b3;
                        pointerCount = i6;
                        i3 = i7;
                        i4 = i8;
                        z6 = z7;
                        cvcVar = cvcVar;
                        z5 = false;
                    }
                    j = 1;
                    eventTime = motionEvent.getEventTime();
                    long j4 = j;
                    pressure = motionEvent.getPressure(i5);
                    if (cvbVar != null) {
                        eventTime2 = (cvbVar.a >> i8) & 2147483647L;
                        int i10 = (int) (cvbVar.a >>> 32);
                        jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(i10 >> 16)) << 32) | (((long) java.lang.Float.floatToRawIntBits((short) ((char) i10))) & 4294967295L);
                    } else {
                        eventTime2 = motionEvent.getEventTime();
                        jFloatToRawIntBits = j2;
                    }
                    if (cvbVar != null) {
                        r30 = 0;
                    } else {
                        r30 = 0;
                    }
                    if (motionEvent.getHistorySize() > 0) {
                        cufVar = new cuf(jA, eventTime, j2, (boolean) r24, pressure, eventTime2, jFloatToRawIntBits, (boolean) r30, new cuh(motionEvent, i5));
                    } else {
                        cufVar = new cuf(jA, eventTime, j2, (boolean) r24, pressure, eventTime2, jFloatToRawIntBits, (boolean) r30);
                    }
                    arrayList.add(cufVar);
                    i5++;
                    b2 = b3;
                    pointerCount = i6;
                    i3 = i7;
                    i4 = i8;
                    z6 = z7;
                    cvcVar = cvcVar;
                    z5 = false;
                }
                i = i3;
                int i11 = i4;
                cvcVar.e(motionEvent);
                if (!motionEvent.isFromSource(2097152)) {
                    throw new java.lang.IllegalArgumentException("MotionEvent must be a touch navigation source");
                }
                android.view.InputDevice device = motionEvent.getDevice();
                if (device != null) {
                    android.view.InputDevice.MotionRange motionRange = device.getMotionRange(0);
                    android.view.InputDevice.MotionRange motionRange2 = device.getMotionRange(i11);
                    if (motionRange == null || motionRange2 != null) {
                        if (motionRange2 == null || motionRange != null) {
                            if (motionRange != null) {
                                float range = motionRange.getRange();
                                float range2 = motionRange2.getRange();
                                if (range > range2 && (range2 == 0.0f || range / range2 >= 5.0f)) {
                                    i2 = 1;
                                } else if (range2 <= range || (range != 0.0f && range2 / range < 5.0f)) {
                                }
                            }
                            i2 = 0;
                        }
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                } else {
                    i2 = 0;
                }
                alicVar = new alic(arrayList, i2, motionEvent);
            }
            defpackage.cou couVar = this.F;
            if (alicVar != null) {
                if (!couVar.d.a) {
                    defpackage.cpg cpgVarB = couVar.b();
                    if (cpgVarB != null) {
                        if (!cpgVarB.t.D) {
                            defpackage.cwh.d("visitAncestors called on an unattached node");
                        }
                        defpackage.cmv cmvVar = cpgVarB.t;
                        defpackage.dbk dbkVarA = defpackage.cfo.A(cpgVarB);
                        loop14: while (true) {
                            if (dbkVarA == null) {
                                r5 = 0;
                                break;
                            }
                            int i12 = 2097152;
                            if ((dbkVarA.v.f.v & 2097152) != 0) {
                                while (cmvVar != null) {
                                    if ((cmvVar.u & i12) != 0) {
                                        r5 = cmvVar;
                                        ?? r8 = 0;
                                        while (r5 != 0) {
                                            if (r5 instanceof defpackage.cug) {
                                                break loop14;
                                            }
                                            if ((r5.u & i12) == 0 || !(r5 instanceof defpackage.dap)) {
                                                r7 = r8;
                                                r7 = r8;
                                                r7 = r8;
                                                X2 = defpackage.cfo.x(r7);
                                            } else {
                                                defpackage.cmv cmvVar2 = ((defpackage.dap) r5).F;
                                                ?? cfcVar = r8;
                                                ?? r9 = r5;
                                                int i13 = 0;
                                                while (cmvVar2 != null) {
                                                    if ((cmvVar2.u & i12) != 0) {
                                                        i13++;
                                                        if (i13 == 1) {
                                                            r7 = r8;
                                                            r7 = r8;
                                                            cfcVar = cfcVar;
                                                            r9 = cmvVar2;
                                                        } else {
                                                            if (cfcVar == 0) {
                                                                cfcVar = new defpackage.cfc(new defpackage.cmv[i]);
                                                            }
                                                            if (r9 != 0) {
                                                                cfcVar.n(r9);
                                                            }
                                                            cfcVar.n(cmvVar2);
                                                            r9 = 0;
                                                        }
                                                    } else {
                                                        r7 = r8;
                                                        r7 = r8;
                                                    }
                                                    cmvVar2 = cmvVar2.x;
                                                    i12 = 2097152;
                                                    i = 16;
                                                    r9 = r9;
                                                    cfcVar = cfcVar;
                                                }
                                                r7 = r8;
                                                r7 = r8;
                                                if (i13 != 1) {
                                                    r7 = cfcVar;
                                                    r7 = r8;
                                                    r7 = r8;
                                                    r7 = r8;
                                                    X2 = defpackage.cfo.x(r7);
                                                } else {
                                                    X2 = r9;
                                                    r7 = cfcVar;
                                                }
                                            }
                                            i12 = 2097152;
                                            i = 16;
                                            r5 = X2;
                                            r8 = r7;
                                        }
                                    }
                                    cmvVar = cmvVar.w;
                                    i12 = 2097152;
                                    i = 16;
                                }
                            }
                            dbkVarA = dbkVarA.k();
                            cmvVar = (dbkVarA == null || (dceVar4 = dbkVarA.v) == null) ? null : dceVar4.e;
                            i = 16;
                        }
                        cugVar2 = (defpackage.cug) r5;
                    } else {
                        cugVar2 = null;
                    }
                    if (cugVar2 != null) {
                        if (!cugVar2.L().D) {
                            defpackage.cwh.d("visitAncestors called on an unattached node");
                        }
                        defpackage.cmv cmvVar3 = cugVar2.L().w;
                        defpackage.dbk dbkVarA2 = defpackage.cfo.A(cugVar2);
                        java.util.ArrayList arrayList2 = null;
                        while (dbkVarA2 != null) {
                            int i14 = 2097152;
                            if ((dbkVarA2.v.f.v & 2097152) != 0) {
                                while (cmvVar3 != null) {
                                    if ((cmvVar3.u & i14) != 0) {
                                        defpackage.cmv cmvVarX2 = cmvVar3;
                                        defpackage.cfc cfcVar2 = null;
                                        while (cmvVarX2 != null) {
                                            if (cmvVarX2 instanceof defpackage.cug) {
                                                if (arrayList2 == null) {
                                                    arrayList2 = new java.util.ArrayList();
                                                }
                                                arrayList2.add(cmvVarX2);
                                                z3 = false;
                                            } else {
                                                z3 = true;
                                            }
                                            if (z3) {
                                                int i15 = 2097152;
                                                if ((cmvVarX2.u & 2097152) != 0 && (cmvVarX2 instanceof defpackage.dap)) {
                                                    defpackage.cmv cmvVar4 = ((defpackage.dap) cmvVarX2).F;
                                                    defpackage.cfc cfcVar3 = cfcVar2;
                                                    defpackage.cmv cmvVar5 = cmvVarX2;
                                                    int i16 = 0;
                                                    while (cmvVar4 != null) {
                                                        if ((cmvVar4.u & i15) != 0) {
                                                            i16++;
                                                            if (i16 == 1) {
                                                                cmvVar5 = cmvVar4;
                                                            } else {
                                                                if (cfcVar3 == null) {
                                                                    cfcVar3 = new defpackage.cfc(new defpackage.cmv[16]);
                                                                }
                                                                if (cmvVar5 != null) {
                                                                    cfcVar3.n(cmvVar5);
                                                                }
                                                                cfcVar3.n(cmvVar4);
                                                                cmvVar5 = null;
                                                            }
                                                        }
                                                        cmvVar4 = cmvVar4.x;
                                                        i15 = 2097152;
                                                    }
                                                    if (i16 != 1) {
                                                        cfcVar2 = cfcVar3;
                                                    } else {
                                                        cmvVarX2 = cmvVar5;
                                                        cfcVar2 = cfcVar3;
                                                    }
                                                }
                                            }
                                            cmvVarX2 = defpackage.cfo.x(cfcVar2);
                                        }
                                    }
                                    cmvVar3 = cmvVar3.w;
                                    i14 = 2097152;
                                }
                            }
                            dbkVarA2 = dbkVarA2.k();
                            cmvVar3 = (dbkVarA2 == null || (dceVar3 = dbkVarA2.v) == null) ? null : dceVar3.e;
                        }
                        if (arrayList2 != null && (size2 = arrayList2.size() - 1) >= 0) {
                            while (true) {
                                int i17 = size2 - 1;
                                ((defpackage.cug) arrayList2.get(size2)).F(alicVar, cvg.a);
                                if (i17 < 0) {
                                    break;
                                }
                                size2 = i17;
                            }
                        }
                        cugVar2.F(alicVar, cvg.a);
                        cvg cvgVar = cvg.b;
                        cugVar2.F(alicVar, cvgVar);
                        if (arrayList2 != null) {
                            int size4 = arrayList2.size();
                            for (int i18 = 0; i18 < size4; i18++) {
                                ((defpackage.cug) arrayList2.get(i18)).F(alicVar, cvgVar);
                            }
                        }
                        if (arrayList2 != null && (size = arrayList2.size() - 1) >= 0) {
                            while (true) {
                                int i19 = size - 1;
                                ((defpackage.cug) arrayList2.get(size)).F(alicVar, cvg.c);
                                if (i19 < 0) {
                                    break;
                                }
                                size = i19;
                            }
                        }
                        cugVar2.F(alicVar, cvg.c);
                    }
                    ?? r1 = alicVar.c;
                    int size5 = r1.size();
                    int i20 = 0;
                    while (true) {
                        if (i20 < size5) {
                            if (((cuf) r1.get(i20)).g) {
                                z2 = true;
                                break;
                            }
                            i20++;
                        }
                    }
                    dfwVar = this.au;
                    android.view.MotionEvent motionEvent2 = (android.view.MotionEvent) alicVar.b;
                    action = motionEvent2.getAction();
                    if (action != 0) {
                        dfwVar.c = alicVar.a;
                        dfwVar.d = false;
                    } else if ((action != 1 || action == 2) && z2) {
                        dfwVar.a();
                    }
                    gestureDetector = dfwVar.e;
                    if (gestureDetector == null) {
                        android.view.View view = dfwVar.a;
                        android.view.GestureDetector gestureDetector2 = new android.view.GestureDetector(view.getContext(), dfwVar.f, view.getHandler());
                        dfwVar.e = gestureDetector2;
                        gestureDetector = gestureDetector2;
                    }
                    gestureDetector.onTouchEvent(motionEvent2);
                    return true;
                }
                java.lang.System.out.println((java.lang.Object) "FocusRelatedWarning: Dispatching indirect pointer event while the focus system is invalidated.");
                z2 = false;
                dfwVar = this.au;
                android.view.MotionEvent motionEvent3 = (android.view.MotionEvent) alicVar.b;
                action = motionEvent3.getAction();
                if (action != 0) {
                    dfwVar.c = alicVar.a;
                    dfwVar.d = false;
                } else if (action != 1) {
                    dfwVar.a();
                } else {
                    dfwVar.a();
                }
                gestureDetector = dfwVar.e;
                if (gestureDetector == null) {
                    android.view.View view2 = dfwVar.a;
                    android.view.GestureDetector gestureDetector3 = new android.view.GestureDetector(view2.getContext(), dfwVar.f, view2.getHandler());
                    dfwVar.e = gestureDetector3;
                    gestureDetector = gestureDetector3;
                }
                gestureDetector.onTouchEvent(motionEvent3);
                return true;
            }
            defpackage.cpg cpgVarB2 = couVar.b();
            if (cpgVarB2 != null) {
                if (!cpgVarB2.t.D) {
                    defpackage.cwh.d("visitAncestors called on an unattached node");
                }
                defpackage.cmv cmvVar6 = cpgVarB2.t;
                defpackage.dbk dbkVarA3 = defpackage.cfo.A(cpgVarB2);
                loop26: while (true) {
                    if (dbkVarA3 == null) {
                        r4 = 0;
                        break;
                    }
                    int i21 = 2097152;
                    if ((dbkVarA3.v.f.v & 2097152) != 0) {
                        while (cmvVar6 != null) {
                            if ((cmvVar6.u & i21) != 0) {
                                r4 = cmvVar6;
                                ?? r10 = 0;
                                while (r4 != 0) {
                                    if (r4 instanceof defpackage.cug) {
                                        break loop26;
                                    }
                                    if ((r4.u & i21) == 0 || !(r4 instanceof defpackage.dap)) {
                                        r6 = r10;
                                        r6 = r10;
                                        r6 = r10;
                                        X = defpackage.cfo.x(r6);
                                    } else {
                                        defpackage.cmv cmvVar7 = ((defpackage.dap) r4).F;
                                        ?? cfcVar4 = r10;
                                        ?? r11 = r4;
                                        int i22 = 0;
                                        while (cmvVar7 != null) {
                                            if ((cmvVar7.u & i21) != 0) {
                                                i22++;
                                                if (i22 == 1) {
                                                    r6 = r10;
                                                    r6 = r10;
                                                    cfcVar4 = cfcVar4;
                                                    r11 = cmvVar7;
                                                } else {
                                                    if (cfcVar4 == 0) {
                                                        cfcVar4 = new defpackage.cfc(new defpackage.cmv[16]);
                                                    }
                                                    if (r11 != 0) {
                                                        cfcVar4.n(r11);
                                                    }
                                                    cfcVar4.n(cmvVar7);
                                                    r11 = 0;
                                                }
                                            } else {
                                                r6 = r10;
                                                r6 = r10;
                                            }
                                            cmvVar7 = cmvVar7.x;
                                            i21 = 2097152;
                                            r11 = r11;
                                            cfcVar4 = cfcVar4;
                                        }
                                        r6 = r10;
                                        r6 = r10;
                                        if (i22 != 1) {
                                            r6 = cfcVar4;
                                            r6 = r10;
                                            r6 = r10;
                                            r6 = r10;
                                            X = defpackage.cfo.x(r6);
                                        } else {
                                            X = r11;
                                            r6 = cfcVar4;
                                        }
                                    }
                                    i21 = 2097152;
                                    r4 = X;
                                    r10 = r6;
                                }
                            }
                            cmvVar6 = cmvVar6.w;
                            i21 = 2097152;
                        }
                    }
                    dbkVarA3 = dbkVarA3.k();
                    cmvVar6 = (dbkVarA3 == null || (dceVar2 = dbkVarA3.v) == null) ? null : dceVar2.e;
                }
                cugVar = (defpackage.cug) r4;
            } else {
                cugVar = null;
            }
            if (cugVar != null) {
                if (!cugVar.L().D) {
                    defpackage.cwh.d("visitAncestors called on an unattached node");
                }
                defpackage.cmv cmvVar8 = cugVar.L().w;
                defpackage.dbk dbkVarA4 = defpackage.cfo.A(cugVar);
                java.util.ArrayList arrayList3 = null;
                while (dbkVarA4 != null) {
                    int i23 = 2097152;
                    if ((dbkVarA4.v.f.v & 2097152) != 0) {
                        while (cmvVar8 != null) {
                            if ((cmvVar8.u & i23) != 0) {
                                defpackage.cmv cmvVarX3 = cmvVar8;
                                defpackage.cfc cfcVar5 = null;
                                while (cmvVarX3 != null) {
                                    if (cmvVarX3 instanceof defpackage.cug) {
                                        if (arrayList3 == null) {
                                            arrayList3 = new java.util.ArrayList();
                                        }
                                        arrayList3.add(cmvVarX3);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (cmvVarX3.u & 2097152) != 0 && (cmvVarX3 instanceof defpackage.dap)) {
                                        defpackage.cfc cfcVar6 = cfcVar5;
                                        defpackage.cmv cmvVar9 = cmvVarX3;
                                        int i24 = 0;
                                        for (defpackage.cmv cmvVar10 = ((defpackage.dap) cmvVarX3).F; cmvVar10 != null; cmvVar10 = cmvVar10.x) {
                                            if ((cmvVar10.u & 2097152) != 0) {
                                                i24++;
                                                if (i24 == 1) {
                                                    cmvVar9 = cmvVar10;
                                                } else {
                                                    if (cfcVar6 == null) {
                                                        cfcVar6 = new defpackage.cfc(new defpackage.cmv[16]);
                                                    }
                                                    if (cmvVar9 != null) {
                                                        cfcVar6.n(cmvVar9);
                                                    }
                                                    cfcVar6.n(cmvVar10);
                                                    cmvVar9 = null;
                                                }
                                            }
                                        }
                                        if (i24 != 1) {
                                            cfcVar5 = cfcVar6;
                                        } else {
                                            cmvVarX3 = cmvVar9;
                                            cfcVar5 = cfcVar6;
                                        }
                                    }
                                    cmvVarX3 = defpackage.cfo.x(cfcVar5);
                                }
                            }
                            i23 = 2097152;
                            cmvVar8 = cmvVar8.w;
                        }
                    }
                    dbkVarA4 = dbkVarA4.k();
                    cmvVar8 = (dbkVarA4 == null || (dceVar = dbkVarA4.v) == null) ? null : dceVar.e;
                }
                i4 = 1;
                cugVar.H();
                if (arrayList3 != null) {
                    int size6 = arrayList3.size();
                    for (int i25 = 0; i25 < size6; i25++) {
                        ((defpackage.cug) arrayList3.get(i25)).H();
                    }
                }
            } else {
                i4 = 1;
            }
            this.au.a();
        } else if (motionEvent.isFromSource(4194304)) {
            android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
            motionEvent.getAxisValue(26);
            getContext();
            aa$.ExternalSyntheticApiModelOutline0.m$1(viewConfiguration);
            getContext();
            aa$.ExternalSyntheticApiModelOutline0.m(viewConfiguration);
            motionEvent.getEventTime();
            motionEvent.getDeviceId();
            defpackage.cou couVar2 = this.F;
            bxq bxqVar = new bxq(this, motionEvent, 7);
            if (couVar2.d.a) {
                java.lang.System.out.println((java.lang.Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
                return false;
            }
            defpackage.cpg cpgVarA = couVar2.a();
            if (cpgVarA != null) {
                if (!cpgVarA.t.D) {
                    defpackage.cwh.d("visitAncestors called on an unattached node");
                }
                defpackage.cmv cmvVar11 = cpgVarA.t;
                defpackage.dbk dbkVarA5 = defpackage.cfo.A(cpgVarA);
                loop0: while (true) {
                    if (dbkVarA5 == null) {
                        cmvVarX = null;
                        break;
                    }
                    if ((dbkVarA5.v.f.v & 16384) != 0) {
                        while (cmvVar11 != null) {
                            if ((cmvVar11.u & 16384) != 0) {
                                cmvVarX = cmvVar11;
                                defpackage.cfc cfcVar7 = null;
                                while (cmvVarX != null) {
                                    if (cmvVarX instanceof defpackage.dea) {
                                        break loop0;
                                    }
                                    if ((cmvVarX.u & 16384) != 0 && (cmvVarX instanceof defpackage.dap)) {
                                        int i26 = 0;
                                        for (defpackage.cmv cmvVar12 = ((defpackage.dap) cmvVarX).F; cmvVar12 != null; cmvVar12 = cmvVar12.x) {
                                            if ((cmvVar12.u & 16384) != 0) {
                                                i26++;
                                                if (i26 == 1) {
                                                    cmvVarX = cmvVar12;
                                                } else {
                                                    if (cfcVar7 == null) {
                                                        cfcVar7 = new defpackage.cfc(new defpackage.cmv[16]);
                                                    }
                                                    if (cmvVarX != null) {
                                                        cfcVar7.n(cmvVarX);
                                                    }
                                                    cfcVar7.n(cmvVar12);
                                                    cmvVarX = null;
                                                }
                                            }
                                        }
                                        if (i26 != 1) {
                                        }
                                    }
                                    cmvVarX = defpackage.cfo.x(cfcVar7);
                                }
                            }
                            cmvVar11 = cmvVar11.w;
                        }
                    }
                    dbkVarA5 = dbkVarA5.k();
                    cmvVar11 = (dbkVarA5 == null || (dceVar6 = dbkVarA5.v) == null) ? null : dceVar6.e;
                }
                deaVar = (defpackage.dea) cmvVarX;
            } else {
                deaVar = null;
            }
            if (deaVar == null) {
                return false;
            }
            if (!deaVar.t.D) {
                defpackage.cwh.d("visitAncestors called on an unattached node");
            }
            defpackage.cmv cmvVar13 = deaVar.t.w;
            defpackage.dbk dbkVarA6 = defpackage.cfo.A(deaVar);
            java.util.ArrayList arrayList4 = null;
            while (dbkVarA6 != null) {
                if ((dbkVarA6.v.f.v & 16384) != 0) {
                    while (cmvVar13 != null) {
                        if ((cmvVar13.u & 16384) != 0) {
                            defpackage.cmv cmvVarX4 = cmvVar13;
                            defpackage.cfc cfcVar8 = null;
                            while (cmvVarX4 != null) {
                                if (cmvVarX4 instanceof defpackage.dea) {
                                    if (arrayList4 == null) {
                                        arrayList4 = new java.util.ArrayList();
                                    }
                                    arrayList4.add(cmvVarX4);
                                    z4 = false;
                                } else {
                                    z4 = true;
                                }
                                if (z4 && (cmvVarX4.u & 16384) != 0 && (cmvVarX4 instanceof defpackage.dap)) {
                                    int i27 = 0;
                                    for (defpackage.cmv cmvVar14 = ((defpackage.dap) cmvVarX4).F; cmvVar14 != null; cmvVar14 = cmvVar14.x) {
                                        if ((cmvVar14.u & 16384) != 0) {
                                            i27++;
                                            if (i27 == 1) {
                                                cmvVarX4 = cmvVar14;
                                            } else {
                                                if (cfcVar8 == null) {
                                                    cfcVar8 = new defpackage.cfc(new defpackage.cmv[16]);
                                                }
                                                if (cmvVarX4 != null) {
                                                    cfcVar8.n(cmvVarX4);
                                                }
                                                cfcVar8.n(cmvVar14);
                                                cmvVarX4 = null;
                                            }
                                        }
                                    }
                                    if (i27 != 1) {
                                    }
                                }
                                cmvVarX4 = defpackage.cfo.x(cfcVar8);
                            }
                        }
                        cmvVar13 = cmvVar13.w;
                    }
                }
                dbkVarA6 = dbkVarA6.k();
                cmvVar13 = (dbkVarA6 == null || (dceVar5 = dbkVarA6.v) == null) ? null : dceVar5.e;
            }
            if (arrayList4 != null && (size3 = arrayList4.size() - 1) >= 0) {
                while (true) {
                    int i28 = size3 - 1;
                    if (i28 < 0) {
                        break;
                    }
                    size3 = i28;
                }
            }
            defpackage.cmv cmvVarX5 = deaVar.t;
            defpackage.cfc cfcVar9 = null;
            while (cmvVarX5 != null) {
                if (cmvVarX5 instanceof defpackage.dea) {
                } else if ((cmvVarX5.u & 16384) != 0 && (cmvVarX5 instanceof defpackage.dap)) {
                    int i29 = 0;
                    for (defpackage.cmv cmvVar15 = ((defpackage.dap) cmvVarX5).F; cmvVar15 != null; cmvVar15 = cmvVar15.x) {
                        if ((cmvVar15.u & 16384) != 0) {
                            i29++;
                            if (i29 == 1) {
                                cmvVarX5 = cmvVar15;
                            } else {
                                if (cfcVar9 == null) {
                                    cfcVar9 = new defpackage.cfc(new defpackage.cmv[16]);
                                }
                                if (cmvVarX5 != null) {
                                    cfcVar9.n(cmvVarX5);
                                }
                                cfcVar9.n(cmvVar15);
                                cmvVarX5 = null;
                            }
                        }
                    }
                    if (i29 != 1) {
                    }
                }
                cmvVarX5 = defpackage.cfo.x(cfcVar9);
            }
            if (!((java.lang.Boolean) bxqVar.a()).booleanValue()) {
                defpackage.cmv cmvVarX6 = deaVar.t;
                defpackage.cfc cfcVar10 = null;
                while (cmvVarX6 != null) {
                    if (cmvVarX6 instanceof defpackage.dea) {
                    } else if ((cmvVarX6.u & 16384) != 0 && (cmvVarX6 instanceof defpackage.dap)) {
                        int i30 = 0;
                        for (defpackage.cmv cmvVar16 = ((defpackage.dap) cmvVarX6).F; cmvVar16 != null; cmvVar16 = cmvVar16.x) {
                            if ((cmvVar16.u & 16384) != 0) {
                                i30++;
                                if (i30 == 1) {
                                    cmvVarX6 = cmvVar16;
                                } else {
                                    if (cfcVar10 == null) {
                                        cfcVar10 = new defpackage.cfc(new defpackage.cmv[16]);
                                    }
                                    if (cmvVarX6 != null) {
                                        cfcVar10.n(cmvVarX6);
                                    }
                                    cfcVar10.n(cmvVar16);
                                    cmvVarX6 = null;
                                }
                            }
                        }
                        if (i30 != 1) {
                        }
                    }
                    cmvVarX6 = defpackage.cfo.x(cfcVar10);
                }
                if (arrayList4 == null) {
                    return false;
                }
                int size7 = arrayList4.size();
                for (int i31 = 0; i31 < size7; i31++) {
                }
                return false;
            }
        } else {
            motionEvent.getSource();
            if ((aq(motionEvent) & 4) == 0) {
                return false;
            }
        }
        return i4;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX WARN: Code duplicated, block: B:68:0x0130  */
    /* JADX WARN: Code duplicated, block: B:71:0x0137  */
    /* JADX WARN: Code duplicated, block: B:78:0x014c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0150  */
    /* JADX WARN: Code duplicated, block: B:83:0x0164  */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0168, code lost:
    
        if (aB(r19) == false) goto L82;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deg.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (!isFocused()) {
            return this.F.h(keyEvent, new bxq(this, keyEvent, 6));
        }
        defpackage.dfz dfzVar = this.e.i;
        dgo.a.b(new defpackage.cvt(keyEvent.getMetaState()));
        return this.F.h(keyEvent, new bmt(5)) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x014e  */
    /* JADX WARN: Code duplicated, block: B:112:0x015b  */
    /* JADX WARN: Code duplicated, block: B:133:0x019a  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:160:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:162:0x01f4 A[LOOP:13: B:159:0x01e6->B:162:0x01f4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:212:0x01fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x01fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x019e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x01fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [cmv] */
    /* JADX WARN: Type inference failed for: r0v11, types: [cmv] */
    /* JADX WARN: Type inference failed for: r0v12, types: [cmv] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [cmv] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [cmv] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v9, types: [cmv] */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [cfc] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [cfc] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [cfc] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [cfc] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [cmv] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [cmv] */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30, types: [cfc] */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33, types: [cfc] */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(android.view.KeyEvent keyEvent) {
        defpackage.cum cumVar;
        ?? L;
        ?? cfcVar;
        ?? L2;
        ?? cfcVar2;
        int size;
        int i;
        int size2;
        defpackage.dce dceVar;
        boolean z;
        ?? X;
        defpackage.dce dceVar2;
        if (isFocused()) {
            defpackage.cou couVar = this.F;
            if (couVar.d.a) {
                java.lang.System.out.println((java.lang.Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                defpackage.cpg cpgVarS = rx.s(couVar.c);
                if (cpgVarS != null) {
                    if (!cpgVarS.t.D) {
                        defpackage.cwh.d("visitAncestors called on an unattached node");
                    }
                    defpackage.cmv cmvVar = cpgVarS.t;
                    defpackage.dbk dbkVarA = defpackage.cfo.A(cpgVarS);
                    loop0: while (true) {
                        if (dbkVarA == null) {
                            X = 0;
                            break;
                        }
                        if ((dbkVarA.v.f.v & 131072) != 0) {
                            while (cmvVar != null) {
                                if ((cmvVar.u & 131072) != 0) {
                                    ?? cfcVar3 = 0;
                                    X = cmvVar;
                                    while (X != 0) {
                                        if (X instanceof defpackage.cum) {
                                            break loop0;
                                        }
                                        if ((X.u & 131072) != 0 && (X instanceof defpackage.dap)) {
                                            defpackage.cmv cmvVar2 = ((defpackage.dap) X).F;
                                            int i2 = 0;
                                            while (cmvVar2 != null) {
                                                if ((cmvVar2.u & 131072) != 0) {
                                                    i2++;
                                                    if (i2 == 1) {
                                                        X = X;
                                                        cfcVar3 = cfcVar3;
                                                        cfcVar3 = cfcVar3;
                                                        X = cmvVar2;
                                                    } else {
                                                        if (cfcVar3 == 0) {
                                                            cfcVar3 = new defpackage.cfc(new defpackage.cmv[16]);
                                                        }
                                                        if (X != 0) {
                                                            cfcVar3.n(X);
                                                        }
                                                        cfcVar3.n(cmvVar2);
                                                        X = 0;
                                                    }
                                                } else {
                                                    X = X;
                                                    cfcVar3 = cfcVar3;
                                                }
                                                cmvVar2 = cmvVar2.x;
                                                X = X;
                                                cfcVar3 = cfcVar3;
                                            }
                                            if (i2 != 1) {
                                                X = X;
                                                cfcVar3 = cfcVar3;
                                            } else {
                                                X = X;
                                                cfcVar3 = cfcVar3;
                                            }
                                        }
                                        X = defpackage.cfo.x(cfcVar3);
                                    }
                                }
                                cmvVar = cmvVar.w;
                            }
                        }
                        dbkVarA = dbkVarA.k();
                        cmvVar = (dbkVarA == null || (dceVar2 = dbkVarA.v) == null) ? null : dceVar2.e;
                    }
                    cumVar = (defpackage.cum) X;
                } else {
                    cumVar = null;
                }
                if (cumVar != null) {
                    if (!cumVar.L().D) {
                        defpackage.cwh.d("visitAncestors called on an unattached node");
                    }
                    defpackage.cmv cmvVar3 = cumVar.L().w;
                    defpackage.dbk dbkVarA2 = defpackage.cfo.A(cumVar);
                    java.util.ArrayList arrayList = null;
                    while (dbkVarA2 != null) {
                        if ((dbkVarA2.v.f.v & 131072) != 0) {
                            while (cmvVar3 != null) {
                                if ((cmvVar3.u & 131072) != 0) {
                                    defpackage.cmv cmvVarX = cmvVar3;
                                    defpackage.cfc cfcVar4 = null;
                                    while (cmvVarX != null) {
                                        if (cmvVarX instanceof defpackage.cum) {
                                            if (arrayList == null) {
                                                arrayList = new java.util.ArrayList();
                                            }
                                            arrayList.add(cmvVarX);
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                        if (z && (cmvVarX.u & 131072) != 0 && (cmvVarX instanceof defpackage.dap)) {
                                            int i3 = 0;
                                            for (defpackage.cmv cmvVar4 = ((defpackage.dap) cmvVarX).F; cmvVar4 != null; cmvVar4 = cmvVar4.x) {
                                                if ((cmvVar4.u & 131072) != 0) {
                                                    i3++;
                                                    if (i3 == 1) {
                                                        cmvVarX = cmvVar4;
                                                    } else {
                                                        if (cfcVar4 == null) {
                                                            cfcVar4 = new defpackage.cfc(new defpackage.cmv[16]);
                                                        }
                                                        if (cmvVarX != null) {
                                                            cfcVar4.n(cmvVarX);
                                                        }
                                                        cfcVar4.n(cmvVar4);
                                                        cmvVarX = null;
                                                    }
                                                }
                                            }
                                            if (i3 != 1) {
                                            }
                                        }
                                        cmvVarX = defpackage.cfo.x(cfcVar4);
                                    }
                                }
                                cmvVar3 = cmvVar3.w;
                            }
                        }
                        dbkVarA2 = dbkVarA2.k();
                        cmvVar3 = (dbkVarA2 == null || (dceVar = dbkVarA2.v) == null) ? null : dceVar.e;
                    }
                    if (arrayList == null || (size2 = arrayList.size() - 1) < 0) {
                        L = cumVar.L();
                        cfcVar = 0;
                        while (L != 0) {
                            if (L instanceof defpackage.cum) {
                                if (((defpackage.cum) L).b()) {
                                }
                            } else if ((L.u & 131072) == 0 && (L instanceof defpackage.dap)) {
                                defpackage.cmv cmvVar5 = ((defpackage.dap) L).F;
                                int i4 = 0;
                                while (cmvVar5 != null) {
                                    if ((cmvVar5.u & 131072) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            L = L;
                                            cfcVar = cfcVar;
                                            cfcVar = cfcVar;
                                            L = cmvVar5;
                                        } else {
                                            if (cfcVar == 0) {
                                                cfcVar = new defpackage.cfc(new defpackage.cmv[16]);
                                            }
                                            if (L != 0) {
                                                cfcVar.n(L);
                                            }
                                            cfcVar.n(cmvVar5);
                                            L = 0;
                                        }
                                    } else {
                                        L = L;
                                        cfcVar = cfcVar;
                                    }
                                    cmvVar5 = cmvVar5.x;
                                    L = L;
                                    cfcVar = cfcVar;
                                }
                                if (i4 != 1) {
                                    L = L;
                                    cfcVar = cfcVar;
                                } else {
                                    L = L;
                                    cfcVar = cfcVar;
                                }
                            }
                            L = defpackage.cfo.x(cfcVar);
                        }
                        L2 = cumVar.L();
                        cfcVar2 = 0;
                        while (L2 != 0) {
                            if (L2 instanceof defpackage.cum) {
                                if (((defpackage.cum) L2).a()) {
                                }
                            } else if ((L2.u & 131072) == 0 && (L2 instanceof defpackage.dap)) {
                                defpackage.cmv cmvVar6 = ((defpackage.dap) L2).F;
                                int i5 = 0;
                                while (cmvVar6 != null) {
                                    if ((cmvVar6.u & 131072) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            L2 = L2;
                                            cfcVar2 = cfcVar2;
                                            cfcVar2 = cfcVar2;
                                            L2 = cmvVar6;
                                        } else {
                                            if (cfcVar2 == 0) {
                                                cfcVar2 = new defpackage.cfc(new defpackage.cmv[16]);
                                            }
                                            if (L2 != 0) {
                                                cfcVar2.n(L2);
                                            }
                                            cfcVar2.n(cmvVar6);
                                            L2 = 0;
                                        }
                                    } else {
                                        L2 = L2;
                                        cfcVar2 = cfcVar2;
                                    }
                                    cmvVar6 = cmvVar6.x;
                                    L2 = L2;
                                    cfcVar2 = cfcVar2;
                                }
                                if (i5 != 1) {
                                    L2 = L2;
                                    cfcVar2 = cfcVar2;
                                } else {
                                    L2 = L2;
                                    cfcVar2 = cfcVar2;
                                }
                            }
                            L2 = defpackage.cfo.x(cfcVar2);
                        }
                        if (arrayList != null) {
                            size = arrayList.size();
                            for (i = 0; i < size; i++) {
                                if (!((defpackage.cum) arrayList.get(i)).a()) {
                                }
                            }
                        }
                    } else {
                        while (true) {
                            int i6 = size2 - 1;
                            if (!((defpackage.cum) arrayList.get(size2)).b()) {
                                if (i6 < 0) {
                                    break;
                                }
                                size2 = i6;
                            }
                        }
                        L = cumVar.L();
                        cfcVar = 0;
                        while (L != 0) {
                            if (L instanceof defpackage.cum) {
                                if (((defpackage.cum) L).b()) {
                                }
                            } else if ((L.u & 131072) == 0) {
                            }
                            L = defpackage.cfo.x(cfcVar);
                        }
                        L2 = cumVar.L();
                        cfcVar2 = 0;
                        while (L2 != 0) {
                            if (L2 instanceof defpackage.cum) {
                                if (((defpackage.cum) L2).a()) {
                                }
                            } else if ((L2.u & 131072) == 0) {
                            }
                            L2 = defpackage.cfo.x(cfcVar2);
                        }
                        if (arrayList != null) {
                            size = arrayList.size();
                            while (i < size) {
                                if (!((defpackage.cum) arrayList.get(i)).a()) {
                                }
                            }
                        }
                    }
                }
            }
            if (!super.dispatchKeyEventPreIme(keyEvent)) {
                return false;
            }
        } else if (!super.dispatchKeyEventPreIme(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(android.view.ViewStructure viewStructure, int i) {
        this.ax = true;
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            this.ax = false;
            av(viewStructure);
        } catch (java.lang.Throwable th) {
            this.ax = false;
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) throws java.lang.Throwable {
        java.lang.Object dfhVar;
        defpackage.cou couVar;
        defpackage.cpg cpgVarB;
        if (this.D) {
            java.lang.Runnable runnable = this.as;
            removeCallbacks(runnable);
            android.view.MotionEvent motionEvent2 = this.B;
            if (motionEvent2 == null) {
                defpackage.aooh.g();
            }
            if (motionEvent.getActionMasked() != 0 || aD(motionEvent, motionEvent2)) {
                runnable.run();
            } else {
                this.D = false;
            }
        }
        if (aE(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2) {
            aB(motionEvent);
        }
        int iAq = aq(motionEvent);
        if ((iAq & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
        boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
        if (z && z2) {
            java.lang.Object parent = getParent();
            android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
            if (view == null || (dfhVar = view.getTag(2131427517)) == null) {
                dfhVar = new dfh();
            }
            if (defpackage.aooh.n(dfhVar, new dfh()) && (cpgVarB = (couVar = this.F).b()) != null) {
                defpackage.cxi cxiVarY = defpackage.cfo.y(cpgVarB);
                if (!defpackage.den.G(cxiVarY).q(cxiVarY, true).h((((long) java.lang.Float.floatToRawIntBits(motionEvent.getX())) << 32) | (((long) java.lang.Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L))) {
                    couVar.j(false, true, 8);
                }
            }
        }
        return (iAq & 1) != 0;
    }

    @Override // defpackage.emj
    public final void f(defpackage.emx emxVar) {
        defpackage.dgc dgcVar = this.R;
        if (dgcVar != null) {
            defpackage.dga dgaVar = dgcVar.a;
            if (dgaVar.b()) {
                dgcVar.a(null);
                return;
            }
            defpackage.cjn cjnVar = dgaVar.a;
            if (cjnVar.b) {
                return;
            }
            if (!cjnVar.c) {
                cjq.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!cjnVar.d.d()) {
                cjq.a("Attempted to start retaining exited values with pending exited values");
            }
            cjnVar.c = false;
        }
    }

    public final android.view.View findViewByAccessibilityIdTraversal(int i) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        try {
            java.lang.reflect.Method declaredMethod = d;
            if (declaredMethod == null) {
                declaredMethod = android.view.View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", java.lang.Integer.TYPE);
                d = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            java.lang.Object objInvoke = declaredMethod.invoke(this, java.lang.Integer.valueOf(i));
            if (objInvoke instanceof android.view.View) {
                return (android.view.View) objInvoke;
            }
            return null;
        } catch (java.lang.NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // defpackage.emj
    public final void fn(defpackage.emx emxVar) {
        defpackage.dgc dgcVar = this.R;
        if (dgcVar != null) {
            defpackage.dgb dgbVar = this.f;
            if (dgbVar == null) {
                defpackage.aooh.g();
            }
            dgcVar.b(dgbVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final android.view.View focusSearch(android.view.View view, int i) {
        defpackage.cpn cpnVarB;
        if (view == null || this.w.b) {
            return super.focusSearch(view, i);
        }
        android.view.View rootView = getRootView();
        if (rootView == null) {
            defpackage.aooh.h("null cannot be cast to non-null type android.view.ViewGroup");
        }
        android.view.View viewFindNextFocus = android.view.FocusFinder.getInstance().findNextFocus((android.view.ViewGroup) rootView, view, i);
        if (viewFindNextFocus == null || !defpackage.den.m(this, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (view != this || (cpnVarB = this.F.c()) == null) {
            cpnVarB = defpackage.con.b(view, this);
        }
        cok cokVarA = defpackage.con.a(i);
        int i2 = cokVarA != null ? cokVarA.a : 6;
        defpackage.aoot aootVar = new defpackage.aoot();
        if (this.F.d(i2, cpnVarB, new defpackage.clc(aootVar, 18)) == null) {
            return view;
        }
        java.lang.Object obj = aootVar.a;
        if (obj == null) {
            if (viewFindNextFocus == null) {
                return super.focusSearch(view, i);
            }
        } else if (viewFindNextFocus == null || rv.i(i2) || defpackage.rz.m(rx.u((defpackage.cpg) obj), defpackage.con.b(viewFindNextFocus, this), cpnVarB, i2)) {
            return this;
        }
        return viewFindNextFocus;
    }

    @Override // defpackage.cpi
    public final defpackage.cpn g() {
        if (isFocused()) {
            return this.F.c();
        }
        android.view.View viewFindFocus = findFocus();
        if (viewFindFocus == null) {
            return null;
        }
        return defpackage.con.b(viewFindFocus, this);
    }

    @Override // android.view.View
    public final void getFocusedRect(android.graphics.Rect rect) {
        defpackage.cpn cpnVarG = g();
        if (cpnVarG == null) {
            if (defpackage.aooh.n(this.F.d(6, null, new bxb(13)), java.lang.Boolean.TRUE)) {
                super.getFocusedRect(rect);
                return;
            } else {
                rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
                return;
            }
        }
        rect.left = java.lang.Math.round(cpnVarG.b);
        rect.top = java.lang.Math.round(cpnVarG.c);
        rect.right = java.lang.Math.round(cpnVarG.d);
        rect.bottom = java.lang.Math.round(cpnVarG.e);
    }

    @Override // android.view.View
    public final int getImportantForAutofill() {
        return 1;
    }

    @Override // defpackage.cpi
    public final void h() {
        if (isFocused() || hasFocus()) {
            super.clearFocus();
        } else if (hasFocus()) {
            android.view.View viewFindFocus = findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            super.clearFocus();
        }
    }

    @Override // defpackage.cpi
    public final boolean i(int i) {
        if (i != 7 && i != 8) {
            java.lang.Integer numD = defpackage.con.d(i);
            if (numD == null) {
                defpackage.cwh.b("Invalid focus direction");
                throw new defpackage.aoiq();
            }
            defpackage.cou couVar = this.F;
            int iIntValue = numD.intValue();
            defpackage.cpg cpgVarB = couVar.b();
            if (cpgVarB == null) {
                throw new java.lang.IllegalStateException("findNextViewInEmbeddedView called when owner does not have anything focused.");
            }
            java.lang.Integer numD2 = defpackage.con.d(i);
            if (numD2 == null) {
                defpackage.cwh.b("Invalid focus direction");
                throw new defpackage.aoiq();
            }
            int iIntValue2 = numD2.intValue();
            android.view.View viewH = defpackage.cfo.A(cpgVarB).h();
            android.view.View viewFindFocus = findFocus();
            android.view.FocusFinder focusFinder = android.view.FocusFinder.getInstance();
            android.view.View rootView = getRootView();
            if (rootView == null) {
                defpackage.aooh.h("null cannot be cast to non-null type android.view.ViewGroup");
            }
            android.view.View viewFindNextFocus = focusFinder.findNextFocus((android.view.ViewGroup) rootView, viewFindFocus, iIntValue2);
            if (viewFindNextFocus == null || viewH == null || !defpackage.den.m(viewH, viewFindNextFocus)) {
                viewFindNextFocus = null;
            }
            if (viewFindNextFocus != null) {
                return defpackage.con.e(viewFindNextFocus, java.lang.Integer.valueOf(iIntValue), null);
            }
        }
        return false;
    }

    @Override // defpackage.cpi
    public final boolean j() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    @Override // defpackage.cvv
    public final long k(long j) {
        ah();
        long jA = defpackage.cqt.a(this.x, j);
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (jA >> 32)) + java.lang.Float.intBitsToFloat((int) (this.ak >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (jA & 4294967295L)) + java.lang.Float.intBitsToFloat((int) (this.ak & 4294967295L));
        return (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    @Override // defpackage.cvv
    public final long l(long j) {
        ah();
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) - java.lang.Float.intBitsToFloat((int) (this.ak >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) - java.lang.Float.intBitsToFloat((int) (this.ak & 4294967295L));
        return defpackage.cqt.a(this.y, (java.lang.Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    @Override // defpackage.dcs
    public final void m(defpackage.aomy aomyVar) {
        defpackage.aojw aojwVar = this.i;
        boolean zIsEmpty = aojwVar.isEmpty();
        aojwVar.addLast(aomyVar);
        if (zIsEmpty) {
            android.os.Handler handler = getHandler();
            if (handler == null) {
                throw new java.lang.IllegalArgumentException("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
            handler.postAtFrontOfQueue(this.S);
        }
    }

    @Override // defpackage.dcv
    public final /* synthetic */ defpackage.cnf n() {
        return this.K;
    }

    @Override // defpackage.dcv
    public final defpackage.dct o(defpackage.aonn aonnVar, defpackage.aomy aomyVar, defpackage.cso csoVar) {
        java.lang.Object obj;
        if (csoVar != null) {
            return new defpackage.dfu(csoVar, null, this, aonnVar, aomyVar);
        }
        defpackage.enr enrVar = this.M;
        enrVar.i();
        do {
            defpackage.cfc cfcVar = (defpackage.cfc) enrVar.b;
            int i = cfcVar.b;
            if (i == 0) {
                obj = null;
                break;
            }
            obj = ((java.lang.ref.Reference) cfcVar.c(i - 1)).get();
        } while (obj == null);
        defpackage.dct dctVar = (defpackage.dct) obj;
        if (dctVar != null) {
            dctVar.g(aonnVar, aomyVar);
            return dctVar;
        }
        defpackage.apkl apklVar = this.N;
        return new defpackage.dfu(apklVar.i(), apklVar, this, aonnVar, aomyVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        defpackage.cjp cjpVar;
        java.lang.Object obj;
        super.onAttachedToWindow();
        defpackage.dbk dbkVar = this.n;
        if (!dbkVar.al()) {
            dbkVar.w(this);
        }
        ay(true);
        defpackage.czx czxVar = this.m;
        if (czxVar != null) {
            czxVar.onViewAttachedToWindow(this);
        }
        this.e.g();
        au(dbkVar);
        ag(dbkVar);
        this.u.a.d();
        defpackage.deg degVarAc = ac();
        if (degVarAc == null) {
            throw new java.lang.IllegalStateException("Expected the view to be attached to window.");
        }
        degVarAc.m(new defpackage.bpa(this, 20));
        defpackage.emx emxVarB = this.e.b();
        defpackage.eoi eoiVarC = this.e.c();
        defpackage.dgb dgbVar = this.f;
        if (emxVarB == null || eoiVarC == null || dgbVar == null) {
            cjpVar = null;
        } else {
            defpackage.eog eogVarF = defpackage.enn.f(eoiVarC.S(), new defpackage.eof(), defpackage.eoo.a);
            defpackage.aopu[] aopuVarArr = defpackage.aoou.a;
            defpackage.dgd dgdVar = (defpackage.dgd) eogVarF.b(new defpackage.aooa(defpackage.dgd.class));
            java.lang.Object parent = getParent();
            if (parent == null) {
                defpackage.aooh.h("null cannot be cast to non-null type android.view.View");
            }
            int id = ((android.view.View) parent).getId();
            defpackage.aco acoVar = dgdVar.a;
            java.lang.Object objA = acoVar.a(id);
            if (objA == null) {
                objA = new defpackage.adq(1);
                acoVar.g(id, objA);
            }
            defpackage.adq adqVar = (defpackage.adq) objA;
            java.lang.Object[] objArr = adqVar.a;
            int i = adqVar.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    obj = null;
                    break;
                }
                obj = objArr[i2];
                if (!((defpackage.dgc) obj).c) {
                    break;
                } else {
                    i2++;
                }
            }
            defpackage.dgc dgcVar = (defpackage.dgc) obj;
            if (dgcVar == null) {
                dgcVar = new defpackage.dgc();
                adqVar.q(dgcVar);
            }
            dgcVar.c = true;
            this.R = dgcVar;
            cjpVar = dgcVar.b;
        }
        if (cjpVar == null) {
            cjpVar = defpackage.cjl.a;
        }
        this.h = cjpVar;
        defpackage.aonj aonjVar = this.z;
        if (aonjVar != null) {
            aonjVar.a(this.e);
            this.z = null;
        }
        ar(this.e.b());
        X().aq(true != isInTouchMode() ? 2 : 1);
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            defpackage.dfd.c(this);
        }
        defpackage.cnf cnfVar = this.K;
        if (cnfVar != null) {
            this.F.f.q(cnfVar);
            this.p.c.q(cnfVar);
        }
        this.F.f.q(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        aH();
        return false;
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        az(configuration);
    }

    @Override // android.view.View
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        aH();
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, java.util.function.Consumer consumer) {
        java.lang.Object obj;
        for (long j : jArr) {
            defpackage.cnn cnnVar = this.r;
            defpackage.ajwz ajwzVar = (defpackage.ajwz) cnnVar.h().a((int) j);
            if (ajwzVar != null && (obj = ajwzVar.c) != null) {
                defpackage.dij dijVar = (defpackage.dij) obj;
                android.view.translation.ViewTranslationRequest.Builder builder = new android.view.translation.ViewTranslationRequest.Builder(da$.ExternalSyntheticApiModelOutline1.m(cnnVar.a), dijVar.c);
                java.util.List list = (java.util.List) dijVar.b.g(defpackage.din.D);
                if (list != null) {
                    ac$.ExternalSyntheticApiModelOutline0.m(builder, "android:text", ac$.ExternalSyntheticApiModelOutline0.m(new defpackage.dji(defpackage.dpy.c(list, "\n", null, null, null, 62))));
                    aa$.ExternalSyntheticApiModelOutline1.m(consumer, ac$.ExternalSyntheticApiModelOutline0.m(builder));
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ay(false);
        defpackage.dfw dfwVar = this.au;
        dfwVar.c = 0;
        dfwVar.d = true;
        android.view.GestureDetector gestureDetector = dfwVar.e;
        if (gestureDetector != null) {
            android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            gestureDetector.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
        }
        defpackage.czx czxVar = this.m;
        if (czxVar != null) {
            czxVar.onViewDetachedFromWindow(this);
        }
        android.view.View view = this.U;
        if (ao() && view != null) {
            removeView(view);
        }
        defpackage.adq adqVar = G;
        synchronized (adqVar) {
            adqVar.p(this);
        }
        this.e.f();
        defpackage.clk clkVar = this.u.a;
        clkVar.e();
        clkVar.a();
        ax(this.e.b());
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        defpackage.dgc dgcVar = this.R;
        if (dgcVar != null) {
            dgcVar.c = false;
        }
        this.R = null;
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            defpackage.dfd.b(this);
        }
        defpackage.cnf cnfVar = this.K;
        if (cnfVar != null) {
            this.p.c.p(cnfVar);
            this.F.f.p(cnfVar);
        }
        defpackage.diw diwVar = this.o;
        diwVar.e = diwVar.c.a(0L, 0L, null, 0, 0);
        diwVar.c();
        diwVar.g();
        this.F.f.p(this);
    }

    @Override // android.view.View
    protected final void onFocusChanged(boolean z, int i, android.graphics.Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        defpackage.cou couVar = this.F;
        rx.y(couVar.c, true);
        if (couVar.b() != null) {
            defpackage.cpg cpgVarB = couVar.b();
            couVar.g(null);
            if (cpgVarB != null) {
                cpgVarB.j(defpackage.cpe.a, defpackage.cpe.d);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.ai = 0L;
        aA();
        int i = android.os.Build.VERSION.SDK_INT;
        if (i < 32 || i >= 34) {
            return;
        }
        az(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        android.os.Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.ai = 0L;
            this.w.i(this.av);
            this.ad = null;
            aA();
            dey deyVar = this.v;
            if (deyVar != null) {
                android.os.Trace.beginSection("AndroidOwner:viewLayout");
                try {
                    deyVar.layout(0, 0, i3 - i, i4 - i2);
                    android.os.Trace.endSection();
                } finally {
                    android.os.Trace.endSection();
                }
            }
        } catch (java.lang.Throwable th) {
            android.os.Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        android.os.Trace.beginSection("AndroidOwner:onMeasure");
        try {
            defpackage.dbk dbkVar = this.n;
            if (!dbkVar.al()) {
                dbkVar.w(this);
            }
            if (!isAttachedToWindow()) {
                au(dbkVar);
            }
            long jAG = aG(i);
            long jAG2 = aG(i2);
            long j = defpackage.dpe.j((int) (jAG >>> 32), (int) (jAG & 4294967295L), (int) (jAG2 >>> 32), (int) (jAG2 & 4294967295L));
            defpackage.dpd dpdVar = this.ad;
            if (dpdVar == null) {
                this.ad = new defpackage.dpd(j);
                this.ae = false;
            } else if (dpdVar.a != j) {
                this.ae = true;
            }
            defpackage.dbw dbwVar = this.w;
            defpackage.dpd dpdVar2 = dbwVar.g;
            if (dpdVar2 == null || dpdVar2.a != j) {
                if (dbwVar.b) {
                    defpackage.cwh.c("updateRootConstraints called while measuring");
                }
                dbwVar.g = new defpackage.dpd(j);
                defpackage.dbk dbkVar2 = dbwVar.a;
                if (dbkVar2.al()) {
                    if (dbkVar2.j != null) {
                        dbkVar2.L();
                    }
                    dbkVar2.M();
                    dbwVar.i.bA(dbkVar2, dbkVar2.j != null ? 1 : 3);
                }
            }
            defpackage.aogc aogcVar = dbwVar.i;
            if (aogcVar.bx()) {
                defpackage.dbk dbkVar3 = dbwVar.a;
                if (!dbkVar3.al()) {
                    defpackage.cwh.c("performMeasureAndLayout called with unattached root");
                }
                if (!dbkVar3.am()) {
                    defpackage.cwh.c("performMeasureAndLayout called with unplaced root");
                }
                if (dbwVar.b) {
                    defpackage.cwh.c("performMeasureAndLayout called during measure layout");
                }
                if (dbwVar.g != null) {
                    dbwVar.b = true;
                    dbwVar.c = false;
                    try {
                        if (!((defpackage.daq) aogcVar.a).d() && !((defpackage.daq) aogcVar.c).d()) {
                            if (dbkVar3.j != null) {
                                dbwVar.g(dbkVar3, true);
                            } else {
                                dbwVar.f(dbkVar3);
                            }
                        }
                        dbwVar.g(dbkVar3, false);
                        dbwVar.b = false;
                        dbwVar.c = false;
                        wo woVar = dbwVar.h;
                    } catch (java.lang.Throwable th) {
                        try {
                            throw th;
                        } catch (java.lang.Throwable th2) {
                            dbwVar.b = false;
                            dbwVar.c = false;
                            throw th2;
                        }
                    }
                }
            }
            defpackage.dbk dbkVar4 = this.n;
            setMeasuredDimension(dbkVar4.g(), dbkVar4.e());
            dey deyVar = this.v;
            if (deyVar != null) {
                android.os.Trace.beginSection("AndroidOwner:androidViewMeasure");
                try {
                    deyVar.measure(android.view.View.MeasureSpec.makeMeasureSpec(dbkVar4.g(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(dbkVar4.e(), 1073741824));
                    android.os.Trace.endSection();
                } finally {
                    android.os.Trace.endSection();
                }
            }
        } catch (java.lang.Throwable th3) {
            android.os.Trace.endSection();
            throw th3;
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(android.view.ViewStructure viewStructure, int i) {
        if (viewStructure == null || this.ax) {
            return;
        }
        av(viewStructure);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final android.view.PointerIcon onResolvePointerIcon(android.view.MotionEvent motionEvent, int i) {
        motionEvent.getToolType(i);
        if (!motionEvent.isFromSource(8194)) {
            motionEvent.isFromSource(16386);
        }
        return super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.Q) {
            defpackage.dpq dpqVarC = defpackage.con.c(i);
            if (dpqVarC == null) {
                dpqVarC = defpackage.dpq.a;
            }
            this.an.b(dpqVarC);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(android.graphics.Rect rect, android.graphics.Point point, java.util.function.Consumer consumer) {
        defpackage.ipc ipcVar;
        if (android.os.Build.VERSION.SDK_INT < 31 || (ipcVar = this.aG) == null) {
            return;
        }
        defpackage.dik dikVar = this.p;
        defpackage.aolr aolrVar = this.j;
        defpackage.cfc cfcVar = new defpackage.cfc(new dhq[16]);
        defpackage.wv.g(dikVar.a(), 0, new dhp(cfcVar));
        cfcVar.j(new bdt(new defpackage.aonj[]{new bxb(16), new bxb(17)}, 16, (byte[]) null));
        int i = cfcVar.b;
        dhq dhqVar = (dhq) (i != 0 ? cfcVar.a[i - 1] : null);
        if (dhqVar != null) {
            defpackage.aoss aossVarN = defpackage.aosv.n(aolrVar);
            defpackage.dij dijVar = dhqVar.a;
            defpackage.dpo dpoVar = dhqVar.c;
            dhk dhkVar = new dhk(dijVar, dpoVar, aossVarN, ipcVar, this);
            defpackage.cxi cxiVar = dhqVar.d;
            defpackage.cpn cpnVarQ = defpackage.den.G(cxiVar).q(cxiVar, true);
            long jD = dpoVar.d();
            android.view.ScrollCaptureTarget scrollCaptureTarget = new android.view.ScrollCaptureTarget(this, defpackage.cfd.A(defpackage.dfd.j(cpnVarQ)), new android.graphics.Point((int) (jD >> 32), (int) (jD & 4294967295L)), dhkVar);
            ac$.ExternalSyntheticApiModelOutline0.m(scrollCaptureTarget, defpackage.cfd.A(dpoVar));
            aa$.ExternalSyntheticApiModelOutline1.m(consumer, scrollCaptureTarget);
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        aA();
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        X().aq(true != z ? 2 : 1);
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(android.util.LongSparseArray longSparseArray) {
        boolean zN = defpackage.aooh.n(android.os.Looper.getMainLooper().getThread(), java.lang.Thread.currentThread());
        defpackage.cnn cnnVar = this.r;
        if (zN) {
            rt.h(cnnVar, longSparseArray);
        } else {
            cnnVar.a.post(new defpackage.ad(cnnVar, longSparseArray, 14));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        this.aw = true;
        super.onWindowFocusChanged(z);
    }

    @Override // defpackage.dcv
    public final defpackage.dcy p() {
        return this.u;
    }

    @Override // defpackage.dcv
    public final defpackage.dgk q() {
        return this.e.g;
    }

    @Override // defpackage.dcv
    public final defpackage.dgn r() {
        return this.e.i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, android.graphics.Rect rect) {
        if (isFocused()) {
            return true;
        }
        cok cokVarA = defpackage.con.a(i);
        int i2 = cokVarA != null ? cokVarA.a : 7;
        defpackage.cou couVar = this.F;
        java.lang.Boolean boolD = couVar.d(i2, rect != null ? defpackage.cfd.B(rect) : null, new cos(i2, 3));
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (defpackage.aooh.n(boolD, bool) || defpackage.aooh.n(couVar.d(i2, null, new cos(i2, 4)), bool)) {
            return true;
        }
        if (hasFocus() && rv.i(i2)) {
            return couVar.i(i2);
        }
        return false;
    }

    @Override // defpackage.dcv
    public final defpackage.dnx s() {
        return (defpackage.dnx) this.ab.a();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // defpackage.dcv
    public final defpackage.dpf t() {
        return (defpackage.dpf) this.T.a();
    }

    @Override // defpackage.dcv
    public final defpackage.dpq u() {
        return (defpackage.dpq) this.an.a();
    }

    @Override // defpackage.dcv
    public final void v(defpackage.dbk dbkVar, boolean z) {
        this.w.e(dbkVar, z);
    }

    @Override // defpackage.dcv
    public final void w(boolean z) {
        defpackage.dbw dbwVar = this.w;
        if (dbwVar.h() || dbwVar.d.d()) {
            android.os.Trace.beginSection("AndroidOwner:measureAndLayout");
            try {
                if (dbwVar.i(z ? this.av : this.E)) {
                    requestLayout();
                }
                dbwVar.b(false);
                this.o.c();
                at();
                android.os.Trace.endSection();
            } catch (java.lang.Throwable th) {
                android.os.Trace.endSection();
                throw th;
            }
        }
    }

    @Override // defpackage.dcv
    public final void x(defpackage.dbk dbkVar, long j) {
        android.os.Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            defpackage.dbw dbwVar = this.w;
            if (!dbkVar.D) {
                defpackage.dbk dbkVar2 = dbwVar.a;
                if (defpackage.aooh.n(dbkVar, dbkVar2)) {
                    defpackage.cwh.c("measureAndLayout called on root");
                }
                if (!dbkVar2.al()) {
                    defpackage.cwh.c("performMeasureAndLayout called with unattached root");
                }
                if (!dbkVar2.am()) {
                    defpackage.cwh.c("performMeasureAndLayout called with unplaced root");
                }
                if (dbwVar.b) {
                    defpackage.cwh.c("performMeasureAndLayout called during measure layout");
                }
                if (dbwVar.g != null) {
                    dbwVar.b = true;
                    dbwVar.c = false;
                    try {
                        dbwVar.i.bz(dbkVar);
                        if ((defpackage.dbw.k(dbkVar, new defpackage.dpd(j)) || dbkVar.ai()) && defpackage.aooh.n(dbkVar.r(), java.lang.Boolean.TRUE)) {
                            dbkVar.J();
                        }
                        dbwVar.d(dbkVar);
                        defpackage.dbw.l(dbkVar, new defpackage.dpd(j));
                        if (dbkVar.ah() && dbkVar.am()) {
                            dbkVar.S();
                            dbwVar.d.b(dbkVar);
                        }
                        dbwVar.c();
                        dbwVar.b = false;
                        dbwVar.c = false;
                        wo woVar = dbwVar.h;
                    } catch (java.lang.Throwable th) {
                        try {
                            throw th;
                        } catch (java.lang.Throwable th2) {
                            dbwVar.b = false;
                            dbwVar.c = false;
                            throw th2;
                        }
                    }
                }
                dbwVar.a();
            }
            defpackage.dbw dbwVar2 = this.w;
            if (!dbwVar2.h()) {
                dbwVar2.b(false);
                this.o.c();
                this.E.a();
                at();
            }
            android.os.Trace.endSection();
        } catch (java.lang.Throwable th3) {
            android.os.Trace.endSection();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x00d9 A[EDGE_INSN: B:104:0x00d9->B:39:0x00d9 BREAK  A[LOOP:3: B:23:0x0090->B:35:0x00c9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c9 A[Catch: all -> 0x0153, LOOP:3: B:23:0x0090->B:35:0x00c9, LOOP_END, TryCatch #0 {, blocks: (B:6:0x0014, B:8:0x001c, B:11:0x002e, B:13:0x0041, B:14:0x0046, B:16:0x0051, B:18:0x005b, B:20:0x007a, B:23:0x0090, B:25:0x009e, B:27:0x00a8, B:29:0x00ae, B:31:0x00be, B:39:0x00d9, B:41:0x00e1, B:44:0x00f0, B:35:0x00c9, B:50:0x010c, B:52:0x011c, B:54:0x0122, B:58:0x0133, B:57:0x0129, B:59:0x013a, B:61:0x0143, B:62:0x0146), top: B:93:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e1 A[Catch: all -> 0x0153, TryCatch #0 {, blocks: (B:6:0x0014, B:8:0x001c, B:11:0x002e, B:13:0x0041, B:14:0x0046, B:16:0x0051, B:18:0x005b, B:20:0x007a, B:23:0x0090, B:25:0x009e, B:27:0x00a8, B:29:0x00ae, B:31:0x00be, B:39:0x00d9, B:41:0x00e1, B:44:0x00f0, B:35:0x00c9, B:50:0x010c, B:52:0x011c, B:54:0x0122, B:58:0x0133, B:57:0x0129, B:59:0x013a, B:61:0x0143, B:62:0x0146), top: B:93:0x0014 }] */
    @Override // defpackage.dcv
    public final void y() {
        defpackage.cfc cfcVar;
        defpackage.aonj aonjVar;
        int i;
        defpackage.cfc cfcVar2;
        int i2;
        defpackage.aonj aonjVar2;
        long j;
        char c2;
        defpackage.deg degVar = this;
        if (degVar.t) {
            defpackage.dcy dcyVar = degVar.u;
            defpackage.aonj bxbVar = new bxb(12);
            defpackage.clk clkVar = dcyVar.a;
            synchronized (clkVar.e) {
                defpackage.cfc cfcVar3 = clkVar.d;
                int i3 = cfcVar3.b;
                int i4 = 0;
                int i5 = 0;
                while (i4 < i3) {
                    defpackage.clj cljVar = (defpackage.clj) cfcVar3.a[i4];
                    defpackage.adw adwVarE = cljVar.e();
                    long[] jArr = adwVarE.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i6 = 0;
                        while (true) {
                            long j2 = jArr[i6];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i7 = i6 - length;
                                i = i4;
                                int i8 = 0;
                                while (true) {
                                    int i9 = i7;
                                    i2 = 8 - ((~i7) >>> 31);
                                    if (i8 >= i2) {
                                        break;
                                    }
                                    if ((j2 & 255) < 128) {
                                        int i10 = (i6 << 3) + i8;
                                        int i11 = 8;
                                        java.lang.Object obj = adwVarE.b[i10];
                                        defpackage.ado adoVar = (defpackage.ado) adwVarE.c[i10];
                                        java.lang.Object objA = bxbVar.a(obj);
                                        if (((java.lang.Boolean) objA).booleanValue()) {
                                            aonjVar2 = bxbVar;
                                            java.lang.Object[] objArr = adoVar.b;
                                            int[] iArr = adoVar.c;
                                            long[] jArr2 = adoVar.a;
                                            int length2 = jArr2.length - 2;
                                            if (length2 >= 0) {
                                                j = j2;
                                                int i12 = 0;
                                                while (true) {
                                                    long j3 = jArr2[i12];
                                                    cfcVar3 = cfcVar3;
                                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                                        for (int i14 = 0; i14 < i13; i14++) {
                                                            if ((j3 & 255) < 128) {
                                                                int i15 = (i12 << 3) + i14;
                                                                java.lang.Object obj2 = objArr[i15];
                                                                int i16 = iArr[i15];
                                                                cljVar.b(obj, obj2);
                                                            }
                                                            j3 >>= i11;
                                                        }
                                                        if (i13 != i11) {
                                                            break;
                                                        }
                                                        if (i12 != length2) {
                                                            break;
                                                        }
                                                        i12++;
                                                        cfcVar3 = cfcVar3;
                                                        i11 = 8;
                                                    } else if (i12 != length2) {
                                                        break;
                                                        break;
                                                    } else {
                                                        i12++;
                                                        cfcVar3 = cfcVar3;
                                                        i11 = 8;
                                                    }
                                                }
                                            }
                                            if (((java.lang.Boolean) objA).booleanValue()) {
                                                adwVarE.j(i10);
                                            }
                                            c2 = '\b';
                                        } else {
                                            aonjVar2 = bxbVar;
                                        }
                                        j = j2;
                                        if (((java.lang.Boolean) objA).booleanValue()) {
                                            adwVarE.j(i10);
                                        }
                                        c2 = '\b';
                                    } else {
                                        cfcVar3 = cfcVar3;
                                        aonjVar2 = bxbVar;
                                        j = j2;
                                        c2 = '\b';
                                    }
                                    j2 = j >> c2;
                                    i8++;
                                    i7 = i9;
                                    bxbVar = aonjVar2;
                                    cfcVar3 = cfcVar3;
                                }
                                cfcVar = cfcVar3;
                                aonjVar = bxbVar;
                                if (i2 != 8) {
                                    break;
                                }
                            } else {
                                cfcVar = cfcVar3;
                                aonjVar = bxbVar;
                                i = i4;
                            }
                            if (i6 == length) {
                                break;
                            }
                            i6++;
                            i4 = i;
                            bxbVar = aonjVar;
                            cfcVar3 = cfcVar;
                        }
                    } else {
                        cfcVar = cfcVar3;
                        aonjVar = bxbVar;
                        i = i4;
                    }
                    if (cljVar.c()) {
                        if (i5 > 0) {
                            cfcVar2 = cfcVar;
                            java.lang.Object[] objArr2 = cfcVar2.a;
                            objArr2[i - i5] = objArr2[i];
                        }
                        i4 = i + 1;
                        cfcVar3 = cfcVar2;
                        bxbVar = aonjVar;
                    } else {
                        i5++;
                    }
                    cfcVar2 = cfcVar;
                    i4 = i + 1;
                    cfcVar3 = cfcVar2;
                    bxbVar = aonjVar;
                }
                defpackage.cfc cfcVar4 = cfcVar3;
                java.lang.Object[] objArr3 = cfcVar4.a;
                int i17 = i3 - i5;
                if (objArr3 == null) {
                    defpackage.aooh.i("<this>");
                }
                java.util.Arrays.fill(objArr3, i17, i3, (java.lang.Object) null);
                cfcVar4.b = i17;
            }
            degVar = this;
            degVar.t = false;
        }
        dey deyVar = degVar.v;
        if (deyVar != null) {
            degVar.as(deyVar);
        }
        defpackage.cnf cnfVar = degVar.K;
        if (cnfVar != null) {
            if (cnfVar.h.d == 0 && cnfVar.f) {
                da$.ExternalSyntheticApiModelOutline1.m(cnfVar.g.a());
                cnfVar.f = false;
            }
            if (cnfVar.h.d != 0) {
                cnfVar.f = true;
            }
        }
        while (true) {
            defpackage.adq adqVar = degVar.aB;
            if (!adqVar.g() || adqVar.c(0) == null) {
                return;
            }
            int i18 = adqVar.b;
            for (int i19 = 0; i19 < i18; i19++) {
                defpackage.aomy aomyVar = (defpackage.aomy) adqVar.c(i19);
                adqVar.i(i19, null);
                if (aomyVar != null) {
                    aomyVar.a();
                }
            }
            adqVar.m(0, i18);
        }
    }

    @Override // defpackage.dcv
    public final void z(defpackage.dbk dbkVar) {
        defpackage.dem demVar = this.q;
        demVar.l = true;
        if (demVar.C()) {
            demVar.u(dbkVar);
        }
        defpackage.cnn cnnVar = this.r;
        cnnVar.b = true;
        if (cnnVar.n()) {
            cnnVar.k();
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i, int i2) {
        android.view.ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i;
        layoutParamsGenerateDefaultLayoutParams.height = i2;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @Override // defpackage.emj
    public final /* synthetic */ void a(defpackage.emx emxVar) {
    }

    @Override // defpackage.emj
    public final /* synthetic */ void b(defpackage.emx emxVar) {
    }

    @Override // defpackage.emj
    public final /* synthetic */ void c(defpackage.emx emxVar) {
    }

    @Override // defpackage.emj
    public final /* synthetic */ void e(defpackage.emx emxVar) {
    }

    @Override // android.view.View
    protected final void onDraw(android.graphics.Canvas canvas) {
    }
}
