package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ahts implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public ahts(defpackage.ajzg ajzgVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(ajzgVar);
        this.a = ajzgVar;
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v23, types: [j$.util.stream.BaseStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v24, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r9v25, types: [java.lang.Object, java.util.Map$Entry] */
    /* JADX WARN: Type inference failed for: r9v60, types: [ajcq, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws java.lang.Exception {
        java.lang.Exception exc = null;
        int i = 0;
        switch (this.$cid) {
            case 0:
                java.lang.Object obj = this.a;
                try {
                    ahtx ahtxVar = ahtx.a;
                    android.content.Context context = ((ahtt) obj).b;
                    ahua ahuaVar = ahua.b;
                    if (ahtx.e(ahtx.b(context, ahuaVar), akzq.a()).f()) {
                        ahtxVar.b = false;
                        return;
                    }
                    ahyn ahynVarE = ahtx.e(ahtx.b(context, ahua.a), akzq.a());
                    if (!ahynVarE.f()) {
                        ahynVarE = ahyn.h(ahtv.a);
                    }
                    java.lang.Object objB = ahynVarE.b();
                    java.io.File file = new java.io.File(ahtx.b(context, ahuaVar), "tiktok_configuration");
                    file.mkdirs();
                    java.io.File file2 = new java.io.File(file, "CustomConfiguration.lock");
                    file2.createNewFile();
                    java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file2);
                    try {
                        java.nio.channels.FileLock fileLockLock = j$.nio.channels.DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileOutputStream.getChannel()).lock();
                        try {
                            java.io.File file3 = new java.io.File(file, "CustomConfiguration");
                            java.io.File file4 = new java.io.File(file, "CustomConfiguration.bak");
                            if (!file3.exists() && !file4.exists()) {
                                java.io.File file5 = new java.io.File(file, "CustomConfiguration.tmp");
                                if (file5.exists() && !file5.delete()) {
                                    throw new java.io.IOException("Could not delete temp file");
                                }
                                java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(file5);
                                try {
                                    ((akym) objB).g(fileOutputStream2);
                                    fileOutputStream2.getFD().sync();
                                    fileOutputStream2.close();
                                    try {
                                        ahtx.d(file5, file3);
                                        file5.delete();
                                        if (fileLockLock != null) {
                                            fileLockLock.close();
                                        }
                                        fileOutputStream.close();
                                        ahtx.c(context, ahua.a);
                                    } catch (java.lang.Throwable th) {
                                        file5.delete();
                                        throw th;
                                    }
                                } catch (java.lang.Throwable th2) {
                                    try {
                                        fileOutputStream2.close();
                                        throw th2;
                                    } catch (java.lang.Throwable th3) {
                                        th2.addSuppressed(th3);
                                        throw th2;
                                    }
                                }
                                try {
                                    fileOutputStream.close();
                                    throw th;
                                } catch (java.lang.Throwable th4) {
                                    th.addSuppressed(th4);
                                    throw th;
                                }
                            }
                            if (fileLockLock != null) {
                                fileLockLock.close();
                            }
                            fileOutputStream.close();
                            ahtxVar.b = false;
                            return;
                        } catch (java.lang.Throwable th5) {
                            if (fileLockLock == null) {
                                throw th5;
                            }
                            try {
                                fileLockLock.close();
                                throw th5;
                            } catch (java.lang.Throwable th6) {
                                th5.addSuppressed(th6);
                                throw th5;
                            }
                            a.by(ahtt.a.c(), "Failed to migrated configuration data to device storage.", "com/google/apps/tiktok/ui/locale/DirectBootMigrationManager", "scheduleMigrationIfNeeded", '*', "DirectBootMigrationManager.java", e);
                            return;
                        }
                    } catch (java.lang.Throwable th7) {
                        fileOutputStream.close();
                        throw th7;
                    }
                } catch (java.lang.Exception e) {
                    a.by(ahtt.a.c(), "Failed to migrated configuration data to device storage.", "com/google/apps/tiktok/ui/locale/DirectBootMigrationManager", "scheduleMigrationIfNeeded", '*', "DirectBootMigrationManager.java", e);
                    return;
                }
            case 1:
                java.lang.Object obj2 = this.a;
                java.lang.Object obj3 = ahqx.c;
                java.lang.Object obj4 = ((ahmv) obj2).a;
                synchronized (obj3) {
                    if (aooh.n(ahqx.d, obj4)) {
                        ahqx.d = null;
                    }
                    break;
                }
                return;
            case 2:
                java.lang.Object obj5 = this.a;
                ((ahtt) obj5).c.execute(new defpackage.ahts(obj5, i));
                return;
            case 3:
                ((java.util.concurrent.Future) ((java.util.concurrent.atomic.AtomicReference) this.a).get()).cancel(false);
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                this.a.close();
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                this.a.cancel(false);
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                ajxk ajxkVar = (ajxk) ((apnt) this.a.getKey()).a;
                if (ajxkVar.b()) {
                    ajxkVar.a.f();
                    return;
                }
                return;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                ((ajwh) this.a).k();
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                java.lang.Object obj6 = this.a;
                java.lang.Object obj7 = ((gou) obj6).d;
                synchronized (obj7) {
                    android.content.SharedPreferences.Editor editorEdit = ((gou) obj6).e.edit();
                    java.lang.Object obj8 = ((gou) obj6).c;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    java.util.Iterator it = ((java.util.ArrayDeque) obj7).iterator();
                    while (it.hasNext()) {
                        sb.append((java.lang.String) it.next());
                        sb.append(',');
                    }
                    editorEdit.putString((java.lang.String) obj8, sb.toString()).apply();
                    break;
                }
                return;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                apjb apjbVar = (apjb) this.a;
                android.util.Log.w("FirebaseMessaging", "Service took too long to process intent: " + ((android.content.Intent) apjbVar.b).getAction() + " finishing.");
                apjbVar.v();
                return;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                ((defpackage.ajzg) this.a).a.cancel(false);
                return;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                ((defpackage.akbb) this.a).c().dw();
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                ((defpackage.akbf) this.a).c().dw();
                return;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                ((defpackage.akbj) this.a).d.dw();
                return;
            case 15:
                defpackage.akbw akbwVar = (defpackage.akbw) this.a;
                if (akbwVar.j) {
                    return;
                }
                akbwVar.f = true;
                akbwVar.c();
                return;
            case 16:
                defpackage.akbs akbsVar = (defpackage.akbs) this.a;
                if (akbsVar.a) {
                    return;
                }
                akbsVar.c.e();
                return;
            case 17:
                ((anty) this.a).e();
                return;
            case 18:
                if (this.a.isCancelled()) {
                    android.util.Log.d("ClientLoggingBackend", "Log cancelled. The app has crashed.");
                    return;
                }
                return;
            case 19:
                ((alje) this.a).f(j$.util.Optional.empty());
                return;
            default:
                ((alpn) this.a).b();
                return;
        }
        while (i < 3) {
            try {
                ((j$.util.stream.Stream[]) this.a)[i].close();
            } catch (java.lang.Exception e2) {
                if (exc == null) {
                    exc = e2;
                } else {
                    exc.addSuppressed(e2);
                }
            }
            i++;
        }
        if (exc != null) {
            throw exc;
        }
    }

    public /* synthetic */ ahts(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
