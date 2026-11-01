package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class yfy {
    private final java.util.Map a = new java.util.LinkedHashMap(100, 0.75f, true);
    private final long b;
    private long c;

    public yfy(long j) {
        this.b = j;
    }

    protected int a(java.lang.Object obj) {
        return 1;
    }

    public final synchronized long e() {
        return this.b;
    }

    public final synchronized java.lang.Object f(java.lang.Object obj) {
        defpackage.amwp amwpVar = (defpackage.amwp) this.a.get(obj);
        if (amwpVar == null) {
            return null;
        }
        return amwpVar.b;
    }

    public final synchronized java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3;
        int iA = a(obj2);
        long j = iA;
        long j2 = this.b;
        obj3 = null;
        if (j >= j2) {
            c(obj, obj2);
        } else {
            if (obj2 != null) {
                this.c += j;
            }
            defpackage.amwp amwpVar = (defpackage.amwp) this.a.put(obj, obj2 == null ? null : new defpackage.amwp(obj2, iA));
            if (amwpVar != null) {
                this.c -= (long) amwpVar.a;
                java.lang.Object obj4 = amwpVar.b;
                if (!obj4.equals(obj2)) {
                    c(obj, obj4);
                }
            }
            i(j2);
            obj3 = amwpVar != null ? amwpVar.b : null;
        }
        return obj3;
    }

    public final synchronized java.lang.Object h(java.lang.Object obj) {
        defpackage.amwp amwpVar = (defpackage.amwp) this.a.remove(obj);
        if (amwpVar == null) {
            return null;
        }
        this.c -= (long) amwpVar.a;
        return amwpVar.b;
    }

    public final synchronized void i(long j) {
        while (this.c > j) {
            java.util.Iterator it = this.a.entrySet().iterator();
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            defpackage.amwp amwpVar = (defpackage.amwp) entry.getValue();
            this.c -= (long) amwpVar.a;
            java.lang.Object key = entry.getKey();
            it.remove();
            c(key, amwpVar.b);
        }
    }

    protected void c(java.lang.Object obj, java.lang.Object obj2) {
    }
}
