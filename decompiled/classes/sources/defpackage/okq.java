package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class okq implements java.util.function.Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ okq(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
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
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                break;
            case 9:
                break;
            default:
                break;
        }
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v18, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v47, types: [aonj, java.lang.Object] */
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        defpackage.akzx akzxVarL;
        defpackage.ajdd ajddVar;
        int i = 2;
        switch (this.$cid) {
            case 0:
                return this.a.a(obj);
            case 1:
                return (lbh) ((defpackage.aigf) this.a).get(java.lang.Long.valueOf(((kdy) obj).b));
            case 2:
                defpackage.mhc mhcVar = (defpackage.mhc) obj;
                if (mhcVar == null) {
                    defpackage.aooh.i("value");
                }
                java.lang.Object obj2 = this.a;
                defpackage.akzx akzxVarM = defpackage.mhc.a.m();
                int i2 = mhcVar.b;
                if (i2 == 6) {
                    akzxVarL = (i2 == 6 ? (defpackage.mha) mhcVar.c : defpackage.mha.a).L();
                    defpackage.mhc mhcVarAw = defpackage.gus.aw((java.lang.String) obj2);
                    akzxVarL.u();
                    defpackage.mha mhaVar = (defpackage.mha) akzxVarL.b;
                    j$.util.Objects.requireNonNull(mhcVarAw);
                    mhaVar.b();
                    mhaVar.b.add(0, mhcVarAw);
                } else {
                    defpackage.akzx akzxVarM2 = defpackage.mha.a.m();
                    java.util.List listAsList = java.util.Arrays.asList(defpackage.gus.aw((java.lang.String) obj2), mhcVar);
                    defpackage.aooh.e(listAsList, "asList(...)");
                    akzxVarM2.K(listAsList);
                    akzxVarL = akzxVarM2;
                }
                akzxVarM.u();
                defpackage.mhc mhcVar2 = (defpackage.mhc) akzxVarM.b;
                defpackage.mha mhaVar2 = (defpackage.mha) akzxVarL.r();
                j$.util.Objects.requireNonNull(mhaVar2);
                mhcVar2.c = mhaVar2;
                mhcVar2.b = 6;
                return (defpackage.mhc) akzxVarM.r();
            case 3:
                return this.a.a(obj);
            case 4:
                java.lang.String[] strArr = defpackage.vva.a;
                return (spn) ((defpackage.aigf) this.a).getOrDefault(((hkd) obj).c, spn.a);
            case 5:
                return ((defpackage.vzh) this.a).c((defpackage.vzi) obj);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.adqe adqeVar = (defpackage.adqe) this.a;
                return adqeVar.e((defpackage.adnv) obj, adqeVar.f);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((defpackage.adqq) obj).c((defpackage.adnv) this.a);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                java.lang.Object obj3 = this.a;
                defpackage.adnv adnvVar = (defpackage.adnv) obj;
                try {
                    java.io.File fileB = ((defpackage.adqo) obj3).c.b(adnvVar.a, adnvVar.b);
                    boolean zExists = fileB.exists();
                    if (fileB.isFile()) {
                        if (fileB.canRead()) {
                            return fileB == null ? defpackage.ajcm.a : new defpackage.ajcm(fileB);
                        }
                        ajddVar = new defpackage.ajdd(new java.lang.SecurityException("No permissions to read file ".concat(java.lang.String.valueOf(java.lang.String.valueOf(fileB)))));
                    } else {
                        if (!zExists) {
                            defpackage.adqo adqoVar = (defpackage.adqo) obj3;
                            defpackage.ajcq ajcqVar = (defpackage.ajcq) j$.util.concurrent.ConcurrentMap.-EL.computeIfAbsent(adqoVar.e, adnvVar, new defpackage.sqg(obj3, fileB, i));
                            ajcqVar.c(new defpackage.gsb(obj3, adnvVar, ajcqVar, 10), adqoVar.d);
                            return ajcqVar;
                        }
                        ajddVar = new defpackage.ajdd(new java.lang.AssertionError("Voice file path cannot be a non-file: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(fileB)))));
                    }
                } catch (java.io.IOException e) {
                    ajddVar = new defpackage.ajdd(e);
                }
                return ajddVar;
            case 9:
                return (defpackage.adsi) ((defpackage.aigf) this.a).get((java.lang.String) obj);
            default:
                return this.a.a(obj);
        }
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
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
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                break;
            case 9:
                break;
            default:
                break;
        }
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
