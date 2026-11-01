package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class oyc implements android.view.View.OnTouchListener {
    public static final aimz a = aimz.i("com/android/dialer/incall/answer/method/ui/FlingUpDownAnswerMethodFragmentPeer");
    private android.animation.AnimatorSet A;
    private android.animation.Animator B;
    public final android.content.Context b;
    public final defpackage.oxq c;
    public final ems d;
    public final defpackage.ovp e;
    public final ahpz f;
    public final tec g;
    public final j$.util.Optional h;
    public final rlv i;
    public final defpackage.agzc j;
    public final odo k;
    public android.animation.Animator m;
    public android.animation.AnimatorSet n;
    public float q;
    public android.animation.Animator r;
    public final ops w;
    public final gpd x;
    public final defpackage.afpl y;
    private android.animation.AnimatorSet z;
    public boolean l = false;
    public int o = 0;
    public int p = 0;
    public j$.util.Optional s = j$.util.Optional.empty();
    public j$.util.Optional t = j$.util.Optional.empty();
    final odm u = new iyh(this, 12);
    final defpackage.oye v = new defpackage.oyo(this, 1);

    public oyc(android.content.Context context, defpackage.oxq oxqVar, ems emsVar, ops opsVar, defpackage.afpl afplVar, j$.util.Optional optional, rlv rlvVar, gpd gpdVar, defpackage.agzc agzcVar, odo odoVar, tec tecVar, ahpz ahpzVar) {
        this.b = context;
        this.c = oxqVar;
        this.d = emsVar;
        this.w = opsVar;
        this.y = afplVar;
        this.h = optional;
        this.i = rlvVar;
        this.x = gpdVar;
        this.j = agzcVar;
        this.k = odoVar;
        this.g = tecVar;
        this.f = ahpzVar;
        this.e = new defpackage.ovp(context);
    }

    private static boolean A(android.content.Context context) {
        return android.provider.Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f || ((android.os.PowerManager) context.getSystemService(android.os.PowerManager.class)).isPowerSaveMode();
    }

    private final boolean B() {
        if (this.t.isPresent() && ((defpackage.own) this.t.orElseThrow()).f) {
            defpackage.abwd abwdVar = ((defpackage.own) this.t.orElseThrow()).g;
            if (!abwdVar.e.isEmpty() || abwdVar.f != 0) {
                return true;
            }
        }
        return false;
    }

    public static void g(android.view.View view, float f) {
        view.setAlpha((view.getAlpha() * 0.5f) + (f * 0.5f));
    }

    public static void h(android.view.View view, float f) {
        view.setTranslationY((view.getTranslationY() * 0.5f) + (f * 0.5f));
    }

    private static android.animation.Animator r(android.view.View view, float f, float f2, long j, android.animation.TimeInterpolator timeInterpolator) {
        android.animation.ObjectAnimator objectAnimatorOfPropertyValuesHolder = android.animation.ObjectAnimator.ofPropertyValuesHolder(view, android.animation.PropertyValuesHolder.ofFloat((android.util.Property<?, java.lang.Float>) android.view.View.SCALE_X, f, f2), android.animation.PropertyValuesHolder.ofFloat((android.util.Property<?, java.lang.Float>) android.view.View.SCALE_Y, f, f2));
        objectAnimatorOfPropertyValuesHolder.setDuration(j);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    private static android.animation.ObjectAnimator s(android.view.View view, float f, long j) {
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(view, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.ALPHA, f);
        objectAnimatorOfFloat.setDuration(j);
        return objectAnimatorOfFloat;
    }

    private final android.widget.ImageView t() {
        return (android.widget.ImageView) ((aw) this.c).Q.findViewById(2131428403);
    }

    private final android.widget.ImageView u() {
        return (android.widget.ImageView) ((aw) this.c).Q.findViewById(2131428405);
    }

    private final void v(android.animation.AnimatorSet animatorSet) {
        android.animation.Animator animator = this.B;
        if (animator != null) {
            animator.end();
        }
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(u(), (android.util.Property<android.widget.ImageView, java.lang.Float>) android.view.View.ROTATION, 0.0f, 2.0f);
        this.B = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(1833L);
        this.B.setInterpolator(new defpackage.oyb(this.b));
        animatorSet.play(this.B).after(0L);
    }

    private static void w(android.view.View view, float f) {
        view.setRotation((view.getRotation() * 0.5f) + (f * 0.5f));
    }

    private final void x(int i) {
        j$.util.Optional optionalD = d();
        defpackage.oxt oxtVar = new defpackage.oxt(i, 1);
        if (true == optionalD.isPresent()) {
            ((android.widget.TextView) optionalD.get()).setVisibility(oxtVar.a);
        }
        a().setVisibility(i);
        t().setVisibility(i);
        u().setVisibility(i);
    }

    private final void y() {
        a.b().l("com/android/dialer/incall/answer/method/ui/FlingUpDownAnswerMethodFragmentPeer", "startSwipeToAnswerEntryAnimation", 796, "FlingUpDownAnswerMethodFragmentPeer.java").v("Swipe entry animation.");
        f();
        this.z = new android.animation.AnimatorSet();
        android.content.Context context = this.b;
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(a(), (android.util.Property<android.view.View, java.lang.Float>) android.view.View.TRANSLATION_Y, mni.cA(context, 400.0f), mni.cA(context, -12.0f));
        objectAnimatorOfFloat.setDuration(1500L);
        defpackage.oxq oxqVar = this.c;
        az azVarG = oxqVar.G();
        defpackage.urq urqVar = defpackage.urq.EASING_STANDARD_DECELERATE;
        objectAnimatorOfFloat.setInterpolator(wsc.bq(azVarG, urqVar));
        android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(a(), (android.util.Property<android.view.View, java.lang.Float>) android.view.View.TRANSLATION_Y, mni.cA(context, -12.0f), 0.0f);
        objectAnimatorOfFloat2.setDuration(1333L);
        objectAnimatorOfFloat2.setInterpolator(wsc.bq(oxqVar.G(), urqVar));
        android.animation.Animator animatorR = r(t(), 0.33f, 1.1f, 1333L, new android.view.animation.PathInterpolator(0.4f, 0.0f, 0.0f, 1.0f));
        android.animation.Animator animatorR2 = r(t(), 1.1f, 1.0f, 1333L, wsc.bq(oxqVar.G(), defpackage.urq.EASING_STANDARD));
        if (d().isPresent() && e().isPresent()) {
            android.animation.ObjectAnimator objectAnimatorOfFloat3 = android.animation.ObjectAnimator.ofFloat((android.view.View) d().orElseThrow(), (android.util.Property<android.view.View, java.lang.Float>) android.view.View.TRANSLATION_Y, mni.cA(context, 192.0f), mni.cA(context, -20.0f));
            objectAnimatorOfFloat3.setDuration(1333L);
            objectAnimatorOfFloat3.setInterpolator(wsc.bq(oxqVar.G(), urqVar));
            android.animation.ObjectAnimator objectAnimatorOfFloat4 = android.animation.ObjectAnimator.ofFloat((android.view.View) d().orElseThrow(), (android.util.Property<android.view.View, java.lang.Float>) android.view.View.TRANSLATION_Y, mni.cA(context, -20.0f), 0.0f);
            objectAnimatorOfFloat4.setDuration(1333L);
            objectAnimatorOfFloat4.setInterpolator(wsc.bq(oxqVar.G(), urqVar));
            j$.util.Optional optionalE = e();
            if (true == optionalE.isPresent()) {
                ((android.widget.TextView) optionalE.get()).setAlpha(0.0f);
            }
            android.animation.ObjectAnimator objectAnimatorOfPropertyValuesHolder = android.animation.ObjectAnimator.ofPropertyValuesHolder(e().orElseThrow(), android.animation.PropertyValuesHolder.ofFloat((android.util.Property<?, java.lang.Float>) android.view.View.ALPHA, 1.0f), android.animation.PropertyValuesHolder.ofFloat((android.util.Property<?, java.lang.Float>) android.view.View.TRANSLATION_Y, mni.cA(context, -8.0f), 0.0f));
            objectAnimatorOfPropertyValuesHolder.setInterpolator(wsc.bq(oxqVar.G(), defpackage.urq.EASING_STANDARD_ACCELERATE));
            objectAnimatorOfPropertyValuesHolder.setDuration(667L);
            objectAnimatorOfPropertyValuesHolder.setStartDelay(333L);
            this.z.play(objectAnimatorOfFloat).with(animatorR).with(objectAnimatorOfFloat3);
            this.z.play(objectAnimatorOfFloat2).with(animatorR2).with(objectAnimatorOfPropertyValuesHolder).with(objectAnimatorOfFloat4).after(objectAnimatorOfFloat);
        } else {
            this.z.play(objectAnimatorOfFloat).with(animatorR);
            this.z.play(objectAnimatorOfFloat2).with(animatorR2).after(objectAnimatorOfFloat);
        }
        v(this.z);
        this.z.addListener(hrz.a(this.d, new defpackage.oxr(this, 1)));
        this.z.start();
    }

    private final void z() {
        float f;
        switch (this.o) {
            case 1:
                y();
                break;
            case 2:
                f();
                android.content.Context context = this.b;
                if (!A(context)) {
                    android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                    android.view.View viewA = a();
                    android.widget.ImageView imageViewT = t();
                    android.view.animation.PathInterpolator pathInterpolator = new android.view.animation.PathInterpolator(0.4f, 0.0f, 0.0f, 1.0f);
                    android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(viewA, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.TRANSLATION_Y, -mni.cA(context, 42.0f));
                    objectAnimatorOfFloat.setInterpolator(pathInterpolator);
                    objectAnimatorOfFloat.setDuration(1500L);
                    android.animation.Animator animatorR = r(imageViewT, 1.0f, 1.0625f, 1333L, pathInterpolator);
                    android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(viewA, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.TRANSLATION_Y, 0.0f);
                    defpackage.oxq oxqVar = this.c;
                    az azVarG = oxqVar.G();
                    defpackage.urq urqVar = defpackage.urq.EASING_STANDARD_DECELERATE;
                    objectAnimatorOfFloat2.setInterpolator(wsc.bq(azVarG, urqVar));
                    objectAnimatorOfFloat2.setDuration(1333L);
                    az azVarG2 = oxqVar.G();
                    defpackage.urq urqVar2 = defpackage.urq.EASING_STANDARD;
                    android.animation.Animator animatorR2 = r(imageViewT, 1.0625f, 1.0f, 1333L, wsc.bq(azVarG2, urqVar2));
                    if (d().isPresent() && e().isPresent()) {
                        android.widget.TextView textView = (android.widget.TextView) d().orElseThrow();
                        final android.widget.TextView textView2 = (android.widget.TextView) e().orElseThrow();
                        float f2 = -mni.cA(context, 42.0f);
                        android.animation.ObjectAnimator objectAnimatorOfFloat3 = android.animation.ObjectAnimator.ofFloat(textView, (android.util.Property<android.widget.TextView, java.lang.Float>) android.view.View.TRANSLATION_Y, 0.0f, f2);
                        objectAnimatorOfFloat3.setInterpolator(pathInterpolator);
                        objectAnimatorOfFloat3.setStartDelay(20L);
                        objectAnimatorOfFloat3.setDuration(1333L);
                        android.animation.ObjectAnimator objectAnimatorOfFloat4 = android.animation.ObjectAnimator.ofFloat(textView, (android.util.Property<android.widget.TextView, java.lang.Float>) android.view.View.TRANSLATION_Y, f2, 0.0f);
                        objectAnimatorOfFloat4.setInterpolator(wsc.bq(oxqVar.G(), urqVar));
                        objectAnimatorOfFloat4.setDuration(1333L);
                        android.animation.ObjectAnimator objectAnimatorOfFloat5 = android.animation.ObjectAnimator.ofFloat(textView2, (android.util.Property<android.widget.TextView, java.lang.Float>) android.view.View.ALPHA, 1.0f);
                        objectAnimatorOfFloat5.setInterpolator(wsc.bq(oxqVar.G(), urqVar));
                        objectAnimatorOfFloat5.setDuration(667L);
                        objectAnimatorOfFloat5.setStartDelay(333L);
                        defpackage.oxy oxyVar = new defpackage.oxy(this);
                        final float fCA = mni.cA(context, -8.0f);
                        android.animation.ObjectAnimator objectAnimatorOfFloat6 = android.animation.ObjectAnimator.ofFloat(textView2, oxyVar, 0.0f);
                        objectAnimatorOfFloat6.setInterpolator(wsc.bq(oxqVar.G(), urqVar2));
                        objectAnimatorOfFloat6.setDuration(1333L);
                        android.animation.ObjectAnimator objectAnimatorOfFloat7 = android.animation.ObjectAnimator.ofFloat(textView2, (android.util.Property<android.widget.TextView, java.lang.Float>) android.view.View.ALPHA, 0.0f);
                        objectAnimatorOfFloat7.setInterpolator(wsc.bq(oxqVar.G(), defpackage.urq.EASING_STANDARD_ACCELERATE));
                        objectAnimatorOfFloat7.setDuration(667L);
                        ems emsVar = this.d;
                        objectAnimatorOfFloat7.addListener(hrz.a(emsVar, new hru() { // from class: oxu
                            public final void a(boolean z) {
                                textView2.setTranslationY(fCA);
                            }
                        }));
                        objectAnimatorOfFloat5.addListener(hrz.a(emsVar, new defpackage.oxz(this, objectAnimatorOfFloat7)));
                        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat7).with(objectAnimatorOfFloat3).with(animatorR).after(167L);
                        animatorSet.play(objectAnimatorOfFloat2).with(objectAnimatorOfFloat4).with(animatorR2).with(objectAnimatorOfFloat5).with(objectAnimatorOfFloat6).after(objectAnimatorOfFloat);
                    } else {
                        animatorSet.play(objectAnimatorOfFloat).with(animatorR).after(167L);
                        animatorSet.play(objectAnimatorOfFloat2).with(animatorR2).after(objectAnimatorOfFloat);
                    }
                    v(animatorSet);
                    this.m = animatorSet;
                    if (this.l) {
                        this.h.isPresent();
                    }
                    this.m.addListener(hrz.a(this.d, new defpackage.oxr(this, 5)));
                    this.m.start();
                } else {
                    j$.util.Optional optionalD = d();
                    if (true == optionalD.isPresent()) {
                        f = 0.0f;
                        ((android.widget.TextView) optionalD.get()).setTranslationY(0.0f);
                    } else {
                        f = 0.0f;
                    }
                    a().setTranslationY(f);
                    t().setScaleY(1.0f);
                    t().setScaleX(1.0f);
                    j$.util.Optional optionalE = e();
                    if (true == optionalE.isPresent()) {
                        android.widget.TextView textView3 = (android.widget.TextView) optionalE.get();
                        textView3.setAlpha(1.0f);
                        textView3.setTranslationY(0.0f);
                    }
                }
                break;
            case 3:
                a.b().l("com/android/dialer/incall/answer/method/ui/FlingUpDownAnswerMethodFragmentPeer", "startSwipeToAnswerSwipeAnimation", 699, "FlingUpDownAnswerMethodFragmentPeer.java").v("Start swipe animation.");
                l();
                f();
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                int iBp = wsc.bp(this.c.G(), defpackage.urp.DURATION_SHORT_2);
                f();
                android.animation.ObjectAnimator objectAnimatorOfPropertyValuesHolder = android.animation.ObjectAnimator.ofPropertyValuesHolder(t(), android.animation.PropertyValuesHolder.ofFloat((android.util.Property<?, java.lang.Float>) android.view.View.SCALE_X, 1.0f), android.animation.PropertyValuesHolder.ofFloat((android.util.Property<?, java.lang.Float>) android.view.View.SCALE_Y, 1.0f));
                long j = iBp;
                objectAnimatorOfPropertyValuesHolder.setDuration(j);
                android.animation.ObjectAnimator objectAnimatorOfFloat8 = android.animation.ObjectAnimator.ofFloat(u(), (android.util.Property<android.widget.ImageView, java.lang.Float>) android.view.View.ROTATION, 0.0f);
                objectAnimatorOfFloat8.setDuration(j);
                android.animation.ObjectAnimator objectAnimatorS = s(a(), 1.0f, j);
                android.animation.ObjectAnimator objectAnimatorS2 = s(t(), 1.0f, j);
                android.animation.ObjectAnimator objectAnimatorS3 = s(u(), true != B() ? 1.0f : 0.0f, j);
                android.animation.ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = android.animation.ObjectAnimator.ofPropertyValuesHolder(a(), android.animation.PropertyValuesHolder.ofFloat((android.util.Property<?, java.lang.Float>) android.view.View.TRANSLATION_X, 0.0f), android.animation.PropertyValuesHolder.ofFloat((android.util.Property<?, java.lang.Float>) android.view.View.TRANSLATION_Y, 0.0f));
                objectAnimatorOfPropertyValuesHolder2.setDuration(j);
                this.n = new android.animation.AnimatorSet();
                if (d().isPresent()) {
                    this.n.play(objectAnimatorOfPropertyValuesHolder).with(objectAnimatorOfFloat8).with(s((android.view.View) d().orElseThrow(), 1.0f, j)).with(objectAnimatorS).with(objectAnimatorS2).with(objectAnimatorS3).with(objectAnimatorOfPropertyValuesHolder2);
                } else {
                    this.n.play(objectAnimatorOfPropertyValuesHolder).with(objectAnimatorOfFloat8).with(objectAnimatorS).with(objectAnimatorS2).with(objectAnimatorS3).with(objectAnimatorOfPropertyValuesHolder2);
                }
                android.animation.AnimatorSet animatorSet2 = this.n;
                ems emsVar2 = this.d;
                hrv hrvVar = new hrv();
                hrvVar.b(new defpackage.oxs(this, 0));
                hrvVar.c(new defpackage.oxr(this, 4));
                animatorSet2.addListener(new hry(emsVar2, hrvVar.a()));
                this.n.start();
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                android.animation.Animator animator = this.r;
                if (animator != null) {
                    animator.cancel();
                }
                f();
                l();
                android.content.Context context2 = this.b;
                if (!A(context2)) {
                    android.view.View viewA2 = a();
                    this.A = new android.animation.AnimatorSet();
                    float fCA2 = mni.cA(context2, 60.0f);
                    float fCA3 = mni.cA(context2, 8.0f);
                    float height = (t().getHeight() * 0.14999998f) + fCA2;
                    int integer = context2.getResources().getInteger(android.R.integer.config_shortAnimTime);
                    int integer2 = context2.getResources().getInteger(android.R.integer.config_mediumAnimTime);
                    android.animation.ObjectAnimator objectAnimatorOfPropertyValuesHolder3 = android.animation.ObjectAnimator.ofPropertyValuesHolder(viewA2, android.animation.PropertyValuesHolder.ofFloat((android.util.Property<?, java.lang.Float>) android.view.View.SCALE_Y, 0.95f), android.animation.PropertyValuesHolder.ofFloat((android.util.Property<?, java.lang.Float>) android.view.View.SCALE_X, 1.05f));
                    objectAnimatorOfPropertyValuesHolder3.setRepeatCount(1);
                    objectAnimatorOfPropertyValuesHolder3.setRepeatMode(2);
                    long j2 = integer / 2;
                    objectAnimatorOfPropertyValuesHolder3.setDuration(j2);
                    defpackage.oxq oxqVar2 = this.c;
                    az azVarG3 = oxqVar2.G();
                    defpackage.urq urqVar3 = defpackage.urq.EASING_STANDARD_DECELERATE;
                    objectAnimatorOfPropertyValuesHolder3.setInterpolator(wsc.bq(azVarG3, urqVar3));
                    ems emsVar3 = this.d;
                    hrv hrvVar2 = new hrv();
                    hrvVar2.d(new fcg(viewA2, 20));
                    hrvVar2.c(new defpackage.oxr(viewA2, 0));
                    objectAnimatorOfPropertyValuesHolder3.addListener(new hry(emsVar3, hrvVar2.a()));
                    objectAnimatorOfPropertyValuesHolder3.setInterpolator(wsc.bq(oxqVar2.G(), urqVar3));
                    android.animation.ObjectAnimator objectAnimatorOfPropertyValuesHolder4 = android.animation.ObjectAnimator.ofPropertyValuesHolder(a(), android.animation.PropertyValuesHolder.ofFloat((android.util.Property<?, java.lang.Float>) android.view.View.TRANSLATION_Y, 0.0f), android.animation.PropertyValuesHolder.ofFloat((android.util.Property<?, java.lang.Float>) android.view.View.TRANSLATION_X, 0.0f));
                    objectAnimatorOfPropertyValuesHolder4.setDuration(j2);
                    android.animation.ObjectAnimator objectAnimatorOfFloat9 = android.animation.ObjectAnimator.ofFloat(a(), (android.util.Property<android.view.View, java.lang.Float>) android.view.View.TRANSLATION_Y, -fCA2);
                    objectAnimatorOfFloat9.setInterpolator(wsc.bq(oxqVar2.G(), urqVar3));
                    long j3 = integer;
                    objectAnimatorOfFloat9.setDuration(j3);
                    android.animation.Animator animatorR3 = r(t(), 1.0f, 1.15f, j3, wsc.bq(oxqVar2.G(), urqVar3));
                    android.animation.ObjectAnimator objectAnimatorOfFloat10 = android.animation.ObjectAnimator.ofFloat(a(), (android.util.Property<android.view.View, java.lang.Float>) android.view.View.TRANSLATION_Y, 0.0f);
                    objectAnimatorOfFloat10.setInterpolator(new android.view.animation.BounceInterpolator());
                    long j4 = integer2;
                    objectAnimatorOfFloat10.setDuration(j4);
                    android.animation.Animator animatorR4 = r(t(), 1.15f, 1.0f, j3, wsc.bq(oxqVar2.G(), urqVar3));
                    if (d().isPresent() && e().isPresent()) {
                        android.animation.ObjectAnimator objectAnimatorOfFloat11 = android.animation.ObjectAnimator.ofFloat((android.view.View) d().orElseThrow(), (android.util.Property<android.view.View, java.lang.Float>) android.view.View.TRANSLATION_Y, -height);
                        objectAnimatorOfFloat11.setInterpolator(wsc.bq(oxqVar2.G(), urqVar3));
                        objectAnimatorOfFloat11.setDuration(j3);
                        android.animation.ObjectAnimator objectAnimatorOfPropertyValuesHolder5 = android.animation.ObjectAnimator.ofPropertyValuesHolder(e().orElseThrow(), android.animation.PropertyValuesHolder.ofFloat((android.util.Property<?, java.lang.Float>) android.view.View.ALPHA, 1.0f), android.animation.PropertyValuesHolder.ofFloat((android.util.Property<?, java.lang.Float>) android.view.View.TRANSLATION_Y, 0.0f));
                        objectAnimatorOfPropertyValuesHolder5.setDuration(j3);
                        android.animation.ObjectAnimator objectAnimatorOfFloat12 = android.animation.ObjectAnimator.ofFloat((android.view.View) e().orElseThrow(), (android.util.Property<android.view.View, java.lang.Float>) android.view.View.TRANSLATION_Y, fCA3);
                        objectAnimatorOfFloat12.setInterpolator(wsc.bq(oxqVar2.G(), urqVar3));
                        objectAnimatorOfFloat12.setDuration(j3);
                        android.animation.ObjectAnimator objectAnimatorOfFloat13 = android.animation.ObjectAnimator.ofFloat((android.view.View) d().orElseThrow(), (android.util.Property<android.view.View, java.lang.Float>) android.view.View.TRANSLATION_Y, 0.0f);
                        objectAnimatorOfFloat13.setInterpolator(wsc.bq(oxqVar2.G(), urqVar3));
                        objectAnimatorOfFloat13.setDuration(j4);
                        android.animation.ObjectAnimator objectAnimatorOfFloat14 = android.animation.ObjectAnimator.ofFloat((android.view.View) e().orElseThrow(), (android.util.Property<android.view.View, java.lang.Float>) android.view.View.TRANSLATION_Y, 0.0f);
                        objectAnimatorOfFloat14.setInterpolator(wsc.bq(oxqVar2.G(), urqVar3));
                        objectAnimatorOfFloat14.setDuration(j4);
                        this.A.play(objectAnimatorOfPropertyValuesHolder3).with(objectAnimatorOfPropertyValuesHolder4).before(objectAnimatorOfFloat9);
                        this.A.play(objectAnimatorOfFloat9).with(objectAnimatorOfFloat11).with(animatorR3).with(objectAnimatorOfFloat12).with(objectAnimatorOfPropertyValuesHolder5);
                        this.A.play(objectAnimatorOfFloat10).with(objectAnimatorOfFloat13).with(animatorR4).with(objectAnimatorOfFloat14).after(objectAnimatorOfFloat9);
                        this.A.start();
                        android.animation.ObjectAnimator objectAnimatorOfFloat15 = android.animation.ObjectAnimator.ofFloat((android.view.View) e().orElseThrow(), (android.util.Property<android.view.View, java.lang.Float>) android.view.View.ALPHA, 0.0f);
                        this.r = objectAnimatorOfFloat15;
                        objectAnimatorOfFloat15.setStartDelay(2000L);
                        android.animation.Animator animator2 = this.r;
                        hrv hrvVar3 = new hrv();
                        hrvVar3.b(new defpackage.oxs(this, 1));
                        hrvVar3.c(new defpackage.oxr(this, 3));
                        animator2.addListener(new hry(emsVar3, hrvVar3.a()));
                        this.r.start();
                    } else {
                        this.A.play(objectAnimatorOfPropertyValuesHolder3).with(objectAnimatorOfPropertyValuesHolder4).before(objectAnimatorOfFloat9);
                        this.A.play(objectAnimatorOfFloat9).with(animatorR3);
                        this.A.play(objectAnimatorOfFloat10).with(animatorR4).after(objectAnimatorOfFloat9);
                        this.A.addListener(hrz.a(emsVar3, new defpackage.oxr(this, 2)));
                        this.A.start();
                    }
                } else {
                    i(false);
                }
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                a.b().l("com/android/dialer/incall/answer/method/ui/FlingUpDownAnswerMethodFragmentPeer", "clearSwipeToAnswerUi", 1371, "FlingUpDownAnswerMethodFragmentPeer.java").v("Clear swipe animation.");
                f();
                x(8);
                break;
            default:
                a.c().m(aioa.b).i(zct.b).l("com/android/dialer/incall/answer/method/ui/FlingUpDownAnswerMethodFragmentPeer", "updateAnimationState", 790, "FlingUpDownAnswerMethodFragmentPeer.java").w("Unexpected animation state: %d", this.o);
                break;
        }
    }

    public final android.view.View a() {
        return ((aw) this.c).Q.findViewById(2131428404);
    }

    public final android.view.View b() {
        return ((aw) this.c).Q.findViewById(2131428401);
    }

    public final android.widget.TextView c() {
        return (android.widget.TextView) ((aw) this.c).Q.findViewById(2131428412);
    }

    public final j$.util.Optional d() {
        return j$.util.Optional.ofNullable((android.widget.TextView) ((aw) this.c).Q.findViewById(2131428410));
    }

    public final j$.util.Optional e() {
        return j$.util.Optional.ofNullable((android.widget.TextView) ((aw) this.c).Q.findViewById(2131428411));
    }

    final void f() {
        a.b().l("com/android/dialer/incall/answer/method/ui/FlingUpDownAnswerMethodFragmentPeer", "endAnimation", 1410, "FlingUpDownAnswerMethodFragmentPeer.java").v("End animations.");
        android.animation.AnimatorSet animatorSet = this.n;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.n = null;
        }
        android.animation.Animator animator = this.m;
        if (animator != null) {
            animator.cancel();
            this.m = null;
        }
        android.animation.AnimatorSet animatorSet2 = this.z;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
            this.z = null;
        }
        android.animation.AnimatorSet animatorSet3 = this.A;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
            this.A = null;
        }
        android.animation.Animator animator2 = this.r;
        if (animator2 != null) {
            animator2.cancel();
            this.r = null;
        }
        android.animation.Animator animator3 = this.B;
        if (animator3 != null) {
            animator3.end();
            this.B = null;
        }
        if (this.l) {
            this.h.isPresent();
        }
    }

    final void i(boolean z) {
        if (!z && this.o == 5) {
            o(2);
        }
        this.r = null;
    }

    public final void j() {
        ahoq ahoqVarW = ahvr.W(444, "FlingUpDownAnswerMethodFragmentPeer_performAccept");
        try {
            a.b().l("com/android/dialer/incall/answer/method/ui/FlingUpDownAnswerMethodFragmentPeer", "performAccept", 1486, "FlingUpDownAnswerMethodFragmentPeer.java").v("perform accept");
            j$.util.Optional optional = this.t;
            defpackage.oys oysVar = new defpackage.oys(this, 1);
            if (true == optional.isPresent()) {
                defpackage.own ownVar = (defpackage.own) optional.get();
                zas zasVarI = ((defpackage.oyc) oysVar.a).x.i(ownVar.a);
                if (ownVar.h) {
                    zasVarI.b(mce.aH);
                } else if (ownVar.l) {
                    zasVarI.b(mce.aq);
                } else if (!ownVar.i && !ownVar.f) {
                    zasVarI.b(mce.ap);
                    zasVarI.b(mce.ar);
                }
            }
            x(8);
            o(6);
            j$.util.Optional optional2 = this.t;
            orq orqVar = new orq(this, 15);
            if (true == optional2.isPresent()) {
                ahvr.i(pez.am((defpackage.own) optional2.get()), ((defpackage.oyc) orqVar.a).c);
            }
            ahoqVarW.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void k() {
        a.b().l("com/android/dialer/incall/answer/method/ui/FlingUpDownAnswerMethodFragmentPeer", "performReject", 1513, "FlingUpDownAnswerMethodFragmentPeer.java").v("perform reject");
        j$.util.Optional optionalOfNullable = this.t;
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(((defpackage.own) optionalOfNullable.get()).a);
        }
        this.x.i((java.lang.String) optionalOfNullable.orElse((java.lang.Object) null)).b(mce.aj);
        x(8);
        o(6);
        j$.util.Optional optional = this.t;
        orq orqVar = new orq(this, 19);
        if (true == optional.isPresent()) {
            ahvr.i(pez.al((defpackage.own) optional.get()), ((defpackage.oyc) orqVar.a).c);
        }
    }

    public final void l() {
        android.view.View viewA = a();
        viewA.animate().scaleX(1.0f);
        viewA.animate().scaleY(1.0f);
        android.widget.ImageView imageViewT = t();
        imageViewT.animate().scaleX(1.0f);
        imageViewT.animate().scaleY(1.0f);
        imageViewT.setBackgroundTintList(null);
        imageViewT.setColorFilter((android.graphics.ColorFilter) null);
        android.content.Context context = this.b;
        android.widget.ImageView imageViewU = u();
        imageViewU.setImageTintList(android.content.res.ColorStateList.valueOf(context.getColor(2131101257)));
        imageViewU.animate().rotation(0.0f);
        t().setActivated(((defpackage.oyf) this.s.orElseThrow()).b);
        j$.util.Optional optionalD = d();
        if (true == optionalD.isPresent()) {
            ((android.widget.TextView) optionalD.get()).animate().alpha(1.0f);
        }
        viewA.animate().alpha(1.0f);
        imageViewT.animate().alpha(1.0f);
        imageViewU.animate().alpha(true == B() ? 0.0f : 1.0f);
    }

    final void m() {
        a.b().l("com/android/dialer/incall/answer/method/ui/FlingUpDownAnswerMethodFragmentPeer", "resetViewState", 461, "FlingUpDownAnswerMethodFragmentPeer.java").v("reset");
        ((defpackage.oyf) this.s.orElseThrow()).a = true;
        j$.util.Optional optional = this.t;
        if (true == optional.isPresent()) {
            optional = ((defpackage.own) optional.get()).c;
            optional.getClass();
        }
        boolean zIsPresent = optional.isPresent();
        c().setVisibility(true != zIsPresent ? 8 : 0);
        c().setAlpha(true != zIsPresent ? 0.0f : 1.0f);
        b().setVisibility(true != zIsPresent ? 0 : 8);
        x(0);
        this.q = 0.0f;
        p();
        q();
        o(1);
        y();
        if (this.g.a(this.c.A())) {
            u().setImageTintList(android.content.res.ColorStateList.valueOf(this.b.getColor(2131099836)));
        }
    }

    public final void n() {
        a.b().l("com/android/dialer/incall/answer/method/ui/FlingUpDownAnswerMethodFragmentPeer", "resumeAnimation", 1383, "FlingUpDownAnswerMethodFragmentPeer.java").v("Resume animation.");
        if (((aw) this.c).Q != null) {
            if (this.g.a(this.b) && this.o != 6) {
                m();
                return;
            }
            int i = this.o;
            if (i != 3 && i != 5) {
                z();
                return;
            }
            this.q = 0.0f;
            p();
            this.v.b(false);
        }
    }

    public final void o(int i) {
        if (i == 5 || this.o != i) {
            if ((i == 5 || i == 2) && this.o == 3) {
                this.p = i;
                i = 4;
            }
            a.b().l("com/android/dialer/incall/answer/method/ui/FlingUpDownAnswerMethodFragmentPeer", "setAnimationState", 743, "FlingUpDownAnswerMethodFragmentPeer.java").w("animation state: %d", i);
            this.o = i;
            defpackage.oxq oxqVar = this.c;
            if (((aw) oxqVar).Q != null) {
                if (oxqVar.aG() && this.o == i) {
                    z();
                } else {
                    f();
                }
            }
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        if (view.getId() == 2131428409 || motionEvent.getActionMasked() != 0) {
            return false;
        }
        this.i.o(rmx.dj);
        return false;
    }

    public final void p() {
        android.widget.ImageView imageViewU = u();
        if (imageViewU != null) {
            j$.util.Optional optional = this.t;
            orq orqVar = new orq(imageViewU, 20);
            if (true == optional.isPresent()) {
                ((android.widget.ImageView) orqVar.a).setImageDrawable(((defpackage.own) optional.get()).e);
            }
            android.widget.ImageView imageViewT = t();
            int dimensionPixelSize = imageViewT.getResources().getDimensionPixelSize(true != B() ? 2131165316 : 2131165317);
            if (B()) {
                j$.util.Optional optional2 = this.t;
                hvp hvpVar = new hvp(this, imageViewT, 10);
                if (true == optional2.isPresent()) {
                    java.lang.Object obj = optional2.get();
                    ((defpackage.oyc) hvpVar.a).w.f((android.widget.ImageView) hvpVar.b, ((defpackage.own) obj).g, false);
                }
            }
            android.view.ViewGroup.LayoutParams layoutParams = imageViewT.getLayoutParams();
            layoutParams.height = dimensionPixelSize;
            layoutParams.width = dimensionPixelSize;
            imageViewT.setLayoutParams(layoutParams);
            imageViewU.setAlpha(true != B() ? 1.0f : 0.0f);
        }
    }

    public final void q() {
        float fAbs = java.lang.Math.abs(this.q);
        float f = this.q;
        j$.util.Optional optionalD = d();
        android.widget.ImageView imageViewU = u();
        android.view.View viewA = a();
        if (true == optionalD.isPresent()) {
            ((android.widget.TextView) optionalD.get()).animate().cancel();
        }
        imageViewU.animate().cancel();
        float fMax = java.lang.Math.max(0.0f, 1.0f - (java.lang.Math.abs(this.q) * 9.0f));
        defpackage.oxv oxvVar = new defpackage.oxv(fMax, 1);
        if (true == optionalD.isPresent()) {
            g((android.widget.TextView) optionalD.get(), oxvVar.a);
        }
        j$.util.Optional optionalE = e();
        defpackage.oxv oxvVar2 = new defpackage.oxv(fMax, 0);
        if (true == optionalE.isPresent()) {
            android.widget.TextView textView = (android.widget.TextView) optionalE.get();
            g(textView, java.lang.Math.min(oxvVar2.a, textView.getAlpha()));
        }
        android.widget.TextView textViewC = c();
        j$.util.Optional optionalOfNullable = this.t;
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = ((defpackage.own) optionalOfNullable.get()).c;
            optionalOfNullable.getClass();
        }
        defpackage.oxw oxwVar = new defpackage.oxw(fMax);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Float.valueOf(oxwVar.a));
        }
        g(textViewC, ((java.lang.Float) optionalOfNullable.orElse(java.lang.Float.valueOf(0.0f))).floatValue());
        if (true == optionalD.isPresent()) {
            android.widget.TextView textView2 = (android.widget.TextView) optionalD.get();
            textView2.setTranslationX((textView2.getTranslationX() * 0.5f) + 0.0f);
            h(textView2, 0.0f);
        }
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) ^ (-1);
        android.content.Context context = this.b;
        int iH = dwm.h(context.getColor(i < 0 ? 2131099760 : 2131099761), (int) (fAbs * 255.0f));
        android.widget.ImageView imageViewT = t();
        imageViewT.setBackgroundTintList(android.content.res.ColorStateList.valueOf(iH));
        imageViewT.setBackgroundTintMode(android.graphics.PorterDuff.Mode.SRC_OVER);
        imageViewT.setColorFilter(iH);
        if (i < 0 || (this.t.isPresent() && ((defpackage.own) this.t.orElseThrow()).f)) {
            w(imageViewU, 0.0f);
        } else {
            w(imageViewU, 135.0f * fAbs);
        }
        if (B()) {
            g(imageViewU, fAbs);
        }
        imageViewU.setImageTintList(android.content.res.ColorStateList.valueOf(dwm.h(imageViewU.getContext().getColor(2131101257), (int) ((1.0f - java.lang.Math.min(1.0f, fAbs * 4.0f)) * 255.0f))));
        float f2 = -this.q;
        if (i < 0) {
            h(viewA, f2 * mni.cA(context, 150.0f));
        } else {
            h(viewA, f2 * mni.cA(context, 24.0f));
        }
        ahvr.i(new defpackage.ozb(this.q), this.c);
    }
}
