package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xgj implements defpackage.xpa, defpackage.xpr {
    public static final defpackage.xgf c = new defpackage.xgf(2);
    public final java.lang.String a;
    public final java.lang.String b;
    private final defpackage.xgg d;
    private final defpackage.xge e;
    private final defpackage.xgc f;
    private final java.util.List g;
    private final boolean h;
    private final long i;
    private final java.util.List j;
    private final defpackage.xgd k;
    private final int l;

    public xgj(com.android.onboarding.contracts.annotations.OnboardingNode onboardingNode) {
        aopu[] aopuVarArr;
        aooh.f(onboardingNode, "source");
        java.lang.String strG = onboardingNode.g();
        java.lang.String strH = onboardingNode.h();
        defpackage.xgg xggVar = new defpackage.xgg(onboardingNode.e());
        defpackage.xge xgeVar = new defpackage.xge(onboardingNode.d());
        defpackage.xgc xgcVarF = onboardingNode.f();
        java.util.List listCU = ajsz.cU(onboardingNode.k());
        boolean zI = onboardingNode.i();
        long jB = onboardingNode.b();
        java.lang.Class[] clsArrJ = onboardingNode.j();
        aopu[] aopuVarArr2 = aoou.a;
        int length = clsArrJ.length;
        if (length == 0) {
            aopuVarArr = aoou.a;
        } else {
            aopu[] aopuVarArr3 = new aopu[length];
            for (int i = 0; i < length; i++) {
                aopuVarArr3[i] = new aooa(clsArrJ[i]);
            }
            aopuVarArr = aopuVarArr3;
        }
        int length2 = aopuVarArr.length;
        java.util.ArrayList arrayList = new java.util.ArrayList(length2);
        int i2 = 0;
        while (i2 < length2) {
            aokd aokdVar = aokd.a;
            arrayList.add(defpackage.xer.i(aopuVarArr[i2], new aopu[0], aokdVar, aokdVar));
            i2++;
            strG = strG;
        }
        java.lang.String str = strG;
        defpackage.xfs xfsVarC = onboardingNode.c();
        aooh.f(xfsVarC, "source");
        this(str, strH, xggVar, xgeVar, xgcVarF, listCU, zI, jB, arrayList, new defpackage.xgd(ajsz.cU(xfsVarC.b()), ajsz.cU(xfsVarC.a())), onboardingNode.a());
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.xgj) {
            defpackage.xgj xgjVar = (defpackage.xgj) obj;
            if (aooh.n(this.a, xgjVar.a) && aooh.n(this.b, xgjVar.b) && aooh.n(this.d, xgjVar.d) && aooh.n(this.e, xgjVar.e) && this.f == xgjVar.f && aooh.n(this.g, xgjVar.g) && this.h == xgjVar.h && this.i == xgjVar.i && aooh.n(this.j, xgjVar.j) && aooh.n(this.k, xgjVar.k) && this.l == xgjVar.l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
        java.util.List list = this.j;
        return (((((((((iHashCode * 31) + anty.L(this.h)) * 31) + anty.M(this.i)) * 31) + list.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l;
    }

    @Override // defpackage.xpa
    public final android.os.PersistableBundle toPersistableBundle() {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putString("component", this.a);
        persistableBundle.putString("name", this.b);
        persistableBundle.putPersistableBundle("foreground", defpackage.xhy.o(this.d));
        persistableBundle.putPersistableBundle("background", defpackage.xhy.o(this.e));
        persistableBundle.putPersistableBundle("specificationType", defpackage.xhy.o(this.f));
        persistableBundle.putStringArray("offGraphCallers", (java.lang.String[]) this.g.toArray(new java.lang.String[0]));
        persistableBundle.putString("isTerminalNode", java.lang.String.valueOf(this.h));
        persistableBundle.putLong("timeoutInSeconds", this.i);
        java.util.List list = this.j;
        defpackage.xph xphVar = defpackage.xph.a;
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new defpackage.xgh((defpackage.xpt) it.next(), 0));
        }
        persistableBundle.putPersistableBundle("metadata", xphVar.ew(arrayList));
        persistableBundle.putPersistableBundle("allowedCallers", defpackage.xhy.o(this.k));
        persistableBundle.putInt(com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriority.KEY_WORKER_ID, this.l);
        return persistableBundle;
    }

    public final java.lang.String toString() {
        return "POnboardingNode(component=" + this.a + ", name=" + this.b + ", foreground=" + this.d + ", background=" + this.e + ", specificationType=" + this.f + ", offGraphCallers=" + this.g + ", isTerminalNode=" + this.h + ", timeoutInSeconds=" + this.i + ", metadata=" + this.j + ", allowedCallers=" + this.k + ", workerId=" + this.l + ')';
    }

    public xgj(java.lang.String str, java.lang.String str2, defpackage.xgg xggVar, defpackage.xge xgeVar, defpackage.xgc xgcVar, java.util.List list, boolean z, long j, java.util.List list2, defpackage.xgd xgdVar, int i) {
        aooh.f(str, "component");
        aooh.f(str2, "name");
        aooh.f(xgcVar, "specificationType");
        aooh.f(list, "offGraphCallers");
        aooh.f(list2, "metadata");
        this.a = str;
        this.b = str2;
        this.d = xggVar;
        this.e = xgeVar;
        this.f = xgcVar;
        this.g = list;
        this.h = z;
        this.i = j;
        this.j = list2;
        this.k = xgdVar;
        this.l = i;
    }
}
