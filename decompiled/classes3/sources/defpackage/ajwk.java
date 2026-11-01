package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ajwk implements ajwo {
    private final ajwp a;
    private final zzx b;

    public ajwk(ajwp ajwpVar, zzx zzxVar) {
        this.a = ajwpVar;
        this.b = zzxVar;
    }

    public final boolean a(java.lang.Exception exc) {
        this.b.h(exc);
        return true;
    }

    public final boolean b(ajwt ajwtVar) {
        if (!ajwtVar.d() || this.a.c(ajwtVar)) {
            return false;
        }
        zzx zzxVar = this.b;
        java.lang.String str = ajwtVar.b;
        if (str == null) {
            throw new java.lang.NullPointerException("Null token");
        }
        zzxVar.g(new defpackage.ajwm(str, ajwtVar.d, ajwtVar.e));
        return true;
    }
}
