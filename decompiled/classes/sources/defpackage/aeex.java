package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class aeex implements defpackage.ahzi {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ aeex(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [amwu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [ahzi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v63, types: [amwu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v69, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v77, types: [ahzi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.ahzi
    public final java.lang.Object eZ() {
        java.lang.Object aemsVar;
        int i = 8;
        int i2 = 3;
        switch (this.$cid) {
            case 0:
                defpackage.afip afipVarE = ((defpackage.aeey) this.a).a.e("/client_streamz/gnp_android/growthkit_started_count", new defpackage.afio("package_name", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                afipVarE.c();
                return afipVarE;
            case 1:
                defpackage.afip afipVarE2 = ((defpackage.aeey) this.a).a.e("/client_streamz/gnp_android/registration/registration_request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("registration_reason", java.lang.String.class), new defpackage.afio("status", java.lang.String.class), new defpackage.afio("target_type", java.lang.String.class));
                afipVarE2.c();
                return afipVarE2;
            case 2:
                defpackage.afip afipVarE3 = ((defpackage.aeey) this.a).a.e("/client_streamz/gnp_android/promotion_event", new defpackage.afio("package_name", java.lang.String.class), new defpackage.afio("event_type", java.lang.String.class));
                afipVarE3.c();
                return afipVarE3;
            case 3:
                java.lang.Object obj = this.a;
                defpackage.aemi aemiVar = (defpackage.aemi) obj;
                defpackage.adai adaiVar = new defpackage.adai(aemiVar.a, aemiVar.c);
                defpackage.jvu jvuVar = new defpackage.jvu(obj, adaiVar, i, null);
                if (aemiVar.e.l(aemiVar.a, 19621000) != 0) {
                    android.util.Log.i("OneGoogle", "MDI is not available. Forcing Menagerie");
                    return jvuVar.eZ();
                }
                defpackage.aenc aencVar = new defpackage.aenc(aemiVar.b, jvuVar, 1);
                if (aemiVar.h == null) {
                    defpackage.aapf aapfVar = new defpackage.aapf(aemiVar.a);
                    defpackage.ajxw ajxwVar = new defpackage.ajxw(aemiVar.a);
                    ajxwVar.c = aapfVar;
                    defpackage.aogc aogcVar = new defpackage.aogc(defpackage.aify.p(new defpackage.afeh(ajxwVar)));
                    defpackage.afhj afhjVar = defpackage.afhj.a;
                    java.util.HashMap map = new java.util.HashMap();
                    java.util.concurrent.ExecutorService executorService = aemiVar.b;
                    defpackage.agab.ag(defpackage.afgv.a, map);
                    defpackage.ahbz ahbzVar = new defpackage.ahbz(executorService, aogcVar, afhjVar, map);
                    defpackage.ajje ajjeVar = new defpackage.ajje((char[]) null);
                    android.content.Context context = aemiVar.a;
                    defpackage.ahvr.ci(context);
                    ajjeVar.a = context;
                    java.util.concurrent.ExecutorService executorService2 = aemiVar.b;
                    defpackage.ahvr.ci(executorService2);
                    ajjeVar.d = executorService2;
                    ajjeVar.e = aogcVar;
                    ajjeVar.c = ahbzVar;
                    ajjeVar.f = "OneGoogle";
                    android.os.Handler handler = aemiVar.d;
                    if (handler != null) {
                        ajjeVar.b = handler;
                    }
                    java.lang.Object obj2 = ajjeVar.a;
                    defpackage.ahvr.cj(obj2, "An application context must be provided.");
                    ?? r12 = ajjeVar.d;
                    defpackage.ahvr.cj(r12, "A I/O executor must be provided.");
                    java.lang.Object obj3 = ajjeVar.c;
                    defpackage.ahvr.cj(obj3, "A PDS factory must be provided.");
                    java.lang.Object obj4 = ajjeVar.e;
                    defpackage.ahvr.cj(obj4, "A file storage must be provided.");
                    java.lang.Object obj5 = ajjeVar.f;
                    defpackage.ahvr.cj(obj5, "An instance id must be provided.");
                    android.content.Context context2 = (android.content.Context) obj2;
                    defpackage.adag adagVar = new defpackage.adag(context2, new defpackage.apnt(ajjeVar, context2));
                    new defpackage.abrz(ajjeVar);
                    defpackage.aazc aazcVar = new defpackage.aazc(null);
                    java.lang.Object handler2 = ajjeVar.b;
                    if (handler2 == null) {
                        android.os.HandlerThread handlerThread = new android.os.HandlerThread("ProtoDataStore-Message-Handler");
                        handlerThread.start();
                        handler2 = new android.os.Handler(handlerThread.getLooper());
                    }
                    defpackage.afgh afghVar = new defpackage.afgh();
                    afghVar.a = context2.getApplicationContext();
                    afghVar.c = "com.google.android.gms.permission.INTERNAL_BROADCAST";
                    afghVar.b = new defpackage.uqd(i2);
                    afghVar.d = (android.os.Handler) handler2;
                    defpackage.afgk afgkVar = new defpackage.afgk(afghVar);
                    defpackage.acxg acxgVar = defpackage.aatj.a;
                    aemiVar.h = new defpackage.adak(context2, r12, (java.lang.String) obj5, (defpackage.aogc) obj4, (defpackage.ahbz) obj3, adagVar, aazcVar, afgkVar, new defpackage.abce(context2, (byte[]) null));
                }
                aemsVar = new defpackage.aems(new defpackage.aenc(new defpackage.aemm(aemiVar.a, aemiVar.h, new defpackage.aemb(aemiVar.a, aemiVar.b), defpackage.ahyn.h(adaiVar)), 1, adaiVar, aemiVar.a.getPackageName(), 0), aencVar);
                break;
                break;
            case 4:
                return ((android.content.Context) this.a).getSharedPreferences("primes", 0);
            case 5:
                return (java.lang.Boolean) this.a.a();
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return defpackage.aify.x(j$.util.Comparator.-CC.comparing(new adci(8), j$.util.Comparator.-CC.reverseOrder()), (java.lang.Iterable) this.a.a());
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                java.lang.Object obj6 = this.a;
                int i3 = defpackage.aesh.a;
                long j = defpackage.aesg.e;
                if (j == 0) {
                    synchronized (defpackage.aesg.class) {
                        j = defpackage.aesg.e;
                        if (j == 0) {
                            float fFloatValue = ((java.lang.Float) defpackage.aesg.a((android.content.Context) obj6).d(java.lang.Float.valueOf(60.0f))).floatValue();
                            long jCeil = (long) java.lang.Math.ceil(1.0E9d / ((double) (fFloatValue >= 1.0f ? fFloatValue : 60.0f)));
                            defpackage.aesg.e = jCeil;
                            j = jCeil;
                        }
                        break;
                    }
                }
                return java.lang.Long.valueOf(j);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return defpackage.aepw.a(((defpackage.aetl) this.a).b, "getMemoryUsageMetric");
            case 9:
                return (defpackage.aesx) this.a.a();
            case 10:
                java.util.concurrent.atomic.AtomicReference atomicReference = defpackage.aewq.a;
                defpackage.acxg acxgVar2 = defpackage.aasr.a;
                aemsVar = new defpackage.aexl(new defpackage.aata((android.content.Context) this.a));
                break;
            case 11:
                java.util.concurrent.atomic.AtomicReference atomicReference2 = defpackage.aewq.a;
                return (defpackage.aezm) ((defpackage.ahyn) this.a.eZ()).e();
            case 12:
                java.lang.Object obj7 = ((defpackage.ajje) this.a).d;
                java.util.concurrent.atomic.AtomicReference atomicReference3 = defpackage.aewq.a;
                try {
                    return defpackage.ahyn.h(((android.content.Context) obj7).getPackageManager().getApplicationInfo("com.google.android.gms", 0));
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    return defpackage.ahwt.a;
                }
            case 13:
                return (defpackage.ajcu) this.a.a();
            case 14:
                return (defpackage.ahyn) this.a.a();
            case 15:
                return (defpackage.aogc) this.a.a();
            case 16:
                int i4 = defpackage.aexb.d;
                return defpackage.aewm.a((android.content.Context) this.a);
            case 17:
                java.lang.Object obj8 = this.a;
                defpackage.aezw aezwVar = (defpackage.aezw) obj8;
                defpackage.ajcu ajcuVar = (defpackage.ajcu) aezwVar.d.eZ();
                ajcuVar.getClass();
                defpackage.aexi aexiVar = (defpackage.aexi) aezwVar.c.eZ();
                aexiVar.getClass();
                defpackage.ajck ajckVarX = defpackage.ajck.w(aexiVar.e()).u(defpackage.aexj.class, new defpackage.adcu(20), ajcuVar).x(new defpackage.vut(obj8, 15), ajcuVar);
                ajckVarX.c(new defpackage.abqg(ajckVarX, 14), ajcuVar);
                return ajckVarX;
            case 18:
                defpackage.ajcu ajcuVar2 = (defpackage.ajcu) this.a.eZ();
                defpackage.ahvr.ci(ajcuVar2);
                return ajcuVar2.schedule(new defpackage.aczf(10), 10000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            case 19:
                defpackage.afaa afaaVar = (defpackage.afaa) this.a;
                return afaaVar.b(afaaVar.a);
            default:
                defpackage.agsm agsmVar = (defpackage.agsm) this.a;
                java.util.Map map2 = agsmVar.d;
                java.lang.String strA = agsmVar.a();
                defpackage.ahvr.cc(map2.containsKey(strA), "If you are using AndroidFutures on %s process, please load and call the generated_android_futures_services macro and name those processes.", strA);
                return new android.content.Intent(agsmVar.c, (java.lang.Class<?>) ((defpackage.aoin) map2.get(strA)).a());
        }
        return aemsVar;
    }
}
