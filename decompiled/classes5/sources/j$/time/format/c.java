package j$.time.format;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class c implements j$.time.format.e {
    public final char a;

    public c(char c) {
        this.a = c;
    }

    @Override // j$.time.format.e
    public final boolean h(j$.time.format.w wVar, java.lang.StringBuilder sb) {
        sb.append(this.a);
        return true;
    }

    @Override // j$.time.format.e
    public final int k(j$.time.format.v vVar, java.lang.CharSequence charSequence, int i) {
        char cCharAt;
        char c;
        return (i == charSequence.length() || ((cCharAt = charSequence.charAt(i)) != (c = this.a) && (vVar.b || !(java.lang.Character.toUpperCase(cCharAt) == java.lang.Character.toUpperCase(c) || java.lang.Character.toLowerCase(cCharAt) == java.lang.Character.toLowerCase(c))))) ? ~i : i + 1;
    }

    public final java.lang.String toString() {
        char c = this.a;
        if (c == '\'') {
            return "''";
        }
        return "'" + c + "'";
    }
}
