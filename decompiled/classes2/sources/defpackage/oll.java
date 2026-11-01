package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class oll {
    public ols a;
    public com.airbnb.lottie.LottieAnimationView b;
    public androidx.viewpager.widget.ViewPager c;
    public android.widget.ImageButton d;
    public android.widget.ImageButton e;
    public android.widget.Button f;
    public android.widget.Button g;
    public final j$.util.Optional h;
    public final com.android.dialer.featuredemo.FeatureDemoActivity i;
    public final rlv j;
    public boolean k;
    public int l;
    public final rhx m;
    public final zjm n;
    public final zjm o;
    private android.animation.ValueAnimator p;
    private j$.util.Optional q = j$.util.Optional.empty();

    public oll(j$.util.Optional optional, zjm zjmVar, zjm zjmVar2, com.android.dialer.featuredemo.FeatureDemoActivity featureDemoActivity, rlv rlvVar, rhx rhxVar) {
        this.h = optional;
        this.n = zjmVar;
        this.o = zjmVar2;
        this.i = featureDemoActivity;
        this.j = rlvVar;
        this.m = rhxVar;
    }

    public static android.content.Intent a(android.content.Context context, defpackage.oln olnVar) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.android.dialer.featuredemo.FeatureDemoActivity.class);
        intent.putExtra("feature_demo_ui_config", olnVar.i());
        return intent;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [android.content.Context, com.android.dialer.featuredemo.FeatureDemoActivity] */
    public final void b(final int i) {
        if (this.p == null) {
            android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
            this.p = valueAnimator;
            valueAnimator.setInterpolator(wsc.bq(this.i, urq.e));
        }
        if (this.p.isStarted()) {
            this.p.end();
        }
        this.p.removeAllListeners();
        this.p.removeAllUpdateListeners();
        final int i2 = this.l;
        this.p.setIntValues(0, this.c.getWidth() * (this.l - i));
        android.animation.ValueAnimator valueAnimator2 = this.p;
        ?? r2 = this.i;
        valueAnimator2.setDuration(((long) wsc.bp((android.content.Context) r2, urp.j)) * ((long) java.lang.Math.abs(this.l - i)));
        android.animation.ValueAnimator valueAnimator3 = this.p;
        ems emsVarP = r2.P();
        defpackage.hrv hrvVar = new defpackage.hrv();
        hrvVar.d(new java.util.function.Consumer() { // from class: olf
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                defpackage.oll ollVar = this.a;
                ollVar.l = i;
                ols olsVar = ollVar.a;
                int i3 = i2;
                olsVar.i(i3);
                androidx.viewpager.widget.ViewPager viewPager = ollVar.c;
                if (!viewPager.h) {
                    viewPager.n = true;
                    viewPager.p(1);
                    viewPager.i = 0.0f;
                    viewPager.j = 0.0f;
                    android.view.VelocityTracker velocityTracker = viewPager.l;
                    if (velocityTracker == null) {
                        viewPager.l = android.view.VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    long jUptimeMillis = android.os.SystemClock.uptimeMillis();
                    android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, 0.0f, 0.0f, 0);
                    viewPager.l.addMovement(motionEventObtain);
                    motionEventObtain.recycle();
                    viewPager.o = jUptimeMillis;
                }
                ollVar.d(i3, ollVar.l);
                ollVar.c(ollVar.l);
                ollVar.k = true;
            }

            @Override // java.util.function.Consumer
            public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
            }
        });
        hrvVar.c(new defpackage.hru() { // from class: olg
            @Override // defpackage.hru
            public final void a(boolean z) {
                defpackage.oll ollVar = this.a;
                androidx.viewpager.widget.ViewPager viewPager = ollVar.c;
                if (!viewPager.n) {
                    throw new java.lang.IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
                }
                if (viewPager.c != null) {
                    android.view.VelocityTracker velocityTracker = viewPager.l;
                    velocityTracker.computeCurrentVelocity(1000, viewPager.m);
                    int xVelocity = (int) velocityTracker.getXVelocity(viewPager.k);
                    viewPager.g = true;
                    int iB = viewPager.b();
                    int scrollX = viewPager.getScrollX();
                    defpackage.gmm gmmVarE = viewPager.e();
                    viewPager.o(viewPager.a(gmmVarE.b, ((scrollX / iB) - gmmVarE.e) / gmmVarE.d, xVelocity, (int) (viewPager.i - viewPager.j)), true, true, xVelocity);
                }
                int i3 = i;
                viewPager.i();
                viewPager.n = false;
                ollVar.c.n(i3, false);
            }
        });
        valueAnimator3.addListener(new defpackage.hry(emsVarP, hrvVar.a()));
        this.p.addUpdateListener(new defpackage.oli(this));
        this.p.start();
    }

    public final void c(int i) {
        boolean z;
        int size = this.a.b().size();
        if (this.a.j() && i == 0) {
            z = true;
            i = 0;
        } else {
            z = false;
        }
        int i2 = size - 1;
        this.d.setVisibility(i == 0 ? 8 : 0);
        this.e.setVisibility(i == i2 ? 8 : 0);
        this.g.setVisibility(true != z ? 8 : 0);
        this.f.setVisibility(i != i2 ? 8 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [android.animation.Animator$AnimatorListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [android.animation.Animator$AnimatorListener, java.lang.Object] */
    public final void d(int i, int i2) {
        j$.util.Optional optionalOf;
        if (this.a.c().isPresent()) {
            this.b.c();
            this.b.p(-1);
            j$.util.Optional optional = this.q;
            com.airbnb.lottie.LottieAnimationView lottieAnimationView = this.b;
            j$.util.Objects.requireNonNull(lottieAnimationView);
            defpackage.lwx lwxVar = new defpackage.lwx(lottieAnimationView, 20);
            if (true == optional.isPresent()) {
                ((com.airbnb.lottie.LottieAnimationView) lwxVar.a).f(optional.get());
            }
            if (i == i2) {
                e(this.a.a(i2), true);
                this.b.e();
                return;
            }
            ols olsVar = this.a;
            if (i < i2) {
                j$.util.Optional optionalG = olsVar.g(i2);
                defpackage.olq olqVarA = this.a.a(i2);
                if (optionalG.isPresent()) {
                    e((defpackage.olq) optionalG.orElseThrow(), true);
                    optionalOf = j$.util.Optional.of(defpackage.hrz.b(this.i.P(), new defpackage.olh(this, olqVarA, 1, null)));
                } else {
                    e(olqVarA, true);
                    optionalOf = j$.util.Optional.empty();
                }
            } else {
                j$.util.Optional optionalG2 = olsVar.g(i2 + 1);
                defpackage.olq olqVarA2 = this.a.a(i2);
                if (optionalG2.isPresent()) {
                    e((defpackage.olq) optionalG2.orElseThrow(), false);
                    optionalOf = j$.util.Optional.of(defpackage.hrz.b(this.i.P(), new defpackage.olh(this, olqVarA2, 0)));
                } else {
                    e(olqVarA2, true);
                    optionalOf = j$.util.Optional.empty();
                }
            }
            this.q = optionalOf;
            com.airbnb.lottie.LottieAnimationView lottieAnimationView2 = this.b;
            j$.util.Objects.requireNonNull(lottieAnimationView2);
            defpackage.lwx lwxVar2 = new defpackage.lwx(lottieAnimationView2, 17);
            if (true == optionalOf.isPresent()) {
                ((com.airbnb.lottie.LottieAnimationView) lwxVar2.a).a(optionalOf.get());
            }
            this.b.e();
        }
    }

    public final void e(defpackage.olq olqVar, boolean z) {
        this.b.r(true != z ? -1.0f : 1.0f);
        this.b.n(olqVar.a, olqVar.b);
        com.airbnb.lottie.LottieAnimationView lottieAnimationView = this.b;
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
        alphaAnimation.setDuration(olqVar.c);
        android.view.animation.AnimationSet animationSet = new android.view.animation.AnimationSet(false);
        animationSet.addAnimation(alphaAnimation);
        lottieAnimationView.setAnimation(animationSet);
    }
}
