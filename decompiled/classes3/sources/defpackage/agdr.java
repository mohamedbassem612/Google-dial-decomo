package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agdr implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public agdr(com.google.android.material.textfield.TextInputLayout textInputLayout, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(textInputLayout);
        this.a = textInputLayout;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:76:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:79:0x0201 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x0203 A[Catch: all -> 0x0215, TryCatch #2 {, blocks: (B:71:0x01e0, B:74:0x01ec, B:78:0x01fb, B:81:0x0211, B:80:0x0203), top: B:124:0x01e0 }] */
    /* JADX WARN: Type inference failed for: r9v19, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v43, types: [ajcq, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        boolean z;
        int iOrdinal;
        int i = 0;
        switch (this.$cid) {
            case 0:
                com.google.android.material.internal.CheckableImageButton checkableImageButton = ((com.google.android.material.textfield.TextInputLayout) this.a).b.d;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 1:
                ((com.google.android.material.textfield.TextInputLayout) this.a).c.requestLayout();
                return;
            case 2:
                com.google.android.setupdesign.GlifLayout glifLayout = (com.google.android.setupdesign.GlifLayout) this.a;
                glifLayout.t(!((java.lang.Boolean) glifLayout.p().orElse(java.lang.Boolean.FALSE)).booleanValue());
                return;
            case 3:
                com.airbnb.lottie.LottieAnimationView lottieAnimationView = ((defpackage.agia) this.a).a;
                if (lottieAnimationView != null) {
                    lottieAnimationView.o(0.0f, true);
                    android.os.Trace.beginSection("IconMixin#playAnimation");
                    try {
                        lottieAnimationView.e();
                        return;
                    } finally {
                        android.os.Trace.endSection();
                    }
                }
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                ((defpackage.xrr) this.a).e();
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                android.content.Context context = ((defpackage.agsa) this.a).b;
                java.lang.String[] strArrDatabaseList = context.databaseList();
                int length = strArrDatabaseList.length;
                while (i < length) {
                    java.lang.String str = strArrDatabaseList[i];
                    if (str.startsWith("SqliteKeyValueCache:") && str.endsWith(":Singleton") && !str.endsWith("-wal") && !str.endsWith("-shm")) {
                        if (context.deleteDatabase(str)) {
                            defpackage.agsa.a.b().l("com/google/apps/tiktok/cache/OrphanCacheSingletonSynclet", "wipeLegacy", 75, "OrphanCacheSingletonSynclet.java").y("Removed orphaned cache file: %s", str);
                        } else {
                            defpackage.agsa.a.c().l("com/google/apps/tiktok/cache/OrphanCacheSingletonSynclet", "wipeLegacy", 77, "OrphanCacheSingletonSynclet.java").y("Failed to remove orphaned cache file: %s", str);
                        }
                    }
                    i++;
                }
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                agsm.b((ajcq) this.a);
                return;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                java.lang.Object obj = this.a;
                defpackage.agsu agsuVar = (defpackage.agsu) obj;
                boolean zB = agsuVar.e.b();
                synchronized (agsuVar.b) {
                    if (!zB) {
                        z = ((defpackage.agsu) obj).c.isEmpty() ? false : true;
                        iOrdinal = ((defpackage.agsu) obj).j.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal == 2 && !z) {
                                ((defpackage.agsu) obj).d();
                            }
                        } else if (z) {
                            ((defpackage.agsu) obj).b(((defpackage.agsu) obj).a(null).a);
                        }
                        break;
                    } else {
                        iOrdinal = ((defpackage.agsu) obj).j.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal == 2) {
                                ((defpackage.agsu) obj).d();
                            }
                        } else if (z) {
                            ((defpackage.agsu) obj).b(((defpackage.agsu) obj).a(null).a);
                        }
                        break;
                    }
                    throw th;
                }
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                throw ((java.lang.Throwable) this.a);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                throw ((java.lang.Throwable) this.a);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                java.lang.Object obj2 = this.a;
                ailj ailjVarK = ((defpackage.agzq) obj2).b.e().k();
                while (ailjVarK.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) ailjVarK.next();
                    defpackage.agza agzaVar = (defpackage.agza) entry.getKey();
                    defpackage.amdx amdxVar = (defpackage.amdx) entry.getValue();
                    defpackage.achb achbVar = new defpackage.achb(agzaVar, 6);
                    agzo agzoVar = new agzo(obj2, amdxVar, 0);
                    afec.c();
                    ahvr.cj(amdxVar.a, "LocalSubscriptionStateReference used after free.");
                    ahyn ahynVar = ((defpackage.agzr) amdxVar.a).c;
                    if (ahynVar.f()) {
                        amdxVar.a = ((defpackage.agzr) amdxVar.a).a((defpackage.agzu) ahynVar.b());
                    }
                    defpackage.agzr agzrVar = (defpackage.agzr) amdxVar.a;
                    ahyn ahynVar2 = agzrVar.d;
                    ahyn ahynVar3 = agzrVar.b;
                    if (ahynVar2.f()) {
                        aa$.ExternalSyntheticApiModelOutline1.m(achbVar, ahynVar2.b());
                    }
                    if (ahynVar3.f()) {
                        aa$.ExternalSyntheticApiModelOutline1.m(agzoVar, ahynVar3.b());
                    }
                }
                return;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                throw ((java.lang.Throwable) this.a);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                afec.c();
                defpackage.agzq agzqVar = (defpackage.agzq) this.a;
                ahvr.bZ(agzqVar.h == 1, "Duplicate or leaked callback task.");
                aift aiftVar = new aift(4);
                agzqVar.h = 2;
                acc accVar = agzqVar.f;
                acb acbVar = new acb(accVar);
                while (acbVar.hasNext()) {
                    defpackage.amdx amdxVar2 = (defpackage.amdx) acbVar.next();
                    afec.c();
                    ahvr.cj(amdxVar2.a, "LocalSubscriptionStateReference used after free.");
                    ahvr.bZ(((defpackage.agzr) amdxVar2.a).c.f(), "Isolation failure in updateToPublish(). The state to publish has gone missing. Please report this error as a P1 bug at go/tiktok-bug.");
                    defpackage.agzr agzrVar2 = (defpackage.agzr) amdxVar2.a;
                    amdxVar2.a = agzrVar2.a((defpackage.agzu) agzrVar2.c.b());
                    aiftVar.i(new defpackage.agzp((defpackage.agza) agzqVar.b.d.get(amdxVar2), (defpackage.agzu) ((defpackage.agzr) amdxVar2.a).d.b()));
                }
                accVar.clear();
                aike aikeVarH = aiftVar.h();
                int i2 = aikeVarH.d;
                while (i < i2) {
                    defpackage.agzp agzpVar = (defpackage.agzp) aikeVarH.get(i);
                    try {
                        defpackage.agzq.a(agzpVar.a, agzpVar.b);
                    } catch (java.lang.Throwable th) {
                        agzqVar.c.execute(ahqx.h(new defpackage.agdr(th, 12)));
                    }
                    i++;
                }
                return;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                defpackage.agzq agzqVar2 = (defpackage.agzq) this.a;
                ailj ailjVarK2 = agzqVar2.b.d().k();
                while (ailjVarK2.hasNext()) {
                    agzqVar2.d((defpackage.amdx) ailjVarK2.next());
                }
                return;
            case 15:
                defpackage.agzq agzqVar3 = (defpackage.agzq) this.a;
                agzqVar3.h = 3;
                acb acbVar2 = new acb(agzqVar3.g);
                while (acbVar2.hasNext()) {
                    ((ajcq) acbVar2.next()).cancel(false);
                }
                agzqVar3.g = null;
                return;
            case 16:
                ((defpackage.agzv) this.a).b();
                return;
            case 17:
                java.lang.Object obj3 = this.a;
                if (ahns.q()) {
                    ((defpackage.aheo) obj3).a(false);
                    return;
                }
                ahok ahokVarF = ((ahpz) ((defpackage.aheo) obj3).g.a()).f(1376, "StartupAfterPackageReplacedUnlock");
                try {
                    ((defpackage.aheo) obj3).a(false);
                    ajsz.ak(ahokVarF, (java.lang.Throwable) null);
                    return;
                } catch (java.lang.Throwable th2) {
                    try {
                        throw th2;
                    } catch (java.lang.Throwable th3) {
                        ajsz.ak(ahokVarF, th2);
                        throw th3;
                    }
                }
            case 18:
                ahlt.k((ajcq) this.a);
                return;
            case 19:
                ((ahro) this.a).g.cancel(false);
                return;
            default:
                ((defpackage.ahqq) this.a).a();
                return;
        }
        while (true) {
            defpackage.agoj agojVar = (defpackage.agoj) this.a;
            if (i >= agojVar.b) {
                return;
            }
            ((ajcq) agojVar.a.get(i)).cancel(true);
            i++;
        }
    }

    public /* synthetic */ agdr(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
