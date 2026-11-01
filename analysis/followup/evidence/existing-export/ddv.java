package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ddv implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ ddv(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x02a9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v19, types: [aoub, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v24, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v3, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v50, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v51, types: [android.view.ViewTreeObserver$OnDrawListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v66, types: [absl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v67, types: [absl, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        int actionMasked;
        int i;
        android.view.View viewC;
        int i2;
        java.lang.Object obj;
        int i3 = 0;
        switch (this.$cid) {
            case 0:
                android.os.Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                java.lang.Object obj2 = this.a;
                while (true) {
                    try {
                        defpackage.aojw aojwVar = ((defpackage.deg) obj2).i;
                        if (aojwVar.isEmpty()) {
                            android.os.Trace.endSection();
                            return;
                        }
                        ((defpackage.aomy) aojwVar.removeLast()).a();
                    } catch (java.lang.Throwable th) {
                        android.os.Trace.endSection();
                        throw th;
                    }
                }
                break;
            case 1:
                java.lang.Class cls = defpackage.deg.a;
                this.a.a();
                return;
            case 2:
                defpackage.deg degVar = (defpackage.deg) this.a;
                degVar.D = false;
                android.view.MotionEvent motionEvent = degVar.B;
                if (motionEvent == null) {
                    defpackage.aooh.g();
                }
                if (motionEvent.getActionMasked() != 10) {
                    throw new java.lang.IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
                }
                degVar.aa(motionEvent);
                return;
            case 3:
                defpackage.deg degVar2 = (defpackage.deg) this.a;
                degVar2.removeCallbacks(this);
                android.view.MotionEvent motionEvent2 = degVar2.B;
                if (motionEvent2 == null || (actionMasked = motionEvent2.getActionMasked()) == 10 || actionMasked == 1) {
                    return;
                }
                if (actionMasked == 2 || actionMasked == 7) {
                    i = 7;
                } else if (actionMasked == 8) {
                    i = 9;
                } else if (actionMasked != 9) {
                    i = 2;
                } else {
                    i = 7;
                }
                degVar2.aj(motionEvent2, i, degVar2.C, false);
                return;
            case 4:
                ((defpackage.ecm) this.a).f(0);
                return;
            case 5:
                defpackage.ejh ejhVar = (defpackage.ejh) this.a;
                int i4 = ejhVar.b.h;
                boolean z = ejhVar.a == 3;
                if (z) {
                    viewC = ejhVar.c.c(3);
                    i2 = (viewC != null ? -viewC.getWidth() : 0) + i4;
                } else {
                    androidx.drawerlayout.widget.DrawerLayout drawerLayout = ejhVar.c;
                    android.view.View viewC2 = drawerLayout.c(5);
                    int width = drawerLayout.getWidth() - i4;
                    viewC = viewC2;
                    i2 = width;
                }
                if (viewC != null) {
                    if (z) {
                        if (viewC.getLeft() >= i2) {
                            return;
                        }
                    } else if (viewC.getLeft() <= i2) {
                        return;
                    }
                    androidx.drawerlayout.widget.DrawerLayout drawerLayout2 = ejhVar.c;
                    if (drawerLayout2.a(viewC) == 0) {
                        defpackage.ejg ejgVar = (defpackage.ejg) viewC.getLayoutParams();
                        ejhVar.b.j(viewC, i2, viewC.getTop());
                        ejgVar.c = true;
                        drawerLayout2.invalidate();
                        ejhVar.m();
                        if (drawerLayout2.b) {
                            return;
                        }
                        long jUptimeMillis = android.os.SystemClock.uptimeMillis();
                        android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        int childCount = drawerLayout2.getChildCount();
                        while (i3 < childCount) {
                            drawerLayout2.getChildAt(i3).dispatchTouchEvent(motionEventObtain);
                            i3++;
                        }
                        motionEventObtain.recycle();
                        drawerLayout2.b = true;
                        return;
                    }
                    return;
                }
                return;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                java.lang.Object obj3 = this.a;
                synchronized (((defpackage.enf) obj3).b) {
                    obj = ((defpackage.enf) obj3).f;
                    ((defpackage.enf) obj3).f = defpackage.enf.a;
                    break;
                }
                ((defpackage.enf) this.a).k(obj);
                return;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                ((java.util.concurrent.atomic.AtomicBoolean) this.a).set(true);
                return;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                ?? r14 = this.a;
                if (r14 != 0) {
                    r14.s(null);
                    return;
                }
                return;
            case 9:
                ((defpackage.aw) this.a).aE();
                return;
            case 10:
                ((defpackage.kjr) ((defpackage.kgl) this.a).a.a()).b();
                return;
            case 11:
                defpackage.lbr lbrVar = (defpackage.lbr) this.a;
                if (!lbrVar.c.a()) {
                    ((defpackage.aimw) ((defpackage.aimw) defpackage.lbr.a.b()).l("com/android/dialer/callrecording/startup/CallRecordingStartupListener", "onApplicationStartup", 71, "CallRecordingStartupListener.java")).v("not prewarming TTS");
                    return;
                }
                ((defpackage.aimw) ((defpackage.aimw) defpackage.lbr.a.b()).l("com/android/dialer/callrecording/startup/CallRecordingStartupListener", "onApplicationStartup", 68, "CallRecordingStartupListener.java")).v("prewarming TTS");
                defpackage.lbq lbqVar = lbrVar.b;
                defpackage.ahoq ahoqVarX = defpackage.ahvr.X(251, "TtsPreWarm_prewarmTtsInBackground", defpackage.ahot.a, true);
                try {
                    if (lbqVar.d.a().isPresent()) {
                        ((defpackage.aimw) ((defpackage.aimw) defpackage.lbq.a.b()).l("com/android/dialer/callrecording/impl/ttsprewarm/TtsPreWarm", "prewarmTtsInBackground", 65, "TtsPreWarm.java")).v("use built in audio file");
                    } else {
                        defpackage.agsm.i(252, lbqVar.g.g(new gzk(lbqVar, new lbp(lbqVar, 0), 17, (byte[]) null), lbqVar.b), "prewarming: failed to create TTS instance", new java.lang.Object[0]);
                    }
                    ahoqVarX.close();
                    return;
                } catch (java.lang.Throwable th2) {
                    try {
                        ahoqVarX.close();
                        throw th2;
                    } catch (java.lang.Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            case 12:
                defpackage.tkl tklVar = (defpackage.tkl) this.a;
                defpackage.opx opxVar = (defpackage.opx) tklVar.b;
                if (!j$.util.Collection.-EL.stream(opxVar.c.values()).allMatch(new defpackage.opv(i3))) {
                    opxVar.a();
                    ((defpackage.kjr) tklVar.d).b();
                    return;
                } else {
                    java.lang.Object obj4 = tklVar.d;
                    ((defpackage.aimw) ((defpackage.aimw) defpackage.kjr.a.b()).l("com/android/dialer/calllog/refresh/impl/AnnotatedCallLogRefreshStarterImpl", "refreshWithDirtyCheck", 56, "AnnotatedCallLogRefreshStarterImpl.java")).v("refreshWithDirtyCheck");
                    ((defpackage.kjr) obj4).b.b(2);
                    return;
                }
            case 13:
                this.a.a();
                return;
            case 14:
                ?? r15 = this.a;
                defpackage.ruf rufVar = (defpackage.ruf) r15;
                rufVar.c.run();
                android.view.ViewTreeObserver viewTreeObserver = rufVar.d ? rufVar.b : rufVar.a.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnDrawListener(r15);
                    return;
                }
                return;
            case 15:
                android.content.Context context = (android.content.Context) this.a;
                android.app.job.JobScheduler jobScheduler = (android.app.job.JobScheduler) context.getSystemService("jobscheduler");
                if (jobScheduler != null) {
                    for (android.app.job.JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                        if (defpackage.ufa.e(jobInfo.getId()) || jobInfo.getService().getClassName().equals(com.android.dialer.spam.inapp.SpamJobService.class.getName())) {
                            defpackage.ufa.c(context, jobInfo.getId());
                        }
                    }
                    return;
                }
                return;
            case 16:
                ((defpackage.rlv) ((defpackage.uqe) this.a).e.a()).o(defpackage.rmx.CALL_SCREEN_INIT_AT_STARTUP);
                return;
            case 17:
                ((defpackage.rlv) ((defpackage.uqe) this.a).e.a()).n(defpackage.rmw.APP_LAUNCHED);
                return;
            case 18:
                ((defpackage.zzx) this.a).h(new java.util.concurrent.TimeoutException());
                return;
            case 19:
                this.a.b();
                return;
            default:
                if (android.os.Build.VERSION.SDK_INT < 31) {
                    android.os.Binder.flushPendingCommands();
                }
                this.a.a();
                return;
        }
    }

    public ddv(java.lang.Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}
