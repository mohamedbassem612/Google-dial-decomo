package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class ahou {
    public static final defpackage.agab e = new defpackage.agab((int[]) null);
    private final defpackage.ahou a;
    public final defpackage.aec c;
    public boolean d = false;

    public ahou(defpackage.ahou ahouVar, defpackage.aec aecVar) {
        if (ahouVar != null && !ahouVar.d) {
            throw new java.lang.IllegalArgumentException();
        }
        this.a = ahouVar;
        this.c = aecVar;
    }

    public static defpackage.ahos b() {
        return defpackage.ahot.a.c();
    }

    public static defpackage.ahou d(java.util.Set set) {
        if (set.isEmpty()) {
            return defpackage.ahot.a;
        }
        if (set.size() == 1) {
            return (defpackage.ahou) set.iterator().next();
        }
        java.util.Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            defpackage.ahou ahouVar = (defpackage.ahou) it.next();
            do {
                i += ahouVar.c.d;
                ahouVar = ahouVar.a;
            } while (ahouVar != null);
        }
        if (i == 0) {
            return defpackage.ahot.a;
        }
        defpackage.aec aecVar = new defpackage.aec(i);
        java.util.Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            defpackage.ahou ahouVar2 = (defpackage.ahou) it2.next();
            do {
                int i2 = 0;
                while (true) {
                    defpackage.aec aecVar2 = ahouVar2.c;
                    if (i2 >= aecVar2.d) {
                        break;
                    }
                    defpackage.ahvr.bR(aecVar.put((defpackage.agab) aecVar2.d(i2), aecVar2.g(i2)) == null, "Duplicate bindings: %s", aecVar2.d(i2));
                    i2++;
                }
                ahouVar2 = ahouVar2.a;
            } while (ahouVar2 != null);
        }
        return new defpackage.ahot(null, aecVar).f();
    }

    public static defpackage.ahou e(defpackage.ahou ahouVar, defpackage.ahou ahouVar2) {
        if (ahouVar.g()) {
            return ahouVar2;
        }
        return !ahouVar2.g() ? d(defpackage.aihd.r(ahouVar, ahouVar2)) : ahouVar;
    }

    public static defpackage.ahor j(defpackage.agab agabVar, defpackage.ahou ahouVar) {
        java.lang.Object objH = ahouVar.h(agabVar);
        if (objH == null) {
            return defpackage.ahor.d(true != ahouVar.c.containsKey(e) ? 3 : 2);
        }
        return new defpackage.ahor(1, objH, false);
    }

    public final defpackage.ahos c() {
        return new defpackage.ahot(this, new defpackage.aec(0));
    }

    public final defpackage.ahou f() {
        if (this.d) {
            throw new java.lang.IllegalStateException("Already frozen");
        }
        this.d = true;
        defpackage.ahou ahouVar = this.a;
        return (ahouVar == null || !this.c.isEmpty()) ? this : ahouVar;
    }

    public final boolean g() {
        return this == defpackage.ahot.a;
    }

    final java.lang.Object h(defpackage.agab agabVar) {
        defpackage.ahou ahouVar;
        if (!this.d) {
            throw new java.lang.IllegalStateException();
        }
        java.lang.Object obj = this.c.get(agabVar);
        return (obj != null || (ahouVar = this.a) == null) ? obj : ahouVar.h(agabVar);
    }

    final boolean i(defpackage.agab agabVar) {
        if (this.c.containsKey(agabVar)) {
            return true;
        }
        defpackage.ahou ahouVar = this.a;
        return ahouVar != null && ahouVar.i(agabVar);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SpanExtras<");
        for (defpackage.ahou ahouVar = this; ahouVar != null; ahouVar = ahouVar.a) {
            for (int i = 0; i < ahouVar.c.d; i++) {
                sb.append('[');
                sb.append(this.c.g(i));
                sb.append("], ");
            }
        }
        sb.append('>');
        return sb.toString();
    }
}
