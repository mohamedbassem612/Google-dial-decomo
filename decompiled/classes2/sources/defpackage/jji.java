package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jji implements agtk {
    final /* synthetic */ defpackage.jjo a;

    public jji(defpackage.jjo jjoVar) {
        this.a = jjoVar;
    }

    public final /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) throws java.lang.Throwable {
        if (!(th instanceof agtp)) {
            throw th;
        }
        defpackage.jjo.a.b().l("com/android/dialer/blockreportspam/BlockOptionallyReportDialogFragmentPeer$checkSpamEnabledCallback$<anonymous>", "onFailure", 150, "BlockOptionallyReportDialogFragmentPeer.kt").v("Parcelled before completion when checking spam enabled");
        this.a.c.o(rmx.tZ);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13, types: [aonj, java.lang.Object] */
    public final /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        boolean zBooleanValue = ((java.lang.Boolean) obj2).booleanValue();
        defpackage.jjo jjoVar = this.a;
        defpackage.jjf jjfVar = jjoVar.b;
        android.widget.CheckBox checkBox = (android.widget.CheckBox) jjfVar.c().findViewById(2131428994);
        android.widget.CheckBox checkBox2 = (android.widget.CheckBox) jjfVar.c().findViewById(2131428862);
        if (!zBooleanValue) {
            jjoVar.c.n(rmw.l);
            if (checkBox2.isChecked()) {
                jjfVar.A();
                defpackage.jjx jjxVar = jjoVar.f.d;
                if (jjxVar == null) {
                    jjxVar = defpackage.jjx.a;
                }
                aooh.e(jjxVar, "getSpamDialogInfo(...)");
                jjoVar.b(jjxVar);
                jjoVar.a(defpackage.jjo.c(true));
                return;
            }
            return;
        }
        if (!jjoVar.j.getAndSet(true)) {
            jjoVar.u.i((java.lang.String) null).b(mce.dl);
        }
        jjoVar.c.n(rmw.k);
        if (checkBox2.isChecked()) {
            defpackage.ni niVarF = defpackage.jlr.F(defpackage.jlw.a.m());
            niVarF.Q();
            defpackage.jjx jjxVar2 = jjoVar.f.d;
            if (jjxVar2 == null) {
                jjxVar2 = defpackage.jjx.a;
            }
            aooh.e(jjxVar2, "getSpamDialogInfo(...)");
            niVarF.P(jjxVar2);
            niVarF.O(defpackage.jjo.c(checkBox.isChecked() || checkBox2.isChecked()));
            niVarF.N(defpackage.jmu.SCAM_SELECTOR_QUESTION_KEY_SCAM);
            defpackage.jlf.aX(niVarF.M()).r(jjfVar.J(), "ScamContextSelectorDialogFragment");
            jjfVar.f();
        } else {
            int i = true != checkBox.isChecked() ? 2 : 1;
            agtj agtjVar = jjoVar.e;
            ucr ucrVar = jjoVar.d;
            defpackage.jjx jjxVar3 = jjoVar.f.d;
            if (jjxVar3 == null) {
                jjxVar3 = defpackage.jjx.a;
            }
            aooh.e(jjxVar3, "getSpamDialogInfo(...)");
            agtjVar.i(zoe.N(ucrVar.e(defpackage.hht.b(jjxVar3, i))), jjoVar.m);
        }
        if (checkBox2.isChecked()) {
            return;
        }
        defpackage.jjo.a.b().l("com/android/dialer/blockreportspam/BlockOptionallyReportDialogFragmentPeer", "markDobbySpamStatus", 397, "BlockOptionallyReportDialogFragmentPeer.kt").v("enter markDobbySpamStatus function");
        j$.util.Optional optionalG = jjoVar.r.g();
        int i2 = 8;
        defpackage.hrx hrxVar = new defpackage.hrx(new defpackage.izj(jjoVar, i2), i2);
        if (true == optionalG.isPresent()) {
            hrxVar.a.a(optionalG.get());
        }
        if (checkBox2.isChecked()) {
            defpackage.jjx jjxVar4 = jjoVar.f.d;
            if (jjxVar4 == null) {
                jjxVar4 = defpackage.jjx.a;
            }
            tkj tkjVar = jjxVar4.l;
            if (tkjVar == null) {
                tkjVar = tkj.a;
            }
            if (tkjVar.d) {
                j$.util.Optional optionalG2 = jjoVar.s.g();
                int i3 = 7;
                defpackage.hrx hrxVar2 = new defpackage.hrx(new defpackage.izj(jjoVar, i3), i3);
                if (true == optionalG2.isPresent()) {
                    hrxVar2.a.a(optionalG2.get());
                }
            }
        }
        j$.util.Optional optionalG3 = jjoVar.t.g();
        int i4 = 9;
        defpackage.hrx hrxVar3 = new defpackage.hrx(new defpackage.izj(jjoVar, i4), i4);
        if (true == optionalG3.isPresent()) {
            hrxVar3.a.a(optionalG3.get());
        }
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
