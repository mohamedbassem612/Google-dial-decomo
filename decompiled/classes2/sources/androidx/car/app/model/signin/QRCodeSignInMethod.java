package androidx.car.app.model.signin;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class QRCodeSignInMethod implements defpackage.zs {
    private final android.net.Uri mUri;

    public QRCodeSignInMethod(android.net.Uri uri) {
        this.mUri = (android.net.Uri) j$.util.Objects.requireNonNull(uri);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.signin.QRCodeSignInMethod) {
            return j$.util.Objects.equals(this.mUri, ((androidx.car.app.model.signin.QRCodeSignInMethod) obj).mUri);
        }
        return false;
    }

    public android.net.Uri getUri() {
        return (android.net.Uri) j$.util.Objects.requireNonNull(this.mUri);
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mUri});
    }

    private QRCodeSignInMethod() {
        this.mUri = null;
    }
}
