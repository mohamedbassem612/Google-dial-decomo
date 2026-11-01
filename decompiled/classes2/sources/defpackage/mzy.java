package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class mzy extends aomh implements aonj {
    int a;
    final /* synthetic */ defpackage.mzz b;
    final /* synthetic */ defpackage.ihc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mzy(defpackage.mzz mzzVar, defpackage.ihc ihcVar, aoln aolnVar) {
        super(1, aolnVar);
        this.b = mzzVar;
        this.c = ihcVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.mzy(this.b, this.c, (aoln) obj).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final java.lang.Object b(java.lang.Object obj) throws aois {
        java.lang.Object next;
        defpackage.ihb ihbVarB;
        int i;
        alrb alrbVar;
        aolu aoluVar = aolu.a;
        int i2 = this.a;
        aooc.af(obj);
        if (i2 == 0) {
            defpackage.ihc ihcVar = this.c;
            ajyi ajyiVarI = ahus.I(alro.a.m());
            apdi apdiVar = alrc.f;
            aooh.e(apdiVar, "daredevilEvent");
            vqu vquVarG = ahus.G(alrc.a.m());
            vquVarG.aP();
            alat<defpackage.iha> alatVar = ihcVar.b;
            aooh.e(alatVar, "getHypothesesList(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(alatVar, 10));
            for (defpackage.iha ihaVar : alatVar) {
                vaa vaaVarF = ahus.F(alra.a.m());
                vaaVarF.aA(ihaVar.c);
                defpackage.ihb ihbVarB2 = defpackage.ihb.b(ihaVar.b);
                if (ihbVarB2 == null) {
                    ihbVarB2 = defpackage.ihb.UNRECOGNIZED;
                }
                int iOrdinal = ihbVarB2.ordinal();
                if (iOrdinal == 0) {
                    alrbVar = alrb.a;
                } else if (iOrdinal == 1) {
                    alrbVar = alrb.b;
                } else if (iOrdinal == 2) {
                    alrbVar = alrb.c;
                } else if (iOrdinal == 3) {
                    alrbVar = alrb.d;
                } else {
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            throw new aois();
                        }
                        throw new java.lang.IllegalArgumentException("unrecognized daredevil result");
                    }
                    alrbVar = alrb.e;
                }
                vaaVarF.aB(alrbVar);
                arrayList.add(vaaVarF.az());
            }
            vquVarG.aO(arrayList);
            ajyiVarI.be(apdiVar, vquVarG.aN());
            alro alroVarBa = ajyiVarI.ba();
            defpackage.mzz mzzVar = this.b;
            this.a = 1;
            if (mzzVar.b.a(alroVarBa, this) == aoluVar) {
                return aoluVar;
            }
        }
        defpackage.mzz mzzVar2 = this.b;
        if (((java.lang.Boolean) mzzVar2.d.a()).booleanValue()) {
            alat alatVar2 = this.c.b;
            aooh.e(alatVar2, "getHypothesesList(...)");
            java.util.Iterator it = alatVar2.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    double d = ((defpackage.iha) next).c;
                    do {
                        java.lang.Object next2 = it.next();
                        double d2 = ((defpackage.iha) next2).c;
                        if (java.lang.Double.compare(d, d2) < 0) {
                            next = next2;
                            d = d2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            defpackage.iha ihaVar2 = (defpackage.iha) next;
            if (ihaVar2 != null) {
                ihbVarB = defpackage.ihb.b(ihaVar2.b);
                if (ihbVarB == null) {
                    ihbVarB = defpackage.ihb.UNRECOGNIZED;
                }
            } else {
                ihbVarB = defpackage.ihb.UNKNOWN;
            }
            int iOrdinal2 = ihbVarB.ordinal();
            if (iOrdinal2 == 0) {
                i = 1;
            } else if (iOrdinal2 == 1) {
                i = 2;
            } else if (iOrdinal2 == 2) {
                i = 3;
            } else if (iOrdinal2 != 3) {
                i = 5;
                if (iOrdinal2 != 4) {
                    if (iOrdinal2 != 5) {
                        throw new aois();
                    }
                    i = 1;
                }
            } else {
                i = 4;
            }
            defpackage.njs njsVar = new defpackage.njs(i);
            if (njsVar.a == 3) {
                if (((java.lang.Boolean) mzzVar2.e.a()).booleanValue()) {
                    defpackage.mzz.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/service/DobbyDaredevilListener", "onResult$<anonymous>", 60, "DobbyDaredevilListener.kt").v("SODA partials enabled for barge-in, skipping Daredevil speech relay to avoid duplicate interrupts");
                } else {
                    defpackage.nhq nhqVar = mzzVar2.c;
                    defpackage.nhq.a.b().l("com/android/dialer/dobby/impl/service/DobbySession", "relayDaredevilEvent", 537, "DobbySession.kt").v("received Daredevil Speech event!");
                    aoov.an(nhqVar.c, (aolr) null, 0, new defpackage.nea(nhqVar, njsVar, (aoln) null, 7), 3);
                }
            }
        } else {
            defpackage.mzz.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/service/DobbyDaredevilListener", "onResult$<anonymous>", 71, "DobbyDaredevilListener.kt").v("Flag disabled, not relaying Daredevil event to DobbySession");
        }
        return aojh.a;
    }
}
