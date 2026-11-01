package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xnp implements defpackage.xpa, defpackage.xpr {
    public static final defpackage.xgf e = new defpackage.xgf(6);
    public final java.util.List a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public xnp(defpackage.xns xnsVar) {
        aooh.f(xnsVar, "source");
        defpackage.xnn[] xnnVarArrD = xnsVar.d();
        java.util.ArrayList arrayList = new java.util.ArrayList(xnnVarArrD.length);
        for (defpackage.xnn xnnVar : xnnVarArrD) {
            arrayList.add(xnnVar);
        }
        this(arrayList, xnsVar.a(), xnsVar.c(), xnsVar.b());
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.xnp) {
            defpackage.xnp xnpVar = (defpackage.xnp) obj;
            if (aooh.n(this.a, xnpVar.a) && this.b == xnpVar.b && this.c == xnpVar.c && this.d == xnpVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        boolean z = this.d;
        return ((((iHashCode + anty.L(this.b)) * 31) + anty.L(this.c)) * 31) + anty.L(z);
    }

    @Override // defpackage.xpa
    public final android.os.PersistableBundle toPersistableBundle() {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        java.util.List list = this.a;
        defpackage.xph xphVar = defpackage.xph.a;
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new defpackage.xgh((defpackage.xnn) it.next(), 3));
        }
        persistableBundle.putPersistableBundle("triggers", xphVar.ew(arrayList));
        persistableBundle.putString("readOnlyOnce", java.lang.String.valueOf(this.b));
        persistableBundle.putString("runAgainOnSuccessiveTriggers", java.lang.String.valueOf(this.c));
        persistableBundle.putString("requireAllTriggers", java.lang.String.valueOf(this.d));
        return persistableBundle;
    }

    public final java.lang.String toString() {
        return "PPrecalculation(triggers=" + this.a + ", readOnlyOnce=" + this.b + ", runAgainOnSuccessiveTriggers=" + this.c + ", requireAllTriggers=" + this.d + ')';
    }

    public xnp(java.util.List list, boolean z, boolean z2, boolean z3) {
        aooh.f(list, "triggers");
        this.a = list;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }
}
