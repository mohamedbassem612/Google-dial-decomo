package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class afnh implements aono {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ afnh(aonn aonnVar, vx vxVar, cmw cmwVar, aono aonoVar, aomy aomyVar, int i) {
        this.$cid = i;
        this.d = aonnVar;
        this.b = vxVar;
        this.c = cmwVar;
        this.e = aonoVar;
        this.a = aomyVar;
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [aont, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int i = 18;
        if (this.$cid != 0) {
            aox aoxVar = (aox) obj;
            cav cavVar = (cav) obj2;
            int iIntValue = ((java.lang.Integer) obj3).intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= true != cavVar.B(aoxVar) ? 2 : 4;
            }
            if (cavVar.H((iIntValue & 19) != 18, iIntValue & 1)) {
                java.lang.String str = (java.lang.String) this.d.a(cavVar, 0);
                if (aoov.H(str)) {
                    avo.d("Label must not be blank");
                }
                java.lang.Object obj4 = this.a;
                ((vx) this.b).b.a(this.c, str, java.lang.Boolean.TRUE, aoxVar, this.e, obj4, cavVar, java.lang.Integer.valueOf((iIntValue << 9) & 7168));
            } else {
                cavVar.s();
            }
            return aojh.a;
        }
        cav cavVar2 = (cav) obj2;
        int iIntValue2 = ((java.lang.Integer) obj3).intValue();
        aimz aimzVar = defpackage.afny.a;
        aooh.f((defpackage.afpl) obj, "$this$VisualElement");
        int i2 = iIntValue2 & 17;
        if (cavVar2.H(i2 != 16, iIntValue2 & 1)) {
            java.lang.Object obj5 = this.d;
            ?? r11 = this.c;
            cmw cmwVarX = den.x(cmw.c, (java.lang.String) this.a);
            boolean zB = cavVar2.B((java.lang.Object) r11) | cavVar2.B(obj5);
            java.lang.Object objG = cavVar2.g();
            if (zB || objG == cau.a) {
                objG = new defpackage.abdu(r11, obj5, i, null);
                cavVar2.w(objG);
            }
            ?? r12 = this.e;
            java.lang.Object obj6 = this.b;
            bcl bclVar = (bcl) obj6;
            defpackage.afny.h(cmwVarX, bclVar, (aonj) objG, cavVar2, 0, 0);
            boolean zB2 = cavVar2.B(obj6) | cavVar2.B((java.lang.Object) r11) | cavVar2.D((java.lang.Object) r12);
            java.lang.Object objG2 = cavVar2.g();
            if (zB2 || objG2 == cau.a) {
                defpackage.xhb xhbVar = new defpackage.xhb(bclVar, r11, r12, null, 19, null);
                cavVar2.w(xhbVar);
                objG2 = xhbVar;
            }
            cbp.g(obj6, (aonn) objG2, cavVar2);
        } else {
            cavVar2.s();
        }
        return aojh.a;
    }

    public /* synthetic */ afnh(java.lang.String str, bcl bclVar, cer cerVar, aonj aonjVar, aonn aonnVar, int i) {
        this.$cid = i;
        this.a = str;
        this.b = bclVar;
        this.c = cerVar;
        this.d = aonjVar;
        this.e = aonnVar;
    }
}
