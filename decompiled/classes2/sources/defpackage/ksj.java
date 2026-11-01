package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ksj {
    public final java.lang.String a;
    public final int b;
    private final int c;
    private final boolean d;

    public ksj(java.lang.String str, int i) {
        aooh.f(str, "headerTitle");
        this.a = str;
        this.c = 2131231357;
        this.b = i;
        this.d = false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ksj) {
            defpackage.ksj ksjVar = (defpackage.ksj) obj;
            if (aooh.n(this.a, ksjVar.a)) {
                int i = ksjVar.c;
                if (this.b == ksjVar.b) {
                    boolean z = ksjVar.d;
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + 2131231357) * 31) + this.b) * 31) + 1237;
    }

    public final java.lang.String toString() {
        return "IntegrationResources(headerTitle=" + this.a + ", headerIconRes=2131231357, footerDisclaimerRes=" + this.b + ", shouldShowPreviewLabel=false)";
    }
}
