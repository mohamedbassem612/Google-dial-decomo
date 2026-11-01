package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class web implements android.view.View.OnTouchListener {
    public final android.content.Context a;
    public final android.view.WindowManager b;
    public final wdx c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public ejz k;
    public ejz l;
    private final float n;
    private boolean o;
    private float p;
    private float q;
    private float r;
    private float s;
    private android.view.VelocityTracker t;
    private android.widget.Scroller u;
    public boolean j = true;
    private final ejy v = new defpackage.wdz(this);
    public final ejy m = new defpackage.wea(this);

    public web(android.view.View view, wdx wdxVar) {
        this.c = wdxVar;
        android.content.Context context = view.getContext();
        this.a = context;
        this.b = (android.view.WindowManager) context.getSystemService(android.view.WindowManager.class);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165390);
        this.h = dimensionPixelSize;
        this.i = context.getResources().getDimensionPixelSize(2131165386);
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(2131165383) + (dimensionPixelSize / 2);
        this.d = dimensionPixelOffset;
        int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(2131165385) + (dimensionPixelSize / 2);
        this.e = dimensionPixelOffset2;
        this.f = context.getResources().getDisplayMetrics().widthPixels - dimensionPixelOffset;
        this.g = context.getResources().getDisplayMetrics().heightPixels - dimensionPixelOffset2;
        this.n = (float) java.lang.Math.pow(android.view.ViewConfiguration.get(context).getScaledTouchSlop(), 2.0d);
        view.setOnTouchListener(this);
    }

    public static float a(float f, float f2, float f3) {
        return java.lang.Math.min(f3, java.lang.Math.max(f2, f));
    }

    public static boolean c(android.view.WindowManager.LayoutParams layoutParams) {
        return (layoutParams.gravity & 5) == 5;
    }

    private final void d() {
        this.k.j(f(this.v.a(this.c.i)) ? this.f : this.d);
    }

    private final boolean e(float f, float f2) {
        int scaledMinimumFlingVelocity = android.view.ViewConfiguration.get(this.a).getScaledMinimumFlingVelocity() << 3;
        return (f * f) + (f2 * f2) > ((float) (scaledMinimumFlingVelocity * scaledMinimumFlingVelocity));
    }

    private final boolean f(float f) {
        return f > ((float) (this.d + this.f)) / 2.0f;
    }

    public final void b() {
        if (this.k == null) {
            wdx wdxVar = this.c;
            ejz ejzVar = new ejz(wdxVar.i, this.v);
            this.k = ejzVar;
            ejzVar.t = new eka();
            this.k.t.c(1.0f);
        }
        if (this.l == null) {
            wdx wdxVar2 = this.c;
            ejz ejzVar2 = new ejz(wdxVar2.i, this.m);
            this.l = ejzVar2;
            ejzVar2.t = new eka();
            this.l.t.c(1.0f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    /* JADX WARN: Code duplicated, block: B:22:0x006c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0082  */
    /* JADX WARN: Code duplicated, block: B:28:0x00da  */
    /* JADX WARN: Code duplicated, block: B:31:0x016e  */
    /* JADX WARN: Code duplicated, block: B:36:0x018f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0199  */
    /* JADX WARN: Code duplicated, block: B:44:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:45:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x0203 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0205  */
    /* JADX WARN: Code duplicated, block: B:72:0x0265 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x0267  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        defpackage.wdk wdkVar;
        int iBp;
        float f;
        boolean z;
        boolean z2;
        android.view.View view2;
        android.view.View view3;
        wdx wdxVar;
        defpackage.wdk wdkVar2;
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.p = rawX;
            this.q = rawY;
            ejy ejyVar = this.v;
            wdx wdxVar2 = this.c;
            this.r = ejyVar.a(wdxVar2.i) - rawX;
            this.s = this.m.a(wdxVar2.i) - rawY;
            android.view.VelocityTracker velocityTracker = this.t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            this.t = android.view.VelocityTracker.obtain();
        } else if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (this.o) {
                    if (!this.o) {
                        this.o = true;
                        wdxVar = this.c;
                        wdx.a.b().l("com/android/dialer/widget/bubble/impl/BubbleImpl", "onMoveStart", 591, "BubbleImpl.java").v("onMoveStart");
                        if (wdxVar.y != 1) {
                            if (!"removed".equals(((defpackage.wdu) wdxVar.x.eZ()).a.getTag())) {
                                ((android.view.WindowManager) wdxVar.g.eZ()).removeView(((defpackage.wdu) wdxVar.x.eZ()).a);
                                ((defpackage.wdu) wdxVar.x.eZ()).a.setTag("removed");
                            }
                            wdxVar.y = 1;
                        }
                        wdxVar.t = -1;
                        ((defpackage.wdw) wdxVar.o.eZ()).d.animate().translationZ(((android.content.Context) wdxVar.b.eZ()).getResources().getDimensionPixelOffset(2131165377));
                        wdkVar2 = (defpackage.wdk) wdxVar.w.eZ();
                        if (wdkVar2.f == null) {
                            android.content.Context context = wdkVar2.a;
                            wdkVar2.f = android.view.LayoutInflater.from(context).inflate(2131624038, (android.view.ViewGroup) null);
                            wdkVar2.f.setAlpha(0.0f);
                            wdkVar2.g = wdkVar2.f.findViewById(2131427582);
                            wdkVar2.h = wdkVar2.f.findViewById(2131427583);
                            int i = context.getResources().getDisplayMetrics().heightPixels;
                            int i2 = wdkVar2.c;
                            wdkVar2.e = i - i2;
                            android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams(-1, i2, 0, 0, 2038, 280, -3);
                            layoutParams.gravity = 81;
                            wdkVar2.b.addView(wdkVar2.f, layoutParams);
                            wdkVar2.f.setSystemUiVisibility(262);
                            wdkVar2.f.getRootView().setSystemUiVisibility(262);
                            wdkVar2.f.animate().alpha(1.0f).setInterpolator(wsc.bq(context, defpackage.urq.EASING_LINEAR)).setStartDelay(100L).setDuration(175L).start();
                        }
                    }
                    wdkVar = (defpackage.wdk) this.c.w.eZ();
                    if (wdkVar.f != null) {
                        android.content.Context context2 = wdkVar.a;
                        int i3 = context2.getResources().getDisplayMetrics().widthPixels / 2;
                        iBp = wsc.bp(context2, defpackage.urp.DURATION_SHORT_3);
                        f = wdkVar.e;
                        if (rawY > f) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (rawY > f) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        if (android.text.TextUtils.getLayoutDirectionFromLocale(java.util.Locale.getDefault()) == 1) {
                            view2 = wdkVar.h;
                            view3 = wdkVar.g;
                        } else {
                            view2 = wdkVar.g;
                            view3 = wdkVar.h;
                        }
                        if (!wdkVar.i) {
                            view2.animate().alpha(1.0f).setDuration(iBp).start();
                        }
                        if (!wdkVar.j) {
                            view3.animate().alpha(1.0f).setDuration(iBp).start();
                        }
                        if (!z) {
                            if (!z2) {
                                view3.sendAccessibilityEvent(256);
                                view3.animate().scaleX(1.0f).scaleY(1.0f).setDuration(iBp).start();
                                wdkVar.j = false;
                            }
                        } else if (!z2) {
                            view3.sendAccessibilityEvent(256);
                            view3.animate().scaleX(1.0f).scaleY(1.0f).setDuration(iBp).start();
                            wdkVar.j = false;
                        }
                        if (!z) {
                            if (z2) {
                                long j = iBp;
                                view3.sendAccessibilityEvent(128);
                                view3.setPivotY((view2.getHeight() / 2) + wdkVar.d);
                                view3.animate().scaleX(1.3f).scaleY(1.3f).setDuration(j).start();
                                view2.animate().alpha(0.38f).setDuration(j).start();
                                wdkVar.j = true;
                            }
                        } else if (z2) {
                            long j2 = iBp;
                            view3.sendAccessibilityEvent(128);
                            view3.setPivotY((view2.getHeight() / 2) + wdkVar.d);
                            view3.animate().scaleX(1.3f).scaleY(1.3f).setDuration(j2).start();
                            view2.animate().alpha(0.38f).setDuration(j2).start();
                            wdkVar.j = true;
                        }
                    }
                    b();
                    this.k.j(a(rawX + this.r, this.d, this.f));
                    this.l.j(a(rawY + this.s, this.e, this.g));
                } else {
                    float rawX2 = motionEvent.getRawX() - this.p;
                    float rawY2 = motionEvent.getRawY() - this.q;
                    if ((rawX2 * rawX2) + (rawY2 * rawY2) > this.n) {
                        if (!this.o) {
                            this.o = true;
                            wdxVar = this.c;
                            wdx.a.b().l("com/android/dialer/widget/bubble/impl/BubbleImpl", "onMoveStart", 591, "BubbleImpl.java").v("onMoveStart");
                            if (wdxVar.y != 1) {
                                if (!"removed".equals(((defpackage.wdu) wdxVar.x.eZ()).a.getTag())) {
                                    ((android.view.WindowManager) wdxVar.g.eZ()).removeView(((defpackage.wdu) wdxVar.x.eZ()).a);
                                    ((defpackage.wdu) wdxVar.x.eZ()).a.setTag("removed");
                                }
                                wdxVar.y = 1;
                            }
                            wdxVar.t = -1;
                            ((defpackage.wdw) wdxVar.o.eZ()).d.animate().translationZ(((android.content.Context) wdxVar.b.eZ()).getResources().getDimensionPixelOffset(2131165377));
                            wdkVar2 = (defpackage.wdk) wdxVar.w.eZ();
                            if (wdkVar2.f == null) {
                                android.content.Context context3 = wdkVar2.a;
                                wdkVar2.f = android.view.LayoutInflater.from(context3).inflate(2131624038, (android.view.ViewGroup) null);
                                wdkVar2.f.setAlpha(0.0f);
                                wdkVar2.g = wdkVar2.f.findViewById(2131427582);
                                wdkVar2.h = wdkVar2.f.findViewById(2131427583);
                                int i4 = context3.getResources().getDisplayMetrics().heightPixels;
                                int i5 = wdkVar2.c;
                                wdkVar2.e = i4 - i5;
                                android.view.WindowManager.LayoutParams layoutParams2 = new android.view.WindowManager.LayoutParams(-1, i5, 0, 0, 2038, 280, -3);
                                layoutParams2.gravity = 81;
                                wdkVar2.b.addView(wdkVar2.f, layoutParams2);
                                wdkVar2.f.setSystemUiVisibility(262);
                                wdkVar2.f.getRootView().setSystemUiVisibility(262);
                                wdkVar2.f.animate().alpha(1.0f).setInterpolator(wsc.bq(context3, defpackage.urq.EASING_LINEAR)).setStartDelay(100L).setDuration(175L).start();
                            }
                        }
                        wdkVar = (defpackage.wdk) this.c.w.eZ();
                        if (wdkVar.f != null) {
                            android.content.Context context4 = wdkVar.a;
                            int i6 = context4.getResources().getDisplayMetrics().widthPixels / 2;
                            iBp = wsc.bp(context4, defpackage.urp.DURATION_SHORT_3);
                            f = wdkVar.e;
                            if (rawY > f || rawX >= i6) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (rawY > f || rawX < i6) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (android.text.TextUtils.getLayoutDirectionFromLocale(java.util.Locale.getDefault()) == 1) {
                                view2 = wdkVar.h;
                                view3 = wdkVar.g;
                            } else {
                                view2 = wdkVar.g;
                                view3 = wdkVar.h;
                            }
                            if (!wdkVar.i && wdkVar.j && !z2) {
                                view2.animate().alpha(1.0f).setDuration(iBp).start();
                            }
                            if (!wdkVar.j && wdkVar.i && !z) {
                                view3.animate().alpha(1.0f).setDuration(iBp).start();
                            }
                            if (!z && wdkVar.i) {
                                view2.sendAccessibilityEvent(256);
                                view2.animate().scaleX(1.0f).scaleY(1.0f).setDuration(iBp).start();
                                wdkVar.i = false;
                            } else if (!z2 && wdkVar.j) {
                                view3.sendAccessibilityEvent(256);
                                view3.animate().scaleX(1.0f).scaleY(1.0f).setDuration(iBp).start();
                                wdkVar.j = false;
                            }
                            if (!z && !wdkVar.i) {
                                long j3 = iBp;
                                view2.sendAccessibilityEvent(128);
                                view2.setPivotY((view2.getHeight() / 2) + wdkVar.d);
                                view2.animate().scaleX(1.3f).scaleY(1.3f).setDuration(j3).start();
                                view3.animate().alpha(0.38f).setDuration(j3).start();
                                wdkVar.i = true;
                            } else if (z2 && !wdkVar.j) {
                                long j4 = iBp;
                                view3.sendAccessibilityEvent(128);
                                view3.setPivotY((view2.getHeight() / 2) + wdkVar.d);
                                view3.animate().scaleX(1.3f).scaleY(1.3f).setDuration(j4).start();
                                view2.animate().alpha(0.38f).setDuration(j4).start();
                                wdkVar.j = true;
                            }
                        }
                        b();
                        this.k.j(a(rawX + this.r, this.d, this.f));
                        this.l.j(a(rawY + this.s, this.e, this.g));
                    }
                }
                android.view.VelocityTracker velocityTracker2 = this.t;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                    return true;
                }
            } else if (actionMasked == 3 && this.o) {
                d();
                this.o = false;
                this.c.h();
                return true;
            }
        } else if (!this.o || this.t == null) {
            view.performClick();
            if (this.j) {
                this.c.i();
            }
        } else {
            android.content.Context context5 = this.a;
            this.t.computeCurrentVelocity(1000, android.view.ViewConfiguration.get(context5).getScaledMaximumFlingVelocity());
            float xVelocity = this.t.getXVelocity();
            float yVelocity = this.t.getYVelocity();
            if (e(xVelocity, yVelocity)) {
                ejy ejyVar2 = this.v;
                wdx wdxVar3 = this.c;
                int iA = (int) ejyVar2.a(wdxVar3.i);
                int iA2 = (int) this.m.a(wdxVar3.i);
                if (this.u == null) {
                    android.widget.Scroller scroller = new android.widget.Scroller(context5);
                    this.u = scroller;
                    scroller.setFriction(android.view.ViewConfiguration.getScrollFriction() * 4.0f);
                }
                int i7 = this.d;
                int i8 = this.f;
                this.u.fling(iA, iA2, (int) xVelocity, (int) yVelocity, i7, i8, this.e, this.g);
                int finalY = this.u.getFinalY();
                this.u.abortAnimation();
                if (!e(xVelocity, 0.0f) ? true == f(iA) : xVelocity > 0.0f) {
                    i7 = i8;
                }
                android.graphics.Point point = new android.graphics.Point(i7, finalY);
                this.k.j(point.x);
                this.l.j(point.y);
            } else {
                wdx wdxVar4 = this.c;
                aimz aimzVar = wdx.a;
                aimzVar.b().l("com/android/dialer/widget/bubble/impl/BubbleImpl", "bottomActionDismissMaybe", 876, "BubbleImpl.java").v("bottomActionDismissMaybe");
                ahzi ahziVar = wdxVar4.w;
                defpackage.wdk wdkVar3 = (defpackage.wdk) ahziVar.eZ();
                if (android.text.TextUtils.getLayoutDirectionFromLocale(java.util.Locale.getDefault()) == 1 ? wdkVar3.j : wdkVar3.i) {
                    wdxVar4.g(rmw.gz);
                    wdxVar4.f();
                    wdxVar4.u = true;
                    j$.util.Optional optional = wdxVar4.l;
                    if (true == optional.isPresent()) {
                        ((pff) optional.get()).c(defpackage.wdf.f);
                    }
                } else {
                    aimzVar.b().l("com/android/dialer/widget/bubble/impl/BubbleImpl", "bottomActionEndCallMaybe", 895, "BubbleImpl.java").v("bottomActionEndCallMaybe");
                    defpackage.wdk wdkVar4 = (defpackage.wdk) ahziVar.eZ();
                    if (android.text.TextUtils.getLayoutDirectionFromLocale(java.util.Locale.getDefault()) == 1 ? wdkVar4.i : wdkVar4.j) {
                        wdxVar4.g(rmw.gA);
                        if (wdxVar4.l.isPresent()) {
                            ((pff) wdxVar4.l.orElseThrow()).c(defpackage.wdf.e);
                        } else {
                            a.bI(aimzVar.d(), "Unable to end the call when bubble is dragged to the bottom due to missing bubbleActionListener", "com/android/dialer/widget/bubble/impl/BubbleImpl", "bottomActionEndCallMaybe", (char) 906, "BubbleImpl.java", zct.b);
                        }
                    } else {
                        d();
                    }
                }
            }
            this.o = false;
            this.c.h();
        }
        return true;
    }
}
