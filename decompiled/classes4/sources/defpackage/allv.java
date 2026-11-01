package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class allv implements defpackage.allg {
    private alln a;
    private final defpackage.allu b;
    private final defpackage.allj c;
    private boolean d;

    public allv(defpackage.alli alliVar, defpackage.allu alluVar) {
        this.c = alliVar.a(defpackage.allh.f.name());
        this.b = alluVar;
    }

    @Override // defpackage.allg
    public final aihd a() {
        return aihd.r(defpackage.alnb.EVENT_FLOW_OUTPUT, defpackage.alnb.EVENT_END_SAY_TIMING);
    }

    @Override // defpackage.allg
    public final void b(final defpackage.almy almyVar) {
        int i;
        defpackage.almz almzVar = almyVar.h;
        if (almzVar == null) {
            almzVar = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar.c);
        if (alnbVarB == null) {
            alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
        }
        if (alnbVarB.equals(defpackage.alnb.EVENT_END_SAY_TIMING)) {
            this.b.c();
        }
        defpackage.almz almzVar2 = almyVar.h;
        if (almzVar2 == null) {
            almzVar2 = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB2 = defpackage.alnb.b(almzVar2.c);
        if (alnbVarB2 == null) {
            alnbVarB2 = defpackage.alnb.EVENT_UNKNOWN;
        }
        if (alnbVarB2.equals(defpackage.alnb.EVENT_FLOW_OUTPUT)) {
            defpackage.almz almzVar3 = almyVar.h;
            if (almzVar3 == null) {
                almzVar3 = defpackage.almz.a;
            }
            apdi apdiVar = defpackage.alnf.k;
            almzVar3.c(apdiVar);
            java.lang.Object objJ = ((alaa) almzVar3).n.j((alac) apdiVar.a);
            if (objJ == null) {
                objJ = apdiVar.b;
            } else {
                apdiVar.c(objJ);
            }
            defpackage.alnf alnfVar = (defpackage.alnf) objJ;
            int i2 = alnfVar.c;
            if (i2 == 0) {
                i = 6;
            } else if (i2 == 1) {
                i = 1;
            } else if (i2 != 2) {
                switch (i2) {
                    case 12:
                        i = 3;
                        break;
                    case 13:
                        i = 4;
                        break;
                    case 14:
                        i = 5;
                        break;
                    default:
                        i = 0;
                        break;
                }
            } else {
                i = 2;
            }
            if (i == 0) {
                throw null;
            }
            int i3 = i - 1;
            if (i3 != 0) {
                if (i3 == 3) {
                    defpackage.allu alluVar = this.b;
                    defpackage.alnh alnhVar = (i2 == 13 ? (defpackage.alni) alnfVar.d : defpackage.alni.a).c;
                    if (alnhVar == null) {
                        alnhVar = defpackage.alnh.a;
                    }
                    defpackage.allj alljVar = this.c;
                    j$.util.Objects.requireNonNull(alljVar);
                    jwx jwxVar = new jwx(alljVar, 14);
                    defpackage.alsz alszVarB = defpackage.alsz.b(alnfVar.h);
                    if (alszVarB == null) {
                        alszVarB = defpackage.alsz.UNKNOWN_ENTITY;
                    }
                    alluVar.d(alnhVar, almyVar, jwxVar, alszVarB);
                    return;
                }
                if (i3 == 4) {
                    defpackage.allu alluVar2 = this.b;
                    defpackage.alrg alrgVar = i2 == 14 ? (defpackage.alrg) alnfVar.d : defpackage.alrg.b;
                    defpackage.alsy alsyVarB = defpackage.alsy.b(alnfVar.g);
                    if (alsyVarB == null) {
                        alsyVarB = defpackage.alsy.NO_ACTION;
                    }
                    defpackage.allj alljVar2 = this.c;
                    j$.util.Objects.requireNonNull(alljVar2);
                    jwx jwxVar2 = new jwx(alljVar2, 14);
                    defpackage.alsz alszVarB2 = defpackage.alsz.b(alnfVar.h);
                    if (alszVarB2 == null) {
                        alszVarB2 = defpackage.alsz.UNKNOWN_ENTITY;
                    }
                    akzx akzxVarM = defpackage.alol.a.m();
                    akzxVarM.u();
                    defpackage.alol alolVar = (defpackage.alol) akzxVarM.b;
                    alolVar.d = alszVarB2.d;
                    alolVar.b |= 2;
                    akzxVarM.u();
                    defpackage.alol alolVar2 = (defpackage.alol) akzxVarM.b;
                    alolVar2.c = alsyVarB.j;
                    alolVar2.b |= 1;
                    akzx akzxVarM2 = defpackage.alsw.a.m();
                    akzxVarM2.u();
                    defpackage.alsw alswVar = (defpackage.alsw) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(alrgVar);
                    alswVar.c = alrgVar;
                    alswVar.b = 3;
                    akzxVarM.u();
                    defpackage.alol alolVar3 = (defpackage.alol) akzxVarM.b;
                    defpackage.alsw alswVar2 = (defpackage.alsw) akzxVarM2.p();
                    j$.util.Objects.requireNonNull(alswVar2);
                    alolVar3.e = alswVar2;
                    alolVar3.b |= 4;
                    alluVar2.e.h(new defpackage.alka(defpackage.allu.a((defpackage.alol) akzxVarM.p()), almyVar, jwxVar2));
                    return;
                }
                return;
            }
            if ((alnfVar.b & 8) != 0) {
                defpackage.allu alluVar3 = this.b;
                defpackage.almm almmVar = i2 == 1 ? (defpackage.almm) alnfVar.d : defpackage.almm.a;
                defpackage.alsy alsyVarB2 = defpackage.alsy.b(alnfVar.g);
                if (alsyVarB2 == null) {
                    alsyVarB2 = defpackage.alsy.NO_ACTION;
                }
                defpackage.allj alljVar3 = this.c;
                j$.util.Objects.requireNonNull(alljVar3);
                jwx jwxVar3 = new jwx(alljVar3, 14);
                defpackage.alsz alszVarB3 = defpackage.alsz.b(alnfVar.h);
                if (alszVarB3 == null) {
                    alszVarB3 = defpackage.alsz.UNKNOWN_ENTITY;
                }
                defpackage.alxa alxaVar = alnfVar.j;
                if (alxaVar == null) {
                    alxaVar = defpackage.alxa.a;
                }
                akzx akzxVarM3 = defpackage.alsn.a.m();
                java.lang.String str = almmVar.c;
                akzxVarM3.u();
                defpackage.alsn alsnVar = (defpackage.alsn) akzxVarM3.b;
                j$.util.Objects.requireNonNull(str);
                alsnVar.b |= 1;
                alsnVar.c = str;
                akzx akzxVarM4 = defpackage.alsm.a.m();
                java.lang.String str2 = alxaVar.c;
                akzxVarM4.u();
                defpackage.alsm alsmVar = (defpackage.alsm) akzxVarM4.b;
                j$.util.Objects.requireNonNull(str2);
                alsmVar.b |= 1;
                alsmVar.c = str2;
                akzxVarM4.u();
                defpackage.alsm alsmVar2 = (defpackage.alsm) akzxVarM4.b;
                j$.util.Objects.requireNonNull("(Custom greeting)");
                alsmVar2.b |= 2;
                alsmVar2.d = "(Custom greeting)";
                akzxVarM4.u();
                defpackage.alsm alsmVar3 = (defpackage.alsm) akzxVarM4.b;
                alsmVar3.b |= 4;
                alsmVar3.e = true;
                akzxVarM3.u();
                defpackage.alsn alsnVar2 = (defpackage.alsn) akzxVarM3.b;
                defpackage.alsm alsmVar4 = (defpackage.alsm) akzxVarM4.p();
                j$.util.Objects.requireNonNull(alsmVar4);
                alsnVar2.d = alsmVar4;
                alsnVar2.b |= 2;
                defpackage.alsn alsnVar3 = (defpackage.alsn) akzxVarM3.p();
                akzx akzxVarM5 = defpackage.alol.a.m();
                akzxVarM5.u();
                defpackage.alol alolVar4 = (defpackage.alol) akzxVarM5.b;
                alolVar4.d = alszVarB3.d;
                alolVar4.b |= 2;
                akzxVarM5.u();
                defpackage.alol alolVar5 = (defpackage.alol) akzxVarM5.b;
                alolVar5.c = alsyVarB2.j;
                alolVar5.b |= 1;
                akzx akzxVarM6 = defpackage.alsw.a.m();
                akzxVarM6.u();
                defpackage.alsw alswVar3 = (defpackage.alsw) akzxVarM6.b;
                j$.util.Objects.requireNonNull(alsnVar3);
                alswVar3.c = alsnVar3;
                alswVar3.b = 1;
                akzxVarM5.u();
                defpackage.alol alolVar6 = (defpackage.alol) akzxVarM5.b;
                defpackage.alsw alswVar4 = (defpackage.alsw) akzxVarM6.p();
                j$.util.Objects.requireNonNull(alswVar4);
                alolVar6.e = alswVar4;
                alolVar6.b |= 4;
                alluVar3.e.h(new defpackage.alka(defpackage.allu.a((defpackage.alol) akzxVarM5.p()), almyVar, jwxVar3));
                return;
            }
            boolean z = this.d;
            defpackage.allu alluVar4 = this.b;
            if (!z) {
                defpackage.almm almmVar2 = i2 == 1 ? (defpackage.almm) alnfVar.d : defpackage.almm.a;
                defpackage.alsy alsyVarB3 = defpackage.alsy.b(alnfVar.g);
                if (alsyVarB3 == null) {
                    alsyVarB3 = defpackage.alsy.NO_ACTION;
                }
                defpackage.allj alljVar4 = this.c;
                j$.util.Objects.requireNonNull(alljVar4);
                final jwx jwxVar4 = new jwx(alljVar4, 14);
                defpackage.alsz alszVarB4 = defpackage.alsz.b(alnfVar.h);
                if (alszVarB4 == null) {
                    alszVarB4 = defpackage.alsz.UNKNOWN_ENTITY;
                }
                j$.util.Optional optionalT = alluVar4.f.t(almmVar2, new java.util.function.Consumer() { // from class: allp
                    @Override // java.util.function.Consumer
                    public final void accept(java.lang.Object obj) {
                        aimz aimzVar = defpackage.allu.a;
                        jwxVar4.accept((defpackage.almz) obj, almyVar);
                    }

                    @Override // java.util.function.Consumer
                    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
                    }
                });
                defpackage.allq allqVar = new defpackage.allq(alszVarB4, alsyVarB3, 0);
                if (true == optionalT.isPresent()) {
                    java.lang.Object obj = optionalT.get();
                    java.lang.Object obj2 = allqVar.a;
                    java.lang.Object obj3 = allqVar.b;
                    akzx akzxVarM7 = defpackage.alol.a.m();
                    akzxVarM7.u();
                    defpackage.alol alolVar7 = (defpackage.alol) akzxVarM7.b;
                    alolVar7.d = ((defpackage.alsz) obj2).d;
                    alolVar7.b |= 2;
                    akzxVarM7.u();
                    defpackage.alol alolVar8 = (defpackage.alol) akzxVarM7.b;
                    alolVar8.c = ((defpackage.alsy) obj3).j;
                    alolVar8.b |= 1;
                    akzx akzxVarM8 = defpackage.alsw.a.m();
                    akzxVarM8.u();
                    defpackage.alsw alswVar5 = (defpackage.alsw) akzxVarM8.b;
                    j$.util.Objects.requireNonNull(obj);
                    alswVar5.c = obj;
                    alswVar5.b = 1;
                    akzxVarM7.u();
                    defpackage.alol alolVar9 = (defpackage.alol) akzxVarM7.b;
                    defpackage.alsw alswVar6 = (defpackage.alsw) akzxVarM8.p();
                    j$.util.Objects.requireNonNull(alswVar6);
                    alolVar9.e = alswVar6;
                    alolVar9.b |= 4;
                    optionalT = j$.util.Optional.ofNullable(defpackage.allu.a((defpackage.alol) akzxVarM7.p()));
                }
                defpackage.allr allrVar = new defpackage.allr(alluVar4, almyVar, jwxVar4);
                if (true == optionalT.isPresent()) {
                    allrVar.a.e.h(new defpackage.alka((defpackage.almz) optionalT.get(), allrVar.b, allrVar.c));
                    return;
                }
                return;
            }
            defpackage.almm almmVar3 = i2 == 1 ? (defpackage.almm) alnfVar.d : defpackage.almm.a;
            defpackage.alsy alsyVarB4 = defpackage.alsy.b(alnfVar.g);
            if (alsyVarB4 == null) {
                alsyVarB4 = defpackage.alsy.NO_ACTION;
            }
            defpackage.alsy alsyVar = alsyVarB4;
            defpackage.allj alljVar5 = this.c;
            j$.util.Objects.requireNonNull(alljVar5);
            final jwx jwxVar5 = new jwx(alljVar5, 14);
            defpackage.alsz alszVarB5 = defpackage.alsz.b(alnfVar.h);
            if (alszVarB5 == null) {
                alszVarB5 = defpackage.alsz.UNKNOWN_ENTITY;
            }
            j$.util.Optional optionalT2 = alluVar4.f.t(almmVar3, new java.util.function.Consumer() { // from class: alls
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj4) {
                    aimz aimzVar = defpackage.allu.a;
                    jwxVar5.accept((defpackage.almz) obj4, almyVar);
                }

                @Override // java.util.function.Consumer
                public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                    return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
                }
            });
            defpackage.allt alltVar = new defpackage.allt(alluVar4, alszVarB5, alsyVar, almyVar, jwxVar5, almmVar3);
            if (true == optionalT2.isPresent()) {
                java.lang.Object obj4 = optionalT2.get();
                defpackage.allu alluVar5 = alltVar.a;
                defpackage.alsz alszVar = alltVar.b;
                defpackage.alsy alsyVar2 = alltVar.c;
                defpackage.almy almyVar2 = alltVar.d;
                java.util.function.BiConsumer biConsumer = alltVar.e;
                defpackage.almm almmVar4 = alltVar.f;
                defpackage.alsn alsnVar4 = (defpackage.alsn) obj4;
                defpackage.alsm alsmVar5 = alsnVar4.d;
                if (alsmVar5 == null) {
                    alsmVar5 = defpackage.alsm.a;
                }
                java.lang.String str3 = alsmVar5.c;
                alln allnVar = (alln) alluVar5.f.b;
                if (!allnVar.f(java.lang.String.valueOf(str3).concat(".wav")) && !allnVar.f(java.lang.String.valueOf(str3).concat(".ogg"))) {
                    defpackage.allu.a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/Speaker", "maybeSayBotIntentsWithActionWithFallback", 129, "Speaker.java").I("Audio file missing for intent %s: %s (.wav or .ogg). Falling back to TTS.", almmVar4.c, str3);
                    akzx akzxVarM9 = defpackage.alnh.a.m();
                    defpackage.alsm alsmVar6 = alsnVar4.d;
                    if (alsmVar6 == null) {
                        alsmVar6 = defpackage.alsm.a;
                    }
                    java.lang.String str4 = alsmVar6.d;
                    akzxVarM9.u();
                    defpackage.alnh alnhVar2 = (defpackage.alnh) akzxVarM9.b;
                    j$.util.Objects.requireNonNull(str4);
                    alnhVar2.b |= 1;
                    alnhVar2.c = str4;
                    akzxVarM9.u();
                    defpackage.alnh alnhVar3 = (defpackage.alnh) akzxVarM9.b;
                    alnhVar3.d = alsyVar2.j;
                    alnhVar3.b |= 2;
                    alluVar5.d((defpackage.alnh) akzxVarM9.p(), almyVar2, biConsumer, alszVar);
                    return;
                }
                akzx akzxVarM10 = defpackage.alol.a.m();
                akzxVarM10.u();
                defpackage.alol alolVar10 = (defpackage.alol) akzxVarM10.b;
                alolVar10.d = alszVar.d;
                alolVar10.b |= 2;
                akzxVarM10.u();
                defpackage.alol alolVar11 = (defpackage.alol) akzxVarM10.b;
                alolVar11.c = alsyVar2.j;
                alolVar11.b |= 1;
                akzx akzxVarM11 = defpackage.alsw.a.m();
                akzxVarM11.u();
                defpackage.alsw alswVar7 = (defpackage.alsw) akzxVarM11.b;
                j$.util.Objects.requireNonNull(obj4);
                alswVar7.c = obj4;
                alswVar7.b = 1;
                akzxVarM10.u();
                defpackage.alol alolVar12 = (defpackage.alol) akzxVarM10.b;
                defpackage.alsw alswVar8 = (defpackage.alsw) akzxVarM11.p();
                j$.util.Objects.requireNonNull(alswVar8);
                alolVar12.e = alswVar8;
                alolVar12.b |= 4;
                alluVar5.e.h(new defpackage.alka(defpackage.allu.a((defpackage.alol) akzxVarM10.p()), almyVar2, biConsumer));
            }
        }
    }

    @Override // defpackage.allg
    public final void e() {
        this.b.f();
    }

    @Override // defpackage.allg
    public final void f(alqd alqdVar, defpackage.alqh alqhVar, defpackage.alqk alqkVar, defpackage.almb almbVar, defpackage.alml almlVar, defpackage.alkf alkfVar) throws defpackage.aljs {
        this.a = alln.g(alqdVar, almbVar.f, alkfVar);
        this.d = almlVar.y;
        this.b.e(this.a);
    }

    @Override // defpackage.allg
    public final /* synthetic */ void d() {
    }
}
