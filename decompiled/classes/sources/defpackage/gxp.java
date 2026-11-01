package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class gxp implements defpackage.aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ gxp(java.lang.String str, int i) {
        this.$cid = i;
        this.a = "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        this.b = str;
    }

    /* JADX WARN: Type inference failed for: r13v32, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v28, types: [ccp, java.lang.Object] */
    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) throws java.lang.Exception {
        defpackage.gsw gswVarP = null;
        switch (this.$cid) {
            case 0:
                return java.lang.Integer.valueOf(defpackage.ils.g((java.lang.String) this.a, (java.lang.String) this.b, (defpackage.gjh) obj));
            case 1:
                defpackage.gjh gjhVar = (defpackage.gjh) obj;
                defpackage.aooh.f(gjhVar, "_connection");
                ((defpackage.gxw) this.b).b.d(gjhVar, this.a);
                return defpackage.aojh.a;
            case 2:
                return defpackage.ils.f((java.lang.String) this.a, (java.lang.String) this.b, (defpackage.gjh) obj);
            case 3:
                defpackage.gjh gjhVar2 = (defpackage.gjh) obj;
                java.lang.Object obj2 = this.b;
                if (gjhVar2 == null) {
                    defpackage.aooh.i("_connection");
                }
                defpackage.gin ginVarA = gjhVar2.a((java.lang.String) this.a);
                try {
                    ginVarA.j(1, (java.lang.String) obj2);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (ginVarA.m()) {
                        byte[] bArrN = ginVarA.n(0);
                        defpackage.grp grpVar = defpackage.grp.a;
                        arrayList.add(defpackage.gus.z(bArrN));
                    }
                    ginVarA.close();
                    return arrayList;
                } catch (java.lang.Throwable th) {
                    ginVarA.close();
                    throw th;
                }
            case 4:
                return java.lang.Integer.valueOf(defpackage.ils.g((java.lang.String) this.a, (java.lang.String) this.b, (defpackage.gjh) obj));
            case 5:
                return java.lang.Boolean.valueOf(defpackage.ils.i((java.lang.String) this.a, (java.lang.String) this.b, (defpackage.gjh) obj));
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return java.lang.Integer.valueOf(defpackage.ils.g((java.lang.String) this.a, (java.lang.String) this.b, (defpackage.gjh) obj));
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.gjh gjhVar3 = (defpackage.gjh) obj;
                java.lang.Object obj3 = this.b;
                if (gjhVar3 == null) {
                    defpackage.aooh.i("_connection");
                }
                defpackage.gin ginVarA2 = gjhVar3.a((java.lang.String) this.a);
                try {
                    ginVarA2.j(1, (java.lang.String) obj3);
                    if (ginVarA2.m()) {
                        java.lang.Integer numValueOf = ginVarA2.l(0) ? null : java.lang.Integer.valueOf((int) ginVarA2.c(0));
                        if (numValueOf != null) {
                            gswVarP = defpackage.gus.p(numValueOf.intValue());
                        }
                        break;
                    }
                    return gswVarP;
                } finally {
                    ginVarA2.close();
                }
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.gjh gjhVar4 = (defpackage.gjh) obj;
                if (gjhVar4 == null) {
                    defpackage.aooh.i("_connection");
                }
                ((defpackage.gxw) this.b).a.e(gjhVar4, this.a);
                return defpackage.aojh.a;
            case 9:
                return defpackage.ils.f((java.lang.String) this.a, (java.lang.String) this.b, (defpackage.gjh) obj);
            case 10:
                return defpackage.ils.e((java.lang.String) this.a, (java.lang.String) this.b, (defpackage.gjh) obj);
            case 11:
                defpackage.gjh gjhVar5 = (defpackage.gjh) obj;
                if (gjhVar5 == null) {
                    defpackage.aooh.i("_connection");
                }
                ((defpackage.gxz) this.b).b.e(gjhVar5, this.a);
                return defpackage.aojh.a;
            case 12:
                defpackage.gin ginVarA3 = ((defpackage.gjh) obj).a((java.lang.String) this.a);
                ?? r13 = this.b;
                try {
                    if (r13 == 0) {
                        ginVarA3.i(1);
                    } else {
                        int i = 1;
                        for (java.lang.String str : r13) {
                            if (str == null) {
                                ginVarA3.i(i);
                            } else {
                                ginVarA3.j(i, str);
                            }
                            i++;
                        }
                    }
                    int iS = defpackage.dzk.S(ginVarA3, "id");
                    int iS2 = defpackage.dzk.S(ginVarA3, "conversation");
                    int iS3 = defpackage.dzk.S(ginVarA3, "audioRecordingFilePath");
                    int iS4 = defpackage.dzk.S(ginVarA3, "isRated");
                    int iS5 = defpackage.dzk.S(ginVarA3, "revelioCallType");
                    int iS6 = defpackage.dzk.S(ginVarA3, "lastModifiedMillis");
                    int iS7 = defpackage.dzk.S(ginVarA3, "callScreenFeedbackData");
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    while (ginVarA3.m()) {
                        lkq lkqVar = new lkq();
                        lkqVar.a(ginVarA3.l(iS) ? null : ginVarA3.e(iS));
                        lkqVar.b = defpackage.mni.cI(ginVarA3.l(iS2) ? null : ginVarA3.n(iS2));
                        lkqVar.c = ginVarA3.l(iS3) ? null : ginVarA3.e(iS3);
                        lkqVar.d = ((int) ginVarA3.c(iS4)) != 0;
                        lkqVar.b(defpackage.mni.cG(ginVarA3.l(iS5) ? null : java.lang.Integer.valueOf((int) ginVarA3.c(iS5))));
                        lkqVar.f = ginVarA3.c(iS6);
                        lkqVar.g = defpackage.mni.cK(ginVarA3.l(iS7) ? null : ginVarA3.n(iS7));
                        arrayList2.add(lkqVar);
                        break;
                    }
                    ginVarA3.close();
                    return arrayList2;
                } catch (java.lang.Throwable th2) {
                    ginVarA3.close();
                    throw th2;
                }
            default:
                if (((defpackage.cdh) obj) == null) {
                    defpackage.aooh.i("$this$DisposableEffect");
                }
                final ?? r14 = this.b;
                java.lang.Object obj4 = this.a;
                final android.view.View view = (android.view.View) obj4;
                android.view.ViewTreeObserver.OnPreDrawListener onPreDrawListener = new android.view.ViewTreeObserver.OnPreDrawListener() { // from class: lqg
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public final boolean onPreDraw() {
                        defpackage.ccp ccpVar = r14;
                        boolean zIsShown = view.isShown();
                        if (((java.lang.Boolean) ccpVar.a()).booleanValue() == zIsShown) {
                            return true;
                        }
                        ccpVar.b(java.lang.Boolean.valueOf(zIsShown));
                        return true;
                    }
                };
                view.getViewTreeObserver().addOnPreDrawListener(onPreDrawListener);
                return new defpackage.kcp(obj4, onPreDrawListener, 2);
        }
    }

    public /* synthetic */ gxp(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ gxp(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ gxp(java.lang.String str, int i, byte[] bArr) {
        this.$cid = i;
        this.a = "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        this.b = str;
    }

    public /* synthetic */ gxp(java.lang.String str, int i, char[] cArr) {
        this.$cid = i;
        this.a = "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)";
        this.b = str;
    }

    public /* synthetic */ gxp(java.lang.String str, int i, float[] fArr) {
        this.$cid = i;
        this.a = "SELECT state FROM workspec WHERE id=?";
        this.b = str;
    }

    public /* synthetic */ gxp(java.lang.String str, int i, int[] iArr) {
        this.$cid = i;
        this.a = "SELECT COUNT(*) > 0 FROM workspec WHERE id=? AND state=0 AND schedule_requested_at<>-1";
        this.b = str;
    }

    public /* synthetic */ gxp(java.lang.String str, int i, short[] sArr) {
        this.$cid = i;
        this.a = "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
        this.b = str;
    }

    public /* synthetic */ gxp(java.lang.String str, int i, boolean[] zArr) {
        this.$cid = i;
        this.a = "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        this.b = str;
    }

    public /* synthetic */ gxp(java.lang.String str, int i, byte[][] bArr) {
        this.$cid = i;
        this.a = "DELETE FROM worktag WHERE work_spec_id=?";
        this.b = str;
    }

    public /* synthetic */ gxp(java.lang.String str, int i, char[][] cArr) {
        this.$cid = i;
        this.a = "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?";
        this.b = str;
    }
}
