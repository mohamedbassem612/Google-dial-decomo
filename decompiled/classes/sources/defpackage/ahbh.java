package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahbh implements java.io.Serializable, defpackage.ahch {
    private static final long serialVersionUID = -4770846455854161599L;
    private final java.lang.String a = "com.google.android.dialer.directboot";

    private static void b(java.lang.StringBuilder sb, java.lang.String str, int i) {
        for (int length = i - str.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(str);
    }

    @Override // defpackage.ahch
    public final java.lang.String a() {
        return this.a;
    }

    @Override // java.lang.annotation.Annotation
    public final java.lang.Class annotationType() {
        return defpackage.ahch.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ahch) {
            return this.a.equals(((defpackage.ahch) obj).a());
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return this.a.hashCode() ^ 1335633679;
    }

    @Override // java.lang.annotation.Annotation
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("@com.google.apps.tiktok.experiments.phenotype.PhenotypeRuntimeProperties(");
        sb.append('\"');
        for (int i = 0; i < 36; i++) {
            char cCharAt = "com.google.android.dialer.directboot".charAt(i);
            if (cCharAt == '\t') {
                sb.append("\\t");
            } else if (cCharAt == '\n') {
                sb.append("\\n");
            } else if (cCharAt == '\r') {
                sb.append("\\r");
            } else if (cCharAt == '\"' || cCharAt == '\'' || cCharAt == '\\') {
                sb.append('\\');
                sb.append(cCharAt);
            } else if (cCharAt < ' ') {
                sb.append('\\');
                b(sb, java.lang.Integer.toOctalString(cCharAt), 3);
            } else if (cCharAt < 127 || java.lang.Character.isLetter(cCharAt)) {
                sb.append(cCharAt);
            } else {
                sb.append("\\u");
                b(sb, java.lang.Integer.toHexString(cCharAt), 4);
            }
        }
        sb.append("\")");
        return sb.toString();
    }
}
