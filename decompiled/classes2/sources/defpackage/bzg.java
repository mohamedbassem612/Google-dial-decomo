package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bzg extends android.view.View {
    public defpackage.bzy b;
    public java.lang.Boolean c;
    public java.lang.Runnable d;
    public aomy e;
    private java.lang.Long g;
    private static final int[] f = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    public static final int[] a = new int[0];

    public final void a() {
        this.e = null;
        java.lang.Runnable runnable = this.d;
        if (runnable != null) {
            removeCallbacks(runnable);
            java.lang.Runnable runnable2 = this.d;
            aooh.c(runnable2);
            runnable2.run();
        } else {
            defpackage.bzy bzyVar = this.b;
            if (bzyVar != null) {
                bzyVar.setState(a);
            }
        }
        defpackage.bzy bzyVar2 = this.b;
        if (bzyVar2 != null) {
            bzyVar2.setVisible(false, false);
            unscheduleDrawable(bzyVar2);
        }
    }

    public final void b(long j, int i, long j2, float f2) {
        defpackage.bzy bzyVar = this.b;
        if (bzyVar != null) {
            if (bzyVar.getRadius() != i) {
                bzyVar.setRadius(i);
            }
            long jH = cqg.h(j2, aooc.r(f2, 1.0f));
            cqg cqgVar = bzyVar.a;
            if (cqgVar == null || !anty.ah(cqgVar.a, jH)) {
                bzyVar.a = new cqg(jH);
                bzyVar.setColor(android.content.res.ColorStateList.valueOf(cfd.L(jH)));
            }
            android.graphics.Rect rect = new android.graphics.Rect(0, 0, aopc.i(java.lang.Float.intBitsToFloat((int) (j >> 32))), aopc.i(java.lang.Float.intBitsToFloat((int) (j & 4294967295L))));
            setLeft(rect.left);
            setTop(rect.top);
            setRight(rect.right);
            setBottom(rect.bottom);
            bzyVar.setBounds(rect);
        }
    }

    public final void c(boolean z) {
        int[] iArr;
        long jCurrentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        java.lang.Runnable runnable = this.d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        java.lang.Long l = this.g;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (!z) {
            if (jLongValue < 5) {
                defpackage.jd jdVar = new defpackage.jd(this, 16, null);
                this.d = jdVar;
                postDelayed(jdVar, 50L);
            } else {
                iArr = a;
            }
            this.g = java.lang.Long.valueOf(jCurrentAnimationTimeMillis);
        }
        iArr = f;
        defpackage.bzy bzyVar = this.b;
        if (bzyVar != null) {
            bzyVar.setState(iArr);
        }
        this.g = java.lang.Long.valueOf(jCurrentAnimationTimeMillis);
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            a();
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        aomy aomyVar = this.e;
        if (aomyVar != null) {
            aomyVar.a();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
