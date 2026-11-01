package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class airb extends java.lang.RuntimeException {
    public airb(java.lang.String str) {
        super(str);
    }

    public static defpackage.airb a(java.lang.String str, java.lang.String str2, int i) {
        return new defpackage.airb(d(str, str2, i, i + 1));
    }

    public static defpackage.airb b(java.lang.String str, java.lang.String str2, int i, int i2) {
        return new defpackage.airb(d(str, str2, i, i2));
    }

    public static defpackage.airb c(java.lang.String str, java.lang.String str2, int i) {
        return new defpackage.airb(d(str, str2, i, -1));
    }

    private static java.lang.String d(java.lang.String str, java.lang.String str2, int i, int i2) {
        if (i2 < 0) {
            i2 = str2.length();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        sb.append(": ");
        if (i > 8) {
            sb.append("...");
            sb.append((java.lang.CharSequence) str2, i - 5, i);
        } else {
            sb.append((java.lang.CharSequence) str2, 0, i);
        }
        sb.append('[');
        sb.append(str2.substring(i, i2));
        sb.append(']');
        if (str2.length() - i2 > 8) {
            sb.append((java.lang.CharSequence) str2, i2, i2 + 5);
            sb.append("...");
        } else {
            sb.append((java.lang.CharSequence) str2, i2, str2.length());
        }
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final synchronized java.lang.Throwable fillInStackTrace() {
        return this;
    }
}
