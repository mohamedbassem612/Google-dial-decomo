package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aobj implements defpackage.aobm {
    private final /* synthetic */ int $cid;
    final /* synthetic */ int a;

    public aobj(defpackage.aobu aobuVar, int i, int i2, byte[] bArr) {
        this.$cid = i2;
        this.a = i;
        j$.util.Objects.requireNonNull(aobuVar);
    }

    @Override // defpackage.aobm
    public final void a(defpackage.aobs aobsVar) {
        int i = this.$cid;
        if (i == 0) {
            aobsVar.a.l(this.a);
        } else if (i != 1) {
            aobsVar.a.g(this.a);
        } else {
            aobsVar.a.k(this.a);
        }
    }

    public aobj(defpackage.aobu aobuVar, int i, int i2) {
        this.$cid = i2;
        this.a = i;
        j$.util.Objects.requireNonNull(aobuVar);
    }

    public aobj(defpackage.aobu aobuVar, int i, int i2, char[] cArr) {
        this.$cid = i2;
        this.a = i;
        j$.util.Objects.requireNonNull(aobuVar);
    }
}
