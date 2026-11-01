package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adtu {
    public java.lang.Long a;
    private long b;
    private byte c;

    public final defpackage.aduc a() {
        if (this.c == 1) {
            return new defpackage.aduc(this.a, this.b);
        }
        throw new java.lang.IllegalStateException("Missing required properties: startTime");
    }

    public final void b(long j) {
        this.b = j;
        this.c = (byte) 1;
    }
}
