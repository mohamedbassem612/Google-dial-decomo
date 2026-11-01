package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fls {
    public static final /* synthetic */ int c = 0;
    private static final java.util.regex.Pattern d = java.util.regex.Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    private final boolean c(java.lang.String str) {
        java.util.regex.Matcher matcher = d.matcher(str);
        if (matcher.find()) {
            try {
                java.lang.String strGroup = matcher.group(1);
                java.lang.String str2 = eum.a;
                int i = java.lang.Integer.parseInt(strGroup, 16);
                int i2 = java.lang.Integer.parseInt(matcher.group(2), 16);
                if (i > 0 || i2 > 0) {
                    this.a = i;
                    this.b = i2;
                    return true;
                }
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        return false;
    }

    public final boolean a() {
        return (this.a == -1 || this.b == -1) ? false : true;
    }

    public final void b(defpackage.eqy eqyVar) {
        aike aikeVarG = eqyVar.g(defpackage.fof.class, new defpackage.evz(2));
        int i = aikeVarG.d;
        int i2 = 0;
        int i3 = 0;
        while (i3 < i) {
            boolean zC = c(((defpackage.fof) aikeVarG.get(i3)).c);
            i3++;
            if (zC) {
                return;
            }
        }
        aike aikeVarG2 = eqyVar.g(defpackage.fol.class, new defpackage.evz(3));
        int i4 = aikeVarG2.d;
        while (i2 < i4) {
            boolean zC2 = c(((defpackage.fol) aikeVarG2.get(i2)).c);
            i2++;
            if (zC2) {
                return;
            }
        }
    }
}
