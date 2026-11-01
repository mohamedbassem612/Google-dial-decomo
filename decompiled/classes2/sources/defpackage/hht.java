package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class hht {
    public static final /* synthetic */ defpackage.heq a(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.heq(akzxVar);
    }

    public static final akzx b(defpackage.jjx jjxVar, int i) {
        aooh.f(jjxVar, "dialogInfo");
        uzx uzxVarCd = wsc.cd(ucq.a.m());
        uzxVarCd.q(jjxVar.f);
        java.lang.String str = jjxVar.e;
        aooh.e(str, "getCountryIso(...)");
        uzxVarCd.r(str);
        uzx uzxVarA = defpackage.airh.A(defpackage.aivu.a.m());
        java.lang.String str2 = jjxVar.c;
        aooh.e(str2, "getNormalizedNumber(...)");
        uzxVarA.aC(str2);
        uzxVarA.aG(wsc.bH(jjxVar.f));
        int iAD = a.aD(jjxVar.g);
        int i2 = 1;
        if (iAD == 0) {
            iAD = 1;
        }
        uzxVarA.aF(iAD);
        uzxVarA.aA(rms.a);
        rmt rmtVarB = rmt.b(jjxVar.h);
        if (rmtVarB == null) {
            rmtVarB = rmt.a;
        }
        uzxVarA.aB(rmtVarB);
        uzxVarA.aE();
        int i3 = i - 1;
        uzxVarA.aD((i3 == 0 || i3 == 1) ? defpackage.aivt.SPAM : i3 != 2 ? defpackage.aivt.NOT_SPAM : defpackage.aivt.NOT_SPAM);
        akzx akzxVarM = defpackage.aivs.a.m();
        aooh.f(akzxVarM, "builder");
        int i4 = i3 != 1 ? i3 != 3 ? 1 : 3 : 2;
        akzxVarM.u();
        defpackage.aivs aivsVar = (defpackage.aivs) akzxVarM.b;
        aivsVar.c = i4 - 1;
        aivsVar.b |= 1;
        tkj tkjVar = jjxVar.l;
        if (tkjVar == null) {
            tkjVar = tkj.a;
        }
        boolean z = tkjVar.d;
        akzxVarM.u();
        defpackage.aivs aivsVar2 = (defpackage.aivs) akzxVarM.b;
        aivsVar2.b |= 2;
        aivsVar2.f = z;
        tkj tkjVar2 = jjxVar.l;
        if (tkjVar2 == null) {
            tkjVar2 = tkj.a;
        }
        tki tkiVarB = tki.b(tkjVar2.f);
        if (tkiVarB == null) {
            tkiVarB = tki.d;
        }
        int iOrdinal = tkiVarB.ordinal();
        int i5 = iOrdinal != 1 ? iOrdinal != 2 ? 1 : 3 : 2;
        akzxVarM.u();
        defpackage.aivs aivsVar3 = (defpackage.aivs) akzxVarM.b;
        aivsVar3.g = i5 - 1;
        aivsVar3.b |= 4;
        alat<java.lang.String> alatVar = jjxVar.m;
        if (alatVar != null) {
            for (java.lang.String str3 : alatVar) {
                java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.aivs) akzxVarM.b).d);
                aooh.e(listUnmodifiableList, "getScamTypesList(...)");
                new alct(listUnmodifiableList);
                aooh.c(str3);
                aooh.f(str3, "value");
                akzxVarM.u();
                defpackage.aivs aivsVar4 = (defpackage.aivs) akzxVarM.b;
                j$.util.Objects.requireNonNull(str3);
                alat alatVar2 = aivsVar4.d;
                if (!alatVar2.c()) {
                    aivsVar4.d = alad.J(alatVar2);
                }
                aivsVar4.d.add(str3);
            }
        }
        alat<java.lang.String> alatVar3 = jjxVar.n;
        if (alatVar3 != null) {
            for (java.lang.String str4 : alatVar3) {
                java.util.List listUnmodifiableList2 = j$.util.DesugarCollections.unmodifiableList(((defpackage.aivs) akzxVarM.b).e);
                aooh.e(listUnmodifiableList2, "getClaimedEntitiesList(...)");
                new alct(listUnmodifiableList2);
                aooh.c(str4);
                aooh.f(str4, "value");
                akzxVarM.u();
                defpackage.aivs aivsVar5 = (defpackage.aivs) akzxVarM.b;
                j$.util.Objects.requireNonNull(str4);
                alat alatVar4 = aivsVar5.e;
                if (!alatVar4.c()) {
                    aivsVar5.e = alad.J(alatVar4);
                }
                aivsVar5.e.add(str4);
            }
        }
        alat<java.lang.String> alatVar5 = jjxVar.o;
        if (alatVar5 != null) {
            for (java.lang.String str5 : alatVar5) {
                java.util.List listUnmodifiableList3 = j$.util.DesugarCollections.unmodifiableList(((defpackage.aivs) akzxVarM.b).h);
                aooh.e(listUnmodifiableList3, "getTrustedCallReasonsList(...)");
                new alct(listUnmodifiableList3);
                aooh.c(str5);
                aooh.f(str5, "value");
                akzxVarM.u();
                defpackage.aivs aivsVar6 = (defpackage.aivs) akzxVarM.b;
                j$.util.Objects.requireNonNull(str5);
                alat alatVar6 = aivsVar6.h;
                if (!alatVar6.c()) {
                    aivsVar6.h = alad.J(alatVar6);
                }
                aivsVar6.h.add(str5);
            }
        }
        alat<java.lang.String> alatVar7 = jjxVar.p;
        if (alatVar7 != null) {
            for (java.lang.String str6 : alatVar7) {
                java.util.List listUnmodifiableList4 = j$.util.DesugarCollections.unmodifiableList(((defpackage.aivs) akzxVarM.b).i);
                aooh.e(listUnmodifiableList4, "getInfoRequestedList(...)");
                new alct(listUnmodifiableList4);
                aooh.c(str6);
                aooh.f(str6, "value");
                akzxVarM.u();
                defpackage.aivs aivsVar7 = (defpackage.aivs) akzxVarM.b;
                j$.util.Objects.requireNonNull(str6);
                alat alatVar8 = aivsVar7.i;
                if (!alatVar8.c()) {
                    aivsVar7.i = alad.J(alatVar8);
                }
                aivsVar7.i.add(str6);
            }
        }
        alad aladVarP = akzxVarM.p();
        aooh.e(aladVarP, "build(...)");
        defpackage.aivs aivsVar8 = (defpackage.aivs) aladVarP;
        aooh.f(aivsVar8, "value");
        akzx akzxVar = (akzx) uzxVarA.a;
        akzxVar.u();
        defpackage.aivu aivuVar = (defpackage.aivu) akzxVar.b;
        j$.util.Objects.requireNonNull(aivsVar8);
        aivuVar.F = aivsVar8;
        aivuVar.c |= 2;
        if ((jjxVar.b & 4096) != 0) {
            long j = jjxVar.s;
            if (j < 30) {
                i2 = 2;
            } else if (j < 60) {
                i2 = 3;
            } else {
                i2 = j < 120 ? 4 : 5;
            }
        }
        akzxVar.u();
        defpackage.aivu aivuVar2 = (defpackage.aivu) akzxVar.b;
        aivuVar2.u = i2 - 1;
        aivuVar2.b |= 524288;
        uzxVarCd.s(uzxVarA.az());
        akzx akzxVarP = uzxVarCd.o().p();
        aooh.e(akzxVarP, "toBuilder(...)");
        return akzxVarP;
    }

    public static final void c(aw awVar, java.lang.String str, int i) {
        aooh.f(str, "normalizedNumber");
        agby.q(awVar.H().findViewById(android.R.id.content), awVar.A().getString(i, str), -1).h();
    }

    public static final /* synthetic */ defpackage.jhw d(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.jhw(akzxVar);
    }

    public static void e(ajwr ajwrVar, defpackage.jld jldVar) {
        ajwrVar.f(((android.view.View) ajwrVar.a).findViewById(2131427969), new defpackage.gr(jldVar, 20));
        ajwrVar.f(((android.view.View) ajwrVar.a).findViewById(2131427971), new defpackage.jln(jldVar, 1));
    }

    public static void f(ajwr ajwrVar, defpackage.jkv jkvVar) {
        ajwrVar.f(((android.view.View) ajwrVar.a).findViewById(2131427969), new defpackage.gr(jkvVar, 18));
        ajwrVar.f(((android.view.View) ajwrVar.a).findViewById(2131427971), new defpackage.gr(jkvVar, 19));
    }

    public static void g(ajwr ajwrVar, defpackage.jkq jkqVar) {
        ajwrVar.f(((android.view.View) ajwrVar.a).findViewById(2131427969), new defpackage.gr(jkqVar, 16));
        ajwrVar.f(((android.view.View) ajwrVar.a).findViewById(2131427971), new defpackage.gr(jkqVar, 17));
    }

    public static void h(ajwr ajwrVar, defpackage.jke jkeVar) {
        ajwrVar.f(((android.view.View) ajwrVar.a).findViewById(2131427969), new defpackage.gr(jkeVar, 14));
        ajwrVar.f(((android.view.View) ajwrVar.a).findViewById(2131427971), new defpackage.gr(jkeVar, 15));
    }

    public static final /* synthetic */ defpackage.hgw i(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.hgw(akzxVar);
    }

    public static final /* synthetic */ defpackage.her j(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.her(akzxVar, (byte[]) null);
    }

    public static final /* synthetic */ defpackage.hgw k(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.hgw(akzxVar);
    }

    public static final /* synthetic */ defpackage.hgw l(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.hgw(akzxVar);
    }
}
