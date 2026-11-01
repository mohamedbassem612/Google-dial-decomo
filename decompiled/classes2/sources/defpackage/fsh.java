package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fsh implements defpackage.frj {
    private final java.util.List a;

    public fsh(java.util.List list) {
        this.a = list;
    }

    @Override // defpackage.frj
    public final int a() {
        return 1;
    }

    @Override // defpackage.frj
    public final int b(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // defpackage.frj
    public final long c(int i) {
        ahvr.bM(i == 0);
        return 0L;
    }

    @Override // defpackage.frj
    public final java.util.List e(long j) {
        return j >= 0 ? this.a : java.util.Collections.EMPTY_LIST;
    }
}
