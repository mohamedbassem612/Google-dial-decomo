package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hrv {
    private j$.util.Optional b = j$.util.Optional.empty();
    private j$.util.Optional c = j$.util.Optional.empty();
    private j$.util.Optional d = j$.util.Optional.empty();
    public j$.util.Optional a = j$.util.Optional.empty();

    public final defpackage.hrw a() {
        return new defpackage.hrw(this.b, this.c, this.d, this.a);
    }

    public final void b(java.util.function.Consumer consumer) {
        this.d = j$.util.Optional.of(consumer);
    }

    public final void c(defpackage.hru hruVar) {
        this.c = j$.util.Optional.of(hruVar);
    }

    public final void d(java.util.function.Consumer consumer) {
        this.b = j$.util.Optional.of(consumer);
    }
}
