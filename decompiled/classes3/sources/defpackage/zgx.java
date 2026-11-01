package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zgx {
    private static final aimz a = aimz.i("com/google/android/callingshared/peertopeer/transport/rcs/outbound/MessageSender");
    private final aolr b;
    private final defpackage.yqt c;
    private final defpackage.abtr d;
    private final zzx e;
    private final defpackage.rai f;

    public zgx(aolr aolrVar, defpackage.abtr abtrVar, defpackage.yqt yqtVar, defpackage.rai raiVar, zzx zzxVar) {
        aooh.f(aolrVar, "blockingContext");
        aooh.f(abtrVar, "rcsDeliveryTracker");
        aooh.f(raiVar, "messageSenderMetricFactory");
        this.b = aolrVar;
        this.d = abtrVar;
        this.c = yqtVar;
        this.f = raiVar;
        this.e = zzxVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.zfd zfdVar, defpackage.zff zffVar, defpackage.zfx zfxVar, aoln aolnVar) {
        defpackage.zgr zgrVar;
        java.lang.String str;
        if (aolnVar instanceof defpackage.zgr) {
            zgrVar = (defpackage.zgr) aolnVar;
            int i = zgrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zgrVar.c = i - Integer.MIN_VALUE;
            } else {
                zgrVar = new defpackage.zgr(this, aolnVar);
            }
        } else {
            zgrVar = new defpackage.zgr(this, aolnVar);
        }
        defpackage.zgr zgrVar2 = zgrVar;
        java.lang.Object objB = zgrVar2.a;
        aolu aoluVar = aolu.a;
        int i2 = zgrVar2.c;
        if (i2 == 0) {
            aooc.af(objB);
            defpackage.zoe zoeVarC = wsc.C(defpackage.zge.a.m());
            aooh.f(zfxVar, "value");
            akzx akzxVar = (akzx) zoeVarC.a;
            akzxVar.u();
            defpackage.zge zgeVar = (defpackage.zge) akzxVar.b;
            j$.util.Objects.requireNonNull(zfxVar);
            zgeVar.c = zfxVar;
            zgeVar.b = 3;
            defpackage.zge zgeVarV = zoeVarC.v();
            defpackage.zfw zfwVar = (zgeVarV.b == 3 ? (defpackage.zfx) zgeVarV.c : defpackage.zfx.a).c;
            if (zfwVar == null) {
                zfwVar = defpackage.zfw.a;
            }
            java.lang.String str2 = zfwVar.b;
            aooh.e(str2, "getMessageId(...)");
            zgrVar2.d = str2;
            zgrVar2.c = 1;
            objB = b(zfdVar, zffVar, zgeVarV, str2, zgrVar2);
            if (objB == aoluVar) {
                return aoluVar;
            }
            str = str2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = zgrVar2.d;
            aooc.af(objB);
        }
        return new defpackage.zfn((defpackage.zfm) objB, str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final java.lang.Object b(defpackage.zfd zfdVar, defpackage.zff zffVar, defpackage.zge zgeVar, java.lang.String str, aoln aolnVar) {
        defpackage.zgs zgsVar;
        java.lang.Object objN;
        if (aolnVar instanceof defpackage.zgs) {
            zgsVar = (defpackage.zgs) aolnVar;
            int i = zgsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zgsVar.c = i - Integer.MIN_VALUE;
            } else {
                zgsVar = new defpackage.zgs(this, aolnVar);
            }
        } else {
            zgsVar = new defpackage.zgs(this, aolnVar);
        }
        java.lang.Object obj = zgsVar.a;
        aolu aoluVar = aolu.a;
        int i2 = zgsVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            defpackage.yqt yqtVar = this.c;
            aolr aolrVar = this.b;
            defpackage.zgt zgtVar = new defpackage.zgt(zfdVar, zffVar, str, zgeVar, (aoln) null, 0);
            zgsVar.c = 1;
            objN = wsc.n(yqtVar, aolrVar, zgtVar, zgsVar);
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
            return defpackage.zfm.c;
        }
        aooc.af(objN);
        defpackage.yrj yrjVar = (defpackage.yrj) objN;
        defpackage.amhh amhhVar = yrjVar.b;
        if (amhhVar == null) {
            amhhVar = defpackage.amhh.a;
        }
        defpackage.amhf amhfVarB = defpackage.amhf.b(amhhVar.b);
        if (amhfVarB == null) {
            amhfVarB = defpackage.amhf.UNRECOGNIZED;
        }
        if (amhfVarB == defpackage.amhf.OK) {
            return defpackage.zfm.a;
        }
        aimw aimwVarL = a.d().l("com/google/android/callingshared/peertopeer/transport/rcs/outbound/MessageSender", "sendMessageInternal", 222, "MessageSender.kt");
        aepg aepgVar = new aepg(amhfVarB);
        defpackage.amhh amhhVar2 = yrjVar.b;
        if (amhhVar2 == null) {
            amhhVar2 = defpackage.amhh.a;
        }
        java.lang.Integer num = new java.lang.Integer(amhhVar2.b);
        defpackage.amhh amhhVar3 = yrjVar.b;
        if (amhhVar3 == null) {
            amhhVar3 = defpackage.amhh.a;
        }
        aimwVarL.M("RCS service rejected the outbound message, status: %s (%d), message: %s", aepgVar, num, amhhVar3.c);
        return defpackage.zfm.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r1v1, types: [aolr, java.lang.Object] */
    public final java.lang.Object c(defpackage.zfd zfdVar, defpackage.zff zffVar, defpackage.zdv zdvVar, byte[] bArr, j$.time.Duration duration, aoln aolnVar) {
        defpackage.zgu zguVar;
        java.lang.String str;
        defpackage.aprf aprfVar;
        if (aolnVar instanceof defpackage.zgu) {
            zguVar = (defpackage.zgu) aolnVar;
            int i = zguVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zguVar.c = i - Integer.MIN_VALUE;
            } else {
                zguVar = new defpackage.zgu(this, aolnVar);
            }
        } else {
            zguVar = new defpackage.zgu(this, aolnVar);
        }
        defpackage.zgu zguVar2 = zguVar;
        java.lang.Object objAj = zguVar2.a;
        aolu aoluVar = aolu.a;
        int i2 = zguVar2.c;
        if (i2 == 0) {
            aooc.af(objAj);
            this.e.l(new zbq(defpackage.zbr.bx));
            defpackage.aprf aprfVarX = this.f.x(defpackage.zfj.c);
            aprfVarX.t(zfl.b);
            java.lang.String string = java.util.UUID.randomUUID().toString();
            aooh.e(string, "toString(...)");
            defpackage.zoe zoeVarC = wsc.C(defpackage.zge.a.m());
            defpackage.zfy zfyVar = defpackage.zfy.a;
            akzx akzxVarM = zfyVar.m();
            aooh.f(akzxVarM, "builder");
            defpackage.zoe zoeVarB = wsc.B(defpackage.zgf.a.m());
            zoeVarB.u(zdvVar);
            akzc akzcVarU = akzc.u(bArr);
            aooh.e(akzcVarU, "copyFrom(...)");
            zoeVarB.t(akzcVarU);
            defpackage.zgf zgfVarS = zoeVarB.s();
            aooh.f(zgfVarS, "value");
            akzxVarM.u();
            defpackage.zfy zfyVar2 = (defpackage.zfy) akzxVarM.b;
            j$.util.Objects.requireNonNull(zgfVarS);
            zfyVar2.c = zgfVarS;
            zfyVar2.b |= 1;
            akzx akzxVarM2 = defpackage.zfw.a.m();
            aooh.f(akzxVarM2, "builder");
            aooh.f(string, "value");
            akzxVarM2.u();
            defpackage.zfw zfwVar = (defpackage.zfw) akzxVarM2.b;
            j$.util.Objects.requireNonNull(string);
            zfwVar.b = string;
            alad aladVarP = akzxVarM2.p();
            aooh.e(aladVarP, "build(...)");
            defpackage.zfw zfwVar2 = (defpackage.zfw) aladVarP;
            aooh.f(zfwVar2, "value");
            akzxVarM.u();
            defpackage.zfy zfyVar3 = (defpackage.zfy) akzxVarM.b;
            j$.util.Objects.requireNonNull(zfwVar2);
            zfyVar3.d = zfwVar2;
            zfyVar3.b |= 2;
            alad aladVarP2 = akzxVarM.p();
            aooh.e(aladVarP2, "build(...)");
            defpackage.zfy zfyVar4 = (defpackage.zfy) aladVarP2;
            aooh.f(zfyVar4, "value");
            akzx akzxVar = (akzx) zoeVarC.a;
            akzxVar.u();
            defpackage.zge zgeVar = (defpackage.zge) akzxVar.b;
            j$.util.Objects.requireNonNull(zfyVar4);
            zgeVar.c = zfyVar4;
            zgeVar.b = 2;
            defpackage.zge zgeVarV = zoeVarC.v();
            defpackage.abtr abtrVar = this.d;
            if (zgeVarV.b == 2) {
                zfyVar = (defpackage.zfy) zgeVarV.c;
            }
            defpackage.zfy zfyVar5 = zfyVar;
            aooh.e(zfyVar5, "getAckableStandardMessage(...)");
            defpackage.zgv zgvVar = new defpackage.zgv(this, zfdVar, zffVar, zgeVarV, string, null);
            zguVar2.e = aprfVarX;
            zguVar2.d = string;
            zguVar2.c = 1;
            objAj = aoov.aj((aolr) abtrVar.f, new defpackage.zgb(zfyVar5, duration, abtrVar, zgvVar, (aoln) null, 0), zguVar2);
            if (objAj == aoluVar) {
                return aoluVar;
            }
            str = string;
            aprfVar = aprfVarX;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = zguVar2.d;
            aprfVar = zguVar2.e;
            aooc.af(objAj);
        }
        defpackage.zfm zfmVar = (defpackage.zfm) objAj;
        if (zfmVar.ordinal() != 0) {
            aprfVar.t(zfl.d);
        } else {
            aprfVar.t(zfl.c);
        }
        return new defpackage.zfn(zfmVar, str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(defpackage.zfd zfdVar, defpackage.zff zffVar, defpackage.zdv zdvVar, byte[] bArr, aoln aolnVar) {
        defpackage.zgw zgwVar;
        defpackage.aprf aprfVar;
        java.lang.String str;
        if (aolnVar instanceof defpackage.zgw) {
            zgwVar = (defpackage.zgw) aolnVar;
            int i = zgwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zgwVar.c = i - Integer.MIN_VALUE;
            } else {
                zgwVar = new defpackage.zgw(this, aolnVar);
            }
        } else {
            zgwVar = new defpackage.zgw(this, aolnVar);
        }
        defpackage.zgw zgwVar2 = zgwVar;
        java.lang.Object obj = zgwVar2.a;
        aolu aoluVar = aolu.a;
        int i2 = zgwVar2.c;
        if (i2 == 0) {
            aooc.af(obj);
            defpackage.aprf aprfVarX = this.f.x(defpackage.zfj.b);
            aprfVarX.t(zfl.b);
            this.e.l(new zbq(defpackage.zbr.bw));
            defpackage.zoe zoeVarC = wsc.C(defpackage.zge.a.m());
            akzx akzxVarM = defpackage.zgg.a.m();
            aooh.f(akzxVarM, "builder");
            defpackage.zoe zoeVarB = wsc.B(defpackage.zgf.a.m());
            zoeVarB.u(zdvVar);
            akzc akzcVarU = akzc.u(bArr);
            aooh.e(akzcVarU, "copyFrom(...)");
            zoeVarB.t(akzcVarU);
            defpackage.zgf zgfVarS = zoeVarB.s();
            aooh.f(zgfVarS, "value");
            akzxVarM.u();
            defpackage.zgg zggVar = (defpackage.zgg) akzxVarM.b;
            j$.util.Objects.requireNonNull(zgfVarS);
            zggVar.c = zgfVarS;
            zggVar.b |= 1;
            alad aladVarP = akzxVarM.p();
            aooh.e(aladVarP, "build(...)");
            defpackage.zgg zggVar2 = (defpackage.zgg) aladVarP;
            aooh.f(zggVar2, "value");
            akzx akzxVar = (akzx) zoeVarC.a;
            akzxVar.u();
            defpackage.zge zgeVar = (defpackage.zge) akzxVar.b;
            j$.util.Objects.requireNonNull(zggVar2);
            zgeVar.c = zggVar2;
            zgeVar.b = 1;
            defpackage.zge zgeVarV = zoeVarC.v();
            java.lang.String string = java.util.UUID.randomUUID().toString();
            aooh.e(string, "toString(...)");
            zgwVar2.e = aprfVarX;
            zgwVar2.d = string;
            zgwVar2.c = 1;
            java.lang.Object objB = b(zfdVar, zffVar, zgeVarV, string, zgwVar2);
            if (objB == aoluVar) {
                return aoluVar;
            }
            aprfVar = aprfVarX;
            obj = objB;
            str = string;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = zgwVar2.d;
            aprfVar = zgwVar2.e;
            aooc.af(obj);
        }
        defpackage.zfm zfmVar = (defpackage.zfm) obj;
        if (zfmVar.ordinal() != 0) {
            aprfVar.t(zfl.d);
        } else {
            aprfVar.t(zfl.c);
        }
        return new defpackage.zfn(zfmVar, str);
    }
}
