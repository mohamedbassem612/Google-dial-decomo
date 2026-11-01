package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aoqt implements aoql {
    private final /* synthetic */ int $cid;
    public final aoql a;
    public final aonj b;

    public aoqt(aoql aoqlVar, aonj aonjVar, int i) {
        this.$cid = i;
        this.a = aoqlVar;
        this.b = aonjVar;
    }

    public final java.util.Iterator a() {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? new defpackage.aoqu(this) : new defpackage.aoqe(new aoqh(this.a), this.b);
        }
        return new defpackage.aoqs(this);
    }
}
