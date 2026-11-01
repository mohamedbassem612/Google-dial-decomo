package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acdp implements defpackage.acdj {
    private final j$.util.concurrent.ConcurrentHashMap a = new j$.util.concurrent.ConcurrentHashMap();

    static {
        aiof.i("GnpSdk");
    }

    @Override // defpackage.acdj
    public final java.util.List a(com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentation) {
        java.util.List listBZ;
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = (java.util.concurrent.CopyOnWriteArraySet) this.a.get(accountRepresentation);
        return (copyOnWriteArraySet == null || (listBZ = ajsz.bZ(copyOnWriteArraySet)) == null) ? aokc.a : listBZ;
    }

    @Override // defpackage.acdj
    public final void b(com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentation, acdl acdlVar) {
        aooh.f(acdlVar, "context");
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = (java.util.concurrent.CopyOnWriteArraySet) this.a.get(accountRepresentation);
        if (copyOnWriteArraySet != null) {
            copyOnWriteArraySet.remove(acdlVar);
            acba acbaVar = acdlVar.a;
        }
    }

    @Override // defpackage.acdj
    public final void c() {
    }
}
