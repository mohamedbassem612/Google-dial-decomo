package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jig implements qbb {
    private final /* synthetic */ int $cid;
    public final java.lang.Object a;
    public final java.lang.Object b;

    public jig(aoss aossVar, defpackage.ijt ijtVar, int i) {
        this.$cid = i;
        aooh.f(aossVar, "lightweightScope");
        aooh.f(ijtVar, "audioPrismInCallLogger");
        this.a = aossVar;
        this.b = ijtVar;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v11, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v20, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v22, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v24, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r8v28, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [aoss, java.lang.Object] */
    public final ajcq a() {
        switch (this.$cid) {
            case 0:
                return aosv.F((aoss) this.a, 0, new defpackage.jeb(this, (aoln) null, 18), 3);
            case 1:
                return aosv.F((aoss) this.a, 0, new icp(this, (aoln) null, 4), 3);
            case 2:
                return aosv.F((aoss) this.a, 0, new defpackage.ksy(this, (aoln) null, 10), 3);
            case 3:
                return aosv.F((aoss) this.a, 0, new defpackage.hnj(this, (aoln) null, 8), 3);
            case 4:
                return aosv.F((aoss) this.a, 0, new nto(this, (aoln) null, 17), 3);
            case 5:
                return aosv.F((aoss) this.a, 0, new ozm(this, (aoln) null), 3);
            case 6:
                akzx akzxVarM = ampo.a.m();
                boolean z = ((java.util.concurrent.atomic.AtomicBoolean) this.a).get();
                akzxVarM.u();
                ampo ampoVar = akzxVarM.b;
                ampoVar.b |= 1;
                ampoVar.c = z;
                boolean z2 = ((java.util.concurrent.atomic.AtomicBoolean) this.b).get();
                akzxVarM.u();
                ampo ampoVar2 = akzxVarM.b;
                ampoVar2.b |= 2;
                ampoVar2.d = z2;
                return aiql.z(j$.util.Optional.of(akzxVarM.p()));
            case 7:
                return aosv.F((aoss) this.a, 0, new oxe(this, (aoln) null, 4), 3);
            case 8:
                return aosv.F((aoss) this.a, 0, new roy(this, (aoln) null, 16), 3);
            case 9:
                return aosv.F((aoss) this.a, 0, new tkx(this, (aoln) null, 2), 3);
            case 10:
                uhs uhsVar = (uhs) this.b;
                ajcq ajcqVarC = uhsVar.c();
                ajcq ajcqVarA = uhsVar.a();
                return ahvr.ak(new ajcq[]{ajcqVarC, ajcqVarA}).o(new syg(ajcqVarC, ajcqVarA, 15), (java.util.concurrent.Executor) this.a);
            default:
                return aosv.F((aoss) this.a, 0, new ung(this, (aoln) null, 15), 3);
        }
    }

    public final /* synthetic */ void b(akzx akzxVar, java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                amom amomVar = (amom) obj;
                aooh.f(akzxVar, "callEventBuilder");
                aooh.f(amomVar, "data");
                akzxVar.u();
                amow amowVar = akzxVar.b;
                amow amowVar2 = amow.a;
                j$.util.Objects.requireNonNull(amomVar);
                amowVar.ar = amomVar;
                amowVar.d |= 8192;
                break;
            case 1:
                amoi amoiVar = (amoi) obj;
                aooh.f(akzxVar, "callEventBuilder");
                aooh.f(amoiVar, "data");
                akzxVar.u();
                amow amowVar3 = akzxVar.b;
                amow amowVar4 = amow.a;
                j$.util.Objects.requireNonNull(amoiVar);
                amowVar3.ao = amoiVar;
                amowVar3.d |= 512;
                break;
            case 2:
                ampn ampnVar = (ampn) obj;
                aooh.f(akzxVar, "callEventBuilder");
                aooh.f(ampnVar, "data");
                akzxVar.u();
                amow amowVar5 = akzxVar.b;
                amow amowVar6 = amow.a;
                j$.util.Objects.requireNonNull(ampnVar);
                amowVar5.av = ampnVar;
                amowVar5.d |= 524288;
                break;
            case 3:
                ampp amppVar = (ampp) obj;
                aooh.f(amppVar, "data");
                if (akzxVar != null) {
                    akzxVar.u();
                    amow amowVar7 = akzxVar.b;
                    amow amowVar8 = amow.a;
                    j$.util.Objects.requireNonNull(amppVar);
                    amowVar7.as = amppVar;
                    amowVar7.d |= 16384;
                }
                break;
            case 4:
                amqn amqnVar = (amqn) obj;
                aooh.f(akzxVar, "callEventBuilder");
                aooh.f(amqnVar, "data");
                akzxVar.u();
                amow amowVar9 = akzxVar.b;
                amow amowVar10 = amow.a;
                j$.util.Objects.requireNonNull(amqnVar);
                amowVar9.am = amqnVar;
                amowVar9.d |= 64;
                break;
            case 5:
                amny amnyVar = (amny) obj;
                aooh.f(akzxVar, "callEventBuilder");
                aooh.f(amnyVar, "data");
                akzxVar.u();
                amow amowVar11 = akzxVar.b;
                amow amowVar12 = amow.a;
                j$.util.Objects.requireNonNull(amnyVar);
                amowVar11.au = amnyVar;
                amowVar11.d |= 131072;
                break;
            case 6:
                j$.util.Optional optional = (j$.util.Optional) obj;
                j$.util.Objects.requireNonNull(akzxVar);
                oys oysVar = new oys(akzxVar, 10);
                if (true == optional.isPresent()) {
                    ampo ampoVar = (ampo) optional.get();
                    akzx akzxVar2 = (akzx) oysVar.a;
                    akzxVar2.u();
                    amow amowVar13 = akzxVar2.b;
                    amow amowVar14 = amow.a;
                    j$.util.Objects.requireNonNull(ampoVar);
                    amowVar13.aj = ampoVar;
                    amowVar13.d |= 2;
                }
                break;
            case 7:
                ampx ampxVar = (ampx) obj;
                aooh.f(akzxVar, "callEventBuilder");
                aooh.f(ampxVar, "data");
                akzxVar.u();
                amow amowVar15 = akzxVar.b;
                amow amowVar16 = amow.a;
                j$.util.Objects.requireNonNull(ampxVar);
                amowVar15.at = ampxVar;
                amowVar15.d |= 32768;
                break;
            case 8:
                amqx amqxVar = (amqx) obj;
                aooh.f(akzxVar, "callEventBuilder");
                aooh.f(amqxVar, "data");
                akzxVar.u();
                amow amowVar17 = akzxVar.b;
                amow amowVar18 = amow.a;
                j$.util.Objects.requireNonNull(amqxVar);
                amowVar17.aq = amqxVar;
                amowVar17.d |= 2048;
                break;
            case 9:
                amri amriVar = (amri) obj;
                aooh.f(akzxVar, "callEventBuilder");
                aooh.f(amriVar, "data");
                akzxVar.u();
                amow amowVar19 = akzxVar.b;
                amow amowVar20 = amow.a;
                j$.util.Objects.requireNonNull(amriVar);
                amowVar19.an = amriVar;
                amowVar19.d |= 256;
                break;
            case 10:
                amou amouVar = (amou) obj;
                akzxVar.u();
                amow amowVar21 = akzxVar.b;
                amow amowVar22 = amow.a;
                j$.util.Objects.requireNonNull(amouVar);
                amowVar21.T = amouVar;
                amowVar21.c |= 65536;
                break;
            default:
                amsw amswVar = (amsw) obj;
                aooh.f(akzxVar, "callEventBuilder");
                if (amswVar != null) {
                    akzxVar.u();
                    amow amowVar23 = akzxVar.b;
                    amow amowVar24 = amow.a;
                    j$.util.Objects.requireNonNull(amswVar);
                    amowVar23.ap = amswVar;
                    amowVar23.d |= 1024;
                }
                break;
        }
    }

    public jig(ajct ajctVar, uhs uhsVar, int i) {
        this.$cid = i;
        this.a = ajctVar;
        this.b = uhsVar;
    }

    public jig(aoss aossVar, defpackage.jif jifVar, int i) {
        this.$cid = i;
        aooh.f(aossVar, "lightweightScope");
        aooh.f(jifVar, "beeslyCallEventClearcutLogger");
        this.a = aossVar;
        this.b = jifVar;
    }

    public jig(aoss aossVar, defpackage.lrc lrcVar, int i) {
        this.$cid = i;
        aooh.f(aossVar, "lightweightScope");
        aooh.f(lrcVar, "contactCheckerInCallLogger");
        this.a = aossVar;
        this.b = lrcVar;
    }

    public jig(aoss aossVar, met metVar, int i) {
        this.$cid = i;
        aooh.f(aossVar, "lightweightScope");
        this.a = aossVar;
        this.b = metVar;
    }

    public jig(aoss aossVar, defpackage.ofc ofcVar, int i) {
        this.$cid = i;
        aooh.f(aossVar, "lightweightScope");
        aooh.f(ofcVar, "expressoInCallLogger");
        this.a = aossVar;
        this.b = ofcVar;
    }

    public jig(aoss aossVar, ozn oznVar, int i) {
        this.$cid = i;
        aooh.f(aossVar, "lightweightScope");
        aooh.f(oznVar, "metricsHolder");
        this.a = aossVar;
        this.b = oznVar;
    }

    public jig(aoss aossVar, pzm pzmVar, int i) {
        this.$cid = i;
        aooh.f(aossVar, "lightweightScope");
        aooh.f(pzmVar, "disclaimerControllerCallEventClearcutLogger");
        this.a = aossVar;
        this.b = pzmVar;
    }

    public jig(aoss aossVar, sbl sblVar, int i) {
        this.$cid = i;
        aooh.f(aossVar, "lightweightScope");
        this.a = aossVar;
        this.b = sblVar;
    }

    public jig(aoss aossVar, tpf tpfVar, int i) {
        this.$cid = i;
        aooh.f(aossVar, "lightweightScope");
        aooh.f(tpfVar, "sharpieCallEventClearcutLogger");
        this.a = aossVar;
        this.b = tpfVar;
    }

    public jig(voc vocVar, aoss aossVar, int i) {
        this.$cid = i;
        aooh.f(vocVar, "wearAudioTransferMetricsCoordinatorImpl");
        aooh.f(aossVar, "lightweightScope");
        this.b = vocVar;
        this.a = aossVar;
    }

    public jig(int i) {
        this.$cid = i;
        this.a = new java.util.concurrent.atomic.AtomicBoolean();
        this.b = new java.util.concurrent.atomic.AtomicBoolean();
    }
}
