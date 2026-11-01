package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xwd {
    public final java.util.List a = new java.util.ArrayList();
    public final java.util.List b = new java.util.ArrayList();
    public defpackage.xsk c;
    public java.lang.Object d;
    public int e;
    public int f;
    public java.lang.Class g;
    public defpackage.xus h;
    public java.util.Map i;
    public java.lang.Class j;
    public boolean k;
    public boolean l;
    public defpackage.xuo m;
    public defpackage.xsm n;
    public defpackage.xwm o;
    public boolean p;
    public boolean q;
    public defpackage.xwo r;

    final defpackage.xuw a(java.lang.Class cls) {
        defpackage.xuw xuwVar = (defpackage.xuw) this.i.get(cls);
        if (xuwVar == null) {
            for (java.util.Map.Entry entry : this.i.entrySet()) {
                if (((java.lang.Class) entry.getKey()).isAssignableFrom(cls)) {
                    xuwVar = (defpackage.xuw) entry.getValue();
                    break;
                }
            }
        }
        if (xuwVar != null) {
            return xuwVar;
        }
        if (this.i.isEmpty() && this.p) {
            throw new java.lang.IllegalArgumentException(hgb.i(cls, "Missing transformation for ", ". If you wish to ignore unknown resource types, use the optional transformation methods."));
        }
        return defpackage.yak.b;
    }

    final defpackage.xxc b(java.lang.Class cls) {
        defpackage.xxc xxcVar;
        java.lang.Class cls2;
        java.lang.Class cls3;
        java.lang.Class cls4;
        java.lang.Class cls5 = cls;
        defpackage.xss xssVarA = this.c.a();
        defpackage.yeg yegVar = xssVarA.a;
        java.util.concurrent.atomic.AtomicReference atomicReference = yegVar.c;
        java.lang.Class cls6 = this.g;
        java.lang.Class cls7 = this.j;
        defpackage.xxc xxcVar2 = null;
        defpackage.yga ygaVar = (defpackage.yga) atomicReference.getAndSet(null);
        if (ygaVar == null) {
            ygaVar = new defpackage.yga();
        }
        ygaVar.a(cls5, cls6, cls7);
        aca acaVar = yegVar.b;
        synchronized (acaVar) {
            xxcVar = (defpackage.xxc) acaVar.get(ygaVar);
        }
        yegVar.c.set(ygaVar);
        defpackage.yeg yegVar2 = xssVarA.a;
        defpackage.xxc xxcVar3 = defpackage.yeg.a;
        if (xxcVar3.equals(xxcVar)) {
            return null;
        }
        if (xxcVar != null) {
            return xxcVar;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.uyg uygVar = xssVarA.g;
        for (java.lang.Class cls8 : uygVar.E(cls5, cls6)) {
            xtq xtqVar = xssVarA.f;
            for (java.lang.Class cls9 : xtqVar.s(cls8, cls7)) {
                arrayList.add(new defpackage.xwg(cls5, cls8, cls9, uygVar.D(cls5, cls8), xtqVar.r(cls8, cls9), xssVarA.b));
                cls5 = cls;
                xtqVar = xtqVar;
            }
            cls5 = cls;
        }
        if (arrayList.isEmpty()) {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
        } else {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            xxcVar2 = new defpackage.xxc(cls2, cls3, cls4, arrayList, xssVarA.b);
        }
        aca acaVar2 = yegVar2.b;
        synchronized (acaVar2) {
            defpackage.yga ygaVar2 = new defpackage.yga(cls2, cls3, cls4);
            if (xxcVar2 != null) {
                xxcVar3 = xxcVar2;
            }
            acaVar2.put(ygaVar2, xxcVar3);
        }
        return xxcVar2;
    }

    final defpackage.xyb c() {
        return this.r.a();
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    final java.util.List d() {
        if (!this.l) {
            this.l = true;
            java.util.List list = this.b;
            list.clear();
            java.util.List listE = e();
            int size = listE.size();
            for (int i = 0; i < size; i++) {
                ucm ucmVar = (ucm) listE.get(i);
                java.lang.Object obj = ucmVar.a;
                if (!list.contains(obj)) {
                    list.add(obj);
                }
                int i2 = 0;
                while (true) {
                    ?? r7 = ucmVar.b;
                    if (i2 < r7.size()) {
                        if (!list.contains(r7.get(i2))) {
                            list.add((defpackage.xuo) r7.get(i2));
                        }
                        i2++;
                    }
                }
            }
        }
        return this.b;
    }

    final java.util.List e() {
        if (!this.k) {
            this.k = true;
            java.util.List list = this.a;
            list.clear();
            java.util.List listC = this.c.a().c(this.d);
            int size = listC.size();
            for (int i = 0; i < size; i++) {
                ucm ucmVarB = ((defpackage.xzp) listC.get(i)).b(this.d, this.e, this.f, this.h);
                if (ucmVarB != null) {
                    list.add(ucmVarB);
                }
            }
        }
        return this.a;
    }

    final java.util.List f(java.io.File file) {
        return this.c.a().c(file);
    }

    final boolean g(java.lang.Class cls) {
        return b(cls) != null;
    }

    final defpackage.xxt h() {
        return this.c.f;
    }
}
