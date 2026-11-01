package com.google.android.material.bottomsheet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class BottomSheetDragHandleView extends android.support.v7.widget.AppCompatImageView implements android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener {
    public com.google.android.material.bottomsheet.BottomSheetBehavior a;
    private final android.view.accessibility.AccessibilityManager b;
    private final android.view.GestureDetector c;
    private boolean d;
    private boolean e;
    private boolean f;
    private final java.lang.String g;
    private final java.lang.String h;
    private final java.lang.String i;
    private final defpackage.afqs j;
    private final android.view.GestureDetector.OnGestureListener k;

    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetDragHandleView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(agdv.a(context, attributeSet, i, 2132085787), attributeSet, i);
        this.e = false;
        this.f = false;
        this.g = getResources().getString(2132017600);
        this.h = getResources().getString(2132017602);
        this.i = getResources().getString(2132017598);
        this.j = new defpackage.afra(this);
        defpackage.afrb afrbVar = new defpackage.afrb(this);
        this.k = afrbVar;
        android.content.Context context2 = getContext();
        setTooltipText(getResources().getString(2132017603));
        this.c = new android.view.GestureDetector(context2, afrbVar, new android.os.Handler(android.os.Looper.getMainLooper()));
        this.b = (android.view.accessibility.AccessibilityManager) context2.getSystemService("accessibility");
        dzs.i(this, new defpackage.afrc(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        if (true == r2) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int d() {
        /*
            r7 = this;
            boolean r0 = r7.c()
            r1 = -1
            if (r0 == 0) goto L31
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r7.a
            boolean r2 = r0.a
            int r3 = r0.y
            r4 = 6
            r5 = 4
            r6 = 3
            if (r3 == r6) goto L26
            if (r3 == r5) goto L21
            if (r3 != r4) goto L31
            boolean r7 = r7.d
            if (r7 != 0) goto L24
            boolean r7 = r0.z()
            if (r7 != 0) goto L30
            goto L31
        L21:
            r7 = 1
            if (r7 != r2) goto L28
        L24:
            r1 = r6
            goto L31
        L26:
            if (r2 != 0) goto L2a
        L28:
            r1 = r4
            goto L31
        L2a:
            boolean r7 = r0.z()
            if (r7 == 0) goto L31
        L30:
            r1 = r5
        L31:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetDragHandleView.d():int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void e(com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior) {
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior2 = this.a;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.n(this.j);
            this.a.o(null);
            this.a.p(null);
        }
        this.a = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.o(this);
            this.a.p(this);
            a(this.a.y);
            this.a.i(this.j);
        }
        setClickable(c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i) {
        java.lang.String str;
        if (i == 4) {
            this.d = true;
        } else if (i == 3) {
            this.d = false;
        }
        int iD = d();
        if (iD == 3) {
            str = this.g;
        } else if (iD != 4) {
            str = iD != 6 ? null : this.h;
        } else {
            str = this.i;
        }
        dzs.h(this, ebc.c, str, new defpackage.vya(this, 3));
    }

    public final boolean b() {
        if (!c()) {
            return false;
        }
        int iD = d();
        if (iD != -1) {
            this.a.t(iD);
        }
        return true;
    }

    public final boolean c() {
        return this.a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v7 */
    protected final void onAttachedToWindow() {
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior;
        android.view.View view;
        super.onAttachedToWindow();
        ?? r0 = this;
        while (true) {
            java.lang.Object parent = r0.getParent();
            bottomSheetBehavior = null;
            if (parent instanceof android.view.View) {
                view = (android.view.View) parent;
            } else {
                r0 = 0;
            }
            if (r0 == 0) {
                r0 = view;
                break;
            }
            dup layoutParams = r0.getLayoutParams();
            if (layoutParams instanceof dup) {
                r0 = view;
                dum dumVar = layoutParams.a;
                if (dumVar instanceof com.google.android.material.bottomsheet.BottomSheetBehavior) {
                    bottomSheetBehavior = (com.google.android.material.bottomsheet.BottomSheetBehavior) dumVar;
                    break;
                }
            } else {
                r0 = view;
            }
        }
        e(bottomSheetBehavior);
        android.view.accessibility.AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(this);
            accessibilityManager.isEnabled();
        }
    }

    protected final void onDetachedFromWindow() {
        android.view.accessibility.AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(this);
        }
        e(null);
        super.onDetachedFromWindow();
    }

    public final boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (i == 23 || i == 66) {
            return this.f ? performClick() : b();
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return (this.f || this.e) ? super.onTouchEvent(motionEvent) : this.c.onTouchEvent(motionEvent);
    }

    public final void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f = onClickListener != null;
        super.setOnClickListener(onClickListener);
    }

    public final void setOnTouchListener(android.view.View.OnTouchListener onTouchListener) {
        this.e = onTouchListener != null;
        super.setOnTouchListener(onTouchListener);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
    }

    public BottomSheetDragHandleView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130968753);
    }

    public BottomSheetDragHandleView(android.content.Context context) {
        this(context, null);
    }
}
