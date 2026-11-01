package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class xmr implements aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public xmr(alg algVar, int i) {
        this.$cid = i;
        this.a = algVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v46, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, xhu] */
    /* JADX WARN: Type inference failed for: r3v21, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final java.lang.Object a() {
        java.lang.Object obj = null;
        boolean z = true;
        int iC = 0;
        switch (this.$cid) {
            case 0:
                defpackage.xmw xmwVar = (defpackage.xmw) this.a;
                return aoov.am(xmwVar.c, 0, new defpackage.xmv(xmwVar, null), 3);
            case 1:
                defpackage.xmp xmpVar = (defpackage.xmp) this.a;
                return xmpVar.a.b(xmpVar.b);
            case 2:
                return defpackage.xkd.a.a(this.a);
            case 3:
                java.lang.Object obj2 = this.a;
                int i = defpackage.xon.g;
                aojh aojhVar = aojh.a;
                ((aoul) obj2).Q(aojhVar);
                return aojhVar;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                java.lang.Object obj3 = this.a;
                defpackage.xon xonVar = (defpackage.xon) obj3;
                java.util.Map mapF = defpackage.xfc.f(xonVar.b, xonVar.e, xonVar.f, obj3);
                java.util.Collection collection = xonVar.c;
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(aooc.t(ajsz.aL(ajsz.bl(collection, 10)), 16));
                for (java.lang.Object obj4 : collection) {
                    linkedHashMap.put(((defpackage.xme) obj4).asNodeRef(), obj4);
                }
                return new j$.util.concurrent.ConcurrentHashMap(ajsz.aQ(linkedHashMap, mapF));
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return new defpackage.ykm(this.a, 0);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj5 : ((defpackage.ykq) this.a).b) {
                    if (!aooh.n(((defpackage.yks) obj5).a(), defpackage.yku.a)) {
                        arrayList.add(obj5);
                    }
                }
                return arrayList;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.ykq ykqVar = (defpackage.ykq) this.a;
                java.util.List list = ykqVar.b;
                if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!defpackage.xhp.w(((defpackage.yks) it.next()).a())) {
                            if (!((java.util.List) ykqVar.c.a()).isEmpty()) {
                                z = false;
                            }
                        }
                    }
                }
                return java.lang.Boolean.valueOf(z);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                java.util.List<defpackage.yks> list2 = ((defpackage.ykq) this.a).b;
                boolean z2 = list2 instanceof java.util.Collection;
                if (z2 && list2.isEmpty()) {
                    z = false;
                } else {
                    java.util.Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (defpackage.xhp.v(((defpackage.yks) it2.next()).a())) {
                            if (!z2 || !list2.isEmpty()) {
                                for (defpackage.yks yksVar : list2) {
                                    if (!defpackage.xhp.w(yksVar.a()) && !defpackage.xhp.v(yksVar.a())) {
                                        z = false;
                                    }
                                }
                            }
                        }
                    }
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                defpackage.abbc abbcVar = (defpackage.abbc) this.a;
                java.util.List list3 = abbcVar.b;
                java.util.Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    iC += ((defpackage.amwp) it3.next()).a;
                }
                if (iC != 0) {
                    iC = iC + defpackage.abaz.c("/internal/moirai_default/1") + 150;
                }
                defpackage.ajyt ajytVar = new defpackage.ajyt(iC, abbcVar.c);
                int iA = ajytVar.a("/internal/moirai_default/1");
                int iBa = a.ba(ajytVar, iA);
                java.util.ArrayList arrayList2 = new java.util.ArrayList(ajsz.bl(list3, 10));
                java.util.Iterator it4 = list3.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(java.lang.Integer.valueOf(((defpackage.abax) ((defpackage.amwp) it4.next()).b.a(ajytVar, java.lang.Integer.valueOf(iA))).a));
                }
                int[] iArrCm = ajsz.cm(arrayList2);
                int length = iArrCm.length;
                ajytVar.m(4, length, 4);
                while (true) {
                    length--;
                    if (length < 0) {
                        int iB = ajytVar.b();
                        ajytVar.l(2);
                        mni.bv(ajytVar, iB);
                        mni.bu(ajytVar, iBa);
                        ajytVar.p(mni.bt(ajytVar));
                        java.nio.ByteBuffer byteBufferD = ajytVar.d();
                        if (!byteBufferD.isDirect() || !byteBufferD.isReadOnly()) {
                            byteBufferD = java.nio.ByteBuffer.allocateDirect(byteBufferD.remaining()).put(byteBufferD).asReadOnlyBuffer();
                            byteBufferD.flip();
                        }
                        aooh.c(byteBufferD);
                        aooh.f(byteBufferD, "_bb");
                        defpackage.ajyu ajyuVar = new defpackage.ajyu((int[]) null);
                        aooh.f(byteBufferD, "_bb");
                        byteBufferD.order(java.nio.ByteOrder.LITTLE_ENDIAN);
                        int i2 = byteBufferD.getInt(byteBufferD.position()) + byteBufferD.position();
                        aooh.f(byteBufferD, "_bb");
                        aooh.f(byteBufferD, "_bb");
                        ajyuVar.l(i2, byteBufferD);
                        return ajyuVar;
                    }
                    ajytVar.f(iArrCm[length]);
                }
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return ((alg) this.a).h();
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                for (java.lang.Object obj6 : ((defpackage.afpl) this.a).G()) {
                    akc akcVar = ((defpackage.abef) obj6).b;
                    if (akcVar.g() && !((java.lang.Boolean) akcVar.b()).booleanValue()) {
                        obj = obj6;
                        return (defpackage.abef) obj;
                    }
                }
                return (defpackage.abef) obj;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                int i3 = defpackage.abew.a;
                return dkz.z((dkz) this.a, 0L, 0L, (dnd) null, (dmw) null, (dmq) null, (java.lang.String) null, 0L, cfd.M(0), (dou) null, 0, 0L, (dki) null, (dos) null, 0, 0, 16775167);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                afsq.be((cer) this.a).a();
                return java.lang.Boolean.TRUE;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                afsq.bd((cer) this.a).a();
                return java.lang.Boolean.TRUE;
            case 15:
                return java.lang.Float.valueOf(((java.lang.Number) ((defpackage.abgq) this.a).j.d()).floatValue());
            case 16:
                return java.lang.Boolean.valueOf(((defpackage.abgq) this.a).c());
            case 17:
                return java.lang.Float.valueOf(((java.lang.Number) ((defpackage.abgq) this.a).n.d()).floatValue());
            case 18:
                afsq.bf((cer) this.a).a(new defpackage.abgv(2, 0.0f));
                return aojh.a;
            case 19:
                return new dpi(((dpi) ((defpackage.abgq) this.a).m.d()).a);
            default:
                return java.lang.Float.valueOf(((defpackage.abgq) this.a).a());
        }
    }

    public /* synthetic */ xmr(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
