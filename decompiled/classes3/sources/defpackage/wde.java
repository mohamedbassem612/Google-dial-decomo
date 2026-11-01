package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wde {
    public final com.airbnb.lottie.LottieAnimationView a;
    public boolean b;
    public boolean c;
    public int d;
    private final android.animation.Animator.AnimatorListener e;
    private final android.content.Context f;
    private final tkl g;

    public wde(android.content.Context context, tkl tklVar, com.airbnb.lottie.LottieAnimationView lottieAnimationView) {
        defpackage.tjm tjmVar = new defpackage.tjm(this, 2);
        this.e = tjmVar;
        this.f = context;
        this.g = tklVar;
        this.a = lottieAnimationView;
        lottieAnimationView.i("audio_indicator_animation.json");
        lottieAnimationView.a(tjmVar);
        lottieAnimationView.setVisibility(4);
        this.d = 1;
    }

    public final void a() {
        if (this.d == 1 && !this.c) {
            com.airbnb.lottie.LottieAnimationView lottieAnimationView = this.a;
            lottieAnimationView.n(0, 9);
            lottieAnimationView.p(0);
            lottieAnimationView.e();
            this.d = 2;
            lottieAnimationView.setVisibility(0);
        }
        this.b = false;
    }

    public final void b() {
        com.airbnb.lottie.LottieAnimationView lottieAnimationView = this.a;
        if (lottieAnimationView.getVisibility() == 0) {
            this.d = 1;
            lottieAnimationView.c();
            lottieAnimationView.setVisibility(4);
        }
        this.c = false;
    }

    public final void c() {
        this.b = true;
        if (d() || this.c) {
            b();
        }
    }

    public final boolean d() {
        if (android.provider.Settings.Global.getFloat(this.f.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f) {
            return true;
        }
        tkl tklVar = this.g;
        java.lang.Object objF = new mgf((mgu) tklVar.a, ((android.os.PowerManager) tklVar.c).isPowerSaveMode()).a(mgv.dY).f();
        aooh.e(objF, "ifTrue(...)");
        return ((java.lang.Boolean) objF).booleanValue();
    }
}
