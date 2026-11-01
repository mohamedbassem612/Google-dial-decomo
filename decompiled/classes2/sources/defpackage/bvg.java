package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class bvg implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ bvg(bew bewVar, bcw bcwVar, int i, int i2, int i3) {
        this.$cid = i3;
        this.d = bewVar;
        this.c = bcwVar;
        this.a = i;
        this.b = i2;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [bcw, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj) {
        if (this.$cid != 0) {
            int iIntValue = ((java.lang.Integer) obj).intValue();
            int i = this.b;
            int i2 = this.a;
            ((bew) this.d).e((bcw) this.c, i2, i, iIntValue);
            return aojh.a;
        }
        czb czbVar = (czb) obj;
        czc czcVar = (czc) this.c;
        int i3 = czcVar.b;
        int i4 = this.a;
        czbVar.u(czcVar, 0, (i4 - i3) / 2, 0.0f);
        int i5 = czcVar.a + this.b;
        czc czcVar2 = (czc) this.d;
        czbVar.u(czcVar2, i5, (i4 - czcVar2.b) / 2, 0.0f);
        return aojh.a;
    }

    public /* synthetic */ bvg(czc czcVar, int i, czc czcVar2, int i2, int i3) {
        this.$cid = i3;
        this.c = czcVar;
        this.a = i;
        this.d = czcVar2;
        this.b = i2;
    }
}
