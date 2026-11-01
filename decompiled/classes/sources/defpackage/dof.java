package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class dof implements defpackage.aono {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ dof(android.text.Spannable spannable, defpackage.aonp aonpVar, int i) {
        this.$cid = i;
        this.a = spannable;
        this.b = aonpVar;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    /* JADX WARN: Type inference failed for: r3v3, types: [aonp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.text.Spannable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [aonj, java.lang.Object] */
    @Override // defpackage.aono
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        long j;
        if (this.$cid != 0) {
            defpackage.cyi cyiVar = (defpackage.cyi) obj;
            defpackage.czc czcVarV = ((defpackage.cyd) obj2).v(((defpackage.dpd) obj3).a);
            if (cyiVar.dw()) {
                if (((java.lang.Boolean) this.b.a(((defpackage.alg) this.a).h())).booleanValue()) {
                    j = (((long) czcVarV.a) << 32) | (((long) czcVarV.b) & 4294967295L);
                } else {
                    j = 0;
                }
            } else {
                j = (((long) czcVarV.a) << 32) | (((long) czcVarV.b) & 4294967295L);
            }
            return cyiVar.du((int) (j >> 32), (int) (j & 4294967295L), defpackage.aokd.a, new defpackage.nm(czcVarV, 11));
        }
        defpackage.dks dksVar = (defpackage.dks) obj;
        int iIntValue = ((java.lang.Integer) obj2).intValue();
        int iIntValue2 = ((java.lang.Integer) obj3).intValue();
        defpackage.dmq dmqVar = dksVar.f;
        defpackage.dnd dndVar = dksVar.c;
        if (dndVar == null) {
            dndVar = defpackage.dnd.e;
        }
        defpackage.dmw dmwVar = dksVar.d;
        defpackage.dmw dmwVar2 = new defpackage.dmw(dmwVar != null ? dmwVar.a : 0);
        defpackage.dmx dmxVar = dksVar.e;
        this.a.setSpan(new dma((android.graphics.Typeface) this.b.a(dmqVar, dndVar, dmwVar2, new defpackage.dmx(dmxVar != null ? dmxVar.a : 65535))), iIntValue, iIntValue2, 33);
        return defpackage.aojh.a;
    }

    public /* synthetic */ dof(defpackage.aonj aonjVar, defpackage.alg algVar, int i) {
        this.$cid = i;
        this.b = aonjVar;
        this.a = algVar;
    }
}
