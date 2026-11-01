package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acjt implements defpackage.acim {
    public static final aiof a = aiof.i("GnpSdk");
    public final android.content.Context b;
    public final defpackage.wsk c;
    private final aolr d;

    public acjt(android.content.Context context, defpackage.wsk wskVar, aolr aolrVar) {
        aooh.f(context, "context");
        aooh.f(wskVar, "gnpMediaManager");
        aooh.f(aolrVar, "lightweightContext");
        this.b = context;
        this.c = wskVar;
        this.d = aolrVar;
    }

    @Override // defpackage.acim
    public final java.lang.Object a(akjh akjhVar, aoln aolnVar) {
        return aoov.aj(this.d, new defpackage.tgn(akjhVar, this, (aoln) null, 15), aolnVar);
    }

    @Override // defpackage.acim
    public final java.lang.Object b(akjh akjhVar, aoln aolnVar) {
        return aoov.aj(this.d, new defpackage.tgn(akjhVar, this, (aoln) null, 16, (byte[]) null), aolnVar);
    }
}
