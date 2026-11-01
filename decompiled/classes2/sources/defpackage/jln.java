package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jln implements android.view.View.OnClickListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public jln(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v35, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v36, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v7, types: [aonj, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        aify aifyVar;
        int i = 14;
        int i2 = 3;
        byte[] bArr = null;
        switch (this.$cid) {
            case 0:
                aooh.f(view, "view");
                defpackage.jlm jlmVar = (defpackage.jlm) this.a;
                jlmVar.f.o((rmx) ((defpackage.jlp) jlmVar.a().e.c()).a.d.get(defpackage.jmr.d));
                jlmVar.b();
                if (!jlmVar.a().c()) {
                    defpackage.jlq jlqVarA = jlmVar.a();
                    aoov.an(jlqVarA.a, (aolr) null, 0, new defpackage.jlk(jlqVarA, (aoln) null, 3), 3);
                    return;
                } else {
                    jlmVar.d.i(zoe.N(aosv.F(jlmVar.h, 0, new defpackage.jlk(jlmVar, (aoln) null, 0), 3)), jlmVar.i);
                    jlmVar.c();
                    jlmVar.c.f();
                    return;
                }
            case 1:
                aooh.f(view, "view");
                java.lang.Object obj = this.a;
                defpackage.jld jldVar = (defpackage.jld) obj;
                zoe zoeVar = new zoe(jldVar.n.c());
                agtk agtkVar = jldVar.i;
                agtj agtjVar = jldVar.e;
                agtjVar.i(zoeVar, agtkVar);
                rmx rmxVar = rmx.uA;
                rlv rlvVar = jldVar.c;
                rlvVar.o(rmxVar);
                defpackage.jkx jkxVar = jldVar.b;
                jkxVar.A();
                defpackage.jmk jmkVar = jldVar.g;
                defpackage.jjx jjxVar = jmkVar.d;
                if (jjxVar == null) {
                    jjxVar = defpackage.jjx.a;
                }
                aooh.e(jjxVar, "getSpamDialogInfo(...)");
                rlvVar.n(rmw.m);
                int iAD = a.aD(jjxVar.g);
                if (iAD != 0 && iAD == 2) {
                    jldVar.s.bm(rmu.m);
                }
                agtjVar.i(zoe.N(jldVar.q.j(aify.p(jjxVar.c), jjxVar.e)), jldVar.j);
                defpackage.jmf.a(jkxVar.A());
                defpackage.jjx jjxVar2 = jmkVar.d;
                if (jjxVar2 == null) {
                    jjxVar2 = defpackage.jjx.a;
                }
                if (jjxVar2.j) {
                    j$.util.Optional optional = jldVar.f;
                    defpackage.hrx hrxVar = new defpackage.hrx(new defpackage.izj(obj, i), 12);
                    optional.isPresent();
                    hrxVar.a.a(optional.get());
                    return;
                }
                return;
            case 2:
                aooh.f(view, "view");
                defpackage.jlm jlmVar2 = (defpackage.jlm) this.a;
                if (jlmVar2.a().b()) {
                    return;
                }
                jlmVar2.f.o((rmx) ((defpackage.jlp) jlmVar2.a().e.c()).a.d.get(defpackage.jmr.e));
                jlmVar2.b();
                defpackage.jlq jlqVarA2 = jlmVar2.a();
                aoov.an(jlqVarA2.a, (aolr) null, 0, new defpackage.jlk(jlqVarA2, (aoln) null, 4, (byte[]) null), 3);
                return;
            case 3:
                aooh.f(view, "view");
                ((defpackage.jmp) this.a).b.f();
                return;
            case 4:
                aooh.f(view, "view");
                defpackage.jmp.a.b().l("com/android/dialer/blockreportspam/UnblockNumberDialogFragmentPeer", "onPositiveClick", 116, "UnblockNumberDialogFragmentPeer.kt").v("unblock number");
                defpackage.jmp jmpVar = (defpackage.jmp) this.a;
                jmpVar.b.A();
                defpackage.jjx jjxVar3 = jmpVar.e.d;
                if (jjxVar3 == null) {
                    jjxVar3 = defpackage.jjx.a;
                }
                aooh.e(jjxVar3, "getSpamDialogInfo(...)");
                jmpVar.c.n(rmw.o);
                jmpVar.d.i(zoe.N(jmpVar.g.l(aify.p(jjxVar3.c), jjxVar3.e)), jmpVar.f);
                return;
            case 5:
                defpackage.jvk jvkVar = (defpackage.jvk) this.a;
                jvkVar.f.o(rmx.fl);
                jvkVar.d.a();
                jvkVar.a(true);
                return;
            case 6:
                defpackage.jvk jvkVar2 = (defpackage.jvk) this.a;
                jvkVar2.f.o(rmx.fm);
                jvkVar2.c.f();
                return;
            case 7:
                defpackage.jvk jvkVar3 = (defpackage.jvk) this.a;
                jvkVar3.f.o(rmx.fn);
                int i3 = com.google.android.material.bottomsheet.BottomSheetBehavior.h(jvkVar3.c.c().findViewById(2131427944)).y;
                if (i3 == 4) {
                    i2 = i3;
                } else if (i3 != 3) {
                    return;
                }
                jvkVar3.d.a();
                jvkVar3.a(i2 == 4);
                return;
            case 8:
                zai zaiVar = (zai) ((com.android.dialer.calleridfeedback.impl.ui.callertagselector.CallerTagChipView) view).y().g.orElseThrow(new defpackage.iaz(2));
                defpackage.jvk jvkVar4 = (defpackage.jvk) this.a;
                defpackage.jvm jvmVar = jvkVar4.h;
                if (jvmVar != null) {
                    zai zaiVar2 = jvmVar.f;
                    if (zaiVar2 == null) {
                        zaiVar2 = zai.a;
                    }
                    if (zaiVar2.equals(zaiVar)) {
                        jvkVar4.d.a();
                        return;
                    }
                }
                jvkVar4.f.o(rmx.fo);
                defpackage.jvd jvdVar = jvkVar4.d;
                defpackage.jvd.a.b().l("com/android/dialer/calleridfeedback/impl/ui/callertagselector/CallerTagSelectorDataService", "selectCallerTag", 95, "CallerTagSelectorDataService.java").y("Setting selected caller tag to %s", zaiVar);
                jvdVar.h.s(jvdVar.k.bl(new jsd(zaiVar, 5)), defpackage.jve.b);
                return;
            case 9:
                defpackage.jvk jvkVar5 = (defpackage.jvk) this.a;
                jvkVar5.f.o(rmx.fj);
                defpackage.jvd jvdVar2 = jvkVar5.d;
                ahrv ahrvVarG = ahrv.g(jvdVar2.k.bk());
                defpackage.jrz jrzVar = jvkVar5.b;
                defpackage.iau iauVar = new defpackage.iau(jvdVar2, jrzVar, 9, bArr);
                ajct ajctVar = jvdVar2.d;
                jvdVar2.h.s(ahrvVarG.h(iauVar, ajctVar).i(new defpackage.idd(jvdVar2, jrzVar, i, bArr), ajctVar).e(java.lang.IllegalStateException.class, new defpackage.exn(20), ajctVar), defpackage.jve.b);
                defpackage.jvf jvfVar = jvkVar5.c;
                android.view.View viewFindViewById = jvfVar.H().findViewById(jrzVar.k);
                if (viewFindViewById == null) {
                    a.bI(defpackage.jvk.a.d(), "null parent view", "com/android/dialer/calleridfeedback/impl/ui/callertagselector/CallerTagSelectorFragmentPeer", "showSnackBar", (char) 449, "CallerTagSelectorFragmentPeer.java", zct.b);
                } else {
                    agby.o(viewFindViewById, 2132017939, -1).h();
                }
                jvfVar.f();
                return;
            case 10:
                defpackage.jvk jvkVar6 = (defpackage.jvk) this.a;
                jvkVar6.f.o(rmx.fk);
                jvkVar6.c.f();
                return;
            case 11:
                this.a.a(view);
                return;
            case 12:
                this.a.a(view);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                defpackage.kld kldVar = ((defpackage.klo) this.a).f;
                if (kldVar.z() == null) {
                    a.bI(defpackage.klo.a.d(), "no context", "com/android/dialer/calllog/ui/CallLogFragmentPeer", "configureEmptyContentViewForRequestingPermission", (char) 1135, "CallLogFragmentPeer.java", zct.b);
                    return;
                }
                android.content.Context contextZ = kldVar.z();
                aify aifyVar2 = zqz.a;
                if (android.os.Build.VERSION.SDK_INT >= 37) {
                    aifyVar = zqz.c;
                } else {
                    aifyVar = android.os.Build.VERSION.SDK_INT >= 33 ? zqz.b : zqz.a;
                }
                java.lang.String[] strArrB = zqz.b(contextZ, aifyVar);
                if (strArrB.length > 0) {
                    defpackage.klo.a.b().l("com/android/dialer/calllog/ui/CallLogFragmentPeer", "configureEmptyContentViewForRequestingPermission", 1142, "CallLogFragmentPeer.java").y("requesting permissions: %s", java.util.Arrays.toString(strArrB));
                    kldVar.ar(strArrB, 1);
                    return;
                }
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                defpackage.kma kmaVar = (defpackage.kma) this.a;
                kmaVar.t.a(kmaVar.E(), true, false, defpackage.nwt.CONVERSATION_HISTORY_LIST_ITEM);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                defpackage.kma kmaVar2 = (defpackage.kma) this.a;
                if (kmaVar2.D(kmaVar2.E()) == null) {
                    kmaVar2.H(mce.B);
                }
                kmaVar2.t.a(kmaVar2.E(), false, kmaVar2.G.c, defpackage.nwt.CONVERSATION_HISTORY_LIST_ITEM);
                return;
            case 16:
                defpackage.kma kmaVar3 = (defpackage.kma) this.a;
                ahvr.j(new defpackage.klq(kmaVar3.E()), kmaVar3.a);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((defpackage.krt) ((defpackage.krv) this.a).a).f();
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ahvr.j(new defpackage.kwg(), (android.view.View) this.a);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                defpackage.lay layVar = (defpackage.lay) this.a;
                android.widget.Switch switchA = layVar.a();
                if (switchA.isEnabled()) {
                    if (switchA.isChecked()) {
                        layVar.c(false);
                        return;
                    }
                    defpackage.lak lakVar = new defpackage.lak();
                    amxr.g(lakVar);
                    lakVar.r(layVar.c.I(), "record_for_selected_numbers_dialog");
                    return;
                }
                return;
            default:
                defpackage.lay.a.b().l("com/android/dialer/callrecording/impl/settings/SelectedContactNumbersFragmentPeer", "onChooseContactClicked", 356, "SelectedContactNumbersFragmentPeer.java").v("invoke the system contact picker");
                android.content.Intent intent = new android.content.Intent("android.intent.action.PICK");
                intent.setType("vnd.android.cursor.dir/phone_v2");
                defpackage.jnv jnvVar = new defpackage.jnv(this.a, intent, 11);
                android.os.StrictMode.VmPolicy vmPolicy = android.os.StrictMode.getVmPolicy();
                android.os.StrictMode.setVmPolicy(android.os.StrictMode.VmPolicy.LAX);
                try {
                    jnvVar.run();
                    return;
                } finally {
                    android.os.StrictMode.setVmPolicy(vmPolicy);
                }
        }
    }

    public /* synthetic */ jln(java.lang.Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}
