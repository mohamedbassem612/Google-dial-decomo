package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ajzy {
    public static final anma a = new anma("com.google.frameworks.client.data.android.auth.AuthContext", (java.lang.Object) null);
    public final java.lang.String b;
    public final java.lang.String c;

    public ajzy(java.lang.String str) {
        this.b = str;
        this.c = "google";
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ajzy) {
            defpackage.ajzy ajzyVar = (defpackage.ajzy) obj;
            java.lang.String str = this.b;
            if (str != null ? str.equals(ajzyVar.b) : ajzyVar.b == null) {
                if (this.c.equals(ajzyVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.b;
        return ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003;
    }

    public final java.lang.String toString() {
        return "AuthContext{identifier=" + this.b + ", type=" + this.c + ", gaiaObfuscatedId=null}";
    }

    public ajzy() {
        throw null;
    }
}
