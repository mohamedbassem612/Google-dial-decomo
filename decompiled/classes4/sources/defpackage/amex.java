package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class amex implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ alqd a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ amex(alqd alqdVar, java.lang.String str, int i) {
        this.$cid = i;
        this.a = alqdVar;
        this.b = str;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        int i = this.$cid;
        if (i == 0) {
            return this.a.c((java.lang.String) ((defpackage.amey) this.b).g.orElse("am_cache.data"));
        }
        if (i == 1) {
            return this.a.b(defpackage.amey.a((java.lang.String) ((defpackage.amey) this.b).e.orElse("vocab.txt")));
        }
        java.lang.Object obj = this.b;
        if (i != 2) {
            return this.a.e(defpackage.amey.a((java.lang.String) obj));
        }
        return this.a.b(defpackage.amey.a((java.lang.String) ((defpackage.amey) obj).f.orElse("ep_words.txt")));
    }

    public /* synthetic */ amex(defpackage.amey ameyVar, alqd alqdVar, int i) {
        this.$cid = i;
        this.b = ameyVar;
        this.a = alqdVar;
    }
}
