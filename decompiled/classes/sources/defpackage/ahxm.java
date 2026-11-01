package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahxm extends defpackage.ahxh {
    static final int a = 27;
    public static final defpackage.ahxn b = new defpackage.ahxm();

    public ahxm() {
        super("CharMatcher.whitespace()");
    }

    @Override // defpackage.ahxn
    public final void b(java.util.BitSet bitSet) {
        for (int i = 0; i < 32; i++) {
            bitSet.set("\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt(i));
        }
    }

    @Override // defpackage.ahxn
    public final boolean c(char c) {
        return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c) >>> a) == c;
    }
}
