package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class cbi implements defpackage.aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ cbi(defpackage.cbk cbkVar, defpackage.cjb cjbVar, defpackage.ado adoVar, int i, int i2) {
        this.$cid = i2;
        this.b = cbkVar;
        this.c = cjbVar;
        this.d = adoVar;
        this.a = i;
    }

    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) {
        int iA;
        if (this.$cid == 0) {
            if (obj == this.b) {
                throw new java.lang.IllegalStateException("A derived state calculation cannot read itself");
            }
            if (obj instanceof defpackage.clr) {
                int i = this.a;
                defpackage.ado adoVar = (defpackage.ado) this.d;
                adoVar.h(obj, java.lang.Math.min(((defpackage.cjb) this.c).a - i, adoVar.c(obj, Integer.MAX_VALUE)));
            }
            return defpackage.aojh.a;
        }
        defpackage.czb czbVar = (defpackage.czb) obj;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            defpackage.czc[] czcVarArr = (defpackage.czc[]) this.c;
            if (i2 >= czcVarArr.length) {
                return defpackage.aojh.a;
            }
            defpackage.czc czcVar = czcVarArr[i2];
            int i4 = i3 + 1;
            if (czcVar == null) {
                defpackage.aooh.g();
            }
            defpackage.azg azgVarAU = defpackage.den.aU(czcVar);
            axe axeVar = azgVarAU != null ? azgVarAU.c : null;
            int i5 = this.a;
            if (axeVar != null) {
                iA = axeVar.a(i5, czcVar.b, defpackage.dpq.a);
            } else {
                iA = ((defpackage.azi) this.d).a.a(czcVar.b, i5);
            }
            czbVar.s(czcVar, ((int[]) this.b)[i3], iA, 0.0f);
            i2++;
            i3 = i4;
        }
    }

    public /* synthetic */ cbi(defpackage.czc[] czcVarArr, defpackage.azi aziVar, int i, int[] iArr, int i2) {
        this.$cid = i2;
        this.c = czcVarArr;
        this.d = aziVar;
        this.a = i;
        this.b = iArr;
    }
}
