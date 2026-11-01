package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class jsd implements defpackage.dxx {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ jsd(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v100, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r7v38, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v45, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v49, types: [ahyc, java.lang.Object] */
    @Override // defpackage.dxx
    public final java.lang.Object a(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                defpackage.aimz aimzVar = defpackage.jsk.a;
                defpackage.akzx akzxVarL = ((defpackage.jsm) obj).L();
                defpackage.jsm jsmVar = (defpackage.jsm) this.a;
                long j = jsmVar.c;
                akzxVarL.u();
                defpackage.jsm jsmVar2 = (defpackage.jsm) akzxVarL.b;
                jsmVar2.b |= 1;
                jsmVar2.c = j;
                if ((jsmVar.b & 2) != 0) {
                    long j2 = jsmVar.d;
                    akzxVarL.u();
                    defpackage.jsm jsmVar3 = (defpackage.jsm) akzxVarL.b;
                    jsmVar3.b |= 2;
                    jsmVar3.d = j2;
                }
                return (defpackage.jsm) akzxVarL.r();
            case 1:
                defpackage.akzx akzxVarL2 = ((defpackage.jos) obj).L();
                akzxVarL2.u();
                ((defpackage.jos) akzxVarL2.b).b = ((jor) this.a).a();
                return (defpackage.jos) akzxVarL2.r();
            case 2:
                defpackage.akzx akzxVarL3 = ((defpackage.jtu) obj).L();
                long jLongValue = ((defpackage.jtw) this.a).b.longValue();
                akzxVarL3.u();
                defpackage.jtu jtuVar = (defpackage.jtu) akzxVarL3.b;
                jtuVar.b |= 1;
                jtuVar.c = jLongValue;
                return (defpackage.jtu) akzxVarL3.r();
            case 3:
                defpackage.akzx akzxVarM = jtz.a.m();
                java.lang.Iterable iterable = (java.lang.Iterable) j$.util.Collection.-EL.stream(((jtz) obj).b).filter(new jty(this.a, 2)).collect(defpackage.aido.a);
                akzxVarM.u();
                jtz jtzVar = akzxVarM.b;
                jtzVar.b();
                defpackage.akyl.i(iterable, jtzVar.b);
                return akzxVarM.r();
            case 4:
                defpackage.akzx akzxVarL4 = ((jtz) obj).L();
                akzxVarL4.u();
                jtz jtzVar2 = akzxVarL4.b;
                java.lang.Object obj2 = this.a;
                j$.util.Objects.requireNonNull(obj2);
                jtzVar2.b();
                jtzVar2.b.add(obj2);
                return akzxVarL4.r();
            case 5:
                defpackage.akzx akzxVarL5 = ((jvm) obj).L();
                akzxVarL5.u();
                jvm jvmVar = akzxVarL5.b;
                java.lang.Object obj3 = this.a;
                j$.util.Objects.requireNonNull(obj3);
                jvmVar.f = (zai) obj3;
                jvmVar.b |= 1;
                return akzxVarL5.r();
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.akzm akzmVar = jve.a;
                return ((defpackage.akzx) this.a).r();
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.kvi kviVar = (defpackage.kvi) obj;
                java.util.Set set = (java.util.Set) j$.util.Collection.-EL.stream((java.util.Collection) this.a).map(new kle(5)).collect(j$.util.stream.Collectors.toCollection(new iaz(5)));
                set.removeAll(new java.util.HashSet(kviVar.d));
                defpackage.akzx akzxVarL6 = kviVar.L();
                akzxVarL6.H(set);
                return (defpackage.kvi) akzxVarL6.r();
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.kvi kviVar2 = (defpackage.kvi) obj;
                java.util.HashSet hashSet = new java.util.HashSet(kviVar2.d);
                hashSet.removeAll(this.a);
                defpackage.akzx akzxVarL7 = kviVar2.L();
                akzxVarL7.u();
                ((defpackage.kvi) akzxVarL7.b).d = defpackage.albq.a;
                akzxVarL7.H(hashSet);
                return (defpackage.kvi) akzxVarL7.r();
            case 9:
                return (defpackage.kwy) this.a.apply((defpackage.kwy) obj);
            case 10:
                lii liiVar = (lii) obj;
                defpackage.akzx akzxVarL8 = liiVar.L();
                lim limVar = liiVar.c;
                if (limVar == null) {
                    limVar = lim.a;
                }
                java.lang.Object obj4 = this.a;
                defpackage.akzx akzxVarL9 = limVar.L();
                lim limVar2 = liiVar.c;
                if (limVar2 == null) {
                    limVar2 = lim.a;
                }
                liq liqVar = limVar2.d;
                if (liqVar == null) {
                    liqVar = liq.a;
                }
                liq liqVarC = ((lij) obj4).b.c(liqVar.b, lin.b, lio.d);
                akzxVarL9.u();
                lim limVar3 = akzxVarL9.b;
                j$.util.Objects.requireNonNull(liqVarC);
                limVar3.d = liqVarC;
                limVar3.b |= 1;
                akzxVarL8.u();
                lii liiVar2 = akzxVarL8.b;
                lim limVarR = akzxVarL9.r();
                j$.util.Objects.requireNonNull(limVarR);
                liiVar2.c = limVarR;
                liiVar2.b |= 1;
                akzxVarL8.u();
                akzxVarL8.b.f = true;
                return akzxVarL8.r();
            case 11:
                lii liiVar3 = (lii) obj;
                defpackage.akzx akzxVarL10 = liiVar3.L();
                defpackage.alcf alcfVarE = defpackage.aldi.e(j$.time.Instant.now().toEpochMilli());
                akzxVarL10.u();
                lii liiVar4 = akzxVarL10.b;
                j$.util.Objects.requireNonNull(alcfVarE);
                liiVar4.e = alcfVarE;
                liiVar4.b |= 4;
                lim limVar4 = liiVar3.c;
                if (limVar4 == null) {
                    limVar4 = lim.a;
                }
                java.lang.Object obj5 = this.a;
                defpackage.akzx akzxVarL11 = limVar4.L();
                lim limVar5 = liiVar3.c;
                if (limVar5 == null) {
                    limVar5 = lim.a;
                }
                liq liqVar2 = limVar5.d;
                if (liqVar2 == null) {
                    liqVar2 = liq.a;
                }
                liq liqVarC2 = ((lij) obj5).b.c(liqVar2.b, lin.c, lio.a);
                akzxVarL11.u();
                lim limVar6 = akzxVarL11.b;
                j$.util.Objects.requireNonNull(liqVarC2);
                limVar6.d = liqVarC2;
                limVar6.b |= 1;
                akzxVarL10.u();
                lii liiVar5 = akzxVarL10.b;
                lim limVarR2 = akzxVarL11.r();
                j$.util.Objects.requireNonNull(limVarR2);
                liiVar5.c = limVarR2;
                liiVar5.b |= 1;
                return akzxVarL10.r();
            case 12:
                lii liiVar6 = (lii) obj;
                defpackage.akzx akzxVarL12 = liiVar6.L();
                lim limVar7 = liiVar6.c;
                if (limVar7 == null) {
                    limVar7 = lim.a;
                }
                java.lang.Object obj6 = this.a;
                defpackage.akzx akzxVarL13 = limVar7.L();
                lim limVar8 = liiVar6.c;
                if (limVar8 == null) {
                    limVar8 = lim.a;
                }
                liq liqVar3 = limVar8.d;
                if (liqVar3 == null) {
                    liqVar3 = liq.a;
                }
                liq liqVarC3 = ((lij) obj6).b.c(liqVar3.b, lin.b, lio.a);
                akzxVarL13.u();
                lim limVar9 = akzxVarL13.b;
                j$.util.Objects.requireNonNull(liqVarC3);
                limVar9.d = liqVarC3;
                limVar9.b |= 1;
                akzxVarL12.u();
                lii liiVar7 = akzxVarL12.b;
                lim limVarR3 = akzxVarL13.r();
                j$.util.Objects.requireNonNull(limVarR3);
                liiVar7.c = limVarR3;
                liiVar7.b |= 1;
                akzxVarL12.u();
                akzxVarL12.b.f = false;
                return akzxVarL12.r();
            case 13:
                defpackage.akzm akzmVar2 = lil.a;
                return this.a;
            case 14:
                defpackage.aimz aimzVar2 = defpackage.nyh.a;
                defpackage.akzx akzxVarL14 = ((defpackage.nwy) obj).L();
                akzxVarL14.u();
                defpackage.nwy nwyVar = (defpackage.nwy) akzxVarL14.b;
                nwyVar.c = ((defpackage.nwv) this.a).a();
                nwyVar.b |= 1;
                return (defpackage.nwy) akzxVarL14.r();
            case 15:
                java.util.ArrayList arrayList = new java.util.ArrayList();
                j$.lang.Iterable.-EL.forEach(((defpackage.olw) obj).b, new fcg(arrayList, 17));
                defpackage.akzx akzxVarM2 = defpackage.olw.a.m();
                akzxVarM2.M(arrayList);
                return (defpackage.olw) akzxVarM2.r();
            case 16:
                if (((defpackage.olw) obj).b.size() != 0) {
                    ((defpackage.ome) this.a).b.o(defpackage.rmx.LEGACY_CALL_SPECIFIC_PSD_DATA_STORE_CLEARED);
                }
                return defpackage.olw.a;
            case 17:
                ozs ozsVar = (ozs) obj;
                boolean z = ozsVar.c;
                java.lang.Object obj7 = this.a;
                if (z) {
                    defpackage.mni.cx(new lye(obj7, 16));
                    ((ozt) obj7).c.n(defpackage.rmw.EVENT_ANSWER_HINT_DEACTIVATED);
                    ((defpackage.aimw) ((defpackage.aimw) ozt.a.b()).l("com/android/dialer/incall/answer/paw/impl/PawSecretCodeReceiver", "onReceive", 76, "PawSecretCodeReceiver.java")).v("PawAnswerHint disabled");
                    defpackage.akzx akzxVarL15 = ozsVar.L();
                    akzxVarL15.u();
                    ozs ozsVar2 = akzxVarL15.b;
                    ozsVar2.b |= 1;
                    ozsVar2.c = false;
                    return akzxVarL15.r();
                }
                defpackage.mni.cx(new lye(obj7, 17));
                ((ozt) obj7).c.n(defpackage.rmw.EVENT_ANSWER_HINT_ACTIVATED);
                ((defpackage.aimw) ((defpackage.aimw) ozt.a.b()).l("com/android/dialer/incall/answer/paw/impl/PawSecretCodeReceiver", "onReceive", 83, "PawSecretCodeReceiver.java")).v("PawAnswerHint enabled");
                defpackage.akzx akzxVarL16 = ozsVar.L();
                akzxVarL16.u();
                ozs ozsVar3 = akzxVarL16.b;
                ozsVar3.b |= 1;
                ozsVar3.c = true;
                return akzxVarL16.r();
            case 18:
                defpackage.akzx akzxVarL17 = ((defpackage.rno) obj).L();
                akzxVarL17.u();
                defpackage.rno rnoVar = (defpackage.rno) akzxVarL17.b;
                java.lang.Object obj8 = this.a;
                j$.util.Objects.requireNonNull(obj8);
                rnoVar.b |= 1;
                rnoVar.c = (java.lang.String) obj8;
                return (defpackage.rno) akzxVarL17.r();
            case 19:
                return this.a;
            default:
                defpackage.akzx akzxVarL18 = ((defpackage.tbf) obj).L();
                akzxVarL18.u();
                defpackage.tbf tbfVar = (defpackage.tbf) akzxVarL18.b;
                tbfVar.e = ((tbe) this.a).e;
                tbfVar.b |= 4;
                return (defpackage.tbf) akzxVarL18.r();
        }
    }
}
