package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class ajx implements aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ ajx(defpackage.ag agVar, android.view.ViewGroup viewGroup, java.lang.Object obj, aoot aootVar, int i) {
        this.$cid = i;
        this.d = agVar;
        this.c = viewGroup;
        this.a = obj;
        this.b = aootVar;
    }

    /* JADX WARN: Type inference failed for: r0v43, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.AutoCloseable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v61, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v34, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v35, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v36, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, xjz] */
    /* JADX WARN: Type inference failed for: r2v26, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [aiq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [aoss, java.lang.Object] */
    public final java.lang.Object a() throws java.lang.Exception {
        switch (this.$cid) {
            case 0:
                defpackage.ajt ajtVar = (defpackage.ajt) this.c;
                java.lang.Object obj = ajtVar.a;
                java.lang.Object obj2 = this.a;
                boolean zN = aooh.n(obj2, obj);
                java.lang.Object obj3 = this.b;
                if (!zN || !aooh.n(obj3, ajtVar.b)) {
                    ?? r5 = this.d;
                    ajtVar.a = obj2;
                    ajtVar.b = obj3;
                    ajtVar.c = r5;
                    ajtVar.d = new defpackage.ala(r5, ajtVar.i, obj2, obj3, null);
                    ajtVar.h.b(true);
                    ajtVar.e = false;
                    ajtVar.f = true;
                }
                return aojh.a;
            case 1:
                if (bo.Z(2)) {
                    android.util.Log.v("FragmentManager", "Attempting to create TransitionSeekController");
                }
                java.lang.Object obj4 = this.a;
                java.lang.Object obj5 = this.c;
                java.lang.Object obj6 = this.d;
                defpackage.ag agVar = (defpackage.ag) obj6;
                agVar.g = agVar.d.s((android.view.ViewGroup) obj5, obj4);
                if (agVar.g == null) {
                    if (bo.Z(2)) {
                        android.util.Log.v("FragmentManager", "TransitionSeekController was not created.");
                    }
                    agVar.h = true;
                    return aojh.a;
                }
                ((aoot) this.b).a = new defpackage.af(obj6, obj4, obj5, 1, (byte[]) null);
                if (bo.Z(2)) {
                    android.util.Log.v("FragmentManager", "Started executing operations from " + agVar.b + " to " + agVar.c);
                }
                return aojh.a;
            case 2:
                java.lang.Object obj7 = this.c;
                defpackage.btt bttVar = (defpackage.btt) obj7;
                defpackage.btu btuVarC = bttVar.c();
                ?? r6 = this.b;
                if (btuVarC == defpackage.btu.b && bttVar.k()) {
                    java.lang.Object obj8 = this.d;
                    aoov.an((aoss) r6, (aolr) null, 0, new defpackage.bgx(bttVar, (aoln) null, 2), 3);
                    aoov.an((aoss) r6, (aolr) null, 0, new defpackage.bgx((aii) obj8, (aoln) null, 3), 3);
                } else {
                    aoov.an((aoss) r6, (aolr) null, 0, new defpackage.bgx(bttVar, (aoln) null, 4, (byte[]) null), 3).p(new bly(obj7, this.a, 6));
                }
                return aojh.a;
            case 3:
                java.lang.Object obj9 = this.c;
                cfr cfrVar = ((cbt) obj9).t;
                java.lang.Object obj10 = this.a;
                java.lang.Object obj11 = this.b;
                java.lang.Object obj12 = this.d;
                can canVar = cfrVar.j;
                try {
                    cfrVar.j = (can) obj12;
                    cfl cflVar = ((cbt) obj9).p;
                    int[] iArr = ((cbt) obj9).g;
                    aco acoVar = ((cbt) obj9).y;
                    ((cbt) obj9).g = null;
                    ((cbt) obj9).y = null;
                    try {
                        ((cbt) obj9).p = (cfl) obj11;
                        boolean z = cfrVar.b;
                        try {
                            cfrVar.b = false;
                            ((cbt) obj9).al(((defpackage.cck) obj10).a, ((defpackage.cck) obj10).h, ((defpackage.cck) obj10).b);
                            cfrVar.b = z;
                            ((cbt) obj9).p = cflVar;
                            ((cbt) obj9).g = iArr;
                            ((cbt) obj9).y = acoVar;
                            cfrVar.j = canVar;
                            return aojh.a;
                        } catch (java.lang.Throwable th) {
                            cfrVar.b = z;
                            throw th;
                        }
                    } catch (java.lang.Throwable th2) {
                        ((cbt) obj9).p = cflVar;
                        ((cbt) obj9).g = iArr;
                        ((cbt) obj9).y = acoVar;
                        throw th2;
                    }
                } catch (java.lang.Throwable th3) {
                    cfrVar.j = canVar;
                    throw th3;
                }
            case 4:
                java.lang.String string = ((java.util.UUID) this.b).toString();
                gyr gyrVar = (gyr) this.a;
                gxl gxlVarC = gyrVar.b.c(string);
                java.lang.Object obj13 = this.c;
                if (gxlVarC == null || gxlVarC.c.a()) {
                    throw new java.lang.IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                gtr gtrVar = gyrVar.a;
                synchronized (gtrVar.l) {
                    gsh.a();
                    android.util.Log.i(gtr.a, a.bk(string, "Moving WorkSpec (", ") to the foreground"));
                    gve gveVar = (gve) gtrVar.g.remove(string);
                    if (gveVar != null) {
                        if (gtrVar.b == null) {
                            android.content.Context context = gtrVar.c;
                            int i = defpackage.gyn.a;
                            aooh.f(context, "context");
                            java.lang.Object systemService = context.getApplicationContext().getSystemService("power");
                            aooh.d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
                            android.os.PowerManager.WakeLock wakeLockNewWakeLock = ((android.os.PowerManager) systemService).newWakeLock(1, "WorkManager: ProcessorForegroundLck");
                            synchronized (defpackage.gyo.a) {
                            }
                            aooh.c(wakeLockNewWakeLock);
                            gtrVar.b = wakeLockNewWakeLock;
                            gtrVar.b.acquire();
                        }
                        gtrVar.f.put(string, gveVar);
                        android.content.Context context2 = gtrVar.c;
                        gxd gxdVarA = gveVar.a();
                        int i2 = defpackage.gwl.k;
                        android.content.Intent intent = new android.content.Intent(context2, (java.lang.Class<?>) androidx.work.impl.foreground.SystemForegroundService.class);
                        intent.setAction("ACTION_START_FOREGROUND");
                        intent.putExtra("KEY_WORKSPEC_ID", gxdVarA.a);
                        intent.putExtra("KEY_GENERATION", gxdVarA.b);
                        intent.putExtra("KEY_NOTIFICATION_ID", ((defpackage.grv) obj13).a);
                        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", ((defpackage.grv) obj13).b);
                        intent.putExtra("KEY_NOTIFICATION", ((defpackage.grv) obj13).c);
                        aa$.ExternalSyntheticApiModelOutline0.m(context2, intent);
                        java.util.ArrayList arrayList = new java.util.ArrayList(gtrVar.k);
                        gxd gxdVarA2 = gveVar.a();
                        int size = arrayList.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            ((gtg) arrayList.get(i3)).a(gxdVarA2, true);
                        }
                    }
                }
                java.lang.Object obj14 = this.d;
                gxd gxdVarU = gus.u(gxlVarC);
                int i4 = defpackage.gwl.k;
                android.content.Context context3 = (android.content.Context) obj14;
                android.content.Intent intent2 = new android.content.Intent(context3, (java.lang.Class<?>) androidx.work.impl.foreground.SystemForegroundService.class);
                intent2.setAction("ACTION_NOTIFY");
                defpackage.grv grvVar = (defpackage.grv) obj13;
                intent2.putExtra("KEY_NOTIFICATION_ID", grvVar.a);
                intent2.putExtra("KEY_FOREGROUND_SERVICE_TYPE", grvVar.b);
                intent2.putExtra("KEY_NOTIFICATION", grvVar.c);
                intent2.putExtra("KEY_WORKSPEC_ID", gxdVarU.a);
                intent2.putExtra("KEY_GENERATION", gxdVarU.b);
                context3.startService(intent2);
                return null;
            case 5:
                return ((ojo) this.c).d.x(new agxc((android.net.Uri) this.d, (java.lang.String) this.a, (java.lang.String[]) this.b));
            case 6:
                android.content.Context context4 = ((ojo) this.c).a;
                java.lang.Object obj15 = this.b;
                return java.lang.Integer.valueOf(context4.getContentResolver().delete((android.net.Uri) this.d, (java.lang.String) this.a, (java.lang.String[]) obj15));
            case 7:
                this.b.a(new tfs(((tfk) this.a).f, (android.net.Uri) this.c), this.d);
                return aojh.a;
            case 8:
                this.a.a();
                this.b.a(new tfq((tfj) this.c), this.d);
                return aojh.a;
            case 9:
                this.a.a();
                this.b.a(new tfr((tfj) this.c), this.d);
                return aojh.a;
            case 10:
                this.b.close();
                xmw xmwVar = ((xon) this.a).d;
                ?? r1 = this.c;
                xmwVar.k((xjz) r1);
                xmwVar.o((xjz) r1);
                xmwVar.n((xjz) r1);
                ((xmb) this.d).i();
                return aojh.a;
            case 11:
                aoiu aoiuVar = (aoiu) this.b;
                float fFloatValue = ((java.lang.Number) aoiuVar.a).floatValue();
                float fFloatValue2 = ((java.lang.Number) aoiuVar.b).floatValue();
                ?? r2 = this.d;
                float fFloatValue3 = ((java.lang.Number) r2.a()).floatValue();
                if (((1.0f - fFloatValue3) * fFloatValue) + (fFloatValue3 * fFloatValue2) == 1.0f) {
                    return bge.a;
                }
                return new defpackage.abmp((izg) this.a, ((java.lang.Number) r2.a()).floatValue(), ((java.lang.Number) this.c.a()).floatValue());
            default:
                akjc akjcVar = ((akkh) this.a).k;
                if (akjcVar == null) {
                    akjcVar = akjc.a;
                }
                java.lang.Object obj16 = this.c;
                java.lang.Object obj17 = this.b;
                java.lang.Object obj18 = this.d;
                aooh.e(akjcVar, "getAction(...)");
                acjm acjmVar = (acjm) obj16;
                acjmVar.g((com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) obj18, acjmVar.b.c(akjcVar));
                acjmVar.f((java.lang.String) obj17);
                return aojh.a;
        }
    }

    public /* synthetic */ ajx(aoiu aoiuVar, cer cerVar, izg izgVar, cer cerVar2, int i) {
        this.$cid = i;
        this.b = aoiuVar;
        this.d = cerVar;
        this.a = izgVar;
        this.c = cerVar2;
    }

    public /* synthetic */ ajx(defpackage.btt bttVar, aoss aossVar, aii aiiVar, aomy aomyVar, int i) {
        this.$cid = i;
        this.c = bttVar;
        this.b = aossVar;
        this.d = aiiVar;
        this.a = aomyVar;
    }

    public /* synthetic */ ajx(cbt cbtVar, can canVar, cfl cflVar, defpackage.cck cckVar, int i) {
        this.$cid = i;
        this.c = cbtVar;
        this.d = canVar;
        this.b = cflVar;
        this.a = cckVar;
    }

    public /* synthetic */ ajx(java.lang.Object obj, defpackage.ajt ajtVar, java.lang.Object obj2, ajr ajrVar, int i) {
        this.$cid = i;
        this.a = obj;
        this.c = ajtVar;
        this.b = obj2;
        this.d = ajrVar;
    }

    public /* synthetic */ ajx(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, android.content.Context context, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = context;
    }

    public /* synthetic */ ajx(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, int i) {
        this.$cid = i;
        this.c = obj;
        this.d = obj2;
        this.a = obj3;
        this.b = obj4;
    }

    public /* synthetic */ ajx(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
        this.d = obj4;
    }
}
