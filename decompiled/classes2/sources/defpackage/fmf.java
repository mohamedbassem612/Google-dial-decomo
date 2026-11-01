package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fmf extends defpackage.flp {
    private final long a;

    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    public fmf(defpackage.flk flkVar, long j) {
        super(flkVar);
        ahvr.bM((boolean) (((((defpackage.flc) flkVar).b > j ? 1 : (((defpackage.flc) flkVar).b == j ? 0 : -1)) ^ (-1)) >>> 31));
        this.a = j;
    }

    @Override // defpackage.flp, defpackage.flk
    public final long d() {
        return super.d() - this.a;
    }

    @Override // defpackage.flp, defpackage.flk
    public final long e() {
        return super.e() - this.a;
    }

    @Override // defpackage.flp, defpackage.flk
    public final long f() {
        return super.f() - this.a;
    }
}
