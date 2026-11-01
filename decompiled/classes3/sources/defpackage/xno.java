package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xno implements defpackage.xpa, defpackage.xpr {
    private final defpackage.xpt a;
    private final java.lang.String b;

    /* JADX WARN: Illegal instructions before constructor call */
    public xno(defpackage.xnr xnrVar) {
        aooh.f(xnrVar, "source");
        java.lang.Class clsA = xnrVar.a();
        aopu[] aopuVarArr = aoou.a;
        this(defpackage.xer.i(new aooa(clsA), new aopu[]{new aooa(com.android.onboarding.contracts.annotations.OnboardingNode.class), new aooa(defpackage.xns.class)}, ajsz.aO(new aoiu[]{new aoiu(new aooa(com.android.onboarding.contracts.annotations.OnboardingNode.class), new defpackage.xgn(5)), new aoiu(new aooa(defpackage.xns.class), new defpackage.xgn(6))}), ajsz.aO(new aoiu[]{new aoiu(new aooa(com.android.onboarding.contracts.annotations.OnboardingNode.class), "com.android.onboarding.contracts.annotations.OnboardingNode"), new aoiu(new aooa(defpackage.xns.class), "com.android.onboarding.tasks.precalculation.annotations.Precalculation")})), xnrVar.b());
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.xno) {
            defpackage.xno xnoVar = (defpackage.xno) obj;
            if (aooh.n(this.a, xnoVar.a) && aooh.n(this.b, xnoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    @Override // defpackage.xpa
    public final android.os.PersistableBundle toPersistableBundle() {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putPersistableBundle("task", defpackage.xhy.o(this.a));
        persistableBundle.putString("extraKey", this.b);
        return persistableBundle;
    }

    public final java.lang.String toString() {
        return "PPrecalculatedResult(task=" + this.a + ", extraKey=" + this.b + ')';
    }

    public xno(defpackage.xpt xptVar, java.lang.String str) {
        aooh.f(str, "extraKey");
        this.a = xptVar;
        this.b = str;
    }
}
