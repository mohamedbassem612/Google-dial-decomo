package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ahcq implements defpackage.aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ ahcq(defpackage.aonp aonpVar, java.lang.String str, int i, defpackage.ahct ahctVar, defpackage.ajsy ajsyVar, int i2) {
        this.$cid = i2;
        this.b = aonpVar;
        this.c = str;
        this.a = i;
        this.d = ahctVar;
        this.e = ajsyVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v0, types: [cyi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [aonp, java.lang.Object] */
    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) {
        defpackage.akzc akzcVar;
        int iA;
        byte[] bArrD = null;
        if (this.$cid == 0) {
            byte[] bArr = (byte[]) obj;
            ?? r0 = ((defpackage.ahct) this.d).e;
            int i = this.a;
            java.lang.Object obj2 = this.e;
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
            defpackage.ajsy ajsyVar = (defpackage.ajsy) obj2;
            java.lang.String[] strArrD = defpackage.ahct.d(r0, ajsyVar);
            if (bArr != null) {
                bArrD = bArr;
            } else if (obj2 != null && (akzcVar = ajsyVar.k) != null) {
                bArrD = akzcVar.D();
            }
            return this.b.a(this.c, numValueOf, strArrD, bArrD);
        }
        defpackage.czb czbVar = (defpackage.czb) obj;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            defpackage.czc[] czcVarArr = (defpackage.czc[]) this.b;
            if (i2 >= czcVarArr.length) {
                return defpackage.aojh.a;
            }
            defpackage.czc czcVar = czcVarArr[i2];
            int i4 = i3 + 1;
            if (czcVar == null) {
                defpackage.aooh.g();
            }
            ?? r5 = this.e;
            defpackage.azg azgVarAU = defpackage.den.aU(czcVar);
            defpackage.dpq dpqVarP = r5.p();
            axe axeVar = azgVarAU != null ? azgVarAU.c : null;
            int i5 = this.a;
            if (axeVar != null) {
                iA = axeVar.a(i5, czcVar.a, dpqVarP);
            } else {
                iA = ((defpackage.awx) this.d).a.a(czcVar.a, i5, dpqVarP);
            }
            czbVar.s(czcVar, iA, ((int[]) this.c)[i3], 0.0f);
            i2++;
            i3 = i4;
        }
    }

    public /* synthetic */ ahcq(defpackage.czc[] czcVarArr, defpackage.awx awxVar, int i, defpackage.cyi cyiVar, int[] iArr, int i2) {
        this.$cid = i2;
        this.b = czcVarArr;
        this.d = awxVar;
        this.a = i;
        this.e = cyiVar;
        this.c = iArr;
    }
}
