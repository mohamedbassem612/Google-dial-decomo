package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aoex implements defpackage.anzh {
    final /* synthetic */ defpackage.aofa a;

    public aoex(defpackage.aofa aofaVar) {
        j$.util.Objects.requireNonNull(aofaVar);
        this.a = aofaVar;
    }

    @Override // defpackage.anzh
    public final int a() {
        int i = this.a.m;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return 443;
        }
        throw new java.lang.AssertionError("TLS not handled");
    }
}
