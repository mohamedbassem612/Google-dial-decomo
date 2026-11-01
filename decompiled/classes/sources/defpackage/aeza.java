package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeza {
    public boolean a;
    public final java.lang.Object b;
    public java.lang.Object c;

    public aeza(defpackage.ahyc ahycVar) {
        this.c = defpackage.aikn.a;
        this.a = false;
        this.b = ahycVar;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [ahyc, java.lang.Object] */
    public final defpackage.aeyz a() {
        return new defpackage.aeyz(new defpackage.aeyt(this.b, this.a, (defpackage.aihd) this.c));
    }

    public final void b(java.util.Set set) {
        this.c = defpackage.aihd.o(set);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final java.lang.Object c(java.lang.Object obj) {
        java.lang.Object obj2 = this.b.get(obj);
        if (obj2 != null) {
            return obj2;
        }
        if (g(obj)) {
            return null;
        }
        java.util.Objects.toString(obj);
        throw new java.lang.IllegalStateException(java.lang.String.valueOf(obj).concat(" data not loaded"));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final java.util.Map d() {
        return defpackage.ajsz.aS(this.b);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void e(java.util.Map map) {
        defpackage.aooh.f(map, "dataMap");
        this.b.putAll(map);
        this.c = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final void f(java.lang.Object obj, java.lang.Object obj2) {
        this.b.put(obj, obj2);
        this.c = null;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    public final boolean g(java.lang.Object obj) {
        return this.a || this.b.containsKey(obj);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Queue] */
    public final void h(defpackage.aaun aaunVar) {
        synchronized (this.b) {
            if (this.c == null) {
                this.c = new java.util.ArrayDeque();
            }
            this.c.add(aaunVar);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Queue] */
    public final void i(defpackage.aaum aaumVar) {
        defpackage.aaun aaunVar;
        java.lang.Object obj = this.b;
        synchronized (obj) {
            if (this.c == null || this.a) {
                return;
            }
            this.a = true;
            while (true) {
                synchronized (obj) {
                    aaunVar = (defpackage.aaun) this.c.poll();
                    if (aaunVar == null) {
                        this.a = false;
                        return;
                    }
                }
                aaunVar.c(aaumVar);
            }
        }
    }

    public aeza() {
        this.b = new java.util.LinkedHashMap();
    }

    public aeza(byte[] bArr) {
        this.b = new java.lang.Object();
    }
}
