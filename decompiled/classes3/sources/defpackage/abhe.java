package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abhe implements defpackage.abhg, abhb {
    private final aomy a;
    private final aomy b;
    private final boolean c;

    public /* synthetic */ abhe(aomy aomyVar, int i) {
        this(aomyVar, (i & 2) != 0 ? new uoq(13) : null, (i & 4) != 0);
    }

    public final float a() {
        return ((java.lang.Number) this.b.a()).floatValue();
    }

    public final float b() {
        return ((java.lang.Number) this.a.a()).floatValue();
    }

    @Override // defpackage.abhg
    public final boolean c() {
        return this.c && b() == 1.0f;
    }

    public abhe(aomy aomyVar, aomy aomyVar2, boolean z) {
        aooh.f(aomyVar2, "alphaProvider");
        this.a = aomyVar;
        this.b = aomyVar2;
        this.c = z;
    }
}
