package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alvv {
    public final defpackage.allj a;
    public defpackage.alvw b;
    public aigf c;
    public boolean e;
    private java.util.concurrent.atomic.AtomicBoolean g;
    private alln h;
    private j$.util.Optional i;
    private j$.util.Optional f = j$.util.Optional.empty();
    public j$.util.Optional d = j$.util.Optional.empty();

    public alvv(defpackage.alli alliVar, java.lang.String str) {
        this.a = alliVar.a(str);
    }

    public static defpackage.almz a(defpackage.alxy alxyVar) {
        akzz akzzVarM = defpackage.alox.a.m();
        akzzVarM.bV(defpackage.alou.b, alxyVar);
        defpackage.alox aloxVarP = akzzVarM.p();
        akzz akzzVarM2 = defpackage.almz.a.m();
        defpackage.alnb alnbVar = defpackage.alnb.EVENT_STATE_UPDATE;
        akzzVarM2.u();
        defpackage.almz almzVar = akzzVarM2.b;
        almzVar.c = alnbVar.aN;
        almzVar.b |= 1;
        akzzVarM2.bV(defpackage.alox.b, aloxVarP);
        return akzzVarM2.p();
    }

    private final defpackage.alnf o(defpackage.almm almmVar, j$.util.Optional optional, defpackage.alsz alszVar, j$.util.Optional optional2) {
        defpackage.alsy alsyVarA = this.b.a(almmVar.c, optional);
        akzx akzxVarM = defpackage.alnf.a.m();
        akzxVarM.u();
        defpackage.alnf alnfVar = (defpackage.alnf) akzxVarM.b;
        alnfVar.h = alszVar.d;
        alnfVar.b |= 2;
        akzxVarM.u();
        defpackage.alnf alnfVar2 = (defpackage.alnf) akzxVarM.b;
        j$.util.Objects.requireNonNull(almmVar);
        alnfVar2.d = almmVar;
        alnfVar2.c = 1;
        akzxVarM.u();
        defpackage.alnf alnfVar3 = (defpackage.alnf) akzxVarM.b;
        alnfVar3.g = alsyVarA.j;
        alnfVar3.b |= 1;
        j$.util.Objects.requireNonNull(akzxVarM);
        defpackage.alui aluiVar = new defpackage.alui(akzxVarM, 6);
        if (true == optional2.isPresent()) {
            java.lang.Object obj = optional2.get();
            akzx akzxVar = (akzx) aluiVar.a;
            akzxVar.u();
            defpackage.alnf alnfVar4 = (defpackage.alnf) akzxVar.b;
            j$.util.Objects.requireNonNull(obj);
            alnfVar4.j = (defpackage.alxa) obj;
            alnfVar4.b |= 8;
        }
        whq whqVar = new whq(this, akzxVarM, 9, (byte[]) null);
        if (true == optional.isPresent()) {
            ((defpackage.alvv) whqVar.b).b.f((akzx) whqVar.a, optional.get());
        }
        return (defpackage.alnf) akzxVarM.p();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    private static boolean p(j$.util.Optional optional) {
        boolean z;
        if (true == optional.isPresent()) {
            defpackage.alvt alvtVar = (defpackage.alvt) optional.get();
            if (alvtVar.a.equals(defpackage.alss.SPAM_STATUS_NOT_SPAM)) {
                int i = alvtVar.b;
                if (i == 0) {
                    throw null;
                }
                z = i == 3;
            }
            optional = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(z));
        }
        return ((java.lang.Boolean) optional.orElse(java.lang.Boolean.FALSE)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:43:0x0111  */
    /* JADX WARN: Code duplicated, block: B:45:0x0115  */
    public final defpackage.alnf b(defpackage.alvu alvuVar) {
        j$.util.Optional optionalOfNullable;
        java.lang.String strD;
        boolean z;
        j$.util.Optional optionalOf;
        defpackage.allq allqVar = new defpackage.allq(this, alvuVar, 2);
        j$.util.Optional optional = alvuVar.d;
        if (true != optional.isPresent()) {
            optionalOfNullable = optional;
        } else {
            java.lang.Object obj = optional.get();
            java.lang.Object obj2 = allqVar.a;
            java.lang.Object obj3 = allqVar.b;
            akzx akzxVarM = defpackage.almm.a.m();
            java.lang.String str = (java.lang.String) ((defpackage.alvv) obj2).c.getOrDefault(obj, ((defpackage.alvu) obj3).e.c);
            akzxVarM.u();
            defpackage.almm almmVar = (defpackage.almm) akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            almmVar.b |= 1;
            almmVar.c = str;
            optionalOfNullable = j$.util.Optional.ofNullable((defpackage.almm) akzxVarM.p());
        }
        defpackage.almm almmVar2 = (defpackage.almm) optionalOfNullable.orElse(alvuVar.e);
        defpackage.alsy alsyVarC = this.h.c(almmVar2.c);
        if (alsyVarC.equals(defpackage.alsy.END_SPAM_CALL) && p(this.f)) {
            strD = this.b.c();
        } else if (alsyVarC.equals(defpackage.alsy.END_CALL) || alsyVarC.equals(defpackage.alsy.START_RINGING) || alsyVarC.equals(defpackage.alsy.END_MISSED_CALL)) {
            if (this.g.get()) {
                if (this.b.e(almmVar2.c)) {
                    j$.util.Optional optionalOfNullable2 = this.f;
                    if (true == optionalOfNullable2.isPresent()) {
                        defpackage.alvt alvtVar = (defpackage.alvt) optionalOfNullable2.get();
                        if (alvtVar.a.equals(defpackage.alss.SPAM_STATUS_SPAM)) {
                            int i = alvtVar.b;
                            if (i == 0) {
                                throw null;
                            }
                            if (i == 3) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            z = false;
                        }
                        optionalOfNullable2 = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(z));
                    }
                    if (!((java.lang.Boolean) optionalOfNullable2.orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                        j$.util.Optional optionalOfNullable3 = this.i;
                        defpackage.xbz xbzVar = new defpackage.xbz(almmVar2, 17);
                        if (true == optionalOfNullable3.isPresent()) {
                            optionalOfNullable3 = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((defpackage.almm) xbzVar.a).d <= ((java.lang.Float) optionalOfNullable3.get()).floatValue()));
                        }
                        if (!((java.lang.Boolean) optionalOfNullable3.orElse(java.lang.Boolean.TRUE)).booleanValue()) {
                            if (!this.e) {
                                strD = almmVar2.c;
                            }
                        }
                    }
                }
            } else if (!this.e) {
                strD = almmVar2.c;
            }
            strD = this.b.d();
        } else {
            strD = almmVar2.c;
        }
        defpackage.alxx alxxVar = alvuVar.a;
        j$.util.Optional optional2 = this.f;
        j$.util.Optional optional3 = alvuVar.c;
        boolean z2 = this.e;
        defpackage.alxx alxxVarB = this.b.b(strD);
        if (alxxVarB.equals(defpackage.alxx.NO_DECISION)) {
            optionalOf = j$.util.Optional.empty();
        } else {
            akzx akzxVarM2 = defpackage.alxy.a.m();
            akzxVarM2.u();
            defpackage.alxy alxyVar = (defpackage.alxy) akzxVarM2.b;
            alxyVar.c = alxxVarB.e;
            alxyVar.b |= 1;
            akzxVarM2.u();
            defpackage.alxy alxyVar2 = (defpackage.alxy) akzxVarM2.b;
            alxyVar2.e = alxxVar.e;
            alxyVar2.b |= 4;
            defpackage.alui aluiVar = new defpackage.alui(akzxVarM2, 4);
            if (true == optional2.isPresent()) {
                java.lang.Object obj4 = optional2.get();
                java.lang.Object obj5 = aluiVar.a;
                defpackage.alvt alvtVar2 = (defpackage.alvt) obj4;
                defpackage.alss alssVar = alvtVar2.a;
                akzx akzxVar = (akzx) obj5;
                akzxVar.u();
                defpackage.alxy alxyVar3 = (defpackage.alxy) akzxVar.b;
                alxyVar3.f = alssVar.e;
                alxyVar3.b |= 8;
                int i2 = alvtVar2.b;
                akzxVar.u();
                defpackage.alxy alxyVar4 = (defpackage.alxy) akzxVar.b;
                if (i2 == 0) {
                    throw null;
                }
                alxyVar4.g = i2 - 1;
                alxyVar4.b |= 16;
            }
            j$.util.Objects.requireNonNull(akzxVarM2);
            defpackage.alui aluiVar2 = new defpackage.alui(akzxVarM2, 5);
            if (true == optional3.isPresent()) {
                java.lang.Object obj6 = optional3.get();
                akzx akzxVar2 = (akzx) aluiVar2.a;
                akzxVar2.u();
                defpackage.alxy alxyVar5 = (defpackage.alxy) akzxVar2.b;
                alxyVar5.h = ((defpackage.alxw) obj6).d;
                alxyVar5.b |= 32;
            }
            if (optional3.isEmpty() && z2) {
                defpackage.alxw alxwVar = defpackage.alxw.SPAM_AUDIO_MATCH;
                akzxVarM2.u();
                defpackage.alxy alxyVar6 = (defpackage.alxy) akzxVarM2.b;
                alxyVar6.h = alxwVar.d;
                alxyVar6.b |= 32;
            }
            optionalOf = j$.util.Optional.of((defpackage.alxy) akzxVarM2.p());
        }
        whq whqVar = new whq(this, alvuVar, 10, (byte[]) null);
        if (true == optionalOf.isPresent()) {
            java.lang.Object obj7 = optionalOf.get();
            defpackage.alvv alvvVar = (defpackage.alvv) whqVar.b;
            alvvVar.a.a(a((defpackage.alxy) obj7), ((defpackage.alvu) whqVar.a).b);
            alvvVar.d = j$.util.Optional.of(obj7);
        }
        akzx akzxVarM3 = defpackage.almm.a.m();
        akzxVarM3.u();
        defpackage.almm almmVar3 = (defpackage.almm) akzxVarM3.b;
        j$.util.Objects.requireNonNull(strD);
        almmVar3.b |= 1;
        almmVar3.c = strD;
        return o((defpackage.almm) akzxVarM3.p(), optional, defpackage.alsz.BOT, j$.util.Optional.empty());
    }

    public final defpackage.alxx c(java.lang.String str) {
        return this.b.b(str);
    }

    public final defpackage.alxy d() {
        akzx akzxVarM = defpackage.alxy.a.m();
        defpackage.alxx alxxVar = defpackage.alxx.NO_DECISION;
        akzxVarM.u();
        defpackage.alxy alxyVar = (defpackage.alxy) akzxVarM.b;
        alxyVar.e = alxxVar.e;
        alxyVar.b |= 4;
        j$.util.Optional optional = this.f;
        defpackage.alui aluiVar = new defpackage.alui(akzxVarM, 7);
        if (true == optional.isPresent()) {
            java.lang.Object obj = optional.get();
            java.lang.Object obj2 = aluiVar.a;
            defpackage.alss alssVar = ((defpackage.alvt) obj).a;
            if (alssVar.equals(defpackage.alss.SPAM_STATUS_SPAM)) {
                defpackage.alxx alxxVar2 = defpackage.alxx.DECISION_SPAM;
                akzx akzxVar = (akzx) obj2;
                akzxVar.u();
                defpackage.alxy alxyVar2 = (defpackage.alxy) akzxVar.b;
                alxyVar2.c = alxxVar2.e;
                alxyVar2.b |= 1;
            } else if (alssVar.equals(defpackage.alss.SPAM_STATUS_NOT_SPAM)) {
                defpackage.alxx alxxVar3 = defpackage.alxx.DECISION_NOT_SPAM;
                akzx akzxVar2 = (akzx) obj2;
                akzxVar2.u();
                defpackage.alxy alxyVar3 = (defpackage.alxy) akzxVar2.b;
                alxyVar3.c = alxxVar3.e;
                alxyVar3.b |= 1;
            }
        }
        j$.util.Optional optionalOfNullable = this.d;
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(((alad) optionalOfNullable.get()).p());
        }
        akzx akzxVar3 = (akzx) optionalOfNullable.orElse(akzxVarM);
        j$.util.Optional optional2 = this.f;
        defpackage.alui aluiVar2 = new defpackage.alui(akzxVar3, 8);
        if (true == optional2.isPresent()) {
            java.lang.Object obj3 = optional2.get();
            java.lang.Object obj4 = aluiVar2.a;
            defpackage.alvt alvtVar = (defpackage.alvt) obj3;
            defpackage.alss alssVar2 = alvtVar.a;
            akzx akzxVar4 = (akzx) obj4;
            akzxVar4.u();
            defpackage.alxy alxyVar4 = (defpackage.alxy) akzxVar4.b;
            alxyVar4.f = alssVar2.e;
            alxyVar4.b |= 8;
            int i = alvtVar.b;
            akzxVar4.u();
            defpackage.alxy alxyVar5 = (defpackage.alxy) akzxVar4.b;
            if (i == 0) {
                throw null;
            }
            alxyVar5.g = i - 1;
            alxyVar5.b |= 16;
        }
        if (this.e) {
            defpackage.alxw alxwVar = defpackage.alxw.SPAM_AUDIO_MATCH;
            akzxVar3.u();
            defpackage.alxy alxyVar6 = (defpackage.alxy) akzxVar3.b;
            alxyVar6.h = alxwVar.d;
            alxyVar6.b |= 32;
            if (!p(this.f)) {
                defpackage.alxx alxxVar4 = defpackage.alxx.DECISION_SPAM;
                akzxVar3.u();
                defpackage.alxy alxyVar7 = (defpackage.alxy) akzxVar3.b;
                alxyVar7.c = alxxVar4.e;
                alxyVar7.b |= 1;
            }
        }
        return (defpackage.alxy) akzxVar3.p();
    }

    public final void e(alln allnVar, aigf aigfVar, j$.util.Optional optional, defpackage.alvw alvwVar) {
        this.f = j$.util.Optional.empty();
        this.g = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.h = allnVar;
        this.c = aigfVar;
        this.d = j$.util.Optional.empty();
        this.e = false;
        this.i = optional;
        this.b = alvwVar;
    }

    public final void f(defpackage.almy almyVar) {
        i((java.lang.String) this.h.b, almyVar, j$.util.Optional.empty(), defpackage.alsz.BOT);
    }

    public final void g(defpackage.alvu alvuVar) {
        akzz akzzVarM = defpackage.almz.a.m();
        defpackage.alnb alnbVar = defpackage.alnb.EVENT_FLOW_OUTPUT;
        akzzVarM.u();
        defpackage.almz almzVar = akzzVarM.b;
        almzVar.c = alnbVar.aN;
        almzVar.b |= 1;
        akzzVarM.bV(defpackage.alnf.k, b(alvuVar));
        this.a.a(akzzVarM.p(), alvuVar.b);
    }

    public final void h(defpackage.almz almzVar, defpackage.almy almyVar) {
        defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar.c);
        if (alnbVarB == null) {
            alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
        }
        ahvr.bR(alnbVarB != defpackage.alnb.EVENT_FLOW_OUTPUT, "`publishNonFlowOutputEvent` got unsupported `EVENT_FLOW_OUTPUT` event: %s", almzVar);
        this.a.a(almzVar, almyVar);
    }

    public final void i(java.lang.String str, defpackage.almy almyVar, j$.util.Optional optional, defpackage.alsz alszVar) {
        j(str, almyVar, optional, alszVar, j$.util.Optional.empty());
    }

    public final void j(java.lang.String str, defpackage.almy almyVar, j$.util.Optional optional, defpackage.alsz alszVar, j$.util.Optional optional2) {
        akzx akzxVarM = defpackage.almm.a.m();
        akzxVarM.u();
        defpackage.almm almmVar = (defpackage.almm) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        almmVar.b |= 1;
        almmVar.c = str;
        defpackage.almm almmVar2 = (defpackage.almm) akzxVarM.p();
        akzz akzzVarM = defpackage.almz.a.m();
        defpackage.alnb alnbVar = defpackage.alnb.EVENT_FLOW_OUTPUT;
        akzzVarM.u();
        defpackage.almz almzVar = akzzVarM.b;
        almzVar.c = alnbVar.aN;
        almzVar.b |= 1;
        akzzVarM.bV(defpackage.alnf.k, o(almmVar2, optional, alszVar, optional2));
        this.a.a(akzzVarM.p(), almyVar);
    }

    public final void k(java.lang.Object obj, defpackage.almy almyVar, java.lang.String str) {
        l(obj, almyVar, str, defpackage.alsz.BOT);
    }

    public final void l(java.lang.Object obj, defpackage.almy almyVar, java.lang.String str, defpackage.alsz alszVar) {
        i((java.lang.String) this.c.getOrDefault(obj, str), almyVar, j$.util.Optional.of(obj), alszVar);
    }

    public final void m(defpackage.almz almzVar, defpackage.almy almyVar) {
        defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar.c);
        if (alnbVarB == null) {
            alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
        }
        boolean z = false;
        if (alnbVarB == defpackage.alnb.EVENT_FLOW_OUTPUT) {
            apdi apdiVar = defpackage.alnf.k;
            almzVar.c(apdiVar);
            java.lang.Object objJ = ((alaa) almzVar).n.j((alac) apdiVar.a);
            if (objJ == null) {
                objJ = apdiVar.b;
            } else {
                apdiVar.c(objJ);
            }
            if (((defpackage.alnf) objJ).e == 10) {
                z = true;
            }
        }
        ahvr.bR(z, "`publishTakeAMessageEvent` got unsupported non Take a Message event: %s", almzVar);
        this.a.a(almzVar, almyVar);
    }

    public final void n(defpackage.alvt alvtVar, defpackage.almy almyVar) {
        this.g.set(alvtVar.a.equals(defpackage.alss.SPAM_STATUS_SPAM));
        this.f = j$.util.Optional.of(alvtVar);
        if (this.g.get()) {
            this.a.a(a(d()), almyVar);
        }
    }
}
