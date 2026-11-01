package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aboy extends android.animation.ValueAnimator {
    public final java.util.List a = new java.util.ArrayList();
    public final java.util.List b = new java.util.ArrayList();
    public final java.util.List c = new java.util.ArrayList();
    public final java.util.List d = new java.util.ArrayList();

    public static final void c(java.util.List list) {
        aooh.f(list, "<this>");
        j$.util.Collection.-EL.removeIf(list, new defpackage.abdh(new defpackage.abiy(11), 3));
    }

    public final void a(float f, float f2, aonj aonjVar) {
        int i = 1;
        defpackage.abph abphVar = new defpackage.abph(aonjVar, i);
        if (f2 != f) {
            this.a.add(new defpackage.acre(abphVar, f, f2, i));
        }
    }

    public final void b(aomy aomyVar) {
        this.d.add(new defpackage.abmn(aomyVar, 3));
    }
}
