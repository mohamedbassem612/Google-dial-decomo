package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jgm {
    private static final aimz a = aimz.i("com/android/dialer/beesly/impl/v2/service/session/BeeslySingletonAudioPrismConfigProviderV2");
    private final iwc b;
    private final iqm c;

    public jgm(iwc iwcVar, iqm iqmVar) {
        aooh.f(iwcVar, "beeslySingletonLocaleProvider");
        this.b = iwcVar;
        this.c = iqmVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.jgl jglVar;
        ipc ipcVarF;
        defpackage.her herVar;
        defpackage.her herVar2;
        defpackage.her herVar3;
        ipc ipcVar;
        if (aolnVar instanceof defpackage.jgl) {
            jglVar = (defpackage.jgl) aolnVar;
            int i = jglVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jglVar.c = i - Integer.MIN_VALUE;
            } else {
                jglVar = new defpackage.jgl(this, aolnVar);
            }
        } else {
            jglVar = new defpackage.jgl(this, aolnVar);
        }
        java.lang.Object obj = jglVar.a;
        aolu aoluVar = aolu.a;
        int i2 = jglVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            ipcVarF = kcq.F(igf.a.m());
            ipcVarF.g(ifv.h);
            ipc ipcVarG = kcq.G(ige.a.m());
            ipcVarG.i(3);
            ipcVarF.d(ipcVarG.h());
            ipc ipcVarL = kcq.L(ifz.a.m());
            ipc ipcVarP = kcq.P(ify.a.m());
            ipcVarP.m(ifx.b);
            ipcVarL.k(ipcVarP.l());
            ipcVarF.c(ipcVarL.j());
            defpackage.her herVarM = defpackage.hhk.m(igs.a.m());
            iwc iwcVar = this.b;
            jglVar.d = ipcVarF;
            jglVar.f = herVarM;
            jglVar.g = herVarM;
            jglVar.e = ipcVarF;
            jglVar.h = herVarM;
            jglVar.c = 1;
            java.lang.Object objA = iwcVar.a(jglVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
            herVar = herVarM;
            herVar2 = herVar;
            herVar3 = herVar2;
            obj = objA;
            ipcVar = ipcVarF;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            herVar = jglVar.h;
            ipcVarF = jglVar.e;
            herVar2 = jglVar.g;
            herVar3 = jglVar.f;
            ipcVar = jglVar.d;
            aooc.af(obj);
        }
        herVar.z((java.lang.String) obj);
        aimz aimzVar = a;
        aimzVar.b().l("com/android/dialer/beesly/impl/v2/service/session/BeeslySingletonAudioPrismConfigProviderV2", "getConfig$<anonymous>$<anonymous>", 54, "BeeslySingletonAudioPrismConfigProviderV2.kt").y("Beesly AudioPrism CompositeModel Locale: %s", herVar2.x());
        iqm iqmVar = this.c;
        if (iqmVar.f()) {
            alct alctVarW = herVar2.w();
            defpackage.her herVarN = defpackage.hhk.n(defpackage.igr.a.m());
            defpackage.jhw jhwVarE = defpackage.hhv.e(defpackage.ihm.a.m());
            defpackage.ihj ihjVar = this.b.h.g() ? defpackage.ihj.FALLBACK_TO_AUDIO_GEMINI_TRANSLATION_ALWAYS : defpackage.ihj.ASR_ENHANCEMENT_POLICY_UNDEFINED;
            if (ihjVar != defpackage.ihj.ASR_ENHANCEMENT_POLICY_UNDEFINED) {
                aimzVar.b().l("com/android/dialer/beesly/impl/v2/service/session/BeeslySingletonAudioPrismConfigProviderV2", "getConfig$<anonymous>$<anonymous>$<anonymous>$<anonymous>", 62, "BeeslySingletonAudioPrismConfigProviderV2.kt").y("AsrEnhancementPolicy: %s", ihjVar.name());
                jhwVarE.k(ihjVar);
            }
            herVarN.F(jhwVarE.j());
            herVar2.y(alctVarW, herVarN.C());
        }
        if (iqmVar.b()) {
            alct alctVarW2 = herVar2.w();
            defpackage.her herVarN2 = defpackage.hhk.n(defpackage.igr.a.m());
            herVarN2.D(defpackage.hht.i(defpackage.igy.a.m()).q());
            herVar2.y(alctVarW2, herVarN2.C());
        }
        ipcVarF.e(herVar3.v());
        return ipcVar.b();
    }
}
