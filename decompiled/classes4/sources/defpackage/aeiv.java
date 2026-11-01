package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aeiv implements aeit {
    private static final java.lang.String i = "aeiv";
    public final aehm d;
    public boolean e;
    public aehr g;
    public aelu h;
    public final java.util.concurrent.CopyOnWriteArraySet a = new java.util.concurrent.CopyOnWriteArraySet();
    public final java.lang.Object b = new java.lang.Object();
    public final java.util.Map c = new java.util.HashMap();
    public aify f = aike.a;

    public aeiv(aehm aehmVar) {
        this.d = aehmVar;
    }

    public static void e(java.lang.String str) {
        java.lang.String str2 = i;
        if (android.util.Log.isLoggable(str2, 3)) {
            android.util.Log.d(str2, str);
        }
    }

    private static java.lang.Object h(aehr aehrVar) {
        if (aehrVar != null) {
            return aehrVar.a;
        }
        return null;
    }

    private final void i() {
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((aehj) it.next()).t(h(this.g));
        }
    }

    public final java.lang.Object a() {
        return h(this.g);
    }

    public final void b(aehj aehjVar) {
        this.a.add(aehjVar);
    }

    public final void c(aehj aehjVar) {
        this.a.remove(aehjVar);
    }

    public final aify d() {
        aify aifyVarH;
        aift aiftVar = new aift(4);
        synchronized (this.b) {
            ailk ailkVarY = this.f.y(0);
            while (ailkVarY.hasNext()) {
                aiftVar.i(((aehr) ailkVarY.next()).a);
            }
            aifyVarH = aiftVar.h();
        }
        return aifyVarH;
    }

    public final void f() {
        if (this.e) {
            return;
        }
        this.e = true;
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((aehj) it.next()).s();
        }
    }

    @java.lang.Deprecated
    public final void g(java.lang.Object obj) {
        aehr aehrVar;
        aehr aehrVar2 = this.g;
        if (obj == null) {
            if (aehrVar2 != null) {
                this.g = null;
                i();
                return;
            }
            return;
        }
        aehm aehmVar = this.d;
        java.lang.Object obj2 = this.b;
        java.lang.String strB = aehmVar.b(obj);
        synchronized (obj2) {
            aehrVar = (aehr) this.c.get(strB);
        }
        ahvr.bN(aehrVar != null, "Selected account must be an available account");
        this.g = aehrVar;
        if (aehrVar.equals(aehrVar2)) {
            return;
        }
        i();
    }
}
