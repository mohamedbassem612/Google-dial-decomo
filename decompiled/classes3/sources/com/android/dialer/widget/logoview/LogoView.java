package com.android.dialer.widget.logoview;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class LogoView extends android.view.View implements android.animation.TimeAnimator.TimeListener, defpackage.wfw {
    public static final /* synthetic */ int d = 0;
    public final defpackage.wgc a;
    public int b;
    public int c;
    private final android.animation.TimeAnimator e;
    private final android.animation.AnimatorSet f;
    private final android.graphics.Paint g;
    private final android.graphics.Paint h;
    private final j$.util.Optional i;
    private float j;
    private defpackage.wfx k;
    private boolean l;
    private final defpackage.wge m;

    static {
        new defpackage.wes();
        new defpackage.wet();
    }

    public LogoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.c = 255;
        this.l = true;
        this.i = ((wev) aooc.ar(context.getApplicationContext(), wev.class)).fT();
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.f = animatorSet;
        this.m = new defpackage.wge();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.g = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.h = paint2;
        defpackage.wgc wgcVar = new defpackage.wgc(f(), f(), f(), f(), f(), f(), new aae(new defpackage.wfy(80.0f), new defpackage.wfz(80.0f)), new defpackage.wfz(1000.0f));
        this.a = wgcVar;
        android.animation.TimeAnimator timeAnimator = new android.animation.TimeAnimator();
        this.e = timeAnimator;
        this.k = new defpackage.wfx(wgcVar, new android.animation.TimeAnimator(), this, new wsc((byte[]) null), defpackage.wew.a);
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(0, 255);
        android.content.Context context2 = getContext();
        defpackage.urp urpVar = defpackage.urp.DURATION_SHORT_2;
        valueAnimatorOfInt.setDuration(wsc.bp(context2, urpVar));
        valueAnimatorOfInt.addUpdateListener(new defpackage.wer(this, valueAnimatorOfInt, 0));
        android.animation.ValueAnimator valueAnimatorOfInt2 = android.animation.ValueAnimator.ofInt(255, 0);
        valueAnimatorOfInt2.setDuration(wsc.bp(getContext(), urpVar));
        valueAnimatorOfInt2.addUpdateListener(new defpackage.wer(this, valueAnimatorOfInt2, 2));
        animatorSet.playSequentially(valueAnimatorOfInt, valueAnimatorOfInt2);
        animatorSet.addListener(new defpackage.weu(this));
        paint.setAntiAlias(true);
        paint2.setFilterBitmap(true);
        timeAnimator.setTimeListener(this);
    }

    private final float d() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private final float e() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private static defpackage.wgb f() {
        return new defpackage.wgb(new defpackage.wga(80.0f, 1000.0f), new defpackage.wfy(360.0f), new defpackage.wga(80.0f, 160.0f), new defpackage.wga(320.0f, 40.0f), new defpackage.wga(160.0f, 1000.0f), new defpackage.wfz(1000.0f), new defpackage.wfz(160.0f), new defpackage.wfz(320.0f));
    }

    private final void g(boolean z) {
        android.animation.TimeAnimator timeAnimator = this.e;
        if (timeAnimator == null || this.l == z) {
            return;
        }
        this.l = z;
        if (!z) {
            this.f.cancel();
            timeAnimator.setTimeListener(null);
            timeAnimator.end();
            this.k.b();
            return;
        }
        if (this.b != 255 || this.c != 0) {
            android.animation.TimeAnimator timeAnimator2 = this.k.a;
            if (timeAnimator2.isStarted()) {
                timeAnimator2.resume();
            } else {
                timeAnimator2.start();
            }
        }
        timeAnimator.setTimeListener(this);
    }

    private final void h() {
        defpackage.wgc wgcVar = this.a;
        this.j = java.lang.Math.min(e() / wgcVar.i, d() / wgcVar.j);
    }

    @Override // defpackage.wfw
    public final void a() {
        android.animation.TimeAnimator timeAnimator = this.e;
        if (timeAnimator.isStarted() || !this.l) {
            return;
        }
        timeAnimator.start();
    }

    public final void b(float f, float f2) {
        if (f <= 0.0f || f2 <= 0.0f) {
            throw new java.lang.IllegalArgumentException("Width and height cannot be 0 or below");
        }
        defpackage.wgc wgcVar = this.a;
        wgcVar.i = f;
        wgcVar.j = f2;
        h();
        invalidate();
    }

    public final void c(defpackage.wew wewVar) {
        boolean z = this.l;
        defpackage.wfx wfxVar = this.k;
        if ((wewVar != wfxVar.h || wfxVar.i != defpackage.wew.a) && wewVar != wfxVar.i) {
            wfxVar.i = wewVar;
            java.util.ArrayDeque arrayDeque = wfxVar.c;
            arrayDeque.clear();
            wsc wscVar = wfxVar.k;
            defpackage.wex wexVarZ = wsc.Z(wfxVar.h);
            defpackage.wex wexVarZ2 = wsc.Z(wfxVar.i);
            boolean z2 = wexVarZ != wexVarZ2;
            if (z2) {
                java.util.Deque dequeA = wfxVar.a(wexVarZ);
                java.util.Deque dequeA2 = wfxVar.a(wexVarZ2);
                while (!dequeA.isEmpty() && !dequeA2.isEmpty() && ((defpackage.wex) dequeA.getFirst()).equals(dequeA2.getFirst())) {
                    dequeA.removeFirst();
                    dequeA2.removeFirst();
                }
                java.util.Iterator itDescendingIterator = dequeA.descendingIterator();
                while (itDescendingIterator.hasNext()) {
                    arrayDeque.addLast(wsc.X((defpackage.wex) itDescendingIterator.next()));
                }
                java.util.Iterator it = dequeA2.iterator();
                while (it.hasNext()) {
                    arrayDeque.addLast(wsc.W((defpackage.wex) it.next()));
                }
                if (wfxVar.g == arrayDeque.getFirst()) {
                    arrayDeque.pollFirst();
                }
            }
            arrayDeque.addLast(wsc.Y(wfxVar.i));
            if (!z) {
                while (!arrayDeque.isEmpty()) {
                    wfxVar.c((defpackage.wfv) arrayDeque.removeFirst());
                    wfxVar.f = 0L;
                    wfxVar.e = 0L;
                    defpackage.wfv wfvVar = wfxVar.g;
                    defpackage.wgc wgcVar = wfxVar.b;
                    wfvVar.c(0L, Long.MAX_VALUE, wgcVar);
                    wgcVar.f();
                }
                wfxVar.j = false;
            } else if (!wfxVar.a.isStarted() || !z2 || (wfxVar.g != wsc.W(wexVarZ) && wfxVar.g != wsc.X(wexVarZ))) {
                wfxVar.d();
            }
        }
        if (this.l) {
            return;
        }
        this.k.b();
    }

    @Override // android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i.isPresent();
        g(isShown());
        this.k.d = this;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g(false);
        this.k.d = null;
    }

    @Override // android.view.View
    protected final void onDraw(android.graphics.Canvas canvas) {
        android.graphics.Canvas canvas2 = canvas;
        canvas2.save();
        canvas2.translate(getPaddingLeft() + (e() / 2.0f), getPaddingTop() + (d() / 2.0f));
        if (this.c > 0) {
            defpackage.wgc<defpackage.wgb> wgcVar = this.a;
            for (defpackage.wgb wgbVar : wgcVar) {
                android.graphics.Paint paint = this.g;
                paint.setColor(wgbVar.i);
                paint.setAlpha(255);
                float f = wgbVar.a.c;
                float fA = wgcVar.a() + wgbVar.a();
                float f2 = wgbVar.d.c;
                float fC = wgbVar.c();
                double d2 = fA;
                float fCos = (((float) java.lang.Math.cos(d2)) * f) + f2;
                float fSin = (f * ((float) java.lang.Math.sin(d2))) + fC;
                if (wgbVar.v()) {
                    float fB = wgbVar.b();
                    defpackage.wge wgeVar = this.m;
                    android.graphics.Path path = wgeVar.c;
                    path.reset();
                    android.graphics.Path path2 = wgeVar.d;
                    path2.reset();
                    wgeVar.e = 0.0f;
                    wgeVar.f = 0.0f;
                    wgeVar.g = android.graphics.Paint.Cap.ROUND;
                    if (wgbVar == wgcVar.b) {
                        wgeVar.a(path, defpackage.wgd.a, 7.0f, -1.0f, fB);
                        wgeVar.e = fB + fB + 4.0f;
                        wgeVar.g = android.graphics.Paint.Cap.ROUND;
                    } else if (wgbVar == wgcVar.c) {
                        wgeVar.a(path, defpackage.wgd.b, 14.0f, -1.0f, fB);
                        wgeVar.e = (fB * (-2.0f)) + 4.0f;
                        wgeVar.g = fB > 0.5f ? android.graphics.Paint.Cap.BUTT : android.graphics.Paint.Cap.ROUND;
                    } else if (wgbVar == wgcVar.d) {
                        wgeVar.a(path, defpackage.wgd.c, 5.0f, -1.0f, fB);
                        wgeVar.e = (fB * (-2.0f)) + 4.0f;
                        wgeVar.g = fB > 0.5f ? android.graphics.Paint.Cap.BUTT : android.graphics.Paint.Cap.ROUND;
                    } else if (wgbVar == wgcVar.e) {
                        wgeVar.a(path, defpackage.wgd.d, 4.0f, 10.0f, fB);
                        wgeVar.e = (fB * (-2.0f)) + 4.0f;
                        wgeVar.g = fB > 0.5f ? android.graphics.Paint.Cap.BUTT : android.graphics.Paint.Cap.ROUND;
                    }
                    float f3 = this.j;
                    android.graphics.Matrix matrix = wgeVar.b;
                    matrix.reset();
                    matrix.preScale(f3, f3);
                    matrix.preTranslate(fCos, fSin);
                    path.transform(matrix);
                    path2.transform(matrix);
                    wgeVar.e *= f3;
                    wgeVar.f *= f3;
                    paint.setStyle(android.graphics.Paint.Style.STROKE);
                    paint.setStrokeCap(wgeVar.g);
                    paint.setStrokeWidth(wgeVar.e);
                    canvas2.drawPath(path, paint);
                    paint.setStrokeWidth(wgeVar.f);
                    canvas2.drawPath(path2, paint);
                } else {
                    defpackage.wfz wfzVar = wgbVar.f;
                    float f4 = wfzVar.c;
                    if (f4 < -0.001f || f4 > 0.001f) {
                        paint.setStrokeWidth(wgbVar.d() * this.j);
                        paint.setStyle(android.graphics.Paint.Style.STROKE);
                        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
                        float f5 = wfzVar.c;
                        float f6 = this.j;
                        float f7 = fCos * f6;
                        canvas2.drawLine(f7, (fSin - f5) * f6, f7, f6 * (fSin + f5), paint);
                        canvas2 = canvas;
                    } else {
                        float fD = wgbVar.d() * wgbVar.g.c;
                        paint.setStyle(android.graphics.Paint.Style.FILL);
                        float f8 = this.j;
                        canvas2.drawCircle(fCos * f8, fSin * f8, (fD / 2.0f) * f8, paint);
                    }
                }
            }
            setAlpha(wgcVar.h.c);
        }
        canvas.restore();
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        h();
    }

    @Override // android.animation.TimeAnimator.TimeListener
    public final void onTimeUpdate(android.animation.TimeAnimator timeAnimator, long j, long j2) {
        defpackage.wgc<defpackage.wgb> wgcVar;
        defpackage.wgb wgbVar;
        long jMin = java.lang.Math.min(100L, j2);
        while (true) {
            wgcVar = this.a;
            if (jMin <= 0) {
                break;
            }
            long jMin2 = java.lang.Math.min(jMin, 10L);
            for (defpackage.wgb wgbVar2 : wgcVar) {
                wgbVar2.a.f(jMin2);
                wgbVar2.b.f(jMin2);
                wgbVar2.c.f(jMin2);
                wgbVar2.d.f(jMin2);
                wgbVar2.e.f(jMin2);
                wgbVar2.f.f(jMin2);
                wgbVar2.h.f(jMin2);
                wgbVar2.g.f(jMin2);
            }
            aae aaeVar = wgcVar.k;
            if (aaeVar.a) {
                defpackage.wfz wfzVar = (defpackage.wfz) aaeVar.c;
                wfzVar.f(jMin2);
                defpackage.wfz wfzVar2 = (defpackage.wfz) aaeVar.b;
                wfzVar2.e(wfzVar2.c + (wfzVar.c * (java.lang.Math.min(jMin2, 50.0f) / 1000.0f)));
            } else {
                ((defpackage.wfz) aaeVar.b).f(jMin2);
            }
            wgcVar.h.f(jMin2);
            jMin -= 10;
        }
        java.util.Iterator it = wgcVar.iterator();
        do {
            if (!it.hasNext()) {
                aae aaeVar2 = wgcVar.k;
                if (aaeVar2.a || !((defpackage.wfz) aaeVar2.b).e || !wgcVar.h.e) {
                    break;
                } else {
                    this.e.end();
                }
                invalidate();
            }
            wgbVar = (defpackage.wgb) it.next();
            if (!wgbVar.a.e || !wgbVar.b.e || !wgbVar.c.e || !wgbVar.d.e || !wgbVar.e.e || !wgbVar.f.e || !wgbVar.h.e) {
                break;
            }
        } while (wgbVar.g.e);
        this.f.cancel();
        this.c = 255;
        this.b = 0;
        invalidate();
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(android.view.View view, int i) {
        g(isShown());
    }

    public LogoView(android.content.Context context) {
        this(context, null);
    }
}
