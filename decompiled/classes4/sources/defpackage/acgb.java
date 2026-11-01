package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class acgb extends defpackage.acex {
    static final ahxq a = new defpackage.acet();
    static final ahxq b = new defpackage.acfk();

    @Override // defpackage.acex
    public final void a(defpackage.akul akulVar, akzx akzxVar) {
        if ((akulVar.b & 16) != 0) {
            akzx akzxVarM = defpackage.akjc.a.m();
            ahxq ahxqVar = b;
            defpackage.akuk akukVar = akulVar.i;
            if (akukVar == null) {
                akukVar = defpackage.akuk.a;
            }
            defpackage.akty aktyVarB = defpackage.akty.b(akukVar.d);
            if (aktyVarB == null) {
                aktyVarB = defpackage.akty.USER_ACTION_UNSPECIFIED;
            }
            defpackage.akjb akjbVar = (defpackage.akjb) ahxqVar.d(aktyVarB);
            akzxVarM.u();
            defpackage.akjc akjcVar = (defpackage.akjc) akzxVarM.b;
            akjcVar.e = akjbVar.f;
            akjcVar.b |= 1;
            defpackage.akuk akukVar2 = akulVar.i;
            if (akukVar2 == null) {
                akukVar2 = defpackage.akuk.a;
            }
            defpackage.ammn ammnVar = akukVar2.c;
            if (ammnVar == null) {
                ammnVar = defpackage.ammn.a;
            }
            java.lang.String str = ammnVar.b;
            akzxVarM.u();
            defpackage.akjc akjcVar2 = (defpackage.akjc) akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            akjcVar2.b |= 2;
            akjcVar2.f = str;
            defpackage.akuk akukVar3 = akulVar.i;
            if (akukVar3 == null) {
                akukVar3 = defpackage.akuk.a;
            }
            if ((akukVar3.b & 4) != 0) {
                akzx akzxVarM2 = defpackage.akkd.a.m();
                ahxq ahxqVar2 = a;
                defpackage.akuk akukVar4 = akulVar.i;
                if (akukVar4 == null) {
                    akukVar4 = defpackage.akuk.a;
                }
                defpackage.aktz aktzVar = akukVar4.e;
                if (aktzVar == null) {
                    aktzVar = defpackage.aktz.a;
                }
                defpackage.akiv akivVar = (defpackage.akiv) ahxqVar2.d(aktzVar);
                akzxVarM2.u();
                defpackage.akkd akkdVar = (defpackage.akkd) akzxVarM2.b;
                j$.util.Objects.requireNonNull(akivVar);
                akkdVar.d = akivVar;
                akkdVar.b |= 2;
                akkc akkcVar = akkc.b;
                akzxVarM2.u();
                defpackage.akkd akkdVar2 = (defpackage.akkd) akzxVarM2.b;
                akkdVar2.c = akkcVar.d;
                akkdVar2.b |= 1;
                akzxVarM.aE(akzxVarM2);
            }
            defpackage.akuk akukVar5 = akulVar.i;
            if (akukVar5 == null) {
                akukVar5 = defpackage.akuk.a;
            }
            if ((akukVar5.b & 8) != 0) {
                akzx akzxVarM3 = defpackage.akkd.a.m();
                ahxq ahxqVar3 = a;
                defpackage.akuk akukVar6 = akulVar.i;
                if (akukVar6 == null) {
                    akukVar6 = defpackage.akuk.a;
                }
                defpackage.aktz aktzVar2 = akukVar6.f;
                if (aktzVar2 == null) {
                    aktzVar2 = defpackage.aktz.a;
                }
                defpackage.akiv akivVar2 = (defpackage.akiv) ahxqVar3.d(aktzVar2);
                akzxVarM3.u();
                defpackage.akkd akkdVar3 = (defpackage.akkd) akzxVarM3.b;
                j$.util.Objects.requireNonNull(akivVar2);
                akkdVar3.d = akivVar2;
                akkdVar3.b |= 2;
                akkc akkcVar2 = akkc.c;
                akzxVarM3.u();
                defpackage.akkd akkdVar4 = (defpackage.akkd) akzxVarM3.b;
                akkdVar4.c = akkcVar2.d;
                akkdVar4.b |= 1;
                akzxVarM.aE(akzxVarM3);
            }
            akzxVar.u();
            akkh akkhVar = akzxVar.b;
            defpackage.akjc akjcVar3 = (defpackage.akjc) akzxVarM.p();
            akkh akkhVar2 = akkh.a;
            j$.util.Objects.requireNonNull(akjcVar3);
            akkhVar.k = akjcVar3;
            akkhVar.b |= 32;
        }
    }

    @Override // defpackage.acex
    public final void b(defpackage.akul akulVar, akzx akzxVar) {
        int i = akulVar.b;
        if ((i & 4) != 0) {
            defpackage.aktz aktzVar = akulVar.g;
            if (aktzVar == null) {
                aktzVar = defpackage.aktz.a;
            }
            amml ammlVar = aktzVar.e;
            if (ammlVar == null) {
                ammlVar = amml.a;
            }
            akzxVar.u();
            akkh akkhVar = akzxVar.b;
            akkh akkhVar2 = akkh.a;
            j$.util.Objects.requireNonNull(ammlVar);
            akkhVar.e = ammlVar;
            akkhVar.b |= 1;
            return;
        }
        if ((i & 8) == 0) {
            akzxVar.u();
            akkh akkhVar3 = akzxVar.b;
            akkh akkhVar4 = akkh.a;
            akkhVar3.e = null;
            akkhVar3.b &= -2;
            return;
        }
        defpackage.aktz aktzVar2 = akulVar.h;
        if (aktzVar2 == null) {
            aktzVar2 = defpackage.aktz.a;
        }
        amml ammlVar2 = aktzVar2.e;
        if (ammlVar2 == null) {
            ammlVar2 = amml.a;
        }
        akzxVar.u();
        akkh akkhVar5 = akzxVar.b;
        akkh akkhVar6 = akkh.a;
        j$.util.Objects.requireNonNull(ammlVar2);
        akkhVar5.e = ammlVar2;
        akkhVar5.b |= 1;
    }

    @Override // defpackage.acex
    public final void c(defpackage.akul akulVar, akzx akzxVar) {
        if ((akulVar.b & 2) != 0) {
            defpackage.ammn ammnVar = akulVar.f;
            if (ammnVar == null) {
                ammnVar = defpackage.ammn.a;
            }
            java.lang.String str = ammnVar.b;
            akzxVar.u();
            akkh akkhVar = akzxVar.b;
            akkh akkhVar2 = akkh.a;
            j$.util.Objects.requireNonNull(str);
            akkhVar.b |= 8;
            akkhVar.h = str;
        }
    }

    @Override // defpackage.acex
    public final void d(defpackage.akul akulVar, akzx akzxVar) {
        if ((akulVar.b & 1) != 0) {
            defpackage.ammn ammnVar = akulVar.e;
            if (ammnVar == null) {
                ammnVar = defpackage.ammn.a;
            }
            java.lang.String str = ammnVar.b;
            akzxVar.u();
            akkh akkhVar = akzxVar.b;
            akkh akkhVar2 = akkh.a;
            j$.util.Objects.requireNonNull(str);
            akkhVar.b |= 4;
            akkhVar.g = str;
        }
    }

    @Override // defpackage.acex
    public final void e(defpackage.akul akulVar, akzx akzxVar) {
        if ((akulVar.b & 4) != 0) {
            akzx akzxVarM = defpackage.akkd.a.m();
            ahxq ahxqVar = a;
            defpackage.aktz aktzVar = akulVar.g;
            if (aktzVar == null) {
                aktzVar = defpackage.aktz.a;
            }
            defpackage.akiv akivVar = (defpackage.akiv) ahxqVar.d(aktzVar);
            akzxVarM.u();
            defpackage.akkd akkdVar = (defpackage.akkd) akzxVarM.b;
            j$.util.Objects.requireNonNull(akivVar);
            akkdVar.d = akivVar;
            akkdVar.b |= 2;
            akkc akkcVar = akkc.b;
            akzxVarM.u();
            defpackage.akkd akkdVar2 = (defpackage.akkd) akzxVarM.b;
            akkdVar2.c = akkcVar.d;
            akkdVar2.b |= 1;
            akzxVar.aG(akzxVarM);
        }
        if ((akulVar.b & 8) != 0) {
            akzx akzxVarM2 = defpackage.akkd.a.m();
            ahxq ahxqVar2 = a;
            defpackage.aktz aktzVar2 = akulVar.h;
            if (aktzVar2 == null) {
                aktzVar2 = defpackage.aktz.a;
            }
            defpackage.akiv akivVar2 = (defpackage.akiv) ahxqVar2.d(aktzVar2);
            akzxVarM2.u();
            defpackage.akkd akkdVar3 = (defpackage.akkd) akzxVarM2.b;
            j$.util.Objects.requireNonNull(akivVar2);
            akkdVar3.d = akivVar2;
            akkdVar3.b |= 2;
            akkc akkcVar2 = akkc.c;
            akzxVarM2.u();
            defpackage.akkd akkdVar4 = (defpackage.akkd) akzxVarM2.b;
            akkdVar4.c = akkcVar2.d;
            akkdVar4.b |= 1;
            akzxVar.aG(akzxVarM2);
        }
    }

    @Override // defpackage.acex
    public final void f(defpackage.akul akulVar, akzx akzxVar) {
        if ((akulVar.b & 32) != 0) {
            int iAQ = a.aQ(akulVar.j);
            int i = 1;
            if (iAQ == 0) {
                iAQ = 1;
            }
            int i2 = iAQ - 1;
            if (i2 != 0) {
                i = i2 != 1 ? 3 : 2;
            }
            akzxVar.u();
            akkh akkhVar = akzxVar.b;
            akkh akkhVar2 = akkh.a;
            akkhVar.m = i - 1;
            akkhVar.b |= 128;
        }
    }

    @Override // defpackage.acex
    public final void g(defpackage.akul akulVar, akzx akzxVar) {
        int i = akulVar.b;
        if ((i & 4) != 0) {
            defpackage.aktz aktzVar = akulVar.g;
            if (aktzVar == null) {
                aktzVar = defpackage.aktz.a;
            }
            amml ammlVar = aktzVar.c;
            if (ammlVar == null) {
                ammlVar = amml.a;
            }
            akzxVar.u();
            akkh akkhVar = akzxVar.b;
            akkh akkhVar2 = akkh.a;
            j$.util.Objects.requireNonNull(ammlVar);
            akkhVar.f = ammlVar;
            akkhVar.b |= 2;
            return;
        }
        if ((i & 8) == 0) {
            akzxVar.u();
            akkh akkhVar3 = akzxVar.b;
            akkh akkhVar4 = akkh.a;
            akkhVar3.f = null;
            akkhVar3.b &= -3;
            return;
        }
        defpackage.aktz aktzVar2 = akulVar.h;
        if (aktzVar2 == null) {
            aktzVar2 = defpackage.aktz.a;
        }
        amml ammlVar2 = aktzVar2.c;
        if (ammlVar2 == null) {
            ammlVar2 = amml.a;
        }
        akzxVar.u();
        akkh akkhVar5 = akzxVar.b;
        akkh akkhVar6 = akkh.a;
        j$.util.Objects.requireNonNull(ammlVar2);
        akkhVar5.f = ammlVar2;
        akkhVar5.b |= 2;
    }
}
