package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vsv extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public vsv(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.vsv.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalB;
        java.util.List list = (java.util.List) obj;
        sou souVar = (sou) list.get(0);
        android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) list.get(1);
        if (((java.lang.Boolean) list.get(2)).booleanValue()) {
            optionalB = souVar.b(phoneAccountHandle.getComponentName().flattenToString(), phoneAccountHandle.getId());
            if (!optionalB.isPresent() || ((defpackage.sot) optionalB.orElseThrow()).c.isEmpty()) {
                defpackage.vrz.a.d().l("com/android/dialer/voicemail/settings/service/VoicemailSettingsModelProducerModule", "producePhoneAccountLabelInfo", 615, "VoicemailSettingsModelProducerModule.java").v("produce empty phone account info since failed to get phone account label");
                optionalB = j$.util.Optional.empty();
            }
        } else {
            defpackage.vrz.a.b().l("com/android/dialer/voicemail/settings/service/VoicemailSettingsModelProducerModule", "producePhoneAccountLabelInfo", 605, "VoicemailSettingsModelProducerModule.java").v("produce empty phone account info for non-dual sim");
            optionalB = j$.util.Optional.empty();
        }
        return aiql.z(optionalB);
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
