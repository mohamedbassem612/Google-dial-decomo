package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xlm implements defpackage.xpa {
    public static final defpackage.xer a = new defpackage.xer(13);
    private final int b;

    public xlm(int i) {
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.xlm) && this.b == ((defpackage.xlm) obj).b;
        }
        return true;
    }

    public final int hashCode() {
        return this.b;
    }

    @Override // defpackage.xpa
    public final android.os.PersistableBundle toPersistableBundle() {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putInt("ownerIdentityHash", this.b);
        return persistableBundle;
    }

    public final java.lang.String toString() {
        return "Output(ownerIdentityHash=" + this.b + ')';
    }
}
