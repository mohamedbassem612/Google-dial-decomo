package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fvs implements emx, eoi, emn, gii {
    public defpackage.fwc a;
    public emq b;
    public final java.lang.String c;
    public final android.os.Bundle d;
    public boolean e;
    public final defpackage.fwl j;
    public final defpackage.vk k;
    private final android.os.Bundle m;
    public final kaw l = dzk.U(this);
    private final aoir n = aooc.ag(new defpackage.eli(2));
    public final emy f = new emy(this, true);
    public final aoir g = aooc.ag(new defpackage.eli(3));
    public final aoir h = aooc.ag(new defpackage.dqk(this, 8));
    public emq i = emq.b;

    public fvs(defpackage.vk vkVar, defpackage.fwc fwcVar, android.os.Bundle bundle, emq emqVar, defpackage.fwl fwlVar, java.lang.String str, android.os.Bundle bundle2) {
        this.k = vkVar;
        this.a = fwcVar;
        this.m = bundle;
        this.b = emqVar;
        this.j = fwlVar;
        this.c = str;
        this.d = bundle2;
    }

    public final ems P() {
        return this.f;
    }

    public final eoe R() {
        return (enw) this.n.a();
    }

    public final eoh S() {
        if (!this.e) {
            throw new java.lang.IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (this.f.d == emq.a) {
            throw new java.lang.IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        defpackage.fwl fwlVar = this.j;
        if (fwlVar == null) {
            throw new java.lang.IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        }
        java.lang.String str = this.c;
        aooh.f(str, "key");
        adw adwVar = fwlVar.a.v().a;
        java.lang.Object objA = adwVar.a(str);
        if (objA == null) {
            objA = new defpackage.eot(str, new eoh());
            adwVar.n(str, objA);
        }
        return ((defpackage.eot) objA).b;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    public final eoq T() {
        android.app.Application application;
        eos eosVar = new eos((byte[]) null);
        eosVar.b(env.a, this);
        eosVar.b(env.b, this);
        android.os.Bundle bundleA = a();
        if (bundleA != null) {
            eosVar.b(env.c, bundleA);
        }
        defpackage.vk vkVar = this.k;
        if (vkVar == null) {
            application = null;
        } else {
            java.lang.Object obj = vkVar.a;
            android.content.Context applicationContext = obj != null ? ((android.content.Context) obj).getApplicationContext() : null;
            if (applicationContext instanceof android.app.Application) {
                application = (android.app.Application) applicationContext;
            } else {
                application = null;
            }
        }
        android.app.Application application2 = true == (application instanceof android.app.Application) ? application : null;
        if (application2 != null) {
            eosVar.b(eod.b, application2);
        }
        return eosVar;
    }

    public final android.os.Bundle a() {
        android.os.Bundle bundle = this.m;
        if (bundle == null) {
            return null;
        }
        android.os.Bundle bundleR = dpe.r((aoiu[]) java.util.Arrays.copyOf(new aoiu[0], 0));
        bundleR.putAll(bundle);
        return bundleR;
    }

    public final aaha aT() {
        return this.l.ap();
    }

    public final void b(emq emqVar) {
        if (emqVar == null) {
            aooh.i("maxState");
        }
        this.i = emqVar;
        c();
    }

    public final void c() {
        if (!this.e) {
            kaw kawVar = this.l;
            kawVar.ad();
            this.e = true;
            if (this.j != null) {
                env.b(this);
            }
            kawVar.ae(this.d);
        }
        int iOrdinal = this.b.ordinal();
        int iOrdinal2 = this.i.ordinal();
        emy emyVar = this.f;
        if (iOrdinal < iOrdinal2) {
            emyVar.g(this.b);
        } else {
            emyVar.g(this.i);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        boolean zM;
        if (obj == null || !(obj instanceof defpackage.fvs)) {
            return false;
        }
        android.os.Bundle bundle = this.m;
        defpackage.fvs fvsVar = (defpackage.fvs) obj;
        android.os.Bundle bundle2 = fvsVar.m;
        if (aooh.n(bundle, bundle2)) {
            zM = true;
        } else {
            zM = (bundle == null || bundle2 == null) ? false : defpackage.fsu.M(bundle, bundle2);
        }
        return aooh.n(this.c, fvsVar.c) && aooh.n(this.a, fvsVar.a) && aooh.n(this.f, fvsVar.f) && aooh.n(aT(), fvsVar.aT()) && zM;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() * 31) + this.a.hashCode();
        android.os.Bundle bundle = this.m;
        if (bundle != null) {
            iHashCode = (iHashCode * 31) + defpackage.fsu.L(bundle);
        }
        return (((iHashCode * 31) + this.f.hashCode()) * 31) + aT().hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Class<?> cls = sb.getClass();
        aopu[] aopuVarArr = aoou.a;
        sb.append(new aooa(cls).c());
        sb.append("(" + this.c + ')');
        sb.append(" destination=");
        sb.append(this.a);
        return sb.toString();
    }
}
