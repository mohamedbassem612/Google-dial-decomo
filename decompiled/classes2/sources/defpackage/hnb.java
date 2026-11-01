package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hnb implements defpackage.hqs {
    public final uqc a;
    public final aoxh b;
    private final ojo c;
    private final aolr d;

    public hnb(ojo ojoVar, uqc uqcVar, aolr aolrVar) {
        aooh.f(ojoVar, "dialerContentResolver");
        aooh.f(uqcVar, "speedDialUiItemMutator");
        aooh.f(aolrVar, "lightweightContext");
        this.c = ojoVar;
        this.a = uqcVar;
        this.d = aolrVar;
        android.net.Uri uri = android.provider.ContactsContract.Contacts.CONTENT_URI;
        aooh.e(uri, "CONTENT_URI");
        this.b = new defpackage.hlh(ojoVar.k(uri), this, 3);
    }

    @Override // defpackage.hqs
    public final aoxh a() {
        return this.b;
    }

    public final java.lang.Object b(aoln aolnVar) {
        return aoov.aj(this.d, new defpackage.dqx(this, (aoln) null, 3), aolnVar);
    }
}
