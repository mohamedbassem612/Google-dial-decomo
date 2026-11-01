package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class adfe implements ahyc {
    private final /* synthetic */ int $cid;

    public /* synthetic */ adfe(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Type inference failed for: r5v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v16, types: [aiii, java.lang.Object] */
    public final java.lang.Object apply(java.lang.Object obj) {
        java.lang.String str;
        byte[] bArrCopyOfRange;
        int i = 0;
        switch (this.$cid) {
            case 0:
                return ahwt.a;
            case 1:
                return ahyn.h((java.io.InputStream) obj);
            case 2:
                com.google.android.gms.pseudonymous.PseudonymousIdToken pseudonymousIdToken = (com.google.android.gms.pseudonymous.PseudonymousIdToken) obj;
                return (pseudonymousIdToken == null || (str = pseudonymousIdToken.a) == null) ? "" : str;
            case 3:
                return ((adhw) obj).e(true);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                com.google.android.libraries.micore.superpacks.common.PackManifest packManifest = (com.google.android.libraries.micore.superpacks.common.PackManifest) obj;
                return packManifest != null ? packManifest.p().e(false) : "null";
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                android.database.Cursor cursor = (android.database.Cursor) obj;
                java.lang.String[] strArr = adjp.a;
                ahvr.ci(cursor);
                java.lang.String string = cursor.getString(0);
                if (string != null) {
                    return com.google.android.libraries.micore.superpacks.base.VersionedName.c(string, cursor.getInt(1));
                }
                adhn.a.d().y("Invalid versioned name found in %s, ignoring row...", "manifest_table");
                return null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                android.database.Cursor cursor2 = (android.database.Cursor) obj;
                java.lang.String[] strArr2 = adjq.a;
                ahvr.ci(cursor2);
                return cursor2.getString(0);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                android.database.Cursor cursor3 = (android.database.Cursor) obj;
                java.lang.String[] strArr3 = adjr.a;
                ahvr.ci(cursor3);
                return cursor3.getString(0);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                defpackage.adow.a.d().k((java.lang.Exception) obj).l("com/google/android/libraries/micore/telephony/callflow/incomingcall/IncomingCallFlowManager", "cleanup", 186, "IncomingCallFlowManager.java").v("Error while cancelling mute changes");
                return null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return java.lang.Boolean.TRUE;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                defpackage.alic alicVar = (defpackage.alic) obj;
                defpackage.wp wpVarB = defpackage.adxe.b();
                wpVarB.a = true;
                wpVarB.c = java.lang.Integer.valueOf(alicVar.a);
                java.lang.Object obj2 = alicVar.b;
                if (obj2 == null) {
                    bArrCopyOfRange = new byte[0];
                } else {
                    java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) obj2;
                    if (byteBuffer.hasArray()) {
                        int iArrayOffset = byteBuffer.arrayOffset();
                        if (iArrayOffset != 0) {
                            i = iArrayOffset;
                        } else if (byteBuffer.array().length == byteBuffer.limit()) {
                            bArrCopyOfRange = byteBuffer.array();
                        }
                        bArrCopyOfRange = java.util.Arrays.copyOfRange(byteBuffer.array(), i, byteBuffer.limit() + i);
                    } else {
                        byte[] bArr = new byte[byteBuffer.limit()];
                        int iPosition = byteBuffer.position();
                        byteBuffer.position(0);
                        byteBuffer.get(bArr);
                        byteBuffer.position(iPosition);
                        bArrCopyOfRange = bArr;
                    }
                }
                wpVarB.e = bArrCopyOfRange;
                ?? r6 = alicVar.c;
                aigb aigbVar = new aigb(4);
                for (java.util.Map.Entry entry : r6.o().entrySet()) {
                    aigbVar.i(adxc.a(((defpackage.ajzj) entry.getKey()).a), (java.util.List) entry.getValue());
                }
                wpVarB.b().putAll(aigbVar.e(true));
                return wpVarB.a();
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                defpackage.wp wpVarB2 = defpackage.adxe.b();
                wpVarB2.d = (java.lang.Exception) obj;
                return wpVarB2.a();
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return java.lang.Boolean.valueOf((boolean) (((android.os.SystemClock.elapsedRealtime() - ((java.lang.Long) obj).longValue()) > 5000L ? 1 : ((android.os.SystemClock.elapsedRealtime() - ((java.lang.Long) obj).longValue()) == 5000L ? 0 : -1)) >>> 31));
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return ((aemh) obj).a();
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return ((ahyn) obj).e();
            case 15:
                adff adffVar = (adff) obj;
                ahrv ahrvVarG = ahrv.g(adffVar.d());
                defpackage.adek adekVar = new defpackage.adek(adffVar, 2);
                ajbm ajbmVar = ajbm.a;
                return aemm.h(ahrv.g(ahrvVarG.h(adekVar, ajbmVar)).f(java.lang.Exception.class, new defpackage.acwn(15), ajbmVar).h(new aczn(19), ajbmVar));
            case 16:
                return null;
            case 17:
                java.io.InputStream inputStream = (java.io.InputStream) obj;
                if (inputStream == null) {
                    return null;
                }
                android.graphics.Bitmap bitmapDecodeStream = android.graphics.BitmapFactory.decodeStream(inputStream);
                try {
                    inputStream.close();
                    return bitmapDecodeStream;
                } catch (java.io.IOException unused) {
                    return bitmapDecodeStream;
                }
            case 18:
                return ((aemh) obj).a();
            case 19:
                int i2 = defpackage.aemw.b;
                android.os.ParcelFileDescriptor parcelFileDescriptorC = ((defpackage.aaqh) obj).c();
                if (parcelFileDescriptorC == null) {
                    return null;
                }
                try {
                    android.os.ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptorC);
                    try {
                        android.graphics.Bitmap bitmapDecodeStream2 = android.graphics.BitmapFactory.decodeStream(autoCloseInputStream);
                        autoCloseInputStream.close();
                        return bitmapDecodeStream2;
                    } catch (java.lang.Throwable th) {
                        try {
                            autoCloseInputStream.close();
                            break;
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (java.io.IOException e) {
                    throw new java.lang.RuntimeException(e);
                }
            default:
                int i3 = defpackage.aemw.b;
                defpackage.aash aashVarC = ((defpackage.aaqg) obj).c();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                defpackage.aafv aafvVar = new defpackage.aafv(aashVarC);
                while (aafvVar.hasNext()) {
                    defpackage.aafw aafwVar = (defpackage.aafw) aafvVar.next();
                    if (!aafwVar.a.h()) {
                        arrayList.add(defpackage.aemx.a.apply(aafwVar));
                    }
                }
                return aify.n(arrayList);
        }
    }
}
