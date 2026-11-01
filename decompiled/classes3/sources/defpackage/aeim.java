package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aeim {
    public final defpackage.aehs a;
    public final com.google.android.libraries.onegoogle.account.disc.RingFrameLayout b;
    public defpackage.aelt c;
    public ahyn d;
    public ahyn e;
    public boolean f;
    public boolean g;
    public aehj h;
    private android.animation.AnimatorSet i = new android.animation.AnimatorSet();
    private ahyn j;

    public aeim(defpackage.aehs aehsVar, com.google.android.libraries.onegoogle.account.disc.RingFrameLayout ringFrameLayout) {
        ahwt ahwtVar = ahwt.a;
        this.d = ahwtVar;
        this.e = ahwtVar;
        this.j = ahwtVar;
        this.f = false;
        this.g = false;
        this.a = aehsVar;
        this.b = ringFrameLayout;
        aehsVar.d();
        aehsVar.c(new hp(this, 4));
        ringFrameLayout.setVisibility(0);
    }

    private final void b(ahyn ahynVar) {
        if (ahynVar.f()) {
            ahynVar.b();
        }
        defpackage.aelt aeltVar = this.c;
        if (aeltVar != null) {
            com.google.android.libraries.onegoogle.account.disc.RingFrameLayout ringFrameLayout = this.b;
            ringFrameLayout.d(aeltVar);
            ringFrameLayout.b(this.c);
        }
    }

    public final void a(ahyn ahynVar) {
        afec.c();
        defpackage.aehs aehsVar = this.a;
        if ((aehsVar.a() instanceof defpackage.aein) && !this.f && !this.g && this.e.f() && this.e.equals(this.j) && ahynVar.equals(this.d)) {
            b(ahynVar);
            return;
        }
        if (this.i.isRunning()) {
            this.i.cancel();
        }
        if (!this.e.f()) {
            this.d = ahynVar;
            return;
        }
        this.f = false;
        this.g = false;
        int iIntValue = ((java.lang.Integer) this.e.b()).intValue();
        this.j = this.e;
        defpackage.aeio aeioVarA = null;
        if (ahynVar.f()) {
            defpackage.aeip aeipVar = ((defpackage.aeih) ahynVar.b()).a;
            if (aeipVar == null) {
                throw new java.lang.IllegalStateException("RingContent must have a ring drawable factory.");
            }
            aeioVarA = aeipVar.a(new defpackage.aprf(aehsVar, (byte[]) null));
        }
        aift aiftVar = new aift(4);
        if (aehsVar.a() != null) {
            this.f = true;
            android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofInt(aehsVar, "currRingThickness", iIntValue, -1).setDuration(200L);
            duration.addListener(new defpackage.aeik(this));
            aiftVar.i(duration);
        }
        if (aeioVarA != null) {
            this.g = true;
            android.animation.ObjectAnimator duration2 = android.animation.ObjectAnimator.ofInt(aehsVar, "currRingThickness", -1, iIntValue).setDuration(200L);
            duration2.addListener(new defpackage.aeil(this, ahynVar, aeioVarA));
            aiftVar.i(duration2);
        }
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playSequentially((java.util.List<android.animation.Animator>) aiftVar.h());
        this.i = animatorSet;
        animatorSet.setDuration(0L);
        this.i.start();
        b(ahynVar);
    }
}
