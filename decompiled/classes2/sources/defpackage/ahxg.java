package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ahxg extends ahxh {
    public static final ahxn a = new defpackage.ahxg();

    private ahxg() {
        super("CharMatcher.javaIsoControl()");
    }

    public final boolean c(char c) {
        if (c > 31) {
            return c >= 127 && c <= 159;
        }
        return true;
    }
}
