package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class an implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public an(defpackage.aaeq aaeqVar, com.google.android.gms.common.ConnectionResult connectionResult, int i) {
        this.$cid = i;
        this.b = connectionResult;
        j$.util.Objects.requireNonNull(aaeqVar);
        this.a = aaeqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [dxw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v69, types: [aaug, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v73, types: [aaui, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r12v30, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r12v52, types: [android.os.IBinder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v9, types: [aaue, aauh, aaui, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v30, types: [aaua, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.concurrent.Callable] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$cid) {
            case 0:
                ((defpackage.aw) this.a).n((android.os.Bundle) this.b);
                return;
            case 1:
                ((defpackage.aw) this.a).af((android.os.Bundle) this.b);
                return;
            case 2:
                defpackage.aw awVar = (defpackage.aw) this.a;
                awVar.ao(awVar.Q, (android.os.Bundle) this.b);
                return;
            case 3:
                ((defpackage.aw) this.a).h((android.os.Bundle) this.b);
                return;
            case 4:
                defpackage.ck ckVar = (defpackage.ck) this.a;
                java.util.List list = ckVar.b;
                java.lang.Object obj = this.b;
                if (list.contains(obj)) {
                    defpackage.cj cjVar = (defpackage.cj) obj;
                    int i = cjVar.h;
                    android.view.View view = cjVar.a.Q;
                    defpackage.aooh.e(view, "mView");
                    defpackage.den.bR(i, view, ckVar.a);
                    return;
                }
                return;
            case 5:
                defpackage.ck ckVar2 = (defpackage.ck) this.a;
                java.util.List list2 = ckVar2.b;
                java.lang.Object obj2 = this.b;
                list2.remove(obj2);
                ckVar2.c.remove(obj2);
                return;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                ((defpackage.dwj) this.a).b((android.graphics.Typeface) this.b);
                return;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                java.lang.Object obj3 = this.b;
                try {
                    this.a.run();
                    return;
                } finally {
                    ((defpackage.ggf) obj3).a();
                }
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                ((defpackage.ajxw) this.b).b.accept(this.a);
                return;
            case 9:
                defpackage.gxl gxlVar = (defpackage.gxl) this.a;
                defpackage.gsh.a().c(defpackage.gvg.a, "Scheduling work ".concat(java.lang.String.valueOf(gxlVar.b)));
                ((defpackage.gvg) this.b).b.c(gxlVar);
                return;
            case 10:
                ((defpackage.rsr) ((defpackage.apkv) this.a).c).ay((defpackage.ipc) this.b, 3);
                return;
            case 11:
                ((defpackage.lpe) this.b).a.o((defpackage.rmx) this.a);
                return;
            case 12:
                android.content.Context context = (android.content.Context) this.a;
                android.app.job.JobScheduler jobScheduler = (android.app.job.JobScheduler) context.getSystemService(android.app.job.JobScheduler.class);
                if (aa$.ExternalSyntheticApiModelOutline1.m(jobScheduler, 100) != null) {
                    ((defpackage.aimw) ((defpackage.aimw) defpackage.tvm.a.b()).l("com/android/dialer/shortcuts/ShortcutsJobScheduler", "scheduleJobInternal", 82, "ShortcutsJobScheduler.java")).v("job already scheduled.");
                    return;
                }
                java.lang.Object obj4 = this.b;
                defpackage.zjv zjvVarDQ = ((defpackage.tvl) defpackage.agab.aH(context, defpackage.tvl.class)).dQ();
                defpackage.mgv mgvVar = defpackage.mgv.JOB_SCHEDULER_SCHEDULE;
                java.lang.Object[] objArr = {defpackage.gus.au(100)};
                defpackage.ahvr.ay(objArr, 1);
                defpackage.zjv.i(zjvVarDQ, mgvVar, new defpackage.aike(objArr, 1), null, 0, 28);
                jobScheduler.schedule((android.app.job.JobInfo) obj4);
                return;
            case 13:
                defpackage.aaeq aaeqVar = (defpackage.aaeq) this.a;
                defpackage.aaeo aaeoVar = (defpackage.aaeo) aaeqVar.e.l.get(aaeqVar.b);
                if (aaeoVar != null) {
                    if (!((com.google.android.gms.common.ConnectionResult) this.b).d()) {
                        aaeoVar.j((com.google.android.gms.common.ConnectionResult) this.b, null);
                        return;
                    }
                    aaeqVar.d = true;
                    defpackage.aacv aacvVar = aaeqVar.a;
                    if (aacvVar.i()) {
                        aaeqVar.c();
                        return;
                    }
                    try {
                        aacvVar.s(null, aacvVar.l());
                        return;
                    } catch (java.lang.SecurityException e) {
                        android.util.Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                        ((defpackage.aaeq) this.a).a.n("Failed to get service from broker.");
                        aaeoVar.j(new com.google.android.gms.common.ConnectionResult(1, 10, null, null, null, null), null);
                        return;
                    }
                }
                return;
            case 14:
                defpackage.aafh aafhVar = (defpackage.aafh) this.a;
                aafhVar.c = false;
                aafhVar.b = this.b;
                aafhVar.c();
                aafhVar.a.a(new android.os.Bundle());
                return;
            case 15:
                java.lang.Object obj5 = this.a;
                if (((defpackage.aauq) obj5).c) {
                    ((defpackage.aauq) ((defpackage.aauf) this.b).a).u();
                    return;
                }
                try {
                    ((defpackage.aauq) ((defpackage.aauf) this.b).a).s(((defpackage.aauf) this.b).b.a((defpackage.aaum) obj5));
                    return;
                } catch (defpackage.aauk e2) {
                    boolean z = e2.getCause() instanceof java.lang.Exception;
                    java.lang.Object obj6 = this.b;
                    if (z) {
                        ((defpackage.aauq) ((defpackage.aauf) obj6).a).r((java.lang.Exception) e2.getCause());
                        return;
                    } else {
                        ((defpackage.aauq) ((defpackage.aauf) obj6).a).r(e2);
                        return;
                    }
                } catch (java.lang.Exception e3) {
                    ((defpackage.aauq) ((defpackage.aauf) this.b).a).r(e3);
                    return;
                }
            case 16:
                try {
                    defpackage.aaum aaumVar = (defpackage.aaum) ((defpackage.aaub) this.b).a.a((defpackage.aaum) this.a);
                    ?? r12 = this.b;
                    if (aaumVar == 0) {
                        ((defpackage.aaub) r12).a(new java.lang.NullPointerException("Continuation returned null"));
                        return;
                    }
                    java.util.concurrent.Executor executor = defpackage.aaup.b;
                    aaumVar.p(executor, r12);
                    aaumVar.o(executor, r12);
                    aaumVar.l(executor, r12);
                    return;
                } catch (defpackage.aauk e4) {
                    boolean z2 = e4.getCause() instanceof java.lang.Exception;
                    java.lang.Object obj7 = this.b;
                    if (z2) {
                        ((defpackage.aaub) obj7).b.r((java.lang.Exception) e4.getCause());
                        return;
                    } else {
                        ((defpackage.aaub) obj7).b.r(e4);
                        return;
                    }
                } catch (java.lang.Exception e5) {
                    ((defpackage.aaub) this.b).b.r(e5);
                    return;
                }
            case 17:
                java.lang.Object obj8 = this.b;
                synchronized (((defpackage.aauf) obj8).a) {
                    ((defpackage.aauf) obj8).b.a((defpackage.aaum) this.a);
                    break;
                }
                return;
            case 18:
                java.lang.Object obj9 = this.b;
                synchronized (((defpackage.aauf) obj9).a) {
                    ((defpackage.aauf) obj9).b.d(((defpackage.aaum) this.a).g());
                    break;
                }
                return;
            case 19:
                try {
                    ((defpackage.aauq) this.b).s(this.a.call());
                    return;
                } catch (java.lang.Exception e6) {
                    ((defpackage.aauq) this.b).r(e6);
                    return;
                } catch (java.lang.Throwable th) {
                    ((defpackage.aauq) this.b).r(new java.lang.RuntimeException(th));
                    return;
                }
            default:
                ((defpackage.ajbw) this.b).execute(this.a);
                return;
        }
    }

    public an(defpackage.gvg gvgVar, defpackage.gxl gxlVar, int i) {
        this.$cid = i;
        this.a = gxlVar;
        this.b = gvgVar;
    }

    public /* synthetic */ an(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ an(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    public an(defpackage.aauq aauqVar, java.util.concurrent.Callable callable, int i) {
        this.$cid = i;
        this.b = aauqVar;
        this.a = callable;
    }

    public an(defpackage.aauf aaufVar, defpackage.aaum aaumVar, int i, byte[] bArr) {
        this.$cid = i;
        this.a = aaumVar;
        j$.util.Objects.requireNonNull(aaufVar);
        this.b = aaufVar;
    }

    public an(defpackage.aaub aaubVar, defpackage.aaum aaumVar, int i) {
        this.$cid = i;
        this.a = aaumVar;
        j$.util.Objects.requireNonNull(aaubVar);
        this.b = aaubVar;
    }

    public an(defpackage.aauf aaufVar, defpackage.aaum aaumVar, int i) {
        this.$cid = i;
        this.a = aaumVar;
        j$.util.Objects.requireNonNull(aaufVar);
        this.b = aaufVar;
    }

    public an(defpackage.aauf aaufVar, defpackage.aaum aaumVar, int i, char[] cArr) {
        this.$cid = i;
        this.a = aaumVar;
        j$.util.Objects.requireNonNull(aaufVar);
        this.b = aaufVar;
    }
}
