package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class eww extends java.lang.Thread {
    final /* synthetic */ defpackage.ewx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eww(defpackage.ewx ewxVar) {
        super("ExoPlayer:SimpleDecoder");
        j$.util.Objects.requireNonNull(ewxVar);
        this.a = ewxVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        do {
            try {
            } catch (java.lang.InterruptedException e) {
                throw new java.lang.IllegalStateException(e);
            }
        } while (this.a.o());
    }
}
