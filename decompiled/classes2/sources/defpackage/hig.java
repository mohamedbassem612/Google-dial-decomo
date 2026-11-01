package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class hig implements defpackage.zim {
    private final /* synthetic */ int $cid;
    final /* synthetic */ defpackage.hih a;

    public hig(defpackage.hih hihVar, int i, byte[] bArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(hihVar);
        this.a = hihVar;
    }

    @Override // defpackage.zim
    public final zil a(aonj aonjVar) {
        int i = this.$cid;
        if (i != 0) {
            defpackage.hih hihVar = this.a;
            return i != 1 ? new zil(hihVar.b.bc(), aonjVar) : new zil(hihVar.b.ba(), aonjVar);
        }
        defpackage.hii hiiVar = this.a.b;
        zzx zzxVarB = defpackage.hgu.b();
        zzx zzxVar = new zzx(hiiVar.iA);
        defpackage.him himVar = hiiVar.a;
        return new zil(new zij(zzxVarB, zzxVar, (apni) himVar.eY.a(), (aoss) himVar.cb.a()), aonjVar);
    }

    public hig(defpackage.hih hihVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(hihVar);
        this.a = hihVar;
    }

    public hig(defpackage.hih hihVar, int i, char[] cArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(hihVar);
        this.a = hihVar;
    }
}
