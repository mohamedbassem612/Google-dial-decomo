package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hgv {
    public androidx.car.app.model.CarText a;
    public androidx.car.app.model.CarIcon b;
    public java.lang.String c;

    public final com.android.car.libraries.apphost.external.model.GoogleTab a() {
        if (this.c != null) {
            return new com.android.car.libraries.apphost.external.model.GoogleTab(this);
        }
        throw new java.lang.IllegalStateException("A content ID must be set for the tab");
    }

    public final void b(java.lang.String str) {
        this.c = (java.lang.String) j$.util.Objects.requireNonNull(str);
    }

    public final void c(java.lang.CharSequence charSequence) {
        this.a = charSequence == null ? null : androidx.car.app.model.CarText.create((java.lang.CharSequence) j$.util.Objects.requireNonNull(charSequence));
    }
}
