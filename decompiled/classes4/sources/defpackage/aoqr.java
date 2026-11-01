package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aoqr implements aoql {
    private final /* synthetic */ int $cid;
    public final java.lang.Object a;

    public aoqr(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final java.util.Iterator a() {
        return this.$cid != 0 ? new defpackage.aomu(this) : new defpackage.aoqq(this, 0);
    }
}
