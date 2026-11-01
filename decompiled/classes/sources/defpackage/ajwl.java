package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ajwl implements defpackage.ajwo {
    final defpackage.zzx a;

    public ajwl(defpackage.zzx zzxVar) {
        this.a = zzxVar;
    }

    @Override // defpackage.ajwo
    public final boolean a(java.lang.Exception exc) {
        return false;
    }

    @Override // defpackage.ajwo
    public final boolean b(defpackage.ajwt ajwtVar) {
        if (!ajwtVar.e() && !ajwtVar.d() && !ajwtVar.b()) {
            return false;
        }
        this.a.i(ajwtVar.a);
        return true;
    }
}
