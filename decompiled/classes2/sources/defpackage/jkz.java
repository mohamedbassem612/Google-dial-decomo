package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jkz implements agtk {
    final /* synthetic */ defpackage.jld a;

    public jkz(defpackage.jld jldVar) {
        this.a = jldVar;
    }

    public final /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) throws java.lang.Throwable {
        if (!(th instanceof agtp)) {
            throw th;
        }
        defpackage.jld.a.b().l("com/android/dialer/blockreportspam/ReportSpamAndBlockNumberDialogFragmentPeer$checkSpamEnabledCallback$<anonymous>", "onFailure", 94, "ReportSpamAndBlockNumberDialogFragmentPeer.kt").v("Parcelled before completion when checking spam enabled");
        this.a.c.o(rmx.tZ);
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18, types: [aonj, java.lang.Object] */
    public final /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        boolean zBooleanValue = ((java.lang.Boolean) obj2).booleanValue();
        defpackage.jld jldVar = this.a;
        if (!zBooleanValue) {
            jldVar.c.n(rmw.h);
            return;
        }
        jldVar.c.n(rmw.g);
        uzx uzxVarCd = wsc.cd(ucq.a.m());
        defpackage.jmk jmkVar = jldVar.g;
        defpackage.jjx jjxVar = jmkVar.d;
        if (jjxVar == null) {
            jjxVar = defpackage.jjx.a;
        }
        uzxVarCd.q(jjxVar.f);
        defpackage.jjx jjxVar2 = jmkVar.d;
        if (jjxVar2 == null) {
            jjxVar2 = defpackage.jjx.a;
        }
        java.lang.String str = jjxVar2.e;
        aooh.e(str, "getCountryIso(...)");
        uzxVarCd.r(str);
        uzx uzxVarA = defpackage.airh.A(defpackage.aivu.a.m());
        defpackage.jjx jjxVar3 = jmkVar.d;
        if (jjxVar3 == null) {
            jjxVar3 = defpackage.jjx.a;
        }
        java.lang.String str2 = jjxVar3.c;
        aooh.e(str2, "getNormalizedNumber(...)");
        uzxVarA.aC(str2);
        defpackage.jjx jjxVar4 = jmkVar.d;
        if (jjxVar4 == null) {
            jjxVar4 = defpackage.jjx.a;
        }
        uzxVarA.aG(wsc.bH(jjxVar4.f));
        defpackage.jjx jjxVar5 = jmkVar.d;
        if (jjxVar5 == null) {
            jjxVar5 = defpackage.jjx.a;
        }
        int iAD = a.aD(jjxVar5.g);
        if (iAD == 0) {
            iAD = 1;
        }
        uzxVarA.aF(iAD);
        uzxVarA.aA(rms.a);
        defpackage.jjx jjxVar6 = jmkVar.d;
        if (jjxVar6 == null) {
            jjxVar6 = defpackage.jjx.a;
        }
        rmt rmtVarB = rmt.b(jjxVar6.h);
        if (rmtVarB == null) {
            rmtVarB = rmt.a;
        }
        ucr ucrVar = jldVar.d;
        agtj agtjVar = jldVar.e;
        uzxVarA.aB(rmtVarB);
        uzxVarA.aE();
        uzxVarA.aD(defpackage.aivt.SPAM);
        uzxVarCd.s(uzxVarA.az());
        agtjVar.i(zoe.N(ucrVar.e(uzxVarCd.o().p())), jldVar.k);
        defpackage.jld.a.b().l("com/android/dialer/blockreportspam/ReportSpamAndBlockNumberDialogFragmentPeer", "markDobbySpamStatus", 294, "ReportSpamAndBlockNumberDialogFragmentPeer.kt").v("enter markDobbySpamStatus function");
        j$.util.Optional optionalG = jldVar.o.g();
        defpackage.hrx hrxVar = new defpackage.hrx(new defpackage.izj(jldVar, 16), 14);
        if (true == optionalG.isPresent()) {
            hrxVar.a.a(optionalG.get());
        }
        j$.util.Optional optionalG2 = jldVar.p.g();
        defpackage.hrx hrxVar2 = new defpackage.hrx(new defpackage.izj(jldVar, 15), 13);
        if (true == optionalG2.isPresent()) {
            hrxVar2.a.a(optionalG2.get());
        }
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
