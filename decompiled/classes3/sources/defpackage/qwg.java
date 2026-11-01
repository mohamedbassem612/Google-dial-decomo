package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qwg implements ajas {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ amzg c;
    public final /* synthetic */ android.content.Context d;
    public final /* synthetic */ ajct e;

    public /* synthetic */ qwg(boolean z, boolean z2, amzg amzgVar, android.content.Context context, ajct ajctVar, int i) {
        this.$cid = i;
        this.a = z;
        this.b = z2;
        this.c = amzgVar;
        this.d = context;
        this.e = ajctVar;
    }

    public final ajcq a() {
        int i = this.$cid;
        boolean z = this.a;
        if (i != 0) {
            if (z || !this.b) {
                return aiql.z(j$.util.Optional.empty());
            }
            return ahvr.H(this.c.d(), new defpackage.phr(this.d, 16), this.e);
        }
        if (!z || !this.b) {
            return aiql.z(j$.util.Optional.empty());
        }
        return ahvr.H(this.c.d(), new defpackage.qgx(this.d, 8), this.e);
    }
}
