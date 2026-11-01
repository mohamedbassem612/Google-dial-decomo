package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xge implements defpackage.xpa, defpackage.xpr {
    public final java.util.List a;
    public final boolean b;

    public xge(defpackage.xft xftVar) {
        aooh.f(xftVar, "source");
        defpackage.xfz[] xfzVarArrB = xftVar.b();
        java.util.ArrayList arrayList = new java.util.ArrayList(xfzVarArrB.length);
        for (defpackage.xfz xfzVar : xfzVarArrB) {
            arrayList.add(xfzVar);
        }
        this(arrayList, xftVar.a());
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.xge) {
            defpackage.xge xgeVar = (defpackage.xge) obj;
            if (aooh.n(this.a, xgeVar.a) && this.b == xgeVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + anty.L(this.b);
    }

    @Override // defpackage.xpa
    public final android.os.PersistableBundle toPersistableBundle() {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        java.util.List list = this.a;
        defpackage.xph xphVar = defpackage.xph.a;
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new defpackage.xgh((defpackage.xfz) it.next(), 1));
        }
        persistableBundle.putPersistableBundle("acceptsInterrupts", xphVar.ew(arrayList));
        persistableBundle.putString("empty", java.lang.String.valueOf(this.b));
        return persistableBundle;
    }

    public final java.lang.String toString() {
        return "PBackgroundOnboardingNode(acceptsInterrupts=" + this.a + ", empty=" + this.b + ')';
    }

    public xge(java.util.List list, boolean z) {
        aooh.f(list, "acceptsInterrupts");
        this.a = list;
        this.b = z;
    }
}
