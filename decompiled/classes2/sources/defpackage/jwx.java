package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class jwx implements java.util.function.BiConsumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ jwx(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:18:0x0053  */
    /* JADX WARN: Code duplicated, block: B:21:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    /* JADX WARN: Type inference failed for: r6v18, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v19, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v20, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v30, types: [allj, java.lang.Object] */
    @Override // java.util.function.BiConsumer
    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.mhg mhgVar;
        alko alkoVar;
        int iOrdinal;
        switch (this.$cid) {
            case 0:
                ((android.os.BaseBundle) this.a).putLong((java.lang.String) obj, ((java.lang.Long) obj2).longValue());
                break;
            case 1:
                ((android.os.BaseBundle) this.a).putString((java.lang.String) obj, (java.lang.String) obj2);
                break;
            case 2:
                ((android.os.BaseBundle) this.a).putBoolean((java.lang.String) obj, ((java.lang.Boolean) obj2).booleanValue());
                break;
            case 3:
                ((android.os.BaseBundle) this.a).putString((java.lang.String) obj, (java.lang.String) obj2);
                break;
            case 4:
                ((android.os.BaseBundle) this.a).putLong((java.lang.String) obj, ((java.lang.Long) obj2).longValue());
                break;
            case 5:
                ((android.os.BaseBundle) this.a).putBoolean((java.lang.String) obj, ((java.lang.Boolean) obj2).booleanValue());
                break;
            case 6:
                java.lang.String str = (java.lang.String) obj;
                ahbb ahbbVar = (ahbb) obj2;
                akzx akzxVarM = defpackage.mhg.a.m();
                akzxVarM.u();
                defpackage.mhg mhgVar2 = (defpackage.mhg) akzxVarM.b;
                j$.util.Objects.requireNonNull(str);
                mhgVar2.b |= 1;
                mhgVar2.e = str;
                int i = ahbbVar.g - 1;
                if (i == 0) {
                    long jB = ahbbVar.b();
                    akzxVarM.u();
                    defpackage.mhg mhgVar3 = (defpackage.mhg) akzxVarM.b;
                    mhgVar3.c = 2;
                    mhgVar3.d = java.lang.Long.valueOf(jB);
                    mhgVar = (defpackage.mhg) akzxVarM.p();
                } else if (i == 1) {
                    boolean zE = ahbbVar.e();
                    akzxVarM.u();
                    defpackage.mhg mhgVar4 = (defpackage.mhg) akzxVarM.b;
                    mhgVar4.c = 3;
                    mhgVar4.d = java.lang.Boolean.valueOf(zE);
                    mhgVar = (defpackage.mhg) akzxVarM.p();
                } else if (i == 2) {
                    double dA = ahbbVar.a();
                    akzxVarM.u();
                    defpackage.mhg mhgVar5 = (defpackage.mhg) akzxVarM.b;
                    mhgVar5.c = 4;
                    mhgVar5.d = java.lang.Double.valueOf(dA);
                    mhgVar = (defpackage.mhg) akzxVarM.p();
                } else if (i == 3) {
                    java.lang.String strD = ahbbVar.d();
                    akzxVarM.u();
                    defpackage.mhg mhgVar6 = (defpackage.mhg) akzxVarM.b;
                    j$.util.Objects.requireNonNull(strD);
                    mhgVar6.c = 5;
                    mhgVar6.d = strD;
                    mhgVar = (defpackage.mhg) akzxVarM.p();
                } else if (i != 4) {
                    akzc akzcVarF = ahbbVar.c().f();
                    akzxVarM.u();
                    defpackage.mhg mhgVar7 = (defpackage.mhg) akzxVarM.b;
                    j$.util.Objects.requireNonNull(akzcVarF);
                    mhgVar7.c = 7;
                    mhgVar7.d = akzcVarF;
                    mhgVar = (defpackage.mhg) akzxVarM.p();
                } else {
                    java.lang.Object objA = ahbbVar.d.a();
                    aooh.d(objA, "null cannot be cast to non-null type com.google.protobuf.ByteString");
                    akzc akzcVar = (akzc) objA;
                    akzxVarM.u();
                    defpackage.mhg mhgVar8 = (defpackage.mhg) akzxVarM.b;
                    j$.util.Objects.requireNonNull(akzcVar);
                    mhgVar8.c = 6;
                    mhgVar8.d = akzcVar;
                    mhgVar = (defpackage.mhg) akzxVarM.p();
                }
                akzx akzxVar = (akzx) this.a;
                akzxVar.u();
                defpackage.mhh mhhVar = (defpackage.mhh) akzxVar.b;
                defpackage.mhh mhhVar2 = defpackage.mhh.a;
                j$.util.Objects.requireNonNull(mhgVar);
                alat alatVar = mhhVar.b;
                if (!alatVar.c()) {
                    mhhVar.b = alad.J(alatVar);
                }
                mhhVar.b.add(mhgVar);
                break;
            case 7:
                this.a.a(obj, obj2);
                break;
            case 8:
                this.a.a(obj, obj2);
                break;
            case 9:
                this.a.a(obj, obj2);
                break;
            case 10:
                android.content.ContentValues contentValues = (android.content.ContentValues) obj2;
                ucu ucuVar = (ucu) ((aigf) this.a).get(contentValues.getAsString("call_mapping_id"));
                if (ucuVar != null) {
                    contentValues.put("spam_status", ucuVar.i());
                }
                break;
            case 11:
                upo upoVar = (upo) obj;
                if (((java.lang.Boolean) obj2).booleanValue()) {
                    j$.util.Map.-EL.putIfAbsent((java.util.Map) this.a, upoVar, (java.lang.Object) null);
                }
                break;
            case 12:
                j$.util.Collection.-EL.stream((aihd) obj2).forEach(new agzo(this.a, (allg) obj, 4));
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                java.lang.StringBuilder sb = (java.lang.StringBuilder) obj;
                alkn alknVar = (alkn) obj2;
                alkm alkmVar = alknVar.a;
                alkm alkmVar2 = alkm.b;
                boolean zEquals = alkmVar.equals(alkmVar2);
                java.lang.Object obj3 = this.a;
                if (zEquals) {
                    alko alkoVar2 = (alko) obj3;
                    j$.util.Optional optionalEmpty = alkoVar2.e;
                    if (true == optionalEmpty.isPresent() && true != ((alkm) optionalEmpty.get()).equals(alkmVar2)) {
                        optionalEmpty = j$.util.Optional.empty();
                    }
                    if (optionalEmpty.isPresent()) {
                        sb.append(alkoVar2.d);
                    } else {
                        alkoVar = (alko) obj3;
                        if (alkoVar.e.isPresent()) {
                            sb.append(alkoVar.c);
                        }
                        iOrdinal = alkmVar.ordinal();
                        if (iOrdinal != 0) {
                            sb.append(alkoVar.b);
                        } else if (iOrdinal == 1) {
                            sb.append(alkoVar.a);
                        }
                    }
                } else {
                    alkoVar = (alko) obj3;
                    if (alkoVar.e.isPresent()) {
                        sb.append(alkoVar.c);
                    }
                    iOrdinal = alkmVar.ordinal();
                    if (iOrdinal != 0) {
                        sb.append(alkoVar.b);
                    } else if (iOrdinal == 1) {
                        sb.append(alkoVar.a);
                    }
                }
                sb.append(alknVar.b);
                ((alko) obj3).e = j$.util.Optional.of(alkmVar);
                break;
            default:
                this.a.a((almz) obj, (almy) obj2);
                break;
        }
    }

    @Override // java.util.function.BiConsumer
    public final /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                break;
            default:
                break;
        }
        return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
    }
}
