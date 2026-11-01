package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tia implements defpackage.thu {
    public static final aimz a = aimz.i("com/android/dialer/searchfragment/contactretriever/impl/Cp2DefaultDirectoryContactRetrieverImpl");
    private static final java.lang.String[] j = {"_id", "display_name", "display_name_alt", "snippet"};
    private static final aihd k = aihd.r("com.whatsapp", "com.google.android.apps.tachyon");
    public final android.content.Context b;
    public final ajct c;
    public final defpackage.tib d;
    public final aoin e;
    public final nxg f;
    public final lvs g;
    public final zjm h;
    public final vwb i;
    private final ajct l;
    private final ajct m;
    private final aoin n;
    private final ojo o;
    private final defpackage.tic p;
    private final defpackage.uqj q;
    private final ahda r = new ahda();

    public tia(android.content.Context context, ajct ajctVar, ajct ajctVar2, ajct ajctVar3, aoin aoinVar, aoin aoinVar2, ojo ojoVar, lvs lvsVar, vwb vwbVar, defpackage.tib tibVar, defpackage.tic ticVar, defpackage.uqj uqjVar, zjm zjmVar, nxg nxgVar) {
        this.b = context;
        this.c = ajctVar;
        this.l = ajctVar2;
        this.m = ajctVar3;
        this.n = aoinVar;
        this.o = ojoVar;
        this.g = lvsVar;
        this.i = vwbVar;
        this.d = tibVar;
        this.p = ticVar;
        this.q = uqjVar;
        this.h = zjmVar;
        this.e = aoinVar2;
        this.f = nxgVar;
    }

    private final ajcq e() {
        return this.q.a(((java.lang.Long) this.n.a()).intValue());
    }

    @Override // defpackage.thu
    public final ajcq a(java.lang.String str) {
        a.b().l("com/android/dialer/searchfragment/contactretriever/impl/Cp2DefaultDirectoryContactRetrieverImpl", "keyboardQuery", 146, "Cp2DefaultDirectoryContactRetrieverImpl.java").y("keyboard searching for %s", aais.aD(str));
        ahrv ahrvVarG = ahrv.g(this.o.d(android.provider.ContactsContract.Contacts.CONTENT_FILTER_URI.buildUpon().appendPath(str).build(), j, (java.lang.String) null, (java.lang.String[]) null, (java.lang.String) null).c(ahqx.e(new kwb(8)), this.l).h());
        defpackage.tct tctVar = new defpackage.tct(this, 4);
        ajct ajctVar = this.c;
        ajcq ajcqVarI = ahrvVarG.i(tctVar, ajctVar);
        ajcq ajcqVarE = e();
        return ahvr.ak(new ajcq[]{ajcqVarI, ajcqVarE}).o(new defpackage.tbb((java.lang.Object) this, ajcqVarI, ajcqVarE, 3), ajctVar);
    }

    @Override // defpackage.thu
    public final ajcq b(final java.lang.String str) {
        a.b().l("com/android/dialer/searchfragment/contactretriever/impl/Cp2DefaultDirectoryContactRetrieverImpl", "smartDialQuery", 178, "Cp2DefaultDirectoryContactRetrieverImpl.java").y("smartdial searching for %s", aais.aD(str));
        ajcq ajcqVarH = this.r.h(new qat(this, str, 14, (byte[]) null), this.m);
        defpackage.tct tctVar = new defpackage.tct(this, 3);
        ajct ajctVar = this.c;
        final ajcq ajcqVarI = ahvr.I(ajcqVarH, tctVar, ajctVar);
        final ajcq ajcqVarE = e();
        return ahvr.ak(new ajcq[]{ajcqVarI, ajcqVarE}).o(new java.util.concurrent.Callable() { // from class: thx
            /* JADX WARN: Code duplicated, block: B:113:0x020a  */
            /* JADX WARN: Code duplicated, block: B:48:0x0111  */
            /* JADX WARN: Code duplicated, block: B:50:0x0119  */
            /* JADX WARN: Code duplicated, block: B:52:0x012d  */
            /* JADX WARN: Code duplicated, block: B:54:0x0144  */
            /* JADX WARN: Code duplicated, block: B:91:0x01cd  */
            /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.CharSequence, java.lang.Object] */
            /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:55:0x0147
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
                */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instruction units count: 581
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.thx.call():java.lang.Object");
            }
        }, ajctVar);
    }

    @Override // defpackage.thu
    public final ajcq c() {
        ahrv ahrvVarG = ahrv.g(this.q.b());
        defpackage.tbp tbpVar = new defpackage.tbp(6);
        ajct ajctVar = this.c;
        return ahrvVarG.h(tbpVar, ajctVar).i(new defpackage.tct(this, 5), ajctVar).i(new defpackage.tct(this, 6), ajctVar);
    }

    public final ajcq d(java.util.List list) {
        j$.util.stream.Stream map = j$.util.Collection.-EL.stream(list).map(new defpackage.rat(19));
        j$.util.stream.Collector collector = aido.b;
        aihd aihdVar = (aihd) map.collect(collector);
        aihd aihdVar2 = k;
        aihd aihdVar3 = (aihd) j$.util.Collection.-EL.stream(aihdVar).map(new defpackage.thw(5)).collect(collector);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ahvr.bf(aihdVar3, 999 - aihdVar2.size()).iterator();
        while (true) {
            defpackage.tic ticVar = this.p;
            if (!it.hasNext()) {
                ajcq ajcqVarO = ahvr.aj(arrayList).o(new defpackage.sws(arrayList, 20), ticVar.c);
                defpackage.tcy tcyVar = new defpackage.tcy(list, 4);
                ajct ajctVar = this.c;
                return ahvr.H(ahvr.H(ajcqVarO, tcyVar, ajctVar), new defpackage.tbp(7), ajctVar);
            }
            java.util.List list2 = (java.util.List) it.next();
            rsr rsrVar = new rsr();
            rsrVar.aC(new kaw("contact_id").aF(list2));
            rsr rsrVar2 = new rsr();
            ailj ailjVarK = aihdVar2.k();
            while (ailjVarK.hasNext()) {
                rsrVar2.aC(new kaw("account_type").aI("!=", (java.lang.String) ailjVarK.next()));
            }
            rsr rsrVar3 = new rsr();
            rsrVar3.aC(new kaw("account_type").aH("IS NULL"));
            rsrVar2.aD(rsrVar3.aB());
            rsrVar.aC(rsrVar2.aB());
            rsr rsrVarAB = rsrVar.aB();
            ojo ojoVar = ticVar.e;
            java.lang.Object obj = rsrVarAB.b;
            java.lang.String str = (java.lang.String) obj;
            arrayList.add(ojoVar.d(android.provider.ContactsContract.RawContacts.CONTENT_URI, defpackage.tic.b, str, (java.lang.String[]) rsrVarAB.a, (java.lang.String) null).c(ahqx.e(new kwb(9)), ticVar.d).h());
        }
    }
}
