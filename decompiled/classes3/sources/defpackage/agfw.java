package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agfw {
    private static final xtq e = new xtq("FooterBarMixinMetrics", (byte[]) null);
    public java.lang.String a = "Unknown";
    public java.lang.String b = "Unknown";
    public java.lang.String c = "Unknown";
    public final java.util.List d = new java.util.ArrayList();

    public static java.lang.String a(java.lang.String str, boolean z) {
        if (!"VisibleUsingXml".equals(str) && !"Visible".equals(str) && !"Invisible".equals(str)) {
            e.B("Illegal visibility state: ".concat(java.lang.String.valueOf(str)));
        }
        if (z) {
            return "Invisible".equals(str) ? "Invisible_to_Visible" : str;
        }
        if ("VisibleUsingXml".equals(str)) {
            return "VisibleUsingXml_to_Invisible";
        }
        return "Visible".equals(str) ? "Visible_to_Invisible" : str;
    }

    public static final java.lang.String e(boolean z, boolean z2) {
        if (z) {
            return true != z2 ? "Visible" : "VisibleUsingXml";
        }
        return "Invisible";
    }

    public final void b(int i) {
        this.d.add(java.lang.String.valueOf(i));
    }

    public final void c(boolean z, boolean z2) {
        this.a = this.a.equals("Unknown") ? e(z, z2) : this.a;
    }

    public final void d(boolean z, boolean z2) {
        this.b = this.b.equals("Unknown") ? e(z, z2) : this.b;
    }
}
