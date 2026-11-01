package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aobi implements defpackage.aobm {
    private final /* synthetic */ int $cid;

    public aobi(defpackage.aobu aobuVar, int i, byte[] bArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aobuVar);
    }

    @Override // defpackage.aobm
    public final void a(defpackage.aobs aobsVar) {
        int i = this.$cid;
        if (i == 0) {
            aobsVar.a.e();
        } else if (i != 1) {
            aobsVar.a.f();
        } else {
            aobsVar.a.d();
        }
    }

    public aobi(defpackage.aobu aobuVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aobuVar);
    }

    public aobi(defpackage.aobu aobuVar, int i, char[] cArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aobuVar);
    }
}
