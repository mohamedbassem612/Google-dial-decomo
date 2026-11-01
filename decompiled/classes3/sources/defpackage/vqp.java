package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vqp implements rvd {
    public static final aimz a = aimz.i("com/android/dialer/voicemail/settings/multibinding/VoicemailSettingsIntegration");
    public final android.content.Context b;
    private final ajct c;
    private final zjs d;
    private final defpackage.vnx e;

    public vqp(android.content.Context context, ajct ajctVar, zjs zjsVar, defpackage.vnx vnxVar) {
        this.b = context;
        this.c = ajctVar;
        this.d = zjsVar;
        this.e = vnxVar;
    }

    public final android.content.Intent a() {
        throw new java.lang.IllegalStateException("This setting returns a Fragment, not an Intent.");
    }

    public final aw b() {
        zjs zjsVar = this.d;
        j$.util.Optional optionalEmpty = j$.util.Optional.empty();
        for (android.telecom.PhoneAccountHandle phoneAccountHandle : zjsVar.s()) {
            j$.util.Optional optionalJ = zjsVar.j(phoneAccountHandle);
            if (optionalJ.isPresent() && ((android.telecom.PhoneAccount) optionalJ.orElseThrow()).hasCapabilities(4)) {
                a.b().l("com/android/dialer/voicemail/settings/multibinding/VoicemailSettingsIntegration", "getSoleSimAccount", 136, "VoicemailSettingsIntegration.java").y("%s is a SIM account", phoneAccountHandle);
                if (optionalEmpty.isPresent()) {
                    optionalEmpty = j$.util.Optional.empty();
                    break;
                }
                optionalEmpty = j$.util.Optional.of(phoneAccountHandle);
            }
        }
        boolean zIsPresent = optionalEmpty.isPresent();
        aimz aimzVar = a;
        if (zIsPresent) {
            aimzVar.b().l("com/android/dialer/voicemail/settings/multibinding/VoicemailSettingsIntegration", "createFragment", 91, "VoicemailSettingsIntegration.java").v("showing single-SIM voicemail settings");
            defpackage.voz vozVar = new defpackage.voz();
            amxr.g(vozVar);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("phone_account_handle", (android.os.Parcelable) optionalEmpty.orElseThrow());
            vozVar.au(bundle);
            return vozVar;
        }
        aimzVar.b().l("com/android/dialer/voicemail/settings/multibinding/VoicemailSettingsIntegration", "createFragment", 98, "VoicemailSettingsIntegration.java").v("showing multi-SIM voicemail settings");
        defpackage.voq voqVar = new defpackage.voq();
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("target_fragment", defpackage.voz.class.getName());
        bundle2.putString("phone_account_handle_key", "phone_account_handle");
        bundle2.putBundle("arguments", new android.os.Bundle());
        bundle2.putInt("target_title_res", 2132020947);
        voqVar.au(bundle2);
        return voqVar;
    }

    public final /* synthetic */ aw c(defpackage.rvq rvqVar) {
        return b();
    }

    public final ajcq d() {
        return afsq.bQ();
    }

    public final ajcq e() {
        defpackage.vnx vnxVar = this.e;
        return ahrv.g(aosv.F(vnxVar.a, 0, new ung(vnxVar, (aoln) null, 6), 3)).h(new defpackage.vmb(this, 14), this.c);
    }
}
