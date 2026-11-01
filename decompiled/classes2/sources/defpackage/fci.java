package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fci extends android.os.Handler {
    final /* synthetic */ defpackage.fcm a;
    private boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fci(defpackage.fcm fcmVar, android.os.Looper looper) {
        super(looper);
        j$.util.Objects.requireNonNull(fcmVar);
        this.a = fcmVar;
    }

    final void a(int i, java.lang.Object obj, boolean z) {
        obtainMessage(i, new defpackage.fcj(defpackage.ffl.a(), z, android.os.SystemClock.elapsedRealtime(), obj)).sendToTarget();
    }

    public final synchronized void b() {
        removeCallbacksAndMessages(null);
        this.b = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) throws java.lang.Throwable {
        java.lang.Object fclVar;
        java.lang.Object objAG;
        ?? r6;
        java.lang.Object obj;
        defpackage.fcj fcjVar = (defpackage.fcj) message.obj;
        try {
            int i = message.what;
            if (i == 1) {
                defpackage.kvt kvtVar = this.a.k;
                ils ilsVar = (ils) fcjVar.d;
                byte[][] bArr = {"{\"signedRequest\":\"".getBytes(java.nio.charset.StandardCharsets.UTF_8), (byte[]) ilsVar.a, "\"}".getBytes(java.nio.charset.StandardCharsets.UTF_8)};
                long length = 0;
                for (int i2 = 0; i2 < 3; i2++) {
                    length += (long) bArr[i2].length;
                }
                int i3 = (int) length;
                ahvr.bQ(length == ((long) i3), "the total number of elements (%s) in the arrays must fit in an int", length);
                byte[] bArr2 = new byte[i3];
                int i4 = 0;
                for (int i5 = 0; i5 < 3; i5++) {
                    byte[] bArr3 = bArr[i5];
                    int length2 = bArr3.length;
                    java.lang.System.arraycopy(bArr3, 0, bArr2, i4, length2);
                    i4 += length2;
                }
                objAG = defpackage.hgu.aG(((defpackage.evy) kvtVar.a).a(), (java.lang.String) ilsVar.b, bArr2, aigf.l("Content-Type", defpackage.aizb.b.toString(), "Content-Length", java.lang.String.valueOf(i3)));
            } else {
                if (i != 2) {
                    throw new java.lang.RuntimeException();
                }
                defpackage.fcm fcmVar = this.a;
                defpackage.kvt kvtVar2 = fcmVar.k;
                java.util.UUID uuid = fcmVar.c;
                ils ilsVar2 = (ils) fcjVar.d;
                ?? r7 = ilsVar2.b;
                if (true == android.text.TextUtils.isEmpty(r7)) {
                    r6 = r7;
                    r6 = 0;
                }
                r6 = r7;
                if (android.text.TextUtils.isEmpty(r6)) {
                    defpackage.evu evuVar = new defpackage.evu();
                    evuVar.a = android.net.Uri.EMPTY;
                    throw new defpackage.fdf(evuVar.a(), android.net.Uri.EMPTY, aikj.b, 0L, new java.lang.IllegalStateException("No license URL"));
                }
                java.util.HashMap map = new java.util.HashMap();
                java.util.UUID uuid2 = defpackage.epx.e;
                map.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : defpackage.epx.c.equals(uuid) ? "application/json" : "application/octet-stream");
                if (uuid2.equals(uuid)) {
                    map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
                }
                java.lang.Object obj2 = kvtVar2.b;
                synchronized (obj2) {
                    try {
                        map.putAll(obj2);
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                defpackage.kvt kvtVarAG = defpackage.hgu.aG(((defpackage.evy) kvtVar2.a).a(), (java.lang.String) r6, (byte[]) ilsVar2.a, map);
                defpackage.fcm fcmVar2 = this.a;
                synchronized (fcmVar2.e) {
                    defpackage.hjx hjxVar = fcmVar2.i;
                    if (hjxVar != null && (obj = kvtVarAG.a) != null) {
                        defpackage.ffk ffkVar = new defpackage.ffk((defpackage.ffl) obj);
                        ffkVar.a = fcjVar.a;
                        ffkVar.f = android.os.SystemClock.elapsedRealtime() - fcjVar.c;
                        hjxVar.h(new defpackage.ffl(ffkVar));
                    }
                }
                objAG = kvtVarAG;
            }
        } catch (defpackage.fdf e) {
            defpackage.fcj fcjVar2 = (defpackage.fcj) message.obj;
            objAG = e;
            if (fcjVar2.b) {
                int i6 = fcjVar2.e + 1;
                fcjVar2.e = i6;
                defpackage.fcm fcmVar3 = this.a;
                if (i6 <= defpackage.hgt.ao(3)) {
                    defpackage.ffk ffkVar2 = new defpackage.ffk(fcjVar2.a, e.a, android.os.SystemClock.elapsedRealtime());
                    ffkVar2.d = e.b;
                    ffkVar2.e = e.c;
                    ffkVar2.f = android.os.SystemClock.elapsedRealtime() - fcjVar2.c;
                    ffkVar2.g = e.d;
                    defpackage.ffl fflVar = new defpackage.ffl(ffkVar2);
                    if (e.getCause() instanceof java.io.IOException) {
                        objAG = e;
                        fclVar = (java.io.IOException) e.getCause();
                    } else {
                        objAG = e;
                        fclVar = new defpackage.fcl(e.getCause());
                    }
                    long jAI = defpackage.hgt.aI(new amwp(fclVar, fcjVar2.e));
                    objAG = e;
                    if (jAI != -9223372036854775807L) {
                        synchronized (fcmVar3.e) {
                            defpackage.hjx hjxVar2 = fcmVar3.i;
                            if (hjxVar2 != null) {
                                hjxVar2.h(fflVar);
                            }
                            synchronized (this) {
                                if (!this.b) {
                                    sendMessageDelayed(android.os.Message.obtain(message), jAI);
                                    return;
                                }
                                objAG = e;
                            }
                        }
                    }
                }
            }
        } catch (java.lang.Exception e2) {
            defpackage.etr.g("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
            objAG = e2;
        }
        objAG = e;
        long j = fcjVar.a;
        synchronized (this) {
            if (!this.b) {
                this.a.d.obtainMessage(message.what, android.util.Pair.create(fcjVar.d, objAG)).sendToTarget();
            }
        }
    }
}
