package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class me extends defpackage.mi {
    final /* synthetic */ int a;
    final /* synthetic */ ld b;
    final /* synthetic */ defpackage.mj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me(defpackage.mj mjVar, ld ldVar, int i, float f, float f2, float f3, float f4, int i2, ld ldVar2) {
        super(ldVar, i, f, f2, f3, f4);
        this.a = i2;
        this.b = ldVar2;
        this.c = mjVar;
    }

    @Override // defpackage.mi, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        super.onAnimationEnd(animator);
        if (this.n) {
            return;
        }
        if (this.a <= 0) {
            defpackage.mf.f(this.b);
            return;
        }
        defpackage.mj mjVar = this.c;
        mjVar.a.add(this.b.a);
        this.k = true;
        mjVar.p.post(new ad(mjVar, this, 10));
    }
}
