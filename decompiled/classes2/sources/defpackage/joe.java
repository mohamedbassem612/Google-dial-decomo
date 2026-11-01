package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class joe extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;

    public joe(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6) {
        super(amyzVar2, new amzw(defpackage.joe.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalOf;
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        java.lang.String str = (java.lang.String) list.get(1);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(2)).booleanValue();
        j$.util.Optional optional = (j$.util.Optional) list.get(3);
        j$.util.Optional optional2 = (j$.util.Optional) list.get(4);
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(5)).booleanValue();
        if (!optional2.isPresent()) {
            a.bI(defpackage.job.a.c().m(aioa.b), "display name unavailable.", "com/android/dialer/callannouncer/impl/service/CallAnnouncerInternalProducerModule", "produceAnnouncementText", (char) 168, "CallAnnouncerInternalProducerModule.java", zct.b);
            optionalOf = j$.util.Optional.empty();
        } else if (zBooleanValue2) {
            defpackage.job.a.b().l("com/android/dialer/callannouncer/impl/service/CallAnnouncerInternalProducerModule", "produceAnnouncementText", 173, "CallAnnouncerInternalProducerModule.java").v("Incoming number is considered spam. Call announcer informs incoming spam call instead.");
            optionalOf = j$.util.Optional.of(defpackage.job.b(context.getString(2132017907)));
        } else {
            java.lang.String str2 = "<say-as interpret-as=\"telephone\">" + defpackage.job.a((java.lang.String) optional2.orElseThrow()) + "</say-as>";
            if (!zBooleanValue) {
                optionalOf = j$.util.Optional.of(defpackage.job.b(context.getString(2132017891, str, str2)));
            } else if (optional.isPresent()) {
                defpackage.job.a.b().l("com/android/dialer/callannouncer/impl/service/CallAnnouncerInternalProducerModule", "produceAnnouncementText", 197, "CallAnnouncerInternalProducerModule.java").v("announcement text is ready");
                optionalOf = j$.util.Optional.of(defpackage.job.b(context.getString(2132017890, str, str2, defpackage.job.a((java.lang.String) optional.orElseThrow()))));
            } else {
                a.bI(defpackage.job.a.c().m(aioa.b), "no SIM label present when multi-SIM", "com/android/dialer/callannouncer/impl/service/CallAnnouncerInternalProducerModule", "produceAnnouncementText", (char) 193, "CallAnnouncerInternalProducerModule.java", zct.b);
                optionalOf = j$.util.Optional.empty();
            }
        }
        return aiql.z(optionalOf);
    }

    protected final ajcq c() {
        amzg amzgVar = this.g;
        amzg amzgVar2 = this.f;
        amzg amzgVar3 = this.e;
        amzg amzgVar4 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
