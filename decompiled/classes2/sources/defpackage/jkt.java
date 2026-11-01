package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jkt implements agtk {
    final /* synthetic */ defpackage.jkv a;

    public jkt(defpackage.jkv jkvVar) {
        this.a = jkvVar;
    }

    public final /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) throws java.lang.Throwable {
        if (!(th instanceof agtp)) {
            throw th;
        }
        defpackage.jkv.a.b().l("com/android/dialer/blockreportspam/NotSpamDialogFragmentPeer$checkSpamEnabledCallback$<anonymous>", "onFailure", 79, "NotSpamDialogFragmentPeer.kt").v("Parcelled before completion when checking spam enabled");
        this.a.c.o(rmx.tZ);
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [aonj, java.lang.Object] */
    public final /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        boolean zBooleanValue = ((java.lang.Boolean) obj2).booleanValue();
        defpackage.jkv jkvVar = this.a;
        if (!zBooleanValue) {
            jkvVar.c.n(rmw.f);
            jkvVar.b.f();
            return;
        }
        jkvVar.c.n(rmw.e);
        uzx uzxVarCd = wsc.cd(ucq.a.m());
        defpackage.jmk jmkVar = jkvVar.g;
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
        ucr ucrVar = jkvVar.d;
        uzxVarA.aB(rmtVarB);
        uzxVarA.aE();
        uzxVarA.aD(defpackage.aivt.NOT_SPAM);
        uzxVarCd.s(uzxVarA.az());
        ajcq ajcqVarE = ucrVar.e(uzxVarCd.o().p());
        j$.util.Optional optionalG = jkvVar.l.g();
        int i = 12;
        defpackage.hvd hvdVar = new defpackage.hvd(new defpackage.izj(jkvVar, i), i);
        if (true == optionalG.isPresent()) {
            optionalG = j$.util.Optional.ofNullable(a.j((aonj) hvdVar.a, optionalG.get()));
        }
        ajcq ajcqVar = (ajcq) (true != optionalG.isPresent() ? ajcm.a : optionalG.get());
        j$.util.Optional optionalG2 = jkvVar.m.g();
        int i2 = 13;
        defpackage.hvd hvdVar2 = new defpackage.hvd(new defpackage.izj(jkvVar, i2), i2);
        if (true == optionalG2.isPresent()) {
            optionalG2 = j$.util.Optional.ofNullable(a.j((aonj) hvdVar2.a, optionalG2.get()));
        }
        jkvVar.e.i(zoe.N(ahvr.ak(new ajcq[]{ajcqVar, ajcqVarE, (ajcq) (true != optionalG2.isPresent() ? ajcm.a : optionalG2.get())}).o(new defpackage.jse(1), jkvVar.f)), jkvVar.j);
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
