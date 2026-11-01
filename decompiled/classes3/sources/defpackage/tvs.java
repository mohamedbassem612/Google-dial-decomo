package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
abstract class tvs {
    protected static final boolean f(char c) {
        return c >= '0' && c <= '9';
    }

    public abstract aec a();

    public abstract j$.util.Optional b(char c);

    protected final j$.util.Optional c(char c) {
        return d(c) ? j$.util.Optional.of((java.lang.Character) a().get(java.lang.Character.valueOf(c))) : j$.util.Optional.empty();
    }

    protected final boolean d(char c) {
        return a().containsKey(java.lang.Character.valueOf(c));
    }

    protected final boolean e(char c) {
        return d(c) || f(c);
    }
}
