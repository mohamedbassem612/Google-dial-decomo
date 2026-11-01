package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class bgf implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ bgf(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v11, types: [bgw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v26, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v29, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v34, types: [dan, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v39, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v44, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v51, types: [bgw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v53, types: [bgw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [ccp, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj) {
        java.lang.Boolean boolA;
        defpackage.ali aliVar;
        byte[] bArr = null;
        boolean z = false;
        switch (this.$cid) {
            case 0:
                return mni.bi((java.util.List) this.a, (czb) obj);
            case 1:
                defpackage.cne cneVar = (defpackage.cne) obj;
                java.lang.Object obj2 = this.a;
                if (((amk) obj2).a && (boolA = cneVar.a()) != null) {
                    boolA.booleanValue();
                    ((defpackage.bfw) obj2).k.a(boolA);
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case 2:
                defpackage.bjm bjmVar = (defpackage.bjm) obj;
                this.a.b(bjmVar.c ? bjmVar.b : bjmVar.a);
                return aojh.a;
            case 3:
                java.util.List list = (java.util.List) obj;
                ?? r8 = this.a;
                if (r8 != 0) {
                    r8.b(list);
                }
                return aojh.a;
            case 4:
                this.a.c(((cpm) obj).a, defpackage.bkr.a);
                return aojh.a;
            case 5:
                android.view.View view = ((defpackage.bhq) this.a).a;
                aomy aomyVar = (aomy) obj;
                android.os.Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == android.os.Looper.myLooper()) {
                    aomyVar.a();
                } else {
                    android.os.Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new defpackage.jd(aomyVar, 14, bArr));
                    }
                }
                return aojh.a;
            case 6:
                android.view.ActionMode actionMode = ((defpackage.bhq) this.a).f;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return aojh.a;
            case 7:
                android.view.ActionMode actionMode2 = ((defpackage.bhq) this.a).f;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return aojh.a;
            case 8:
                this.a.b((cxi) obj);
                return aojh.a;
            case 9:
                java.lang.Object obj3 = this.a;
                ((defpackage.bhq) obj3).c.d();
                aliVar = new defpackage.ali(obj3, 2);
                break;
            case 10:
                this.a.b((cxi) obj);
                return aojh.a;
            case 11:
                csj csjVar = (csj) obj;
                cqf cqfVarB = csjVar.q().b();
                int iIntBitsToFloat = (int) java.lang.Float.intBitsToFloat((int) (csjVar.o() >> 32));
                int iIntBitsToFloat2 = (int) java.lang.Float.intBitsToFloat((int) (csjVar.o() & 4294967295L));
                android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) this.a;
                drawable.setBounds(0, 0, iIntBitsToFloat, iIntBitsToFloat2);
                drawable.draw(cpr.a(cqfVarB));
                return aojh.a;
            case 12:
                vx vxVar = (vx) obj;
                ?? r9 = this.a;
                defpackage.bih bihVar = (defpackage.bih) r9;
                ccp ccpVar = bihVar.c;
                aonn aonnVar = bihVar.a;
                android.content.Context context = (android.content.Context) ccpVar.a();
                if (context == null) {
                    context = (android.content.Context) cfo.G((dan) r9, dep.b);
                }
                aonnVar.a(vxVar, context);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                ddh ddhVar = (ddh) obj;
                if (ddhVar instanceof defpackage.bif) {
                    this.a.a(((defpackage.bif) ddhVar).a);
                    return java.lang.Boolean.TRUE;
                }
                if (!(ddhVar instanceof defpackage.bii)) {
                    throw new java.lang.IllegalStateException("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                }
                throw null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                ((aonj) obj).a(this.a);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                aliVar = new defpackage.ali(this.a, 3);
                break;
            case 16:
                this.a.b((cxi) obj);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                aliVar = new defpackage.ali(this.a, 4);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                defpackage.cvm cvmVar = (defpackage.cvm) obj;
                long j = cvmVar.c;
                defpackage.bjj bjjVar = (defpackage.bjj) this.a;
                cxi cxiVar = (cxi) bjjVar.c.a();
                if (cxiVar != null) {
                    defpackage.blz blzVar = bjjVar.d;
                    if (cxiVar.u() && bjjVar.b()) {
                        if (blzVar.g(cxiVar, j, bjjVar.a, defpackage.bkr.a, false)) {
                            bjjVar.a = j;
                        }
                        cvmVar.b();
                    }
                } else {
                    cvmVar.b();
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                defpackage.cvm cvmVar2 = (defpackage.cvm) obj;
                this.a.b(uu.x(cvmVar2));
                cvmVar2.b();
                return aojh.a;
            default:
                defpackage.cvm cvmVar3 = (defpackage.cvm) obj;
                this.a.b(uu.x(cvmVar3));
                cvmVar3.b();
                return aojh.a;
        }
        return aliVar;
    }
}
