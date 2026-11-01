package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abhf implements defpackage.abhg {
    public final aomy a;
    private final aomy b;
    private final boolean c;

    public abhf(aomy aomyVar, aomy aomyVar2, boolean z) {
        this.a = aomyVar;
        this.b = aomyVar2;
        this.c = z;
    }

    public final float a() {
        return ((java.lang.Number) this.b.a()).floatValue();
    }

    @Override // defpackage.abhg
    public final boolean c() {
        return this.c && a() == 0.0f;
    }
}
