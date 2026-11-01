package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class advc extends android.content.BroadcastReceiver {
    public static final aiof a = aiof.i("GnpSdk");
    private static final java.util.concurrent.atomic.AtomicBoolean b = new java.util.concurrent.atomic.AtomicBoolean(false);

    public abstract defpackage.advd a(android.content.Context context);

    public abstract defpackage.adve b(android.content.Context context);

    public abstract java.lang.String c();

    public final void d(android.content.Intent intent, defpackage.advd advdVar, defpackage.aduc aducVar, long j, adxk adxkVar) {
        aimp aimpVar = a;
        aimpVar.b().y("Executing async action [%s] in Coroutine Scope.", intent.getAction());
        try {
            int threadPriority = android.os.Process.getThreadPriority(0);
            try {
                android.os.Process.setThreadPriority(10);
                aolr aolrVarIg = adxkVar.ig();
                aooh.e(aolrVarIg, "getGnpBlockingContext(...)");
                aoov.ah(aolrVarIg, new defpackage.advb(advdVar, intent, aducVar, j, (aoln) null, 0));
                android.os.Process.setThreadPriority(threadPriority);
            } catch (java.lang.Throwable th) {
                android.os.Process.setThreadPriority(threadPriority);
                throw th;
            }
        } catch (java.lang.Exception e) {
            try {
                adxm adxmVarEy = adxkVar.ey();
                defpackage.adxn adxnVarO = adxkVar.ol().o(e);
                ((defpackage.adxp) adxnVarO).r = c();
                adxmVarEy.a(adxnVarO);
            } catch (java.lang.Exception unused) {
            }
            aimpVar = a;
            aimpVar.d().k(e).y("Failed to handle async action [%s] in Coroutine Scope.", intent.getAction());
        }
        aimpVar.b().y("Finished executing async action [%s] in Coroutine Scope.", intent.getAction());
    }

    public abstract boolean e(android.content.Context context);

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, final android.content.Intent intent) {
        final defpackage.advc advcVar;
        aooh.f(context, "context");
        if (intent == null) {
            hgb.b(a.c(), "Null Intent received.", new java.lang.IllegalArgumentException());
            return;
        }
        final long micros = java.util.concurrent.TimeUnit.MILLISECONDS.toMicros(j$.time.Instant.now().toEpochMilli());
        defpackage.aduc aducVarA = defpackage.aduc.a((intent.getFlags() & 268435456) > 0 ? 8500L : 58500L);
        aiof aiofVar = a;
        aiofVar.b().I("Intent received for action [%s] package [%s].", intent.getAction(), context.getApplicationContext().getPackageName());
        try {
            final adxk adxkVarA = defpackage.adxj.a(context);
            aooh.c(adxkVarA);
            adxkVarA.eG().a(context);
            aiofVar.b().v("Phenotype initialized.");
            ahpm ahpmVarA = adxkVarA.ev().a("GnpBroadcastReceiver");
            try {
                adxkVarA.ew();
                if (e(context)) {
                    aiofVar.b().v("BroadcastReceiver disabled by host app in GnpConfig");
                    ajsz.ak(ahpmVarA, (java.lang.Throwable) null);
                    return;
                }
                if (b(context).a(intent)) {
                    aiofVar.b().y("Validation OK for action [%s].", intent.getAction());
                    defpackage.adwy adwyVarEx = adxkVarA.ex();
                    final defpackage.advd advdVarA = a(context);
                    if (agab.bB(context)) {
                        advcVar = this;
                        final aoot aootVar = new aoot();
                        aootVar.a = aducVarA;
                        if (b.compareAndSet(false, true)) {
                            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - aa$.ExternalSyntheticApiModelOutline1.m();
                            if (jElapsedRealtime <= anfn.a.b().a()) {
                                if (!aducVarA.c()) {
                                    defpackage.adtu adtuVar = new defpackage.adtu();
                                    adtuVar.a = java.lang.Long.valueOf(java.lang.Math.max(0L, aducVarA.a.longValue() - jElapsedRealtime));
                                    adtuVar.b(aducVarA.b);
                                    aducVarA = adtuVar.a();
                                }
                                aootVar.a = aducVarA;
                            }
                        }
                        adwyVarEx.a(advcVar.goAsync(), advcVar.isOrderedBroadcast(), new java.lang.Runnable() { // from class: adva
                            @Override // java.lang.Runnable
                            public final void run() {
                                aiob aiobVarB = defpackage.advc.a.b();
                                android.content.Intent intent2 = intent;
                                aiobVarB.y("Executing action in BroadcastReceiver [%s].", intent2.getAction());
                                advcVar.d(intent2, advdVarA, (defpackage.aduc) aootVar.a, micros, adxkVarA);
                            }
                        }, (defpackage.aduc) aootVar.a);
                    } else {
                        advcVar = this;
                        adwyVarEx.b(new java.lang.Runnable() { // from class: aduz
                            @Override // java.lang.Runnable
                            public final void run() {
                                aiob aiobVarB = defpackage.advc.a.b();
                                android.content.Intent intent2 = intent;
                                aiobVarB.y("Executing action in Service [%s].", intent2.getAction());
                                advcVar.d(intent2, advdVarA, defpackage.aduc.b(), micros, adxkVarA);
                            }
                        });
                    }
                } else {
                    aiofVar.b().y("Validation failed for action [%s].", intent.getAction());
                    advcVar = this;
                }
                ajsz.ak(ahpmVarA, (java.lang.Throwable) null);
                if (advcVar.isOrderedBroadcast()) {
                    advcVar.setResultCode(-1);
                }
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    ajsz.ak(ahpmVarA, th);
                    throw th2;
                }
            }
        } catch (java.lang.RuntimeException e) {
            hgb.b(a.d(), "BroadcastReceiver stopped", e);
        }
    }
}
