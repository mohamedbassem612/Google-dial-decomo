package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class adbi implements ajas {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ adbi(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [ahzi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1, types: [ajas, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v4, types: [ajas, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v50, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v55, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v60, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v7, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v71, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v73, types: [ahek, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v76, types: [ahje, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [ahzi, java.lang.Object] */
    public final ajcq a() {
        aify aifyVarN;
        ajcq ajcqVarZ;
        int i = 17;
        int i2 = 6;
        int i3 = 11;
        byte[] bArr = null;
        int i4 = 0;
        int i5 = 1;
        switch (this.$cid) {
            case 0:
                return ahvr.H(this.a.a(), new aczn(8), ajbm.a);
            case 1:
                return ahvr.H(this.a.a(), new aczn(10), ajbm.a);
            case 2:
                return ahvr.H((ajcq) this.a, new aczn(11), ajbm.a);
            case 3:
                return ((defpackage.adow) this.a).f(true);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                ahbv ahbvVar = (ahbv) this.a;
                ahyn ahynVar = (ahyn) ahbvVar.f.eZ();
                boolean zF = ahynVar.f();
                java.lang.Object objEZ = ahbvVar.c.eZ();
                if (zF) {
                    ahyn ahynVar2 = (ahyn) objEZ;
                    if (ahynVar2.f()) {
                        defpackage.aerh aerhVar = new defpackage.aerh((java.io.File) ahynVar.b(), (java.lang.String) ahynVar2.b());
                        int iA = aerhVar.a();
                        aerhVar.b().delete();
                        aerhVar.b = 0;
                        aerhVar.c = true;
                        if (iA < ((aeri) ahbvVar.b.a()).c) {
                            return ajcm.a;
                        }
                        java.lang.Object obj = ahbvVar.g;
                        aeqq aeqqVarA = aeqr.a();
                        akzx akzxVarM = apgu.a.m();
                        akzx akzxVarM2 = apgs.a.m();
                        akzxVarM2.u();
                        apgs apgsVar = akzxVarM2.b;
                        apgsVar.c = 6;
                        apgsVar.b |= 1;
                        akzxVarM.u();
                        apgu apguVar = akzxVarM.b;
                        apgs apgsVarP = akzxVarM2.p();
                        j$.util.Objects.requireNonNull(apgsVarP);
                        apguVar.x = apgsVarP;
                        apguVar.b |= 16777216;
                        aeqqVarA.f(akzxVarM.p());
                        return ((aequ) obj).a(aeqqVarA.a());
                    }
                }
                return ajcm.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return ((aetr) this.a).c();
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                java.util.List list = ((defpackage.agno) this.a).d;
                synchronized (list) {
                    aifyVarN = aify.n(list);
                    break;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList(aifyVarN.size());
                int size = aifyVarN.size();
                while (i4 < size) {
                    try {
                        ajcqVarZ = ((defpackage.agnn) aifyVarN.get(i4)).aD();
                    } catch (java.lang.Throwable th) {
                        a.by(defpackage.agno.a.c(), "OnRequirementStateChanged observer failed.", "com/google/apps/tiktok/account/api/controller/AccountRequirementManagerImpl", "notifyRequirementStateChanged", (char) 198, "AccountRequirementManagerImpl.java", th);
                        ajcqVarZ = aiql.z((java.lang.Object) null);
                    }
                    arrayList.add(ajcqVarZ);
                    i4++;
                }
                return aiql.Y(arrayList).b(new kve(12), ajbm.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                java.util.ArrayList arrayList2 = new java.util.ArrayList(1);
                ailj ailjVarK = ((aile) ((agpn) this.a).c).k();
                while (ailjVarK.hasNext()) {
                    try {
                        arrayList2.add(((agoo) ((defpackage.aprf) ailjVarK.next()).a).d());
                    } catch (java.lang.Exception e) {
                        arrayList2.add(aiql.y(e));
                    }
                }
                return aiql.aa(arrayList2).b(new kve(12), ajbm.a);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return ((afhf) this.a).c();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                java.lang.Object obj2 = this.a;
                defpackage.agqp agqpVar = (defpackage.agqp) obj2;
                agpb agpbVar = agqpVar.c;
                ajcq ajcqVarB = agqpVar.b();
                ajck ajckVarY = ajck.w(agpbVar.c()).y(ahqx.c(new defpackage.agpe(obj2, 3)), agqpVar.f);
                ajat ajatVarC = ahqx.c(new defpackage.agpe(obj2, 4));
                ajct ajctVar = agqpVar.e;
                ajcq ajcqVarY = ajckVarY.y(ajatVarC, ajctVar);
                return aiql.Z(new ajcq[]{ajcqVarB, ajcqVarY}).b(ahqx.i(new defpackage.afgu(ajcqVarB, ajcqVarY, i2, bArr)), ajctVar);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                java.lang.Object obj3 = this.a;
                defpackage.agqp agqpVar2 = (defpackage.agqp) obj3;
                aike aikeVarL = agqpVar2.h.l((aihd) null, aikn.a);
                aihb aihbVar = new aihb();
                int i6 = aikeVarL.d;
                while (i4 < i6) {
                    java.io.File file = (java.io.File) aikeVarL.get(i4);
                    try {
                        aihbVar.i(java.lang.Integer.valueOf(java.lang.Integer.parseInt(file.getName())));
                    } catch (java.lang.NumberFormatException e2) {
                        defpackage.agqp.a.c().k(e2).l("com/google/apps/tiktok/account/storage/WipeoutAccountsSynclet", "cleanUpObseleteAccountDirsInternal", 172, "WipeoutAccountsSynclet.java").y("Account directory name is malformed. Directory name: %s", file.getName());
                    }
                    i4++;
                }
                return ajan.g(ahvr.H(((aogc) ((adai) agqpVar2.g.a).a).F(), new defpackage.agqd(i5), ajbm.a), ahqx.c(new defpackage.adot(obj3, aihbVar.h(), i)), agqpVar2.f);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                defpackage.agqs agqsVar = (defpackage.agqs) this.a;
                defpackage.xrr xrrVarB = defpackage.xrr.b(agqsVar.a);
                defpackage.ygc.f();
                xrrVarB.a.b.a().b();
                j$.util.Objects.requireNonNull(xrrVarB);
                return agqsVar.b.eT(new defpackage.agdr(xrrVarB, 5));
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return aiql.z(((albh) this.a.a()).i());
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return ahvr.H(((ajas) this.a.a()).a(), new defpackage.agnw(defpackage.ahbr.a, i), ajbm.a);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return aiql.z(this.a.a());
            case 15:
                return ((ahce) this.a).p.a();
            case 16:
                ahoq ahoqVarX = ahvr.X(1360, "Updating storage infos", ahot.a, true);
                try {
                    ajcq ajcqVarB2 = ((ahct) this.a).b();
                    agsm.i(1361, ajcqVarB2, "Failed to update StorageInfos after registration", new java.lang.Object[0]);
                    ahoqVarX.a(ajcqVarB2);
                    ajsz.ak(ahoqVarX, (java.lang.Throwable) null);
                    return ajcqVarB2;
                } catch (java.lang.Throwable th2) {
                    try {
                        throw th2;
                    } catch (java.lang.Throwable th3) {
                        ajsz.ak(ahoqVarX, th2);
                        throw th3;
                    }
                }
            case 17:
                return aiql.v((java.lang.Iterable) this.a);
            case 18:
                return ajan.f(this.a.a(), ahqx.a(new defpackage.agqd(7)), ajbm.a);
            case 19:
                return this.a.a();
            default:
                java.lang.Object obj4 = this.a;
                defpackage.agpe agpeVar = new defpackage.agpe(obj4, i3);
                ahlt ahltVar = (ahlt) obj4;
                return ahltVar.f(ahvr.I(ahltVar.g, agpeVar, ahltVar.b));
        }
    }
}
