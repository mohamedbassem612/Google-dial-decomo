package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afdo implements defpackage.afdq {
    private final j$.util.concurrent.ConcurrentHashMap a = new j$.util.concurrent.ConcurrentHashMap();

    private final boolean c(java.lang.String str, boolean z) {
        java.lang.String str2 = (java.lang.String) j$.util.concurrent.ConcurrentMap.-EL.computeIfAbsent(this.a, str, new defpackage.vaq(17));
        return !str2.isEmpty() ? str2.equals("true") : z;
    }

    @Override // defpackage.afdq
    public final boolean a(defpackage.zzx zzxVar) {
        return c((java.lang.String) zzxVar.a, false);
    }

    @Override // defpackage.afdq
    public final boolean b(defpackage.zzx zzxVar) {
        if (c("debug.social", true)) {
            return c((java.lang.String) zzxVar.a, true);
        }
        return false;
    }
}
