package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class kvx implements ajaz {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ kvx(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0243  */
    /* JADX WARN: Type inference failed for: r0v27, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [ajct, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v64, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [ajct, java.lang.Object] */
    public final ajbg a() {
        ajcq ajcqVar;
        ajcq ajcqVarF;
        int i = 17;
        int i2 = 15;
        int i3 = 4;
        int i4 = 0;
        switch (this.$cid) {
            case 0:
                java.lang.Object obj = this.a;
                kvy kvyVar = (kvy) obj;
                ajcq ajcqVarAW = kvyVar.n.aW();
                defpackage.kvd kvdVar = new defpackage.kvd(obj, i3);
                ajct ajctVar = kvyVar.f;
                ajcq ajcqVarI = ahvr.I(ajcqVarAW, kvdVar, ajctVar);
                long epochMilli = j$.time.Instant.now().toEpochMilli();
                lbi lbiVar = kvyVar.g;
                ajcq ajcqVarC = lbiVar.c(epochMilli);
                ajcq ajcqVarK = lbiVar.k();
                return new ajbg(ahvr.ak(new ajcq[]{ajcqVarI, ajcqVarC, ajcqVarK}).o(new joq(obj, ajcqVarI, ajcqVarC, ajcqVarK, 2), ajctVar));
            case 1:
                kew kewVar = (kew) this.a;
                java.util.concurrent.atomic.AtomicReference atomicReference = (java.util.concurrent.atomic.AtomicReference) kewVar.d.a;
                if (atomicReference.get() instanceof defpackage.key) {
                    ajcqVar = null;
                } else {
                    kfc kfcVar = (kfc) atomicReference.getAndSet(defpackage.kfa.a);
                    if (kfcVar instanceof defpackage.kfb) {
                        ajcqVar = ((defpackage.kfb) kfcVar).a;
                    } else {
                        ajcqVar = null;
                    }
                }
                if (ajcqVar != null) {
                    kew.a.b().l("com/android/dialer/calllog/dataservice/CallLogFragmentDataService", "getDataSource$<anonymous>", 59, "CallLogFragmentDataService.kt").v("loadData from initial UI model");
                    return new ajbg(ajcqVar);
                }
                kew.a.b().l("com/android/dialer/calllog/dataservice/CallLogFragmentDataService", "getDataSource$<anonymous>", 63, "CallLogFragmentDataService.kt").v("loadData from loadUiModel");
                return new ajbg(aosv.F(kewVar.c, 0, new defpackage.hqi(kewVar, (aoln) null, 8), 3));
            case 2:
                java.lang.Object obj2 = this.a;
                defpackage.kwc kwcVar = (defpackage.kwc) obj2;
                ajcq ajcqVarAW2 = kwcVar.m.aW();
                defpackage.kvd kvdVar2 = new defpackage.kvd(obj2, 12);
                ajct ajctVar2 = kwcVar.e;
                ajcq ajcqVarI2 = ahvr.I(ajcqVarAW2, kvdVar2, ajctVar2);
                return new ajbg(ahvr.ak(new ajcq[]{ajcqVarAW2, ajcqVarI2}).o(new defpackage.hsl(obj2, ajcqVarAW2, ajcqVarI2, 6, (byte[]) null), ajctVar2));
            case 3:
                defpackage.lhz lhzVar = (defpackage.lhz) this.a;
                ahrv ahrvVarG = ahrv.g(lhzVar.c.b());
                llz llzVar = lhzVar.b;
                j$.util.Objects.requireNonNull(llzVar);
                defpackage.lhy lhyVar = new defpackage.lhy(llzVar, i4);
                ajct ajctVar3 = lhzVar.d;
                return new ajbg(ahrvVarG.i(lhyVar, ajctVar3).h(new defpackage.lef(i2), ajctVar3));
            case 4:
                java.lang.Object obj3 = this.a;
                defpackage.mjm mjmVar = (defpackage.mjm) obj3;
                return new ajbg(ahrv.g(!mjmVar.c.get() ? ajcm.a : ahrv.g(mjmVar.d("", new aile(defpackage.miy.VOICE))).h(new defpackage.mjl(obj3, i4), mjmVar.b)).i(new defpackage.lhy(obj3, i), mjmVar.b));
            case 5:
                return new ajbg((ajcq) this.a);
            case 6:
                j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable((pxk) ((pxn) this.a).b.b.get());
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = j$.util.Optional.ofNullable(((pxk) optionalOfNullable.get()).a);
                }
                return new ajbg(aiql.z(optionalOfNullable));
            case 7:
                tbq tbqVar = ((sxv) this.a).g;
                return new ajbg(ahvr.H(tbqVar.b(), new tbp(0), tbqVar.b));
            case 8:
                java.lang.Object obj4 = this.a;
                tdd tddVar = (tdd) obj4;
                ajcq ajcqVarB = tddVar.j.b();
                sws swsVar = new sws(obj4, 15);
                ajct ajctVar4 = tddVar.h;
                ajcq ajcqVarF2 = ahvr.F(swsVar, ajctVar4);
                taq taqVar = tddVar.m;
                ajcq ajcqVarEU = taqVar.a.eU(ahqx.i(new sws(taqVar, 17)));
                if (((java.lang.Boolean) tddVar.d.a()).booleanValue()) {
                    ajcqVarF = ahvr.F(new sws(obj4, 14), tddVar.c);
                } else {
                    tdd.a.b().l("com/android/dialer/rtt/settings/impl/service/AccessibilitySettingsService", "shouldShowTtySetting", 176, "AccessibilitySettingsService.java").v("tty disabled by flag: show_tty_setting=false");
                    ajcqVarF = aiql.z(java.lang.Boolean.FALSE);
                }
                ajcq ajcqVar2 = ajcqVarF;
                ajcq ajcqVarH = ahvr.H(ahvr.F(new sws(obj4, 16), ajctVar4), new tcy(obj4, 2), tddVar.c);
                sgi sgiVar = tddVar.n;
                ajcq ajcqVarEU2 = sgiVar.b.eU(ahqx.i(new sws(sgiVar, 18)));
                return new ajbg(ahvr.ak(new ajcq[]{ajcqVarB, ajcqVarF2, ajcqVarEU, ajcqVar2, ajcqVarH, ajcqVarEU2}).o(new tdc(tddVar, ajcqVarB, ajcqVarF2, ajcqVarEU, ajcqVar2, ajcqVarH, ajcqVarEU2), ajctVar4));
            case 9:
                return new ajbg(((tdn) this.a).f.b());
            case 10:
                return new ajbg(aiql.z(((vwb) ((uyg) this.a).a).c));
            case 11:
                return new ajbg((ajcq) this.a);
            case 12:
                return new ajbg((ajcq) this.a);
            default:
                java.lang.Object obj5 = this.a;
                xav xavVar = (xav) obj5;
                ajcq ajcqVarJ = xavVar.i.j();
                tzb tzbVar = xavVar.f;
                ajcq ajcqVarF3 = aosv.F(tzbVar.a, 0, new txf(tzbVar, (aoln) null, 11), 3);
                return new ajbg(ahvr.ak(new ajcq[]{ajcqVarJ, ajcqVarF3}).o(new wwx(obj5, ajcqVarJ, ajcqVarF3, 2, (byte[]) null), xavVar.d));
        }
    }
}
