package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jon extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public jon(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new amzw(defpackage.jon.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean zBooleanValue = ((java.lang.Boolean) list.get(0)).booleanValue();
        zpm zpmVar = (zpm) list.get(1);
        aimz aimzVar = defpackage.job.a;
        aimzVar.b().l("com/android/dialer/callannouncer/impl/service/CallAnnouncerInternalProducerModule", "produceShouldAnnounce", 96, "CallAnnouncerInternalProducerModule.java").v("producing shouldAnnounce");
        if (zBooleanValue) {
            aimzVar.b().l("com/android/dialer/callannouncer/impl/service/CallAnnouncerInternalProducerModule", "produceShouldAnnounce", 99, "CallAnnouncerInternalProducerModule.java").v("emergency callback, returning false");
            return aiql.z(java.lang.Boolean.FALSE);
        }
        if (!zpmVar.i().isPresent()) {
            return this.d.d();
        }
        aimzVar.b().l("com/android/dialer/callannouncer/impl/service/CallAnnouncerInternalProducerModule", "produceShouldAnnounce", 104, "CallAnnouncerInternalProducerModule.java").v("ongoing call present, returning false");
        return aiql.z(java.lang.Boolean.FALSE);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
