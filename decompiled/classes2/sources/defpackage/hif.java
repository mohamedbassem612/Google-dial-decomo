package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class hif implements defpackage.zit {
    private final /* synthetic */ int $cid;
    final /* synthetic */ defpackage.hih a;

    public hif(defpackage.hih hihVar, int i, byte[] bArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(hihVar);
        this.a = hihVar;
    }

    @Override // defpackage.zit
    public final zis a(aonj aonjVar) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.hih hihVar = this.a;
            defpackage.hii hiiVar = hihVar.b;
            return new zis(hiiVar.lE(), (aoss) hihVar.a.cb.a(), (zip) hiiVar.gz.a(), defpackage.hgu.b(), aonjVar);
        }
        defpackage.hih hihVar2 = this.a;
        if (i != 1) {
            defpackage.hii hiiVar2 = hihVar2.b;
            return new zis(hiiVar2.lE(), (aoss) hihVar2.a.cb.a(), (zip) hiiVar2.hl.a(), defpackage.hgu.b(), aonjVar);
        }
        defpackage.hii hiiVar3 = hihVar2.b;
        return new zis(hiiVar3.lE(), (aoss) hihVar2.a.cb.a(), (zip) hiiVar3.aH.a(), defpackage.hgu.b(), aonjVar);
    }

    public hif(defpackage.hih hihVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(hihVar);
        this.a = hihVar;
    }

    public hif(defpackage.hih hihVar, int i, char[] cArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(hihVar);
        this.a = hihVar;
    }
}
