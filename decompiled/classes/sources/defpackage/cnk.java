package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cnk {
    private final android.content.Context a;
    private android.view.autofill.AutofillManager b;

    public cnk(android.content.Context context) {
        this.a = context;
    }

    public final android.view.autofill.AutofillManager a() {
        android.view.autofill.AutofillManager autofillManagerM = this.b;
        if (autofillManagerM == null) {
            autofillManagerM = aa$.ExternalSyntheticApiModelOutline0.m(this.a.getSystemService(aa$.ExternalSyntheticApiModelOutline0.m$1()));
            if (autofillManagerM == null) {
                throw new java.lang.IllegalStateException("Could not locate AutofillManager from context");
            }
            this.b = autofillManagerM;
        }
        return autofillManagerM;
    }

    public final void b(android.view.View view, int i, android.view.autofill.AutofillValue autofillValue) {
        aa$.ExternalSyntheticApiModelOutline0.m(a(), view, i, autofillValue);
    }

    public final void c(android.view.View view, int i, boolean z) {
        cnk$.ExternalSyntheticApiModelOutline0.m(a(), view, i, z);
    }
}
