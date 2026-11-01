package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hgx {
    public final defpackage.yx a;
    public boolean b;
    public androidx.car.app.model.Action c;
    public final java.util.List d = new java.util.ArrayList();
    public com.android.car.libraries.apphost.external.model.GoogleTabContents e;
    public java.lang.String f;

    public hgx(defpackage.zd zdVar) {
        this.a = androidx.car.app.model.TabCallbackDelegateImpl.create((defpackage.zd) j$.util.Objects.requireNonNull(zdVar));
    }

    public final com.android.car.libraries.apphost.external.model.GoogleTabTemplate a() {
        boolean z = false;
        if (this.e != null && !this.d.isEmpty()) {
            z = true;
        }
        boolean z2 = this.b;
        if (z2) {
            if (z) {
                throw new java.lang.IllegalStateException("Template is in a loading state but tabs are added");
            }
        } else if (!z) {
            throw new java.lang.IllegalStateException("Template is not in a loading state but does not contain tabs or tab contents");
        }
        if (z && this.f == null) {
            throw new java.lang.IllegalStateException("Template requires setting content ID for the active tab when not in Loading state");
        }
        if (z2 || this.c != null) {
            return new com.android.car.libraries.apphost.external.model.GoogleTabTemplate(this);
        }
        throw new java.lang.IllegalArgumentException("Template requires a Header Action of TYPE_APP_ICON when not in Loading state");
    }
}
