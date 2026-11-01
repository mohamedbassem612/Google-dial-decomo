package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class yne implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public yne(defpackage.aprf aprfVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aprfVar);
        this.a = aprfVar;
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    /* JADX WARN: Type inference failed for: r7v4, types: [ajcq, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        switch (this.$cid) {
            case 0:
                defpackage.ynf ynfVar = (defpackage.ynf) this.a;
                ynfVar.b.a(ynfVar.a);
                return;
            case 1:
                this.a.cancel(false);
                return;
            case 2:
                zpz zpzVar = (zpz) ((defpackage.pgr) this.a).a;
                zpzVar.d = false;
                zpy zpyVar = zpzVar.b;
                ahoq ahoqVarW = ahvr.W(1234, "InCallProductionComponentAuthorityImpl_postNewPrimaryCallGraph");
                try {
                    j$.util.Optional optionalH = ((zpm) zpyVar.a.a()).h();
                    if (true == optionalH.isPresent()) {
                        optionalH = j$.util.Optional.ofNullable(((defpackage.zpx) ((defpackage.apqr) optionalH.get()).a(defpackage.zpx.class)).lD().Y());
                    }
                    zpyVar.b.set(optionalH);
                    j$.lang.Iterable.-EL.forEach(zpyVar.c.e(), new defpackage.uwm(11));
                    ahoqVarW.close();
                    return;
                } catch (java.lang.Throwable th) {
                    try {
                        ahoqVarW.close();
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            case 3:
                java.lang.Object obj = this.a;
                while (true) {
                    synchronized (obj) {
                        if (((defpackage.aabg) obj).a != 2) {
                            return;
                        }
                        java.util.Queue queue = ((defpackage.aabg) obj).c;
                        if (queue.isEmpty()) {
                            ((defpackage.aabg) obj).d();
                            return;
                        }
                        defpackage.aabi aabiVar = (defpackage.aabi) queue.poll();
                        android.util.SparseArray sparseArray = ((defpackage.aabg) obj).d;
                        int i = aabiVar.a;
                        sparseArray.put(i, aabiVar);
                        ((defpackage.aabg) obj).e.c.schedule(new defpackage.wdm(obj, aabiVar, 13), 30L, java.util.concurrent.TimeUnit.SECONDS);
                        if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
                            android.util.Log.d("MessengerIpcClient", "Sending ".concat(java.lang.String.valueOf(java.lang.String.valueOf(aabiVar))));
                        }
                        defpackage.aabg aabgVar = (defpackage.aabg) obj;
                        defpackage.afiq afiqVar = aabgVar.e;
                        android.os.Messenger messenger = aabgVar.b;
                        int i2 = aabiVar.b;
                        android.os.Message messageObtain = android.os.Message.obtain();
                        messageObtain.what = i2;
                        messageObtain.arg1 = i;
                        messageObtain.replyTo = messenger;
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putBoolean("oneWay", aabiVar.b());
                        bundle.putString("pkg", ((android.content.Context) afiqVar.b).getPackageName());
                        bundle.putBundle("data", aabiVar.c);
                        messageObtain.setData(bundle);
                        try {
                            defpackage.afpl afplVar = ((defpackage.aabg) obj).f;
                            java.lang.Object obj2 = afplVar.b;
                            if (obj2 != null) {
                                ((android.os.Messenger) obj2).send(messageObtain);
                            } else {
                                java.lang.Object obj3 = afplVar.a;
                                if (obj3 == null) {
                                    throw new java.lang.IllegalStateException("Both messengers are null");
                                }
                                ((com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat) obj3).b(messageObtain);
                            }
                        } catch (android.os.RemoteException e) {
                            aabgVar.g(e.getMessage());
                        }
                    }
                }
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                ((defpackage.aabg) this.a).b();
                return;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                ((defpackage.aabg) this.a).g("Service disconnected");
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                java.util.concurrent.Executor executor = aabo.a;
                if (((zzx) this.a).h(new java.io.IOException("TIMEOUT"))) {
                    android.util.Log.w("Rpc", "No response");
                    return;
                }
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                aacv aacvVar = ((aaeo) ((defpackage.aprf) this.a).a).b;
                aacvVar.n(java.lang.String.valueOf(aacvVar.getClass().getName()).concat(" disconnecting because it was signed out."));
                return;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                aafh aafhVar = (aafh) this.a;
                aafhVar.c = false;
                aafhVar.b = null;
                aafhVar.c();
                aafhVar.a.b(1);
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                ((defpackage.aafn) this.a).f.b(new com.google.android.gms.common.ConnectionResult(1, 4, (android.app.PendingIntent) null, (java.lang.String) null, (java.lang.Integer) null, (android.os.Bundle) null));
                return;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                java.lang.Object obj4 = this.a;
                synchronized (((defpackage.aaty) obj4).a) {
                    if (((defpackage.aaty) obj4).c()) {
                        aaoo aaooVar = defpackage.aaty.h;
                        aaoo.F("%s ** IS FORCE-RELEASED ON TIMEOUT **", new java.lang.Object[]{((defpackage.aaty) obj4).e});
                        ((defpackage.aaty) obj4).b();
                        if (((defpackage.aaty) obj4).c()) {
                            ((defpackage.aaty) obj4).b = 1;
                            ((defpackage.aaty) obj4).e();
                            return;
                        }
                        return;
                    }
                    return;
                }
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                java.lang.Object obj5 = this.a;
                synchronized (((aaud) obj5).a) {
                    ((aaud) obj5).b.b();
                    break;
                }
                return;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                ((defpackage.aawk) this.a).a("onPeerConnected");
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                ((defpackage.aawk) this.a).a("onPeerDisconnected");
                return;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                ((defpackage.aawk) this.a).a("onConnectedNodes");
                return;
            case 15:
                ((defpackage.aawk) this.a).a("onConnectedCapabilityChanged");
                return;
            case 16:
                ((defpackage.aawk) this.a).a("onNotificationReceived");
                return;
            case 17:
                ((defpackage.aawk) this.a).a("onEntityUpdate");
                return;
            case 18:
                try {
                    java.lang.Thread.sleep(600000L);
                    break;
                } catch (java.lang.InterruptedException e2) {
                    android.util.Log.e("AppDoctorRestartUtil", "Interrupted. Killing processes now.", e2);
                    java.lang.Thread.currentThread().interrupt();
                }
                defpackage.abcz.a((android.content.Context) this.a);
                defpackage.abcz.b();
                return;
            case 19:
                int i3 = abri.e;
                throw ((java.lang.Throwable) this.a);
            default:
                throw ((java.lang.Throwable) this.a);
        }
    }

    public /* synthetic */ yne(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public yne(defpackage.aafn aafnVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aafnVar);
        this.a = aafnVar;
    }

    public yne(aaud aaudVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aaudVar);
        this.a = aaudVar;
    }

    public yne(defpackage.aawk aawkVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aawkVar);
        this.a = aawkVar;
    }

    public yne(defpackage.aawk aawkVar, int i, byte[] bArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aawkVar);
        this.a = aawkVar;
    }

    public yne(defpackage.aawk aawkVar, int i, char[] cArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aawkVar);
        this.a = aawkVar;
    }

    public yne(defpackage.aawk aawkVar, int i, short[] sArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aawkVar);
        this.a = aawkVar;
    }

    public yne(defpackage.aawk aawkVar, int i, int[] iArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aawkVar);
        this.a = aawkVar;
    }

    public yne(defpackage.aawk aawkVar, int i, boolean[] zArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aawkVar);
        this.a = aawkVar;
    }
}
