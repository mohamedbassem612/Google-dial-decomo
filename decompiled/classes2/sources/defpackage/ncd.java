package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final /* synthetic */ class ncd implements znv, aood {
    final /* synthetic */ defpackage.nej a;

    public ncd(defpackage.nej nejVar) {
        this.a = nejVar;
    }

    public final ajcq ej() {
        j$.time.Instant instantNow = j$.time.Instant.now();
        aooh.e(instantNow, "instant(...)");
        aenj aenjVar = new aenj("onCallRingingStarted");
        defpackage.nej nejVar = this.a;
        defpackage.nbz nbzVar = new defpackage.nbz(instantNow, aenjVar, nejVar.S(null, new defpackage.jew(nejVar, (aoln) null, 3)));
        nejVar.G.offer(nbzVar);
        return aosv.C(nbzVar.c);
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof znv) && (obj instanceof aood)) {
            return aooh.n(ex(), ((aood) obj).ex());
        }
        return false;
    }

    public final aoio ex() {
        return new aoof(0, this.a, defpackage.nej.class, "onCallRingingStarted", "onCallRingingStarted()Lcom/google/common/util/concurrent/ListenableFuture;", 0);
    }

    public final int hashCode() {
        return ex().hashCode();
    }
}
