package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lxa {
    public static final aimz a = aimz.i("com/android/dialer/contactsearch/SearchResultDataMapper");
    public final android.content.Context b;
    public final nwu c;
    public final aoin d;
    public final aoin e;
    public final aonj f;
    public final aonj g;
    public final zjm h;
    public final zjm i;
    public final ahbv j;
    private final aolr k;

    public lxa(android.content.Context context, zjm zjmVar, zjm zjmVar2, nwu nwuVar, ahbv ahbvVar, aolr aolrVar, aoin aoinVar, aoin aoinVar2) {
        aooh.f(context, "context");
        aooh.f(nwuVar, "meetCallController");
        aooh.f(aolrVar, "backgroundContext");
        aooh.f(aoinVar, "enableMeetApiIntegration");
        aooh.f(aoinVar2, "enableAppSearchContactSearch");
        this.b = context;
        this.h = zjmVar;
        this.i = zjmVar2;
        this.c = nwuVar;
        this.j = ahbvVar;
        this.k = aolrVar;
        this.d = aoinVar;
        this.e = aoinVar2;
        this.f = new aiuo(new defpackage.kqu(this, (aoln) null, 4));
        this.g = new aiuo(new defpackage.kqu(this, (aoln) null, 5, (byte[]) null));
    }

    public final java.lang.Object a(tfn tfnVar, aoln aolnVar) {
        return aoov.aj(this.k, new defpackage.lwy(tfnVar, this, null), aolnVar);
    }

    public final java.lang.Object b(tin tinVar, tej tejVar, int i, java.lang.Long l, aoln aolnVar) {
        return aoov.aj(this.k, new defpackage.lwz(tejVar, this, tinVar, l, i, null), aolnVar);
    }
}
