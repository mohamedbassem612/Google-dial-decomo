package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class afgu implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ afgu(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v30, types: [agxe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r14v13, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r14v20, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r14v27, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r14v45, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v85, types: [java.lang.Object, java.util.concurrent.Callable] */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() throws java.lang.Exception {
        akzx akzxVarM;
        defpackage.aljc aljcVar;
        int i = -1;
        android.content.ComponentName componentNameStartService = null;
        java.lang.Object[] objArr = 0;
        switch (this.$cid) {
            case 0:
                this.a.close();
                return aiql.H((java.util.concurrent.Future) this.b);
            case 1:
                byte[] bArr = afgb.a;
                java.lang.Object obj = this.b;
                try {
                    ajrw ajrwVar = new ajrw((byte[]) this.a, ajst.b(new byte[0]));
                    byte[] bArrB = aisk.b((java.io.InputStream) obj);
                    if (bArrB == null) {
                        throw new java.lang.NullPointerException("ciphertext is null");
                    }
                    byte[] bArr2 = ajrwVar.b;
                    int length = bArr2.length;
                    int i2 = length + 28;
                    int length2 = bArrB.length;
                    if (length2 < i2) {
                        throw new java.security.GeneralSecurityException("ciphertext too short");
                    }
                    if (!ajnf.a(bArr2, bArrB)) {
                        throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
                    }
                    java.security.spec.AlgorithmParameterSpec algorithmParameterSpecC = ajhy.c(bArrB, length);
                    javax.crypto.SecretKey secretKey = ajrwVar.a;
                    javax.crypto.Cipher cipherA = ajhy.a();
                    cipherA.init(2, secretKey, algorithmParameterSpecC);
                    byte[] bArrDoFinal = cipherA.doFinal(bArrB, length + 12, (length2 - length) - 12);
                    ((java.io.InputStream) obj).close();
                    return bArrDoFinal;
                } catch (java.lang.Throwable th) {
                    ((java.io.InputStream) obj).close();
                    throw th;
                }
            case 2:
                return ((defpackage.afmo) this.b).a((android.accounts.Account) ((ahys) this.a).a);
            case 3:
                agpc agpcVar = (agpc) aiql.H((java.util.concurrent.Future) this.b);
                return (agpcVar.b & 1) != 0 ? agxh.a((java.util.List) aiql.H((java.util.concurrent.Future) this.a), j$.time.Instant.ofEpochMilli(agpcVar.c)) : agxh.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                java.util.Iterator it = this.a.iterator();
                while (true) {
                    java.lang.Object obj2 = this.b;
                    if (!it.hasNext()) {
                        return ((aift) obj2).h();
                    }
                    agoq agoqVar = (agoq) aiql.H((ajcq) it.next());
                    if (agoqVar != null) {
                        ((aift) obj2).i(agoqVar);
                    }
                }
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.agqo agqoVar = (defpackage.agqo) this.b;
                java.io.File file = new java.io.File(agqoVar.d.k((ahkk) this.a), defpackage.agqo.a(agqoVar.b));
                file.mkdirs();
                return file;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                ?? r0 = this.a;
                ?? r14 = this.b;
                aimz aimzVar = defpackage.agqp.a;
                aiql.H((java.util.concurrent.Future) r14);
                aiql.H((java.util.concurrent.Future) r0);
                return null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                this.a.run();
                return this.b;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                java.lang.ThreadLocal threadLocal = ((defpackage.agvu) this.b).a;
                java.lang.Object objCall = this.a.call();
                java.lang.Throwable th2 = (java.lang.Throwable) threadLocal.get();
                threadLocal.remove();
                if (th2 != null) {
                    throw th2;
                }
                return objCall;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return this.b.a((apni) ((aogc) this.a).c);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                java.lang.Object obj3 = this.b;
                ahlm ahlmVar = (ahlm) obj3;
                ahlmVar.b.writeLock().lock();
                ?? r15 = this.a;
                try {
                    ahmp ahmpVarA = ahmp.a;
                    try {
                        try {
                            ahmpVarA = ((ahlm) obj3).a();
                        } catch (java.io.IOException e) {
                            if (!((ahlm) obj3).g(e)) {
                                ahlm.a.c().k(e).l("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "removeSyncRequests", 446, "SyncManagerDataStore.java").v("Unable to read or clear store. Cannot remove account.");
                            }
                            ahlmVar.b.writeLock().unlock();
                            return null;
                        }
                        ((ahlm) obj3).f(akzxVarM.p());
                        break;
                    } catch (java.io.IOException e2) {
                        ahlm.a.c().k(e2).l("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "removeSyncRequests", 466, "SyncManagerDataStore.java").v("Error writing sync data file. Cannot remove account.");
                    }
                    akzxVarM = ahmp.a.m();
                    akzxVarM.z(ahmpVarA);
                    akzxVarM.u();
                    akzxVarM.b.d = albq.a;
                    for (ahmo ahmoVar : ahmpVarA.d) {
                        ahmr ahmrVar = ahmoVar.c;
                        if (ahmrVar == null) {
                            ahmrVar = ahmr.a;
                        }
                        if (!r15.contains(new ahlv(ahmrVar))) {
                            akzxVarM.ar(ahmoVar);
                        }
                    }
                    ahlmVar.b.writeLock().unlock();
                    return null;
                } catch (java.lang.Throwable th3) {
                    ahlmVar.b.writeLock().unlock();
                    throw th3;
                }
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                java.lang.Object obj4 = this.b;
                java.lang.Object obj5 = ((ahlt) obj4).h;
                ?? r16 = this.a;
                synchronized (obj5) {
                    java.util.Iterator it2 = r16.keySet().iterator();
                    while (it2.hasNext()) {
                    }
                    break;
                }
                return null;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                defpackage.ajxr ajxrVarA = defpackage.ajxr.a();
                if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                    android.util.Log.d("FirebaseMessaging", "Starting service");
                }
                java.lang.Object obj6 = this.a;
                java.lang.Object obj7 = this.b;
                ajxrVarA.c.offer(obj6);
                android.content.Intent intent = new android.content.Intent("com.google.firebase.MESSAGING_EVENT");
                android.content.Context context = (android.content.Context) obj7;
                intent.setPackage(context.getPackageName());
                java.lang.String strB = ajxrVarA.b(context, intent);
                if (strB != null) {
                    if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                        android.util.Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(strB));
                    }
                    intent.setClassName(context.getPackageName(), strB);
                }
                try {
                    if (ajxrVarA.c((android.content.Context) obj7)) {
                        synchronized (defpackage.ajyb.b) {
                            defpackage.ajyb.a((android.content.Context) obj7);
                            boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                            intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                            android.content.ComponentName componentNameStartService2 = ((android.content.Context) obj7).startService(intent);
                            if (componentNameStartService2 != null) {
                                if (!booleanExtra) {
                                    defpackage.ajyb.c.a(defpackage.ajyb.a);
                                }
                                componentNameStartService = componentNameStartService2;
                            }
                        }
                    } else {
                        componentNameStartService = ((android.content.Context) obj7).startService(intent);
                        android.util.Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (componentNameStartService == null) {
                        android.util.Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i = 404;
                    }
                } catch (java.lang.IllegalStateException e3) {
                    android.util.Log.e("FirebaseMessaging", "Failed to start service while in background: ".concat(e3.toString()));
                    i = 402;
                } catch (java.lang.SecurityException e4) {
                    android.util.Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e4);
                    i = 401;
                }
                return java.lang.Integer.valueOf(i);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return ((akxa) this.a).c((ajcq) this.b);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                byte[] bArr3 = new byte[65536];
                while (true) {
                    aljcVar = (defpackage.aljc) this.b;
                    if (!aljcVar.d.get()) {
                        int i3 = ((java.io.InputStream) this.a).read(bArr3, 0, 65536);
                        if (i3 == -1) {
                            defpackage.aljc.a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/core/impl/AudioMulticaster", "runOnAudioInput", 117, "AudioMulticaster.java").v("Failed to read from input stream: input stream is broken.");
                        } else {
                            java.util.Iterator it3 = aljcVar.c.values().iterator();
                            while (it3.hasNext()) {
                                ((java.io.OutputStream) it3.next()).write(bArr3, 0, i3);
                            }
                        }
                    }
                }
                java.util.Iterator it4 = aljcVar.c.values().iterator();
                while (it4.hasNext()) {
                    ((java.io.OutputStream) it4.next()).close();
                }
                return null;
            case 15:
                byte[] bArr4 = new byte[65536];
                while (!((alji) this.a).b.get()) {
                    ((aliv) this.b).read(bArr4, 0, 65536);
                }
                return null;
            case 16:
                j$.util.Optional optionalOf = j$.util.Optional.of(((defpackage.aljc) this.b).a());
                defpackage.aljo aljoVar = (defpackage.aljo) this.a;
                aljoVar.d = optionalOf;
                if (aljoVar.d.isEmpty()) {
                    return null;
                }
                java.lang.Object obj8 = aljoVar.d.get();
                byte[] bArr5 = new byte[65536];
                while (!aljoVar.e.get()) {
                    int i4 = ((java.io.InputStream) obj8).read(bArr5, 0, 65536);
                    if (i4 == -1) {
                        defpackage.aljo.a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/AudioRouterImpl", "runOnAudioInput", 72, "AudioRouterImpl.java").v("Input stream broken.");
                        return null;
                    }
                    byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr5, i4);
                    ailj ailjVarK = aljoVar.b.k();
                    while (ailjVarK.hasNext()) {
                        aljoVar.f.c(new defpackage.afgu((aljm) ailjVarK.next(), bArrCopyOf, 17, objArr == true ? 1 : 0), j$.util.Optional.of(new aljn(aljoVar, 2, (byte[]) null)));
                    }
                }
                return null;
            case 17:
                ((aljm) this.b).c((byte[]) this.a);
                return null;
            case 18:
                java.lang.Object obj9 = ((j$.util.Optional) this.a).get();
                j$.util.Optional optionalOf2 = j$.util.Optional.of(obj9);
                defpackage.aljo aljoVar2 = ((aljp) this.b).c;
                aljoVar2.c = optionalOf2;
                aljoVar2.e.set(false);
                try {
                    aljoVar2.f.c(new defpackage.afgu(aljoVar2, obj9, 16), j$.util.Optional.of(new aljn(aljoVar2, 0)));
                    return null;
                } catch (aljs e5) {
                    a.by(defpackage.aljo.a.c(), "Consuming input stream failed.", "com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/AudioRouterImpl", "start", ';', "AudioRouterImpl.java", e5);
                    return null;
                }
            case 19:
                alpg alpgVar = (alpg) ((amac) this.b).a;
                boolean zA = alpgVar.a();
                java.lang.Object objCall2 = this.a.call();
                if (!zA) {
                    return objCall2;
                }
                alpgVar.b();
                return objCall2;
            default:
                alim alimVar = alim.a;
                return ((defpackage.alqd) this.b).a(alad.M(alim.class), amey.a((java.lang.String) ((amey) this.a).d.orElse("model_info.pb")));
        }
    }

    public /* synthetic */ afgu(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
