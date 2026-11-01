package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class op {
    private final android.content.IntentSender a;
    private int b;
    private int c;

    public op(android.content.IntentSender intentSender) {
        aooh.f(intentSender, "intentSender");
        this.a = intentSender;
    }

    public final androidx.activity.result.IntentSenderRequest a() {
        return new androidx.activity.result.IntentSenderRequest(this.a, null, this.b, this.c);
    }

    public final void b(int i, int i2) {
        this.c = i;
        this.b = i2;
    }
}
