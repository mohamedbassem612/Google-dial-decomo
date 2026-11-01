package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eyz {
    public final defpackage.eyy d;
    public final defpackage.etk g;
    public boolean h;
    public final defpackage.ezv i;
    private final defpackage.fag k;
    private final defpackage.fip l;
    public izg j = new izg();
    public final java.util.IdentityHashMap b = new java.util.IdentityHashMap();
    public final java.util.Map c = new java.util.HashMap();
    public final java.util.List a = new java.util.ArrayList();
    public final java.util.HashMap e = new java.util.HashMap();
    public final java.util.Set f = new java.util.HashSet();

    public eyz(defpackage.eyy eyyVar, defpackage.ezv ezvVar, defpackage.etk etkVar, defpackage.fag fagVar, defpackage.fip fipVar) {
        this.k = fagVar;
        this.l = fipVar;
        this.d = eyyVar;
        this.i = ezvVar;
        this.g = etkVar;
    }

    private final void h(int i, int i2) {
        while (true) {
            java.util.List list = this.a;
            if (i >= list.size()) {
                return;
            }
            ((defpackage.eyx) list.get(i)).d += i2;
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [ffv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ffw, java.lang.Object] */
    private final void i(defpackage.eyx eyxVar) {
        izg izgVar = (izg) this.e.get(eyxVar);
        if (izgVar != null) {
            izgVar.c.d(izgVar.a);
        }
    }

    public final int a() {
        return this.a.size();
    }

    public final defpackage.erm b() {
        java.util.List list = this.a;
        if (list.isEmpty()) {
            return defpackage.erm.a;
        }
        int iC = 0;
        for (int i = 0; i < list.size(); i++) {
            defpackage.eyx eyxVar = (defpackage.eyx) list.get(i);
            eyxVar.d = iC;
            iC += eyxVar.a.e.c();
        }
        return new defpackage.ewy(list, this.j);
    }

    public final void c() {
        java.util.Iterator it = this.f.iterator();
        while (it.hasNext()) {
            defpackage.eyx eyxVar = (defpackage.eyx) it.next();
            if (eyxVar.c.isEmpty()) {
                i(eyxVar);
                it.remove();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [fct, fga, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [ffw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [ffv, java.lang.Object] */
    public final void d(defpackage.eyx eyxVar) {
        if (eyxVar.e && eyxVar.c.isEmpty()) {
            izg izgVar = (izg) this.e.remove(eyxVar);
            ahvr.ci(izgVar);
            ?? r1 = izgVar.c;
            r1.k(izgVar.a);
            ?? r0 = izgVar.b;
            r1.n(r0);
            r1.m(r0);
            this.f.remove(eyxVar);
        }
    }

    public final void e(defpackage.eyx eyxVar) {
        defpackage.ffp ffpVar = eyxVar.a;
        defpackage.ffv ffvVar = new defpackage.ffv() { // from class: eyu
            @Override // defpackage.ffv
            public final void a(defpackage.ffw ffwVar, defpackage.erm ermVar) {
                defpackage.etk etkVar = ((defpackage.eyj) this.a.d).f;
                etkVar.b(2);
                etkVar.f(22);
            }
        };
        defpackage.eyw eywVar = new defpackage.eyw(this, eyxVar);
        this.e.put(eyxVar, new izg(ffpVar, ffvVar, eywVar));
        ffpVar.c(eum.ae(), eywVar);
        ffpVar.b(eum.ae(), eywVar);
        ffpVar.h(ffvVar, this.k, this.l);
    }

    public final void f(int i, int i2) {
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            defpackage.eyx eyxVar = (defpackage.eyx) this.a.remove(i2);
            this.c.remove(eyxVar.b);
            h(i2, -eyxVar.a.e.c());
            eyxVar.e = true;
            if (this.h) {
                d(eyxVar);
            }
        }
    }

    public final defpackage.erm g(int i, java.util.List list, izg izgVar) {
        if (!list.isEmpty()) {
            this.j = izgVar;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                defpackage.eyx eyxVar = (defpackage.eyx) list.get(i2 - i);
                if (i2 > 0) {
                    defpackage.eyx eyxVar2 = (defpackage.eyx) this.a.get(i2 - 1);
                    eyxVar.c(eyxVar2.d + eyxVar2.a.e.c());
                } else {
                    eyxVar.c(0);
                }
                h(i2, eyxVar.a.e.c());
                this.a.add(i2, eyxVar);
                this.c.put(eyxVar.b, eyxVar);
                if (this.h) {
                    e(eyxVar);
                    if (this.b.isEmpty()) {
                        this.f.add(eyxVar);
                    } else {
                        i(eyxVar);
                    }
                }
            }
        }
        return b();
    }
}
