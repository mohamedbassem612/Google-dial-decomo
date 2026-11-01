package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahjw extends defpackage.ahjt {
    public final java.lang.String a = "oauth2:https://www.googleapis.com/auth/photos.image.readonly";

    @Override // defpackage.ahjt
    public final java.lang.String a() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ahjt) {
            return this.a.equals(((defpackage.ahjt) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        return "AuthTokenManagerConfig{scope=" + this.a + '}';
    }
}
