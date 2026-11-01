package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ocz implements mlr {
    final /* synthetic */ java.lang.String a;
    final /* synthetic */ android.content.Context b;

    public ocz(java.lang.String str, android.content.Context context) {
        this.a = str;
        this.b = context;
    }

    public final void a() {
        android.content.Intent flags = new android.content.Intent("android.intent.action.SENDTO", android.net.Uri.parse("smsto:".concat(java.lang.String.valueOf(this.a)))).setFlags(268435456);
        aooh.e(flags, "setFlags(...)");
        ahqx.l(this.b, flags);
    }
}
