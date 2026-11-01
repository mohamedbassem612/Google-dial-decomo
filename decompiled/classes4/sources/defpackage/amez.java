package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amez implements defpackage.alud, defpackage.alle {
    public defpackage.aluc a;
    private final defpackage.amfa b;
    private hju c;
    private final hgw d;

    public amez(hgw hgwVar, defpackage.amfa amfaVar) {
        this.d = hgwVar;
        this.b = amfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Code duplicated, block: B:29:0x0078  */
    @Override // defpackage.alle
    public final /* synthetic */ void a(java.lang.Object obj) {
        defpackage.amfv amfvVar;
        defpackage.amfu amfuVar;
        apdi apdiVar = defpackage.amgq.g;
        alaa alaaVar = (alaa) obj;
        alaaVar.c(apdiVar);
        akzs akzsVar = alaaVar.n;
        alac alacVar = (alac) apdiVar.a;
        boolean zL = akzsVar.l(alacVar);
        defpackage.amfa amfaVar = this.b;
        if (!zL) {
            amfaVar.b();
            return;
        }
        alaaVar.c(apdiVar);
        if (alaaVar.n.l(alacVar)) {
            alaaVar.c(apdiVar);
            java.lang.Object objJ = alaaVar.n.j(alacVar);
            if (objJ == null) {
                objJ = apdiVar.b;
            } else {
                apdiVar.c(objJ);
            }
            defpackage.amgq amgqVar = (defpackage.amgq) objJ;
            if (amgqVar.f) {
                amfvVar = amgqVar.e;
                if (amfvVar == null) {
                    amfvVar = defpackage.amfv.a;
                }
                amfuVar = amfvVar.c;
                if (amfuVar == null) {
                    amfuVar = defpackage.amfu.a;
                }
                amfaVar.d = amfuVar.b.size();
                amfaVar.e = defpackage.amfa.a(amfuVar);
                amfaVar.g = amfaVar.c.a();
                amfaVar.b();
            } else {
                defpackage.amfv amfvVar2 = amgqVar.e;
                if (amfvVar2 == null) {
                    amfvVar2 = defpackage.amfv.a;
                }
                defpackage.amfu amfuVar2 = amfvVar2.c;
                if (amfuVar2 == null) {
                    amfuVar2 = defpackage.amfu.a;
                }
                j$.util.OptionalInt optionalIntA = defpackage.amfa.a(amfuVar2);
                if (amfuVar2.b.size() != amfaVar.d || !optionalIntA.equals(amfaVar.e) || amfaVar.c.a().isAfter(amfaVar.g.plus(defpackage.amfa.b))) {
                    amfvVar = amgqVar.e;
                    if (amfvVar == null) {
                        amfvVar = defpackage.amfv.a;
                    }
                    amfuVar = amfvVar.c;
                    if (amfuVar == null) {
                        amfuVar = defpackage.amfu.a;
                    }
                    amfaVar.d = amfuVar.b.size();
                    amfaVar.e = defpackage.amfa.a(amfuVar);
                    amfaVar.g = amfaVar.c.a();
                    amfaVar.b();
                }
            }
        }
        this.a.a((defpackage.alsi) obj);
    }

    @Override // defpackage.alud
    public final defpackage.alub b(defpackage.amaz amazVar) {
        return this.c.c().b.b(amazVar);
    }

    @Override // defpackage.alud
    public final void c(defpackage.alub alubVar) {
        defpackage.aljw aljwVarB = this.c.b();
        akzz akzzVarM = defpackage.amal.a.m();
        apdi apdiVar = defpackage.ambc.b;
        akzx akzxVarM = defpackage.alnm.a.m();
        java.lang.String strName = ((defpackage.alzx) alubVar).name();
        akzxVarM.u();
        defpackage.alnm alnmVar = (defpackage.alnm) akzxVarM.b;
        j$.util.Objects.requireNonNull(strName);
        alnmVar.b |= 1;
        alnmVar.e = strName;
        akzzVarM.bV(apdiVar, (defpackage.alnm) akzxVarM.p());
        aljwVarB.c((defpackage.amal) akzzVarM.p());
    }

    @Override // defpackage.alud
    public final void d(java.lang.String str, defpackage.alqh alqhVar, defpackage.alqk alqkVar, ajcu ajcuVar, defpackage.amgv amgvVar) throws defpackage.alio {
        hju hjuVar = new hju((him) this.d.a);
        this.c = hjuVar;
        try {
            hjuVar.d().c(j$.util.Optional.of(str), ajcuVar, alqhVar, alqkVar, j$.util.Optional.empty(), amgvVar);
            this.c.c().c = j$.util.Optional.of(this);
            this.c.a().j(this);
            this.c.a().i(str);
        } catch (java.lang.Exception e) {
            throw new defpackage.alio("Initializing bot conversation failed. ", defpackage.alti.CORE_INFRA_FATAL_FAILURE, e);
        }
    }

    @Override // defpackage.alud
    public final void e(defpackage.alro alroVar) {
        apdi apdiVar = defpackage.alqv.f;
        alroVar.c(apdiVar);
        akzs akzsVar = ((alaa) alroVar).n;
        alac alacVar = (alac) apdiVar.a;
        if (akzsVar.l(alacVar)) {
            defpackage.amfa amfaVar = this.b;
            alroVar.c(apdiVar);
            if (((alaa) alroVar).n.l(alacVar)) {
                alroVar.c(apdiVar);
                java.lang.Object objJ = ((alaa) alroVar).n.j(alacVar);
                if (objJ == null) {
                    objJ = apdiVar.b;
                } else {
                    apdiVar.c(objJ);
                }
                alqu alquVar = ((defpackage.alqv) objJ).c;
                if (alquVar == null) {
                    alquVar = alqu.a;
                }
                if ((alquVar.c == 1 ? (defpackage.alqm) alquVar.d : defpackage.alqm.a).b.size() > 0 || amfaVar.c.a().isAfter(amfaVar.f.plus(defpackage.amfa.a))) {
                    amfaVar.f = amfaVar.c.a();
                    amfaVar.b();
                }
            }
        }
        this.c.a().g(alroVar);
    }

    @Override // defpackage.alud
    public final void f(defpackage.aljk aljkVar) {
        int i = aljkVar.b;
        defpackage.aljw aljwVarB = this.c.b();
        akzz akzzVarM = defpackage.amal.a.m();
        akzzVarM.bV(defpackage.ambe.b, aljkVar);
        aljwVarB.c((defpackage.amal) akzzVarM.p());
    }

    @Override // defpackage.alud
    public final void g(defpackage.aluc alucVar) {
        this.a = alucVar;
    }

    @Override // defpackage.alud
    public final void h(j$.util.Optional optional) throws defpackage.alio {
        try {
            this.c.d().a(optional);
        } catch (java.lang.Exception e) {
            throw new defpackage.alio("Starting bot conversation failed. ", defpackage.alti.CORE_INFRA_FATAL_FAILURE, e);
        }
    }

    @Override // defpackage.alud
    public final void i() {
        this.c.d().b();
    }
}
