package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public class anmv {
    public static final java.util.logging.Logger c = java.util.logging.Logger.getLogger(defpackage.anmv.class.getName());
    public static final defpackage.anmv d = new defpackage.anmv();
    final defpackage.anmo e;
    public final defpackage.anqg f;
    public final int g;

    public anmv(defpackage.anmv anmvVar, defpackage.anqg anqgVar) {
        this.e = anmvVar instanceof defpackage.anmo ? (defpackage.anmo) anmvVar : anmvVar.e;
        this.f = anqgVar;
        int i = anmvVar.g + 1;
        this.g = i;
        e(i);
    }

    private static void e(int i) {
        if (i == 1000) {
            c.logp(java.util.logging.Level.SEVERE, "io.grpc.Context", "validateGeneration", "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", (java.lang.Throwable) new java.lang.Exception());
        }
    }

    public static defpackage.anmv k() {
        defpackage.anmv anmvVarA = defpackage.anmt.a.a();
        return anmvVarA == null ? d : anmvVarA;
    }

    public static void m(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            throw new java.lang.NullPointerException((java.lang.String) obj2);
        }
    }

    public defpackage.anmv a() {
        defpackage.anmv anmvVarB = defpackage.anmt.a.b(this);
        return anmvVarB == null ? d : anmvVarB;
    }

    public anmw b() {
        defpackage.anmo anmoVar = this.e;
        if (anmoVar == null) {
            return null;
        }
        return anmoVar.a;
    }

    public java.lang.Throwable c() {
        defpackage.anmo anmoVar = this.e;
        if (anmoVar == null) {
            return null;
        }
        return anmoVar.c();
    }

    public void d(defpackage.anmp anmpVar, java.util.concurrent.Executor executor) {
        defpackage.anmo anmoVar = this.e;
        if (anmoVar != null) {
            anmoVar.e(new defpackage.anmr(executor, anmpVar, this));
        }
    }

    public void f(defpackage.anmv anmvVar) {
        m(anmvVar, "toAttach");
        defpackage.anmt.a.c(this, anmvVar);
    }

    public void g(defpackage.anmp anmpVar) {
        defpackage.anmo anmoVar = this.e;
        if (anmoVar != null) {
            anmoVar.h(anmpVar, this);
        }
    }

    public boolean i() {
        defpackage.anmo anmoVar = this.e;
        if (anmoVar == null) {
            return false;
        }
        return anmoVar.i();
    }

    public final defpackage.anmv l(defpackage.anms anmsVar, java.lang.Object obj) {
        defpackage.anqg anqgVar = this.f;
        return new defpackage.anmv(this, anqgVar == null ? new defpackage.anqf(anmsVar, obj, 0) : anqgVar.c(anmsVar, obj, anmsVar.hashCode(), 0));
    }

    private anmv() {
        this.e = null;
        this.f = null;
        this.g = 0;
    }

    public anmv(defpackage.anqg anqgVar, int i) {
        this.e = null;
        this.f = anqgVar;
        this.g = i;
        e(i);
    }
}
