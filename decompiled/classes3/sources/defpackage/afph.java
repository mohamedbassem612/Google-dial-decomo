package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afph {
    public int a = 0;
    public int b = 1;
    private final long c;
    private final long d;
    private final android.animation.TimeInterpolator e;

    public afph(long j, long j2, android.animation.TimeInterpolator timeInterpolator) {
        this.c = j;
        this.d = j2;
        this.e = timeInterpolator;
    }

    public final android.animation.TimeInterpolator a() {
        android.animation.TimeInterpolator timeInterpolator = this.e;
        return timeInterpolator == null ? afpc.b : timeInterpolator;
    }

    public final void b(android.animation.Animator animator) {
        animator.setStartDelay(this.c);
        animator.setDuration(this.d);
        animator.setInterpolator(a());
        if (animator instanceof android.animation.ValueAnimator) {
            android.animation.ValueAnimator valueAnimator = (android.animation.ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.a);
            valueAnimator.setRepeatMode(this.b);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.afph) {
            defpackage.afph afphVar = (defpackage.afph) obj;
            if (this.c == afphVar.c && this.d == afphVar.d && this.a == afphVar.a && this.b == afphVar.b) {
                return a().getClass().equals(afphVar.a().getClass());
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = a().getClass().hashCode();
        long j = this.d;
        long j2 = this.c;
        return (((((((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + iHashCode) * 31) + this.a) * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "\n" + getClass().getName() + '{' + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " delay: " + this.c + " duration: " + this.d + " interpolator: " + a().getClass() + " repeatCount: " + this.a + " repeatMode: " + this.b + "}\n";
    }
}
