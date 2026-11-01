package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class joi extends amzm {
    private final amzg b;
    private final amzg c;

    public joi(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new amzw(defpackage.joi.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        afpl afplVar = (afpl) list.get(1);
        defpackage.job.a.b().l("com/android/dialer/callannouncer/impl/service/CallAnnouncerInternalProducerModule", "produceDisplayNameAfterLookups", 280, "CallAnnouncerInternalProducerModule.java").v("full phone lookup finished");
        return ((defpackage.joa) aooc.ar(afplVar.Y(), defpackage.joa.class)).Y();
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
