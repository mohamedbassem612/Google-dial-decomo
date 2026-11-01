package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public /* synthetic */ class hgt {
    public static volatile defpackage.her b;
    public static volatile defpackage.heq c;
    public static java.lang.Boolean d;
    public static android.media.AudioManager e;

    public hgt(byte[] bArr) {
        new java.util.HashMap();
        new cph(this, 8);
    }

    public static kdh A(android.content.Context context) {
        return (kdh) agab.aH(context, kdh.class);
    }

    public static void B(android.content.ContentValues contentValues, int i) {
        aM("voicemail_uri", contentValues);
        aM("voicemail_transcription", contentValues);
        aM("transcription_state", contentValues);
        aM("geocoded_location", contentValues);
        aM("callee_id", contentValues);
        aM("call_screen_transcript_snippet", contentValues);
        aM("call_screen_recording_file_path", contentValues);
        defpackage.jvr jvrVar = new defpackage.jvr(7);
        if (i - 1 == 1 || contentValues.containsKey("call_type")) {
            ahvr.bW(aa$.ExternalSyntheticApiModelOutline1.m$1(jvrVar, contentValues), "Column %s contains invalid value: %s", "call_type", contentValues.get("call_type"));
        }
    }

    public static void C(cmw cmwVar, cav cavVar, int i) {
        cav cavVar2;
        cmw cmwVar2;
        int i2 = i | 6;
        boolean z = (i2 & 3) != 2;
        cav cavVarB = cavVar.b(774362273);
        if (cavVarB.H(z, i2 & 1)) {
            cmwVar2 = cmw.c;
            cmw cmwVarBa = den.ba(azm.d(cmwVar2, 1.0f), 0.0f, 36.0f, 0.0f, 0.0f);
            cye cyeVarB = awo.b(cmh.e, false);
            cbt cbtVar = (cbt) cavVarB;
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cavVarB, cmwVarBa);
            aomy aomyVar = dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            cev.c(cavVarB, cyeVarB, dam.e);
            cev.c(cavVarB, cjeVarAi, dam.d);
            cev.c(cavVarB, java.lang.Integer.valueOf(iM), dam.f);
            cev.b(cavVarB, dam.g);
            cev.c(cavVarB, cmwVarM, dam.c);
            cavVar2 = cavVarB;
            bvt.b(dfa.f(2132017706, cavVarB), (cmw) null, den.ak(cavVarB).s, 0L, (dnd) null, (dmq) null, 0L, new dot(3), 0L, 0, false, 0, 0, (aonj) null, den.an(cavVarB).j, cavVar2, 0, 0, 130042);
            cbtVar.W(true);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            cmwVar2 = cmwVar;
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ajs(cmwVar2, i, 20);
        }
    }

    public static /* synthetic */ defpackage.jhw D(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.jhw(akzxVar);
    }

    public static /* synthetic */ defpackage.jhw E(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.jhw(akzxVar);
    }

    public static /* synthetic */ defpackage.jhw F(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.jhw(akzxVar);
    }

    public static /* synthetic */ defpackage.jhw G(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.jhw(akzxVar);
    }

    public static izg H(java.lang.Object obj, java.lang.Object obj2, java.lang.String[] strArr, cav cavVar) {
        boolean zB = cavVar.B(strArr);
        cbt cbtVar = (cbt) cavVar;
        java.lang.Object objR = cbtVar.R();
        if (zB || objR == cau.a) {
            objR = new defpackage.hcw((java.lang.String[]) java.util.Arrays.copyOf(strArr, 1));
            cbtVar.ab(objR);
        }
        defpackage.hcw hcwVar = (defpackage.hcw) objR;
        boolean zB2 = cavVar.B(hcwVar) | cavVar.B(obj2);
        java.lang.Object objR2 = cbtVar.R();
        if (zB2 || objR2 == cau.a) {
            objR2 = new izg(obj, hcwVar, obj2);
            cbtVar.ab(objR2);
        }
        return (izg) objR2;
    }

    public static defpackage.hsj I(izg[] izgVarArr, cav cavVar) {
        boolean z = cavVar.z(java.util.Arrays.hashCode(izgVarArr));
        cbt cbtVar = (cbt) cavVar;
        java.lang.Object objR = cbtVar.R();
        if (z || objR == cau.a) {
            objR = new defpackage.hsj(ajsz.cU(izgVarArr));
            cbtVar.ab(objR);
        }
        return (defpackage.hsj) objR;
    }

    public static /* synthetic */ defpackage.ni J(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.ni(akzxVar);
    }

    public static void L(defpackage.fvs fvsVar, cjt cjtVar, aonn aonnVar, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(233973821);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(fvsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? cavVarB.B(cjtVar) : cavVarB.D(cjtVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.D(aonnVar) ? 128 : 256;
        }
        if (cavVarB.H((i2 & 147) != 146, i2 & 1)) {
            cbd cbdVar = eov.a;
            den.ac(new cdj[]{eov.b(fvsVar), eom.a.b(fvsVar), gik.a.b(fvsVar)}, cfo.j(1808964477, new defpackage.ata(cjtVar, fvsVar, aonnVar, 7), cavVarB), cavVarB, 48);
        } else {
            cavVarB.s();
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.aoz((java.lang.Object) fvsVar, (java.lang.Object) cjtVar, (java.lang.Object) aonnVar, i, 15, (byte[]) null);
        }
    }

    public static void M(cjt cjtVar, aonn aonnVar, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(832919318);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cbtVarB.B(cjtVar) : cbtVarB.D(cjtVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.D(aonnVar) ? 16 : 32;
        }
        if (cbtVarB.H((i2 & 19) != 18, i2 & 1)) {
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            if (objR == cau.a) {
                objR = new defpackage.fvt(8);
                cbtVar.ab(objR);
            }
            aonj aonjVar = (aonj) objR;
            cbd cbdVar = eov.a;
            eoi eoiVarA = eov.a(cbtVarB);
            if (eoiVarA == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            aopu[] aopuVarArr = aoou.a;
            aooa aooaVar = new aooa(defpackage.fws.class);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            dzl.o(new aooa(defpackage.fws.class), aonjVar, linkedHashMap);
            defpackage.fws fwsVar = (defpackage.fws) dzl.m(aooaVar, eoiVarA, (java.lang.String) null, dzl.n(linkedHashMap), dzo.n(eoiVarA));
            fwsVar.b = new defpackage.vk(cjtVar);
            cjtVar.c(fwsVar.a, aonnVar, cbtVarB, (i2 & 112) | ((i2 << 6) & 896));
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.dqt(cjtVar, aonnVar, i, 3);
        }
    }

    public static java.util.Set N(cer cerVar) {
        return (java.util.Set) cerVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void O(defpackage.fxg fxgVar, cav cavVar, int i) {
        java.lang.Object obj;
        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList;
        int i2 = i & 6;
        cbt cbtVarB = cavVar.b(294589392);
        int i3 = i2 == 0 ? (true != ((i & 8) == 0 ? cbtVarB.B(fxgVar) : cbtVarB.D(fxgVar)) ? 2 : 4) | i : i;
        boolean z = false;
        if (cbtVarB.H((i3 & 3) != 2, i3 & 1)) {
            int i4 = i3 & 14;
            cjt cjtVarL = cfd.l(cbtVarB);
            cer cerVarJ = cdh.j(fxgVar.d(), cbtVarB);
            java.util.List listAN = aN(cerVarJ);
            boolean zBooleanValue = ((java.lang.Boolean) cbtVarB.e(defpackage.dfy.a)).booleanValue();
            boolean zB = cbtVarB.B(listAN);
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            if (zB || objR == cau.a) {
                obj = objR;
                androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList2 = new androidx.compose.runtime.snapshots.SnapshotStateList();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : listAN) {
                    if (zBooleanValue ? true : ((defpackage.fvs) obj2).f.d.a(emq.d)) {
                        arrayList.add(obj2);
                    }
                }
                snapshotStateList2.addAll(arrayList);
                cbtVar.ab(snapshotStateList2);
                obj = snapshotStateList2;
            }
            obj = objR;
            androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList3 = (androidx.compose.runtime.snapshots.SnapshotStateList) obj;
            P(snapshotStateList3, aN(cerVarJ), cbtVarB, 0);
            cer cerVarJ2 = cdh.j(fxgVar.f().e, cbtVarB);
            java.lang.Object objR2 = cbtVar.R();
            java.lang.Object obj3 = cau.a;
            if (objR2 == obj3) {
                objR2 = new androidx.compose.runtime.snapshots.SnapshotStateList();
                cbtVar.ab(objR2);
            }
            androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList4 = (androidx.compose.runtime.snapshots.SnapshotStateList) objR2;
            cbtVarB.u(-367419233);
            defpackage.cll cllVar = new defpackage.cll(snapshotStateList3, 0);
            while (cllVar.hasNext()) {
                defpackage.fvs fvsVar = (defpackage.fvs) cllVar.next();
                defpackage.fwc fwcVar = fvsVar.a;
                aooh.d(fwcVar, "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination");
                defpackage.fxf fxfVar = (defpackage.fxf) fwcVar;
                boolean zD = ((i4 == 4 || ((i3 & 8) != 0 && cbtVarB.D(fxgVar))) ? true : z) | cbtVarB.D(fvsVar);
                java.lang.Object objR3 = cbtVar.R();
                if (zD || objR3 == obj3) {
                    objR3 = new defpackage.bxq(fxgVar, fvsVar, 14);
                    cbtVar.ab(objR3);
                }
                defpackage.dpm.e((aomy) objR3, fxfVar.f, cfo.j(1129586364, new defpackage.fxd(fvsVar, fxgVar, cjtVarL, snapshotStateList4, fxfVar, 0), cbtVarB), cbtVarB, 384);
                i3 = i3;
                z = false;
            }
            int i5 = i3;
            boolean z2 = z;
            cbtVar.W(z2);
            java.util.Set setN = N(cerVarJ2);
            boolean zB2 = cbtVarB.B(cerVarJ2);
            if (i4 == 4 || ((i5 & 8) != 0 && cbtVarB.D(fxgVar))) {
                z2 = true;
            }
            boolean z3 = zB2 | z2;
            java.lang.Object objR4 = cbtVar.R();
            if (z3 || objR4 == obj3) {
                snapshotStateList = snapshotStateList4;
                objR4 = new hcn(cerVarJ2, fxgVar, snapshotStateList, (aoln) null, 1);
                cbtVar.ab(objR4);
            } else {
                snapshotStateList = snapshotStateList4;
            }
            cbp.f(setN, snapshotStateList, (aonn) objR4, cbtVarB);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ajs(fxgVar, i, 13);
        }
    }

    public static void P(java.util.List list, java.util.Collection collection, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(1537894851);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cbtVarB.B(list) : cbtVarB.D(list)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? cbtVarB.B(collection) : cbtVarB.D(collection)) ? 16 : 32;
        }
        if (cbtVarB.H((i2 & 19) != 18, i2 & 1)) {
            boolean zBooleanValue = ((java.lang.Boolean) cbtVarB.e(defpackage.dfy.a)).booleanValue();
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                defpackage.fvs fvsVar = (defpackage.fvs) it.next();
                emy emyVar = fvsVar.f;
                boolean zC = cbtVarB.C(zBooleanValue) | ((i2 & 14) == 4 || ((i2 & 8) != 0 && cbtVarB.D(list))) | cbtVarB.D(fvsVar);
                cbt cbtVar = cbtVarB;
                java.lang.Object objR = cbtVar.R();
                if (zC || objR == cau.a) {
                    objR = new defpackage.bud(fvsVar, zBooleanValue, list, 3);
                    cbtVar.ab(objR);
                }
                cbp.c(emyVar, (aonj) objR, cbtVarB);
            }
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.dqt(list, collection, i, 2, null);
        }
    }

    public static boolean Q(java.lang.String str) {
        return str != null && str.length() > 0;
    }

    public static java.lang.String R(java.lang.Class cls) {
        aooh.f(cls, "navigatorClass");
        java.util.Map map = defpackage.fwo.a;
        java.lang.String strA = (java.lang.String) map.get(cls);
        if (strA == null) {
            defpackage.fwm fwmVar = (defpackage.fwm) cls.getAnnotation(defpackage.fwm.class);
            strA = fwmVar != null ? fwmVar.a() : null;
            if (!Q(strA)) {
                throw new java.lang.IllegalArgumentException("No @Navigator.Name annotation found for ".concat(java.lang.String.valueOf(cls.getSimpleName())));
            }
            map.put(cls, strA);
        }
        aooh.c(strA);
        return strA;
    }

    public static java.lang.String S(java.lang.String str) {
        java.lang.String strDecode = android.net.Uri.decode(str);
        aooh.e(strDecode, "decode(...)");
        return strDecode;
    }

    public static android.net.Uri T(java.lang.String str) {
        aooh.f(str, "uriString");
        android.net.Uri uri = android.net.Uri.parse(str);
        aooh.e(uri, "parse(...)");
        return uri;
    }

    public static defpackage.fwj U(aonj aonjVar) {
        defpackage.fwk fwkVar = new defpackage.fwk();
        aonjVar.a(fwkVar);
        defpackage.fwi fwiVar = fwkVar.a;
        fwiVar.a = fwkVar.b;
        fwiVar.b = fwkVar.c;
        fwiVar.b(fwkVar.d, false, fwkVar.f);
        return fwiVar.a();
    }

    public static aoql V(defpackage.fwe fweVar) {
        aooh.f(fweVar, "<this>");
        return aooc.h(fweVar, new defpackage.fvt(6));
    }

    public static defpackage.fwc W(defpackage.fwe fweVar) {
        aooh.f(fweVar, "<this>");
        java.util.Iterator itA = V(fweVar).a();
        if (!itA.hasNext()) {
            throw new java.util.NoSuchElementException("Sequence is empty.");
        }
        java.lang.Object next = itA.next();
        while (itA.hasNext()) {
            next = itA.next();
        }
        return (defpackage.fwc) next;
    }

    public static java.lang.String X(java.lang.String str) {
        return str != null ? "android-app://androidx.navigation/".concat(str) : "";
    }

    public static aoql Y(defpackage.fwc fwcVar) {
        aooh.f(fwcVar, "<this>");
        return aooc.h(fwcVar, new defpackage.fvt(5));
    }

    public static defpackage.fvz Z(java.lang.String str) {
        return new defpackage.fvz(str);
    }

    public static int a(float f, int i, int i2) {
        if (i == i2 || f <= 0.0f) {
            return i;
        }
        if (f >= 1.0f) {
            return i2;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float f3 = ((((i2 >> 24) & 255) / 255.0f) - f2) * f;
        float fAJ = aJ(((i >> 16) & 255) / 255.0f);
        float fAJ2 = aJ(((i >> 8) & 255) / 255.0f);
        float fAJ3 = aJ((i & 255) / 255.0f);
        float fAJ4 = fAJ + ((aJ(((i2 >> 16) & 255) / 255.0f) - fAJ) * f);
        float fAJ5 = fAJ2 + ((aJ(((i2 >> 8) & 255) / 255.0f) - fAJ2) * f);
        float fAJ6 = fAJ3 + (f * (aJ((i2 & 255) / 255.0f) - fAJ3));
        return (java.lang.Math.round((f2 + f3) * 255.0f) << 24) | (java.lang.Math.round(aK(fAJ4) * 255.0f) << 16) | (java.lang.Math.round(aK(fAJ5) * 255.0f) << 8) | java.lang.Math.round(aK(fAJ6) * 255.0f);
    }

    public static java.util.List aA(byte[] bArr) {
        long jAy = ay(bArr);
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(aQ((jAy * 1000000000) / 48000));
        arrayList.add(aQ(80000000L));
        return arrayList;
    }

    public static boolean aB(long j, long j2) {
        return j - j2 <= 80000;
    }

    public static int aC(java.nio.ByteBuffer byteBuffer) {
        int i = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            byte b2 = byteBuffer.get();
            i |= (b2 & 127) << (i2 * 7);
            if ((b2 & 128) == 0) {
                break;
            }
        }
        return i;
    }

    public static java.util.List aD(java.nio.ByteBuffer byteBuffer) {
        java.nio.ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            java.nio.ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
            try {
                byte b2 = byteBufferAsReadOnlyBuffer.get();
                int i = b2 >> 3;
                if (((b2 >> 2) & 1) != 0) {
                    byteBufferAsReadOnlyBuffer.get();
                }
                int iAC = ((b2 >> 1) & 1) != 0 ? aC(byteBufferAsReadOnlyBuffer) : byteBufferAsReadOnlyBuffer.remaining();
                if (byteBufferAsReadOnlyBuffer.position() + iAC > byteBufferAsReadOnlyBuffer.limit()) {
                    break;
                }
                byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position());
                java.nio.ByteBuffer byteBufferDuplicate2 = byteBufferAsReadOnlyBuffer.duplicate();
                byteBufferDuplicate2.limit(byteBufferAsReadOnlyBuffer.position() + iAC);
                arrayList.add(new amwp(i & 15, byteBufferDuplicate2));
                byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iAC);
            } catch (java.nio.BufferUnderflowException unused) {
            }
        }
        return arrayList;
    }

    public static void aE(boolean z) throws defpackage.evd {
        if (z) {
            throw new defpackage.evd();
        }
    }

    public static void aF(android.text.Spannable spannable, java.lang.Object obj, int i, int i2) {
        for (java.lang.Object obj2 : spannable.getSpans(i, i2, obj.getClass())) {
            aG(spannable, obj2, i, i2);
        }
        spannable.setSpan(obj, i, i2, 33);
    }

    public static void aG(android.text.Spannable spannable, java.lang.Object obj, int i, int i2) {
        if (spannable.getSpanStart(obj) == i && spannable.getSpanEnd(obj) == i2 && spannable.getSpanFlags(obj) == 33) {
            spannable.removeSpan(obj);
        }
    }

    public static synchronized android.media.AudioManager aH(android.content.Context context) {
        android.media.AudioManager audioManager;
        android.content.Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            e = null;
        }
        audioManager = e;
        if (audioManager == null) {
            android.os.Looper looperMyLooper = android.os.Looper.myLooper();
            if (looperMyLooper == null || looperMyLooper == android.os.Looper.getMainLooper()) {
                audioManager = (android.media.AudioManager) applicationContext.getSystemService("audio");
                e = audioManager;
                ahvr.ci(audioManager);
            } else {
                defpackage.agze agzeVar = new defpackage.agze(null);
                defpackage.hgu.aD().execute(new ad(applicationContext, agzeVar, 20, (byte[]) null));
                agzeVar.c();
                audioManager = e;
                ahvr.ci(audioManager);
            }
        }
        return audioManager;
    }

    public static long aI(amwp amwpVar) {
        for (java.lang.Object cause = amwpVar.b; cause != null; cause = ((java.lang.Throwable) cause).getCause()) {
            if ((cause instanceof defpackage.era) || (cause instanceof java.io.FileNotFoundException) || (cause instanceof defpackage.ewe) || (cause instanceof defpackage.fiw) || ((cause instanceof defpackage.evs) && ((defpackage.evs) cause).a == 2008)) {
                return -9223372036854775807L;
            }
        }
        return java.lang.Math.min((amwpVar.a - 1) * 1000, 5000);
    }

    private static float aJ(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) java.lang.Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    private static float aK(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((java.lang.Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    private static defpackage.ked aL(android.content.ContentValues contentValues, java.lang.String str) {
        return y(contentValues.getAsByteArray(str));
    }

    private static void aM(java.lang.String str, android.content.ContentValues contentValues) {
        ahvr.bR(!contentValues.containsKey(str), "Column %s is banned.", str);
    }

    private static java.util.List aN(cer cerVar) {
        return (java.util.List) cerVar.a();
    }

    private static defpackage.fwc aO(int i, defpackage.fwe fweVar) {
        aojw aojwVar = new aojw();
        aojwVar.addLast(fweVar);
        while (!aojwVar.isEmpty()) {
            defpackage.fwc fwcVar = (defpackage.fwc) aojwVar.removeFirst();
            if (fwcVar.b() == i) {
                return fwcVar;
            }
            if (fwcVar instanceof defpackage.fwe) {
                java.util.Iterator it = ((defpackage.fwe) fwcVar).iterator();
                while (it.hasNext()) {
                    aojwVar.addLast((defpackage.fwc) it.next());
                }
            }
        }
        return null;
    }

    private static int aP(defpackage.etx etxVar) {
        int i = 0;
        while (etxVar.d() != 0) {
            int iN = etxVar.n();
            i += iN;
            if (iN != 255) {
                return i;
            }
        }
        return -1;
    }

    private static byte[] aQ(long j) {
        return java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(j).array();
    }

    public static defpackage.fwa aa(android.content.Intent intent) {
        aooh.f(intent, "intent");
        return new defpackage.fwa(intent.getData(), intent.getAction(), intent.getType());
    }

    public static java.util.List ab(java.util.Map map, aonj aonjVar) {
        aooh.f(map, "<this>");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            if (((defpackage.fvr) ((java.util.Map.Entry) it.next()).getValue()) != null) {
                throw null;
            }
            aooh.c((java.lang.Object) null);
            throw null;
        }
        java.util.Set setKeySet = linkedHashMap.keySet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : setKeySet) {
            if (((java.lang.Boolean) aonjVar.a((java.lang.String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static int ac(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long ad(defpackage.etx etxVar, int i, int i2) {
        etxVar.Q(i);
        if (etxVar.d() >= 5) {
            int i3 = etxVar.i();
            if ((8388608 & i3) == 0 && ((i3 >> 8) & 8191) == i2 && (i3 & 32) != 0 && etxVar.n() >= 7 && etxVar.d() >= 7 && (etxVar.n() & 16) == 16) {
                byte[] bArr = new byte[6];
                etxVar.L(bArr, 0, 6);
                return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
            }
        }
        return -9223372036854775807L;
    }

    public static java.lang.String ae(defpackage.vk vkVar, int i) {
        aooh.f(vkVar, "context");
        return i <= 16777215 ? java.lang.String.valueOf(i) : vkVar.b(i);
    }

    public static defpackage.dvw af(android.content.Context context, defpackage.vk vkVar, android.content.Intent intent, defpackage.fwe fweVar, java.util.List list) {
        if (list.isEmpty()) {
            throw new java.lang.IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList<? extends android.os.Parcelable> arrayList2 = new java.util.ArrayList<>();
        java.util.Iterator it = list.iterator();
        defpackage.fwc fwcVar = null;
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                intent.putExtra("android-support-nav:controller:deepLinkIds", ajsz.cm(arrayList));
                intent.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList2);
                defpackage.dvw dvwVar = new defpackage.dvw(context);
                dvwVar.b(new android.content.Intent(intent));
                java.util.ArrayList arrayList3 = dvwVar.a;
                int size = arrayList3.size();
                while (i < size) {
                    android.content.Intent intent2 = (android.content.Intent) arrayList3.get(i);
                    if (intent2 != null) {
                        intent2.putExtra("android-support-nav:controller:deepLinkIntent", intent);
                    }
                    i++;
                }
                return dvwVar;
            }
            amwp amwpVar = (amwp) it.next();
            int i2 = amwpVar.a;
            java.lang.Object obj = amwpVar.b;
            defpackage.fwc fwcVarAO = aO(i2, fweVar);
            if (fwcVarAO == null) {
                throw new java.lang.IllegalArgumentException("Navigation destination " + ae(vkVar, i2) + " cannot be found in the navigation graph " + fweVar);
            }
            int[] iArrH = fwcVarAO.h(fwcVar);
            int length = iArrH.length;
            while (i < length) {
                arrayList.add(java.lang.Integer.valueOf(iArrH[i]));
                arrayList2.add(obj);
                i++;
            }
            fwcVar = fwcVarAO;
        }
    }

    public static void ag(defpackage.vk vkVar, defpackage.fwe fweVar, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            int i = ((amwp) it.next()).a;
            if (aO(i, fweVar) == null) {
                throw new java.lang.IllegalArgumentException("Navigation destination " + ae(vkVar, i) + " cannot be found in the navigation graph " + fweVar);
            }
        }
    }

    public static defpackage.fvs ah(defpackage.vk vkVar, defpackage.fwc fwcVar, android.os.Bundle bundle, emq emqVar, defpackage.fwl fwlVar, java.lang.String str, android.os.Bundle bundle2) {
        aooh.f(fwcVar, "destination");
        aooh.f(emqVar, "hostLifecycleState");
        aooh.f(str, "id");
        return new defpackage.fvs(vkVar, fwcVar, bundle, emqVar, fwlVar, str, bundle2);
    }

    public static /* synthetic */ defpackage.fvs ai(defpackage.vk vkVar, defpackage.fwc fwcVar, android.os.Bundle bundle, emq emqVar, defpackage.fwl fwlVar) {
        java.lang.String string = java.util.UUID.randomUUID().toString();
        aooh.e(string, "toString(...)");
        return ah(vkVar, fwcVar, bundle, emqVar, fwlVar, string, null);
    }

    public static void aj(long j, defpackage.etx etxVar, defpackage.fmk[] fmkVarArr) {
        int i;
        while (true) {
            if (etxVar.d() <= 1) {
                return;
            }
            int iAP = aP(etxVar);
            int iAP2 = aP(etxVar);
            int i2 = etxVar.c + iAP2;
            if (iAP2 == -1 || iAP2 > etxVar.d()) {
                defpackage.etr.f("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i2 = etxVar.d;
            } else if (iAP == 4 && iAP2 >= 8) {
                int iN = etxVar.n();
                int iS = etxVar.s();
                if (iS == 49) {
                    i = etxVar.i();
                    iS = 49;
                } else {
                    i = 0;
                }
                int iN2 = etxVar.n();
                if (iS == 47) {
                    etxVar.R(1);
                    iS = 47;
                }
                boolean z = iN == 181 && (iS == 49 || iS == 47) && iN2 == 3;
                if (iS == 49) {
                    z &= i == 1195456820;
                }
                if (z) {
                    ak(j, etxVar, fmkVarArr);
                }
            }
            etxVar.Q(i2);
        }
    }

    public static void ak(long j, defpackage.etx etxVar, defpackage.fmk[] fmkVarArr) {
        int iN = etxVar.n();
        if ((iN & 64) != 0) {
            int i = iN & 31;
            etxVar.R(1);
            int i2 = etxVar.c;
            for (defpackage.fmk fmkVar : fmkVarArr) {
                int i3 = i * 3;
                etxVar.Q(i2);
                fmkVar.b(etxVar, i3);
                ahvr.bY(j != -9223372036854775807L);
                fmkVar.d(j, 1, i3, 0, null);
            }
        }
    }

    public static void al(android.view.Surface surface, float f) {
        try {
            baa$.ExternalSyntheticApiModelOutline1.m(surface, f, f == 0.0f ? 0 : 1);
        } catch (java.lang.IllegalStateException e2) {
            defpackage.etr.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e2);
        }
    }

    public static void am(java.nio.ByteBuffer byteBuffer, boolean z) {
        for (amwp amwpVar : aD(byteBuffer.asReadOnlyBuffer())) {
            if (amwpVar.a == 5) {
                try {
                    amwp amwpVarK = amwp.k(amwpVar);
                    if (amwpVarK.a == 4) {
                        if (z) {
                            java.lang.Object obj = amwpVarK.b;
                            byte[] bArr = defpackage.ete.a;
                            java.nio.ByteBuffer byteBuffer2 = (java.nio.ByteBuffer) obj;
                            if (!defpackage.ete.k(byteBuffer2, byteBuffer2.position(), byteBuffer2.limit())) {
                            }
                        }
                        byteBuffer.put(((java.nio.ByteBuffer) amwpVar.b).position(), (byte) 31);
                    }
                } catch (java.nio.BufferUnderflowException unused) {
                }
            }
        }
    }

    public static byte[] an(java.nio.ByteBuffer byteBuffer) {
        byte[] bArr;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        loop0: while (true) {
            bArr = null;
            for (amwp amwpVar : aD(byteBuffer)) {
                if (amwpVar.a == 5) {
                    try {
                        amwp amwpVarK = amwp.k(amwpVar);
                        if (amwpVarK.a == 4) {
                            arrayList.add(java.lang.Integer.valueOf(((java.nio.ByteBuffer) amwpVar.b).position()));
                            java.nio.ByteBuffer byteBuffer2 = (java.nio.ByteBuffer) amwpVarK.b;
                            if (!defpackage.ete.i(byteBuffer2)) {
                                continue;
                            } else if (bArr != null) {
                                defpackage.etr.f("Av1ObuUtil", "Found multiple HAGC metadata OBUs in the same temporal unit. Using the first.");
                            } else {
                                int iPosition = byteBuffer2.position() + defpackage.ete.b;
                                int iLimit = byteBuffer2.limit();
                                do {
                                    iLimit--;
                                    if (iLimit < iPosition) {
                                        break;
                                    }
                                } while (byteBuffer2.get(iLimit) == 0);
                                int i = iLimit - iPosition;
                                if (i > 0 && (byteBuffer2.get(iLimit) & 255) == 128) {
                                    byte[] bArr2 = new byte[i];
                                    byteBuffer2.position(iPosition);
                                    byteBuffer2.get(bArr2);
                                    bArr = bArr2;
                                }
                            }
                        } else {
                            continue;
                        }
                    } catch (java.nio.BufferUnderflowException unused) {
                        continue;
                    }
                }
            }
            break loop0;
        }
        if (bArr == null) {
            return null;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            byteBuffer.put(((java.lang.Integer) arrayList.get(i2)).intValue(), (byte) 31);
        }
        return bArr;
    }

    public static int ao(int i) {
        return i == 7 ? 6 : 3;
    }

    public static int ap(boolean z) {
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities;
        java.util.List listM;
        try {
            defpackage.eqf eqfVar = new defpackage.eqf();
            eqfVar.c("video/avc");
            defpackage.eqg eqgVar = new defpackage.eqg(eqfVar);
            if (eqgVar.p == null) {
                return 0;
            }
            aike aikeVarJ = defpackage.feq.j(eqgVar, z, false);
            for (int i = 0; i < aikeVarJ.d; i++) {
                if (((defpackage.fee) aikeVarJ.get(i)).e != null && (videoCapabilities = ((defpackage.fee) aikeVarJ.get(i)).e.getVideoCapabilities()) != null && (listM = fn$.ExternalSyntheticApiModelOutline0.m(videoCapabilities)) != null && !listM.isEmpty()) {
                    return aq(listM, new android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60));
                }
            }
            return 0;
        } catch (defpackage.feo unused) {
            return 0;
        }
    }

    public static int aq(java.util.List list, android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        for (int i = 0; i < list.size(); i++) {
            if (fn$.ExternalSyntheticApiModelOutline0.m(fn$.ExternalSyntheticApiModelOutline0.m(list.get(i)), performancePoint)) {
                return 2;
            }
        }
        return 1;
    }

    public static long ar(java.util.Map map, java.lang.String str) {
        try {
            java.lang.String str2 = (java.lang.String) map.get(str);
            if (str2 != null) {
                return java.lang.Long.parseLong(str2);
            }
        } catch (java.lang.NumberFormatException unused) {
        }
        return -9223372036854775807L;
    }

    public static aify as(java.util.List list) {
        if (android.os.Build.VERSION.SDK_INT < 31 || list == null) {
            return aike.a;
        }
        java.util.TreeSet treeSet = new java.util.TreeSet(j$.util.Comparator.-EL.reversed(j$.util.Comparator.-CC.comparing(new defpackage.etw(3))));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.media.AudioDescriptor audioDescriptorM = mp$.ExternalSyntheticApiModelOutline0.m(it.next());
            if (mp$.ExternalSyntheticApiModelOutline0.m(audioDescriptorM) == 1) {
                byte[] bArrM = mp$.ExternalSyntheticApiModelOutline0.m(audioDescriptorM);
                int length = bArrM.length;
                if (length != 3) {
                    defpackage.etr.f("AudioDescriptorUtil", a.bj(length, "Invalid SAD length: "));
                } else {
                    byte b2 = bArrM[0];
                    int i = (b2 & 7) + 1;
                    if (((b2 >> 3) & 15) == 1) {
                        treeSet.add(java.lang.Integer.valueOf(eum.g(i)));
                    }
                }
            }
        }
        return aify.n(treeSet);
    }

    public static boolean at(int i, defpackage.eqd eqdVar) {
        return eqdVar.a.get(i);
    }

    public static defpackage.ezm au(int i, android.util.SparseArray sparseArray) {
        defpackage.ezm ezmVar = (defpackage.ezm) sparseArray.get(i);
        ahvr.ci(ezmVar);
        return ezmVar;
    }

    public static int av(defpackage.eqd eqdVar) {
        return eqdVar.b();
    }

    public static boolean aw(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    public static long ax(defpackage.ezf ezfVar) {
        if (ezfVar.dF() == 1) {
            return (ezfVar.X() || ezfVar.W()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    public static int ay(byte[] bArr) {
        return ((bArr[11] & 255) << 8) | (bArr[10] & 255);
    }

    public static long az(byte b2, byte b3) {
        int i;
        int i2;
        int i3 = b2 & 255;
        int i4 = b2 & 3;
        if (i4 != 0) {
            i = 2;
            if (i4 != 1 && i4 != 2) {
                i = b3 & 63;
            }
        } else {
            i = 1;
        }
        int i5 = i3 >> 3;
        int i6 = i5 & 3;
        if (i5 >= 16) {
            i2 = 2500 << i6;
        } else if (i5 >= 12) {
            i2 = 10000 << (i5 & 1);
        } else {
            i2 = i6 == 3 ? 60000 : 10000 << i6;
        }
        return ((long) i) * ((long) i2);
    }

    public static defpackage.hda b(defpackage.hfz hfzVar, defpackage.gzh gzhVar) {
        return new defpackage.hda(defpackage.hfi.a(hfzVar, gzhVar, 1.0f, defpackage.hfa.b, false));
    }

    public static defpackage.hdb c(defpackage.hfz hfzVar, defpackage.gzh gzhVar, boolean z) {
        float f;
        if (z) {
            java.lang.ThreadLocal threadLocal = defpackage.hgm.a;
            f = android.content.res.Resources.getSystem().getDisplayMetrics().density;
        } else {
            f = 1.0f;
        }
        return new defpackage.hdb(defpackage.hfi.a(hfzVar, gzhVar, f, defpackage.hfa.a, false));
    }

    public static defpackage.hdc d(defpackage.hfz hfzVar, defpackage.gzh gzhVar, int i) {
        return new defpackage.hdc(defpackage.hfi.a(hfzVar, gzhVar, 1.0f, new defpackage.hfd(i), false));
    }

    public static defpackage.hdd e(defpackage.hfz hfzVar, defpackage.gzh gzhVar) {
        return new defpackage.hdd(defpackage.hfi.a(hfzVar, gzhVar, 1.0f, defpackage.hfa.c, false));
    }

    public static defpackage.hdf f(defpackage.hfz hfzVar, defpackage.gzh gzhVar) {
        java.lang.ThreadLocal threadLocal = defpackage.hgm.a;
        return new defpackage.hdf(defpackage.hfi.a(hfzVar, gzhVar, android.content.res.Resources.getSystem().getDisplayMetrics().density, defpackage.hfa.e, true));
    }

    public static int[] g() {
        return new int[]{1, 2, 3, 4, 5, 6};
    }

    public static android.media.AudioAttributes h(int i, int i2, boolean z) {
        android.media.AudioAttributes audioAttributesBuild = fn$.ExternalSyntheticApiModelOutline0.m(new android.media.AudioAttributes.Builder().setContentType(i).setUsage(i2), z).build();
        aooh.e(audioAttributesBuild, "build(...)");
        return audioAttributesBuild;
    }

    public static void i(defpackage.oii oiiVar) {
        oiiVar.j(null);
        oiiVar.k(null);
    }

    public static void j(android.app.Notification notification) {
        notification.flags |= 1;
        notification.defaults |= 4;
    }

    public static boolean k(long j, long j2) {
        return (j & j2) != 0;
    }

    public static void l(ajwr ajwrVar) {
        ((android.view.View) ajwrVar.a).findViewById(2131428099).setTag(2131429276, "onCloseButtonClick");
        ajwrVar.f(((android.view.View) ajwrVar.a).findViewById(2131428099), new defpackage.hww(1));
        ((android.view.View) ajwrVar.a).findViewById(2131428098).setTag(2131429276, "onMessageOperatorButtonClick");
        ajwrVar.f(((android.view.View) ajwrVar.a).findViewById(2131428098), new defpackage.hww(0));
    }

    public static android.graphics.Paint.Join m(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            return i2 != 1 ? android.graphics.Paint.Join.BEVEL : android.graphics.Paint.Join.ROUND;
        }
        return android.graphics.Paint.Join.MITER;
    }

    public static android.graphics.Paint.Cap n(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            return i2 != 1 ? android.graphics.Paint.Cap.SQUARE : android.graphics.Paint.Cap.ROUND;
        }
        return android.graphics.Paint.Cap.BUTT;
    }

    public static int[] o() {
        return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
    }

    public static defpackage.hsj p(ccp ccpVar) {
        return (defpackage.hsj) ccpVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0124  */
    /* JADX WARN: Code duplicated, block: B:105:0x0128  */
    /* JADX WARN: Code duplicated, block: B:107:0x012d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0135  */
    /* JADX WARN: Code duplicated, block: B:110:0x0138  */
    /* JADX WARN: Code duplicated, block: B:113:0x013f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0141  */
    /* JADX WARN: Code duplicated, block: B:116:0x0144  */
    /* JADX WARN: Code duplicated, block: B:118:0x014c  */
    /* JADX WARN: Code duplicated, block: B:120:0x0150 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0152  */
    /* JADX WARN: Code duplicated, block: B:122:0x0156  */
    /* JADX WARN: Code duplicated, block: B:125:0x0162  */
    /* JADX WARN: Code duplicated, block: B:126:0x0164  */
    /* JADX WARN: Code duplicated, block: B:128:0x0168  */
    /* JADX WARN: Code duplicated, block: B:131:0x0173  */
    /* JADX WARN: Code duplicated, block: B:132:0x0176  */
    /* JADX WARN: Code duplicated, block: B:134:0x017a  */
    /* JADX WARN: Code duplicated, block: B:136:0x0184  */
    /* JADX WARN: Code duplicated, block: B:137:0x0187  */
    /* JADX WARN: Code duplicated, block: B:141:0x018f  */
    /* JADX WARN: Code duplicated, block: B:142:0x0192  */
    /* JADX WARN: Code duplicated, block: B:144:0x0196  */
    /* JADX WARN: Code duplicated, block: B:146:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:150:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:151:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:153:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:155:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:156:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:159:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:163:0x01de  */
    /* JADX WARN: Code duplicated, block: B:168:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:171:0x01f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:172:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:173:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:176:0x020a  */
    /* JADX WARN: Code duplicated, block: B:178:0x020d  */
    /* JADX WARN: Code duplicated, block: B:179:0x0210  */
    /* JADX WARN: Code duplicated, block: B:181:0x0213  */
    /* JADX WARN: Code duplicated, block: B:184:0x021c  */
    /* JADX WARN: Code duplicated, block: B:187:0x0249  */
    /* JADX WARN: Code duplicated, block: B:189:0x0254  */
    /* JADX WARN: Code duplicated, block: B:191:0x0263  */
    /* JADX WARN: Code duplicated, block: B:194:0x0275  */
    /* JADX WARN: Code duplicated, block: B:195:0x0289  */
    /* JADX WARN: Code duplicated, block: B:198:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:200:0x02de  */
    /* JADX WARN: Code duplicated, block: B:206:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:208:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:214:0x0312  */
    /* JADX WARN: Code duplicated, block: B:216:0x0318  */
    /* JADX WARN: Code duplicated, block: B:222:0x0329  */
    /* JADX WARN: Code duplicated, block: B:224:0x0330  */
    /* JADX WARN: Code duplicated, block: B:230:0x0346  */
    /* JADX WARN: Code duplicated, block: B:232:0x034c  */
    /* JADX WARN: Code duplicated, block: B:238:0x0366 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:240:0x036d  */
    /* JADX WARN: Code duplicated, block: B:243:0x0399 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:244:0x039b  */
    /* JADX WARN: Code duplicated, block: B:246:0x0410  */
    /* JADX WARN: Code duplicated, block: B:248:0x0429  */
    /* JADX WARN: Code duplicated, block: B:250:0x0431  */
    /* JADX WARN: Code duplicated, block: B:253:0x044e  */
    /* JADX WARN: Code duplicated, block: B:255:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0109  */
    /* JADX WARN: Code duplicated, block: B:95:0x010d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0112  */
    /* JADX WARN: Code duplicated, block: B:99:0x011a  */
    /* JADX WARN: Instruction removed from duplicated block: B:246:0x0410, please report this as an issue */
    public static void q(final defpackage.gzh gzhVar, cmw cmwVar, boolean z, boolean z2, defpackage.hch hchVar, float f, int i, int i2, defpackage.hsj hsjVar, cmj cmjVar, defpackage.cwy cwyVar, boolean z3, int i3, cav cavVar, final int i4, final int i5, final int i6, final int i7) {
        int i8;
        cmw cmwVar2;
        int i9;
        float f2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean zD;
        int i26;
        int i27;
        boolean z4;
        cav cavVar2;
        final defpackage.cwy cwyVar2;
        final boolean z5;
        final defpackage.hch hchVar2;
        final defpackage.hsj hsjVar2;
        final cmw cmwVar3;
        final int i28;
        final float f3;
        final boolean z6;
        final boolean z7;
        final int i29;
        final cmj cmjVar2;
        final int i30;
        cdk cdkVarI;
        cmw cmwVar4;
        boolean z8;
        boolean z9;
        float f4;
        int i31;
        int i32;
        cmw cmwVar5;
        int i33;
        int i34;
        int i35;
        int i36;
        cmj cmjVar3;
        defpackage.cwy cwyVar3;
        cbt cbtVar;
        java.lang.Object objR;
        java.lang.Object obj;
        defpackage.hcb hcbVar;
        java.lang.Object objR2;
        ccp ccpVar;
        float fB;
        boolean zB;
        java.lang.Object objR3;
        boolean z10;
        boolean zB2;
        java.lang.Object objR4;
        defpackage.hch hchVar3 = hchVar;
        defpackage.hsj hsjVar3 = hsjVar;
        int i37 = i4 & 6;
        cav cavVarB = cavVar.b(-1151869807);
        if (i37 == 0) {
            i8 = (true != cavVarB.D(gzhVar) ? 2 : 4) | i4;
        } else {
            i8 = i4;
        }
        int i38 = i7 & 2;
        if (i38 != 0) {
            i8 |= 48;
            cmwVar2 = cmwVar;
            i9 = 4;
        } else {
            cmwVar2 = cmwVar;
            i9 = 4;
            if ((i4 & 48) == 0) {
                i8 |= true != cavVarB.B(cmwVar2) ? 16 : 32;
            }
        }
        int i39 = i7 & 4;
        boolean z11 = i39 == 0;
        if (i39 != 0) {
            i8 |= 384;
        } else if ((i4 & 384) == 0) {
            i8 |= true != cavVarB.C(z) ? 128 : 256;
        }
        int i40 = i7 & 8;
        boolean z12 = i40 == 0;
        if (i40 != 0) {
            i8 |= 3072;
        } else if ((i4 & 3072) == 0) {
            i8 |= true != cavVarB.C(z2) ? 1024 : 2048;
        }
        int i41 = i7 & 16;
        if (i41 != 0) {
            i8 |= 24576;
        } else if ((i4 & 24576) == 0) {
            i8 |= true != ((32768 & i4) == 0 ? cavVarB.B(hchVar3) : cavVarB.D(hchVar3)) ? 8192 : 16384;
        }
        int i42 = i7 & 32;
        if (i42 != 0) {
            i8 |= 196608;
            f2 = f;
        } else {
            f2 = f;
            if ((i4 & 196608) == 0) {
                i8 |= true != cavVarB.y(f2) ? 65536 : 131072;
            }
        }
        int i43 = i7 & 64;
        if (i43 != 0) {
            i8 |= 1572864;
            i10 = i;
            i11 = i43;
        } else {
            i10 = i;
            i11 = i43;
            if ((i4 & 1572864) == 0) {
                i8 |= true != cavVarB.z(i10) ? 524288 : 1048576;
            }
        }
        if ((i7 & 128) == 0) {
            if ((12582912 & i4) == 0) {
                i12 = true != cavVarB.C(false) ? 4194304 : 8388608;
            }
            if ((i7 & 256) != 0) {
                if ((100663296 & i4) == 0) {
                    if (true != cavVarB.C(false)) {
                        i13 = 33554432;
                    } else {
                        i13 = 67108864;
                    }
                }
                if ((i7 & 512) != 0) {
                    if ((805306368 & i4) == 0) {
                        if (true != cavVarB.C(false)) {
                            i14 = 268435456;
                        } else {
                            i14 = 536870912;
                        }
                    }
                    i15 = i7 & 1024;
                    if (i15 != 0) {
                        i16 = 0;
                    } else {
                        i16 = 1;
                    }
                    if (i15 != 0) {
                        if ((i5 & 6) == 0) {
                            if (i2 == 0) {
                                i19 = -1;
                                i2 = 0;
                            } else {
                                i2 = 1;
                                i19 = 0;
                            }
                            if (true != cavVarB.z(i19)) {
                                i20 = 2;
                            } else {
                                i20 = i9;
                            }
                            i21 = i20 | i5;
                        } else {
                            i16 = i16;
                            i17 = i2;
                            i18 = i5;
                        }
                        i22 = i17;
                        if ((i7 & 2048) != 0) {
                            i18 |= 48;
                        } else if ((i5 & 48) == 0) {
                            int i44 = i18;
                            if (true != cavVarB.C(false)) {
                                i23 = 16;
                            } else {
                                i23 = 32;
                            }
                            i18 = i44 | i23;
                        }
                        if ((i7 & 4096) != 0) {
                            i18 |= 384;
                        } else if ((i5 & 384) == 0) {
                            i18 |= true == cavVarB.C(false) ? 256 : 128;
                        }
                        i24 = i7 & 8192;
                        if (i24 != 0) {
                            i18 |= 3072;
                            i25 = i24;
                        } else {
                            i25 = i24;
                            if ((i5 & 3072) == 0) {
                                if ((i5 & 4096) == 0) {
                                    zD = cavVarB.B(hsjVar3);
                                } else {
                                    zD = cavVarB.D(hsjVar3);
                                }
                                i18 |= true == zD ? 2048 : 1024;
                            }
                        }
                        i26 = i6 | 6;
                        i27 = i18 | 920346624;
                        if ((i8 & 306783379) != 306783378 && (i27 & 306783379) == 306783378 && (i26 & 3) == 2) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        if (cavVarB.H(z4, i8 & 1)) {
                            if (i38 != 0) {
                                cmwVar4 = cmw.c;
                            } else {
                                cmwVar4 = cmwVar2;
                            }
                            z8 = (!z11) | z;
                            z9 = (!z12) | z2;
                            if (i41 != 0) {
                                hchVar3 = null;
                            }
                            if (i42 != 0) {
                                f4 = 1.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i11 != 0) {
                                i10 = 1;
                            }
                            i31 = (i16 ^ 1) | i22;
                            if (i25 != 0) {
                                hsjVar3 = null;
                            }
                            i32 = i8 & 14;
                            int i45 = i8 >> 3;
                            cmwVar5 = cmwVar4;
                            i33 = i32 | (i45 & 112) | (i45 & 896) | ((i27 << 6) & 7168) | 32768;
                            i34 = i8 & 57344;
                            i35 = i8 & 458752;
                            i36 = i8 & 3670016;
                            cmjVar3 = cmh.e;
                            cwyVar3 = cwx.b;
                            if (i10 > 0) {
                                throw new java.lang.IllegalArgumentException("Iterations must be a positive number (0).");
                            }
                            if (java.lang.Math.abs(f4) <= Float.MAX_VALUE) {
                                throw new java.lang.IllegalArgumentException("Speed must be a finite number. It is " + f4 + '.');
                            }
                            cbtVar = (cbt) cavVarB;
                            defpackage.hsj hsjVar4 = hsjVar3;
                            objR = cbtVar.R();
                            obj = cau.a;
                            if (objR == obj) {
                                objR = new defpackage.hcb();
                                cbtVar.ab(objR);
                            }
                            hcbVar = (defpackage.hcb) objR;
                            int i46 = i8;
                            objR2 = cbtVar.R();
                            if (objR2 == obj) {
                                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.valueOf(z8), cdu.c);
                                cbtVar.ab(parcelableSnapshotMutableState);
                                objR2 = parcelableSnapshotMutableState;
                            }
                            int i47 = i33 | i34 | i35 | i36;
                            ccpVar = (ccp) objR2;
                            cavVarB.u(-133180567);
                            fB = f4 / defpackage.hgm.b((android.content.Context) cavVarB.e(dep.b));
                            cbtVar.W(false);
                            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z8);
                            java.lang.Float fValueOf = java.lang.Float.valueOf(fB);
                            java.lang.Integer numValueOf = java.lang.Integer.valueOf(i10);
                            java.lang.Object[] objArr = new java.lang.Object[5];
                            objArr[0] = gzhVar;
                            objArr[1] = boolValueOf;
                            objArr[2] = hchVar3;
                            objArr[3] = fValueOf;
                            objArr[i9] = numValueOf;
                            zB = ((((i47 & 112) ^ 48) <= 32 && cavVarB.C(z8)) || (i47 & 48) == 32) | ((((i47 & 896) ^ 384) <= 256 && cavVarB.C(z9)) || (i47 & 384) == 256) | cavVarB.B(hcbVar) | cavVarB.D(gzhVar) | ((((3670016 & i47) ^ 1572864) <= 1048576 && cavVarB.z(i10)) || (i47 & 1572864) == 1048576) | ((((i47 & 7168) ^ 3072) <= 2048 && cavVarB.C(false)) || (i47 & 3072) == 2048) | cavVarB.y(fB) | ((((i47 & 57344) ^ 24576) <= 16384 && cavVarB.D(hchVar3)) || (i47 & 24576) == 16384) | cavVarB.z(0) | cavVarB.C(false);
                            objR3 = cbtVar.R();
                            if (!zB || objR3 == obj) {
                                objR3 = new defpackage.hbv(z8, z9, hcbVar, gzhVar, i10, fB, hchVar3, ccpVar, null);
                                z10 = z9;
                                cbtVar.ab(objR3);
                            } else {
                                z10 = z9;
                            }
                            cbp.h(objArr, (aonn) objR3, cavVarB);
                            zB2 = cavVarB.B(hcbVar);
                            objR4 = cbtVar.R();
                            if (zB2 || objR4 == obj) {
                                objR4 = new defpackage.fxt(hcbVar, 16);
                                cbtVar.ab(objR4);
                            }
                            int i48 = i46 >> 12;
                            int i49 = i27 << 15;
                            r(gzhVar, (aomy) objR4, cmwVar5, i31, hsjVar4, cmjVar3, cwyVar3, 1, cavVarB, i32 | ((i46 << 3) & 896) | (i48 & 7168) | (i48 & 57344) | (i48 & 458752) | ((i27 << 18) & 3670016) | (29360128 & i49) | (234881024 & i49) | (i49 & 1879048192), ((i27 >> 15) & 8190) | ((i26 << 12) & 57344) | ((i27 >> 12) & 458752));
                            cavVar2 = cavVarB;
                            cwyVar2 = cwyVar3;
                            hchVar2 = hchVar3;
                            cmwVar3 = cmwVar5;
                            f3 = f4;
                            i28 = i10;
                            z6 = z8;
                            z7 = z10;
                            z5 = true;
                            i30 = 1;
                            hsjVar2 = hsjVar4;
                            i29 = i31;
                            cmjVar2 = cmjVar3;
                        } else {
                            cavVar2 = cavVarB;
                            cavVar2.s();
                            cwyVar2 = cwyVar;
                            z5 = z3;
                            hchVar2 = hchVar3;
                            hsjVar2 = hsjVar3;
                            cmwVar3 = cmwVar2;
                            i28 = i10;
                            f3 = f2;
                            z6 = z;
                            z7 = z2;
                            i29 = i22;
                            cmjVar2 = cmjVar;
                            i30 = i3;
                        }
                        cdkVarI = cavVar2.I();
                        if (cdkVarI != null) {
                            cdkVarI.c = new aonn() { // from class: hce
                                public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3) {
                                    ((java.lang.Integer) obj3).intValue();
                                    defpackage.gzh gzhVar2 = gzhVar;
                                    cmw cmwVar6 = cmwVar3;
                                    boolean z13 = z6;
                                    boolean z14 = z7;
                                    defpackage.hch hchVar4 = hchVar2;
                                    float f5 = f3;
                                    int i50 = i28;
                                    int i51 = i29;
                                    defpackage.hsj hsjVar5 = hsjVar2;
                                    int i52 = i4;
                                    cmj cmjVar4 = cmjVar2;
                                    int i53 = i6;
                                    int i54 = i5;
                                    int i55 = i52 | 1;
                                    int i56 = i53 & 306783378;
                                    int i57 = i56 << 1;
                                    int i58 = i54 & 306783378;
                                    int i59 = i55 & 306783378;
                                    int i60 = i59 << 1;
                                    boolean z15 = z5;
                                    int i61 = i53 & 613566756;
                                    int i62 = i53 & (-920350135);
                                    int i63 = i54 & 613566756;
                                    int i64 = i55 & 613566756;
                                    int i65 = i30;
                                    defpackage.hgt.q(gzhVar2, cmwVar6, z13, z14, hchVar4, f5, i50, i51, hsjVar5, cmjVar4, cwyVar2, z15, i65, (cav) obj2, (i55 & (-920350135)) | i59 | (i64 >> 1) | (i60 & i64), (i54 & (-920350135)) | i58 | (i63 >> 1) | ((i58 << 1) & i63), i62 | i56 | (i61 >> 1) | (i57 & i61), i7);
                                    return aojh.a;
                                }
                            };
                        }
                    }
                    i21 = i5 | 6;
                    i18 = i21;
                    i17 = i2;
                    i22 = i17;
                    if ((i7 & 2048) != 0) {
                        i18 |= 48;
                    } else if ((i5 & 48) == 0) {
                        int i410 = i18;
                        if (true != cavVarB.C(false)) {
                            i23 = 16;
                        } else {
                            i23 = 32;
                        }
                        i18 = i410 | i23;
                    }
                    if ((i7 & 4096) != 0) {
                        i18 |= 384;
                    } else if ((i5 & 384) == 0) {
                        i18 |= true == cavVarB.C(false) ? 256 : 128;
                    }
                    i24 = i7 & 8192;
                    if (i24 != 0) {
                        i18 |= 3072;
                        i25 = i24;
                    } else {
                        i25 = i24;
                        if ((i5 & 3072) == 0) {
                            if ((i5 & 4096) == 0) {
                                zD = cavVarB.B(hsjVar3);
                            } else {
                                zD = cavVarB.D(hsjVar3);
                            }
                            i18 |= true == zD ? 2048 : 1024;
                        }
                    }
                    i26 = i6 | 6;
                    i27 = i18 | 920346624;
                    if ((i8 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (cavVarB.H(z4, i8 & 1)) {
                        if (i38 != 0) {
                            cmwVar4 = cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        z8 = (!z11) | z;
                        z9 = (!z12) | z2;
                        if (i41 != 0) {
                            hchVar3 = null;
                        }
                        if (i42 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i11 != 0) {
                            i10 = 1;
                        }
                        i31 = (i16 ^ 1) | i22;
                        if (i25 != 0) {
                            hsjVar3 = null;
                        }
                        i32 = i8 & 14;
                        int i411 = i8 >> 3;
                        cmwVar5 = cmwVar4;
                        i33 = i32 | (i411 & 112) | (i411 & 896) | ((i27 << 6) & 7168) | 32768;
                        i34 = i8 & 57344;
                        i35 = i8 & 458752;
                        i36 = i8 & 3670016;
                        cmjVar3 = cmh.e;
                        cwyVar3 = cwx.b;
                        if (i10 > 0) {
                            throw new java.lang.IllegalArgumentException("Iterations must be a positive number (0).");
                        }
                        if (java.lang.Math.abs(f4) <= Float.MAX_VALUE) {
                            throw new java.lang.IllegalArgumentException("Speed must be a finite number. It is " + f4 + '.');
                        }
                        cbtVar = (cbt) cavVarB;
                        defpackage.hsj hsjVar5 = hsjVar3;
                        objR = cbtVar.R();
                        obj = cau.a;
                        if (objR == obj) {
                            objR = new defpackage.hcb();
                            cbtVar.ab(objR);
                        }
                        hcbVar = (defpackage.hcb) objR;
                        int i412 = i8;
                        objR2 = cbtVar.R();
                        if (objR2 == obj) {
                            androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.valueOf(z8), cdu.c);
                            cbtVar.ab(parcelableSnapshotMutableState2);
                            objR2 = parcelableSnapshotMutableState2;
                        }
                        int i413 = i33 | i34 | i35 | i36;
                        ccpVar = (ccp) objR2;
                        cavVarB.u(-133180567);
                        fB = f4 / defpackage.hgm.b((android.content.Context) cavVarB.e(dep.b));
                        cbtVar.W(false);
                        java.lang.Boolean boolValueOf2 = java.lang.Boolean.valueOf(z8);
                        java.lang.Float fValueOf2 = java.lang.Float.valueOf(fB);
                        java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(i10);
                        java.lang.Object[] objArr2 = new java.lang.Object[5];
                        objArr2[0] = gzhVar;
                        objArr2[1] = boolValueOf2;
                        objArr2[2] = hchVar3;
                        objArr2[3] = fValueOf2;
                        objArr2[i9] = numValueOf2;
                        zB = ((((i413 & 112) ^ 48) <= 32 && cavVarB.C(z8)) || (i413 & 48) == 32) | ((((i413 & 896) ^ 384) <= 256 && cavVarB.C(z9)) || (i413 & 384) == 256) | cavVarB.B(hcbVar) | cavVarB.D(gzhVar) | ((((3670016 & i413) ^ 1572864) <= 1048576 && cavVarB.z(i10)) || (i413 & 1572864) == 1048576) | ((((i413 & 7168) ^ 3072) <= 2048 && cavVarB.C(false)) || (i413 & 3072) == 2048) | cavVarB.y(fB) | ((((i413 & 57344) ^ 24576) <= 16384 && cavVarB.D(hchVar3)) || (i413 & 24576) == 16384) | cavVarB.z(0) | cavVarB.C(false);
                        objR3 = cbtVar.R();
                        if (zB) {
                            objR3 = new defpackage.hbv(z8, z9, hcbVar, gzhVar, i10, fB, hchVar3, ccpVar, null);
                            z10 = z9;
                            cbtVar.ab(objR3);
                        } else {
                            objR3 = new defpackage.hbv(z8, z9, hcbVar, gzhVar, i10, fB, hchVar3, ccpVar, null);
                            z10 = z9;
                            cbtVar.ab(objR3);
                        }
                        cbp.h(objArr2, (aonn) objR3, cavVarB);
                        zB2 = cavVarB.B(hcbVar);
                        objR4 = cbtVar.R();
                        if (zB2) {
                            objR4 = new defpackage.fxt(hcbVar, 16);
                            cbtVar.ab(objR4);
                        } else {
                            objR4 = new defpackage.fxt(hcbVar, 16);
                            cbtVar.ab(objR4);
                        }
                        int i414 = i412 >> 12;
                        int i415 = i27 << 15;
                        r(gzhVar, (aomy) objR4, cmwVar5, i31, hsjVar5, cmjVar3, cwyVar3, 1, cavVarB, i32 | ((i412 << 3) & 896) | (i414 & 7168) | (i414 & 57344) | (i414 & 458752) | ((i27 << 18) & 3670016) | (29360128 & i415) | (234881024 & i415) | (i415 & 1879048192), ((i27 >> 15) & 8190) | ((i26 << 12) & 57344) | ((i27 >> 12) & 458752));
                        cavVar2 = cavVarB;
                        cwyVar2 = cwyVar3;
                        hchVar2 = hchVar3;
                        cmwVar3 = cmwVar5;
                        f3 = f4;
                        i28 = i10;
                        z6 = z8;
                        z7 = z10;
                        z5 = true;
                        i30 = 1;
                        hsjVar2 = hsjVar5;
                        i29 = i31;
                        cmjVar2 = cmjVar3;
                    } else {
                        cavVar2 = cavVarB;
                        cavVar2.s();
                        cwyVar2 = cwyVar;
                        z5 = z3;
                        hchVar2 = hchVar3;
                        hsjVar2 = hsjVar3;
                        cmwVar3 = cmwVar2;
                        i28 = i10;
                        f3 = f2;
                        z6 = z;
                        z7 = z2;
                        i29 = i22;
                        cmjVar2 = cmjVar;
                        i30 = i3;
                    }
                    cdkVarI = cavVar2.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new aonn() { // from class: hce
                            public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3) {
                                ((java.lang.Integer) obj3).intValue();
                                defpackage.gzh gzhVar2 = gzhVar;
                                cmw cmwVar6 = cmwVar3;
                                boolean z13 = z6;
                                boolean z14 = z7;
                                defpackage.hch hchVar4 = hchVar2;
                                float f5 = f3;
                                int i50 = i28;
                                int i51 = i29;
                                defpackage.hsj hsjVar6 = hsjVar2;
                                int i52 = i4;
                                cmj cmjVar4 = cmjVar2;
                                int i53 = i6;
                                int i54 = i5;
                                int i55 = i52 | 1;
                                int i56 = i53 & 306783378;
                                int i57 = i56 << 1;
                                int i58 = i54 & 306783378;
                                int i59 = i55 & 306783378;
                                int i60 = i59 << 1;
                                boolean z15 = z5;
                                int i61 = i53 & 613566756;
                                int i62 = i53 & (-920350135);
                                int i63 = i54 & 613566756;
                                int i64 = i55 & 613566756;
                                int i65 = i30;
                                defpackage.hgt.q(gzhVar2, cmwVar6, z13, z14, hchVar4, f5, i50, i51, hsjVar6, cmjVar4, cwyVar2, z15, i65, (cav) obj2, (i55 & (-920350135)) | i59 | (i64 >> 1) | (i60 & i64), (i54 & (-920350135)) | i58 | (i63 >> 1) | ((i58 << 1) & i63), i62 | i56 | (i61 >> 1) | (i57 & i61), i7);
                                return aojh.a;
                            }
                        };
                    }
                }
                i14 = 805306368;
                i8 |= i14;
                i15 = i7 & 1024;
                if (i15 != 0) {
                    i16 = 0;
                } else {
                    i16 = 1;
                }
                if (i15 != 0) {
                    if ((i5 & 6) == 0) {
                        if (i2 == 0) {
                            i19 = -1;
                            i2 = 0;
                        } else {
                            i2 = 1;
                            i19 = 0;
                        }
                        if (true != cavVarB.z(i19)) {
                            i20 = 2;
                        } else {
                            i20 = i9;
                        }
                        i21 = i20 | i5;
                    } else {
                        i16 = i16;
                        i17 = i2;
                        i18 = i5;
                    }
                    i22 = i17;
                    if ((i7 & 2048) != 0) {
                        i18 |= 48;
                    } else if ((i5 & 48) == 0) {
                        int i416 = i18;
                        if (true != cavVarB.C(false)) {
                            i23 = 16;
                        } else {
                            i23 = 32;
                        }
                        i18 = i416 | i23;
                    }
                    if ((i7 & 4096) != 0) {
                        i18 |= 384;
                    } else if ((i5 & 384) == 0) {
                        i18 |= true == cavVarB.C(false) ? 256 : 128;
                    }
                    i24 = i7 & 8192;
                    if (i24 != 0) {
                        i18 |= 3072;
                        i25 = i24;
                    } else {
                        i25 = i24;
                        if ((i5 & 3072) == 0) {
                            if ((i5 & 4096) == 0) {
                                zD = cavVarB.B(hsjVar3);
                            } else {
                                zD = cavVarB.D(hsjVar3);
                            }
                            i18 |= true == zD ? 2048 : 1024;
                        }
                    }
                    i26 = i6 | 6;
                    i27 = i18 | 920346624;
                    if ((i8 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (cavVarB.H(z4, i8 & 1)) {
                        if (i38 != 0) {
                            cmwVar4 = cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        z8 = (!z11) | z;
                        z9 = (!z12) | z2;
                        if (i41 != 0) {
                            hchVar3 = null;
                        }
                        if (i42 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i11 != 0) {
                            i10 = 1;
                        }
                        i31 = (i16 ^ 1) | i22;
                        if (i25 != 0) {
                            hsjVar3 = null;
                        }
                        i32 = i8 & 14;
                        int i417 = i8 >> 3;
                        cmwVar5 = cmwVar4;
                        i33 = i32 | (i417 & 112) | (i417 & 896) | ((i27 << 6) & 7168) | 32768;
                        i34 = i8 & 57344;
                        i35 = i8 & 458752;
                        i36 = i8 & 3670016;
                        cmjVar3 = cmh.e;
                        cwyVar3 = cwx.b;
                        if (i10 > 0) {
                            throw new java.lang.IllegalArgumentException("Iterations must be a positive number (0).");
                        }
                        if (java.lang.Math.abs(f4) <= Float.MAX_VALUE) {
                            throw new java.lang.IllegalArgumentException("Speed must be a finite number. It is " + f4 + '.');
                        }
                        cbtVar = (cbt) cavVarB;
                        defpackage.hsj hsjVar6 = hsjVar3;
                        objR = cbtVar.R();
                        obj = cau.a;
                        if (objR == obj) {
                            objR = new defpackage.hcb();
                            cbtVar.ab(objR);
                        }
                        hcbVar = (defpackage.hcb) objR;
                        int i418 = i8;
                        objR2 = cbtVar.R();
                        if (objR2 == obj) {
                            androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.valueOf(z8), cdu.c);
                            cbtVar.ab(parcelableSnapshotMutableState3);
                            objR2 = parcelableSnapshotMutableState3;
                        }
                        int i419 = i33 | i34 | i35 | i36;
                        ccpVar = (ccp) objR2;
                        cavVarB.u(-133180567);
                        fB = f4 / defpackage.hgm.b((android.content.Context) cavVarB.e(dep.b));
                        cbtVar.W(false);
                        java.lang.Boolean boolValueOf3 = java.lang.Boolean.valueOf(z8);
                        java.lang.Float fValueOf3 = java.lang.Float.valueOf(fB);
                        java.lang.Integer numValueOf3 = java.lang.Integer.valueOf(i10);
                        java.lang.Object[] objArr3 = new java.lang.Object[5];
                        objArr3[0] = gzhVar;
                        objArr3[1] = boolValueOf3;
                        objArr3[2] = hchVar3;
                        objArr3[3] = fValueOf3;
                        objArr3[i9] = numValueOf3;
                        zB = ((((i419 & 112) ^ 48) <= 32 && cavVarB.C(z8)) || (i419 & 48) == 32) | ((((i419 & 896) ^ 384) <= 256 && cavVarB.C(z9)) || (i419 & 384) == 256) | cavVarB.B(hcbVar) | cavVarB.D(gzhVar) | ((((3670016 & i419) ^ 1572864) <= 1048576 && cavVarB.z(i10)) || (i419 & 1572864) == 1048576) | ((((i419 & 7168) ^ 3072) <= 2048 && cavVarB.C(false)) || (i419 & 3072) == 2048) | cavVarB.y(fB) | ((((i419 & 57344) ^ 24576) <= 16384 && cavVarB.D(hchVar3)) || (i419 & 24576) == 16384) | cavVarB.z(0) | cavVarB.C(false);
                        objR3 = cbtVar.R();
                        if (zB) {
                            objR3 = new defpackage.hbv(z8, z9, hcbVar, gzhVar, i10, fB, hchVar3, ccpVar, null);
                            z10 = z9;
                            cbtVar.ab(objR3);
                        } else {
                            objR3 = new defpackage.hbv(z8, z9, hcbVar, gzhVar, i10, fB, hchVar3, ccpVar, null);
                            z10 = z9;
                            cbtVar.ab(objR3);
                        }
                        cbp.h(objArr3, (aonn) objR3, cavVarB);
                        zB2 = cavVarB.B(hcbVar);
                        objR4 = cbtVar.R();
                        if (zB2) {
                            objR4 = new defpackage.fxt(hcbVar, 16);
                            cbtVar.ab(objR4);
                        } else {
                            objR4 = new defpackage.fxt(hcbVar, 16);
                            cbtVar.ab(objR4);
                        }
                        int i4110 = i418 >> 12;
                        int i4111 = i27 << 15;
                        r(gzhVar, (aomy) objR4, cmwVar5, i31, hsjVar6, cmjVar3, cwyVar3, 1, cavVarB, i32 | ((i418 << 3) & 896) | (i4110 & 7168) | (i4110 & 57344) | (i4110 & 458752) | ((i27 << 18) & 3670016) | (29360128 & i4111) | (234881024 & i4111) | (i4111 & 1879048192), ((i27 >> 15) & 8190) | ((i26 << 12) & 57344) | ((i27 >> 12) & 458752));
                        cavVar2 = cavVarB;
                        cwyVar2 = cwyVar3;
                        hchVar2 = hchVar3;
                        cmwVar3 = cmwVar5;
                        f3 = f4;
                        i28 = i10;
                        z6 = z8;
                        z7 = z10;
                        z5 = true;
                        i30 = 1;
                        hsjVar2 = hsjVar6;
                        i29 = i31;
                        cmjVar2 = cmjVar3;
                    } else {
                        cavVar2 = cavVarB;
                        cavVar2.s();
                        cwyVar2 = cwyVar;
                        z5 = z3;
                        hchVar2 = hchVar3;
                        hsjVar2 = hsjVar3;
                        cmwVar3 = cmwVar2;
                        i28 = i10;
                        f3 = f2;
                        z6 = z;
                        z7 = z2;
                        i29 = i22;
                        cmjVar2 = cmjVar;
                        i30 = i3;
                    }
                    cdkVarI = cavVar2.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new aonn() { // from class: hce
                            public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3) {
                                ((java.lang.Integer) obj3).intValue();
                                defpackage.gzh gzhVar2 = gzhVar;
                                cmw cmwVar6 = cmwVar3;
                                boolean z13 = z6;
                                boolean z14 = z7;
                                defpackage.hch hchVar4 = hchVar2;
                                float f5 = f3;
                                int i50 = i28;
                                int i51 = i29;
                                defpackage.hsj hsjVar7 = hsjVar2;
                                int i52 = i4;
                                cmj cmjVar4 = cmjVar2;
                                int i53 = i6;
                                int i54 = i5;
                                int i55 = i52 | 1;
                                int i56 = i53 & 306783378;
                                int i57 = i56 << 1;
                                int i58 = i54 & 306783378;
                                int i59 = i55 & 306783378;
                                int i60 = i59 << 1;
                                boolean z15 = z5;
                                int i61 = i53 & 613566756;
                                int i62 = i53 & (-920350135);
                                int i63 = i54 & 613566756;
                                int i64 = i55 & 613566756;
                                int i65 = i30;
                                defpackage.hgt.q(gzhVar2, cmwVar6, z13, z14, hchVar4, f5, i50, i51, hsjVar7, cmjVar4, cwyVar2, z15, i65, (cav) obj2, (i55 & (-920350135)) | i59 | (i64 >> 1) | (i60 & i64), (i54 & (-920350135)) | i58 | (i63 >> 1) | ((i58 << 1) & i63), i62 | i56 | (i61 >> 1) | (i57 & i61), i7);
                                return aojh.a;
                            }
                        };
                    }
                }
                i21 = i5 | 6;
                i18 = i21;
                i17 = i2;
                i22 = i17;
                if ((i7 & 2048) != 0) {
                    i18 |= 48;
                } else if ((i5 & 48) == 0) {
                    int i4112 = i18;
                    if (true != cavVarB.C(false)) {
                        i23 = 16;
                    } else {
                        i23 = 32;
                    }
                    i18 = i4112 | i23;
                }
                if ((i7 & 4096) != 0) {
                    i18 |= 384;
                } else if ((i5 & 384) == 0) {
                    i18 |= true == cavVarB.C(false) ? 256 : 128;
                }
                i24 = i7 & 8192;
                if (i24 != 0) {
                    i18 |= 3072;
                    i25 = i24;
                } else {
                    i25 = i24;
                    if ((i5 & 3072) == 0) {
                        if ((i5 & 4096) == 0) {
                            zD = cavVarB.B(hsjVar3);
                        } else {
                            zD = cavVarB.D(hsjVar3);
                        }
                        i18 |= true == zD ? 2048 : 1024;
                    }
                }
                i26 = i6 | 6;
                i27 = i18 | 920346624;
                if ((i8 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (cavVarB.H(z4, i8 & 1)) {
                    if (i38 != 0) {
                        cmwVar4 = cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    z8 = (!z11) | z;
                    z9 = (!z12) | z2;
                    if (i41 != 0) {
                        hchVar3 = null;
                    }
                    if (i42 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i11 != 0) {
                        i10 = 1;
                    }
                    i31 = (i16 ^ 1) | i22;
                    if (i25 != 0) {
                        hsjVar3 = null;
                    }
                    i32 = i8 & 14;
                    int i4113 = i8 >> 3;
                    cmwVar5 = cmwVar4;
                    i33 = i32 | (i4113 & 112) | (i4113 & 896) | ((i27 << 6) & 7168) | 32768;
                    i34 = i8 & 57344;
                    i35 = i8 & 458752;
                    i36 = i8 & 3670016;
                    cmjVar3 = cmh.e;
                    cwyVar3 = cwx.b;
                    if (i10 > 0) {
                        throw new java.lang.IllegalArgumentException("Iterations must be a positive number (0).");
                    }
                    if (java.lang.Math.abs(f4) <= Float.MAX_VALUE) {
                        throw new java.lang.IllegalArgumentException("Speed must be a finite number. It is " + f4 + '.');
                    }
                    cbtVar = (cbt) cavVarB;
                    defpackage.hsj hsjVar7 = hsjVar3;
                    objR = cbtVar.R();
                    obj = cau.a;
                    if (objR == obj) {
                        objR = new defpackage.hcb();
                        cbtVar.ab(objR);
                    }
                    hcbVar = (defpackage.hcb) objR;
                    int i4114 = i8;
                    objR2 = cbtVar.R();
                    if (objR2 == obj) {
                        androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState4 = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.valueOf(z8), cdu.c);
                        cbtVar.ab(parcelableSnapshotMutableState4);
                        objR2 = parcelableSnapshotMutableState4;
                    }
                    int i4115 = i33 | i34 | i35 | i36;
                    ccpVar = (ccp) objR2;
                    cavVarB.u(-133180567);
                    fB = f4 / defpackage.hgm.b((android.content.Context) cavVarB.e(dep.b));
                    cbtVar.W(false);
                    java.lang.Boolean boolValueOf4 = java.lang.Boolean.valueOf(z8);
                    java.lang.Float fValueOf4 = java.lang.Float.valueOf(fB);
                    java.lang.Integer numValueOf4 = java.lang.Integer.valueOf(i10);
                    java.lang.Object[] objArr4 = new java.lang.Object[5];
                    objArr4[0] = gzhVar;
                    objArr4[1] = boolValueOf4;
                    objArr4[2] = hchVar3;
                    objArr4[3] = fValueOf4;
                    objArr4[i9] = numValueOf4;
                    zB = ((((i4115 & 112) ^ 48) <= 32 && cavVarB.C(z8)) || (i4115 & 48) == 32) | ((((i4115 & 896) ^ 384) <= 256 && cavVarB.C(z9)) || (i4115 & 384) == 256) | cavVarB.B(hcbVar) | cavVarB.D(gzhVar) | ((((3670016 & i4115) ^ 1572864) <= 1048576 && cavVarB.z(i10)) || (i4115 & 1572864) == 1048576) | ((((i4115 & 7168) ^ 3072) <= 2048 && cavVarB.C(false)) || (i4115 & 3072) == 2048) | cavVarB.y(fB) | ((((i4115 & 57344) ^ 24576) <= 16384 && cavVarB.D(hchVar3)) || (i4115 & 24576) == 16384) | cavVarB.z(0) | cavVarB.C(false);
                    objR3 = cbtVar.R();
                    if (zB) {
                        objR3 = new defpackage.hbv(z8, z9, hcbVar, gzhVar, i10, fB, hchVar3, ccpVar, null);
                        z10 = z9;
                        cbtVar.ab(objR3);
                    } else {
                        objR3 = new defpackage.hbv(z8, z9, hcbVar, gzhVar, i10, fB, hchVar3, ccpVar, null);
                        z10 = z9;
                        cbtVar.ab(objR3);
                    }
                    cbp.h(objArr4, (aonn) objR3, cavVarB);
                    zB2 = cavVarB.B(hcbVar);
                    objR4 = cbtVar.R();
                    if (zB2) {
                        objR4 = new defpackage.fxt(hcbVar, 16);
                        cbtVar.ab(objR4);
                    } else {
                        objR4 = new defpackage.fxt(hcbVar, 16);
                        cbtVar.ab(objR4);
                    }
                    int i4116 = i4114 >> 12;
                    int i4117 = i27 << 15;
                    r(gzhVar, (aomy) objR4, cmwVar5, i31, hsjVar7, cmjVar3, cwyVar3, 1, cavVarB, i32 | ((i4114 << 3) & 896) | (i4116 & 7168) | (i4116 & 57344) | (i4116 & 458752) | ((i27 << 18) & 3670016) | (29360128 & i4117) | (234881024 & i4117) | (i4117 & 1879048192), ((i27 >> 15) & 8190) | ((i26 << 12) & 57344) | ((i27 >> 12) & 458752));
                    cavVar2 = cavVarB;
                    cwyVar2 = cwyVar3;
                    hchVar2 = hchVar3;
                    cmwVar3 = cmwVar5;
                    f3 = f4;
                    i28 = i10;
                    z6 = z8;
                    z7 = z10;
                    z5 = true;
                    i30 = 1;
                    hsjVar2 = hsjVar7;
                    i29 = i31;
                    cmjVar2 = cmjVar3;
                } else {
                    cavVar2 = cavVarB;
                    cavVar2.s();
                    cwyVar2 = cwyVar;
                    z5 = z3;
                    hchVar2 = hchVar3;
                    hsjVar2 = hsjVar3;
                    cmwVar3 = cmwVar2;
                    i28 = i10;
                    f3 = f2;
                    z6 = z;
                    z7 = z2;
                    i29 = i22;
                    cmjVar2 = cmjVar;
                    i30 = i3;
                }
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new aonn() { // from class: hce
                        public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3) {
                            ((java.lang.Integer) obj3).intValue();
                            defpackage.gzh gzhVar2 = gzhVar;
                            cmw cmwVar6 = cmwVar3;
                            boolean z13 = z6;
                            boolean z14 = z7;
                            defpackage.hch hchVar4 = hchVar2;
                            float f5 = f3;
                            int i50 = i28;
                            int i51 = i29;
                            defpackage.hsj hsjVar8 = hsjVar2;
                            int i52 = i4;
                            cmj cmjVar4 = cmjVar2;
                            int i53 = i6;
                            int i54 = i5;
                            int i55 = i52 | 1;
                            int i56 = i53 & 306783378;
                            int i57 = i56 << 1;
                            int i58 = i54 & 306783378;
                            int i59 = i55 & 306783378;
                            int i60 = i59 << 1;
                            boolean z15 = z5;
                            int i61 = i53 & 613566756;
                            int i62 = i53 & (-920350135);
                            int i63 = i54 & 613566756;
                            int i64 = i55 & 613566756;
                            int i65 = i30;
                            defpackage.hgt.q(gzhVar2, cmwVar6, z13, z14, hchVar4, f5, i50, i51, hsjVar8, cmjVar4, cwyVar2, z15, i65, (cav) obj2, (i55 & (-920350135)) | i59 | (i64 >> 1) | (i60 & i64), (i54 & (-920350135)) | i58 | (i63 >> 1) | ((i58 << 1) & i63), i62 | i56 | (i61 >> 1) | (i57 & i61), i7);
                            return aojh.a;
                        }
                    };
                }
            }
            i13 = 100663296;
            i8 |= i13;
            if ((i7 & 512) != 0) {
                if ((805306368 & i4) == 0) {
                    if (true != cavVarB.C(false)) {
                        i14 = 268435456;
                    } else {
                        i14 = 536870912;
                    }
                }
                i15 = i7 & 1024;
                if (i15 != 0) {
                    i16 = 0;
                } else {
                    i16 = 1;
                }
                if (i15 != 0) {
                    if ((i5 & 6) == 0) {
                        if (i2 == 0) {
                            i19 = -1;
                            i2 = 0;
                        } else {
                            i2 = 1;
                            i19 = 0;
                        }
                        if (true != cavVarB.z(i19)) {
                            i20 = 2;
                        } else {
                            i20 = i9;
                        }
                        i21 = i20 | i5;
                    } else {
                        i16 = i16;
                        i17 = i2;
                        i18 = i5;
                    }
                    i22 = i17;
                    if ((i7 & 2048) != 0) {
                        i18 |= 48;
                    } else if ((i5 & 48) == 0) {
                        int i4118 = i18;
                        if (true != cavVarB.C(false)) {
                            i23 = 16;
                        } else {
                            i23 = 32;
                        }
                        i18 = i4118 | i23;
                    }
                    if ((i7 & 4096) != 0) {
                        i18 |= 384;
                    } else if ((i5 & 384) == 0) {
                        i18 |= true == cavVarB.C(false) ? 256 : 128;
                    }
                    i24 = i7 & 8192;
                    if (i24 != 0) {
                        i18 |= 3072;
                        i25 = i24;
                    } else {
                        i25 = i24;
                        if ((i5 & 3072) == 0) {
                            if ((i5 & 4096) == 0) {
                                zD = cavVarB.B(hsjVar3);
                            } else {
                                zD = cavVarB.D(hsjVar3);
                            }
                            i18 |= true == zD ? 2048 : 1024;
                        }
                    }
                    i26 = i6 | 6;
                    i27 = i18 | 920346624;
                    if ((i8 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (cavVarB.H(z4, i8 & 1)) {
                        if (i38 != 0) {
                            cmwVar4 = cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        z8 = (!z11) | z;
                        z9 = (!z12) | z2;
                        if (i41 != 0) {
                            hchVar3 = null;
                        }
                        if (i42 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i11 != 0) {
                            i10 = 1;
                        }
                        i31 = (i16 ^ 1) | i22;
                        if (i25 != 0) {
                            hsjVar3 = null;
                        }
                        i32 = i8 & 14;
                        int i4119 = i8 >> 3;
                        cmwVar5 = cmwVar4;
                        i33 = i32 | (i4119 & 112) | (i4119 & 896) | ((i27 << 6) & 7168) | 32768;
                        i34 = i8 & 57344;
                        i35 = i8 & 458752;
                        i36 = i8 & 3670016;
                        cmjVar3 = cmh.e;
                        cwyVar3 = cwx.b;
                        if (i10 > 0) {
                            throw new java.lang.IllegalArgumentException("Iterations must be a positive number (0).");
                        }
                        if (java.lang.Math.abs(f4) <= Float.MAX_VALUE) {
                            throw new java.lang.IllegalArgumentException("Speed must be a finite number. It is " + f4 + '.');
                        }
                        cbtVar = (cbt) cavVarB;
                        defpackage.hsj hsjVar8 = hsjVar3;
                        objR = cbtVar.R();
                        obj = cau.a;
                        if (objR == obj) {
                            objR = new defpackage.hcb();
                            cbtVar.ab(objR);
                        }
                        hcbVar = (defpackage.hcb) objR;
                        int i41110 = i8;
                        objR2 = cbtVar.R();
                        if (objR2 == obj) {
                            androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState5 = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.valueOf(z8), cdu.c);
                            cbtVar.ab(parcelableSnapshotMutableState5);
                            objR2 = parcelableSnapshotMutableState5;
                        }
                        int i41111 = i33 | i34 | i35 | i36;
                        ccpVar = (ccp) objR2;
                        cavVarB.u(-133180567);
                        fB = f4 / defpackage.hgm.b((android.content.Context) cavVarB.e(dep.b));
                        cbtVar.W(false);
                        java.lang.Boolean boolValueOf5 = java.lang.Boolean.valueOf(z8);
                        java.lang.Float fValueOf5 = java.lang.Float.valueOf(fB);
                        java.lang.Integer numValueOf5 = java.lang.Integer.valueOf(i10);
                        java.lang.Object[] objArr5 = new java.lang.Object[5];
                        objArr5[0] = gzhVar;
                        objArr5[1] = boolValueOf5;
                        objArr5[2] = hchVar3;
                        objArr5[3] = fValueOf5;
                        objArr5[i9] = numValueOf5;
                        zB = ((((i41111 & 112) ^ 48) <= 32 && cavVarB.C(z8)) || (i41111 & 48) == 32) | ((((i41111 & 896) ^ 384) <= 256 && cavVarB.C(z9)) || (i41111 & 384) == 256) | cavVarB.B(hcbVar) | cavVarB.D(gzhVar) | ((((3670016 & i41111) ^ 1572864) <= 1048576 && cavVarB.z(i10)) || (i41111 & 1572864) == 1048576) | ((((i41111 & 7168) ^ 3072) <= 2048 && cavVarB.C(false)) || (i41111 & 3072) == 2048) | cavVarB.y(fB) | ((((i41111 & 57344) ^ 24576) <= 16384 && cavVarB.D(hchVar3)) || (i41111 & 24576) == 16384) | cavVarB.z(0) | cavVarB.C(false);
                        objR3 = cbtVar.R();
                        if (zB) {
                            objR3 = new defpackage.hbv(z8, z9, hcbVar, gzhVar, i10, fB, hchVar3, ccpVar, null);
                            z10 = z9;
                            cbtVar.ab(objR3);
                        } else {
                            objR3 = new defpackage.hbv(z8, z9, hcbVar, gzhVar, i10, fB, hchVar3, ccpVar, null);
                            z10 = z9;
                            cbtVar.ab(objR3);
                        }
                        cbp.h(objArr5, (aonn) objR3, cavVarB);
                        zB2 = cavVarB.B(hcbVar);
                        objR4 = cbtVar.R();
                        if (zB2) {
                            objR4 = new defpackage.fxt(hcbVar, 16);
                            cbtVar.ab(objR4);
                        } else {
                            objR4 = new defpackage.fxt(hcbVar, 16);
                            cbtVar.ab(objR4);
                        }
                        int i41112 = i41110 >> 12;
                        int i41113 = i27 << 15;
                        r(gzhVar, (aomy) objR4, cmwVar5, i31, hsjVar8, cmjVar3, cwyVar3, 1, cavVarB, i32 | ((i41110 << 3) & 896) | (i41112 & 7168) | (i41112 & 57344) | (i41112 & 458752) | ((i27 << 18) & 3670016) | (29360128 & i41113) | (234881024 & i41113) | (i41113 & 1879048192), ((i27 >> 15) & 8190) | ((i26 << 12) & 57344) | ((i27 >> 12) & 458752));
                        cavVar2 = cavVarB;
                        cwyVar2 = cwyVar3;
                        hchVar2 = hchVar3;
                        cmwVar3 = cmwVar5;
                        f3 = f4;
                        i28 = i10;
                        z6 = z8;
                        z7 = z10;
                        z5 = true;
                        i30 = 1;
                        hsjVar2 = hsjVar8;
                        i29 = i31;
                        cmjVar2 = cmjVar3;
                    } else {
                        cavVar2 = cavVarB;
                        cavVar2.s();
                        cwyVar2 = cwyVar;
                        z5 = z3;
                        hchVar2 = hchVar3;
                        hsjVar2 = hsjVar3;
                        cmwVar3 = cmwVar2;
                        i28 = i10;
                        f3 = f2;
                        z6 = z;
                        z7 = z2;
                        i29 = i22;
                        cmjVar2 = cmjVar;
                        i30 = i3;
                    }
                    cdkVarI = cavVar2.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new aonn() { // from class: hce
                            public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3) {
                                ((java.lang.Integer) obj3).intValue();
                                defpackage.gzh gzhVar2 = gzhVar;
                                cmw cmwVar6 = cmwVar3;
                                boolean z13 = z6;
                                boolean z14 = z7;
                                defpackage.hch hchVar4 = hchVar2;
                                float f5 = f3;
                                int i50 = i28;
                                int i51 = i29;
                                defpackage.hsj hsjVar9 = hsjVar2;
                                int i52 = i4;
                                cmj cmjVar4 = cmjVar2;
                                int i53 = i6;
                                int i54 = i5;
                                int i55 = i52 | 1;
                                int i56 = i53 & 306783378;
                                int i57 = i56 << 1;
                                int i58 = i54 & 306783378;
                                int i59 = i55 & 306783378;
                                int i60 = i59 << 1;
                                boolean z15 = z5;
                                int i61 = i53 & 613566756;
                                int i62 = i53 & (-920350135);
                                int i63 = i54 & 613566756;
                                int i64 = i55 & 613566756;
                                int i65 = i30;
                                defpackage.hgt.q(gzhVar2, cmwVar6, z13, z14, hchVar4, f5, i50, i51, hsjVar9, cmjVar4, cwyVar2, z15, i65, (cav) obj2, (i55 & (-920350135)) | i59 | (i64 >> 1) | (i60 & i64), (i54 & (-920350135)) | i58 | (i63 >> 1) | ((i58 << 1) & i63), i62 | i56 | (i61 >> 1) | (i57 & i61), i7);
                                return aojh.a;
                            }
                        };
                    }
                }
                i21 = i5 | 6;
                i18 = i21;
                i17 = i2;
                i22 = i17;
                if ((i7 & 2048) != 0) {
                    i18 |= 48;
                } else if ((i5 & 48) == 0) {
                    int i41114 = i18;
                    if (true != cavVarB.C(false)) {
                        i23 = 16;
                    } else {
                        i23 = 32;
                    }
                    i18 = i41114 | i23;
                }
                if ((i7 & 4096) != 0) {
                    i18 |= 384;
                } else if ((i5 & 384) == 0) {
                    i18 |= true == cavVarB.C(false) ? 256 : 128;
                }
                i24 = i7 & 8192;
                if (i24 != 0) {
                    i18 |= 3072;
                    i25 = i24;
                } else {
                    i25 = i24;
                    if ((i5 & 3072) == 0) {
                        if ((i5 & 4096) == 0) {
                            zD = cavVarB.B(hsjVar3);
                        } else {
                            zD = cavVarB.D(hsjVar3);
                        }
                        i18 |= true == zD ? 2048 : 1024;
                    }
                }
                i26 = i6 | 6;
                i27 = i18 | 920346624;
                if ((i8 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (cavVarB.H(z4, i8 & 1)) {
                    if (i38 != 0) {
                        cmwVar4 = cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    z8 = (!z11) | z;
                    z9 = (!z12) | z2;
                    if (i41 != 0) {
                        hchVar3 = null;
                    }
                    if (i42 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i11 != 0) {
                        i10 = 1;
                    }
                    i31 = (i16 ^ 1) | i22;
                    if (i25 != 0) {
                        hsjVar3 = null;
                    }
                    i32 = i8 & 14;
                    int i41115 = i8 >> 3;
                    cmwVar5 = cmwVar4;
                    i33 = i32 | (i41115 & 112) | (i41115 & 896) | ((i27 << 6) & 7168) | 32768;
                    i34 = i8 & 57344;
                    i35 = i8 & 458752;
                    i36 = i8 & 3670016;
                    cmjVar3 = cmh.e;
                    cwyVar3 = cwx.b;
                    if (i10 > 0) {
                        throw new java.lang.IllegalArgumentException("Iterations must be a positive number (0).");
                    }
                    if (java.lang.Math.abs(f4) <= Float.MAX_VALUE) {
                        throw new java.lang.IllegalArgumentException("Speed must be a finite number. It is " + f4 + '.');
                    }
                    cbtVar = (cbt) cavVarB;
                    defpackage.hsj hsjVar9 = hsjVar3;
                    objR = cbtVar.R();
                    obj = cau.a;
                    if (objR == obj) {
                        objR = new defpackage.hcb();
                        cbtVar.ab(objR);
                    }
                    hcbVar = (defpackage.hcb) objR;
                    int i41116 = i8;
                    objR2 = cbtVar.R();
                    if (objR2 == obj) {
                        androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState6 = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.valueOf(z8), cdu.c);
                        cbtVar.ab(parcelableSnapshotMutableState6);
                        objR2 = parcelableSnapshotMutableState6;
                    }
                    int i41117 = i33 | i34 | i35 | i36;
                    ccpVar = (ccp) objR2;
                    cavVarB.u(-133180567);
                    fB = f4 / defpackage.hgm.b((android.content.Context) cavVarB.e(dep.b));
                    cbtVar.W(false);
                    java.lang.Boolean boolValueOf6 = java.lang.Boolean.valueOf(z8);
                    java.lang.Float fValueOf6 = java.lang.Float.valueOf(fB);
                    java.lang.Integer numValueOf6 = java.lang.Integer.valueOf(i10);
                    java.lang.Object[] objArr6 = new java.lang.Object[5];
                    objArr6[0] = gzhVar;
                    objArr6[1] = boolValueOf6;
                    objArr6[2] = hchVar3;
                    objArr6[3] = fValueOf6;
                    objArr6[i9] = numValueOf6;
                    zB = ((((i41117 & 112) ^ 48) <= 32 && cavVarB.C(z8)) || (i41117 & 48) == 32) | ((((i41117 & 896) ^ 384) <= 256 && cavVarB.C(z9)) || (i41117 & 384) == 256) | cavVarB.B(hcbVar) | cavVarB.D(gzhVar) | ((((3670016 & i41117) ^ 1572864) <= 1048576 && cavVarB.z(i10)) || (i41117 & 1572864) == 1048576) | ((((i41117 & 7168) ^ 3072) <= 2048 && cavVarB.C(false)) || (i41117 & 3072) == 2048) | cavVarB.y(fB) | ((((i41117 & 57344) ^ 24576) <= 16384 && cavVarB.D(hchVar3)) || (i41117 & 24576) == 16384) | cavVarB.z(0) | cavVarB.C(false);
                    objR3 = cbtVar.R();
                    if (zB) {
                        objR3 = new defpackage.hbv(z8, z9, hcbVar, gzhVar, i10, fB, hchVar3, ccpVar, null);
                        z10 = z9;
                        cbtVar.ab(objR3);
                    } else {
                        objR3 = new defpackage.hbv(z8, z9, hcbVar, gzhVar, i10, fB, hchVar3, ccpVar, null);
                        z10 = z9;
                        cbtVar.ab(objR3);
                    }
                    cbp.h(objArr6, (aonn) objR3, cavVarB);
                    zB2 = cavVarB.B(hcbVar);
                    objR4 = cbtVar.R();
                    if (zB2) {
                        objR4 = new defpackage.fxt(hcbVar, 16);
                        cbtVar.ab(objR4);
                    } else {
                        objR4 = new defpackage.fxt(hcbVar, 16);
                        cbtVar.ab(objR4);
                    }
                    int i41118 = i41116 >> 12;
                    int i41119 = i27 << 15;
                    r(gzhVar, (aomy) objR4, cmwVar5, i31, hsjVar9, cmjVar3, cwyVar3, 1, cavVarB, i32 | ((i41116 << 3) & 896) | (i41118 & 7168) | (i41118 & 57344) | (i41118 & 458752) | ((i27 << 18) & 3670016) | (29360128 & i41119) | (234881024 & i41119) | (i41119 & 1879048192), ((i27 >> 15) & 8190) | ((i26 << 12) & 57344) | ((i27 >> 12) & 458752));
                    cavVar2 = cavVarB;
                    cwyVar2 = cwyVar3;
                    hchVar2 = hchVar3;
                    cmwVar3 = cmwVar5;
                    f3 = f4;
                    i28 = i10;
                    z6 = z8;
                    z7 = z10;
                    z5 = true;
                    i30 = 1;
                    hsjVar2 = hsjVar9;
                    i29 = i31;
                    cmjVar2 = cmjVar3;
                } else {
                    cavVar2 = cavVarB;
                    cavVar2.s();
                    cwyVar2 = cwyVar;
                    z5 = z3;
                    hchVar2 = hchVar3;
                    hsjVar2 = hsjVar3;
                    cmwVar3 = cmwVar2;
                    i28 = i10;
                    f3 = f2;
                    z6 = z;
                    z7 = z2;
                    i29 = i22;
                    cmjVar2 = cmjVar;
                    i30 = i3;
                }
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new aonn() { // from class: hce
                        public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3) {
                            ((java.lang.Integer) obj3).intValue();
                            defpackage.gzh gzhVar2 = gzhVar;
                            cmw cmwVar6 = cmwVar3;
                            boolean z13 = z6;
                            boolean z14 = z7;
                            defpackage.hch hchVar4 = hchVar2;
                            float f5 = f3;
                            int i50 = i28;
                            int i51 = i29;
                            defpackage.hsj hsjVar10 = hsjVar2;
                            int i52 = i4;
                            cmj cmjVar4 = cmjVar2;
                            int i53 = i6;
                            int i54 = i5;
                            int i55 = i52 | 1;
                            int i56 = i53 & 306783378;
                            int i57 = i56 << 1;
                            int i58 = i54 & 306783378;
                            int i59 = i55 & 306783378;
                            int i60 = i59 << 1;
                            boolean z15 = z5;
                            int i61 = i53 & 613566756;
                            int i62 = i53 & (-920350135);
                            int i63 = i54 & 613566756;
                            int i64 = i55 & 613566756;
                            int i65 = i30;
                            defpackage.hgt.q(gzhVar2, cmwVar6, z13, z14, hchVar4, f5, i50, i51, hsjVar10, cmjVar4, cwyVar2, z15, i65, (cav) obj2, (i55 & (-920350135)) | i59 | (i64 >> 1) | (i60 & i64), (i54 & (-920350135)) | i58 | (i63 >> 1) | ((i58 << 1) & i63), i62 | i56 | (i61 >> 1) | (i57 & i61), i7);
                            return aojh.a;
                        }
                    };
                }
            }
            i14 = 805306368;
            i8 |= i14;
            i15 = i7 & 1024;
            if (i15 != 0) {
                i16 = 0;
            } else {
                i16 = 1;
            }
            if (i15 != 0) {
                if ((i5 & 6) == 0) {
                    if (i2 == 0) {
                        i19 = -1;
                        i2 = 0;
                    } else {
                        i2 = 1;
                        i19 = 0;
                    }
                    if (true != cavVarB.z(i19)) {
                        i20 = 2;
                    } else {
                        i20 = i9;
                    }
                    i21 = i20 | i5;
                } else {
                    i16 = i16;
                    i17 = i2;
                    i18 = i5;
                }
                i22 = i17;
                if ((i7 & 2048) != 0) {
                    i18 |= 48;
                } else if ((i5 & 48) == 0) {
                    int i411110 = i18;
                    if (true != cavVarB.C(false)) {
                        i23 = 16;
                    } else {
                        i23 = 32;
                    }
                    i18 = i411110 | i23;
                }
                if ((i7 & 4096) != 0) {
                    i18 |= 384;
                } else if ((i5 & 384) == 0) {
                    i18 |= true == cavVarB.C(false) ? 256 : 128;
                }
                i24 = i7 & 8192;
                if (i24 != 0) {
                    i18 |= 3072;
                    i25 = i24;
                } else {
                    i25 = i24;
                    if ((i5 & 3072) == 0) {
                        if ((i5 & 4096) == 0) {
                            zD = cavVarB.B(hsjVar3);
                        } else {
                            zD = cavVarB.D(hsjVar3);
                        }
                        i18 |= true == zD ? 2048 : 1024;
                    }
                }
                i26 = i6 | 6;
                i27 = i18 | 920346624;
                if ((i8 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (cavVarB.H(z4, i8 & 1)) {
                    if (i38 != 0) {
                        cmwVar4 = cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    z8 = (!z11) | z;
                    z9 = (!z12) | z2;
                    if (i41 != 0) {
                        hchVar3 = null;
                    }
                    if (i42 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i11 != 0) {
                        i10 = 1;
                    }
                    i31 = (i16 ^ 1) | i22;
                    if (i25 != 0) {
                        hsjVar3 = null;
                    }
                    i32 = i8 & 14;
                    int i411111 = i8 >> 3;
                    cmwVar5 = cmwVar4;
                    i33 = i32 | (i411111 & 112) | (i411111 & 896) | ((i27 << 6) & 7168) | 32768;
                    i34 = i8 & 57344;
                    i35 = i8 & 458752;
                    i36 = i8 & 3670016;
                    cmjVar3 = cmh.e;
                    cwyVar3 = cwx.b;
                    if (i10 > 0) {
                        throw new java.lang.IllegalArgumentException("Iterations must be a positive number (0).");
                    }
                    if (java.lang.Math.abs(f4) <= Float.MAX_VALUE) {
                        throw new java.lang.IllegalArgumentException("Speed must be a finite number. It is " + f4 + '.');
                    }
                    cbtVar = (cbt) cavVarB;
                    defpackage.hsj hsjVar10 = hsjVar3;
                    objR = cbtVar.R();
                    obj = cau.a;
                    if (objR == obj) {
                        objR = new defpackage.hcb();
                        cbtVar.ab(objR);
                    }
                    hcbVar = (defpackage.hcb) objR;
                    int i411112 = i8;
                    objR2 = cbtVar.R();
                    if (objR2 == obj) {
                        androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState7 = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.valueOf(z8), cdu.c);
                        cbtVar.ab(parcelableSnapshotMutableState7);
                        objR2 = parcelableSnapshotMutableState7;
                    }
                    int i411113 = i33 | i34 | i35 | i36;
                    ccpVar = (ccp) objR2;
                    cavVarB.u(-133180567);
                    fB = f4 / defpackage.hgm.b((android.content.Context) cavVarB.e(dep.b));
                    cbtVar.W(false);
                    java.lang.Boolean boolValueOf7 = java.lang.Boolean.valueOf(z8);
                    java.lang.Float fValueOf7 = java.lang.Float.valueOf(fB);
                    java.lang.Integer numValueOf7 = java.lang.Integer.valueOf(i10);
                    java.lang.Object[] objArr7 = new java.lang.Object[5];
                    objArr7[0] = gzhVar;
                    objArr7[1] = boolValueOf7;
                    objArr7[2] = hchVar3;
                    objArr7[3] = fValueOf7;
                    objArr7[i9] = numValueOf7;
                    zB = ((((i411113 & 112) ^ 48) <= 32 && cavVarB.C(z8)) || (i411113 & 48) == 32) | ((((i411113 & 896) ^ 384) <= 256 && cavVarB.C(z9)) || (i411113 & 384) == 256) | cavVarB.B(hcbVar) | cavVarB.D(gzhVar) | ((((3670016 & i411113) ^ 1572864) <= 1048576 && cavVarB.z(i10)) || (i411113 & 1572864) == 1048576) | ((((i411113 & 7168) ^ 3072) <= 2048 && cavVarB.C(false)) || (i411113 & 3072) == 2048) | cavVarB.y(fB) | ((((i411113 & 57344) ^ 24576) <= 16384 && cavVarB.D(hchVar3)) || (i411113 & 24576) == 16384) | cavVarB.z(0) | cavVarB.C(false);
                    objR3 = cbtVar.R();
                    if (zB) {
                        objR3 = new defpackage.hbv(z8, z9, hcbVar, gzhVar, i10, fB, hchVar3, ccpVar, null);
                        z10 = z9;
                        cbtVar.ab(objR3);
                    } else {
                        objR3 = new defpackage.hbv(z8, z9, hcbVar, gzhVar, i10, fB, hchVar3, ccpVar, null);
                        z10 = z9;
                        cbtVar.ab(objR3);
                    }
                    cbp.h(objArr7, (aonn) objR3, cavVarB);
                    zB2 = cavVarB.B(hcbVar);
                    objR4 = cbtVar.R();
                    if (zB2) {
                        objR4 = new defpackage.fxt(hcbVar, 16);
                        cbtVar.ab(objR4);
                    } else {
                        objR4 = new defpackage.fxt(hcbVar, 16);
                        cbtVar.ab(objR4);
                    }
                    int i411114 = i411112 >> 12;
                    int i411115 = i27 << 15;
                    r(gzhVar, (aomy) objR4, cmwVar5, i31, hsjVar10, cmjVar3, cwyVar3, 1, cavVarB, i32 | ((i411112 << 3) & 896) | (i411114 & 7168) | (i411114 & 57344) | (i411114 & 458752) | ((i27 << 18) & 3670016) | (29360128 & i411115) | (234881024 & i411115) | (i411115 & 1879048192), ((i27 >> 15) & 8190) | ((i26 << 12) & 57344) | ((i27 >> 12) & 458752));
                    cavVar2 = cavVarB;
                    cwyVar2 = cwyVar3;
                    hchVar2 = hchVar3;
                    cmwVar3 = cmwVar5;
                    f3 = f4;
                    i28 = i10;
                    z6 = z8;
                    z7 = z10;
                    z5 = true;
                    i30 = 1;
                    hsjVar2 = hsjVar10;
                    i29 = i31;
                    cmjVar2 = cmjVar3;
                } else {
                    cavVar2 = cavVarB;
                    cavVar2.s();
                    cwyVar2 = cwyVar;
                    z5 = z3;
                    hchVar2 = hchVar3;
                    hsjVar2 = hsjVar3;
                    cmwVar3 = cmwVar2;
                    i28 = i10;
                    f3 = f2;
                    z6 = z;
                    z7 = z2;
                    i29 = i22;
                    cmjVar2 = cmjVar;
                    i30 = i3;
                }
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new aonn() { // from class: hce
                        public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3) {
                            ((java.lang.Integer) obj3).intValue();
                            defpackage.gzh gzhVar2 = gzhVar;
                            cmw cmwVar6 = cmwVar3;
                            boolean z13 = z6;
                            boolean z14 = z7;
                            defpackage.hch hchVar4 = hchVar2;
                            float f5 = f3;
                            int i50 = i28;
                            int i51 = i29;
                            defpackage.hsj hsjVar11 = hsjVar2;
                            int i52 = i4;
                            cmj cmjVar4 = cmjVar2;
                            int i53 = i6;
                            int i54 = i5;
                            int i55 = i52 | 1;
                            int i56 = i53 & 306783378;
                            int i57 = i56 << 1;
                            int i58 = i54 & 306783378;
                            int i59 = i55 & 306783378;
                            int i60 = i59 << 1;
                            boolean z15 = z5;
                            int i61 = i53 & 613566756;
                            int i62 = i53 & (-920350135);
                            int i63 = i54 & 613566756;
                            int i64 = i55 & 613566756;
                            int i65 = i30;
                            defpackage.hgt.q(gzhVar2, cmwVar6, z13, z14, hchVar4, f5, i50, i51, hsjVar11, cmjVar4, cwyVar2, z15, i65, (cav) obj2, (i55 & (-920350135)) | i59 | (i64 >> 1) | (i60 & i64), (i54 & (-920350135)) | i58 | (i63 >> 1) | ((i58 << 1) & i63), i62 | i56 | (i61 >> 1) | (i57 & i61), i7);
                            return aojh.a;
                        }
                    };
                }
            }
            i21 = i5 | 6;
            i18 = i21;
            i17 = i2;
            i22 = i17;
            if ((i7 & 2048) != 0) {
                i18 |= 48;
            } else if ((i5 & 48) == 0) {
                int i411116 = i18;
                if (true != cavVarB.C(false)) {
                    i23 = 16;
                } else {
                    i23 = 32;
                }
                i18 = i411116 | i23;
            }
            if ((i7 & 4096) != 0) {
                i18 |= 384;
            } else if ((i5 & 384) == 0) {
                i18 |= true == cavVarB.C(false) ? 256 : 128;
            }
            i24 = i7 & 8192;
            if (i24 != 0) {
                i18 |= 3072;
                i25 = i24;
            } else {
                i25 = i24;
                if ((i5 & 3072) == 0) {
                    if ((i5 & 4096) == 0) {
                        zD = cavVarB.B(hsjVar3);
                    } else {
                        zD = cavVarB.D(hsjVar3);
                    }
                    i18 |= true == zD ? 2048 : 1024;
                }
            }
            i26 = i6 | 6;
            i27 = i18 | 920346624;
            if ((i8 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (cavVarB.H(z4, i8 & 1)) {
                if (i38 != 0) {
                    cmwVar4 = cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                z8 = (!z11) | z;
                z9 = (!z12) | z2;
                if (i41 != 0) {
                    hchVar3 = null;
                }
                if (i42 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f2;
                }
                if (i11 != 0) {
                    i10 = 1;
                }
                i31 = (i16 ^ 1) | i22;
                if (i25 != 0) {
                    hsjVar3 = null;
                }
                i32 = i8 & 14;
                int i411117 = i8 >> 3;
                cmwVar5 = cmwVar4;
                i33 = i32 | (i411117 & 112) | (i411117 & 896) | ((i27 << 6) & 7168) | 32768;
                i34 = i8 & 57344;
                i35 = i8 & 458752;
                i36 = i8 & 3670016;
                cmjVar3 = cmh.e;
                cwyVar3 = cwx.b;
                if (i10 > 0) {
                    throw new java.lang.IllegalArgumentException("Iterations must be a positive number (0).");
                }
                if (java.lang.Math.abs(f4) <= Float.MAX_VALUE) {
                    throw new java.lang.IllegalArgumentException("Speed must be a finite number. It is " + f4 + '.');
                }
                cbtVar = (cbt) cavVarB;
                defpackage.hsj hsjVar11 = hsjVar3;
                objR = cbtVar.R();
                obj = cau.a;
                if (objR == obj) {
                    objR = new defpackage.hcb();
                    cbtVar.ab(objR);
                }
                hcbVar = (defpackage.hcb) objR;
                int i411118 = i8;
                objR2 = cbtVar.R();
                if (objR2 == obj) {
                    androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState8 = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.valueOf(z8), cdu.c);
                    cbtVar.ab(parcelableSnapshotMutableState8);
                    objR2 = parcelableSnapshotMutableState8;
                }
                int i411119 = i33 | i34 | i35 | i36;
                ccpVar = (ccp) objR2;
                cavVarB.u(-133180567);
                fB = f4 / defpackage.hgm.b((android.content.Context) cavVarB.e(dep.b));
                cbtVar.W(false);
                java.lang.Boolean boolValueOf8 = java.lang.Boolean.valueOf(z8);
                java.lang.Float fValueOf8 = java.lang.Float.valueOf(fB);
                java.lang.Integer numValueOf8 = java.lang.Integer.valueOf(i10);
                java.lang.Object[] objArr8 = new java.lang.Object[5];
                objArr8[0] = gzhVar;
                objArr8[1] = boolValueOf8;
                objArr8[2] = hchVar3;
                objArr8[3] = fValueOf8;
                objArr8[i9] = numValueOf8;
                zB = ((((i411119 & 112) ^ 48) <= 32 && cavVarB.C(z8)) || (i411119 & 48) == 32) | ((((i411119 & 896) ^ 384) <= 256 && cavVarB.C(z9)) || (i411119 & 384) == 256) | cavVarB.B(hcbVar) | cavVarB.D(gzhVar) | ((((3670016 & i411119) ^ 1572864) <= 1048576 && cavVarB.z(i10)) || (i411119 & 1572864) == 1048576) | ((((i411119 & 7168) ^ 3072) <= 2048 && cavVarB.C(false)) || (i411119 & 3072) == 2048) | cavVarB.y(fB) | ((((i411119 & 57344) ^ 24576) <= 16384 && cavVarB.D(hchVar3)) || (i411119 & 24576) == 16384) | cavVarB.z(0) | cavVarB.C(false);
                objR3 = cbtVar.R();
                if (zB) {
                    objR3 = new defpackage.hbv(z8, z9, hcbVar, gzhVar, i10, fB, hchVar3, ccpVar, null);
                    z10 = z9;
                    cbtVar.ab(objR3);
                } else {
                    objR3 = new defpackage.hbv(z8, z9, hcbVar, gzhVar, i10, fB, hchVar3, ccpVar, null);
                    z10 = z9;
                    cbtVar.ab(objR3);
                }
                cbp.h(objArr8, (aonn) objR3, cavVarB);
                zB2 = cavVarB.B(hcbVar);
                objR4 = cbtVar.R();
                if (zB2) {
                    objR4 = new defpackage.fxt(hcbVar, 16);
                    cbtVar.ab(objR4);
                } else {
                    objR4 = new defpackage.fxt(hcbVar, 16);
                    cbtVar.ab(objR4);
                }
                int i4111110 = i411118 >> 12;
                int i4111111 = i27 << 15;
                r(gzhVar, (aomy) objR4, cmwVar5, i31, hsjVar11, cmjVar3, cwyVar3, 1, cavVarB, i32 | ((i411118 << 3) & 896) | (i4111110 & 7168) | (i4111110 & 57344) | (i4111110 & 458752) | ((i27 << 18) & 3670016) | (29360128 & i4111111) | (234881024 & i4111111) | (i4111111 & 1879048192), ((i27 >> 15) & 8190) | ((i26 << 12) & 57344) | ((i27 >> 12) & 458752));
                cavVar2 = cavVarB;
                cwyVar2 = cwyVar3;
                hchVar2 = hchVar3;
                cmwVar3 = cmwVar5;
                f3 = f4;
                i28 = i10;
                z6 = z8;
                z7 = z10;
                z5 = true;
                i30 = 1;
                hsjVar2 = hsjVar11;
                i29 = i31;
                cmjVar2 = cmjVar3;
            } else {
                cavVar2 = cavVarB;
                cavVar2.s();
                cwyVar2 = cwyVar;
                z5 = z3;
                hchVar2 = hchVar3;
                hsjVar2 = hsjVar3;
                cmwVar3 = cmwVar2;
                i28 = i10;
                f3 = f2;
                z6 = z;
                z7 = z2;
                i29 = i22;
                cmjVar2 = cmjVar;
                i30 = i3;
            }
            cdkVarI = cavVar2.I();
            if (cdkVarI != null) {
                cdkVarI.c = new aonn() { // from class: hce
                    public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3) {
                        ((java.lang.Integer) obj3).intValue();
                        defpackage.gzh gzhVar2 = gzhVar;
                        cmw cmwVar6 = cmwVar3;
                        boolean z13 = z6;
                        boolean z14 = z7;
                        defpackage.hch hchVar4 = hchVar2;
                        float f5 = f3;
                        int i50 = i28;
                        int i51 = i29;
                        defpackage.hsj hsjVar12 = hsjVar2;
                        int i52 = i4;
                        cmj cmjVar4 = cmjVar2;
                        int i53 = i6;
                        int i54 = i5;
                        int i55 = i52 | 1;
                        int i56 = i53 & 306783378;
                        int i57 = i56 << 1;
                        int i58 = i54 & 306783378;
                        int i59 = i55 & 306783378;
                        int i60 = i59 << 1;
                        boolean z15 = z5;
                        int i61 = i53 & 613566756;
                        int i62 = i53 & (-920350135);
                        int i63 = i54 & 613566756;
                        int i64 = i55 & 613566756;
                        int i65 = i30;
                        defpackage.hgt.q(gzhVar2, cmwVar6, z13, z14, hchVar4, f5, i50, i51, hsjVar12, cmjVar4, cwyVar2, z15, i65, (cav) obj2, (i55 & (-920350135)) | i59 | (i64 >> 1) | (i60 & i64), (i54 & (-920350135)) | i58 | (i63 >> 1) | ((i58 << 1) & i63), i62 | i56 | (i61 >> 1) | (i57 & i61), i7);
                        return aojh.a;
                    }
                };
            }
        }
        i12 = 12582912;
        i8 |= i12;
        if ((i7 & 256) != 0) {
            if ((100663296 & i4) == 0) {
                if (true != cavVarB.C(false)) {
                    i13 = 33554432;
                } else {
                    i13 = 67108864;
                }
            }
            if ((i7 & 512) != 0) {
                if ((805306368 & i4) == 0) {
                    if (true != cavVarB.C(false)) {
                        i14 = 268435456;
                    } else {
                        i14 = 536870912;
                    }
                }
                i15 = i7 & 1024;
                if (i15 != 0) {
                    i16 = 0;
                } else {
                    i16 = 1;
                }
                if (i15 != 0) {
                    if ((i5 & 6) == 0) {
                        if (i2 == 0) {
                            i19 = -1;
                            i2 = 0;
                        } else {
                            i2 = 1;
                            i19 = 0;
                        }
                        if (true != cavVarB.z(i19)) {
                            i20 = 2;
                        } else {
                            i20 = i9;
                        }
                        i21 = i20 | i5;
                    } else {
                        i16 = i16;
                        i17 = i2;
                        i18 = i5;
                    }
                    i22 = i17;
                    if ((i7 & 2048) != 0) {
                        i18 |= 48;
                    } else if ((i5 & 48) == 0) {
                        int i4111112 = i18;
                        if (true != cavVarB.C(false)) {
                            i23 = 16;
                        } else {
                            i23 = 32;
                        }
                        i18 = i4111112 | i23;
                    }
                    if ((i7 & 4096) != 0) {
                        i18 |= 384;
                    } else if ((i5 & 384) == 0) {
                        i18 |= true == cavVarB.C(false) ? 256 : 128;
                    }
                    i24 = i7 & 8192;
                    if (i24 != 0) {
                        i18 |= 3072;
                        i25 = i24;
                    } else {
                        i25 = i24;
                        if ((i5 & 3072) == 0) {
                            if ((i5 & 4096) == 0) {
                                zD = cavVarB.B(hsjVar3);
                            } else {
                                zD = cavVarB.D(hsjVar3);
                            }
                            i18 |= true == zD ? 2048 : 1024;
                        }
                    }
                    i26 = i6 | 6;
                    i27 = i18 | 920346624;
                    if ((i8 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (cavVarB.H(z4, i8 & 1)) {
                        if (i38 != 0) {
                            cmwVar4 = cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        z8 = (!z11) | z;
                        z9 = (!z12) | z2;
                        if (i41 != 0) {
                            hchVar3 = null;
                        }
                        if (i42 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i11 != 0) {
                            i10 = 1;
                        }
                        i31 = (i16 ^ 1) | i22;
                        if (i25 != 0) {
                            hsjVar3 = null;
                        }
                        i32 = i8 & 14;
                        int i4111113 = i8 >> 3;
                        cmwVar5 = cmwVar4;
                        i33 = i32 | (i4111113 & 112) | (i4111113 & 896) | ((i27 << 6) & 7168) | 32768;
                        i34 = i8 & 57344;
                        i35 = i8 & 458752;
                        i36 = i8 & 3670016;
                        cmjVar3 = cmh.e;
                        cwyVar3 = cwx.b;
                        if (i10 > 0) {
                            throw new java.lang.IllegalArgumentException("Iterations must be a positive number (0).");
                        }
                        if (java.lang.Math.abs(f4) <= Float.MAX_VALUE) {
                            throw new java.lang.IllegalArgumentException("Speed must be a finite number. It is " + f4 + '.');
                        }
                        cbtVar = (cbt) cavVarB;
                        defpackage.hsj hsjVar12 = hsjVar3;
                        objR = cbtVar.R();
                        obj = cau.a;
                        if (objR == obj) {
                            objR = new defpackage.hcb();
                            cbtVar.ab(objR);
                        }
                        hcbVar = (defpackage.hcb) objR;
                        int i4111114 = i8;
                        objR2 = cbtVar.R();
                        if (objR2 == obj) {
                            androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState9 = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.valueOf(z8), cdu.c);
                            cbtVar.ab(parcelableSnapshotMutableState9);
                            objR2 = parcelableSnapshotMutableState9;
                        }
                        int i4111115 = i33 | i34 | i35 | i36;
                        ccpVar = (ccp) objR2;
                        cavVarB.u(-133180567);
                        fB = f4 / defpackage.hgm.b((android.content.Context) cavVarB.e(dep.b));
                        cbtVar.W(false);
                        java.lang.Boolean boolValueOf9 = java.lang.Boolean.valueOf(z8);
                        java.lang.Float fValueOf9 = java.lang.Float.valueOf(fB);
                        java.lang.Integer numValueOf9 = java.lang.Integer.valueOf(i10);
                        java.lang.Object[] objArr9 = new java.lang.Object[5];
                        objArr9[0] = gzhVar;
                        objArr9[1] = boolValueOf9;
                        objArr9[2] = hchVar3;
                        objArr9[3] = fValueOf9;
                        objArr9[i9] = numValueOf9;
                        zB = ((((i4111115 & 112) ^ 48) <= 32 && cavVarB.C(z8)) || (i4111115 & 48) == 32) | ((((i4111115 & 896) ^ 384) <= 256 && cavVarB.C(z9)) || (i4111115 & 384) == 256) | cavVarB.B(hcbVar) | cavVarB.D(gzhVar) | ((((3670016 & i4111115) ^ 1572864) <= 1048576 && cavVarB.z(i10)) || (i4111115 & 1572864) == 1048576) | ((((i4111115 & 7168) ^ 3072) <= 2048 && cavVarB.C(false)) || (i4111115 & 3072) == 2048) | cavVarB.y(fB) | ((((i4111115 & 57344) ^ 24576) <= 16384 && cavVarB.D(hchVar3)) || (i4111115 & 24576) == 16384) | cavVarB.z(0) | cavVarB.C(false);
                        objR3 = cbtVar.R();
                        if (zB) {
                            objR3 = new defpackage.hbv(z8, z9, hcbVar, gzhVar, i10, fB, hchVar3, ccpVar, null);
                            z10 = z9;
                            cbtVar.ab(objR3);
                        } else {
                            objR3 = new defpackage.hbv(z8, z9, hcbVar, gzhVar, i10, fB, hchVar3, ccpVar, null);
                            z10 = z9;
                            cbtVar.ab(objR3);
                        }
                        cbp.h(objArr9, (aonn) objR3, cavVarB);
                        zB2 = cavVarB.B(hcbVar);
                        objR4 = cbtVar.R();
                        if (zB2) {
                            objR4 = new defpackage.fxt(hcbVar, 16);
                            cbtVar.ab(objR4);
                        } else {
                            objR4 = new defpackage.fxt(hcbVar, 16);
                            cbtVar.ab(objR4);
                        }
                        int i4111116 = i4111114 >> 12;
                        int i4111117 = i27 << 15;
                        r(gzhVar, (aomy) objR4, cmwVar5, i31, hsjVar12, cmjVar3, cwyVar3, 1, cavVarB, i32 | ((i4111114 << 3) & 896) | (i4111116 & 7168) | (i4111116 & 57344) | (i4111116 & 458752) | ((i27 << 18) & 3670016) | (29360128 & i4111117) | (234881024 & i4111117) | (i4111117 & 1879048192), ((i27 >> 15) & 8190) | ((i26 << 12) & 57344) | ((i27 >> 12) & 458752));
                        cavVar2 = cavVarB;
                        cwyVar2 = cwyVar3;
                        hchVar2 = hchVar3;
                        cmwVar3 = cmwVar5;
                        f3 = f4;
                        i28 = i10;
                        z6 = z8;
                        z7 = z10;
                        z5 = true;
                        i30 = 1;
                        hsjVar2 = hsjVar12;
                        i29 = i31;
                        cmjVar2 = cmjVar3;
                    } else {
                        cavVar2 = cavVarB;
                        cavVar2.s();
                        cwyVar2 = cwyVar;
                        z5 = z3;
                        hchVar2 = hchVar3;
                        hsjVar2 = hsjVar3;
                        cmwVar3 = cmwVar2;
                        i28 = i10;
                        f3 = f2;
                        z6 = z;
                        z7 = z2;
                        i29 = i22;
                        cmjVar2 = cmjVar;
                        i30 = i3;
                    }
                    cdkVarI = cavVar2.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new aonn() { // from class: hce
                            public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3) {
                                ((java.lang.Integer) obj3).intValue();
                                defpackage.gzh gzhVar2 = gzhVar;
                                cmw cmwVar6 = cmwVar3;
                                boolean z13 = z6;
                                boolean z14 = z7;
                                defpackage.hch hchVar4 = hchVar2;
                                float f5 = f3;
                                int i50 = i28;
                                int i51 = i29;
                                defpackage.hsj hsjVar13 = hsjVar2;
                                int i52 = i4;
                                cmj cmjVar4 = cmjVar2;
                                int i53 = i6;
                                int i54 = i5;
                                int i55 = i52 | 1;
                                int i56 = i53 & 306783378;
                                int i57 = i56 << 1;
                                int i58 = i54 & 306783378;
                                int i59 = i55 & 306783378;
                                int i60 = i59 << 1;
                                boolean z15 = z5;
                                int i61 = i53 & 613566756;
                                int i62 = i53 & (-920350135);
                                int i63 = i54 & 613566756;
                                int i64 = i55 & 613566756;
                                int i65 = i30;
                                defpackage.hgt.q(gzhVar2, cmwVar6, z13, z14, hchVar4, f5, i50, i51, hsjVar13, cmjVar4, cwyVar2, z15, i65, (cav) obj2, (i55 & (-920350135)) | i59 | (i64 >> 1) | (i60 & i64), (i54 & (-920350135)) | i58 | (i63 >> 1) | ((i58 << 1) & i63), i62 | i56 | (i61 >> 1) | (i57 & i61), i7);
                                return aojh.a;
                            }
                        };
                    }
                }
                i21 = i5 | 6;
                i18 = i21;
                i17 = i2;
                i22 = i17;
                if ((i7 & 2048) != 0) {
                    i18 |= 48;
                } else if ((i5 & 48) == 0) {
                    int i4111118 = i18;
                    if (true != cavVarB.C(false)) {
                        i23 = 16;
                    } else {
                        i23 = 32;
                    }
                    i18 = i4111118 | i23;
                }
                if ((i7 & 4096) != 0) {
                    i18 |= 384;
                } else if ((i5 & 384) == 0) {
                    i18 |= true == cavVarB.C(false) ? 256 : 128;
                }
                i24 = i7 & 8192;
                if (i24 != 0) {
                    i18 |= 3072;
                    i25 = i24;
                } else {
                    i25 = i24;
                    if ((i5 & 3072) == 0) {
                        if ((i5 & 4096) == 0) {
                            zD = cavVarB.B(hsjVar3);
                        } else {
                            zD = cavVarB.D(hsjVar3);
                        }
                        i18 |= true == zD ? 2048 : 1024;
                    }
                }
                i26 = i6 | 6;
                i27 = i18 | 920346624;
                if ((i8 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (cavVarB.H(z4, i8 & 1)) {
                    if (i38 != 0) {
                        cmwVar4 = cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    z8 = (!z11) | z;
                    z9 = (!z12) | z2;
                    if (i41 != 0) {
                        hchVar3 = null;
                    }
                    if (i42 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i11 != 0) {
                        i10 = 1;
                    }
                    i31 = (i16 ^ 1) | i22;
                    if (i25 != 0) {
                        hsjVar3 = null;
                    }
                    i32 = i8 & 14;
                    int i4111119 = i8 >> 3;
                    cmwVar5 = cmwVar4;
                    i33 = i32 | (i4111119 & 112) | (i4111119 & 896) | ((i27 << 6) & 7168) | 32768;
                    i34 = i8 & 57344;
                    i35 = i8 & 458752;
                    i36 = i8 & 3670016;
                    cmjVar3 = cmh.e;
                    cwyVar3 = cwx.b;
                    if (i10 > 0) {
                        throw new java.lang.IllegalArgumentException("Iterations must be a positive number (0).");
                    }
                    if (java.lang.Math.abs(f4) <= Float.MAX_VALUE) {
                        throw new java.lang.IllegalArgumentException("Speed must be a finite number. It is " + f4 + '.');
                    }
                    cbtVar = (cbt) cavVarB;
                    defpackage.hsj hsjVar13 = hsjVar3;
                    objR = cbtVar.R();
                    obj = cau.a;
                    if (objR == obj) {
                        objR = new defpackage.hcb();
                        cbtVar.ab(objR);
                    }
                    hcbVar = (defpackage.hcb) objR;
                    int i41111110 = i8;
                    objR2 = cbtVar.R();
                    if (objR2 == obj) {
                        androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState10 = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.valueOf(z8), cdu.c);
                        cbtVar.ab(parcelableSnapshotMutableState10);
                        objR2 = parcelableSnapshotMutableState10;
                    }
                    int i41111111 = i33 | i34 | i35 | i36;
                    ccpVar = (ccp) objR2;
                    cavVarB.u(-133180567);
                    fB = f4 / defpackage.hgm.b((android.content.Context) cavVarB.e(dep.b));
                    cbtVar.W(false);
                    java.lang.Boolean boolValueOf10 = java.lang.Boolean.valueOf(z8);
                    java.lang.Float fValueOf10 = java.lang.Float.valueOf(fB);
                    java.lang.Integer numValueOf10 = java.lang.Integer.valueOf(i10);
                    java.lang.Object[] objArr10 = new java.lang.Object[5];
                    objArr10[0] = gzhVar;
                    objArr10[1] = boolValueOf10;
                    objArr10[2] = hchVar3;
                    objArr10[3] = fValueOf10;
                    objArr10[i9] = numValueOf10;
                    zB = ((((i41111111 & 112) ^ 48) <= 32 && cavVarB.C(z8)) || (i41111111 & 48) == 32) | ((((i41111111 & 896) ^ 384) <= 256 && cavVarB.C(z9)) || (i41111111 & 384) == 256) | cavVarB.B(hcbVar) | cavVarB.D(gzhVar) | ((((3670016 & i41111111) ^ 1572864) <= 1048576 && cavVarB.z(i10)) || (i41111111 & 1572864) == 1048576) | ((((i41111111 & 7168) ^ 3072) <= 2048 && cavVarB.C(false)) || (i41111111 & 3072) == 2048) | cavVarB.y(fB) | ((((i41111111 & 57344) ^ 24576) <= 16384 && cavVarB.D(hchVar3)) || (i41111111 & 24576) == 16384) | cavVarB.z(0) | cavVarB.C(false);
                    objR3 = cbtVar.R();
                    if (zB) {
                        objR3 = new defpackage.hbv(z8, z9, hcbVar, gzhVar, i10, fB, hchVar3, ccpVar, null);
                        z10 = z9;
                        cbtVar.ab(objR3);
                    } else {
                        objR3 = new defpackage.hbv(z8, z9, hcbVar, gzhVar, i10, fB, hchVar3, ccpVar, null);
                        z10 = z9;
                        cbtVar.ab(objR3);
                    }
                    cbp.h(objArr10, (aonn) objR3, cavVarB);
                    zB2 = cavVarB.B(hcbVar);
                    objR4 = cbtVar.R();
                    if (zB2) {
                        objR4 = new defpackage.fxt(hcbVar, 16);
                        cbtVar.ab(objR4);
                    } else {
                        objR4 = new defpackage.fxt(hcbVar, 16);
                        cbtVar.ab(objR4);
                    }
                    int i41111112 = i41111110 >> 12;
                    int i41111113 = i27 << 15;
                    r(gzhVar, (aomy) objR4, cmwVar5, i31, hsjVar13, cmjVar3, cwyVar3, 1, cavVarB, i32 | ((i41111110 << 3) & 896) | (i41111112 & 7168) | (i41111112 & 57344) | (i41111112 & 458752) | ((i27 << 18) & 3670016) | (29360128 & i41111113) | (234881024 & i41111113) | (i41111113 & 1879048192), ((i27 >> 15) & 8190) | ((i26 << 12) & 57344) | ((i27 >> 12) & 458752));
                    cavVar2 = cavVarB;
                    cwyVar2 = cwyVar3;
                    hchVar2 = hchVar3;
                    cmwVar3 = cmwVar5;
                    f3 = f4;
                    i28 = i10;
                    z6 = z8;
                    z7 = z10;
                    z5 = true;
                    i30 = 1;
                    hsjVar2 = hsjVar13;
                    i29 = i31;
                    cmjVar2 = cmjVar3;
                } else {
                    cavVar2 = cavVarB;
                    cavVar2.s();
                    cwyVar2 = cwyVar;
                    z5 = z3;
                    hchVar2 = hchVar3;
                    hsjVar2 = hsjVar3;
                    cmwVar3 = cmwVar2;
                    i28 = i10;
                    f3 = f2;
                    z6 = z;
                    z7 = z2;
                    i29 = i22;
                    cmjVar2 = cmjVar;
                    i30 = i3;
                }
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new aonn() { // from class: hce
                        public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3) {
                            ((java.lang.Integer) obj3).intValue();
                            defpackage.gzh gzhVar2 = gzhVar;
                            cmw cmwVar6 = cmwVar3;
                            boolean z13 = z6;
                            boolean z14 = z7;
                            defpackage.hch hchVar4 = hchVar2;
                            float f5 = f3;
                            int i50 = i28;
                            int i51 = i29;
                            defpackage.hsj hsjVar14 = hsjVar2;
                            int i52 = i4;
                            cmj cmjVar4 = cmjVar2;
                            int i53 = i6;
                            int i54 = i5;
                            int i55 = i52 | 1;
                            int i56 = i53 & 306783378;
                            int i57 = i56 << 1;
                            int i58 = i54 & 306783378;
                            int i59 = i55 & 306783378;
                            int i60 = i59 << 1;
                            boolean z15 = z5;
                            int i61 = i53 & 613566756;
                            int i62 = i53 & (-920350135);
                            int i63 = i54 & 613566756;
                            int i64 = i55 & 613566756;
                            int i65 = i30;
                            defpackage.hgt.q(gzhVar2, cmwVar6, z13, z14, hchVar4, f5, i50, i51, hsjVar14, cmjVar4, cwyVar2, z15, i65, (cav) obj2, (i55 & (-920350135)) | i59 | (i64 >> 1) | (i60 & i64), (i54 & (-920350135)) | i58 | (i63 >> 1) | ((i58 << 1) & i63), i62 | i56 | (i61 >> 1) | (i57 & i61), i7);
                            return aojh.a;
                        }
                    };
                }
            }
            i14 = 805306368;
            i8 |= i14;
            i15 = i7 & 1024;
            if (i15 != 0) {
                i16 = 0;
            } else {
                i16 = 1;
            }
            if (i15 != 0) {
                if ((i5 & 6) == 0) {
                    if (i2 == 0) {
                        i19 = -1;
                        i2 = 0;
                    } else {
                        i2 = 1;
                        i19 = 0;
                    }
                    if (true != cavVarB.z(i19)) {
                        i20 = 2;
                    } else {
                        i20 = i9;
                    }
                    i21 = i20 | i5;
                } else {
                    i16 = i16;
                    i17 = i2;
                    i18 = i5;
                }
                i22 = i17;
                if ((i7 & 2048) != 0) {
                    i18 |= 48;
                } else if ((i5 & 48) == 0) {
                    int i41111114 = i18;
                    if (true != cavVarB.C(false)) {
                        i23 = 16;
                    } else {
                        i23 = 32;
                    }
                    i18 = i41111114 | i23;
                }
                if ((i7 & 4096) != 0) {
                    i18 |= 384;
                } else if ((i5 & 384) == 0) {
                    i18 |= true == cavVarB.C(false) ? 256 : 128;
                }
                i24 = i7 & 8192;
                if (i24 != 0) {
                    i18 |= 3072;
                    i25 = i24;
                } else {
                    i25 = i24;
                    if ((i5 & 3072) == 0) {
                        if ((i5 & 4096) == 0) {
                            zD = cavVarB.B(hsjVar3);
                        } else {
                            zD = cavVarB.D(hsjVar3);
                        }
                        i18 |= true == zD ? 2048 : 1024;
                    }
                }
                i26 = i6 | 6;
                i27 = i18 | 920346624;
                if ((i8 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (cavVarB.H(z4, i8 & 1)) {
                    if (i38 != 0) {
                        cmwVar4 = cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    z8 = (!z11) | z;
                    z9 = (!z12) | z2;
                    if (i41 != 0) {
                        hchVar3 = null;
                    }
                    if (i42 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i11 != 0) {
                        i10 = 1;
                    }
                    i31 = (i16 ^ 1) | i22;
                    if (i25 != 0) {
                        hsjVar3 = null;
                    }
                    i32 = i8 & 14;
                    int i41111115 = i8 >> 3;
                    cmwVar5 = cmwVar4;
                    i33 = i32 | (i41111115 & 112) | (i41111115 & 896) | ((i27 << 6) & 7168) | 32768;
                    i34 = i8 & 57344;
                    i35 = i8 & 458752;
                    i36 = i8 & 3670016;
                    cmjVar3 = cmh.e;
                    cwyVar3 = cwx.b;
                    if (i10 > 0) {
                        throw new java.lang.IllegalArgumentException("Iterations must be a positive number (0).");
                    }
                    if (java.lang.Math.abs(f4) <= Float.MAX_VALUE) {
                        throw new java.lang.IllegalArgumentException("Speed must be a finite number. It is " + f4 + '.');
                    }
                    cbtVar = (cbt) cavVarB;
                    defpackage.hsj hsjVar14 = hsjVar3;
                    objR = cbtVar.R();
                    obj = cau.a;
                    if (objR == obj) {
                        objR = new defpackage.hcb();
                        cbtVar.ab(objR);
                    }
                    hcbVar = (defpackage.hcb) objR;
                    int i41111116 = i8;
                    objR2 = cbtVar.R();
                    if (objR2 == obj) {
                        androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState11 = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.valueOf(z8), cdu.c);
                        cbtVar.ab(parcelableSnapshotMutableState11);
                        objR2 = parcelableSnapshotMutableState11;
                    }
                    int i41111117 = i33 | i34 | i35 | i36;
                    ccpVar = (ccp) objR2;
                    cavVarB.u(-133180567);
                    fB = f4 / defpackage.hgm.b((android.content.Context) cavVarB.e(dep.b));
                    cbtVar.W(false);
                    java.lang.Boolean boolValueOf11 = java.lang.Boolean.valueOf(z8);
                    java.lang.Float fValueOf11 = java.lang.Float.valueOf(fB);
                    java.lang.Integer numValueOf11 = java.lang.Integer.valueOf(i10);
                    java.lang.Object[] objArr11 = new java.lang.Object[5];
                    objArr11[0] = gzhVar;
                    objArr11[1] = boolValueOf11;
                    objArr11[2] = hchVar3;
                    objArr11[3] = fValueOf11;
                    objArr11[i9] = numValueOf11;
                    zB = ((((i41111117 & 112) ^ 48) <= 32 && cavVarB.C(z8)) || (i41111117 & 48) == 32) | ((((i41111117 & 896) ^ 384) <= 256 && cavVarB.C(z9)) || (i41111117 & 384) == 256) | cavVarB.B(hcbVar) | cavVarB.D(gzhVar) | ((((3670016 & i41111117) ^ 1572864) <= 1048576 && cavVarB.z(i10)) || (i41111117 & 1572864) == 1048576) | ((((i41111117 & 7168) ^ 3072) <= 2048 && cavVarB.C(false)) || (i41111117 & 3072) == 2048) | cavVarB.y(fB) | ((((i41111117 & 57344) ^ 24576) <= 16384 && cavVarB.D(hchVar3)) || (i41111117 & 24576) == 16384) | cavVarB.z(0) | cavVarB.C(false);
                    objR3 = cbtVar.R();
                    if (zB) {
                        objR3 = new defpackage.hbv(z8, z9, hcbVar, gzhVar, i10, fB, hchVar3, ccpVar, null);
                        z10 = z9;
                        cbtVar.ab(objR3);
                    } else {
                        objR3 = new defpackage.hbv(z8, z9, hcbVar, gzhVar, i10, fB, hchVar3, ccpVar, null);
                        z10 = z9;
                        cbtVar.ab(objR3);
                    }
                    cbp.h(objArr11, (aonn) objR3, cavVarB);
                    zB2 = cavVarB.B(hcbVar);
                    objR4 = cbtVar.R();
                    if (zB2) {
                        objR4 = new defpackage.fxt(hcbVar, 16);
                        cbtVar.ab(objR4);
                    } else {
                        objR4 = new defpackage.fxt(hcbVar, 16);
                        cbtVar.ab(objR4);
                    }
                    int i41111118 = i41111116 >> 12;
                    int i41111119 = i27 << 15;
                    r(gzhVar, (aomy) objR4, cmwVar5, i31, hsjVar14, cmjVar3, cwyVar3, 1, cavVarB, i32 | ((i41111116 << 3) & 896) | (i41111118 & 7168) | (i41111118 & 57344) | (i41111118 & 458752) | ((i27 << 18) & 3670016) | (29360128 & i41111119) | (234881024 & i41111119) | (i41111119 & 1879048192), ((i27 >> 15) & 8190) | ((i26 << 12) & 57344) | ((i27 >> 12) & 458752));
                    cavVar2 = cavVarB;
                    cwyVar2 = cwyVar3;
                    hchVar2 = hchVar3;
                    cmwVar3 = cmwVar5;
                    f3 = f4;
                    i28 = i10;
                    z6 = z8;
                    z7 = z10;
                    z5 = true;
                    i30 = 1;
                    hsjVar2 = hsjVar14;
                    i29 = i31;
                    cmjVar2 = cmjVar3;
                } else {
                    cavVar2 = cavVarB;
                    cavVar2.s();
                    cwyVar2 = cwyVar;
                    z5 = z3;
                    hchVar2 = hchVar3;
                    hsjVar2 = hsjVar3;
                    cmwVar3 = cmwVar2;
                    i28 = i10;
                    f3 = f2;
                    z6 = z;
                    z7 = z2;
                    i29 = i22;
                    cmjVar2 = cmjVar;
                    i30 = i3;
                }
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new aonn() { // from class: hce
                        public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3) {
                            ((java.lang.Integer) obj3).intValue();
                            defpackage.gzh gzhVar2 = gzhVar;
                            cmw cmwVar6 = cmwVar3;
                            boolean z13 = z6;
                            boolean z14 = z7;
                            defpackage.hch hchVar4 = hchVar2;
                            float f5 = f3;
                            int i50 = i28;
                            int i51 = i29;
                            defpackage.hsj hsjVar15 = hsjVar2;
                            int i52 = i4;
                            cmj cmjVar4 = cmjVar2;
                            int i53 = i6;
                            int i54 = i5;
                            int i55 = i52 | 1;
                            int i56 = i53 & 306783378;
                            int i57 = i56 << 1;
                            int i58 = i54 & 306783378;
                            int i59 = i55 & 306783378;
                            int i60 = i59 << 1;
                            boolean z15 = z5;
                            int i61 = i53 & 613566756;
                            int i62 = i53 & (-920350135);
                            int i63 = i54 & 613566756;
                            int i64 = i55 & 613566756;
                            int i65 = i30;
                            defpackage.hgt.q(gzhVar2, cmwVar6, z13, z14, hchVar4, f5, i50, i51, hsjVar15, cmjVar4, cwyVar2, z15, i65, (cav) obj2, (i55 & (-920350135)) | i59 | (i64 >> 1) | (i60 & i64), (i54 & (-920350135)) | i58 | (i63 >> 1) | ((i58 << 1) & i63), i62 | i56 | (i61 >> 1) | (i57 & i61), i7);
                            return aojh.a;
                        }
                    };
                }
            }
            i21 = i5 | 6;
            i18 = i21;
            i17 = i2;
            i22 = i17;
            if ((i7 & 2048) != 0) {
                i18 |= 48;
            } else if ((i5 & 48) == 0) {
                int i411111110 = i18;
                if (true != cavVarB.C(false)) {
                    i23 = 16;
                } else {
                    i23 = 32;
                }
                i18 = i411111110 | i23;
            }
            if ((i7 & 4096) != 0) {
                i18 |= 384;
            } else if ((i5 & 384) == 0) {
                i18 |= true == cavVarB.C(false) ? 256 : 128;
            }
            i24 = i7 & 8192;
            if (i24 != 0) {
                i18 |= 3072;
                i25 = i24;
            } else {
                i25 = i24;
                if ((i5 & 3072) == 0) {
                    if ((i5 & 4096) == 0) {
                        zD = cavVarB.B(hsjVar3);
                    } else {
                        zD = cavVarB.D(hsjVar3);
                    }
                    i18 |= true == zD ? 2048 : 1024;
                }
            }
            i26 = i6 | 6;
            i27 = i18 | 920346624;
            if ((i8 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (cavVarB.H(z4, i8 & 1)) {
                if (i38 != 0) {
                    cmwVar4 = cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                z8 = (!z11) | z;
                z9 = (!z12) | z2;
                if (i41 != 0) {
                    hchVar3 = null;
                }
                if (i42 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f2;
                }
                if (i11 != 0) {
                    i10 = 1;
                }
                i31 = (i16 ^ 1) | i22;
                if (i25 != 0) {
                    hsjVar3 = null;
                }
                i32 = i8 & 14;
                int i411111111 = i8 >> 3;
                cmwVar5 = cmwVar4;
                i33 = i32 | (i411111111 & 112) | (i411111111 & 896) | ((i27 << 6) & 7168) | 32768;
                i34 = i8 & 57344;
                i35 = i8 & 458752;
                i36 = i8 & 3670016;
                cmjVar3 = cmh.e;
                cwyVar3 = cwx.b;
                if (i10 > 0) {
                    throw new java.lang.IllegalArgumentException("Iterations must be a positive number (0).");
                }
                if (java.lang.Math.abs(f4) <= Float.MAX_VALUE) {
                    throw new java.lang.IllegalArgumentException("Speed must be a finite number. It is " + f4 + '.');
                }
                cbtVar = (cbt) cavVarB;
                defpackage.hsj hsjVar15 = hsjVar3;
                objR = cbtVar.R();
                obj = cau.a;
                if (objR == obj) {
                    objR = new defpackage.hcb();
                    cbtVar.ab(objR);
                }
                hcbVar = (defpackage.hcb) objR;
                int i411111112 = i8;
                objR2 = cbtVar.R();
                if (objR2 == obj) {
                    androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState12 = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.valueOf(z8), cdu.c);
                    cbtVar.ab(parcelableSnapshotMutableState12);
                    objR2 = parcelableSnapshotMutableState12;
                }
                int i411111113 = i33 | i34 | i35 | i36;
                ccpVar = (ccp) objR2;
                cavVarB.u(-133180567);
                fB = f4 / defpackage.hgm.b((android.content.Context) cavVarB.e(dep.b));
                cbtVar.W(false);
                java.lang.Boolean boolValueOf12 = java.lang.Boolean.valueOf(z8);
                java.lang.Float fValueOf12 = java.lang.Float.valueOf(fB);
                java.lang.Integer numValueOf12 = java.lang.Integer.valueOf(i10);
                java.lang.Object[] objArr12 = new java.lang.Object[5];
                objArr12[0] = gzhVar;
                objArr12[1] = boolValueOf12;
                objArr12[2] = hchVar3;
                objArr12[3] = fValueOf12;
                objArr12[i9] = numValueOf12;
                zB = ((((i411111113 & 112) ^ 48) <= 32 && cavVarB.C(z8)) || (i411111113 & 48) == 32) | ((((i411111113 & 896) ^ 384) <= 256 && cavVarB.C(z9)) || (i411111113 & 384) == 256) | cavVarB.B(hcbVar) | cavVarB.D(gzhVar) | ((((3670016 & i411111113) ^ 1572864) <= 1048576 && cavVarB.z(i10)) || (i411111113 & 1572864) == 1048576) | ((((i411111113 & 7168) ^ 3072) <= 2048 && cavVarB.C(false)) || (i411111113 & 3072) == 2048) | cavVarB.y(fB) | ((((i411111113 & 57344) ^ 24576) <= 16384 && cavVarB.D(hchVar3)) || (i411111113 & 24576) == 16384) | cavVarB.z(0) | cavVarB.C(false);
                objR3 = cbtVar.R();
                if (zB) {
                    objR3 = new defpackage.hbv(z8, z9, hcbVar, gzhVar, i10, fB, hchVar3, ccpVar, null);
                    z10 = z9;
                    cbtVar.ab(objR3);
                } else {
                    objR3 = new defpackage.hbv(z8, z9, hcbVar, gzhVar, i10, fB, hchVar3, ccpVar, null);
                    z10 = z9;
                    cbtVar.ab(objR3);
                }
                cbp.h(objArr12, (aonn) objR3, cavVarB);
                zB2 = cavVarB.B(hcbVar);
                objR4 = cbtVar.R();
                if (zB2) {
                    objR4 = new defpackage.fxt(hcbVar, 16);
                    cbtVar.ab(objR4);
                } else {
                    objR4 = new defpackage.fxt(hcbVar, 16);
                    cbtVar.ab(objR4);
                }
                int i411111114 = i411111112 >> 12;
                int i411111115 = i27 << 15;
                r(gzhVar, (aomy) objR4, cmwVar5, i31, hsjVar15, cmjVar3, cwyVar3, 1, cavVarB, i32 | ((i411111112 << 3) & 896) | (i411111114 & 7168) | (i411111114 & 57344) | (i411111114 & 458752) | ((i27 << 18) & 3670016) | (29360128 & i411111115) | (234881024 & i411111115) | (i411111115 & 1879048192), ((i27 >> 15) & 8190) | ((i26 << 12) & 57344) | ((i27 >> 12) & 458752));
                cavVar2 = cavVarB;
                cwyVar2 = cwyVar3;
                hchVar2 = hchVar3;
                cmwVar3 = cmwVar5;
                f3 = f4;
                i28 = i10;
                z6 = z8;
                z7 = z10;
                z5 = true;
                i30 = 1;
                hsjVar2 = hsjVar15;
                i29 = i31;
                cmjVar2 = cmjVar3;
            } else {
                cavVar2 = cavVarB;
                cavVar2.s();
                cwyVar2 = cwyVar;
                z5 = z3;
                hchVar2 = hchVar3;
                hsjVar2 = hsjVar3;
                cmwVar3 = cmwVar2;
                i28 = i10;
                f3 = f2;
                z6 = z;
                z7 = z2;
                i29 = i22;
                cmjVar2 = cmjVar;
                i30 = i3;
            }
            cdkVarI = cavVar2.I();
            if (cdkVarI != null) {
                cdkVarI.c = new aonn() { // from class: hce
                    public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3) {
                        ((java.lang.Integer) obj3).intValue();
                        defpackage.gzh gzhVar2 = gzhVar;
                        cmw cmwVar6 = cmwVar3;
                        boolean z13 = z6;
                        boolean z14 = z7;
                        defpackage.hch hchVar4 = hchVar2;
                        float f5 = f3;
                        int i50 = i28;
                        int i51 = i29;
                        defpackage.hsj hsjVar16 = hsjVar2;
                        int i52 = i4;
                        cmj cmjVar4 = cmjVar2;
                        int i53 = i6;
                        int i54 = i5;
                        int i55 = i52 | 1;
                        int i56 = i53 & 306783378;
                        int i57 = i56 << 1;
                        int i58 = i54 & 306783378;
                        int i59 = i55 & 306783378;
                        int i60 = i59 << 1;
                        boolean z15 = z5;
                        int i61 = i53 & 613566756;
                        int i62 = i53 & (-920350135);
                        int i63 = i54 & 613566756;
                        int i64 = i55 & 613566756;
                        int i65 = i30;
                        defpackage.hgt.q(gzhVar2, cmwVar6, z13, z14, hchVar4, f5, i50, i51, hsjVar16, cmjVar4, cwyVar2, z15, i65, (cav) obj2, (i55 & (-920350135)) | i59 | (i64 >> 1) | (i60 & i64), (i54 & (-920350135)) | i58 | (i63 >> 1) | ((i58 << 1) & i63), i62 | i56 | (i61 >> 1) | (i57 & i61), i7);
                        return aojh.a;
                    }
                };
            }
        }
        i13 = 100663296;
        i8 |= i13;
        if ((i7 & 512) != 0) {
            if ((805306368 & i4) == 0) {
                if (true != cavVarB.C(false)) {
                    i14 = 268435456;
                } else {
                    i14 = 536870912;
                }
            }
            i15 = i7 & 1024;
            if (i15 != 0) {
                i16 = 0;
            } else {
                i16 = 1;
            }
            if (i15 != 0) {
                if ((i5 & 6) == 0) {
                    if (i2 == 0) {
                        i19 = -1;
                        i2 = 0;
                    } else {
                        i2 = 1;
                        i19 = 0;
                    }
                    if (true != cavVarB.z(i19)) {
                        i20 = 2;
                    } else {
                        i20 = i9;
                    }
                    i21 = i20 | i5;
                } else {
                    i16 = i16;
                    i17 = i2;
                    i18 = i5;
                }
                i22 = i17;
                if ((i7 & 2048) != 0) {
                    i18 |= 48;
                } else if ((i5 & 48) == 0) {
                    int i411111116 = i18;
                    if (true != cavVarB.C(false)) {
                        i23 = 16;
                    } else {
                        i23 = 32;
                    }
                    i18 = i411111116 | i23;
                }
                if ((i7 & 4096) != 0) {
                    i18 |= 384;
                } else if ((i5 & 384) == 0) {
                    i18 |= true == cavVarB.C(false) ? 256 : 128;
                }
                i24 = i7 & 8192;
                if (i24 != 0) {
                    i18 |= 3072;
                    i25 = i24;
                } else {
                    i25 = i24;
                    if ((i5 & 3072) == 0) {
                        if ((i5 & 4096) == 0) {
                            zD = cavVarB.B(hsjVar3);
                        } else {
                            zD = cavVarB.D(hsjVar3);
                        }
                        i18 |= true == zD ? 2048 : 1024;
                    }
                }
                i26 = i6 | 6;
                i27 = i18 | 920346624;
                if ((i8 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (cavVarB.H(z4, i8 & 1)) {
                    if (i38 != 0) {
                        cmwVar4 = cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    z8 = (!z11) | z;
                    z9 = (!z12) | z2;
                    if (i41 != 0) {
                        hchVar3 = null;
                    }
                    if (i42 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i11 != 0) {
                        i10 = 1;
                    }
                    i31 = (i16 ^ 1) | i22;
                    if (i25 != 0) {
                        hsjVar3 = null;
                    }
                    i32 = i8 & 14;
                    int i411111117 = i8 >> 3;
                    cmwVar5 = cmwVar4;
                    i33 = i32 | (i411111117 & 112) | (i411111117 & 896) | ((i27 << 6) & 7168) | 32768;
                    i34 = i8 & 57344;
                    i35 = i8 & 458752;
                    i36 = i8 & 3670016;
                    cmjVar3 = cmh.e;
                    cwyVar3 = cwx.b;
                    if (i10 > 0) {
                        throw new java.lang.IllegalArgumentException("Iterations must be a positive number (0).");
                    }
                    if (java.lang.Math.abs(f4) <= Float.MAX_VALUE) {
                        throw new java.lang.IllegalArgumentException("Speed must be a finite number. It is " + f4 + '.');
                    }
                    cbtVar = (cbt) cavVarB;
                    defpackage.hsj hsjVar16 = hsjVar3;
                    objR = cbtVar.R();
                    obj = cau.a;
                    if (objR == obj) {
                        objR = new defpackage.hcb();
                        cbtVar.ab(objR);
                    }
                    hcbVar = (defpackage.hcb) objR;
                    int i411111118 = i8;
                    objR2 = cbtVar.R();
                    if (objR2 == obj) {
                        androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState13 = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.valueOf(z8), cdu.c);
                        cbtVar.ab(parcelableSnapshotMutableState13);
                        objR2 = parcelableSnapshotMutableState13;
                    }
                    int i411111119 = i33 | i34 | i35 | i36;
                    ccpVar = (ccp) objR2;
                    cavVarB.u(-133180567);
                    fB = f4 / defpackage.hgm.b((android.content.Context) cavVarB.e(dep.b));
                    cbtVar.W(false);
                    java.lang.Boolean boolValueOf13 = java.lang.Boolean.valueOf(z8);
                    java.lang.Float fValueOf13 = java.lang.Float.valueOf(fB);
                    java.lang.Integer numValueOf13 = java.lang.Integer.valueOf(i10);
                    java.lang.Object[] objArr13 = new java.lang.Object[5];
                    objArr13[0] = gzhVar;
                    objArr13[1] = boolValueOf13;
                    objArr13[2] = hchVar3;
                    objArr13[3] = fValueOf13;
                    objArr13[i9] = numValueOf13;
                    zB = ((((i411111119 & 112) ^ 48) <= 32 && cavVarB.C(z8)) || (i411111119 & 48) == 32) | ((((i411111119 & 896) ^ 384) <= 256 && cavVarB.C(z9)) || (i411111119 & 384) == 256) | cavVarB.B(hcbVar) | cavVarB.D(gzhVar) | ((((3670016 & i411111119) ^ 1572864) <= 1048576 && cavVarB.z(i10)) || (i411111119 & 1572864) == 1048576) | ((((i411111119 & 7168) ^ 3072) <= 2048 && cavVarB.C(false)) || (i411111119 & 3072) == 2048) | cavVarB.y(fB) | ((((i411111119 & 57344) ^ 24576) <= 16384 && cavVarB.D(hchVar3)) || (i411111119 & 24576) == 16384) | cavVarB.z(0) | cavVarB.C(false);
                    objR3 = cbtVar.R();
                    if (zB) {
                        objR3 = new defpackage.hbv(z8, z9, hcbVar, gzhVar, i10, fB, hchVar3, ccpVar, null);
                        z10 = z9;
                        cbtVar.ab(objR3);
                    } else {
                        objR3 = new defpackage.hbv(z8, z9, hcbVar, gzhVar, i10, fB, hchVar3, ccpVar, null);
                        z10 = z9;
                        cbtVar.ab(objR3);
                    }
                    cbp.h(objArr13, (aonn) objR3, cavVarB);
                    zB2 = cavVarB.B(hcbVar);
                    objR4 = cbtVar.R();
                    if (zB2) {
                        objR4 = new defpackage.fxt(hcbVar, 16);
                        cbtVar.ab(objR4);
                    } else {
                        objR4 = new defpackage.fxt(hcbVar, 16);
                        cbtVar.ab(objR4);
                    }
                    int i4111111110 = i411111118 >> 12;
                    int i4111111111 = i27 << 15;
                    r(gzhVar, (aomy) objR4, cmwVar5, i31, hsjVar16, cmjVar3, cwyVar3, 1, cavVarB, i32 | ((i411111118 << 3) & 896) | (i4111111110 & 7168) | (i4111111110 & 57344) | (i4111111110 & 458752) | ((i27 << 18) & 3670016) | (29360128 & i4111111111) | (234881024 & i4111111111) | (i4111111111 & 1879048192), ((i27 >> 15) & 8190) | ((i26 << 12) & 57344) | ((i27 >> 12) & 458752));
                    cavVar2 = cavVarB;
                    cwyVar2 = cwyVar3;
                    hchVar2 = hchVar3;
                    cmwVar3 = cmwVar5;
                    f3 = f4;
                    i28 = i10;
                    z6 = z8;
                    z7 = z10;
                    z5 = true;
                    i30 = 1;
                    hsjVar2 = hsjVar16;
                    i29 = i31;
                    cmjVar2 = cmjVar3;
                } else {
                    cavVar2 = cavVarB;
                    cavVar2.s();
                    cwyVar2 = cwyVar;
                    z5 = z3;
                    hchVar2 = hchVar3;
                    hsjVar2 = hsjVar3;
                    cmwVar3 = cmwVar2;
                    i28 = i10;
                    f3 = f2;
                    z6 = z;
                    z7 = z2;
                    i29 = i22;
                    cmjVar2 = cmjVar;
                    i30 = i3;
                }
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new aonn() { // from class: hce
                        public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3) {
                            ((java.lang.Integer) obj3).intValue();
                            defpackage.gzh gzhVar2 = gzhVar;
                            cmw cmwVar6 = cmwVar3;
                            boolean z13 = z6;
                            boolean z14 = z7;
                            defpackage.hch hchVar4 = hchVar2;
                            float f5 = f3;
                            int i50 = i28;
                            int i51 = i29;
                            defpackage.hsj hsjVar17 = hsjVar2;
                            int i52 = i4;
                            cmj cmjVar4 = cmjVar2;
                            int i53 = i6;
                            int i54 = i5;
                            int i55 = i52 | 1;
                            int i56 = i53 & 306783378;
                            int i57 = i56 << 1;
                            int i58 = i54 & 306783378;
                            int i59 = i55 & 306783378;
                            int i60 = i59 << 1;
                            boolean z15 = z5;
                            int i61 = i53 & 613566756;
                            int i62 = i53 & (-920350135);
                            int i63 = i54 & 613566756;
                            int i64 = i55 & 613566756;
                            int i65 = i30;
                            defpackage.hgt.q(gzhVar2, cmwVar6, z13, z14, hchVar4, f5, i50, i51, hsjVar17, cmjVar4, cwyVar2, z15, i65, (cav) obj2, (i55 & (-920350135)) | i59 | (i64 >> 1) | (i60 & i64), (i54 & (-920350135)) | i58 | (i63 >> 1) | ((i58 << 1) & i63), i62 | i56 | (i61 >> 1) | (i57 & i61), i7);
                            return aojh.a;
                        }
                    };
                }
            }
            i21 = i5 | 6;
            i18 = i21;
            i17 = i2;
            i22 = i17;
            if ((i7 & 2048) != 0) {
                i18 |= 48;
            } else if ((i5 & 48) == 0) {
                int i4111111112 = i18;
                if (true != cavVarB.C(false)) {
                    i23 = 16;
                } else {
                    i23 = 32;
                }
                i18 = i4111111112 | i23;
            }
            if ((i7 & 4096) != 0) {
                i18 |= 384;
            } else if ((i5 & 384) == 0) {
                i18 |= true == cavVarB.C(false) ? 256 : 128;
            }
            i24 = i7 & 8192;
            if (i24 != 0) {
                i18 |= 3072;
                i25 = i24;
            } else {
                i25 = i24;
                if ((i5 & 3072) == 0) {
                    if ((i5 & 4096) == 0) {
                        zD = cavVarB.B(hsjVar3);
                    } else {
                        zD = cavVarB.D(hsjVar3);
                    }
                    i18 |= true == zD ? 2048 : 1024;
                }
            }
            i26 = i6 | 6;
            i27 = i18 | 920346624;
            if ((i8 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (cavVarB.H(z4, i8 & 1)) {
                if (i38 != 0) {
                    cmwVar4 = cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                z8 = (!z11) | z;
                z9 = (!z12) | z2;
                if (i41 != 0) {
                    hchVar3 = null;
                }
                if (i42 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f2;
                }
                if (i11 != 0) {
                    i10 = 1;
                }
                i31 = (i16 ^ 1) | i22;
                if (i25 != 0) {
                    hsjVar3 = null;
                }
                i32 = i8 & 14;
                int i4111111113 = i8 >> 3;
                cmwVar5 = cmwVar4;
                i33 = i32 | (i4111111113 & 112) | (i4111111113 & 896) | ((i27 << 6) & 7168) | 32768;
                i34 = i8 & 57344;
                i35 = i8 & 458752;
                i36 = i8 & 3670016;
                cmjVar3 = cmh.e;
                cwyVar3 = cwx.b;
                if (i10 > 0) {
                    throw new java.lang.IllegalArgumentException("Iterations must be a positive number (0).");
                }
                if (java.lang.Math.abs(f4) <= Float.MAX_VALUE) {
                    throw new java.lang.IllegalArgumentException("Speed must be a finite number. It is " + f4 + '.');
                }
                cbtVar = (cbt) cavVarB;
                defpackage.hsj hsjVar17 = hsjVar3;
                objR = cbtVar.R();
                obj = cau.a;
                if (objR == obj) {
                    objR = new defpackage.hcb();
                    cbtVar.ab(objR);
                }
                hcbVar = (defpackage.hcb) objR;
                int i4111111114 = i8;
                objR2 = cbtVar.R();
                if (objR2 == obj) {
                    androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState14 = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.valueOf(z8), cdu.c);
                    cbtVar.ab(parcelableSnapshotMutableState14);
                    objR2 = parcelableSnapshotMutableState14;
                }
                int i4111111115 = i33 | i34 | i35 | i36;
                ccpVar = (ccp) objR2;
                cavVarB.u(-133180567);
                fB = f4 / defpackage.hgm.b((android.content.Context) cavVarB.e(dep.b));
                cbtVar.W(false);
                java.lang.Boolean boolValueOf14 = java.lang.Boolean.valueOf(z8);
                java.lang.Float fValueOf14 = java.lang.Float.valueOf(fB);
                java.lang.Integer numValueOf14 = java.lang.Integer.valueOf(i10);
                java.lang.Object[] objArr14 = new java.lang.Object[5];
                objArr14[0] = gzhVar;
                objArr14[1] = boolValueOf14;
                objArr14[2] = hchVar3;
                objArr14[3] = fValueOf14;
                objArr14[i9] = numValueOf14;
                zB = ((((i4111111115 & 112) ^ 48) <= 32 && cavVarB.C(z8)) || (i4111111115 & 48) == 32) | ((((i4111111115 & 896) ^ 384) <= 256 && cavVarB.C(z9)) || (i4111111115 & 384) == 256) | cavVarB.B(hcbVar) | cavVarB.D(gzhVar) | ((((3670016 & i4111111115) ^ 1572864) <= 1048576 && cavVarB.z(i10)) || (i4111111115 & 1572864) == 1048576) | ((((i4111111115 & 7168) ^ 3072) <= 2048 && cavVarB.C(false)) || (i4111111115 & 3072) == 2048) | cavVarB.y(fB) | ((((i4111111115 & 57344) ^ 24576) <= 16384 && cavVarB.D(hchVar3)) || (i4111111115 & 24576) == 16384) | cavVarB.z(0) | cavVarB.C(false);
                objR3 = cbtVar.R();
                if (zB) {
                    objR3 = new defpackage.hbv(z8, z9, hcbVar, gzhVar, i10, fB, hchVar3, ccpVar, null);
                    z10 = z9;
                    cbtVar.ab(objR3);
                } else {
                    objR3 = new defpackage.hbv(z8, z9, hcbVar, gzhVar, i10, fB, hchVar3, ccpVar, null);
                    z10 = z9;
                    cbtVar.ab(objR3);
                }
                cbp.h(objArr14, (aonn) objR3, cavVarB);
                zB2 = cavVarB.B(hcbVar);
                objR4 = cbtVar.R();
                if (zB2) {
                    objR4 = new defpackage.fxt(hcbVar, 16);
                    cbtVar.ab(objR4);
                } else {
                    objR4 = new defpackage.fxt(hcbVar, 16);
                    cbtVar.ab(objR4);
                }
                int i4111111116 = i4111111114 >> 12;
                int i4111111117 = i27 << 15;
                r(gzhVar, (aomy) objR4, cmwVar5, i31, hsjVar17, cmjVar3, cwyVar3, 1, cavVarB, i32 | ((i4111111114 << 3) & 896) | (i4111111116 & 7168) | (i4111111116 & 57344) | (i4111111116 & 458752) | ((i27 << 18) & 3670016) | (29360128 & i4111111117) | (234881024 & i4111111117) | (i4111111117 & 1879048192), ((i27 >> 15) & 8190) | ((i26 << 12) & 57344) | ((i27 >> 12) & 458752));
                cavVar2 = cavVarB;
                cwyVar2 = cwyVar3;
                hchVar2 = hchVar3;
                cmwVar3 = cmwVar5;
                f3 = f4;
                i28 = i10;
                z6 = z8;
                z7 = z10;
                z5 = true;
                i30 = 1;
                hsjVar2 = hsjVar17;
                i29 = i31;
                cmjVar2 = cmjVar3;
            } else {
                cavVar2 = cavVarB;
                cavVar2.s();
                cwyVar2 = cwyVar;
                z5 = z3;
                hchVar2 = hchVar3;
                hsjVar2 = hsjVar3;
                cmwVar3 = cmwVar2;
                i28 = i10;
                f3 = f2;
                z6 = z;
                z7 = z2;
                i29 = i22;
                cmjVar2 = cmjVar;
                i30 = i3;
            }
            cdkVarI = cavVar2.I();
            if (cdkVarI != null) {
                cdkVarI.c = new aonn() { // from class: hce
                    public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3) {
                        ((java.lang.Integer) obj3).intValue();
                        defpackage.gzh gzhVar2 = gzhVar;
                        cmw cmwVar6 = cmwVar3;
                        boolean z13 = z6;
                        boolean z14 = z7;
                        defpackage.hch hchVar4 = hchVar2;
                        float f5 = f3;
                        int i50 = i28;
                        int i51 = i29;
                        defpackage.hsj hsjVar18 = hsjVar2;
                        int i52 = i4;
                        cmj cmjVar4 = cmjVar2;
                        int i53 = i6;
                        int i54 = i5;
                        int i55 = i52 | 1;
                        int i56 = i53 & 306783378;
                        int i57 = i56 << 1;
                        int i58 = i54 & 306783378;
                        int i59 = i55 & 306783378;
                        int i60 = i59 << 1;
                        boolean z15 = z5;
                        int i61 = i53 & 613566756;
                        int i62 = i53 & (-920350135);
                        int i63 = i54 & 613566756;
                        int i64 = i55 & 613566756;
                        int i65 = i30;
                        defpackage.hgt.q(gzhVar2, cmwVar6, z13, z14, hchVar4, f5, i50, i51, hsjVar18, cmjVar4, cwyVar2, z15, i65, (cav) obj2, (i55 & (-920350135)) | i59 | (i64 >> 1) | (i60 & i64), (i54 & (-920350135)) | i58 | (i63 >> 1) | ((i58 << 1) & i63), i62 | i56 | (i61 >> 1) | (i57 & i61), i7);
                        return aojh.a;
                    }
                };
            }
        }
        i14 = 805306368;
        i8 |= i14;
        i15 = i7 & 1024;
        if (i15 != 0) {
            i16 = 0;
        } else {
            i16 = 1;
        }
        if (i15 != 0) {
            if ((i5 & 6) == 0) {
                if (i2 == 0) {
                    i19 = -1;
                    i2 = 0;
                } else {
                    i2 = 1;
                    i19 = 0;
                }
                if (true != cavVarB.z(i19)) {
                    i20 = 2;
                } else {
                    i20 = i9;
                }
                i21 = i20 | i5;
            } else {
                i16 = i16;
                i17 = i2;
                i18 = i5;
            }
            i22 = i17;
            if ((i7 & 2048) != 0) {
                i18 |= 48;
            } else if ((i5 & 48) == 0) {
                int i4111111118 = i18;
                if (true != cavVarB.C(false)) {
                    i23 = 16;
                } else {
                    i23 = 32;
                }
                i18 = i4111111118 | i23;
            }
            if ((i7 & 4096) != 0) {
                i18 |= 384;
            } else if ((i5 & 384) == 0) {
                i18 |= true == cavVarB.C(false) ? 256 : 128;
            }
            i24 = i7 & 8192;
            if (i24 != 0) {
                i18 |= 3072;
                i25 = i24;
            } else {
                i25 = i24;
                if ((i5 & 3072) == 0) {
                    if ((i5 & 4096) == 0) {
                        zD = cavVarB.B(hsjVar3);
                    } else {
                        zD = cavVarB.D(hsjVar3);
                    }
                    i18 |= true == zD ? 2048 : 1024;
                }
            }
            i26 = i6 | 6;
            i27 = i18 | 920346624;
            if ((i8 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (cavVarB.H(z4, i8 & 1)) {
                if (i38 != 0) {
                    cmwVar4 = cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                z8 = (!z11) | z;
                z9 = (!z12) | z2;
                if (i41 != 0) {
                    hchVar3 = null;
                }
                if (i42 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f2;
                }
                if (i11 != 0) {
                    i10 = 1;
                }
                i31 = (i16 ^ 1) | i22;
                if (i25 != 0) {
                    hsjVar3 = null;
                }
                i32 = i8 & 14;
                int i4111111119 = i8 >> 3;
                cmwVar5 = cmwVar4;
                i33 = i32 | (i4111111119 & 112) | (i4111111119 & 896) | ((i27 << 6) & 7168) | 32768;
                i34 = i8 & 57344;
                i35 = i8 & 458752;
                i36 = i8 & 3670016;
                cmjVar3 = cmh.e;
                cwyVar3 = cwx.b;
                if (i10 > 0) {
                    throw new java.lang.IllegalArgumentException("Iterations must be a positive number (0).");
                }
                if (java.lang.Math.abs(f4) <= Float.MAX_VALUE) {
                    throw new java.lang.IllegalArgumentException("Speed must be a finite number. It is " + f4 + '.');
                }
                cbtVar = (cbt) cavVarB;
                defpackage.hsj hsjVar18 = hsjVar3;
                objR = cbtVar.R();
                obj = cau.a;
                if (objR == obj) {
                    objR = new defpackage.hcb();
                    cbtVar.ab(objR);
                }
                hcbVar = (defpackage.hcb) objR;
                int i41111111110 = i8;
                objR2 = cbtVar.R();
                if (objR2 == obj) {
                    androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState15 = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.valueOf(z8), cdu.c);
                    cbtVar.ab(parcelableSnapshotMutableState15);
                    objR2 = parcelableSnapshotMutableState15;
                }
                int i41111111111 = i33 | i34 | i35 | i36;
                ccpVar = (ccp) objR2;
                cavVarB.u(-133180567);
                fB = f4 / defpackage.hgm.b((android.content.Context) cavVarB.e(dep.b));
                cbtVar.W(false);
                java.lang.Boolean boolValueOf15 = java.lang.Boolean.valueOf(z8);
                java.lang.Float fValueOf15 = java.lang.Float.valueOf(fB);
                java.lang.Integer numValueOf15 = java.lang.Integer.valueOf(i10);
                java.lang.Object[] objArr15 = new java.lang.Object[5];
                objArr15[0] = gzhVar;
                objArr15[1] = boolValueOf15;
                objArr15[2] = hchVar3;
                objArr15[3] = fValueOf15;
                objArr15[i9] = numValueOf15;
                zB = ((((i41111111111 & 112) ^ 48) <= 32 && cavVarB.C(z8)) || (i41111111111 & 48) == 32) | ((((i41111111111 & 896) ^ 384) <= 256 && cavVarB.C(z9)) || (i41111111111 & 384) == 256) | cavVarB.B(hcbVar) | cavVarB.D(gzhVar) | ((((3670016 & i41111111111) ^ 1572864) <= 1048576 && cavVarB.z(i10)) || (i41111111111 & 1572864) == 1048576) | ((((i41111111111 & 7168) ^ 3072) <= 2048 && cavVarB.C(false)) || (i41111111111 & 3072) == 2048) | cavVarB.y(fB) | ((((i41111111111 & 57344) ^ 24576) <= 16384 && cavVarB.D(hchVar3)) || (i41111111111 & 24576) == 16384) | cavVarB.z(0) | cavVarB.C(false);
                objR3 = cbtVar.R();
                if (zB) {
                    objR3 = new defpackage.hbv(z8, z9, hcbVar, gzhVar, i10, fB, hchVar3, ccpVar, null);
                    z10 = z9;
                    cbtVar.ab(objR3);
                } else {
                    objR3 = new defpackage.hbv(z8, z9, hcbVar, gzhVar, i10, fB, hchVar3, ccpVar, null);
                    z10 = z9;
                    cbtVar.ab(objR3);
                }
                cbp.h(objArr15, (aonn) objR3, cavVarB);
                zB2 = cavVarB.B(hcbVar);
                objR4 = cbtVar.R();
                if (zB2) {
                    objR4 = new defpackage.fxt(hcbVar, 16);
                    cbtVar.ab(objR4);
                } else {
                    objR4 = new defpackage.fxt(hcbVar, 16);
                    cbtVar.ab(objR4);
                }
                int i41111111112 = i41111111110 >> 12;
                int i41111111113 = i27 << 15;
                r(gzhVar, (aomy) objR4, cmwVar5, i31, hsjVar18, cmjVar3, cwyVar3, 1, cavVarB, i32 | ((i41111111110 << 3) & 896) | (i41111111112 & 7168) | (i41111111112 & 57344) | (i41111111112 & 458752) | ((i27 << 18) & 3670016) | (29360128 & i41111111113) | (234881024 & i41111111113) | (i41111111113 & 1879048192), ((i27 >> 15) & 8190) | ((i26 << 12) & 57344) | ((i27 >> 12) & 458752));
                cavVar2 = cavVarB;
                cwyVar2 = cwyVar3;
                hchVar2 = hchVar3;
                cmwVar3 = cmwVar5;
                f3 = f4;
                i28 = i10;
                z6 = z8;
                z7 = z10;
                z5 = true;
                i30 = 1;
                hsjVar2 = hsjVar18;
                i29 = i31;
                cmjVar2 = cmjVar3;
            } else {
                cavVar2 = cavVarB;
                cavVar2.s();
                cwyVar2 = cwyVar;
                z5 = z3;
                hchVar2 = hchVar3;
                hsjVar2 = hsjVar3;
                cmwVar3 = cmwVar2;
                i28 = i10;
                f3 = f2;
                z6 = z;
                z7 = z2;
                i29 = i22;
                cmjVar2 = cmjVar;
                i30 = i3;
            }
            cdkVarI = cavVar2.I();
            if (cdkVarI != null) {
                cdkVarI.c = new aonn() { // from class: hce
                    public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3) {
                        ((java.lang.Integer) obj3).intValue();
                        defpackage.gzh gzhVar2 = gzhVar;
                        cmw cmwVar6 = cmwVar3;
                        boolean z13 = z6;
                        boolean z14 = z7;
                        defpackage.hch hchVar4 = hchVar2;
                        float f5 = f3;
                        int i50 = i28;
                        int i51 = i29;
                        defpackage.hsj hsjVar19 = hsjVar2;
                        int i52 = i4;
                        cmj cmjVar4 = cmjVar2;
                        int i53 = i6;
                        int i54 = i5;
                        int i55 = i52 | 1;
                        int i56 = i53 & 306783378;
                        int i57 = i56 << 1;
                        int i58 = i54 & 306783378;
                        int i59 = i55 & 306783378;
                        int i60 = i59 << 1;
                        boolean z15 = z5;
                        int i61 = i53 & 613566756;
                        int i62 = i53 & (-920350135);
                        int i63 = i54 & 613566756;
                        int i64 = i55 & 613566756;
                        int i65 = i30;
                        defpackage.hgt.q(gzhVar2, cmwVar6, z13, z14, hchVar4, f5, i50, i51, hsjVar19, cmjVar4, cwyVar2, z15, i65, (cav) obj2, (i55 & (-920350135)) | i59 | (i64 >> 1) | (i60 & i64), (i54 & (-920350135)) | i58 | (i63 >> 1) | ((i58 << 1) & i63), i62 | i56 | (i61 >> 1) | (i57 & i61), i7);
                        return aojh.a;
                    }
                };
            }
        }
        i21 = i5 | 6;
        i18 = i21;
        i17 = i2;
        i22 = i17;
        if ((i7 & 2048) != 0) {
            i18 |= 48;
        } else if ((i5 & 48) == 0) {
            int i41111111114 = i18;
            if (true != cavVarB.C(false)) {
                i23 = 16;
            } else {
                i23 = 32;
            }
            i18 = i41111111114 | i23;
        }
        if ((i7 & 4096) != 0) {
            i18 |= 384;
        } else if ((i5 & 384) == 0) {
            i18 |= true == cavVarB.C(false) ? 256 : 128;
        }
        i24 = i7 & 8192;
        if (i24 != 0) {
            i18 |= 3072;
            i25 = i24;
        } else {
            i25 = i24;
            if ((i5 & 3072) == 0) {
                if ((i5 & 4096) == 0) {
                    zD = cavVarB.B(hsjVar3);
                } else {
                    zD = cavVarB.D(hsjVar3);
                }
                i18 |= true == zD ? 2048 : 1024;
            }
        }
        i26 = i6 | 6;
        i27 = i18 | 920346624;
        if ((i8 & 306783379) != 306783378) {
            z4 = true;
        } else {
            z4 = true;
        }
        if (cavVarB.H(z4, i8 & 1)) {
            if (i38 != 0) {
                cmwVar4 = cmw.c;
            } else {
                cmwVar4 = cmwVar2;
            }
            z8 = (!z11) | z;
            z9 = (!z12) | z2;
            if (i41 != 0) {
                hchVar3 = null;
            }
            if (i42 != 0) {
                f4 = 1.0f;
            } else {
                f4 = f2;
            }
            if (i11 != 0) {
                i10 = 1;
            }
            i31 = (i16 ^ 1) | i22;
            if (i25 != 0) {
                hsjVar3 = null;
            }
            i32 = i8 & 14;
            int i41111111115 = i8 >> 3;
            cmwVar5 = cmwVar4;
            i33 = i32 | (i41111111115 & 112) | (i41111111115 & 896) | ((i27 << 6) & 7168) | 32768;
            i34 = i8 & 57344;
            i35 = i8 & 458752;
            i36 = i8 & 3670016;
            cmjVar3 = cmh.e;
            cwyVar3 = cwx.b;
            if (i10 > 0) {
                throw new java.lang.IllegalArgumentException("Iterations must be a positive number (0).");
            }
            if (java.lang.Math.abs(f4) <= Float.MAX_VALUE) {
                throw new java.lang.IllegalArgumentException("Speed must be a finite number. It is " + f4 + '.');
            }
            cbtVar = (cbt) cavVarB;
            defpackage.hsj hsjVar19 = hsjVar3;
            objR = cbtVar.R();
            obj = cau.a;
            if (objR == obj) {
                objR = new defpackage.hcb();
                cbtVar.ab(objR);
            }
            hcbVar = (defpackage.hcb) objR;
            int i41111111116 = i8;
            objR2 = cbtVar.R();
            if (objR2 == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState16 = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.valueOf(z8), cdu.c);
                cbtVar.ab(parcelableSnapshotMutableState16);
                objR2 = parcelableSnapshotMutableState16;
            }
            int i41111111117 = i33 | i34 | i35 | i36;
            ccpVar = (ccp) objR2;
            cavVarB.u(-133180567);
            fB = f4 / defpackage.hgm.b((android.content.Context) cavVarB.e(dep.b));
            cbtVar.W(false);
            java.lang.Boolean boolValueOf16 = java.lang.Boolean.valueOf(z8);
            java.lang.Float fValueOf16 = java.lang.Float.valueOf(fB);
            java.lang.Integer numValueOf16 = java.lang.Integer.valueOf(i10);
            java.lang.Object[] objArr16 = new java.lang.Object[5];
            objArr16[0] = gzhVar;
            objArr16[1] = boolValueOf16;
            objArr16[2] = hchVar3;
            objArr16[3] = fValueOf16;
            objArr16[i9] = numValueOf16;
            zB = ((((i41111111117 & 112) ^ 48) <= 32 && cavVarB.C(z8)) || (i41111111117 & 48) == 32) | ((((i41111111117 & 896) ^ 384) <= 256 && cavVarB.C(z9)) || (i41111111117 & 384) == 256) | cavVarB.B(hcbVar) | cavVarB.D(gzhVar) | ((((3670016 & i41111111117) ^ 1572864) <= 1048576 && cavVarB.z(i10)) || (i41111111117 & 1572864) == 1048576) | ((((i41111111117 & 7168) ^ 3072) <= 2048 && cavVarB.C(false)) || (i41111111117 & 3072) == 2048) | cavVarB.y(fB) | ((((i41111111117 & 57344) ^ 24576) <= 16384 && cavVarB.D(hchVar3)) || (i41111111117 & 24576) == 16384) | cavVarB.z(0) | cavVarB.C(false);
            objR3 = cbtVar.R();
            if (zB) {
                objR3 = new defpackage.hbv(z8, z9, hcbVar, gzhVar, i10, fB, hchVar3, ccpVar, null);
                z10 = z9;
                cbtVar.ab(objR3);
            } else {
                objR3 = new defpackage.hbv(z8, z9, hcbVar, gzhVar, i10, fB, hchVar3, ccpVar, null);
                z10 = z9;
                cbtVar.ab(objR3);
            }
            cbp.h(objArr16, (aonn) objR3, cavVarB);
            zB2 = cavVarB.B(hcbVar);
            objR4 = cbtVar.R();
            if (zB2) {
                objR4 = new defpackage.fxt(hcbVar, 16);
                cbtVar.ab(objR4);
            } else {
                objR4 = new defpackage.fxt(hcbVar, 16);
                cbtVar.ab(objR4);
            }
            int i41111111118 = i41111111116 >> 12;
            int i41111111119 = i27 << 15;
            r(gzhVar, (aomy) objR4, cmwVar5, i31, hsjVar19, cmjVar3, cwyVar3, 1, cavVarB, i32 | ((i41111111116 << 3) & 896) | (i41111111118 & 7168) | (i41111111118 & 57344) | (i41111111118 & 458752) | ((i27 << 18) & 3670016) | (29360128 & i41111111119) | (234881024 & i41111111119) | (i41111111119 & 1879048192), ((i27 >> 15) & 8190) | ((i26 << 12) & 57344) | ((i27 >> 12) & 458752));
            cavVar2 = cavVarB;
            cwyVar2 = cwyVar3;
            hchVar2 = hchVar3;
            cmwVar3 = cmwVar5;
            f3 = f4;
            i28 = i10;
            z6 = z8;
            z7 = z10;
            z5 = true;
            i30 = 1;
            hsjVar2 = hsjVar19;
            i29 = i31;
            cmjVar2 = cmjVar3;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            cwyVar2 = cwyVar;
            z5 = z3;
            hchVar2 = hchVar3;
            hsjVar2 = hsjVar3;
            cmwVar3 = cmwVar2;
            i28 = i10;
            f3 = f2;
            z6 = z;
            z7 = z2;
            i29 = i22;
            cmjVar2 = cmjVar;
            i30 = i3;
        }
        cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new aonn() { // from class: hce
                public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3) {
                    ((java.lang.Integer) obj3).intValue();
                    defpackage.gzh gzhVar2 = gzhVar;
                    cmw cmwVar6 = cmwVar3;
                    boolean z13 = z6;
                    boolean z14 = z7;
                    defpackage.hch hchVar4 = hchVar2;
                    float f5 = f3;
                    int i50 = i28;
                    int i51 = i29;
                    defpackage.hsj hsjVar110 = hsjVar2;
                    int i52 = i4;
                    cmj cmjVar4 = cmjVar2;
                    int i53 = i6;
                    int i54 = i5;
                    int i55 = i52 | 1;
                    int i56 = i53 & 306783378;
                    int i57 = i56 << 1;
                    int i58 = i54 & 306783378;
                    int i59 = i55 & 306783378;
                    int i60 = i59 << 1;
                    boolean z15 = z5;
                    int i61 = i53 & 613566756;
                    int i62 = i53 & (-920350135);
                    int i63 = i54 & 613566756;
                    int i64 = i55 & 613566756;
                    int i65 = i30;
                    defpackage.hgt.q(gzhVar2, cmwVar6, z13, z14, hchVar4, f5, i50, i51, hsjVar110, cmjVar4, cwyVar2, z15, i65, (cav) obj2, (i55 & (-920350135)) | i59 | (i64 >> 1) | (i60 & i64), (i54 & (-920350135)) | i58 | (i63 >> 1) | ((i58 << 1) & i63), i62 | i56 | (i61 >> 1) | (i57 & i61), i7);
                    return aojh.a;
                }
            };
        }
    }

    public static void r(final defpackage.gzh gzhVar, final aomy aomyVar, final cmw cmwVar, int i, final defpackage.hsj hsjVar, final cmj cmjVar, final defpackage.cwy cwyVar, int i2, cav cavVar, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        final int i9;
        final int i10;
        cdk cdkVarI;
        aonn aonnVar;
        int i11;
        int i12;
        int i13;
        int i14;
        aooh.f(aomyVar, "progress");
        cbt cbtVarB = cavVar.b(-674272918);
        if ((i3 & 6) == 0) {
            i5 = (true != cbtVarB.D(gzhVar) ? 2 : 4) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= true != cbtVarB.D(aomyVar) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i5 |= true != cbtVarB.B(cmwVar) ? 128 : 256;
        }
        if ((i3 & 3072) == 0) {
            i5 |= true != cbtVarB.C(false) ? 1024 : 2048;
        }
        if ((i3 & 24576) == 0) {
            i5 |= true != cbtVarB.C(false) ? 8192 : 16384;
        }
        if ((i3 & 196608) == 0) {
            i5 |= true != cbtVarB.C(false) ? 65536 : 131072;
        }
        if ((1572864 & i3) == 0) {
            if (i == 0) {
                i6 = 0;
                i14 = -1;
            } else {
                i6 = 1;
                i14 = 0;
            }
            i5 |= true != cbtVarB.z(i14) ? 524288 : 1048576;
        } else {
            i6 = i;
        }
        if ((12582912 & i3) == 0) {
            i5 |= true != cbtVarB.C(false) ? 4194304 : 8388608;
        }
        if ((100663296 & i3) == 0) {
            i5 |= true != ((134217728 & i3) == 0 ? cbtVarB.B(hsjVar) : cbtVarB.D(hsjVar)) ? 33554432 : 67108864;
        }
        if ((805306368 & i3) == 0) {
            i5 |= true != cbtVarB.B(cmjVar) ? 268435456 : 536870912;
        }
        if ((i4 & 6) == 0) {
            i7 = (true != cbtVarB.B(cwyVar) ? 2 : 4) | i4;
        } else {
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            i7 |= true != cbtVarB.C(true) ? 16 : 32;
        }
        if ((i4 & 384) == 0) {
            i7 |= true != cbtVarB.C(false) ? 128 : 256;
        }
        if ((i4 & 3072) == 0) {
            i7 |= true == ((i4 & 4096) == 0 ? cbtVarB.B((java.lang.Object) null) : cbtVarB.D((java.lang.Object) null)) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            if (i2 == 0) {
                i12 = 0;
                i13 = -1;
            } else {
                i12 = 1;
                i13 = 0;
            }
            i8 = i7 | (true == cbtVarB.z(i13) ? 16384 : 8192);
            i9 = i12;
        } else {
            i8 = i7;
            i9 = i2;
        }
        if ((i4 & 196608) == 0) {
            i8 |= true == cbtVarB.C(false) ? 131072 : 65536;
        }
        if (cbtVarB.H(((306783379 & i5) == 306783378 && (74899 & i8) == 74898) ? false : true, i5 & 1)) {
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = cau.a;
            if (objR == obj) {
                objR = new defpackage.gzs();
                cbtVar.ab(objR);
            }
            final defpackage.gzs gzsVar = (defpackage.gzs) objR;
            java.lang.Object objR2 = cbtVar.R();
            if (objR2 == obj) {
                objR2 = new android.graphics.Matrix();
                cbtVar.ab(objR2);
            }
            final android.graphics.Matrix matrix = (android.graphics.Matrix) objR2;
            boolean zB = cbtVarB.B(gzhVar);
            java.lang.Object objR3 = cbtVar.R();
            if (zB || objR3 == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState((java.lang.Object) null, cdu.c);
                cbtVar.ab(parcelableSnapshotMutableState);
                objR3 = parcelableSnapshotMutableState;
            }
            final ccp ccpVar = (ccp) objR3;
            if (gzhVar == null || gzhVar.a() == 0.0f) {
                final int i15 = i9;
                final int i16 = i6;
                cbtVarB.u(298513060);
                awo.c(cmwVar, cbtVarB, (i5 >> 6) & 14);
                cbtVar.W(false);
                cdkVarI = cbtVarB.I();
                if (cdkVarI == null) {
                    return;
                }
                final int i17 = 1;
                aonnVar = new aonn() { // from class: hcd
                    public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3) {
                        if (i17 != 0) {
                            ((java.lang.Integer) obj3).intValue();
                            int i18 = i3;
                            int i19 = i4;
                            int i20 = i15;
                            defpackage.cwy cwyVar2 = cwyVar;
                            cmj cmjVar2 = cmjVar;
                            defpackage.hsj hsjVar2 = hsjVar;
                            int i21 = i16;
                            cmw cmwVar2 = cmwVar;
                            aomy aomyVar2 = aomyVar;
                            int i22 = i18 | 1;
                            int i23 = i19 & 306783378;
                            int i24 = 306783378 & i22;
                            int i25 = i24 << 1;
                            int i26 = i19 & 613566756;
                            int i27 = 613566756 & i22;
                            int i28 = (i19 & (-920350135)) | i23 | (i26 >> 1);
                            defpackage.hgt.r(gzhVar, aomyVar2, cmwVar2, i21, hsjVar2, cmjVar2, cwyVar2, i20, (cav) obj2, (i22 & (-920350135)) | i24 | (i27 >> 1) | (i25 & i27), ((i23 << 1) & i26) | i28);
                            return aojh.a;
                        }
                        ((java.lang.Integer) obj3).intValue();
                        int i29 = i3;
                        int i30 = i4;
                        int i31 = i15;
                        defpackage.cwy cwyVar3 = cwyVar;
                        cmj cmjVar3 = cmjVar;
                        defpackage.hsj hsjVar3 = hsjVar;
                        int i32 = i16;
                        cmw cmwVar3 = cmwVar;
                        aomy aomyVar3 = aomyVar;
                        int i33 = i29 | 1;
                        int i34 = i30 & 306783378;
                        int i35 = 306783378 & i33;
                        int i36 = i35 << 1;
                        int i37 = i30 & 613566756;
                        int i38 = 613566756 & i33;
                        int i39 = (i30 & (-920350135)) | i34 | (i37 >> 1);
                        defpackage.hgt.r(gzhVar, aomyVar3, cmwVar3, i32, hsjVar3, cmjVar3, cwyVar3, i31, (cav) obj2, (i33 & (-920350135)) | i35 | (i38 >> 1) | (i36 & i38), ((i34 << 1) & i37) | i39);
                        return aojh.a;
                    }
                };
            } else {
                cbtVarB.u(298532280);
                cbtVar.W(false);
                final android.graphics.Rect rect = gzhVar.i;
                int iWidth = rect.width();
                int iHeight = rect.height();
                final int i18 = i6;
                aooh.f(cmwVar, "<this>");
                cmw cmwVarA = cmwVar.a(new defpackage.hcf(iWidth, iHeight));
                boolean zD = cbtVarB.D(rect) | ((i8 & 14) == 4) | ((1879048192 & i5) == 536870912) | cbtVarB.D(matrix) | cbtVarB.D(gzsVar);
                boolean z = (458752 & i5) == 131072;
                boolean zD2 = zD | z | ((i8 & 458752) == 131072) | ((3670016 & i5) == 1048576) | ((57344 & i8) == 16384) | cbtVarB.D(gzhVar) | ((i8 & 7168) == 2048 || ((i8 & 4096) != 0 && cbtVarB.D((java.lang.Object) null))) | ((234881024 & i5) == 67108864 || ((134217728 & i5) != 0 && cbtVarB.D(hsjVar))) | cbtVarB.B(ccpVar);
                boolean z2 = (i5 & 7168) == 2048;
                boolean z3 = (57344 & i5) == 16384;
                int i19 = i5;
                boolean z4 = (29360128 & i5) == 8388608;
                boolean z5 = (i8 & 112) == 32;
                boolean z6 = (i8 & 896) == 256;
                boolean z7 = (i19 & 112) == 32;
                java.lang.Object objR4 = cbtVar.R();
                if (((zD2 | z2 | z3 | z4 | z5 | z6) || z7) || objR4 == obj) {
                    i11 = 0;
                    final int i20 = i9;
                    objR4 = new aonj() { // from class: hcc
                        /* JADX WARN: Type inference failed for: r10v24, types: [java.lang.Iterable, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r10v26, types: [java.lang.Iterable, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r10v28, types: [java.lang.Iterable, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r10v30, types: [java.lang.Iterable, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r10v32, types: [java.lang.Iterable, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r10v34, types: [java.lang.Iterable, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r10v36, types: [java.lang.Iterable, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r10v38, types: [java.lang.Iterable, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r10v40, types: [java.lang.Iterable, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Iterable, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Iterable, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Iterable, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Iterable, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r8v19, types: [java.lang.Iterable, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r8v21, types: [java.lang.Iterable, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r8v23, types: [java.lang.Iterable, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r8v25, types: [java.lang.Iterable, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r8v27, types: [java.lang.Iterable, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r8v29, types: [java.lang.Iterable, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Iterable, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r9v16, types: [aonj, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r9v19, types: [aonj, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r9v22, types: [aonj, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r9v25, types: [aonj, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r9v28, types: [aonj, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r9v31, types: [aonj, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r9v34, types: [aonj, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r9v37, types: [aonj, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r9v40, types: [aonj, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r9v43, types: [aonj, java.lang.Object] */
                        public final java.lang.Object a(java.lang.Object obj2) {
                            csj csjVar = (csj) obj2;
                            aooh.f(csjVar, "$this$Canvas");
                            cqf cqfVarB = csjVar.q().b();
                            android.graphics.Rect rect2 = rect;
                            float fWidth = rect2.width();
                            float fHeight = rect2.height();
                            long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(fWidth);
                            long jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(fHeight);
                            int i21 = aopc.i(java.lang.Float.intBitsToFloat((int) (csjVar.o() >> 32)));
                            int i22 = aopc.i(java.lang.Float.intBitsToFloat((int) (csjVar.o() & 4294967295L)));
                            long j = (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L);
                            long jA = cwyVar.a(j, csjVar.o());
                            int i23 = (int) (jA >> 32);
                            float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) * java.lang.Float.intBitsToFloat(i23);
                            int i24 = (int) (jA & 4294967295L);
                            float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) * java.lang.Float.intBitsToFloat(i24);
                            long jA2 = cmjVar.a((((long) ((int) fIntBitsToFloat)) << 32) | (((long) ((int) fIntBitsToFloat2)) & 4294967295L), (((long) i21) << 32) | (((long) i22) & 4294967295L), csjVar.p());
                            android.graphics.Matrix matrix2 = matrix;
                            matrix2.reset();
                            matrix2.preTranslate(dpn.a(jA2), dpn.b(jA2));
                            matrix2.preScale(java.lang.Float.intBitsToFloat(i23), java.lang.Float.intBitsToFloat(i24));
                            defpackage.gzs gzsVar2 = gzsVar;
                            gzsVar2.i(false);
                            gzsVar2.y(i18);
                            gzsVar2.r = i20;
                            gzsVar2.w(gzhVar);
                            ccp ccpVar2 = ccpVar;
                            defpackage.hsj hsjVar2 = hsjVar;
                            if (hsjVar2 != defpackage.hgt.p(ccpVar2)) {
                                defpackage.hsj hsjVarP = defpackage.hgt.p(ccpVar2);
                                if (hsjVarP != null) {
                                    aooh.f(gzsVar2, "drawable");
                                    for (izg izgVar : hsjVarP.i) {
                                        gzsVar2.g((defpackage.hcw) izgVar.b, izgVar.c, null);
                                    }
                                    for (izg izgVar2 : hsjVarP.g) {
                                        gzsVar2.g((defpackage.hcw) izgVar2.b, izgVar2.c, null);
                                    }
                                    for (izg izgVar3 : hsjVarP.f) {
                                        gzsVar2.g((defpackage.hcw) izgVar3.b, izgVar3.c, null);
                                    }
                                    for (izg izgVar4 : hsjVarP.b) {
                                        gzsVar2.g((defpackage.hcw) izgVar4.b, izgVar4.c, null);
                                    }
                                    for (izg izgVar5 : hsjVarP.e) {
                                        gzsVar2.g((defpackage.hcw) izgVar5.b, izgVar5.c, null);
                                    }
                                    for (izg izgVar6 : hsjVarP.j) {
                                        gzsVar2.g((defpackage.hcw) izgVar6.b, izgVar6.c, null);
                                    }
                                    for (izg izgVar7 : hsjVarP.d) {
                                        gzsVar2.g((defpackage.hcw) izgVar7.b, izgVar7.c, null);
                                    }
                                    for (izg izgVar8 : hsjVarP.a) {
                                        gzsVar2.g((defpackage.hcw) izgVar8.b, izgVar8.c, null);
                                    }
                                    for (izg izgVar9 : hsjVarP.c) {
                                        gzsVar2.g((defpackage.hcw) izgVar9.b, izgVar9.c, null);
                                    }
                                    for (izg izgVar10 : hsjVarP.h) {
                                        gzsVar2.g((defpackage.hcw) izgVar10.b, izgVar10.c, null);
                                    }
                                }
                                if (hsjVar2 != null) {
                                    aooh.f(gzsVar2, "drawable");
                                    for (izg izgVar11 : hsjVar2.i) {
                                        gzsVar2.g((defpackage.hcw) izgVar11.b, izgVar11.c, new defpackage.hck(izgVar11.a));
                                    }
                                    for (izg izgVar12 : hsjVar2.g) {
                                        gzsVar2.g((defpackage.hcw) izgVar12.b, izgVar12.c, new defpackage.hck(izgVar12.a));
                                    }
                                    for (izg izgVar13 : hsjVar2.f) {
                                        gzsVar2.g((defpackage.hcw) izgVar13.b, izgVar13.c, new defpackage.hck(izgVar13.a));
                                    }
                                    for (izg izgVar14 : hsjVar2.b) {
                                        gzsVar2.g((defpackage.hcw) izgVar14.b, izgVar14.c, new defpackage.hck(izgVar14.a));
                                    }
                                    for (izg izgVar15 : hsjVar2.e) {
                                        gzsVar2.g((defpackage.hcw) izgVar15.b, izgVar15.c, new defpackage.hck(izgVar15.a));
                                    }
                                    for (izg izgVar16 : hsjVar2.j) {
                                        gzsVar2.g((defpackage.hcw) izgVar16.b, izgVar16.c, new defpackage.hck(izgVar16.a));
                                    }
                                    for (izg izgVar17 : hsjVar2.d) {
                                        gzsVar2.g((defpackage.hcw) izgVar17.b, izgVar17.c, new defpackage.hck(izgVar17.a));
                                    }
                                    for (izg izgVar18 : hsjVar2.a) {
                                        gzsVar2.g((defpackage.hcw) izgVar18.b, izgVar18.c, new defpackage.hck(izgVar18.a));
                                    }
                                    for (izg izgVar19 : hsjVar2.c) {
                                        gzsVar2.g((defpackage.hcw) izgVar19.b, izgVar19.c, new defpackage.hck(izgVar19.a));
                                    }
                                    for (izg izgVar20 : hsjVar2.h) {
                                        gzsVar2.g((defpackage.hcw) izgVar20.b, izgVar20.c, new defpackage.hck(izgVar20.a));
                                    }
                                }
                                ccpVar2.b(hsjVar2);
                            }
                            aomy aomyVar2 = aomyVar;
                            gzsVar2.o(true);
                            gzsVar2.n(false);
                            gzsVar2.r(((java.lang.Number) aomyVar2.a()).floatValue());
                            gzsVar2.setBounds(0, 0, rect2.width(), rect2.height());
                            android.graphics.Canvas canvasA = cpr.a(cqfVarB);
                            defpackage.heg hegVar = gzsVar2.j;
                            defpackage.gzh gzhVar2 = gzsVar2.b;
                            if (hegVar != null && gzhVar2 != null) {
                                boolean zU = gzsVar2.u();
                                if (zU) {
                                    try {
                                        gzsVar2.o.acquire();
                                        if (gzsVar2.x()) {
                                            gzsVar2.r(gzsVar2.c.c());
                                        }
                                    } catch (java.lang.InterruptedException unused) {
                                        if (zU) {
                                            gzsVar2.o.release();
                                            if (hegVar.j != gzsVar2.c.c()) {
                                            }
                                        }
                                        return aojh.a;
                                    } catch (java.lang.Throwable th) {
                                        if (zU) {
                                            gzsVar2.o.release();
                                            if (hegVar.j != gzsVar2.c.c()) {
                                                defpackage.gzs.a.execute(gzsVar2.p);
                                            }
                                        }
                                        throw th;
                                    }
                                }
                                if (gzsVar2.m) {
                                    canvasA.save();
                                    canvasA.concat(matrix2);
                                    gzsVar2.l(canvasA, hegVar);
                                    canvasA.restore();
                                } else {
                                    hegVar.b(canvasA, matrix2, gzsVar2.k);
                                }
                                gzsVar2.n = false;
                                if (zU) {
                                    gzsVar2.o.release();
                                    if (hegVar.j != gzsVar2.c.c()) {
                                        defpackage.gzs.a.execute(gzsVar2.p);
                                    }
                                }
                            }
                            return aojh.a;
                        }
                    };
                    i10 = i18;
                    i9 = i20;
                    cbtVar.ab(objR4);
                } else {
                    i9 = i9;
                    i10 = i18;
                    i11 = 0;
                }
                defpackage.yt.a(cmwVarA, (aonj) objR4, cbtVarB, i11);
            }
            cdkVarI.c = aonnVar;
        }
        i10 = i6;
        cbtVarB.s();
        cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            final int i21 = 0;
            aonnVar = new aonn() { // from class: hcd
                public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3) {
                    if (i21 != 0) {
                        ((java.lang.Integer) obj3).intValue();
                        int i110 = i3;
                        int i111 = i4;
                        int i22 = i9;
                        defpackage.cwy cwyVar2 = cwyVar;
                        cmj cmjVar2 = cmjVar;
                        defpackage.hsj hsjVar2 = hsjVar;
                        int i23 = i10;
                        cmw cmwVar2 = cmwVar;
                        aomy aomyVar2 = aomyVar;
                        int i24 = i110 | 1;
                        int i25 = i111 & 306783378;
                        int i26 = 306783378 & i24;
                        int i27 = i26 << 1;
                        int i28 = i111 & 613566756;
                        int i29 = 613566756 & i24;
                        int i210 = (i111 & (-920350135)) | i25 | (i28 >> 1);
                        defpackage.hgt.r(gzhVar, aomyVar2, cmwVar2, i23, hsjVar2, cmjVar2, cwyVar2, i22, (cav) obj2, (i24 & (-920350135)) | i26 | (i29 >> 1) | (i27 & i29), ((i25 << 1) & i28) | i210);
                        return aojh.a;
                    }
                    ((java.lang.Integer) obj3).intValue();
                    int i211 = i3;
                    int i30 = i4;
                    int i31 = i9;
                    defpackage.cwy cwyVar3 = cwyVar;
                    cmj cmjVar3 = cmjVar;
                    defpackage.hsj hsjVar3 = hsjVar;
                    int i32 = i10;
                    cmw cmwVar3 = cmwVar;
                    aomy aomyVar3 = aomyVar;
                    int i33 = i211 | 1;
                    int i34 = i30 & 306783378;
                    int i35 = 306783378 & i33;
                    int i36 = i35 << 1;
                    int i37 = i30 & 613566756;
                    int i38 = 613566756 & i33;
                    int i39 = (i30 & (-920350135)) | i34 | (i37 >> 1);
                    defpackage.hgt.r(gzhVar, aomyVar3, cmwVar3, i32, hsjVar3, cmjVar3, cwyVar3, i31, (cav) obj2, (i33 & (-920350135)) | i35 | (i38 >> 1) | (i36 & i38), ((i34 << 1) & i37) | i39);
                    return aojh.a;
                }
            };
            cdkVarI.c = aonnVar;
        }
    }

    public static boolean s(defpackage.kdy kdyVar, java.lang.CharSequence charSequence) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4 = kdyVar.C;
        if (str4 != null && str4.length() != 0) {
            return false;
        }
        defpackage.hkd hkdVarB = kdyVar.b();
        return !(hkdVarB == null || (str3 = hkdVarB.c) == null || !aoov.G(str3, charSequence, false)) || ((str = kdyVar.e) != null && aoov.G(str, charSequence, false)) || ((str2 = kdyVar.d) != null && aoov.G(str2, charSequence, false));
    }

    public static boolean t(defpackage.kir kirVar) {
        java.lang.String str = kirVar.c;
        aooh.e(str, "getTranscriptSnippet(...)");
        if (str.length() <= 0) {
            java.lang.String str2 = kirVar.e;
            aooh.e(str2, "getEmptySnippetDescription(...)");
            if (str2.length() <= 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean u(mmy mmyVar) {
        java.lang.String str = mmyVar.c;
        aooh.e(str, "getTranscriptSnippet(...)");
        if (str.length() <= 0) {
            java.lang.String str2 = mmyVar.d;
            aooh.e(str2, "getFallbackSnippet(...)");
            if (str2.length() <= 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean v(kiu kiuVar) {
        aooh.f(kiuVar, "<this>");
        return (kiuVar.o & 1) == 1;
    }

    public static java.lang.Object w(kiu kiuVar, kel kelVar) {
        aooh.f(kiuVar, "<this>");
        aooh.f(kelVar, "integration");
        akzc akzcVar = (akzc) j$.util.DesugarCollections.unmodifiableMap(kiuVar.L).get(((ken) kelVar.a()).k);
        if (akzcVar == null) {
            return null;
        }
        aooh.f(kelVar, "<this>");
        return kelVar.d().a(akzcVar);
    }

    public static boolean x(java.lang.Object obj) {
        aooh.f(obj, "data1");
        return ker.b(obj).c() <= 10;
    }

    public static defpackage.ked y(byte[] bArr) {
        return bArr == null ? defpackage.ked.a : new defpackage.ked(bArr);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00de  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ed  */
    public static defpackage.kdy z(android.content.ContentValues contentValues) {
        long j;
        boolean z;
        defpackage.ked kedVar;
        java.lang.Integer asInteger;
        int iIntValue;
        java.lang.Long asLong;
        long jLongValue;
        java.lang.Long asLong2;
        long jLongValue2;
        aooh.f(contentValues, "<this>");
        java.lang.Long asLong3 = contentValues.getAsLong("_id");
        if (asLong3 == null) {
            throw new java.lang.IllegalArgumentException("ID not set");
        }
        long jLongValue3 = asLong3.longValue();
        java.lang.Long asLong4 = contentValues.getAsLong("timestamp");
        long jLongValue4 = asLong4 != null ? asLong4.longValue() : 0L;
        defpackage.ked kedVarAL = aL(contentValues, "number");
        java.lang.String asString = contentValues.getAsString("raw_number");
        java.lang.String asString2 = contentValues.getAsString("formatted_number");
        java.lang.Integer asInteger2 = contentValues.getAsInteger("presentation");
        int iIntValue2 = asInteger2 != null ? asInteger2.intValue() : 0;
        java.lang.Integer asInteger3 = contentValues.getAsInteger("is_read");
        boolean z2 = asInteger3 != null && asInteger3.intValue() == 1;
        java.lang.Integer asInteger4 = contentValues.getAsInteger("new");
        if (asInteger4 == null || asInteger4.intValue() != 1) {
            j = jLongValue4;
            z = false;
        } else {
            j = jLongValue4;
            z = true;
        }
        java.lang.String asString3 = contentValues.getAsString("geocoded_location");
        java.lang.String asString4 = contentValues.getAsString("phone_account_component_name");
        java.lang.String asString5 = contentValues.getAsString("phone_account_id");
        java.lang.Integer asInteger5 = contentValues.getAsInteger("features");
        int iIntValue3 = asInteger5 != null ? asInteger5.intValue() : 0;
        defpackage.ked kedVarAL2 = aL(contentValues, "number_attributes");
        java.lang.Integer asInteger6 = contentValues.getAsInteger("is_voicemail_call");
        if (asInteger6 != null) {
            kedVar = kedVarAL2;
            boolean z3 = asInteger6.intValue() == 1;
            java.lang.String asString6 = contentValues.getAsString("voicemail_call_tag");
            asInteger = contentValues.getAsInteger("call_type");
            if (asInteger != null) {
                iIntValue = asInteger.intValue();
            } else {
                iIntValue = 0;
            }
            asLong = contentValues.getAsLong("data_usage");
            if (asLong != null) {
                jLongValue = asLong.longValue();
            } else {
                jLongValue = 0;
            }
            asLong2 = contentValues.getAsLong("duration");
            if (asLong2 != null) {
                jLongValue2 = asLong2.longValue();
            } else {
                jLongValue2 = 0;
            }
            return new defpackage.kdy(jLongValue3, j, kedVarAL, asString, asString2, iIntValue2, z2, z, asString3, asString4, asString5, iIntValue3, kedVar, z3, asString6, iIntValue, jLongValue, jLongValue2, contentValues.getAsString("call_mapping_id"), aL(contentValues, "spam_status"), aL(contentValues, "atlas_call_details"), aL(contentValues, "call_screen_details"), aL(contentValues, "call_recording_details"), aL(contentValues, "fides_details"), aL(contentValues, "calling_networks_attributes"), aL(contentValues, "xatu_call_details"), aL(contentValues, "dobby_calllog_details"), contentValues.getAsString("uuid"), contentValues.getAsString("name"), contentValues.getAsString("lookup_uri"));
        }
        kedVar = kedVarAL2;
        java.lang.String asString7 = contentValues.getAsString("voicemail_call_tag");
        asInteger = contentValues.getAsInteger("call_type");
        if (asInteger != null) {
            iIntValue = asInteger.intValue();
        } else {
            iIntValue = 0;
        }
        asLong = contentValues.getAsLong("data_usage");
        if (asLong != null) {
            jLongValue = asLong.longValue();
        } else {
            jLongValue = 0;
        }
        asLong2 = contentValues.getAsLong("duration");
        if (asLong2 != null) {
            jLongValue2 = asLong2.longValue();
        } else {
            jLongValue2 = 0;
        }
        return new defpackage.kdy(jLongValue3, j, kedVarAL, asString, asString2, iIntValue2, z2, z, asString3, asString4, asString5, iIntValue3, kedVar, z3, asString7, iIntValue, jLongValue, jLongValue2, contentValues.getAsString("call_mapping_id"), aL(contentValues, "spam_status"), aL(contentValues, "atlas_call_details"), aL(contentValues, "call_screen_details"), aL(contentValues, "call_recording_details"), aL(contentValues, "fides_details"), aL(contentValues, "calling_networks_attributes"), aL(contentValues, "xatu_call_details"), aL(contentValues, "dobby_calllog_details"), contentValues.getAsString("uuid"), contentValues.getAsString("name"), contentValues.getAsString("lookup_uri"));
    }

    public hgt(java.lang.String str) {
        aooh.f(str, "messageText");
    }

    public hgt(java.lang.String str, byte[] bArr) {
        aooh.f(str, "messageText");
    }

    public hgt(java.lang.String str, char[] cArr) {
        aooh.f(str, "messageText");
    }

    public hgt(char[] cArr) {
    }

    public hgt(defpackage.hjx hjxVar) {
        ((aift) hjxVar.b).h();
    }

    public hgt() {
    }
}
