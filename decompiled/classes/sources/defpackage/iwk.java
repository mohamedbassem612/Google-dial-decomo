package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class iwk {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/beesly/impl/mdd/BeeslyModelChecker");
    private final defpackage.iql b;
    private final defpackage.iqm c;
    private final defpackage.ivi d;
    private final defpackage.rsr e;

    public iwk(defpackage.iql iqlVar, defpackage.rsr rsrVar, defpackage.iqm iqmVar, defpackage.ivi iviVar) {
        this.b = iqlVar;
        this.e = rsrVar;
        this.c = iqmVar;
        this.d = iviVar;
    }

    public final java.lang.Object a(defpackage.aoln aolnVar) {
        return this.c.b() ? this.d.h(null, aolnVar) : c(this.b.a(), 1747122540, aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        if (r7 != r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.aoln r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof iwh
            if (r0 == 0) goto L13
            r0 = r7
            iwh r0 = (iwh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            iwh r0 = new iwh
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            aolu r1 = defpackage.aolu.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.aooc.af(r7)
            goto L79
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            defpackage.aooc.af(r7)
            goto L5f
        L39:
            defpackage.aooc.af(r7)
            goto L53
        L3d:
            defpackage.aooc.af(r7)
            iqm r7 = r6.c
            boolean r7 = r7.b()
            if (r7 == 0) goto L6a
            ivi r7 = r6.d
            r0.c = r5
            r2 = 0
            java.lang.Object r7 = r7.d(r2, r0)
            if (r7 == r1) goto L78
        L53:
            acux r7 = (defpackage.acux) r7
            if (r7 == 0) goto L65
            r0.c = r4
            java.lang.Object r7 = r6.d(r7, r0)
            if (r7 == r1) goto L78
        L5f:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r5 = r7.booleanValue()
        L65:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            goto L79
        L6a:
            iql r7 = r6.b
            acux r7 = r7.a()
            r0.c = r3
            java.lang.Object r7 = r6.d(r7, r0)
            if (r7 != r1) goto L79
        L78:
            r7 = r1
        L79:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iwk.b(aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.acux acuxVar, int i, defpackage.aoln aolnVar) {
        iwi iwiVar;
        java.lang.String str;
        if (aolnVar instanceof iwi) {
            iwiVar = (iwi) aolnVar;
            int i2 = iwiVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iwiVar.d = i2 - Integer.MIN_VALUE;
            } else {
                iwiVar = new iwi(this, aolnVar);
            }
        } else {
            iwiVar = new iwi(this, aolnVar);
        }
        java.lang.Object obj = iwiVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i3 = iwiVar.d;
        if (i3 == 0) {
            defpackage.aooc.af(obj);
            java.lang.String str2 = acuxVar.c;
            defpackage.aooh.e(str2, "getGroupName(...)");
            acvm acvmVarA = acvn.a();
            acvmVarA.b(str2);
            acvn acvnVarA = acvmVarA.a();
            defpackage.rsr rsrVar = this.e;
            iwiVar.e = acuxVar;
            iwiVar.f = str2;
            iwiVar.a = i;
            iwiVar.d = 1;
            java.lang.Object objJ = rsrVar.J(acvnVarA, iwiVar);
            if (objJ == aoluVar) {
                return aoluVar;
            }
            obj = objJ;
            str = str2;
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = iwiVar.a;
            str = iwiVar.f;
            acuxVar = iwiVar.e;
            defpackage.aooc.af(obj);
        }
        acui acuiVar = (acui) obj;
        if (acuiVar == null) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).g(30, java.util.concurrent.TimeUnit.SECONDS).l("com/android/dialer/beesly/impl/mdd/BeeslyModelChecker", "isModelAvailable", 51, "BeeslyModelChecker.kt")).G("No Duplex Model for group '%s' Available, request version (%d)", str, acuxVar.e);
            return java.lang.Boolean.FALSE;
        }
        int i4 = acuiVar.f;
        defpackage.aimz aimzVar = a;
        if (i4 >= i) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).g(30, java.util.concurrent.TimeUnit.SECONDS).l("com/android/dialer/beesly/impl/mdd/BeeslyModelChecker", "isModelAvailable", 63, "BeeslyModelChecker.kt")).M("Downloaded Duplex Model (%d) meets minimum version (%d), request version(%d)", new java.lang.Integer(acuiVar.f), new java.lang.Integer(i), new java.lang.Integer(acuxVar.e));
            return java.lang.Boolean.TRUE;
        }
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).g(30, java.util.concurrent.TimeUnit.SECONDS).l("com/android/dialer/beesly/impl/mdd/BeeslyModelChecker", "isModelAvailable", 75, "BeeslyModelChecker.kt")).M("Downloaded Duplex Model (%d) does NOT meet minimum version (%d), request version (%d)", new java.lang.Integer(acuiVar.f), new java.lang.Integer(i), new java.lang.Integer(acuxVar.e));
        return java.lang.Boolean.FALSE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(defpackage.acux acuxVar, defpackage.aoln aolnVar) {
        iwj iwjVar;
        java.lang.String str;
        if (aolnVar instanceof iwj) {
            iwjVar = (iwj) aolnVar;
            int i = iwjVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iwjVar.c = i - Integer.MIN_VALUE;
            } else {
                iwjVar = new iwj(this, aolnVar);
            }
        } else {
            iwjVar = new iwj(this, aolnVar);
        }
        java.lang.Object obj = iwjVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = iwjVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            java.lang.String str2 = acuxVar.c;
            defpackage.aooh.e(str2, "getGroupName(...)");
            acvm acvmVarA = acvn.a();
            acvmVarA.b(str2);
            acvn acvnVarA = acvmVarA.a();
            defpackage.rsr rsrVar = this.e;
            iwjVar.d = acuxVar;
            iwjVar.e = str2;
            iwjVar.c = 1;
            java.lang.Object objJ = rsrVar.J(acvnVarA, iwjVar);
            if (objJ == aoluVar) {
                return aoluVar;
            }
            obj = objJ;
            str = str2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = iwjVar.e;
            acuxVar = iwjVar.d;
            defpackage.aooc.af(obj);
        }
        acui acuiVar = (acui) obj;
        if (acuiVar == null) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).g(30, java.util.concurrent.TimeUnit.SECONDS).l("com/android/dialer/beesly/impl/mdd/BeeslyModelChecker", "isModelUpToDate", 92, "BeeslyModelChecker.kt")).G("No MDD for group '%s' Available, request version (%d)", str, acuxVar.e);
            return java.lang.Boolean.FALSE;
        }
        if (acuiVar.f >= acuxVar.e) {
            return java.lang.Boolean.TRUE;
        }
        ((defpackage.aimw) ((defpackage.aimw) a.b()).g(30, java.util.concurrent.TimeUnit.SECONDS).l("com/android/dialer/beesly/impl/mdd/BeeslyModelChecker", "isModelUpToDate", 103, "BeeslyModelChecker.kt")).z("Downloaded MDD (%d) is NOT up-to-date, request version (%d)", acuiVar.f, acuxVar.e);
        return java.lang.Boolean.FALSE;
    }
}
