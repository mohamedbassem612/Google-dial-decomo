package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aawf implements aacu {
    public static final defpackage.aawf a = new defpackage.aawf(new defpackage.amdx());
    private final android.os.Looper b;

    public aawf(defpackage.amdx amdxVar) {
        this.b = (android.os.Looper) amdxVar.a;
    }

    public final aacz a() {
        android.os.Looper looper = this.b;
        if (looper == null) {
            return aacz.a;
        }
        aacy aacyVar = new aacy();
        aacyVar.a = looper;
        return aacyVar.a();
    }

    public final boolean equals(java.lang.Object obj) {
        return obj instanceof defpackage.aawf;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{getClass()});
    }
}
