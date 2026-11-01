package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahwz extends defpackage.ahxh {
    public static final defpackage.ahxn a = new defpackage.ahwz();

    public ahwz() {
        super("CharMatcher.ascii()");
    }

    @Override // defpackage.ahxn
    public final boolean c(char c) {
        return c <= 127;
    }
}
