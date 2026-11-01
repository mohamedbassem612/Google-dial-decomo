package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class snf {
    public static final aimz a;
    private static final java.util.Set j;
    public final aolr b;
    public final aolr c;
    public final defpackage.snr d;
    public final defpackage.snk e;
    public final defpackage.yqt f;
    public final rlv g;
    public final aoin h;
    public final defpackage.sgi i;
    private final defpackage.zek k;

    static {
        aojo aojoVar = defpackage.snb.a;
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(aojoVar, 10));
        aojl aojlVar = new aojl(aojoVar);
        while (aojlVar.hasNext()) {
            arrayList.add(((defpackage.zdv) aojlVar.next()).name());
        }
        j = ajsz.cf(arrayList);
        a = aimz.i("com/android/dialer/peertopeer/capabilities/registrar/impl/cache/batch/BatchCapabilityPuller");
    }

    public snf(aolr aolrVar, aolr aolrVar2, defpackage.snr snrVar, defpackage.snk snkVar, defpackage.sgi sgiVar, defpackage.yqt yqtVar, defpackage.zek zekVar, rlv rlvVar, aazc aazcVar, aoin aoinVar) {
        aooh.f(aolrVar, "blockingContext");
        aooh.f(aolrVar2, "backgroundContext");
        aooh.f(zekVar, "capabilityDao");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(aazcVar, "clock");
        aooh.f(aoinVar, "enableScanWholeAddress");
        this.b = aolrVar;
        this.c = aolrVar2;
        this.d = snrVar;
        this.e = snkVar;
        this.i = sgiVar;
        this.f = yqtVar;
        this.k = zekVar;
        this.g = rlvVar;
        this.h = aoinVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(java.util.List list, long j2, aoln aolnVar) {
        defpackage.snd sndVar;
        if (aolnVar instanceof defpackage.snd) {
            sndVar = (defpackage.snd) aolnVar;
            int i = sndVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sndVar.c = i - Integer.MIN_VALUE;
            } else {
                sndVar = new defpackage.snd(this, aolnVar);
            }
        } else {
            sndVar = new defpackage.snd(this, aolnVar);
        }
        java.lang.Object obj = sndVar.a;
        aolu aoluVar = aolu.a;
        int i2 = sndVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                defpackage.yrc yrcVar = (defpackage.yrc) it.next();
                alat alatVar = yrcVar.c;
                aooh.e(alatVar, "getCapabilitiesList(...)");
                java.util.ArrayList<defpackage.yrb> arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj2 : alatVar) {
                    if (j.contains(((defpackage.yrb) obj2).c)) {
                        arrayList2.add(obj2);
                    }
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList(ajsz.bl(arrayList2, 10));
                for (defpackage.yrb yrbVar : arrayList2) {
                    defpackage.yrd yrdVar = yrcVar.b;
                    if (yrdVar == null) {
                        yrdVar = defpackage.yrd.a;
                    }
                    java.lang.String str = yrdVar.c;
                    aooh.e(str, "getRemoteE164Number(...)");
                    java.lang.String str2 = yrbVar.c;
                    aooh.e(str2, "getName(...)");
                    arrayList3.add(new defpackage.zeo(str, defpackage.zdv.c(str2), j2));
                }
                arrayList.add(arrayList3);
            }
            java.util.List listBm = ajsz.bm(arrayList);
            defpackage.zek zekVar = this.k;
            sndVar.c = 1;
            if (zekVar.b(listBm, sndVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        a.b().l("com/android/dialer/peertopeer/capabilities/registrar/impl/cache/batch/BatchCapabilityPuller", "updateCapability", 111, "BatchCapabilityPuller.kt").v("refresh the capability db successfully");
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(java.util.List list, java.util.List list2, long j2, aoln aolnVar) {
        defpackage.sne sneVar;
        defpackage.zeh zehVar;
        if (aolnVar instanceof defpackage.sne) {
            sneVar = (defpackage.sne) aolnVar;
            int i = sneVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sneVar.c = i - Integer.MIN_VALUE;
            } else {
                sneVar = new defpackage.sne(this, aolnVar);
            }
        } else {
            sneVar = new defpackage.sne(this, aolnVar);
        }
        java.lang.Object obj = sneVar.a;
        aolu aoluVar = aolu.a;
        int i2 = sneVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(aooc.t(ajsz.aL(ajsz.bl(list, 10)), 16));
            for (java.lang.Object obj2 : list) {
                defpackage.yrd yrdVar = ((defpackage.yrc) obj2).b;
                if (yrdVar == null) {
                    yrdVar = defpackage.yrd.a;
                }
                linkedHashMap.put(yrdVar.c, obj2);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(list2, 10));
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                java.lang.String str = ((defpackage.yrd) it.next()).c;
                aooh.e(str, "getRemoteE164Number(...)");
                defpackage.yrc yrcVar = (defpackage.yrc) linkedHashMap.get(str);
                if (yrcVar != null) {
                    alat alatVar = yrcVar.c;
                    aooh.e(alatVar, "getCapabilitiesList(...)");
                    if (alatVar.isEmpty()) {
                        zehVar = defpackage.zeh.c;
                    } else {
                        zehVar = defpackage.zeh.b;
                    }
                } else {
                    zehVar = defpackage.zeh.c;
                }
                arrayList.add(new defpackage.zeu(str, zehVar, j2));
            }
            defpackage.snk snkVar = this.e;
            sneVar.c = 1;
            defpackage.snk.a.b().l("com/android/dialer/peertopeer/capabilities/registrar/impl/cache/batch/ContactCandidateGenerator", "updateContactStatus", 263, "ContactCandidateGenerator.kt").w("total status entity with updated cap: %d", arrayList.size());
            java.lang.Object objB = snkVar.b.b(arrayList, sneVar);
            if (objB != aoluVar) {
                objB = aojh.a;
            }
            if (objB == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        a.b().l("com/android/dialer/peertopeer/capabilities/registrar/impl/cache/batch/BatchCapabilityPuller", "updateContactStatus", 132, "BatchCapabilityPuller.kt").v("refresh the contact status db successfully");
        return aojh.a;
    }
}
