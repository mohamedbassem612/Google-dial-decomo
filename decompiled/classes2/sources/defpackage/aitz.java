package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aitz extends aibx {
    final /* synthetic */ ahzp a;
    final /* synthetic */ aiue b;
    private int c;
    private final ahzh d;

    public aitz(aiue aiueVar, ahzp ahzpVar) {
        this.a = ahzpVar;
        j$.util.Objects.requireNonNull(aiueVar);
        this.b = aiueVar;
        this.c = 0;
        this.d = ahzh.b(ahzpVar);
    }

    protected final /* bridge */ /* synthetic */ java.lang.Object a() {
        j$.time.Duration durationD = this.b.d(this.c, this.d.c());
        if (durationD.isNegative()) {
            b();
            return null;
        }
        this.c++;
        return durationD;
    }
}
