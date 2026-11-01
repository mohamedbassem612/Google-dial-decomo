package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abmi extends defpackage.agke {
    private final defpackage.abmk d;

    /* JADX WARN: Illegal instructions before constructor call */
    public abmi(defpackage.abmm abmmVar, defpackage.abmk abmkVar) {
        aooh.f(abmmVar, "colors");
        aooh.f(abmkVar, "layer");
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(abmmVar.a);
        int i = abmmVar.b;
        int i2 = abmmVar.c;
        super(numValueOf, new defpackage.agma(i, i2, i2), 1);
        this.d = abmkVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    private final defpackage.agja i(defpackage.agja agjaVar) throws aois {
        int iOrdinal = this.d.ordinal();
        if (iOrdinal == 0) {
            return agjaVar;
        }
        if (iOrdinal == 1) {
            return defpackage.agja.b(agjaVar, 2371);
        }
        if (iOrdinal == 2) {
            return defpackage.agja.b(agjaVar, 4093);
        }
        throw new aois();
    }

    @Override // defpackage.agke
    public final defpackage.agja a() {
        return i(super.a());
    }

    @Override // defpackage.agke
    public final defpackage.agja b() {
        return i(super.b());
    }

    @Override // defpackage.agke
    public final defpackage.agja c() {
        return i(super.c());
    }

    @Override // defpackage.agke
    public final defpackage.agja d() {
        return i(super.d());
    }

    @Override // defpackage.agke
    public final defpackage.agja e() {
        return i(super.e());
    }

    @Override // defpackage.agke
    public final defpackage.agja f() {
        return i(super.f());
    }

    @Override // defpackage.agke
    public final defpackage.agja g() {
        return i(super.g());
    }

    @Override // defpackage.agke
    public final defpackage.agja h() {
        final java.util.List listBb = ajsz.bb(new defpackage.agja[]{b(), g(), d(), a(), c(), e()});
        aooh.f(listBb, "orderedConfigs");
        defpackage.agja agjaVar = (defpackage.agja) ajsz.bG(listBb);
        if (agjaVar == null) {
            agjaVar = new defpackage.agja(null);
        }
        return i(defpackage.agmc.A(defpackage.agmc.A(agjaVar, new aonj() { // from class: agkg
            public final java.lang.Object a(java.lang.Object obj) {
                defpackage.agjm agjmVar;
                java.lang.Object next;
                defpackage.agiy agiyVar;
                java.lang.Object next2;
                defpackage.agjc agjcVar;
                java.lang.Object next3;
                defpackage.agjq agjqVar;
                java.lang.Object next4;
                defpackage.agiw agiwVar;
                java.lang.Object next5;
                defpackage.agiw agiwVar2;
                java.lang.Object next6;
                defpackage.agjs agjsVar;
                java.lang.Object next7;
                defpackage.agjp agjpVar;
                java.lang.Object next8;
                defpackage.agjo agjoVar;
                java.lang.Object next9;
                defpackage.agjn agjnVar;
                defpackage.agki agkiVar = (defpackage.agki) obj;
                aooh.f(agkiVar, "$this$copy");
                defpackage.agjn agjnVar2 = agkiVar.b;
                java.util.List list = listBb;
                java.lang.Object obj2 = null;
                if (agjnVar2 == null) {
                    java.util.Iterator it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            next9 = null;
                            break;
                        }
                        next9 = it.next();
                    } while (((defpackage.agja) next9).b == null);
                    defpackage.agja agjaVar2 = (defpackage.agja) next9;
                    if (agjaVar2 != null && (agjnVar = agjaVar2.b) != null) {
                        agkiVar.b = defpackage.agmc.D(agjnVar, new defpackage.agkd(6));
                    }
                }
                if (agkiVar.c == null) {
                    java.util.Iterator it2 = list.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next8 = null;
                            break;
                        }
                        next8 = it2.next();
                    } while (((defpackage.agja) next8).c == null);
                    defpackage.agja agjaVar3 = (defpackage.agja) next8;
                    if (agjaVar3 != null && (agjoVar = agjaVar3.c) != null) {
                        agkiVar.c = defpackage.agmc.E(agjoVar, new defpackage.agkd(7));
                    }
                }
                if (agkiVar.d == null) {
                    java.util.Iterator it3 = list.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next7 = null;
                            break;
                        }
                        next7 = it3.next();
                    } while (((defpackage.agja) next7).d == null);
                    defpackage.agja agjaVar4 = (defpackage.agja) next7;
                    if (agjaVar4 != null && (agjpVar = agjaVar4.d) != null) {
                        agkiVar.d = defpackage.agmc.F(agjpVar, new defpackage.agkd(8));
                    }
                }
                if (agkiVar.e == null) {
                    java.util.Iterator it4 = list.iterator();
                    do {
                        if (!it4.hasNext()) {
                            next6 = null;
                            break;
                        }
                        next6 = it4.next();
                    } while (((defpackage.agja) next6).e == null);
                    defpackage.agja agjaVar5 = (defpackage.agja) next6;
                    if (agjaVar5 != null && (agjsVar = agjaVar5.e) != null) {
                        agkiVar.e = defpackage.agmc.H(agjsVar, new defpackage.agkd(9));
                    }
                }
                if (agkiVar.f == null) {
                    java.util.Iterator it5 = list.iterator();
                    do {
                        if (!it5.hasNext()) {
                            next5 = null;
                            break;
                        }
                        next5 = it5.next();
                    } while (((defpackage.agja) next5).f == null);
                    defpackage.agja agjaVar6 = (defpackage.agja) next5;
                    if (agjaVar6 != null && (agiwVar2 = agjaVar6.f) != null) {
                        agkiVar.f = defpackage.agmc.y(agiwVar2, new defpackage.agkd(10));
                    }
                }
                if (agkiVar.g == null) {
                    java.util.Iterator it6 = list.iterator();
                    do {
                        if (!it6.hasNext()) {
                            next4 = null;
                            break;
                        }
                        next4 = it6.next();
                    } while (((defpackage.agja) next4).g == null);
                    defpackage.agja agjaVar7 = (defpackage.agja) next4;
                    if (agjaVar7 != null && (agiwVar = agjaVar7.g) != null) {
                        agkiVar.g = defpackage.agmc.y(agiwVar, new defpackage.agkd(11));
                    }
                }
                if (agkiVar.h == null) {
                    java.util.Iterator it7 = list.iterator();
                    do {
                        if (!it7.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it7.next();
                    } while (((defpackage.agja) next3).h == null);
                    defpackage.agja agjaVar8 = (defpackage.agja) next3;
                    if (agjaVar8 != null && (agjqVar = agjaVar8.h) != null) {
                        agkiVar.h = defpackage.agmc.G(agjqVar, new defpackage.agkd(12));
                    }
                }
                if (agkiVar.i == null) {
                    java.util.Iterator it8 = list.iterator();
                    do {
                        if (!it8.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it8.next();
                    } while (((defpackage.agja) next2).i == null);
                    defpackage.agja agjaVar9 = (defpackage.agja) next2;
                    if (agjaVar9 != null && (agjcVar = agjaVar9.i) != null) {
                        agkiVar.i = defpackage.agmc.B(agjcVar, new defpackage.agkd(13));
                    }
                }
                if (agkiVar.j == null) {
                    java.util.Iterator it9 = list.iterator();
                    do {
                        if (!it9.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it9.next();
                    } while (((defpackage.agja) next).j == null);
                    defpackage.agja agjaVar10 = (defpackage.agja) next;
                    if (agjaVar10 != null && (agiyVar = agjaVar10.j) != null) {
                        agkiVar.j = defpackage.agmc.z(agiyVar, new defpackage.agkd(14));
                    }
                }
                if (agkiVar.k == null) {
                    for (java.lang.Object obj3 : list) {
                        if (((defpackage.agja) obj3).k != null) {
                            obj2 = obj3;
                            break;
                        }
                    }
                    defpackage.agja agjaVar11 = (defpackage.agja) obj2;
                    if (agjaVar11 != null && (agjmVar = agjaVar11.k) != null) {
                        agkiVar.k = defpackage.agmc.C(agjmVar, new defpackage.agkd(5));
                    }
                }
                return aojh.a;
            }
        }), new defpackage.abiy(6)));
    }
}
