package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class joc extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amyz f;

    public joc(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amyz amyzVar3) {
        super(amyzVar2, new amzw(defpackage.joc.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amyzVar3;
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalEmpty;
        java.util.List list = (java.util.List) obj;
        boolean zBooleanValue = ((java.lang.Boolean) list.get(0)).booleanValue();
        java.lang.String str = (java.lang.String) list.get(1);
        j$.util.Optional optional = (j$.util.Optional) list.get(2);
        android.media.AudioAttributes audioAttributes = (android.media.AudioAttributes) list.get(3);
        if (zBooleanValue && optional.isPresent()) {
            j$.util.OptionalLong optionalLongEmpty = j$.util.OptionalLong.empty();
            if (str == null) {
                throw new java.lang.NullPointerException("Null id");
            }
            java.lang.String str2 = (java.lang.String) optional.orElseThrow();
            if (str2 == null) {
                throw new java.lang.NullPointerException("Null text");
            }
            if (audioAttributes == null) {
                throw new java.lang.NullPointerException("Null audioAttributes");
            }
            amyz amyzVar = this.f;
            if (((java.lang.Long) amyzVar.a()).longValue() < 0) {
                a.bI(defpackage.job.a.d(), "repeat announcement delay is less than 0, disabling repeated announcement", "com/android/dialer/callannouncer/impl/service/CallAnnouncerInternalProducerModule", "produceAnnouncement", 'Q', "CallAnnouncerInternalProducerModule.java", zct.b);
                optionalEmpty = j$.util.Optional.of(new defpackage.jnu(str, str2, audioAttributes, optionalLongEmpty));
            } else {
                optionalEmpty = j$.util.Optional.of(new defpackage.jnu(str, str2, audioAttributes, j$.util.OptionalLong.of(((java.lang.Long) amyzVar.a()).longValue())));
            }
        } else {
            optionalEmpty = j$.util.Optional.empty();
        }
        return aiql.z(optionalEmpty);
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        amzg amzgVar2 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar2.d(), amzgVar.d()});
    }
}
