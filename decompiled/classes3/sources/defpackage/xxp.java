package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class xxp {
    private final defpackage.xxo a = new defpackage.xxo(null);
    private final java.util.Map b = new java.util.HashMap();

    private static void d(defpackage.xxo xxoVar) {
        defpackage.xxo xxoVar2 = xxoVar.d;
        xxoVar2.c = xxoVar.c;
        xxoVar.c.d = xxoVar2;
    }

    private static void e(defpackage.xxo xxoVar) {
        xxoVar.c.d = xxoVar;
        xxoVar.d.c = xxoVar;
    }

    public final java.lang.Object a(defpackage.xxw xxwVar) {
        java.util.Map map = this.b;
        defpackage.xxo xxoVar = (defpackage.xxo) map.get(xxwVar);
        if (xxoVar == null) {
            xxoVar = new defpackage.xxo(xxwVar);
            map.put(xxwVar, xxoVar);
        } else {
            xxwVar.a();
        }
        d(xxoVar);
        defpackage.xxo xxoVar2 = this.a;
        xxoVar.d = xxoVar2;
        xxoVar.c = xxoVar2.c;
        e(xxoVar);
        return xxoVar.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, xxw] */
    public final java.lang.Object b() {
        defpackage.xxo xxoVar = this.a;
        for (defpackage.xxo xxoVar2 = xxoVar.d; !xxoVar2.equals(xxoVar); xxoVar2 = xxoVar2.d) {
            java.lang.Object objB = xxoVar2.b();
            if (objB != null) {
                return objB;
            }
            d(xxoVar2);
            java.util.Map map = this.b;
            ?? r3 = xxoVar2.a;
            map.remove(r3);
            r3.a();
        }
        return null;
    }

    public final void c(defpackage.xxw xxwVar, java.lang.Object obj) {
        java.util.Map map = this.b;
        defpackage.xxo xxoVar = (defpackage.xxo) map.get(xxwVar);
        if (xxoVar == null) {
            xxoVar = new defpackage.xxo(xxwVar);
            d(xxoVar);
            defpackage.xxo xxoVar2 = this.a;
            xxoVar.d = xxoVar2.d;
            xxoVar.c = xxoVar2;
            e(xxoVar);
            map.put(xxwVar, xxoVar);
        } else {
            xxwVar.a();
        }
        if (xxoVar.b == null) {
            xxoVar.b = new java.util.ArrayList();
        }
        xxoVar.b.add(obj);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GroupedLinkedMap( ");
        defpackage.xxo xxoVar = this.a;
        defpackage.xxo xxoVar2 = xxoVar.c;
        boolean z = false;
        while (!xxoVar2.equals(xxoVar)) {
            sb.append('{');
            sb.append(xxoVar2.a);
            sb.append(':');
            sb.append(xxoVar2.a());
            sb.append("}, ");
            xxoVar2 = xxoVar2.c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
