package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iap implements defpackage.hzq {
    public final aoin a;
    private final ajcu b;
    private volatile boolean c;

    public iap(aoin aoinVar, ajcu ajcuVar) {
        this.a = aoinVar;
        this.b = ajcuVar;
    }

    @Override // defpackage.hzq
    public final ajcq e(boolean z) {
        this.c = z;
        return ahvr.E(new defpackage.gql(this, z, 2), this.b);
    }

    @Override // defpackage.hzq
    public final boolean f() {
        return this.c;
    }
}
