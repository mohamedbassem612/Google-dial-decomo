package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agtn extends defpackage.eoa {
    public final java.util.concurrent.Executor a;
    public final java.util.Set c;
    private final android.content.Context f;
    public final defpackage.agti b = new defpackage.agti("FuturesMixinRF");
    public boolean e = false;
    public final int d = android.os.Process.myPid();

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    /* JADX WARN: Code duplicated, block: B:9:0x0058  */
    public agtn(defpackage.enr enrVar, android.content.Context context, java.util.concurrent.Executor executor) throws afeb {
        defpackage.ahyn ahysVar;
        int iIntValue;
        agtp illegalStateException;
        this.a = executor;
        this.f = context;
        android.os.Bundle bundle = (android.os.Bundle) enrVar.a("future_saved_state");
        if (bundle != null) {
            int i = bundle.getInt("last_process_id");
            android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                java.util.List listM = baa$.ExternalSyntheticApiModelOutline1.m(activityManager, context.getPackageName(), i, 1);
                if (listM.isEmpty()) {
                    ahysVar = defpackage.ahwt.a;
                } else {
                    ahysVar = new defpackage.ahys(java.lang.Integer.valueOf(baa$.ExternalSyntheticApiModelOutline1.m$2(baa$.ExternalSyntheticApiModelOutline1.m(listM.get(0)))));
                }
            } else {
                ahysVar = defpackage.ahwt.a;
            }
            com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture[] parcelableArray = bundle.getParcelableArray("future_wrappers");
            this.c = new java.util.HashSet(parcelableArray.length);
            for (com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture parcelableFuture : parcelableArray) {
                if (parcelableFuture.c.f() && (iIntValue = ((java.lang.Integer) parcelableFuture.c.b()).intValue()) != 1) {
                    if (iIntValue == 2) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("ParcelableFuture was Parceled by a lifecycle change before it completed.");
                        if (ahysVar.f()) {
                            sb.append(" process exit reason code: ");
                            sb.append(ahysVar.b());
                        }
                        illegalStateException = new agtp(sb.toString(), ahysVar);
                    } else {
                        illegalStateException = new java.lang.IllegalStateException(defpackage.a.bj(iIntValue, "ParcelableFuture read in unexpected value for hasResult: "));
                    }
                    parcelableFuture.b(illegalStateException);
                }
                this.c.add(parcelableFuture);
            }
        } else {
            this.c = new java.util.HashSet(1);
        }
        this.b.e(bundle);
        enrVar.e("future_saved_state", new defpackage.bf(this, 6));
    }

    public static void a(defpackage.agtk agtkVar, com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture parcelableFuture) {
        defpackage.ahoq ahoqVarX = defpackage.ahvr.X(1317, "onPending FuturesMixin", defpackage.ahot.a, true);
        try {
            defpackage.agsv agsvVarA = defpackage.agsw.a();
            try {
                agtkVar.b(parcelableFuture.d);
                agsvVarA.close();
                ahoqVarX.close();
            } catch (java.lang.Throwable th) {
                try {
                    agsvVarA.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            try {
                ahoqVarX.close();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    final void b(defpackage.ajcq ajcqVar, java.lang.Object obj, defpackage.agtk agtkVar) throws afeb {
        defpackage.afec.c();
        defpackage.ahvr.T();
        com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture parcelableFuture = new com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture(this.b.a(agtkVar), obj, ajcqVar);
        this.c.add(parcelableFuture);
        if (this.e) {
            parcelableFuture.c(this);
            if (ajcqVar.isDone()) {
                return;
            }
            a(agtkVar, parcelableFuture);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public final void c(defpackage.agtk agtkVar) throws afeb {
        this.b.d(agtkVar);
    }
}
