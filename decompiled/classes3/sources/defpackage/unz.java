package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class unz implements kgt {
    private final /* synthetic */ int $cid;
    private final java.lang.String a;
    private final kgs b;

    public unz(int i) {
        this.$cid = i;
        this.a = "favorites_bar_fragment_tag";
        this.b = kgs.b;
    }

    public final aw a() {
        if (this.$cid != 0) {
            defpackage.rto rtoVar = new defpackage.rto();
            amxr.g(rtoVar);
            return rtoVar;
        }
        java.lang.String[] strArr = defpackage.uoo.a;
        defpackage.uog uogVar = new defpackage.uog();
        amxr.g(uogVar);
        return uogVar;
    }

    public final kgs b() {
        return this.b;
    }

    public final java.lang.String c() {
        return this.a;
    }

    public unz(int i, byte[] bArr) {
        this.$cid = i;
        this.a = "marquee_fragment_tag";
        this.b = kgs.a;
    }
}
