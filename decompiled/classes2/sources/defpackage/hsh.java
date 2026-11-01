package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hsh extends android.animation.ValueAnimator {
    public static final aimz a = aimz.i("com/android/dialer/animation/ProgressAnimator");
    public final j$.util.Optional b;
    public final java.util.List c = new java.util.ArrayList();
    public final java.util.List d = new java.util.ArrayList();
    public final java.util.List e = new java.util.ArrayList();
    public final java.util.List f = new java.util.ArrayList();

    private hsh(j$.util.Optional optional) {
        this.b = optional;
    }

    public static defpackage.hsh a(j$.util.Optional optional, boolean z) {
        ahqr ahqpVar;
        defpackage.hsh hshVar = new defpackage.hsh(optional);
        hshVar.setFloatValues(0.0f, 1.0f);
        hshVar.addUpdateListener(new defpackage.mh(hshVar, 4, null));
        if (z) {
            defpackage.hse hseVar = new defpackage.hse(hshVar);
            long j = ahqx.a;
            ahqpVar = new ahqr(hseVar, hseVar);
        } else {
            defpackage.hse hseVar2 = new defpackage.hse(hshVar);
            long j2 = ahqx.a;
            ahqpVar = new ahqp(hseVar2);
        }
        hshVar.addListener(ahqpVar);
        return hshVar;
    }

    public static defpackage.hsh b() {
        return a(j$.util.Optional.empty(), false);
    }

    public static defpackage.hsh c() {
        return a(j$.util.Optional.empty(), true);
    }

    public final void d() {
        cancel();
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
    }

    public final void e(java.util.List list) {
        j$.util.Optional optionalOfNullable = this.b;
        int i = 1;
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(((emy) optionalOfNullable.get()).d);
        }
        emq emqVar = (emq) optionalOfNullable.orElse((java.lang.Object) null);
        if (emqVar == null || emqVar.a(emq.c)) {
            j$.util.Collection.-EL.removeIf(list, new defpackage.jvr(i));
        } else {
            a.b().l("com/android/dialer/animation/ProgressAnimator", "runAll", 239, "ProgressAnimator.java").y("Lifecycle state is: %s. Ignored and clear actions.", emqVar);
            list.clear();
        }
    }

    public final void f(defpackage.hsg hsgVar) {
        this.c.add(hsgVar);
    }

    public final void g(final float f, final float f2, final android.animation.TimeInterpolator timeInterpolator, defpackage.hsf hsfVar) {
        final defpackage.hsb hsbVar = new defpackage.hsb(hsfVar);
        if (f != f2) {
            f(new defpackage.hsg() { // from class: hsc
                @Override // defpackage.hsg
                public final boolean a(float f3) {
                    android.animation.TimeInterpolator timeInterpolator2 = timeInterpolator;
                    float f4 = f2;
                    float f5 = f;
                    hsbVar.a(f5 + ((f4 - f5) * timeInterpolator2.getInterpolation(f3)));
                    return false;
                }
            });
        }
    }

    public final void h(defpackage.hsf hsfVar) {
        f(new defpackage.hsb(hsfVar));
    }

    public final void i(java.lang.Runnable runnable) {
        this.f.add(new rai(runnable));
    }

    public final void j(final float f, final float f2, final float f3, final android.animation.TimeInterpolator timeInterpolator, defpackage.hsf hsfVar) {
        final defpackage.hsb hsbVar = new defpackage.hsb(hsfVar);
        if (f <= 0.0f) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.getDefault(), "Invalid range %f to %f; must be increasing", java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(f)));
        }
        final float f4 = f + 0.0f;
        f(new defpackage.hsg() { // from class: hsd
            @Override // defpackage.hsg
            public final boolean a(float f5) {
                android.animation.TimeInterpolator timeInterpolator2 = timeInterpolator;
                float f6 = f;
                defpackage.hsg hsgVar = hsbVar;
                float f7 = f3;
                float interpolation = timeInterpolator2.getInterpolation((f5 + 0.0f) / f4);
                if (f5 >= f6) {
                    hsgVar.a(f7);
                    return true;
                }
                if (f5 >= 0.0f) {
                    float f8 = f2;
                    hsgVar.a(f8 + ((f7 - f8) * interpolation));
                }
                return false;
            }
        });
    }

    public final void k(java.lang.Runnable runnable) {
        this.d.add(new rai(runnable));
    }
}
