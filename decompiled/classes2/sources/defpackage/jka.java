package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jka implements agtk {
    final /* synthetic */ defpackage.jke a;

    public jka(defpackage.jke jkeVar) {
        this.a = jkeVar;
    }

    public final /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) throws java.lang.Throwable {
        if (!(th instanceof agtp)) {
            throw th;
        }
        defpackage.jke.a.b().l("com/android/dialer/blockreportspam/BlockingNumberAndOptionallyReportingAsSpamFragmentPeer$checkSpamEnabledCallback$<anonymous>", "onFailure", 122, "BlockingNumberAndOptionallyReportingAsSpamFragmentPeer.kt").v("Parcelled before completion when checking spam enabled");
        this.a.c.o(rmx.tZ);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13, types: [aonj, java.lang.Object] */
    public final /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        boolean zBooleanValue = ((java.lang.Boolean) obj2).booleanValue();
        defpackage.jke jkeVar = this.a;
        defpackage.jjy jjyVar = jkeVar.b;
        android.widget.CheckBox checkBox = (android.widget.CheckBox) jjyVar.c().findViewById(2131428783);
        if (!zBooleanValue) {
            jkeVar.c.n(rmw.l);
            if (checkBox.isChecked()) {
                jjyVar.A();
                defpackage.jjx jjxVar = jkeVar.f.d;
                if (jjxVar == null) {
                    jjxVar = defpackage.jjx.a;
                }
                aooh.e(jjxVar, "getSpamDialogInfo(...)");
                jkeVar.b(jjxVar);
                return;
            }
            return;
        }
        jkeVar.c.n(rmw.k);
        if (checkBox.isChecked()) {
            defpackage.ni niVarF = defpackage.jlr.F(defpackage.jlw.a.m());
            niVarF.Q();
            defpackage.jjx jjxVar2 = jkeVar.f.d;
            if (jjxVar2 == null) {
                jjxVar2 = defpackage.jjx.a;
            }
            aooh.e(jjxVar2, "getSpamDialogInfo(...)");
            niVarF.P(jjxVar2);
            niVarF.O(2132017583);
            niVarF.N(defpackage.jmu.SCAM_SELECTOR_QUESTION_KEY_SCAM);
            defpackage.jlf.aX(niVarF.M()).r(jjyVar.J(), "ScamContextSelectorDialogFragment");
            jjyVar.f();
        } else {
            defpackage.jmk jmkVar = jkeVar.f;
            defpackage.jjx jjxVar3 = jmkVar.d;
            if (jjxVar3 == null) {
                jjxVar3 = defpackage.jjx.a;
            }
            if (jjxVar3.q || checkBox.isChecked()) {
                defpackage.jjx jjxVar4 = jmkVar.d;
                if (jjxVar4 == null) {
                    jjxVar4 = defpackage.jjx.a;
                }
                aooh.e(jjxVar4, "getSpamDialogInfo(...)");
                jkeVar.e.i(zoe.N(jkeVar.d.e(defpackage.hht.b(jjxVar4, 1))), jkeVar.j);
            }
        }
        if (checkBox.isChecked()) {
            return;
        }
        defpackage.jke.a.b().l("com/android/dialer/blockreportspam/BlockingNumberAndOptionallyReportingAsSpamFragmentPeer", "markDobbySpamStatus", 342, "BlockingNumberAndOptionallyReportingAsSpamFragmentPeer.kt").v("enter markDobbySpamStatus function");
        j$.util.Optional optionalG = jkeVar.n.g();
        int i = 10;
        defpackage.hrx hrxVar = new defpackage.hrx(new defpackage.izj(jkeVar, i), i);
        if (true == optionalG.isPresent()) {
            hrxVar.a.a(optionalG.get());
        }
        j$.util.Optional optionalG2 = jkeVar.o.g();
        int i2 = 11;
        defpackage.hrx hrxVar2 = new defpackage.hrx(new defpackage.izj(jkeVar, i2), i2);
        if (true == optionalG2.isPresent()) {
            hrxVar2.a.a(optionalG2.get());
        }
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
