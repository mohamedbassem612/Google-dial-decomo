package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class sjy {
    public static final android.graphics.Bitmap.CompressFormat a = android.graphics.Bitmap.CompressFormat.JPEG;
    public static final defpackage.aimz b = defpackage.aimz.i("com/android/dialer/patrick/onboarding/imageprocessor/CallingCardImageProcessor");
    public final android.content.Context c;
    public final defpackage.ojo d;
    public final defpackage.ahhp e;
    public final defpackage.rlv f;
    public final defpackage.aolr g;
    public final defpackage.aoin h;
    public final defpackage.aoin i;
    public final defpackage.abwf j;
    public final defpackage.kaw k;
    private final defpackage.aolr l;
    private final defpackage.aoin m;

    public sjy(android.content.Context context, defpackage.kaw kawVar, defpackage.ojo ojoVar, defpackage.aazc aazcVar, defpackage.ahhp ahhpVar, defpackage.rlv rlvVar, defpackage.aolr aolrVar, defpackage.aolr aolrVar2, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.abwf abwfVar) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        if (ojoVar == null) {
            defpackage.aooh.i("dialerContentResolver");
        }
        if (aazcVar == null) {
            defpackage.aooh.i("clock");
        }
        if (ahhpVar == null) {
            defpackage.aooh.i("imageManager");
        }
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("backgroundContext");
        }
        if (aolrVar2 == null) {
            defpackage.aooh.i("blockingContext");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("enablePatrickImageCaptureInternalStorage");
        }
        if (aoinVar2 == null) {
            defpackage.aooh.i("enableContactsYourInfoFeatureRequestChanges");
        }
        if (aoinVar3 == null) {
            defpackage.aooh.i("enableDialerImageProcessorRefactor");
        }
        this.c = context;
        this.k = kawVar;
        this.d = ojoVar;
        this.e = ahhpVar;
        this.f = rlvVar;
        this.g = aolrVar;
        this.l = aolrVar2;
        this.m = aoinVar;
        this.h = aoinVar2;
        this.i = aoinVar3;
        this.j = abwfVar;
    }

    private final java.lang.Object o(java.lang.String str, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.g, new ryd(str, this, (defpackage.aoln) null, 2), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:73:0x0117  */
    /* JADX WARN: Code duplicated, block: B:75:0x0126  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009e, code lost:
    
        if (defpackage.aooh.n(r10, r2) == false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(abxt r9, abxt r10, java.lang.String r11, com.google.apps.tiktok.account.AccountId r12, defpackage.aoln r13) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sjy.a(abxt, abxt, java.lang.String, com.google.apps.tiktok.account.AccountId, aoln):java.lang.Object");
    }

    public final java.lang.Object b(defpackage.aoln aolnVar) {
        java.lang.Object objAj = defpackage.aoov.aj(this.g, new sge(this, (defpackage.aoln) null, 10), aolnVar);
        return objAj != defpackage.aolu.a ? defpackage.aojh.a : objAj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(android.net.Uri uri, defpackage.aoln aolnVar) {
        sjr sjrVar;
        java.lang.String str;
        java.lang.String strV;
        if (aolnVar instanceof sjr) {
            sjrVar = (sjr) aolnVar;
            int i = sjrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sjrVar.c = i - Integer.MIN_VALUE;
            } else {
                sjrVar = new sjr(this, aolnVar);
            }
        } else {
            sjrVar = new sjr(this, aolnVar);
        }
        java.lang.Object obj = sjrVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = sjrVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            java.lang.String lastPathSegment = uri.getLastPathSegment();
            java.lang.String strA = null;
            if (lastPathSegment != null && (strV = defpackage.aoov.V(lastPathSegment, lastPathSegment)) != null) {
                strA = defpackage.aoov.A(strV, "_raw");
            }
            sjrVar.d = strA;
            sjrVar.c = 1;
            java.lang.Object objH = h(sjrVar);
            if (objH == aoluVar) {
                return aoluVar;
            }
            java.lang.String str2 = strA;
            obj = objH;
            str = str2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = sjrVar.d;
            defpackage.aooc.af(obj);
        }
        if (str == null || str.length() == 0) {
            str = "temp";
        }
        java.lang.String lowerCase = a.name().toLowerCase(java.util.Locale.ROOT);
        defpackage.aooh.e(lowerCase, "toLowerCase(...)");
        return new java.io.File(obj + '/' + str + '.' + lowerCase);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(defpackage.aoln aolnVar) {
        sjs sjsVar;
        if (aolnVar instanceof sjs) {
            sjsVar = (sjs) aolnVar;
            int i = sjsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sjsVar.c = i - Integer.MIN_VALUE;
            } else {
                sjsVar = new sjs(this, aolnVar);
            }
        } else {
            sjsVar = new sjs(this, aolnVar);
        }
        java.lang.Object objH = sjsVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = sjsVar.c;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(objH);
                sjsVar.c = 1;
                objH = h(sjsVar);
                if (objH == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objH);
            }
            j$.nio.file.Path path = j$.nio.file.Paths.get((java.lang.String) objH, new java.lang.String[0]);
            if (path != null) {
                j$.nio.file.Files.createDirectories(path, new j$.nio.file.attribute.FileAttribute[0]);
                return java.lang.Boolean.TRUE;
            }
            ((defpackage.aimw) b.d().l("com/android/dialer/patrick/onboarding/imageprocessor/CallingCardImageProcessor", "createImageCacheDir", 334, "CallingCardImageProcessor.kt")).v("Cache dir path is null");
            return java.lang.Boolean.FALSE;
        } catch (java.io.IOException e) {
            ((defpackage.aimw) ((defpackage.aimw) b.d()).k(e).l("com/android/dialer/patrick/onboarding/imageprocessor/CallingCardImageProcessor", "createImageCacheDir", 337, "CallingCardImageProcessor.kt")).v("Error creating file for calling card.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        if (r10 != r1) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r9, defpackage.aoln r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof sjt
            if (r0 == 0) goto L13
            r0 = r10
            sjt r0 = (sjt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            sjt r0 = new sjt
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            aolu r1 = defpackage.aolu.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.aooc.af(r10)
            goto L8f
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            sjy r8 = r0.d
            defpackage.aooc.af(r10)
            goto L6a
        L38:
            defpackage.aooc.af(r10)
            aoin r10 = r8.m
            java.lang.Object r10 = r10.a()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L73
            j$.time.Instant r10 = j$.time.Instant.now()
            long r2 = r10.toEpochMilli()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r2)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r0.d = r8
            r0.c = r4
            java.lang.Object r10 = r8.o(r9, r0)
            if (r10 == r1) goto L8e
        L6a:
            kaw r8 = r8.k
            java.io.File r10 = (java.io.File) r10
            android.net.Uri r10 = r8.u(r10)
            goto L8f
        L73:
            r0.c = r3
            android.net.Uri r5 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            java.lang.String r10 = "EXTERNAL_CONTENT_URI"
            defpackage.aooh.e(r5, r10)
            aolr r10 = r8.g
            rjk r2 = new rjk
            r6 = 0
            r7 = 8
            r3 = r8
            r4 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Object r10 = defpackage.aoov.aj(r10, r2, r0)
            if (r10 != r1) goto L8f
        L8e:
            r10 = r1
        L8f:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sjy.e(java.lang.String, aoln):java.lang.Object");
    }

    public final java.lang.Object f(abxt abxtVar, int i, int i2, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.g, new sju(abxtVar, this, i, i2, (defpackage.aoln) null), aolnVar);
    }

    public final java.lang.Object g(defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.g, new sfo(this, (defpackage.aoln) null, 2), aolnVar);
    }

    public final java.lang.Object h(defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.g, new sfo(this, (defpackage.aoln) null, 3, (byte[]) null), aolnVar);
    }

    public final java.lang.Object i(android.net.Uri uri, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.g, new defpackage.roz(this, uri, (defpackage.aoln) null, 5), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object j(java.lang.String str, java.lang.String str2, com.google.apps.tiktok.account.AccountId accountId, defpackage.aoln aolnVar) {
        sjw sjwVar;
        defpackage.sjy sjyVar;
        if (aolnVar instanceof sjw) {
            sjwVar = (sjw) aolnVar;
            int i = sjwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sjwVar.c = i - Integer.MIN_VALUE;
            } else {
                sjwVar = new sjw(this, aolnVar);
            }
        } else {
            sjwVar = new sjw(this, aolnVar);
        }
        java.lang.Object objAj = sjwVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = sjwVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objAj);
            sjwVar.d = str2;
            sjwVar.c = 1;
            sjyVar = this;
            objAj = defpackage.aoov.aj(this.l, new rjk(accountId, sjyVar, str, (defpackage.aoln) null, 9), sjwVar);
            if (objAj != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objAj);
            return objAj;
        }
        str2 = sjwVar.d;
        defpackage.aooc.af(objAj);
        sjyVar = this;
        byte[] bArr = (byte[]) objAj;
        if (bArr == null) {
            return null;
        }
        sjwVar.d = null;
        sjwVar.c = 2;
        java.lang.Object objN = sjyVar.n(bArr, str2, sjwVar);
        if (objN != aoluVar) {
            return objN;
        }
        return aoluVar;
    }

    public final java.lang.Object k(android.net.Uri uri, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.g, new rka(uri, this, (defpackage.aoln) null, 13), aolnVar);
    }

    public final java.lang.String l(android.net.Uri uri) {
        afaw afawVarAw = defpackage.pez.aw(uri);
        defpackage.aooh.f(uri, "uri");
        defpackage.aooh.f(afawVarAw, "sourcePolicy");
        try {
            java.io.InputStream inputStreamC = afax.c(this.j.b, uri, afawVarAw);
            if (inputStreamC == null) {
                return null;
            }
            try {
                java.lang.String strA = new ekq(inputStreamC).a("Orientation");
                defpackage.ajsz.ak(inputStreamC, null);
                return strA;
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    defpackage.ajsz.ak(inputStreamC, th);
                    throw th2;
                }
            }
        } catch (java.lang.Exception e) {
            ((defpackage.aimw) ((defpackage.aimw) defpackage.abwf.a.d()).k(e).l("com/google/android/libraries/dialer/imageprocessor/DialerImageProcessor", "getExifOrientation", 70, "DialerImageProcessor.kt")).v("Failed to load image from Uri for exif information.");
            return null;
        }
    }

    public final boolean m(java.lang.String str, java.io.File file, android.graphics.Bitmap bitmap, int i) {
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
            if (bitmap != null) {
                try {
                    bitmap.compress(a, i, fileOutputStream);
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        defpackage.ajsz.ak(fileOutputStream, th);
                        throw th2;
                    }
                }
            }
            defpackage.ajsz.ak(fileOutputStream, null);
            if (str != null) {
                defpackage.aooh.f(file, "file");
                if (file.exists()) {
                    try {
                        ekq ekqVar = new ekq(file);
                        ekqVar.e(str);
                        ekqVar.b();
                    } catch (java.io.IOException e) {
                        ((defpackage.aimw) ((defpackage.aimw) defpackage.abwf.a.d()).k(e).l("com/google/android/libraries/dialer/imageprocessor/DialerImageProcessor", "applyExifOrientation", 83, "DialerImageProcessor.kt")).v("Error saving EXIF information.");
                    }
                }
            }
            return true;
        } catch (java.io.IOException e2) {
            ((defpackage.aimw) ((defpackage.aimw) b.d()).k(e2).l("com/android/dialer/patrick/onboarding/imageprocessor/CallingCardImageProcessor", "writeToFile", 353, "CallingCardImageProcessor.kt")).v("Error compressing image for calling card.");
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object n(byte[] bArr, java.lang.String str, defpackage.aoln aolnVar) {
        sjx sjxVar;
        if (aolnVar instanceof sjx) {
            sjxVar = (sjx) aolnVar;
            int i = sjxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sjxVar.c = i - Integer.MIN_VALUE;
            } else {
                sjxVar = new sjx(this, aolnVar);
            }
        } else {
            sjxVar = new sjx(this, aolnVar);
        }
        java.lang.Object objAj = sjxVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = sjxVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objAj);
            if (!((java.lang.Boolean) this.m.a()).booleanValue()) {
                sjxVar.c = 3;
                objAj = defpackage.aoov.aj(this.g, new njb(str, this, bArr, (defpackage.aoln) null, 3), sjxVar);
                if (objAj == aoluVar) {
                    return aoluVar;
                }
                return (android.net.Uri) objAj;
            }
            sjxVar.d = bArr;
            sjxVar.e = this;
            sjxVar.c = 1;
            objAj = o(str, sjxVar);
            if (objAj == aoluVar) {
                return aoluVar;
            }
            defpackage.sjy sjyVar = this;
            byte[] bArr2 = bArr;
            sjxVar.d = null;
            sjxVar.e = null;
            sjxVar.c = 2;
            objAj = defpackage.aoov.aj(sjyVar.g, new defpackage.hcn((java.io.File) objAj, sjyVar, bArr2, (defpackage.aoln) null, 13), sjxVar);
            if (objAj == aoluVar) {
                return aoluVar;
            }
        } else if (i2 == 1) {
            this = sjxVar.e;
            bArr = sjxVar.d;
            defpackage.aooc.af(objAj);
            defpackage.sjy sjyVar2 = this;
            byte[] bArr3 = bArr;
            sjxVar.d = null;
            sjxVar.e = null;
            sjxVar.c = 2;
            objAj = defpackage.aoov.aj(sjyVar2.g, new defpackage.hcn((java.io.File) objAj, sjyVar2, bArr3, (defpackage.aoln) null, 13), sjxVar);
            if (objAj == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objAj);
                return (android.net.Uri) objAj;
            }
            defpackage.aooc.af(objAj);
        }
        return (android.net.Uri) objAj;
    }
}
