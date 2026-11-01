package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class abvd extends aomh implements aonn {
    java.lang.Object a;
    int b;
    final /* synthetic */ abvh c;
    final /* synthetic */ android.net.Uri d;
    final /* synthetic */ defpackage.afaw e;
    final /* synthetic */ defpackage.abuc f;
    final /* synthetic */ defpackage.abup g;
    final /* synthetic */ defpackage.amjp h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abvd(abvh abvhVar, android.net.Uri uri, defpackage.afaw afawVar, defpackage.abuc abucVar, defpackage.abup abupVar, defpackage.amjp amjpVar, aoln aolnVar) {
        super(2, aolnVar);
        this.c = abvhVar;
        this.d = uri;
        this.e = afawVar;
        this.f = abucVar;
        this.g = abupVar;
        this.h = amjpVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v46, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.os.ParcelFileDescriptor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final java.lang.Object b(java.lang.Object obj) throws java.io.FileNotFoundException {
        ?? H;
        java.lang.String str;
        com.google.android.gms.people.cpg.callingcard.CallingCardFullScreenImageData callingCardFullScreenImageData;
        com.google.android.gms.people.cpg.callingcard.CallingCardFontData callingCardFontData;
        java.lang.Object objY;
        ?? r1;
        float f;
        amjs amjsVarY;
        java.lang.Throwable th;
        defpackage.abty abtyVar = aolu.a;
        if (this.b == 0) {
            aooc.af(obj);
            abvh abvhVar = this.c;
            android.net.Uri uri = this.d;
            defpackage.afaw afawVar = this.e;
            defpackage.abuc abucVar = this.f;
            defpackage.abup abupVar = this.g;
            defpackage.amjp amjpVar = this.h;
            H = defpackage.afax.h(abvhVar.b, uri, afawVar);
            try {
                if (H == 0) {
                    return new defpackage.abub(new java.lang.IllegalStateException("Calling card create - null pfd found"));
                }
                java.lang.String lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment == null) {
                    lastPathSegment = "temp.jpeg";
                }
                aooh.f(abucVar, "<this>");
                switch (abucVar.ordinal()) {
                    case 0:
                        str = "image/gif";
                        break;
                    case 1:
                        str = "image/jpeg";
                        break;
                    case 2:
                        str = "image/png";
                        break;
                    case 3:
                        str = "image/webp";
                        break;
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                        str = "image/avif";
                        break;
                    case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                        str = "video/mp4";
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                        str = "video/webm";
                        break;
                    default:
                        throw new aois();
                }
                com.google.android.gms.people.cpg.callingcard.CallingCardFileData callingCardFileData = new com.google.android.gms.people.cpg.callingcard.CallingCardFileData(H, lastPathSegment, str);
                int i = abupVar.f;
                aooh.f(amjpVar, "<this>");
                amjn amjnVarW = ajee.w(amjpVar);
                if (amjnVarW == null || (amjsVarY = ajee.y(amjnVarW)) == null) {
                    callingCardFullScreenImageData = null;
                } else {
                    int i2 = amjsVarY.b;
                    callingCardFullScreenImageData = new com.google.android.gms.people.cpg.callingcard.CallingCardFullScreenImageData((i2 & 1) != 0 ? amjsVarY.c : -2.1474836E9f, (i2 & 2) != 0 ? amjsVarY.d : -2.1474836E9f, (i2 & 4) != 0 ? amjsVarY.e : -2.1474836E9f);
                }
                amjr amjrVarX = ajee.x(amjpVar);
                if (amjrVarX != null) {
                    defpackage.aare aareVar = new defpackage.aare();
                    if ((amjrVarX.b & 1) != 0) {
                        defpackage.amml ammlVar = amjrVarX.c;
                        if (ammlVar == null) {
                            ammlVar = defpackage.amml.a;
                        }
                        aareVar.d(ammlVar.c);
                        defpackage.amml ammlVar2 = amjrVarX.c;
                        if (ammlVar2 == null) {
                            ammlVar2 = defpackage.amml.a;
                        }
                        aareVar.b(ammlVar2.e);
                        defpackage.amml ammlVar3 = amjrVarX.c;
                        if (ammlVar3 == null) {
                            ammlVar3 = defpackage.amml.a;
                        }
                        aareVar.c(ammlVar3.d);
                        defpackage.amml ammlVar4 = amjrVarX.c;
                        if (((ammlVar4 == null ? defpackage.amml.a : ammlVar4).b & 1) != 0) {
                            if (ammlVar4 == null) {
                                ammlVar4 = defpackage.amml.a;
                            }
                            akzv akzvVar = ammlVar4.f;
                            if (akzvVar == null) {
                                akzvVar = akzv.a;
                            }
                            f = akzvVar.b;
                        } else {
                            f = 1.0f;
                        }
                        aareVar.a(f);
                    } else {
                        aareVar.d(0.0f);
                        aareVar.b(0.0f);
                        aareVar.c(0.0f);
                        aareVar.a(0.0f);
                    }
                    int i3 = amjrVarX.b;
                    float f2 = (i3 & 2) != 0 ? amjrVarX.d : -2.1474836E9f;
                    short s = aareVar.e;
                    float f3 = (i3 & 4) != 0 ? amjrVarX.e : -2.1474836E9f;
                    int i4 = (i3 & 8) != 0 ? amjrVarX.f : Integer.MIN_VALUE;
                    int i5 = (i3 & 16) != 0 ? amjrVarX.g : Integer.MIN_VALUE;
                    float f4 = (i3 & 32) != 0 ? amjrVarX.h : -2.1474836E9f;
                    int i6 = s | 496;
                    aareVar.e = (short) i6;
                    if (i6 != 511) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        if ((aareVar.e & 1) == 0) {
                            sb.append(" fontColorRed");
                        }
                        if ((aareVar.e & 2) == 0) {
                            sb.append(" fontColorGreen");
                        }
                        if ((aareVar.e & 4) == 0) {
                            sb.append(" fontColorBlue");
                        }
                        if ((aareVar.e & 8) == 0) {
                            sb.append(" fontColorAlpha");
                        }
                        if ((aareVar.e & 16) == 0) {
                            sb.append(" fontStyleSlant");
                        }
                        if ((aareVar.e & 32) == 0) {
                            sb.append(" fontStyleWidth");
                        }
                        if ((aareVar.e & 64) == 0) {
                            sb.append(" fontStyleWeight");
                        }
                        if ((aareVar.e & 128) == 0) {
                            sb.append(" fontStyleGrade");
                        }
                        if ((aareVar.e & 256) == 0) {
                            sb.append(" fontStyleRoundness");
                        }
                        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
                    }
                    callingCardFontData = new com.google.android.gms.people.cpg.callingcard.CallingCardFontData(aareVar.a, aareVar.b, aareVar.c, aareVar.d, f2, f3, i4, i5, f4);
                } else {
                    callingCardFontData = null;
                }
                aaum aaumVarA = abvhVar.c.a(new com.google.android.gms.people.cpg.callingcard.CreateCallingCardRequest(i, callingCardFileData, new com.google.android.gms.people.cpg.callingcard.CallingCardMetadata(callingCardFontData, callingCardFullScreenImageData)));
                this.a = H;
                this.b = 1;
                objY = aooh.Y(aaumVarA, this);
                if (objY != abtyVar) {
                    r1 = H;
                }
                return abtyVar;
            } catch (java.lang.Throwable th2) {
                th = th2;
                th = th;
                throw th;
            }
        }
        r1 = this.a;
        try {
            aooc.af(obj);
            objY = obj;
            r1 = r1;
        } catch (java.lang.Throwable th3) {
            th = th3;
            H = r1;
            th = th;
            try {
                throw th;
            } catch (java.lang.Throwable th4) {
                ajsz.ak((java.io.Closeable) H, th);
                throw th4;
            }
        }
        com.google.android.gms.people.cpg.callingcard.CreateCallingCardResponse createCallingCardResponse = (com.google.android.gms.people.cpg.callingcard.CreateCallingCardResponse) objY;
        defpackage.abuf abufVarK = abts.k(createCallingCardResponse.a.a);
        com.google.android.gms.people.cpg.callingcard.CallingCardIdentifier callingCardIdentifier = createCallingCardResponse.b;
        abtyVar = new defpackage.abty(abufVarK, callingCardIdentifier != null ? new java.lang.Long(callingCardIdentifier.a) : null);
        ajsz.ak((java.io.Closeable) r1, (java.lang.Throwable) null);
        return abtyVar;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.abvd(this.c, this.d, this.e, this.f, this.g, this.h, aolnVar);
    }
}
