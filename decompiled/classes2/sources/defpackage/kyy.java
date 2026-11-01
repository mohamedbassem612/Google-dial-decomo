package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kyy extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;

    public kyy(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new amzw(defpackage.kyy.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean zBooleanValue = ((java.lang.Boolean) list.get(0)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(1)).booleanValue();
        spe speVar = ((spn) list.get(2)).c;
        if (speVar == null) {
            speVar = spe.a;
        }
        if (speVar.b.size() == 0) {
            aimz aimzVar = defpackage.kyq.a;
            aimzVar.b().l("com/android/dialer/callrecording/impl/service/CallRecordingProducerModule", "produceShouldStartAutomaticRecordingForContact", 89, "CallRecordingProducerModule.java").v("not in contacts");
            if (!zBooleanValue) {
                return aiql.z(java.lang.Boolean.FALSE);
            }
            aimzVar.b().l("com/android/dialer/callrecording/impl/service/CallRecordingProducerModule", "produceShouldStartAutomaticRecordingForContact", 91, "CallRecordingProducerModule.java").v("non contacts enabled");
            return aiql.z(java.lang.Boolean.TRUE);
        }
        aimz aimzVar2 = defpackage.kyq.a;
        aimzVar2.b().l("com/android/dialer/callrecording/impl/service/CallRecordingProducerModule", "produceShouldStartAutomaticRecordingForContact", 97, "CallRecordingProducerModule.java").v("in contacts");
        if (!zBooleanValue2) {
            return aiql.z(java.lang.Boolean.FALSE);
        }
        amzg amzgVar = this.e;
        aimzVar2.b().l("com/android/dialer/callrecording/impl/service/CallRecordingProducerModule", "produceShouldStartAutomaticRecordingForContact", 99, "CallRecordingProducerModule.java").v("contacts enabled");
        return amzgVar.d();
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
