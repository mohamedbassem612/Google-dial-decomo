package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class lpl implements aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;
    public final /* synthetic */ java.lang.Object g;

    public /* synthetic */ lpl(azj azjVar, abhh abhhVar, boolean z, boolean z2, bni bniVar, bni bniVar2, int i, int i2) {
        this.$cid = i2;
        this.d = azjVar;
        this.g = abhhVar;
        this.a = z;
        this.c = z2;
        this.e = bniVar;
        this.f = bniVar2;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v5, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [azj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [cmw, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            cav cavVar = (cav) obj;
            int iIntValue = ((java.lang.Integer) obj2).intValue();
            int i2 = iIntValue & 3;
            if (cavVar.H(i2 != 2, iIntValue & 1)) {
                java.lang.Object obj3 = this.e;
                java.lang.Object obj4 = this.d;
                cmw cmwVarX = den.x(cmw.c, "menu_item");
                boolean zB = cavVar.B(obj4) | cavVar.B(obj3);
                java.lang.Object objG = cavVar.g();
                if (zB || objG == cau.a) {
                    objG = new defpackage.khx(obj4, obj3, 11);
                    cavVar.w(objG);
                }
                final ?? r14 = this.g;
                final boolean z = this.c;
                final int i3 = this.b;
                final boolean z2 = this.a;
                aaoo.U(cfo.j(-1950844993, new defpackage.lpn(this.f, z2, 0), cavVar), dig.b(cmwVarX, false, (aonj) objG), (aonn) null, cfo.j(1016137667, new aonn() { // from class: lpo
                    public final java.lang.Object a(java.lang.Object obj5, java.lang.Object obj6) {
                        cav cavVar2 = (cav) obj5;
                        int iIntValue2 = ((java.lang.Integer) obj6).intValue();
                        int i4 = iIntValue2 & 3;
                        if (cavVar2.H(i4 != 2, iIntValue2 & 1)) {
                            mni.ci(wv.i(i3, cavVar2, 6), z, z2, (cmw) null, cavVar2, 0);
                        } else {
                            cavVar2.s();
                        }
                        return aojh.a;
                    }
                }, cavVar), cfo.j(-1463342140, new aonn() { // from class: lpp
                    public final java.lang.Object a(java.lang.Object obj5, java.lang.Object obj6) {
                        cav cavVar2 = (cav) obj5;
                        int iIntValue2 = ((java.lang.Integer) obj6).intValue();
                        int i4 = iIntValue2 & 3;
                        if (cavVar2.H(i4 != 2, iIntValue2 & 1)) {
                            mni.cj(r14, z, z2, (cmw) null, cavVar2, 0);
                        } else {
                            cavVar2.s();
                        }
                        return aojh.a;
                    }
                }, cavVar), (defpackage.bqe) null, cavVar, 221190, 460);
            } else {
                cavVar.s();
            }
            return aojh.a;
        }
        if (i != 1) {
            cav cavVar2 = (cav) obj;
            ((java.lang.Integer) obj2).intValue();
            int i4 = this.b;
            java.lang.Object obj5 = this.f;
            java.lang.Object obj6 = this.e;
            boolean z3 = this.c;
            int i5 = i4 | 1;
            int i6 = 306783378 & i5;
            int i7 = 613566756 & i5;
            aehj.bo((azj) this.d, (abhh) this.g, this.a, z3, (bni) obj6, (bni) obj5, cavVar2, (i5 & (-920350135)) | i6 | (i7 >> 1) | ((i6 << 1) & i7));
            return aojh.a;
        }
        cav cavVar3 = (cav) obj;
        ((java.lang.Integer) obj2).intValue();
        int i8 = this.b;
        ?? r10 = this.g;
        ?? r9 = this.f;
        boolean z4 = this.c;
        int i9 = i8 | 1;
        int i10 = 306783378 & i9;
        int i11 = 613566756 & i9;
        defpackage.rq.r(this.a, (defpackage.bwj) this.d, this.e, z4, r9, r10, cavVar3, (i9 & (-920350135)) | i10 | (i11 >> 1) | ((i10 << 1) & i11));
        return aojh.a;
    }

    public /* synthetic */ lpl(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, boolean z2, aomy aomyVar, int i2) {
        this.$cid = i2;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.a = z;
        this.b = i;
        this.c = z2;
        this.g = aomyVar;
    }

    public /* synthetic */ lpl(boolean z, defpackage.bwj bwjVar, ccp ccpVar, boolean z2, cmw cmwVar, aonn aonnVar, int i, int i2) {
        this.$cid = i2;
        this.a = z;
        this.d = bwjVar;
        this.e = ccpVar;
        this.c = z2;
        this.f = cmwVar;
        this.g = aonnVar;
        this.b = i;
    }
}
