package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ahzb extends ahwu {
    final /* synthetic */ java.lang.String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahzb(ahzf ahzfVar, java.lang.CharSequence charSequence, java.lang.String str) {
        super(ahzfVar, charSequence);
        this.g = str;
    }

    public final int a(int i) {
        return i + this.g.length();
    }

    public final int b(int i) {
        java.lang.CharSequence charSequence = this.b;
        java.lang.String str = this.g;
        int length = str.length();
        int length2 = charSequence.length() - length;
        while (i <= length2) {
            for (int i2 = 0; i2 < length; i2++) {
                if (charSequence.charAt(i2 + i) != str.charAt(i2)) {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }
}
