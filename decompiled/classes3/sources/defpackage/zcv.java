package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zcv {
    public static final anma a = new anma("com.android.dialer.grpc.DialerOAuthStrategy", (java.lang.Object) null);
    final j$.util.Optional b;
    final int c;

    private zcv(int i, j$.util.Optional optional) {
        this.c = i;
        this.b = optional;
    }

    public static defpackage.zcv a() {
        return new defpackage.zcv(2, j$.util.Optional.empty());
    }

    public static defpackage.zcv b(android.accounts.Account account) {
        return new defpackage.zcv(3, j$.util.Optional.of(account));
    }
}
