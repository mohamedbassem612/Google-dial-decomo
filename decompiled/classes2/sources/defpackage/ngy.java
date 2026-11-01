package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ngy extends aomh implements aonn {
    java.lang.Object a;
    int b;
    final /* synthetic */ defpackage.ngz c;
    final /* synthetic */ defpackage.igb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ngy(defpackage.ngz ngzVar, defpackage.igb igbVar, aoln aolnVar) {
        super(2, aolnVar);
        this.c = ngzVar;
        this.d = igbVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0069  */
    /* JADX WARN: Code duplicated, block: B:28:0x0087  */
    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        defpackage.igb igbVarW;
        defpackage.ngz ngzVar;
        defpackage.ngz ngzVar2;
        defpackage.igb igbVar;
        defpackage.ngz ngzVar3;
        defpackage.igb igbVar2;
        aolu aoluVar = aolu.a;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                aooc.af(obj);
            } else if (i == 2) {
                aooc.af(obj);
                if (((defpackage.nmu) obj).v) {
                    defpackage.ngz.a.b().g(5, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/service/DobbyRawAudioListener", "onDownlinkAudioReceived$<anonymous>", 53, "DobbyRawAudioListener.kt").v("recording audio");
                    ngzVar2 = this.c;
                    igbVar = this.d;
                    this.b = 3;
                    if (ngzVar2.b.f(igbVar, this) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    defpackage.ngz.a.b().g(5, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/service/DobbyRawAudioListener", "onDownlinkAudioReceived$<anonymous>", 60, "DobbyRawAudioListener.kt").v("replace audio data with empty as it's before the beep");
                    defpackage.igb igbVar3 = this.d;
                    defpackage.heq heqVarK = defpackage.hhb.k(igbVar3.p());
                    akzc akzcVarU = akzc.u(new byte[igbVar3.c.c()]);
                    aooh.e(akzcVarU, "copyFrom(...)");
                    heqVarK.x(akzcVarU);
                    igbVarW = heqVarK.w();
                    ngzVar = this.c;
                    this.b = 4;
                    if (ngzVar.b.f(igbVarW, this) == aoluVar) {
                        return aoluVar;
                    }
                }
            } else if (i != 3 && i != 4 && i == 5) {
                obj2 = this.a;
                aooc.af(obj);
                if (!((nok) obj).f) {
                    defpackage.ngz.a.b().g(5, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/service/DobbyRawAudioListener", "onDownlinkAudioReceived$<anonymous>", 71, "DobbyRawAudioListener.kt").v("save call audio is disabled, do not record audio");
                    return aojh.a;
                }
                switch (((defpackage.nmo) obj2).ordinal()) {
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 10:
                    case 11:
                    case 12:
                        defpackage.ngz.a.b().g(5, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/service/DobbyRawAudioListener", "onDownlinkAudioReceived$<anonymous>", 84, "DobbyRawAudioListener.kt").v("recording audio");
                        ngzVar3 = this.c;
                        igbVar2 = this.d;
                        this.a = null;
                        this.b = 6;
                        if (ngzVar3.b.f(igbVar2, this) == aoluVar) {
                            return aoluVar;
                        }
                        break;
                }
            } else {
                aooc.af(obj);
            }
            return aojh.a;
        }
        aooc.af(obj);
        defpackage.ngz ngzVar4 = this.c;
        this.b = 1;
        obj = ngzVar4.d.a(this);
        if (obj == aoluVar) {
            return aoluVar;
        }
        defpackage.nmo nmoVarB = defpackage.nmo.b(((defpackage.nmu) obj).c);
        if (nmoVarB == null) {
            nmoVarB = defpackage.nmo.UNRECOGNIZED;
        }
        obj2 = nmoVarB;
        if (obj2 != defpackage.nmo.BEESLY && obj2 != defpackage.nmo.BEESLY_WITH_UI) {
            defpackage.ngz ngzVar5 = this.c;
            this.a = obj2;
            this.b = 5;
            obj = ngzVar5.c.b(this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            if (!((nok) obj).f) {
                defpackage.ngz.a.b().g(5, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/service/DobbyRawAudioListener", "onDownlinkAudioReceived$<anonymous>", 71, "DobbyRawAudioListener.kt").v("save call audio is disabled, do not record audio");
                return aojh.a;
            }
            switch (((defpackage.nmo) obj2).ordinal()) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 10:
                case 11:
                case 12:
                    defpackage.ngz.a.b().g(5, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/service/DobbyRawAudioListener", "onDownlinkAudioReceived$<anonymous>", 84, "DobbyRawAudioListener.kt").v("recording audio");
                    ngzVar3 = this.c;
                    igbVar2 = this.d;
                    this.a = null;
                    this.b = 6;
                    if (ngzVar3.b.f(igbVar2, this) == aoluVar) {
                        return aoluVar;
                    }
                    break;
            }
            return aojh.a;
        }
        defpackage.ngz ngzVar6 = this.c;
        this.b = 2;
        obj = ngzVar6.d.a(this);
        if (obj == aoluVar) {
            return aoluVar;
        }
        if (((defpackage.nmu) obj).v) {
            defpackage.ngz.a.b().g(5, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/service/DobbyRawAudioListener", "onDownlinkAudioReceived$<anonymous>", 53, "DobbyRawAudioListener.kt").v("recording audio");
            ngzVar2 = this.c;
            igbVar = this.d;
            this.b = 3;
            if (ngzVar2.b.f(igbVar, this) == aoluVar) {
                return aoluVar;
            }
        } else {
            defpackage.ngz.a.b().g(5, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/service/DobbyRawAudioListener", "onDownlinkAudioReceived$<anonymous>", 60, "DobbyRawAudioListener.kt").v("replace audio data with empty as it's before the beep");
            defpackage.igb igbVar4 = this.d;
            defpackage.heq heqVarK2 = defpackage.hhb.k(igbVar4.p());
            akzc akzcVarU2 = akzc.u(new byte[igbVar4.c.c()]);
            aooh.e(akzcVarU2, "copyFrom(...)");
            heqVarK2.x(akzcVarU2);
            igbVarW = heqVarK2.w();
            ngzVar = this.c;
            this.b = 4;
            if (ngzVar.b.f(igbVarW, this) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.ngy(this.c, this.d, aolnVar);
    }
}
