package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class ncc implements znh, aood {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public ncc(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final ajcq a() {
        if (this.$cid != 0) {
            defpackage.jfc jfcVar = (defpackage.jfc) this.a;
            return jfcVar.a(new defpackage.blq(jfcVar, (aoln) null, 12, (byte[]) null));
        }
        j$.time.Instant instantNow = j$.time.Instant.now();
        aooh.e(instantNow, "instant(...)");
        aenj aenjVar = new aenj("onAudioProcessingStarted");
        defpackage.nej nejVar = (defpackage.nej) this.a;
        defpackage.nbz nbzVar = new defpackage.nbz(instantNow, aenjVar, nejVar.S(ruc.aZ, new defpackage.ncv(nejVar, null)));
        nejVar.G.offer(nbzVar);
        return aosv.C(nbzVar.c);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this.$cid != 0) {
            if ((obj instanceof znh) && (obj instanceof aood)) {
                return aooh.n(ex(), ((aood) obj).ex());
            }
            return false;
        }
        if ((obj instanceof znh) && (obj instanceof aood)) {
            return aooh.n(ex(), ((aood) obj).ex());
        }
        return false;
    }

    public final aoio ex() {
        int i = this.$cid;
        java.lang.Object obj = this.a;
        return i != 0 ? new aoof(0, obj, defpackage.jfc.class, "onAudioProcessingStarted", "onAudioProcessingStarted()Lcom/google/common/util/concurrent/ListenableFuture;", 0) : new aoof(0, obj, defpackage.nej.class, "onAudioProcessingStarted", "onAudioProcessingStarted()Lcom/google/common/util/concurrent/ListenableFuture;", 0);
    }

    public final int hashCode() {
        int i = this.$cid;
        aoio aoioVarEx = ex();
        return i != 0 ? aoioVarEx.hashCode() : aoioVarEx.hashCode();
    }
}
