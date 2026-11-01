package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahfe {
    public static final aimz a = aimz.i("com/google/apps/tiktok/inject/account/ScreenAccountComponentManagers");
    public final amwv b;
    public final boolean c;
    public final java.lang.Object d = new java.lang.Object();
    public final java.util.Map e = new java.util.HashMap();
    public final ahgd f;

    public ahfe(ahgd ahgdVar, amwv amwvVar, defpackage.aprf aprfVar) {
        this.f = ahgdVar;
        this.b = amwvVar;
        ahyn ahynVar = (ahyn) aprfVar.a;
        boolean z = false;
        if (ahynVar.f() && (ahynVar.b() instanceof defpackage.ahee)) {
            z = true;
        }
        this.c = z;
    }

    public final java.util.Set a() {
        java.util.Set setUnmodifiableSet;
        synchronized (this.d) {
            setUnmodifiableSet = j$.util.DesugarCollections.unmodifiableSet(this.e.keySet());
        }
        return setUnmodifiableSet;
    }
}
