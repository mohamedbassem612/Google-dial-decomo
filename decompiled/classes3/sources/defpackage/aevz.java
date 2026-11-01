package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aevz {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final boolean e;
    private final defpackage.aevr f;
    private final defpackage.aevt g;
    private final defpackage.aevw h;

    public aevz(android.content.Context context, java.lang.String str, ahyn ahynVar) {
        java.lang.String packageName = context.getPackageName();
        defpackage.aevr aevrVar = defpackage.aevr.a;
        defpackage.aevt aevtVar = defpackage.aevt.a;
        defpackage.aevw aevwVar = defpackage.aevw.a;
        java.lang.Boolean.FALSE.booleanValue();
        boolean zBooleanValue = ((java.lang.Boolean) ((ahys) ahynVar).a).booleanValue();
        this.d = str;
        this.f = aevrVar;
        this.g = aevtVar;
        this.h = aevwVar;
        this.e = zBooleanValue;
        this.a = "com.google.android.libraries.performance.primes#".concat(java.lang.String.valueOf(packageName));
        this.b = "com.google.android.client_error_logging#".concat(java.lang.String.valueOf(packageName));
        this.c = "com.google.android.gms.clearcut_client#".concat(java.lang.String.valueOf(packageName));
    }

    public final ajcq a() {
        ahwt ahwtVar = ahwt.a;
        ajcq ajcqVarZ = aiql.z(ahwtVar);
        ajcq ajcqVarZ2 = aiql.z(aike.a);
        ajcq ajcqVarZ3 = aiql.z(ahwtVar);
        return aiql.Z(new ajcq[]{ajcqVarZ, ajcqVarZ2, ajcqVarZ3}).b(new defpackage.ajzz(this, ajcqVarZ, ajcqVarZ2, ajcqVarZ3, 1), ajbm.a);
    }
}
