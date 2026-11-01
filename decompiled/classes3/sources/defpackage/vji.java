package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vji implements defpackage.vja {
    public final android.content.Context a;
    public final aolr b;
    public final zrw c;
    private final aoss d;

    public vji(android.content.Context context, aoss aossVar, aolr aolrVar, zrw zrwVar) {
        aooh.f(context, "appContext");
        aooh.f(aossVar, "blockingScope");
        aooh.f(aolrVar, "blockingContext");
        this.a = context;
        this.d = aossVar;
        this.b = aolrVar;
        this.c = zrwVar;
    }

    @Override // defpackage.vja
    public final ajcq a(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        aooh.f(phoneAccountHandle, "phoneAccountHandle");
        return aosv.F(this.d, 0, new ung(this, (aoln) null, 4, (byte[]) null), 3);
    }

    @Override // defpackage.vja
    public final ajcq b(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        aooh.f(phoneAccountHandle, "phoneAccountHandle");
        return aosv.F(this.d, 0, new ung(this, (aoln) null, 5, (char[]) null), 3);
    }

    public final java.lang.Object c(boolean z, aoln aolnVar) {
        return aoov.aj(this.b, new jcm(z, this, (aoln) null, 7), aolnVar);
    }
}
