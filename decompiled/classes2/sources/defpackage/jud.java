package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jud extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ defpackage.jue d;
    final /* synthetic */ java.lang.String e;
    final /* synthetic */ defpackage.kiw f;
    final /* synthetic */ int g;
    final /* synthetic */ long h;
    final /* synthetic */ java.lang.String i;
    final /* synthetic */ java.lang.String j;
    final /* synthetic */ rsr k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jud(defpackage.jue jueVar, java.lang.String str, rsr rsrVar, defpackage.kiw kiwVar, int i, long j, java.lang.String str2, java.lang.String str3, aoln aolnVar) {
        super(2, aolnVar);
        this.d = jueVar;
        this.e = str;
        this.k = rsrVar;
        this.f = kiwVar;
        this.g = i;
        this.h = j;
        this.i = str2;
        this.j = str3;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object obj3;
        aolu aoluVar = aolu.a;
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                aooc.af(obj);
            } else {
                obj2 = this.b;
                obj3 = this.a;
                aooc.af(obj);
            }
            defpackage.kiw kiwVar = this.f;
            int i2 = this.g;
            long j = this.h;
            java.lang.String str = this.i;
            java.lang.String str2 = this.j;
            defpackage.hkd hkdVar = (defpackage.hkd) obj;
            defpackage.jhw jhwVarO = defpackage.hhv.o(defpackage.jrz.a.m());
            aooh.c(hkdVar);
            jhwVarO.F(hkdVar);
            jhwVarO.G(kiwVar);
            jhwVarO.J(8);
            akzx akzxVar = (akzx) jhwVarO.a;
            akzxVar.u();
            defpackage.jrz jrzVar = (defpackage.jrz) akzxVar.b;
            jrzVar.b |= 16;
            jrzVar.g = i2;
            akzxVar.u();
            defpackage.jrz jrzVar2 = (defpackage.jrz) akzxVar.b;
            jrzVar2.b |= 32;
            jrzVar2.h = j;
            jhwVarO.H(str);
            jhwVarO.I(str2);
            defpackage.al alVarAl = rsr.al(jhwVarO.E());
            defpackage.jue jueVar = this.d;
            alVarAl.r(jueVar.b.a(), "caller_id_feedback_dialog_fragment");
            jueVar.e = true;
            return aojh.a;
        }
        aooc.af(obj);
        defpackage.jue jueVar2 = this.d;
        obj2 = this.e;
        obj3 = jueVar2.i;
        this.a = obj3;
        this.b = obj2;
        this.c = 1;
        obj = jueVar2.f.b(this);
        if (obj == aoluVar) {
            return aoluVar;
        }
        ajcq ajcqVarV = ((ahbv) obj3).v((java.lang.String) obj2, (java.lang.String) obj);
        this.a = null;
        this.b = null;
        this.c = 2;
        obj = aosv.D(ajcqVarV, this);
        if (obj == aoluVar) {
            return aoluVar;
        }
        defpackage.kiw kiwVar2 = this.f;
        int i3 = this.g;
        long j2 = this.h;
        java.lang.String str3 = this.i;
        java.lang.String str4 = this.j;
        defpackage.hkd hkdVar2 = (defpackage.hkd) obj;
        defpackage.jhw jhwVarO2 = defpackage.hhv.o(defpackage.jrz.a.m());
        aooh.c(hkdVar2);
        jhwVarO2.F(hkdVar2);
        jhwVarO2.G(kiwVar2);
        jhwVarO2.J(8);
        akzx akzxVar2 = (akzx) jhwVarO2.a;
        akzxVar2.u();
        defpackage.jrz jrzVar3 = (defpackage.jrz) akzxVar2.b;
        jrzVar3.b |= 16;
        jrzVar3.g = i3;
        akzxVar2.u();
        defpackage.jrz jrzVar4 = (defpackage.jrz) akzxVar2.b;
        jrzVar4.b |= 32;
        jrzVar4.h = j2;
        jhwVarO2.H(str3);
        jhwVarO2.I(str4);
        defpackage.al alVarAl2 = rsr.al(jhwVarO2.E());
        defpackage.jue jueVar3 = this.d;
        alVarAl2.r(jueVar3.b.a(), "caller_id_feedback_dialog_fragment");
        jueVar3.e = true;
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.jud(this.d, this.e, this.k, this.f, this.g, this.h, this.i, this.j, aolnVar);
    }
}
