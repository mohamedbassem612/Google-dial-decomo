package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nys extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;

    public nys(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5) {
        super(amyzVar2, new amzw(defpackage.nys.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean z = false;
        boolean zBooleanValue = ((java.lang.Boolean) list.get(0)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(1)).booleanValue();
        zna znaVar = (zna) list.get(2);
        boolean zBooleanValue3 = ((java.lang.Boolean) list.get(3)).booleanValue();
        qbe qbeVar = (qbe) list.get(4);
        int i = defpackage.nyo.a;
        if (zBooleanValue) {
            defpackage.nyp.a.b().l("com/android/dialer/duo/tidepods/DuoProducerModule", "produceIsMeetUpgradePhoneNumberSupported", 100, "DuoProducerModule.java").v("Call is to Voicemail so Meet upgrade is not supported.");
        } else if (zBooleanValue2) {
            defpackage.nyp.a.b().l("com/android/dialer/duo/tidepods/DuoProducerModule", "produceIsMeetUpgradePhoneNumberSupported", 104, "DuoProducerModule.java").v("Call is a conference call so Meet upgrade is not supported.");
        } else if (znaVar == zna.c) {
            defpackage.nyp.a.b().l("com/android/dialer/duo/tidepods/DuoProducerModule", "produceIsMeetUpgradePhoneNumberSupported", 108, "DuoProducerModule.java").v("Call is from private number so Meet upgrade is not supported.");
            qbeVar.c(qbc.eE);
        } else if (zBooleanValue3) {
            z = true;
        } else {
            defpackage.nyp.a.b().l("com/android/dialer/duo/tidepods/DuoProducerModule", "produceIsMeetUpgradePhoneNumberSupported", 116, "DuoProducerModule.java").v("Call is not allowed to be held so Meet upgrade is not supported.");
        }
        return aiql.z(java.lang.Boolean.valueOf(z));
    }

    protected final ajcq c() {
        amzg amzgVar = this.f;
        amzg amzgVar2 = this.e;
        amzg amzgVar3 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
