package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class nbj extends aomh implements aonj {
    int a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    java.lang.Object e;
    int f;
    final /* synthetic */ defpackage.nbn g;
    final /* synthetic */ alio h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbj(defpackage.nbn nbnVar, alio alioVar, aoln aolnVar) {
        super(1, aolnVar);
        this.g = nbnVar;
        this.h = alioVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.nbj(this.g, this.h, (aoln) obj).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0179  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object b(java.lang.Object obj) {
        int i;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object aepgVar;
        java.lang.Object obj5;
        java.lang.Object obj6;
        java.lang.Object aepgVar2;
        aimw aimwVar;
        java.lang.Object aepgVar3;
        defpackage.nbn nbnVar;
        alio alioVar;
        aimw aimwVar2;
        defpackage.nbn nbnVar2;
        defpackage.nvp nvpVar;
        defpackage.nbn nbnVar3;
        defpackage.nej nejVar;
        aolu aoluVar = aolu.a;
        switch (this.f) {
            case 0:
                aooc.af(obj);
                defpackage.nbn nbnVar4 = this.g;
                ptx ptxVar = nbnVar4.k;
                i = (ptxVar.l() || ptxVar.r()) ? 1 : 0;
                if (i != 0) {
                    aimw aimwVarC = defpackage.nbn.a.c();
                    alio alioVar2 = this.h;
                    aimw aimwVarL = aimwVarC.k(alioVar2).j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "onError$<anonymous>", 164, "DobbyDuplexListener.kt");
                    aepgVar = new aepg(alioVar2.a);
                    this.b = aimwVarL;
                    this.c = "Duplex error reason: %s, dobby session case: %s(started %s) [Fallback Ignored]";
                    this.d = aepgVar;
                    this.a = 1;
                    this.f = 1;
                    obj = nbnVar4.d(this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    obj5 = "Duplex error reason: %s, dobby session case: %s(started %s) [Fallback Ignored]";
                    obj6 = aimwVarL;
                    aepgVar2 = new aepg((java.lang.Enum) obj);
                    defpackage.nbn nbnVar5 = this.g;
                    this.b = obj6;
                    this.c = obj5;
                    this.d = aepgVar;
                    this.e = aepgVar2;
                    this.a = i;
                    this.f = 2;
                    obj = nbnVar5.e(this);
                    aimwVar = obj6;
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    aimwVar.M((java.lang.String) obj5, aepgVar, aepgVar2, new aepg((java.lang.Enum) obj));
                    nbnVar = this.g;
                    alioVar = this.h;
                    this.b = null;
                    this.c = null;
                    this.d = null;
                    this.e = null;
                    this.a = i;
                    this.f = 5;
                    if (nbnVar.c.r(alioVar, this) == aoluVar) {
                        return aoluVar;
                    }
                    nbnVar2 = this.g;
                    nvpVar = defpackage.nvp.EVENT_DUPLEX_ERROR;
                    this.a = i;
                    this.f = 6;
                    if (nbnVar2.c.x(nvpVar, this) == aoluVar) {
                        return aoluVar;
                    }
                    nbnVar3 = this.g;
                    gus.aw("CEVT_DUPLEX_ERROR");
                    nbnVar3.g.c();
                    if (i == 0) {
                        nbnVar3.e.a(mcd.H);
                        nejVar = nbnVar3.b;
                        this.f = 7;
                        if (nejVar.g(this) == aoluVar) {
                            return aoluVar;
                        }
                    }
                    return aojh.a;
                }
                aimw aimwVarC2 = defpackage.nbn.a.c();
                alio alioVar3 = this.h;
                aimw aimwVarL2 = aimwVarC2.k(alioVar3).j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "onError$<anonymous>", 175, "DobbyDuplexListener.kt");
                aepg aepgVar4 = new aepg(alioVar3.a);
                this.b = aimwVarL2;
                this.c = "Duplex error reason: %s, dobby session case: %s(started %s)";
                this.d = aepgVar4;
                this.a = 0;
                this.f = 3;
                obj = nbnVar4.d(this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                obj2 = aepgVar4;
                obj3 = "Duplex error reason: %s, dobby session case: %s(started %s)";
                obj4 = aimwVarL2;
                aepgVar3 = new aepg((java.lang.Enum) obj);
                defpackage.nbn nbnVar6 = this.g;
                this.b = obj4;
                this.c = obj3;
                this.d = obj2;
                this.e = aepgVar3;
                this.a = i;
                this.f = 4;
                obj = nbnVar6.e(this);
                aimwVar2 = obj4;
                if (obj == aoluVar) {
                    return aoluVar;
                }
                aimwVar2.M((java.lang.String) obj3, obj2, aepgVar3, new aepg((java.lang.Enum) obj));
                nbnVar = this.g;
                alioVar = this.h;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = null;
                this.a = i;
                this.f = 5;
                if (nbnVar.c.r(alioVar, this) == aoluVar) {
                    return aoluVar;
                }
                nbnVar2 = this.g;
                nvpVar = defpackage.nvp.EVENT_DUPLEX_ERROR;
                this.a = i;
                this.f = 6;
                if (nbnVar2.c.x(nvpVar, this) == aoluVar) {
                    return aoluVar;
                }
                nbnVar3 = this.g;
                gus.aw("CEVT_DUPLEX_ERROR");
                nbnVar3.g.c();
                if (i == 0) {
                    nbnVar3.e.a(mcd.H);
                    nejVar = nbnVar3.b;
                    this.f = 7;
                    if (nejVar.g(this) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case 1:
                i = this.a;
                java.lang.Object obj7 = this.d;
                java.lang.Object obj8 = this.c;
                java.lang.Object obj9 = this.b;
                aooc.af(obj);
                obj6 = obj9;
                obj5 = obj8;
                aepgVar = obj7;
                aepgVar2 = new aepg((java.lang.Enum) obj);
                defpackage.nbn nbnVar7 = this.g;
                this.b = obj6;
                this.c = obj5;
                this.d = aepgVar;
                this.e = aepgVar2;
                this.a = i;
                this.f = 2;
                obj = nbnVar7.e(this);
                aimwVar = obj6;
                if (obj == aoluVar) {
                    return aoluVar;
                }
                aimwVar.M((java.lang.String) obj5, aepgVar, aepgVar2, new aepg((java.lang.Enum) obj));
                nbnVar = this.g;
                alioVar = this.h;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = null;
                this.a = i;
                this.f = 5;
                if (nbnVar.c.r(alioVar, this) == aoluVar) {
                    return aoluVar;
                }
                nbnVar2 = this.g;
                nvpVar = defpackage.nvp.EVENT_DUPLEX_ERROR;
                this.a = i;
                this.f = 6;
                if (nbnVar2.c.x(nvpVar, this) == aoluVar) {
                    return aoluVar;
                }
                nbnVar3 = this.g;
                gus.aw("CEVT_DUPLEX_ERROR");
                nbnVar3.g.c();
                if (i == 0) {
                    nbnVar3.e.a(mcd.H);
                    nejVar = nbnVar3.b;
                    this.f = 7;
                    if (nejVar.g(this) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case 2:
                i = this.a;
                aepgVar2 = this.e;
                aepgVar = this.d;
                obj5 = this.c;
                java.lang.Object obj10 = this.b;
                aooc.af(obj);
                aimwVar = obj10;
                aimwVar.M((java.lang.String) obj5, aepgVar, aepgVar2, new aepg((java.lang.Enum) obj));
                nbnVar = this.g;
                alioVar = this.h;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = null;
                this.a = i;
                this.f = 5;
                if (nbnVar.c.r(alioVar, this) == aoluVar) {
                    return aoluVar;
                }
                nbnVar2 = this.g;
                nvpVar = defpackage.nvp.EVENT_DUPLEX_ERROR;
                this.a = i;
                this.f = 6;
                if (nbnVar2.c.x(nvpVar, this) == aoluVar) {
                    return aoluVar;
                }
                nbnVar3 = this.g;
                gus.aw("CEVT_DUPLEX_ERROR");
                nbnVar3.g.c();
                if (i == 0) {
                    nbnVar3.e.a(mcd.H);
                    nejVar = nbnVar3.b;
                    this.f = 7;
                    if (nejVar.g(this) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case 3:
                i = this.a;
                java.lang.Object obj11 = this.d;
                java.lang.Object obj12 = this.c;
                java.lang.Object obj13 = this.b;
                aooc.af(obj);
                obj4 = obj13;
                obj3 = obj12;
                obj2 = obj11;
                aepgVar3 = new aepg((java.lang.Enum) obj);
                defpackage.nbn nbnVar8 = this.g;
                this.b = obj4;
                this.c = obj3;
                this.d = obj2;
                this.e = aepgVar3;
                this.a = i;
                this.f = 4;
                obj = nbnVar8.e(this);
                aimwVar2 = obj4;
                if (obj == aoluVar) {
                    return aoluVar;
                }
                aimwVar2.M((java.lang.String) obj3, obj2, aepgVar3, new aepg((java.lang.Enum) obj));
                nbnVar = this.g;
                alioVar = this.h;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = null;
                this.a = i;
                this.f = 5;
                if (nbnVar.c.r(alioVar, this) == aoluVar) {
                    return aoluVar;
                }
                nbnVar2 = this.g;
                nvpVar = defpackage.nvp.EVENT_DUPLEX_ERROR;
                this.a = i;
                this.f = 6;
                if (nbnVar2.c.x(nvpVar, this) == aoluVar) {
                    return aoluVar;
                }
                nbnVar3 = this.g;
                gus.aw("CEVT_DUPLEX_ERROR");
                nbnVar3.g.c();
                if (i == 0) {
                    nbnVar3.e.a(mcd.H);
                    nejVar = nbnVar3.b;
                    this.f = 7;
                    if (nejVar.g(this) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case 4:
                i = this.a;
                aepgVar3 = this.e;
                obj2 = this.d;
                obj3 = this.c;
                java.lang.Object obj14 = this.b;
                aooc.af(obj);
                aimwVar2 = obj14;
                aimwVar2.M((java.lang.String) obj3, obj2, aepgVar3, new aepg((java.lang.Enum) obj));
                nbnVar = this.g;
                alioVar = this.h;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = null;
                this.a = i;
                this.f = 5;
                if (nbnVar.c.r(alioVar, this) == aoluVar) {
                    return aoluVar;
                }
                nbnVar2 = this.g;
                nvpVar = defpackage.nvp.EVENT_DUPLEX_ERROR;
                this.a = i;
                this.f = 6;
                if (nbnVar2.c.x(nvpVar, this) == aoluVar) {
                    return aoluVar;
                }
                nbnVar3 = this.g;
                gus.aw("CEVT_DUPLEX_ERROR");
                nbnVar3.g.c();
                if (i == 0) {
                    nbnVar3.e.a(mcd.H);
                    nejVar = nbnVar3.b;
                    this.f = 7;
                    if (nejVar.g(this) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case 5:
                i = this.a;
                aooc.af(obj);
                nbnVar2 = this.g;
                nvpVar = defpackage.nvp.EVENT_DUPLEX_ERROR;
                this.a = i;
                this.f = 6;
                if (nbnVar2.c.x(nvpVar, this) == aoluVar) {
                    return aoluVar;
                }
                nbnVar3 = this.g;
                gus.aw("CEVT_DUPLEX_ERROR");
                nbnVar3.g.c();
                if (i == 0) {
                    nbnVar3.e.a(mcd.H);
                    nejVar = nbnVar3.b;
                    this.f = 7;
                    if (nejVar.g(this) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case 6:
                i = this.a;
                aooc.af(obj);
                nbnVar3 = this.g;
                gus.aw("CEVT_DUPLEX_ERROR");
                nbnVar3.g.c();
                if (i == 0) {
                    nbnVar3.e.a(mcd.H);
                    nejVar = nbnVar3.b;
                    this.f = 7;
                    if (nejVar.g(this) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            default:
                aooc.af(obj);
                return aojh.a;
        }
    }
}
