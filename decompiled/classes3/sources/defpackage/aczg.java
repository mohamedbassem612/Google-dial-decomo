package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class aczg implements ajat {
    public final /* synthetic */ aczk a;

    /* JADX WARN: Type inference failed for: r10v3, types: [adba, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6, types: [adba, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [adbf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [adba, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [acvl, java.lang.Object] */
    public final ajcq a(java.lang.Object obj) {
        ajcq ajcqVarY;
        java.lang.Integer num = (java.lang.Integer) obj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = adbe.a;
        aczk aczkVar = this.a;
        arrayList.add(ahvr.I(aczkVar.e(), new defpackage.aczi(aczkVar, 0), aczkVar.i));
        acvl acvlVar = aczkVar.k;
        if (acvlVar.L()) {
            acyu acyuVar = aczkVar.d;
            arrayList.add(acyuVar.m(new defpackage.acyg(acyuVar, new java.util.concurrent.atomic.AtomicReference(new java.util.HashMap()), 13)));
        }
        if (acvlVar.O()) {
            acyu acyuVar2 = aczkVar.d;
            arrayList.add(acyuVar2.q(acyuVar2.d.d(), new defpackage.acwk(acyuVar2, 19)));
        }
        if (acvlVar.N()) {
            acyu acyuVar3 = aczkVar.d;
            ahyn ahynVar = acyuVar3.e;
            if (ahynVar.f()) {
                try {
                    acxg acxgVar = (acxg) ahynVar.b();
                    aike aikeVarO = aify.o(((android.accounts.AccountManager) acxgVar.b).getAccountsByTypeForPackage("com.google", (java.lang.String) acxgVar.a));
                    aihb aihbVar = new aihb();
                    int i2 = aikeVarO.d;
                    for (int i3 = 0; i3 < i2; i3++) {
                        android.accounts.Account account = (android.accounts.Account) aikeVarO.get(i3);
                        if (account.name != null && account.type != null) {
                            aihbVar.i(afsq.aI(account));
                        }
                    }
                    ajcqVarY = acyuVar3.q(acyuVar3.d.d(), new defpackage.wzg(acyuVar3, aihbVar.h(), 18, null));
                } catch (java.lang.RuntimeException e) {
                    ajcqVarY = aiql.y(e);
                }
            } else {
                ajcqVarY = ajcm.a;
            }
            arrayList.add(ajcqVarY);
        }
        acvl acvlVar2 = aczkVar.k;
        if (acvlVar2.F()) {
            acyu acyuVar4 = aczkVar.d;
            arrayList.add(acyuVar4.m(new defpackage.acyq(acyuVar4, 2)));
        }
        ahbq ahbqVar = aczkVar.p;
        arrayList.add(ahbqVar.b.a(new defpackage.pth(ahbqVar, num.intValue(), 5)));
        agqj agqjVar = aczkVar.o;
        arrayList.add(agqjVar.a.d(new defpackage.pth(agqjVar, num.intValue(), 6)));
        aogc aogcVar = aczkVar.q;
        arrayList.add(!aogcVar.c.M() ? ajcm.a : aogcVar.b.c(new defpackage.adbi(aogcVar.a.a(), 2)));
        if (aczkVar.j.f()) {
            acyu acyuVar5 = aczkVar.d;
            arrayList.add(acyuVar5.q(acyuVar5.d.d(), new defpackage.acyq(acyuVar5, 0)));
        }
        abrz.D(aczkVar.b, "gms_icing_mdd_manager_metadata", aczkVar.h).edit().remove("gms_icing_mdd_manager_ph_config_version").remove("gms_icing_mdd_manager_ph_config_version_timestamp").commit();
        if (!acvlVar2.z()) {
            acyv acyvVar = aczkVar.e;
            defpackage.adcs adcsVarE = defpackage.adcs.e(acyvVar.c());
            defpackage.acyx acyxVar = new defpackage.acyx(9);
            java.util.concurrent.Executor executor = aczkVar.i;
            arrayList.add(abrz.ad(new ajcq[]{adcsVarE.f(acyxVar, executor).g(new defpackage.acyq(aczkVar, 14), executor), defpackage.adcs.e(acyvVar.e()).f(new defpackage.acym(aczkVar, 7), executor).g(new defpackage.acwn(6), executor)}).D(new aczf(0), ajbm.a));
        }
        return abrz.ac(arrayList).D(new aczf(4), aczkVar.i);
    }
}
