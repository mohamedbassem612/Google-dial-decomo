package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fdd implements defpackage.fda {
    private final java.util.UUID a;
    private final android.media.MediaDrm b;
    private int c;

    private fdd(java.util.UUID uuid) {
        ahvr.bN(!defpackage.epx.b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.a = uuid;
        android.media.MediaDrm mediaDrm = new android.media.MediaDrm(uuid);
        this.b = mediaDrm;
        this.c = 1;
        if (defpackage.epx.d.equals(uuid)) {
            int i = defpackage.equ.a;
            if ("ASUS_Z00AD".equals(android.os.Build.MODEL)) {
                mediaDrm.setPropertyString("securityLevel", "L3");
            }
        }
    }

    public static defpackage.fdd o(java.util.UUID uuid) {
        try {
            return new defpackage.fdd(uuid);
        } catch (android.media.UnsupportedSchemeException e) {
            throw new defpackage.fdg(e);
        } catch (java.lang.Exception e2) {
            throw new defpackage.fdg(e2);
        }
    }

    @Override // defpackage.fda
    public final int a() {
        return 2;
    }

    @Override // defpackage.fda
    public final java.util.Map b(byte[] bArr) {
        return this.b.queryKeyStatus(bArr);
    }

    @Override // defpackage.fda
    public final void c(byte[] bArr) {
        this.b.closeSession(bArr);
    }

    @Override // defpackage.fda
    public final void d(byte[] bArr) throws android.media.DeniedByServerException {
        this.b.provideProvisionResponse(bArr);
    }

    @Override // defpackage.fda
    public final synchronized void e() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            this.b.release();
        }
    }

    @Override // defpackage.fda
    public final void f(byte[] bArr, byte[] bArr2) {
        this.b.restoreKeys(bArr, bArr2);
    }

    @Override // defpackage.fda
    public final void g(byte[] bArr, defpackage.fag fagVar) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            try {
                android.media.MediaDrm mediaDrm = this.b;
                android.media.metrics.LogSessionId logSessionIdA = fagVar.a();
                if (mp$.ExternalSyntheticApiModelOutline0.m(logSessionIdA, mp$.ExternalSyntheticApiModelOutline0.m())) {
                    return;
                }
                android.media.MediaDrm.PlaybackComponent playbackComponentM = mp$.ExternalSyntheticApiModelOutline0.m(mediaDrm, bArr);
                ahvr.ci(playbackComponentM);
                mp$.ExternalSyntheticApiModelOutline0.m(playbackComponentM, logSessionIdA);
            } catch (java.lang.UnsupportedOperationException unused) {
                defpackage.etr.f("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        if (r0.startsWith("16.0") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r0.equals(defpackage.epx.c) != false) goto L19;
     */
    @Override // defpackage.fda
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(byte[] r4, java.lang.String r5) throws java.lang.Throwable {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L4e
            java.util.UUID r0 = r3.a
            java.util.UUID r1 = defpackage.epx.d
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L3b
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 37
            if (r0 >= r1) goto L43
            java.lang.String r0 = r3.p()
            java.lang.String r1 = "v5."
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L4e
            java.lang.String r1 = "14."
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L4e
            java.lang.String r1 = "15."
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L4e
            java.lang.String r1 = "16.0"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L43
            goto L4e
        L3b:
            java.util.UUID r1 = defpackage.epx.c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4e
        L43:
            android.media.MediaDrm r3 = r3.b
            int r4 = ft$.ExternalSyntheticApiModelOutline0.m(r3, r4)
            boolean r3 = mp$.ExternalSyntheticApiModelOutline0.m(r3, r5, r4)
            goto L71
        L4e:
            r0 = 0
            android.media.MediaCrypto r1 = new android.media.MediaCrypto     // Catch: android.media.MediaCryptoException -> L62 java.lang.Throwable -> L72
            java.util.UUID r2 = r3.a     // Catch: android.media.MediaCryptoException -> L62 java.lang.Throwable -> L72
            r1.<init>(r2, r4)     // Catch: android.media.MediaCryptoException -> L62 java.lang.Throwable -> L72
            boolean r3 = r1.requiresSecureDecoderComponent(r5)     // Catch: java.lang.Throwable -> L5e android.media.MediaCryptoException -> L61
            r1.release()
            goto L71
        L5e:
            r3 = move-exception
            r0 = r1
            goto L73
        L61:
            r0 = r1
        L62:
            java.util.UUID r3 = r3.a     // Catch: java.lang.Throwable -> L72
            java.util.UUID r4 = defpackage.epx.c     // Catch: java.lang.Throwable -> L72
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L72
            r3 = r3 ^ 1
            if (r0 == 0) goto L71
            r0.release()
        L71:
            return r3
        L72:
            r3 = move-exception
        L73:
            if (r0 == 0) goto L78
            r0.release()
        L78:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdd.h(byte[], java.lang.String):boolean");
    }

    @Override // defpackage.fda
    public final byte[] i() {
        return this.b.openSession();
    }

    @Override // defpackage.fda
    public final byte[] j(byte[] bArr, byte[] bArr2) {
        defpackage.epx.c.equals(this.a);
        return this.b.provideKeyResponse(bArr, bArr2);
    }

    @Override // defpackage.fda
    public final /* bridge */ /* synthetic */ defpackage.fdb k(byte[] bArr) {
        return new defpackage.fdb(this.a, bArr);
    }

    @Override // defpackage.fda
    public final ils l() {
        android.media.MediaDrm.ProvisionRequest provisionRequest = this.b.getProvisionRequest();
        return new ils(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0087  */
    /* JADX WARN: Code duplicated, block: B:86:0x0200  */
    @Override // defpackage.fda
    public final ils m(byte[] bArr, java.util.List list, int i, java.util.HashMap map) throws android.media.NotProvisionedException {
        androidx.media3.common.DrmInitData.SchemeData schemeData;
        byte[] bArr2;
        java.lang.String str;
        int i2;
        alic alicVarT;
        byte[] bArrJ;
        int length;
        if (list != null) {
            java.util.UUID uuid = this.a;
            if (!defpackage.epx.d.equals(uuid)) {
                schemeData = (androidx.media3.common.DrmInitData.SchemeData) list.get(0);
            } else if (list.size() <= 1) {
                i2 = 0;
                while (true) {
                    if (i2 < list.size()) {
                        schemeData = (androidx.media3.common.DrmInitData.SchemeData) list.get(0);
                        break;
                    }
                    androidx.media3.common.DrmInitData.SchemeData schemeData2 = (androidx.media3.common.DrmInitData.SchemeData) list.get(i2);
                    byte[] bArr3 = schemeData2.d;
                    ahvr.ci(bArr3);
                    alicVarT = defpackage.fsu.t(bArr3);
                    if (alicVarT == null) {
                    }
                    i2++;
                }
            } else {
                androidx.media3.common.DrmInitData.SchemeData schemeData3 = (androidx.media3.common.DrmInitData.SchemeData) list.get(0);
                int i3 = 0;
                int length2 = 0;
                while (true) {
                    if (i3 < list.size()) {
                        androidx.media3.common.DrmInitData.SchemeData schemeData4 = (androidx.media3.common.DrmInitData.SchemeData) list.get(i3);
                        byte[] bArr4 = schemeData4.d;
                        ahvr.ci(bArr4);
                        if (j$.util.Objects.equals(schemeData4.c, schemeData3.c) && j$.util.Objects.equals(schemeData4.b, schemeData3.b) && defpackage.fsu.t(bArr4) != null) {
                            length2 += bArr4.length;
                            i3++;
                        } else {
                            i2 = 0;
                            while (true) {
                                if (i2 < list.size()) {
                                    schemeData = (androidx.media3.common.DrmInitData.SchemeData) list.get(0);
                                    break;
                                }
                                androidx.media3.common.DrmInitData.SchemeData schemeData5 = (androidx.media3.common.DrmInitData.SchemeData) list.get(i2);
                                byte[] bArr5 = schemeData5.d;
                                ahvr.ci(bArr5);
                                alicVarT = defpackage.fsu.t(bArr5);
                                if (alicVarT == null && alicVarT.a == 1) {
                                    schemeData = schemeData5;
                                    break;
                                }
                                i2++;
                            }
                        }
                    } else {
                        byte[] bArr6 = new byte[length2];
                        int i4 = 0;
                        for (int i5 = 0; i5 < list.size(); i5++) {
                            byte[] bArr7 = ((androidx.media3.common.DrmInitData.SchemeData) list.get(i5)).d;
                            ahvr.ci(bArr7);
                            int length3 = bArr7.length;
                            java.lang.System.arraycopy(bArr7, 0, bArr6, i4, length3);
                            i4 += length3;
                        }
                        schemeData = new androidx.media3.common.DrmInitData.SchemeData(schemeData3.a, schemeData3.b, schemeData3.c, bArr6);
                    }
                }
            }
            byte[] bArrArray = schemeData.d;
            ahvr.ci(bArrArray);
            java.util.UUID uuid2 = defpackage.epx.e;
            if (uuid2.equals(uuid)) {
                byte[] bArrJ2 = defpackage.fsu.j(bArrArray, uuid);
                if (bArrJ2 != null) {
                    bArrArray = bArrJ2;
                }
                defpackage.etx etxVar = new defpackage.etx(bArrArray);
                int iJ = etxVar.j();
                short sF = etxVar.F();
                short sF2 = etxVar.F();
                if (sF == 1 && sF2 == 1) {
                    java.lang.String strD = etxVar.D(etxVar.F(), java.nio.charset.StandardCharsets.UTF_16LE);
                    if (!strD.contains("<LA_URL>")) {
                        int iIndexOf = strD.indexOf("</DATA>");
                        if (iIndexOf == -1) {
                            defpackage.etr.f("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
                            iIndexOf = -1;
                        }
                        java.lang.String str2 = strD.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strD.substring(iIndexOf);
                        int i6 = iJ + 52;
                        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(i6);
                        byteBufferAllocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
                        byteBufferAllocate.putInt(i6);
                        byteBufferAllocate.putShort((short) 1);
                        byteBufferAllocate.putShort((short) 1);
                        byteBufferAllocate.putShort((short) (str2.length() << 1));
                        byteBufferAllocate.put(str2.getBytes(java.nio.charset.StandardCharsets.UTF_16LE));
                        bArrArray = byteBufferAllocate.array();
                    }
                } else {
                    defpackage.etr.e("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
                }
                int length4 = (bArrArray != null ? bArrArray.length : 0) + 32;
                java.nio.ByteBuffer byteBufferAllocate2 = java.nio.ByteBuffer.allocate(length4);
                byteBufferAllocate2.putInt(length4);
                byteBufferAllocate2.putInt(1886614376);
                byteBufferAllocate2.putInt(0);
                byteBufferAllocate2.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate2.putLong(uuid2.getLeastSignificantBits());
                if (bArrArray == null || (length = bArrArray.length) == 0) {
                    byteBufferAllocate2.putInt(0);
                } else {
                    byteBufferAllocate2.putInt(length);
                    byteBufferAllocate2.put(bArrArray);
                }
                bArrArray = byteBufferAllocate2.array();
            }
            int i7 = defpackage.equ.a;
            if (uuid2.equals(uuid) && "Amazon".equals(android.os.Build.MANUFACTURER) && (("AFTB".equals(android.os.Build.MODEL) || "AFTS".equals(android.os.Build.MODEL) || "AFTM".equals(android.os.Build.MODEL) || "AFTT".equals(android.os.Build.MODEL)) && (bArrJ = defpackage.fsu.j(bArrArray, uuid)) != null)) {
                bArrArray = bArrJ;
            }
            str = schemeData.c;
            bArr2 = bArrArray;
        } else {
            schemeData = null;
            bArr2 = null;
            str = null;
        }
        android.media.MediaDrm.KeyRequest keyRequest = this.b.getKeyRequest(bArr, bArr2, str, i, map);
        java.util.UUID uuid3 = this.a;
        byte[] data = keyRequest.getData();
        defpackage.epx.c.equals(uuid3);
        java.lang.String defaultUrl = keyRequest.getDefaultUrl();
        if ("<LA_URL>https://x</LA_URL>".equals(defaultUrl)) {
            defaultUrl = "";
        } else if (android.os.Build.VERSION.SDK_INT >= 33 && "https://default.url".equals(defaultUrl)) {
            java.lang.String strP = p();
            if (j$.util.Objects.equals(strP, "1.2") || j$.util.Objects.equals(strP, "aidl-1")) {
                defaultUrl = "";
            }
        }
        if (android.text.TextUtils.isEmpty(defaultUrl) && schemeData != null) {
            java.lang.String str3 = schemeData.b;
            if (!android.text.TextUtils.isEmpty(str3)) {
                defaultUrl = str3;
            }
        }
        keyRequest.getRequestType();
        return new ils(data, defaultUrl);
    }

    @Override // defpackage.fda
    public final void n(final rai raiVar) {
        this.b.setOnEventListener(new android.media.MediaDrm.OnEventListener() { // from class: fdc
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(android.media.MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                defpackage.fcn fcnVar = ((defpackage.fcq) raiVar.a).k;
                ahvr.ci(fcnVar);
                fcnVar.obtainMessage(i, bArr).sendToTarget();
            }
        });
    }

    public final java.lang.String p() {
        return this.b.getPropertyString("version");
    }
}
