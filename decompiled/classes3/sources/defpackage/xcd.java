package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class xcd extends defpackage.xci {
    private int a;
    private j$.util.Optional b = j$.util.Optional.empty();
    private byte c;

    @Override // defpackage.xci
    public final defpackage.xcj a() {
        if (this.c == 1) {
            return new defpackage.xce(this.a, this.b);
        }
        throw new java.lang.IllegalStateException("Missing required properties: ringtoneRes");
    }

    @Override // defpackage.xci
    public final void b(int i) {
        this.a = i;
        this.c = (byte) 1;
    }

    @Override // defpackage.xci
    public final void c(android.os.VibrationEffect vibrationEffect) {
        this.b = j$.util.Optional.of(vibrationEffect);
    }
}
