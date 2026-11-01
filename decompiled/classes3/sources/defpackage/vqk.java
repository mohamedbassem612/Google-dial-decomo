package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vqk implements agye {
    final /* synthetic */ defpackage.vqn a;

    public vqk(defpackage.vqn vqnVar) {
        this.a = vqnVar;
    }

    public final void a(java.lang.Throwable th) {
        aooh.f(th, "t");
        defpackage.vqn.a.c().k(th).l("com/android/dialer/voicemail/settings/greeting/single/impl/ui/VoicemailSingleGreetingSettingsFragmentPeer$getDataModelCallbacks$<anonymous>", "onError", 121, "VoicemailSingleGreetingSettingsFragmentPeer.kt").v("getDataModelCallbacks onError");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    public final /* synthetic */ void b(java.lang.Object obj) {
        boolean z;
        defpackage.vqa vqaVar = (defpackage.vqa) obj;
        aooh.f(vqaVar, "dataModel");
        defpackage.vqn vqnVar = this.a;
        androidx.preference.Preference preferenceB = vqnVar.b();
        vcr vcrVar = vqaVar.f;
        if (vcrVar == null) {
            vcrVar = vcr.a;
        }
        boolean z2 = a.aQ(vcrVar.b) == 2;
        if ((vqaVar.b & 1) == 0) {
            z = false;
        } else {
            defpackage.vph vphVar = vqaVar.e;
            if (vphVar == null) {
                vphVar = defpackage.vph.a;
            }
            java.lang.String str = vphVar.d;
            aooh.e(str, "getLocalAudioUri(...)");
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        java.lang.String str2 = vqnVar.i;
        defpackage.vph vphVar2 = vqaVar.e;
        if (vphVar2 == null) {
            vphVar2 = defpackage.vph.a;
        }
        boolean zN = aooh.n(str2, vphVar2.d);
        if (!z2 || !z || zN) {
            defpackage.vqn.a.b().l("com/android/dialer/voicemail/settings/greeting/single/impl/ui/VoicemailSingleGreetingSettingsFragmentPeer$getDataModelCallbacks$<anonymous>", "onNewData", 110, "VoicemailSingleGreetingSettingsFragmentPeer.kt").L("Failed to fetch the data model with vvmResult being %b and hasCustomGreetingWithAudioUri being %b", z2, z);
            if (preferenceB != null) {
                preferenceB.R(false);
            }
            vqnVar.d();
            return;
        }
        defpackage.vph vphVar3 = vqaVar.e;
        vqnVar.i = (vphVar3 == null ? defpackage.vph.a : vphVar3).d;
        if (vphVar3 == null) {
            vphVar3 = defpackage.vph.a;
        }
        vqnVar.j = ((int) vphVar3.f) * 1000;
        vqnVar.e(0);
        vqnVar.f(false);
        vqnVar.o.f();
        if (preferenceB != null) {
            preferenceB.R(true);
        }
    }

    public final /* synthetic */ void c() {
    }
}
