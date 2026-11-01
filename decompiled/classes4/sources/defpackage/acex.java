package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
abstract class acex implements ahyc {
    public abstract void a(defpackage.akul akulVar, akzx akzxVar);

    public final /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
        defpackage.akul akulVar = (defpackage.akul) obj;
        akzx akzxVarM = akkh.a.m();
        int i = akulVar.c;
        if (i == 6 && defpackage.aklu.c(6) == 7) {
            java.lang.String str = i == 6 ? (java.lang.String) akulVar.d : "";
            akzxVarM.u();
            akkh akkhVar = akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            akkhVar.c = 1;
            akkhVar.d = str;
        }
        int i2 = akulVar.c;
        if (i2 == 7 && defpackage.aklu.c(7) == 8) {
            java.lang.String str2 = i2 == 7 ? (java.lang.String) akulVar.d : "";
            akzxVarM.u();
            akkh akkhVar2 = akzxVarM.b;
            j$.util.Objects.requireNonNull(str2);
            akkhVar2.c = 8;
            akkhVar2.d = str2;
        }
        int i3 = akulVar.c;
        if (i3 == 8 && defpackage.aklu.c(8) == 9) {
            int iIntValue = i3 == 8 ? ((java.lang.Integer) akulVar.d).intValue() : 0;
            akzxVarM.u();
            akkh akkhVar3 = akzxVarM.b;
            akkhVar3.c = 9;
            akkhVar3.d = java.lang.Integer.valueOf(iIntValue);
        }
        b(akulVar, akzxVarM);
        g(akulVar, akzxVarM);
        if ((akulVar.b & 1) != 0) {
            d(akulVar, akzxVarM);
        }
        if ((akulVar.b & 2) != 0) {
            c(akulVar, akzxVarM);
        }
        e(akulVar, akzxVarM);
        a(akulVar, akzxVarM);
        f(akulVar, akzxVarM);
        return akzxVarM.p();
    }

    public abstract void b(defpackage.akul akulVar, akzx akzxVar);

    public abstract void c(defpackage.akul akulVar, akzx akzxVar);

    public abstract void d(defpackage.akul akulVar, akzx akzxVar);

    public abstract void e(defpackage.akul akulVar, akzx akzxVar);

    public abstract void f(defpackage.akul akulVar, akzx akzxVar);

    public abstract void g(defpackage.akul akulVar, akzx akzxVar);
}
