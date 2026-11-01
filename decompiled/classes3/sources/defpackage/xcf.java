package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xcf extends defpackage.xcl {
    private j$.util.OptionalInt b = j$.util.OptionalInt.empty();
    private j$.util.OptionalInt c = j$.util.OptionalInt.empty();
    public j$.util.OptionalInt a = j$.util.OptionalInt.empty();

    @Override // defpackage.xcl
    public final defpackage.xcm a() {
        return new defpackage.xcg(this.b, this.c, this.a);
    }

    @Override // defpackage.xcl
    public final void b(int i) {
        this.b = j$.util.OptionalInt.of(i);
    }

    @Override // defpackage.xcl
    public final void c(int i) {
        this.c = j$.util.OptionalInt.of(i);
    }
}
