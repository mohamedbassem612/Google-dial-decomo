package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vko implements defpackage.vjc {
    public static final aimz a = aimz.i("com/android/dialer/voicemail/service/impl/vvmclients/omtp/protocol/vvm3/Vvm3Provisioner");
    public static final vcr b;
    public static final vcr c;
    public final defpackage.vkj d;
    public final ajct e;
    public final vku f;
    public final vgl g;
    private final defpackage.vka h;
    private final rlv i;
    private final vdc j;

    static {
        akzx akzxVarM = vcr.a.m();
        vcq vcqVar = vcq.a;
        akzxVarM.u();
        vcr vcrVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(vcqVar);
        vcrVar.c = vcqVar;
        vcrVar.b = 1;
        b = akzxVarM.p();
        akzx akzxVarM2 = vcr.a.m();
        akzx akzxVarM3 = vcp.a.m();
        defpackage.vbw vbwVar = defpackage.vbw.PROVISION_GENERIC_FAILURE;
        akzxVarM3.u();
        vcp vcpVar = akzxVarM3.b;
        vcpVar.c = java.lang.Integer.valueOf(vbwVar.a());
        vcpVar.b = 3;
        akzxVarM2.u();
        vcr vcrVar2 = akzxVarM2.b;
        vcp vcpVarP = akzxVarM3.p();
        j$.util.Objects.requireNonNull(vcpVarP);
        vcrVar2.c = vcpVarP;
        vcrVar2.b = 2;
        c = akzxVarM2.p();
    }

    public vko(defpackage.vkj vkjVar, defpackage.vka vkaVar, ajct ajctVar, rlv rlvVar, vgl vglVar, vdc vdcVar, vku vkuVar) {
        this.d = vkjVar;
        this.h = vkaVar;
        this.e = ajctVar;
        this.i = rlvVar;
        this.g = vglVar;
        this.j = vdcVar;
        this.f = vkuVar;
    }

    @Override // defpackage.vjc
    public final ajcq a(defpackage.veo veoVar) {
        java.lang.String str = veoVar.c;
        java.lang.String str2 = veoVar.d;
        aimz aimzVar = a;
        aimw aimwVarB = aimzVar.b();
        ainp ainpVar = zct.a;
        aimwVarB.i(ainpVar).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/protocol/vvm3/Vvm3Provisioner", "checkSubscriberStatus", 207, "Vvm3Provisioner.java").I("VVM provisioning status received: status=%s, return code=%s", str, str2);
        int iHashCode = str.hashCode();
        if (iHashCode != 66) {
            if (iHashCode != 78) {
                if (iHashCode != 80) {
                    if (iHashCode != 82) {
                        if (iHashCode == 85 && str.equals("U")) {
                            return android.text.TextUtils.equals(str2, "2") ? aiql.z(defpackage.vjb.b) : aiql.y(new defpackage.vcv(defpackage.vbs.ACTIVATE_PROVISIONING_STATE_UNKNOWN));
                        }
                    } else if (str.equals("R")) {
                        return aiql.z(defpackage.vjb.d);
                    }
                } else if (str.equals("P")) {
                    a.bI(aimzVar.b(), "User provisioned but not activated, disabling VVM", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/protocol/vvm3/Vvm3Provisioner", "checkSubscriberStatus", (char) 214, "Vvm3Provisioner.java", ainpVar);
                    return aiql.z(defpackage.vjb.c);
                }
            } else if (str.equals("N")) {
                return aiql.z(defpackage.vjb.a);
            }
        } else if (str.equals("B")) {
            a.bI(aimzVar.b(), "User blocked", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/protocol/vvm3/Vvm3Provisioner", "checkSubscriberStatus", (char) 225, "Vvm3Provisioner.java", ainpVar);
            return aiql.y(new defpackage.vcv(defpackage.vbs.ACTIVATE_PROVISIONING_STATE_BLOCKED));
        }
        aimzVar.c().m(aioa.b).i(zct.b).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/protocol/vvm3/Vvm3Provisioner", "checkSubscriberStatus", 233, "Vvm3Provisioner.java").y("unrecognized status: %s", str);
        return aiql.z(defpackage.vjb.d);
    }

    @Override // defpackage.vjc
    public final ajcq b(android.telecom.PhoneAccountHandle phoneAccountHandle, defpackage.veo veoVar, defpackage.vjb vjbVar) {
        this.i.n(rmw.aH);
        if (defpackage.vjb.a.equals(vjbVar)) {
            a.bI(a.b(), "enter", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/protocol/vvm3/Vvm3Provisioner", "setupNewUser", 'o', "Vvm3Provisioner.java", zct.a);
            defpackage.vka vkaVar = this.h;
            defpackage.vgm vgmVar = veoVar.e;
            if (vgmVar == null) {
                vgmVar = defpackage.vgm.a;
            }
            return ahvr.I(vkaVar.a(phoneAccountHandle, vgmVar), new defpackage.vkn(this, phoneAccountHandle, 2), this.e);
        }
        boolean zEquals = defpackage.vjb.b.equals(vjbVar);
        aimz aimzVar = a;
        if (!zEquals) {
            a.bt(aimzVar.c().m(aioa.b), "unexpected status: %s", vjbVar, "com/android/dialer/voicemail/service/impl/vvmclients/omtp/protocol/vvm3/Vvm3Provisioner", "provisionAccount", 'h', "Vvm3Provisioner.java", zct.b);
            return aiql.z(anar.t(defpackage.vbw.PROVISION_ERROR_SUBSCRIBER_STATUS));
        }
        a.bI(aimzVar.b(), "enter", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/protocol/vvm3/Vvm3Provisioner", "subscribe", 'y', "Vvm3Provisioner.java", zct.a);
        ahrv ahrvVarG = ahrv.g(this.j.a(phoneAccountHandle));
        defpackage.vfv vfvVar = new defpackage.vfv(this, phoneAccountHandle, 20);
        ajct ajctVar = this.e;
        return ahrvVarG.i(vfvVar, ajctVar).i(new defpackage.vjx(this, phoneAccountHandle, veoVar, 2, (char[]) null), ajctVar);
    }

    public final ajcq c(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        j$.util.Optional.of(phoneAccountHandle);
        ahrv ahrvVarG = ahrv.g(aiql.z("STATUS"));
        defpackage.vkn vknVar = new defpackage.vkn(this, phoneAccountHandle, 1);
        ajct ajctVar = this.e;
        return ahrvVarG.i(vknVar, ajctVar).h(new defpackage.vju(15), ajctVar);
    }
}
