package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vjm implements defpackage.viz {
    public final android.content.Context a;
    public final aolr b;
    public final aolr c;
    public final okj d;
    public final oko e;
    private final aoss f;

    public vjm(android.content.Context context, aoss aossVar, aolr aolrVar, aolr aolrVar2, okj okjVar, oko okoVar) {
        aooh.f(context, "appContext");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(aolrVar2, "blockingContext");
        this.a = context;
        this.f = aossVar;
        this.b = aolrVar;
        this.c = aolrVar2;
        this.d = okjVar;
        this.e = okoVar;
    }

    @Override // defpackage.viz
    public final ajcq a(j$.util.Optional optional) {
        aooh.f(optional, "optionalPhoneAccountHandle");
        return b(optional);
    }

    @Override // defpackage.viz
    public final ajcq b(j$.util.Optional optional) {
        aooh.f(optional, "optionalPhoneAccountHandle");
        return aosv.F(this.f, 0, new defpackage.vjk(this, optional, null), 3);
    }

    @Override // defpackage.viz
    public final j$.util.Optional c() {
        j$.util.Optional optionalEmpty = j$.util.Optional.empty();
        aooh.e(optionalEmpty, "empty(...)");
        return optionalEmpty;
    }
}
