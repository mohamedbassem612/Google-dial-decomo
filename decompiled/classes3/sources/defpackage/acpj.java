package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class acpj implements aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;
    public final /* synthetic */ java.lang.Object g;

    public /* synthetic */ acpj(defpackage.acpk acpkVar, cmw cmwVar, float f, float f2, crd crdVar, long j, int i, int i2) {
        this.$cid = i2;
        this.e = acpkVar;
        this.f = cmwVar;
        this.a = f;
        this.b = f2;
        this.g = crdVar;
        this.c = j;
        this.d = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [cmw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [cmw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [crd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [crd, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            cav cavVar = (cav) obj;
            ((java.lang.Integer) obj2).intValue();
            int i = this.d;
            long j = this.c;
            ?? r8 = this.e;
            float f = this.b;
            float f2 = this.a;
            int i2 = i | 1;
            int i3 = 306783378 & i2;
            int i4 = 613566756 & i2;
            ((bnc) this.f).a((cmw) this.g, f2, f, (crd) r8, j, cavVar, (i2 & (-920350135)) | i3 | (i4 >> 1) | ((i3 << 1) & i4));
            return aojh.a;
        }
        cav cavVar2 = (cav) obj;
        ((java.lang.Integer) obj2).intValue();
        int i5 = this.d;
        long j2 = this.c;
        ?? r9 = this.g;
        float f3 = this.b;
        float f4 = this.a;
        int i6 = i5 | 1;
        int i7 = 306783378 & i6;
        int i8 = 613566756 & i6;
        ((defpackage.acpk) this.e).a(this.f, f4, f3, r9, j2, cavVar2, (i6 & (-920350135)) | i7 | (i8 >> 1) | ((i7 << 1) & i8));
        return aojh.a;
    }

    public /* synthetic */ acpj(bnc bncVar, cmw cmwVar, float f, float f2, crd crdVar, long j, int i, int i2) {
        this.$cid = i2;
        this.f = bncVar;
        this.g = cmwVar;
        this.a = f;
        this.b = f2;
        this.e = crdVar;
        this.c = j;
        this.d = i;
    }
}
