package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class bly implements defpackage.aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ bly(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [aowv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v26, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v37, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v41, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v46, types: [android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v5, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v7, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v12, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v14, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v16, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v30, types: [android.view.accessibility.AccessibilityManager] */
    /* JADX WARN: Type inference failed for: r1v14, types: [azz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r2v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r2v1, types: [dpf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r8v10, types: [cer, java.lang.Object] */
    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) {
        byn bynVar;
        int i = 2;
        ?? r2 = 0;
        boolean z = false;
        switch (this.$cid) {
            case 0:
                bhi bhiVar = (bhi) obj;
                this.a.a();
                ?? r13 = this.b;
                if (r13 == 0 || ((java.lang.Boolean) r13.a()).booleanValue()) {
                    bhiVar.a();
                }
                break;
            case 1:
                bko bkoVar = (bko) obj;
                ((blw) this.a).t(bkoVar);
                this.b.a(bkoVar);
                return defpackage.aojh.a;
            case 2:
                long j = ((defpackage.dpk) obj).a;
                float fB = defpackage.dpk.b(j);
                ?? r3 = this.b;
                this.a.b(new defpackage.dpp((((long) r3.dp(fB)) << 32) | (((long) r3.dp(defpackage.dpk.a(j))) & 4294967295L)));
                return defpackage.aojh.a;
            case 3:
                defpackage.vx vxVar = (defpackage.vx) obj;
                vxVar.m();
                java.lang.Object obj2 = this.b;
                bgv bgvVar = bgv.b;
                blw blwVar = (blw) obj2;
                boolean zB = blwVar.B();
                bll bllVar = new bll(obj2, 5);
                android.content.Context context = (android.content.Context) this.a;
                li.l(vxVar, context, bgvVar, zB, (defpackage.aomy) null, bllVar);
                blz blzVar = blwVar.a;
                bgv bgvVar2 = bgv.d;
                java.util.List listC = blzVar.c(blwVar.k());
                if (listC.isEmpty()) {
                    z = true;
                } else {
                    int size = listC.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        bke bkeVar = (bke) listC.get(i2);
                        defpackage.dji djiVarH = bkeVar.h();
                        if (djiVarH.a() != 0) {
                            bko bkoVar2 = (bko) blzVar.b().a(bkeVar.a);
                            if (bkoVar2 != null) {
                                if (java.lang.Math.abs(bkoVar2.a.a - bkoVar2.b.a) == djiVarH.a()) {
                                }
                            }
                        }
                    }
                    z = true;
                }
                li.l(vxVar, context, bgvVar2, !z, new bll(obj2, 6), new bll(obj2, 7));
                vxVar.m();
                return defpackage.aojh.a;
            case 4:
                return new anz(new bln((defpackage.aomy) obj, 9), new defpackage.bly(this.b, this.a, i, r2), aol.a);
            case 5:
                return defpackage.pf.l((btt) this.a, this.b);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return defpackage.pf.l((btt) this.a, this.b);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return defpackage.pf.l((btt) this.a, this.b);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.csj csjVar = (defpackage.csj) obj;
                float fDl = csjVar.dl(2.0f);
                ?? r8 = this.a;
                float f = fDl / 2.0f;
                defpackage.den.R(csjVar, defpackage.a.F(r8), csjVar.dl(10.0f) - f, 0L, new defpackage.csm(fDl, 0.0f, 0, 0, 30), 108);
                ?? r14 = this.b;
                if (defpackage.dpi.a(rm.v((defpackage.cer) r14), 0.0f) > 0) {
                    defpackage.den.R(csjVar, defpackage.a.F(r8), csjVar.dl(rm.v((defpackage.cer) r14)) - f, 0L, defpackage.csl.a, 108);
                }
                return defpackage.aojh.a;
            case 9:
                ((byt) this.b).a.b(new axf((defpackage.azz) this.a, (defpackage.azz) obj));
                return defpackage.aojh.a;
            case 10:
                defpackage.diq diqVar = (defpackage.diq) obj;
                defpackage.dfb.r(diqVar, 1.0f);
                java.lang.Object obj3 = this.a;
                if (obj3 != null) {
                    defpackage.dfb.j(diqVar, (java.lang.String) obj3);
                }
                defpackage.dfb.h(diqVar, null, new bup(this.b, 1));
                return defpackage.aojh.a;
            case 11:
                float fFloatValue = ((java.lang.Float) obj).floatValue();
                bun bunVar = (bun) this.a;
                aopm aopmVar = bunVar.f;
                float fS = defpackage.aooc.s(fFloatValue, ((java.lang.Number) aopmVar.b()).floatValue(), ((java.lang.Number) aopmVar.a()).floatValue());
                if (fS != bunVar.d()) {
                    this.b.a(java.lang.Float.valueOf(fS));
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case 12:
                ((bun) this.a).h(((java.lang.Float) obj).floatValue(), (defpackage.aonj) this.b);
                return defpackage.aojh.a;
            case 13:
                defpackage.cra craVar = (defpackage.cra) obj;
                ?? r0 = this.b;
                ?? r15 = this.a;
                defpackage.ayy ayyVar = bwh.a;
                craVar.w(((java.lang.Number) r15.a()).floatValue());
                craVar.x(((java.lang.Number) r15.a()).floatValue());
                craVar.o(((java.lang.Number) r0.a()).floatValue());
                return defpackage.aojh.a;
            case 14:
                if (((defpackage.emp) obj) == defpackage.emp.ON_RESUME) {
                    java.lang.Object obj4 = this.a;
                    ?? r16 = this.b;
                    ?? r17 = (android.view.accessibility.AccessibilityManager) obj4;
                    byp bypVar = (byp) r16;
                    bypVar.b(r17.isEnabled());
                    r17.addAccessibilityStateChangeListener(r16);
                    byo byoVar = bypVar.a;
                    byoVar.a(r17.isTouchExplorationEnabled());
                    r17.addTouchExplorationStateChangeListener(byoVar);
                    if (android.os.Build.VERSION.SDK_INT >= 33 && (bynVar = bypVar.b) != null) {
                        bynVar.a(byp.c((android.view.accessibility.AccessibilityManager) r17));
                        bynVar.b(byp.d((android.view.accessibility.AccessibilityManager) r17));
                        ae$.ExternalSyntheticApiModelOutline0.m((android.view.accessibility.AccessibilityManager) r17, bynVar);
                    }
                }
                return defpackage.aojh.a;
            case 15:
                ((cco) this.a).f((defpackage.aowv) this.b, obj);
                return defpackage.aojh.a;
            case 16:
                java.lang.Object obj5 = this.b;
                java.lang.Object obj6 = this.a;
                java.lang.Throwable th = (java.lang.Throwable) obj;
                synchronized (((defpackage.cds) obj6).b) {
                    if (obj5 != null) {
                        if (th != null) {
                            java.lang.Throwable th2 = true != (th instanceof java.util.concurrent.CancellationException) ? th : null;
                            if (th2 != null) {
                                aoil.b((java.lang.Throwable) obj5, th2);
                            }
                        }
                        r2 = obj5;
                    }
                    ((defpackage.cds) obj6).d = (java.lang.Throwable) r2;
                    ((defpackage.cds) obj6).k.e(defpackage.cdm.a);
                    break;
                }
                break;
            case 17:
                ((java.lang.Integer) obj).intValue();
                return ((android.os.Parcel) this.a).readValue((java.lang.ClassLoader) this.b);
            case 18:
                ((defpackage.czb) obj).s((defpackage.czc) this.b, 0, 0, ((cna) this.a).a);
                return defpackage.aojh.a;
            case 19:
                defpackage.czb.z((defpackage.czb) obj, (defpackage.czc) this.b, 0, 0, ((defpackage.cqc) this.a).a, 4);
                return defpackage.aojh.a;
            default:
                android.view.MotionEvent motionEvent = (android.view.MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                java.lang.Object obj7 = this.b;
                if (actionMasked == 0) {
                    ((cvp) this.a).e = true != ((java.lang.Boolean) ((cvs) obj7).d().a(motionEvent)).booleanValue() ? 3 : 2;
                } else {
                    ((cvs) obj7).d().a(motionEvent);
                }
                return defpackage.aojh.a;
        }
        return defpackage.aojh.a;
    }

    public /* synthetic */ bly(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
