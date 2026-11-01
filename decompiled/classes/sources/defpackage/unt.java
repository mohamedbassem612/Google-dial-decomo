package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class unt {
    public final boolean a;

    public unt(boolean z) {
        this.a = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.unt) && this.a == ((defpackage.unt) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return defpackage.anty.L(this.a);
    }

    public final java.lang.String toString() {
        return "FavoritesBarSettingsModel(hideContacts=" + this.a + ')';
    }
}
