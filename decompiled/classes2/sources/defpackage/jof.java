package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jof extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;

    public jof(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5) {
        super(amyzVar2, new amzw(defpackage.jof.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean z = false;
        zmy zmyVar = (zmy) list.get(0);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(1)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(2)).booleanValue();
        boolean zBooleanValue3 = ((java.lang.Boolean) list.get(3)).booleanValue();
        defpackage.jor jorVar = (defpackage.jor) list.get(4);
        if (zBooleanValue) {
            defpackage.job.a.b().l("com/android/dialer/callannouncer/impl/service/CallAnnouncerInternalProducerModule", "produceAsyncShouldAnnounce", 120, "CallAnnouncerInternalProducerModule.java").v("Zen Mode is active, returning false");
        } else if (zBooleanValue2) {
            defpackage.job.a.b().l("com/android/dialer/callannouncer/impl/service/CallAnnouncerInternalProducerModule", "produceAsyncShouldAnnounce", 124, "CallAnnouncerInternalProducerModule.java").v("Do Not Disturb is enabled, returning false");
        } else if (!zmyVar.equals(zmy.a)) {
            a.bI(defpackage.job.a.d(), "outgoing call, returning false", "com/android/dialer/callannouncer/impl/service/CallAnnouncerInternalProducerModule", "produceAsyncShouldAnnounce", (char) 129, "CallAnnouncerInternalProducerModule.java", zct.b);
        } else if (jorVar == defpackage.jor.NEVER) {
            defpackage.job.a.b().l("com/android/dialer/callannouncer/impl/service/CallAnnouncerInternalProducerModule", "produceAsyncShouldAnnounce", 134, "CallAnnouncerInternalProducerModule.java").v("setting set to never, returning false");
        } else if (jorVar == defpackage.jor.INVALID) {
            defpackage.job.a.b().l("com/android/dialer/callannouncer/impl/service/CallAnnouncerInternalProducerModule", "produceAsyncShouldAnnounce", 138, "CallAnnouncerInternalProducerModule.java").v("setting is invalid, returning false");
        } else if (jorVar == defpackage.jor.HEADSET) {
            aimz aimzVar = defpackage.job.a;
            aimzVar.b().l("com/android/dialer/callannouncer/impl/service/CallAnnouncerInternalProducerModule", "produceAsyncShouldAnnounce", 142, "CallAnnouncerInternalProducerModule.java").v("setting set to only turn on with headset");
            if (zBooleanValue3) {
                aimzVar.b().l("com/android/dialer/callannouncer/impl/service/CallAnnouncerInternalProducerModule", "produceAsyncShouldAnnounce", 147, "CallAnnouncerInternalProducerModule.java").v("headset connected");
                z = true;
            } else {
                aimzVar.b().l("com/android/dialer/callannouncer/impl/service/CallAnnouncerInternalProducerModule", "produceAsyncShouldAnnounce", 144, "CallAnnouncerInternalProducerModule.java").v("no headset connected, returning false");
            }
        } else {
            z = true;
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
