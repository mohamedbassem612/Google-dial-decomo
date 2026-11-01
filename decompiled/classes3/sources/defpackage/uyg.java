package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uyg {
    public final java.lang.Object a;
    public final java.lang.Object b;

    public uyg() {
        this.a = new defpackage.yfy(1000L);
        this.b = defpackage.ygj.a(10, new defpackage.xyh(this, 0));
    }

    @java.lang.Deprecated
    public static defpackage.uyg I(java.util.concurrent.Callable callable) {
        return new defpackage.uyg((defpackage.zka) new defpackage.sab(2), (ajas) new xbw(callable, 15));
    }

    public static defpackage.uyg J(ajas ajasVar) {
        return new defpackage.uyg((defpackage.zka) new defpackage.sab(3), ajasVar);
    }

    public static defpackage.uyg K(java.util.concurrent.Callable callable, ajct ajctVar) {
        return new defpackage.uyg((defpackage.zka) new defpackage.sab(4), (ajas) new defpackage.wwg(callable, ajctVar, 10));
    }

    public static defpackage.uyg L(defpackage.zka zkaVar, java.util.concurrent.Callable callable, ajct ajctVar) {
        return new defpackage.uyg(zkaVar, (ajas) new defpackage.wwg(callable, ajctVar, 11));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    private final synchronized java.util.List M(java.lang.String str) {
        java.util.List arrayList;
        ?? r0 = this.b;
        if (!r0.contains(str)) {
            r0.add(str);
        }
        ?? r1 = this.a;
        arrayList = (java.util.List) r1.get(str);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            r1.put(str, arrayList);
        }
        return arrayList;
    }

    public static final defpackage.uyf a(defpackage.uyk uykVar) {
        aooh.f(uykVar, "videoCallIntroDemoFragmentArgs");
        defpackage.uyf uyfVar = new defpackage.uyf();
        amxr.g(uyfVar);
        ahgl.b(uyfVar, uykVar);
        android.os.Bundle bundle = ((aw) uyfVar).m;
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        bundle.putByteArray("ui_config", uykVar.i());
        uyfVar.au(bundle);
        return uyfVar;
    }

    public static final defpackage.xxe k(android.graphics.ImageDecoder.Source source, int i, int i2, defpackage.xus xusVar) throws java.io.IOException {
        android.graphics.drawable.Drawable drawableM = ft$.ExternalSyntheticApiModelOutline0.m(source, new defpackage.yai(i, i2, xusVar, false));
        if (ft$.ExternalSyntheticApiModelOutline0.m(drawableM)) {
            return new defpackage.ycm(defpackage.uyg$$ExternalSyntheticApiModelOutline2.m51m((java.lang.Object) drawableM));
        }
        throw new java.io.IOException("Received unexpected drawable type for animated image, failing: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(drawableM))));
    }

    public static final boolean l(com.bumptech.glide.load.ImageHeaderParser$ImageType imageHeaderParser$ImageType) {
        if (imageHeaderParser$ImageType != com.bumptech.glide.load.ImageHeaderParser$ImageType.ANIMATED_WEBP) {
            return android.os.Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageType == com.bumptech.glide.load.ImageHeaderParser$ImageType.ANIMATED_AVIF;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object A(java.lang.String str, aoln aolnVar) {
        defpackage.zfi zfiVar;
        if (aolnVar instanceof defpackage.zfi) {
            zfiVar = (defpackage.zfi) aolnVar;
            int i = zfiVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                zfiVar.b = i - Integer.MIN_VALUE;
            } else {
                zfiVar = new defpackage.zfi(this, aolnVar);
            }
        } else {
            zfiVar = new defpackage.zfi(this, aolnVar);
        }
        java.lang.Object objA = zfiVar.a;
        aolu aoluVar = aolu.a;
        int i2 = zfiVar.b;
        if (i2 == 0) {
            aooc.af(objA);
            java.lang.Object obj = this.a;
            akfg akfgVar = akfg.eq;
            zfiVar.b = 1;
            objA = ((defpackage.sgi) obj).a(str, akfgVar, zfiVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objA);
        }
        java.lang.String str2 = (java.lang.String) objA;
        if (str2 == null) {
            return null;
        }
        return new defpackage.zff(str2);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aolr, java.lang.Object] */
    public final aoxh B(defpackage.yse yseVar) {
        aooh.f(yseVar, "feature");
        return aoov.aC(new aowy(new defpackage.tgn(this, yseVar, (aoln) null, 12)), (aolr) this.b);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final aozj C(defpackage.yse yseVar) {
        aooh.f(yseVar, "feature");
        ?? r1 = this.a;
        aozj aozjVar = (aozj) ((j$.util.concurrent.ConcurrentHashMap) r1).get(yseVar);
        if (aozjVar != null) {
            return aozjVar;
        }
        aozj aozjVarA = aozk.a(java.lang.Float.valueOf(0.0f));
        r1.put(yseVar, aozjVarA);
        return aozjVarA;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized java.util.List D(java.lang.Class cls, java.lang.Class cls2) {
        java.util.ArrayList arrayList;
        arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.b.iterator();
        while (it.hasNext()) {
            java.util.List<defpackage.ulw> list = (java.util.List) this.a.get((java.lang.String) it.next());
            if (list != null) {
                for (defpackage.ulw ulwVar : list) {
                    if (ulwVar.c(cls, cls2)) {
                        arrayList.add(ulwVar.b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized java.util.List E(java.lang.Class cls, java.lang.Class cls2) {
        java.util.ArrayList arrayList;
        arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.b.iterator();
        while (it.hasNext()) {
            java.util.List<defpackage.ulw> list = (java.util.List) this.a.get((java.lang.String) it.next());
            if (list != null) {
                for (defpackage.ulw ulwVar : list) {
                    if (ulwVar.c(cls, cls2)) {
                        java.lang.Object obj = ulwVar.c;
                        if (arrayList.contains(obj)) {
                            continue;
                        } else {
                            arrayList.add(obj);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized void F(java.lang.String str, defpackage.xuu xuuVar, java.lang.Class cls, java.lang.Class cls2) {
        M(str).add(new defpackage.ulw(cls, cls2, xuuVar));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final synchronized void G(java.util.List list) {
        ?? r1 = this.b;
        java.util.ArrayList arrayList = new java.util.ArrayList((java.util.Collection) r1);
        r1.clear();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r1.add((java.lang.String) it.next());
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            java.lang.String str = (java.lang.String) arrayList.get(i);
            if (!list.contains(str)) {
                r1.add(str);
            }
        }
    }

    public final synchronized void H(defpackage.xuu xuuVar, java.lang.Class cls, java.lang.Class cls2) {
        M("legacy_prepend_all").add(0, new defpackage.ulw(cls, cls2, xuuVar));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.vpu vpuVar;
        if (aolnVar instanceof defpackage.vpu) {
            vpuVar = (defpackage.vpu) aolnVar;
            int i = vpuVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                vpuVar.b = i - Integer.MIN_VALUE;
            } else {
                vpuVar = new defpackage.vpu(this, aolnVar);
            }
        } else {
            vpuVar = new defpackage.vpu(this, aolnVar);
        }
        java.lang.Object objD = vpuVar.a;
        aolu aoluVar = aolu.a;
        int i2 = vpuVar.b;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarC = ((afhf) this.b).c();
            aooh.e(ajcqVarC, "getData(...)");
            vpuVar.b = 1;
            objD = aosv.D(ajcqVarC, vpuVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        aooh.e(objD, "await(...)");
        return objD;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final java.lang.Object c(vcr vcrVar, android.telecom.PhoneAccountHandle phoneAccountHandle, aoln aolnVar) {
        defpackage.vpv vpvVar;
        if (aolnVar instanceof defpackage.vpv) {
            vpvVar = (defpackage.vpv) aolnVar;
            int i = vpvVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                vpvVar.b = i - Integer.MIN_VALUE;
            } else {
                vpvVar = new defpackage.vpv(this, aolnVar);
            }
        } else {
            vpvVar = new defpackage.vpv(this, aolnVar);
        }
        java.lang.Object obj = vpvVar.a;
        aolu aoluVar = aolu.a;
        int i2 = vpvVar.b;
        if (i2 == 0) {
            aooc.af(obj);
            ajcq ajcqVarA = ((afhf) this.b).a(new defpackage.vmb(new uph(phoneAccountHandle, vcrVar, 3, (byte[]) null), 12), (java.util.concurrent.Executor) this.a);
            vpvVar.b = 1;
            if (aosv.D(ajcqVarA, vpvVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, vcg] */
    public final java.lang.Object d(android.telecom.PhoneAccountHandle phoneAccountHandle, aoln aolnVar) {
        defpackage.vpg vpgVar;
        if (aolnVar instanceof defpackage.vpg) {
            vpgVar = (defpackage.vpg) aolnVar;
            int i = vpgVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                vpgVar.b = i - Integer.MIN_VALUE;
            } else {
                vpgVar = new defpackage.vpg(this, aolnVar);
            }
        } else {
            vpgVar = new defpackage.vpg(this, aolnVar);
        }
        java.lang.Object objD = vpgVar.a;
        aolu aoluVar = aolu.a;
        int i2 = vpgVar.b;
        if (i2 != 0) {
            if (i2 == 1) {
                phoneAccountHandle = vpgVar.c;
                aooc.af(objD);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objD);
            }
            aooh.e(objD, "await(...)");
            return objD;
        }
        aooc.af(objD);
        ajcq ajcqVarA = ((vda) ((zjm) this.b).g().orElseThrow()).a(phoneAccountHandle);
        vpgVar.c = phoneAccountHandle;
        vpgVar.b = 1;
        objD = aosv.D(ajcqVarA, vpgVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        j$.util.Optional optional = (j$.util.Optional) objD;
        if (!optional.isPresent()) {
            return new defpackage.vpf(0, 0);
        }
        ajcq ajcqVarC = ((defpackage.abtr) optional.orElseThrow()).f.c(phoneAccountHandle);
        aooh.e(ajcqVarC, "getGreetingSpecification(...)");
        vpgVar.c = null;
        vpgVar.b = 2;
        objD = aosv.D(ajcqVarC, vpgVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        aooh.e(objD, "await(...)");
        return objD;
    }

    public final ajcq e() {
        return ((rwi) this.b).d("feedback_notification_tag", 1);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aolr, java.lang.Object] */
    public final java.lang.Object f(defpackage.ukm ukmVar, aoln aolnVar) {
        java.lang.Object objAj = aoov.aj((aolr) this.b, new defpackage.ufr(ukmVar, this, (aoln) null, 11), aolnVar);
        return objAj != aolu.a ? aojh.a : objAj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, ydr] */
    public final defpackage.xsx g(android.content.Context context, defpackage.xrr xrrVar, ems emsVar, boolean z) {
        defpackage.ygc.g();
        defpackage.ygc.g();
        ?? r0 = this.b;
        defpackage.xsx xsxVar = (defpackage.xsx) r0.get(emsVar);
        if (xsxVar != null) {
            return xsxVar;
        }
        com.bumptech.glide.manager.LifecycleLifecycle lifecycleLifecycle = new com.bumptech.glide.manager.LifecycleLifecycle(emsVar);
        defpackage.xsx xsxVarA = this.a.a(xrrVar, lifecycleLifecycle, new defpackage.ydo(this), context);
        r0.put(emsVar, xsxVarA);
        lifecycleLifecycle.a(new defpackage.ydn(this, emsVar));
        if (z) {
            xsxVarA.j();
        }
        return xsxVarA;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xxm] */
    public final void h(android.graphics.Bitmap bitmap) {
        this.a.d(bitmap);
    }

    public final void i(byte[] bArr) {
        java.lang.Object obj = this.b;
        if (obj != null) {
            ((defpackage.xxt) obj).c(bArr);
        }
    }

    public final byte[] j(int i) {
        java.lang.Object obj = this.b;
        return obj == null ? new byte[i] : (byte[]) ((defpackage.xxt) obj).a(i, byte[].class);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final defpackage.xus m(java.nio.ByteBuffer byteBuffer, defpackage.xus xusVar) {
        java.lang.Object obj;
        ?? r0 = this.a;
        if (r0.isEmpty() || (obj = this.b) == null || !defpackage.ycc.f(defpackage.xff.F(r0, byteBuffer, (defpackage.xxt) obj))) {
            return xusVar;
        }
        defpackage.xus xusVar2 = new defpackage.xus();
        xusVar2.c(xusVar);
        xusVar2.d(defpackage.ybh.f, java.lang.Boolean.TRUE);
        return xusVar2;
    }

    public final synchronized java.util.List n(java.lang.Class cls) {
        return ((defpackage.xzu) this.a).c(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    public final synchronized java.util.List o(java.lang.Class cls) {
        java.lang.Object obj;
        java.util.List listUnmodifiableList;
        ?? r0 = ((defpackage.vqu) this.b).a;
        defpackage.vqu vquVar = (defpackage.vqu) r0.get(cls);
        if (vquVar == null) {
            listUnmodifiableList = 0;
        } else {
            obj = vquVar.a;
        }
        if (listUnmodifiableList == 0) {
            listUnmodifiableList = obj;
            listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.xzu) this.a).b(cls));
            if (((defpackage.vqu) r0.put(cls, new defpackage.vqu(listUnmodifiableList))) != null) {
                throw new java.lang.IllegalStateException("Already cached loaders for model: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(cls))));
            }
        }
        return listUnmodifiableList;
    }

    public final synchronized void p(java.lang.Class cls, java.lang.Class cls2, defpackage.xzq xzqVar) {
        ((defpackage.xzu) this.a).d(cls, cls2, xzqVar);
        ((defpackage.vqu) this.b).v();
    }

    public final synchronized void q(java.lang.Class cls, java.lang.Class cls2, defpackage.xzq xzqVar) {
        ((defpackage.xzu) this.a).e(cls, cls2, xzqVar);
        ((defpackage.vqu) this.b).v();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [dxz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [dxz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [dxz, java.lang.Object] */
    public final java.lang.String r(defpackage.xuo xuoVar) {
        java.lang.String str;
        java.lang.Object obj = this.a;
        synchronized (obj) {
            str = (java.lang.String) ((defpackage.yfy) obj).f(xuoVar);
        }
        if (str == null) {
            defpackage.xyi xyiVar = (defpackage.xyi) this.b.a();
            try {
                java.security.MessageDigest messageDigest = xyiVar.a;
                xuoVar.a(messageDigest);
                byte[] bArrDigest = messageDigest.digest();
                char[] cArr = defpackage.ygc.b;
                synchronized (cArr) {
                    for (int i = 0; i < bArrDigest.length; i++) {
                        byte b = bArrDigest[i];
                        int i2 = i << 1;
                        char[] cArr2 = defpackage.ygc.a;
                        cArr[i2] = cArr2[(b & 255) >>> 4];
                        cArr[i2 + 1] = cArr2[b & 15];
                    }
                    str = new java.lang.String(cArr);
                }
                this.b.b(xyiVar);
            } catch (java.lang.Throwable th) {
                this.b.b(xyiVar);
                throw th;
            }
        }
        java.lang.Object obj2 = this.a;
        synchronized (obj2) {
            ((defpackage.yfy) obj2).g(xuoVar, str);
        }
        return str;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.concurrent.locks.Lock] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.Queue] */
    public final void s(java.lang.String str) {
        defpackage.aogy aogyVar;
        synchronized (this) {
            ?? r1 = this.a;
            aogyVar = (defpackage.aogy) r1.get(str);
            anty.aI(aogyVar, "Argument must not be null");
            int i = aogyVar.a;
            if (i <= 0) {
                throw new java.lang.IllegalStateException(a.bu(i, str, "Cannot release a lock that is not held, safeKey: ", ", interestedThreads: "));
            }
            int i2 = i - 1;
            aogyVar.a = i2;
            if (i2 == 0) {
                defpackage.aogy aogyVar2 = (defpackage.aogy) r1.remove(str);
                if (!aogyVar2.equals(aogyVar)) {
                    throw new java.lang.IllegalStateException("Removed the wrong lock, expected to remove: " + aogyVar.toString() + ", but actually removed: " + java.lang.String.valueOf(aogyVar2) + ", safeKey: " + str);
                }
                ?? r6 = ((defpackage.vqu) this.b).a;
                synchronized (r6) {
                    try {
                        if (r6.size() < 10) {
                            r6.offer(aogyVar2);
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
            }
        }
        aogyVar.b.unlock();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zka] */
    public final j$.util.Optional t() {
        return !this.a.a() ? j$.util.Optional.empty() : j$.util.Optional.of(this.b);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aolr, java.lang.Object] */
    public final java.lang.Object u(aoln aolnVar) {
        return aoov.aj((aolr) this.b, new zhb(this, (aoln) null, 7, (char[]) null), aolnVar);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aolr, java.lang.Object] */
    public final java.lang.Object v(aoln aolnVar) {
        return aoov.aj((aolr) this.b, new zhb(this, (aoln) null, 0, (boolean[]) null), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v1, types: [aolr, java.lang.Object] */
    public final java.lang.Object w(aoln aolnVar) {
        defpackage.zgo zgoVar;
        java.lang.Object objN;
        if (aolnVar instanceof defpackage.zgo) {
            zgoVar = (defpackage.zgo) aolnVar;
            int i = zgoVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                zgoVar.b = i - Integer.MIN_VALUE;
            } else {
                zgoVar = new defpackage.zgo(this, aolnVar);
            }
        } else {
            zgoVar = new defpackage.zgo(this, aolnVar);
        }
        java.lang.Object obj = zgoVar.a;
        aolu aoluVar = aolu.a;
        int i2 = zgoVar.b;
        if (i2 == 0) {
            aooc.af(obj);
            java.lang.Object obj2 = this.a;
            ?? r6 = this.b;
            defpackage.zgp zgpVar = new defpackage.zgp(null, 0);
            zgoVar.b = 1;
            objN = wsc.n((defpackage.yqt) obj2, (aolr) r6, zgpVar, zgoVar);
            if (objN == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
            objN = ((aoiw) obj).a;
        }
        if ((objN instanceof aoiv) && wsc.o(objN)) {
            return aokc.a;
        }
        aooc.af(objN);
        alat alatVar = ((defpackage.yra) objN).b;
        aooh.e(alatVar, "getIncomingExternalRcsProtoMessageList(...)");
        return alatVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v1, types: [aolr, java.lang.Object] */
    public final java.lang.Object x(defpackage.zfd zfdVar, aoln aolnVar) {
        defpackage.zgq zgqVar;
        java.lang.Object objN;
        if (aolnVar instanceof defpackage.zgq) {
            zgqVar = (defpackage.zgq) aolnVar;
            int i = zgqVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                zgqVar.b = i - Integer.MIN_VALUE;
            } else {
                zgqVar = new defpackage.zgq(this, aolnVar);
            }
        } else {
            zgqVar = new defpackage.zgq(this, aolnVar);
        }
        java.lang.Object obj = zgqVar.a;
        aolu aoluVar = aolu.a;
        int i2 = zgqVar.b;
        if (i2 == 0) {
            aooc.af(obj);
            java.lang.Object obj2 = this.a;
            ?? r6 = this.b;
            defpackage.uke ukeVar = new defpackage.uke(zfdVar, (aoln) null, 13);
            zgqVar.b = 1;
            objN = wsc.n((defpackage.yqt) obj2, (aolr) r6, ukeVar, zgqVar);
            if (objN == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
            objN = ((aoiw) obj).a;
        }
        return java.lang.Boolean.valueOf(aoiw.d(objN));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object y(defpackage.yqv yqvVar, aoln aolnVar) {
        defpackage.zga zgaVar;
        if (aolnVar instanceof defpackage.zga) {
            zgaVar = (defpackage.zga) aolnVar;
            int i = zgaVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                zgaVar.b = i - Integer.MIN_VALUE;
            } else {
                zgaVar = new defpackage.zga(this, aolnVar);
            }
        } else {
            zgaVar = new defpackage.zga(this, aolnVar);
        }
        java.lang.Object objC = zgaVar.a;
        aolu aoluVar = aolu.a;
        int i2 = zgaVar.b;
        if (i2 == 0) {
            aooc.af(objC);
            if ((yqvVar.b & 1) != 0) {
                java.lang.Object obj = this.a;
                zgaVar.c = yqvVar;
                zgaVar.b = 1;
                objC = ((defpackage.zlr) obj).c(zgaVar);
                if (objC == aoluVar) {
                    return aoluVar;
                }
            }
            return null;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        yqvVar = zgaVar.c;
        aooc.af(objC);
        for (defpackage.zfd zfdVar : (java.util.Set) objC) {
            if (aooh.n(zfdVar.a, yqvVar.c)) {
                return zfdVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object z(java.lang.String str, aoln aolnVar) {
        defpackage.zfh zfhVar;
        java.lang.String str2;
        if (aolnVar instanceof defpackage.zfh) {
            zfhVar = (defpackage.zfh) aolnVar;
            int i = zfhVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                zfhVar.b = i - Integer.MIN_VALUE;
            } else {
                zfhVar = new defpackage.zfh(this, aolnVar);
            }
        } else {
            zfhVar = new defpackage.zfh(this, aolnVar);
        }
        java.lang.Object objW = zfhVar.a;
        aolu aoluVar = aolu.a;
        int i2 = zfhVar.b;
        if (i2 != 0) {
            if (i2 == 1) {
                str = zfhVar.c;
                aooc.af(objW);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objW);
            }
            str2 = (java.lang.String) objW;
            if (str2 != null) {
                return new defpackage.zfd(str2);
            }
            return null;
        }
        aooc.af(objW);
        if (str != null && str.length() != 0) {
            java.lang.Object obj = this.b;
            zfhVar.c = str;
            zfhVar.b = 1;
            objW = ((defpackage.zoe) obj).w(zfhVar);
            if (objW == aoluVar) {
                return aoluVar;
            }
        }
        return null;
        akfg akfgVarB = akfg.b((java.lang.String) objW);
        java.lang.Object obj2 = this.a;
        zfhVar.c = null;
        zfhVar.b = 2;
        objW = ((defpackage.sgi) obj2).a(str, akfgVarB, zfhVar);
        if (objW == aoluVar) {
            return aoluVar;
        }
        str2 = (java.lang.String) objW;
        if (str2 != null) {
            return new defpackage.zfd(str2);
        }
        return null;
    }

    public uyg(afhf afhfVar, ajct ajctVar, aazc aazcVar) {
        aooh.f(afhfVar, "lastDataFetchResultDataStore");
        aooh.f(ajctVar, "lightweightExecutor");
        aooh.f(aazcVar, "clock");
        this.b = afhfVar;
        this.a = ajctVar;
    }

    public uyg(agab agabVar, vwb vwbVar) {
        aooh.f(vwbVar, "spamNotificationFragmentState");
        this.b = agabVar;
        this.a = vwbVar;
    }

    public uyg(android.content.Context context, aolr aolrVar) {
        aooh.f(context, "context");
        aooh.f(aolrVar, "backgroundContext");
        this.b = context;
        this.a = aolrVar;
    }

    public uyg(android.content.Context context, aolr aolrVar, byte[] bArr) {
        aooh.f(context, "appContext");
        aooh.f(aolrVar, "blockingContext");
        this.b = context;
        this.a = aolrVar;
    }

    public uyg(android.telephony.TelephonyManager telephonyManager, aolr aolrVar) {
        aooh.f(aolrVar, "blockingContext");
        this.a = telephonyManager;
        this.b = aolrVar;
    }

    public uyg(aolr aolrVar, android.content.pm.PackageManager packageManager) {
        aooh.f(aolrVar, "blockingContext");
        aooh.f(packageManager, "packageManager");
        this.b = aolrVar;
        this.a = packageManager;
    }

    public uyg(aolr aolrVar, defpackage.yqt yqtVar) {
        aooh.f(aolrVar, "blockingContext");
        this.b = aolrVar;
        this.a = yqtVar;
    }

    public uyg(java.lang.Object obj, java.lang.Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public uyg(java.lang.Object obj, java.lang.Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }

    public uyg(java.lang.Object obj, java.lang.Object obj2, char[] cArr) {
        this.b = obj;
        this.a = obj2;
    }

    public uyg(zjm zjmVar, aoss aossVar) {
        aooh.f(aossVar, "lightweightScope");
        this.b = zjmVar;
        this.a = aossVar;
    }

    public uyg(defpackage.zka zkaVar, ajas ajasVar) {
        this.a = zkaVar;
        this.b = ajasVar;
    }

    public uyg(aoin aoinVar, aoin aoinVar2) {
        aoinVar.getClass();
        this.b = aoinVar;
        aoinVar2.getClass();
        this.a = aoinVar2;
    }

    public uyg(byte[] bArr) {
        this.a = new java.util.HashMap();
        this.b = new defpackage.vqu((char[]) null);
    }

    public uyg(defpackage.abtr abtrVar, aolr aolrVar) {
        aooh.f(aolrVar, "lightweightContext");
        this.a = abtrVar;
        this.b = aolrVar;
    }

    public uyg(dxz dxzVar) {
        defpackage.xzu xzuVar = new defpackage.xzu(dxzVar);
        this.b = new defpackage.vqu((byte[]) null);
        this.a = xzuVar;
    }

    public uyg(defpackage.ydr ydrVar) {
        this.b = new java.util.HashMap();
        this.a = ydrVar;
    }

    public uyg(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new java.util.concurrent.atomic.AtomicReference();
        this.b = new aca();
    }

    public uyg(byte[] bArr, byte[] bArr2) {
        this.b = new java.util.ArrayList();
        this.a = new java.util.HashMap();
    }

    public uyg(aolr aolrVar) {
        aooh.f(aolrVar, "lightweightContext");
        this.b = aolrVar;
        this.a = new j$.util.concurrent.ConcurrentHashMap();
    }

    public uyg(char[] cArr) {
        this.a = new apdp();
        this.b = new java.util.ArrayList();
    }

    public uyg(aoin aoinVar, aoin aoinVar2, byte[] bArr) {
        aoinVar.getClass();
        this.a = aoinVar;
        aoinVar2.getClass();
        this.b = aoinVar2;
    }
}
