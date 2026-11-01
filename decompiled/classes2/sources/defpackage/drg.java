package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class drg extends ddl implements defpackage.dri, dyy {
    public final android.view.Window a;
    public boolean b;
    public boolean c;
    public boolean d;
    private final ccp e;
    private boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    public drg(android.content.Context context, android.view.Window window) {
        super(context, (android.util.AttributeSet) null, 0, 6, (aooc) null);
        this.a = window;
        this.e = new androidx.compose.runtime.ParcelableSnapshotMutableState(defpackage.drc.a, cdu.c);
        int i = dzs.a;
        dzk.o(this, this);
        eae.a(this, new defpackage.drf(this));
    }

    @Override // defpackage.dri
    public final android.view.Window a() {
        return this.a;
    }

    public final void b(cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(1735448596);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            ((aonn) this.e.a()).a(cavVarB, 0);
        } else {
            cavVarB.s();
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ajs(this, i, 11);
        }
    }

    public final void c(caz cazVar, aonn aonnVar) {
        super.j(cazVar);
        this.e.b(aonnVar);
        this.f = true;
        f();
    }

    protected final boolean d() {
        return this.f;
    }

    public final eax dC(android.view.View view, eax eaxVar) {
        if (this.c) {
            return eaxVar;
        }
        int i = 0;
        android.view.View childAt = getChildAt(0);
        int iMax = java.lang.Math.max(0, childAt.getLeft());
        int iMax2 = java.lang.Math.max(0, childAt.getTop());
        int iMax3 = java.lang.Math.max(0, getWidth() - childAt.getRight());
        int iMax4 = java.lang.Math.max(0, getHeight() - childAt.getBottom());
        if (iMax != 0) {
            i = iMax;
        } else if (iMax2 == 0) {
            if (iMax3 != 0) {
                iMax2 = 0;
            } else {
                if (iMax4 == 0) {
                    return eaxVar;
                }
                iMax2 = 0;
                iMax3 = 0;
            }
        }
        return eaxVar.o(i, iMax2, iMax3, iMax4);
    }

    public final void h(boolean z, int i, int i2, int i3, int i4) {
        android.view.View childAt = getChildAt(0);
        if (childAt != null) {
            int paddingLeft = getPaddingLeft() + getPaddingRight();
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int i5 = i3 - i;
            int i6 = i4 - i2;
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int paddingLeft2 = getPaddingLeft() + (((i5 - measuredWidth) - paddingLeft) / 2);
            int paddingTop2 = getPaddingTop() + (((i6 - measuredHeight) - paddingTop) / 2);
            childAt.layout(paddingLeft2, paddingTop2, measuredWidth + paddingLeft2, measuredHeight + paddingTop2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e  */
    public final void i(int i, int i2) {
        int iA;
        int iMin;
        android.view.View childAt = getChildAt(0);
        if (childAt == null) {
            super.i(i, i2);
            return;
        }
        int size = android.view.View.MeasureSpec.getSize(i);
        int size2 = android.view.View.MeasureSpec.getSize(i2);
        int mode = android.view.View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE || this.b) {
            iA = size2;
        } else {
            android.view.Window window = this.a;
            if (window.getAttributes().height != -2) {
                iA = size2;
            } else if (!this.c) {
                iA = size2 + 1;
            } else if (android.os.Build.VERSION.SDK_INT < 32) {
                iA = defpackage.drb.a.a(window);
            } else {
                iA = size2;
            }
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i3 = size - paddingLeft;
        if (i3 < 0) {
            i3 = 0;
        }
        int i4 = iA - paddingTop;
        int i5 = i4 >= 0 ? i4 : 0;
        int mode2 = android.view.View.MeasureSpec.getMode(i);
        if (mode2 != 0) {
            i = android.view.View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i2 = android.view.View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
        }
        childAt.measure(i, i2);
        if (mode2 == Integer.MIN_VALUE) {
            size = java.lang.Math.min(size, childAt.getMeasuredWidth() + paddingLeft);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingLeft;
        }
        if (mode != Integer.MIN_VALUE) {
            iMin = mode != 1073741824 ? childAt.getMeasuredHeight() + paddingTop : size2;
        } else {
            iMin = java.lang.Math.min(size2, childAt.getMeasuredHeight() + paddingTop);
        }
        setMeasuredDimension(size, iMin);
        if (this.c || childAt.getMeasuredHeight() + paddingTop <= size2) {
            return;
        }
        android.view.Window window2 = this.a;
        if (window2.getAttributes().height == -2) {
            window2.addFlags(Integer.MIN_VALUE);
            if (this.b) {
                return;
            }
            window2.setLayout(-1, -1);
        }
    }
}
