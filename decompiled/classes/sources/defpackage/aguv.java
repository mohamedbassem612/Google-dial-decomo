package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aguv {
    public java.lang.Object a;
    public java.lang.Object b;
    public java.lang.Object c;
    public java.lang.Object d;
    public java.lang.Object e;
    public java.lang.Object f;
    public java.lang.Object g;
    public java.lang.Object h;
    public java.lang.Object i;
    public java.lang.Object j;
    public java.lang.Object k;
    public java.lang.Object l;

    public aguv(defpackage.agal agalVar) {
        this.e = new defpackage.agaj();
        this.g = new defpackage.agaj();
        this.c = new defpackage.agaj();
        this.j = new defpackage.agaj();
        this.d = new defpackage.afzw(0.0f);
        this.k = new defpackage.afzw(0.0f);
        this.f = new defpackage.afzw(0.0f);
        this.b = new defpackage.afzw(0.0f);
        this.a = new defpackage.agab();
        this.i = new defpackage.agab();
        this.l = new defpackage.agab();
        this.h = new defpackage.agab();
        this.e = agalVar.j;
        this.g = agalVar.k;
        this.c = agalVar.l;
        this.j = agalVar.m;
        this.d = agalVar.b;
        this.k = agalVar.c;
        this.f = agalVar.d;
        this.b = agalVar.e;
        this.a = agalVar.f;
        this.i = agalVar.g;
        this.l = agalVar.h;
        this.h = agalVar.i;
    }

    private static void v(defpackage.agab agabVar) {
        if (agabVar instanceof defpackage.agaj) {
            float f = ((defpackage.agaj) agabVar).a;
        } else if (agabVar instanceof agaa) {
            float f2 = ((agaa) agabVar).a;
        }
    }

    public final defpackage.aguz a() {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5 = this.a;
        if (obj5 == null || (obj = this.b) == null || (obj2 = this.d) == null || (obj3 = this.f) == null || (obj4 = this.i) == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (this.a == null) {
                sb.append(" workerClass");
            }
            if (this.b == null) {
                sb.append(" constraints");
            }
            if (this.d == null) {
                sb.append(" initialDelay");
            }
            if (this.f == null) {
                sb.append(" inputData");
            }
            if (this.i == null) {
                sb.append(" tags");
            }
            throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        java.lang.Object obj6 = this.c;
        java.lang.Object obj7 = this.e;
        java.lang.Object obj8 = this.g;
        java.lang.Object obj9 = this.h;
        java.lang.Object obj10 = this.j;
        defpackage.ahyn ahynVar = (defpackage.ahyn) obj10;
        defpackage.ahyn ahynVar2 = (defpackage.ahyn) obj8;
        defpackage.ahyn ahynVar3 = (defpackage.ahyn) obj7;
        defpackage.ahyn ahynVar4 = (defpackage.ahyn) obj6;
        defpackage.grp grpVar = (defpackage.grp) obj3;
        defpackage.agux aguxVar = (defpackage.agux) obj2;
        defpackage.grn grnVar = (defpackage.grn) obj;
        java.lang.Class cls = (java.lang.Class) obj5;
        defpackage.aguz aguzVar = new defpackage.aguz(cls, grnVar, ahynVar4, aguxVar, ahynVar3, grpVar, ahynVar2, (defpackage.ahyn) obj9, (defpackage.aihd) obj4, ahynVar, (defpackage.ahyn) this.k, (defpackage.ahyn) this.l);
        defpackage.ahyn ahynVar5 = aguzVar.l;
        if (ahynVar5.f() && ((java.lang.String) ahynVar5.b()).contains(":")) {
            throw new java.lang.IllegalArgumentException("Worker target process must either be a custom process like 'my_process' or the empty String '' for the Android default process.");
        }
        return aguzVar;
    }

    public final void b(defpackage.grn grnVar) {
        if (grnVar == null) {
            throw new java.lang.NullPointerException("Null constraints");
        }
        this.b = grnVar;
    }

    public final void c(defpackage.agux aguxVar) {
        if (aguxVar == null) {
            throw new java.lang.NullPointerException("Null initialDelay");
        }
        this.d = aguxVar;
    }

    public final void d(defpackage.aguw aguwVar) {
        this.g = new defpackage.ahys(aguwVar);
    }

    public final void e(java.util.Set set) {
        this.i = defpackage.aihd.o(set);
    }

    public final void f(defpackage.aguy aguyVar) {
        this.h = new defpackage.ahys(aguyVar);
    }

    public final void g(float f) {
        this.b = new defpackage.afzw(f);
    }

    public final void h(float f) {
        this.f = new defpackage.afzw(f);
    }

    public final void i(float f) {
        this.d = new defpackage.afzw(f);
    }

    public final void j(float f) {
        this.k = new defpackage.afzw(f);
    }

    public final void k(float f) {
        i(f);
        j(f);
        h(f);
        g(f);
    }

    public final void l(defpackage.afzz afzzVar) {
        this.d = afzzVar;
        this.k = afzzVar;
        this.f = afzzVar;
        this.b = afzzVar;
    }

    public final void m(float f) {
        r(defpackage.agab.i(0));
        g(f);
    }

    public final void n(float f) {
        s(defpackage.agab.i(0));
        h(f);
    }

    public final void o(float f) {
        t(defpackage.agab.i(0));
        i(f);
    }

    public final void p(float f) {
        u(defpackage.agab.i(0));
        j(f);
    }

    public final void q(float f) {
        defpackage.agaj agajVar = new defpackage.agaj();
        t(agajVar);
        u(agajVar);
        s(agajVar);
        r(agajVar);
        k(f);
    }

    public final void r(defpackage.agab agabVar) {
        this.j = agabVar;
        v(agabVar);
    }

    public final void s(defpackage.agab agabVar) {
        this.c = agabVar;
        v(agabVar);
    }

    public final void t(defpackage.agab agabVar) {
        this.e = agabVar;
        v(agabVar);
    }

    public final void u(defpackage.agab agabVar) {
        this.g = agabVar;
        v(agabVar);
    }

    public aguv() {
        defpackage.ahwt ahwtVar = defpackage.ahwt.a;
        this.c = ahwtVar;
        this.e = ahwtVar;
        this.g = ahwtVar;
        this.h = ahwtVar;
        this.j = ahwtVar;
        this.k = ahwtVar;
        this.l = ahwtVar;
    }

    public aguv(defpackage.aguz aguzVar) {
        defpackage.ahwt ahwtVar = defpackage.ahwt.a;
        this.c = ahwtVar;
        this.e = ahwtVar;
        this.g = ahwtVar;
        this.h = ahwtVar;
        this.j = ahwtVar;
        this.k = ahwtVar;
        this.l = ahwtVar;
        this.a = aguzVar.a;
        this.b = aguzVar.b;
        this.c = aguzVar.c;
        this.d = aguzVar.d;
        this.e = aguzVar.e;
        this.f = aguzVar.f;
        this.g = aguzVar.g;
        this.h = aguzVar.h;
        this.i = aguzVar.i;
        this.j = aguzVar.j;
        this.k = aguzVar.k;
        this.l = aguzVar.l;
    }

    public aguv(byte[] bArr) {
        this.e = new defpackage.agaj();
        this.g = new defpackage.agaj();
        this.c = new defpackage.agaj();
        this.j = new defpackage.agaj();
        this.d = new defpackage.afzw(0.0f);
        this.k = new defpackage.afzw(0.0f);
        this.f = new defpackage.afzw(0.0f);
        this.b = new defpackage.afzw(0.0f);
        this.a = new defpackage.agab();
        this.i = new defpackage.agab();
        this.l = new defpackage.agab();
        this.h = new defpackage.agab();
    }
}
