package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeem implements defpackage.aeee {
    public final defpackage.amwu a;
    private final defpackage.aolr b;

    static {
        defpackage.aiof.i("GnpSdk");
    }

    public aeem(defpackage.amwu amwuVar, defpackage.aolr aolrVar) {
        if (aolrVar == null) {
            defpackage.aooh.i("blockingContext");
        }
        this.a = amwuVar;
        this.b = aolrVar;
    }

    @Override // defpackage.aeee
    public final java.lang.Object a(com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentation, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.b, new rir(this, accountRepresentation, (defpackage.aoln) null, 14), aolnVar);
    }

    @Override // defpackage.aeee
    public final java.lang.Object b(com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentation, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.b, new defpackage.mbq(this, accountRepresentation, (defpackage.aoln) null, 2), aolnVar);
    }

    @Override // defpackage.aeee
    public final java.lang.Object c(defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.b, new defpackage.rot(this, (defpackage.aoln) null, 4), aolnVar);
    }

    @Override // defpackage.aeee
    public final java.lang.Object d(java.util.List list, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.b, new ryd(this, list, (defpackage.aoln) null, 11), aolnVar);
    }

    @Override // defpackage.aeee
    public final java.lang.Object e(java.util.List list, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.b, new ryd(this, list, (defpackage.aoln) null, 12, (byte[]) null), aolnVar);
    }
}
