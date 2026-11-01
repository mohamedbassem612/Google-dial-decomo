package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qzc extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    java.lang.Object a;
    int b;
    final /* synthetic */ java.lang.String c;
    final /* synthetic */ amzg d;
    final /* synthetic */ amzg e;
    final /* synthetic */ java.lang.Object f;
    final /* synthetic */ java.lang.Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qzc(amzg amzgVar, defpackage.rfa rfaVar, amzg amzgVar2, android.content.Context context, java.lang.String str, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.e = amzgVar;
        this.g = rfaVar;
        this.d = amzgVar2;
        this.f = context;
        this.c = str;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:46:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:48:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:50:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:57:0x021d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0229  */
    /* JADX WARN: Code duplicated, block: B:60:0x0232  */
    /* JADX WARN: Code duplicated, block: B:63:0x0247  */
    /* JADX WARN: Code duplicated, block: B:64:0x024a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0253  */
    /* JADX WARN: Code duplicated, block: B:70:0x025d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0260  */
    /* JADX WARN: Code duplicated, block: B:75:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x01da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [ajct, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r9v7, types: [aonj, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object objD;
        java.util.Set set;
        java.lang.Object objD2;
        java.lang.Boolean bool;
        java.lang.Object objD3;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        int iIntValue;
        java.lang.String str;
        defpackage.qug qugVarB;
        boolean z;
        defpackage.quf qufVar;
        defpackage.que queVarB;
        java.lang.Object objD4;
        java.lang.Object objD5;
        java.lang.Object obj2;
        ?? r3;
        defpackage.qxo qxoVar;
        alat alatVar;
        defpackage.reo reoVar = null;
        if (this.$cid == 0) {
            aolu aoluVar = aolu.a;
            int i = this.b;
            if (i != 0) {
                if (i != 1) {
                    java.lang.Object obj3 = this.a;
                    if (i != 2) {
                        aooc.af(obj);
                        bool = (java.lang.Boolean) obj3;
                        objD3 = obj;
                    } else {
                        set = (java.util.Set) obj3;
                        aooc.af(obj);
                        objD2 = obj;
                        bool = (java.lang.Boolean) objD2;
                        ajcq ajcqVarB = defpackage.zkb.b(set, this.g);
                        this.a = bool;
                        this.b = 3;
                        objD3 = aosv.D(ajcqVarB, this);
                        if (objD3 == aoluVar) {
                            return aoluVar;
                        }
                    }
                } else {
                    aooc.af(obj);
                    objD = obj;
                }
                aooh.e(objD3, "await(...)");
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj4 : (java.lang.Iterable) objD3) {
                    qufVar = (defpackage.quf) obj4;
                    if ((qufVar.b & 512) == 0) {
                        queVarB = defpackage.que.b(qufVar.l);
                        if (queVarB == null) {
                            queVarB = defpackage.que.UNKNOWN;
                        }
                        if (queVarB == defpackage.que.MORE) {
                        }
                    }
                    arrayList.add(obj4);
                }
                java.util.List<defpackage.quf> listBX = ajsz.bX(arrayList, new defpackage.qxq(3));
                arrayList2 = new java.util.ArrayList(ajsz.bl(listBX, 10));
                for (defpackage.quf qufVar2 : listBX) {
                    if (qufVar2.c == 2) {
                        iIntValue = ((java.lang.Integer) qufVar2.d).intValue();
                    } else {
                        iIntValue = 0;
                    }
                    java.lang.String str2 = qufVar2.g;
                    aooh.e(str2, "getLabel(...)");
                    java.lang.String str3 = qufVar2.h;
                    aooh.e(str3, "getDescription(...)");
                    if ((qufVar2.b & 2048) != 0) {
                        str = qufVar2.n;
                    } else {
                        str = null;
                    }
                    qugVarB = defpackage.qug.b(qufVar2.e);
                    if (qugVarB == null) {
                        qugVarB = defpackage.qug.BUTTON_UNKNOWN;
                    }
                    boolean z2 = qufVar2.j;
                    if (bool.booleanValue()) {
                        z = false;
                    } else {
                        z = qufVar2.i;
                    }
                    arrayList2.add(new defpackage.qzb(iIntValue, str2, str3, str, qugVarB, z2, z));
                }
                j$.util.Optional optionalOf = j$.util.Optional.of(new defpackage.qze(this.c, arrayList2));
                aooh.e(optionalOf, "of(...)");
                return optionalOf;
            }
            aooc.af(obj);
            java.lang.Object obj5 = this.f;
            defpackage.rce rceVar = defpackage.rcf.a;
            if (!aooh.n(obj5, defpackage.rcf.a(defpackage.qtr.MORE_MENU))) {
                j$.util.Optional optionalOf2 = j$.util.Optional.of(new defpackage.qze(this.c, aokc.a));
                aooh.e(optionalOf2, "of(...)");
                return optionalOf2;
            }
            ajcq ajcqVarD = this.d.d();
            this.b = 1;
            objD = aosv.D(ajcqVarD, this);
            if (objD == aoluVar) {
                return aoluVar;
            }
            set = (java.util.Set) objD;
            ajcq ajcqVarD2 = this.e.d();
            this.a = set;
            this.b = 2;
            objD2 = aosv.D(ajcqVarD2, this);
            if (objD2 == aoluVar) {
                return aoluVar;
            }
            bool = (java.lang.Boolean) objD2;
            ajcq ajcqVarB2 = defpackage.zkb.b(set, this.g);
            this.a = bool;
            this.b = 3;
            objD3 = aosv.D(ajcqVarB2, this);
            if (objD3 == aoluVar) {
                return aoluVar;
            }
            aooh.e(objD3, "await(...)");
            arrayList = new java.util.ArrayList();
            while (r4.hasNext()) {
                qufVar = (defpackage.quf) obj4;
                if ((qufVar.b & 512) == 0) {
                    queVarB = defpackage.que.b(qufVar.l);
                    if (queVarB == null) {
                        queVarB = defpackage.que.UNKNOWN;
                    }
                    if (queVarB == defpackage.que.MORE) {
                    }
                }
                arrayList.add(obj4);
            }
            java.util.List<defpackage.quf> listBX2 = ajsz.bX(arrayList, new defpackage.qxq(3));
            arrayList2 = new java.util.ArrayList(ajsz.bl(listBX2, 10));
            while (r1.hasNext()) {
                if (qufVar2.c == 2) {
                    iIntValue = ((java.lang.Integer) qufVar2.d).intValue();
                } else {
                    iIntValue = 0;
                }
                java.lang.String str4 = qufVar2.g;
                aooh.e(str4, "getLabel(...)");
                java.lang.String str5 = qufVar2.h;
                aooh.e(str5, "getDescription(...)");
                if ((qufVar2.b & 2048) != 0) {
                    str = qufVar2.n;
                } else {
                    str = null;
                }
                qugVarB = defpackage.qug.b(qufVar2.e);
                if (qugVarB == null) {
                    qugVarB = defpackage.qug.BUTTON_UNKNOWN;
                }
                boolean z3 = qufVar2.j;
                if (bool.booleanValue()) {
                    z = false;
                } else {
                    z = qufVar2.i;
                }
                arrayList2.add(new defpackage.qzb(iIntValue, str4, str5, str, qugVarB, z3, z));
            }
            j$.util.Optional optionalOf3 = j$.util.Optional.of(new defpackage.qze(this.c, arrayList2));
            aooh.e(optionalOf3, "of(...)");
            return optionalOf3;
        }
        aolu aoluVar2 = aolu.a;
        int i2 = this.b;
        if (i2 != 0) {
            if (i2 != 1) {
                java.lang.Object obj6 = this.a;
                aooc.af(obj);
                objD5 = obj;
                obj2 = obj6;
            } else {
                aooc.af(obj);
                objD4 = obj;
            }
            aooh.e(objD5, "await(...)");
            reoVar = (defpackage.reo) aooh.q((j$.util.Optional) objD5);
            r3 = obj2;
            java.lang.Object obj7 = this.f;
            java.lang.String str6 = this.c;
            akzx akzxVarM = defpackage.qxo.a.m();
            aooh.f(akzxVarM, "builder");
            android.content.Context context = (android.content.Context) obj7;
            java.lang.String string = context.getString(2132017630);
            aooh.e(string, "getString(...)");
            aooh.f(string, "value");
            akzxVarM.u();
            defpackage.qxo qxoVar2 = (defpackage.qxo) akzxVarM.b;
            j$.util.Objects.requireNonNull(string);
            qxoVar2.b |= 1;
            qxoVar2.c = string;
            java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.qxo) akzxVarM.b).d);
            aooh.e(listUnmodifiableList, "getVoiceButtonsList(...)");
            new alct(listUnmodifiableList);
            aooh.f((java.lang.Object) r3, "values");
            akzxVarM.u();
            qxoVar = (defpackage.qxo) akzxVarM.b;
            alatVar = qxoVar.d;
            if (!alatVar.c()) {
                qxoVar.d = alad.J(alatVar);
            }
            akyl.i((java.lang.Iterable) r3, qxoVar.d);
            aooh.f(str6, "value");
            akzxVarM.u();
            defpackage.qxo qxoVar3 = (defpackage.qxo) akzxVarM.b;
            j$.util.Objects.requireNonNull(str6);
            qxoVar3.b |= 2;
            qxoVar3.e = str6;
            java.lang.String string2 = context.getString(2132017631);
            aooh.e(string2, "getString(...)");
            aooh.f(string2, "value");
            akzxVarM.u();
            defpackage.qxo qxoVar4 = (defpackage.qxo) akzxVarM.b;
            j$.util.Objects.requireNonNull(string2);
            qxoVar4.b |= 4;
            qxoVar4.f = string2;
            alad aladVarP = akzxVarM.p();
            aooh.e(aladVarP, "build(...)");
            j$.util.Optional optionalOf4 = j$.util.Optional.of(new defpackage.qxw((defpackage.qxo) aladVarP, reoVar));
            aooh.e(optionalOf4, "of(...)");
            return optionalOf4;
        }
        aooc.af(obj);
        ajcq ajcqVarD3 = this.e.d();
        this.b = 1;
        objD4 = aosv.D(ajcqVarD3, this);
        if (objD4 == aoluVar2) {
            return aoluVar2;
        }
        aooh.e(objD4, "await(...)");
        java.util.List listBX3 = ajsz.bX(ajsz.bZ((java.lang.Iterable) objD4), new defpackage.qxq(0));
        j$.util.Optional optionalA = ((defpackage.rfa) this.g).a();
        defpackage.qkv qkvVar = new defpackage.qkv(new qks(7), 8);
        if (true == optionalA.isPresent()) {
            optionalA = j$.util.Optional.ofNullable(a.k((aonj) qkvVar.a, optionalA.get()));
        }
        java.lang.Object objOrElse = optionalA.orElse(java.lang.Boolean.FALSE);
        aooh.e(objOrElse, "orElse(...)");
        r3 = listBX3;
        if (((java.lang.Boolean) objOrElse).booleanValue()) {
            ajcq ajcqVarD4 = this.d.d();
            this.a = listBX3;
            this.b = 2;
            objD5 = aosv.D(ajcqVarD4, this);
            if (objD5 == aoluVar2) {
                return aoluVar2;
            }
            obj2 = listBX3;
            aooh.e(objD5, "await(...)");
            reoVar = (defpackage.reo) aooh.q((j$.util.Optional) objD5);
            r3 = obj2;
        }
        java.lang.Object obj8 = this.f;
        java.lang.String str7 = this.c;
        akzx akzxVarM2 = defpackage.qxo.a.m();
        aooh.f(akzxVarM2, "builder");
        android.content.Context context2 = (android.content.Context) obj8;
        java.lang.String string3 = context2.getString(2132017630);
        aooh.e(string3, "getString(...)");
        aooh.f(string3, "value");
        akzxVarM2.u();
        defpackage.qxo qxoVar5 = (defpackage.qxo) akzxVarM2.b;
        j$.util.Objects.requireNonNull(string3);
        qxoVar5.b |= 1;
        qxoVar5.c = string3;
        java.util.List listUnmodifiableList2 = j$.util.DesugarCollections.unmodifiableList(((defpackage.qxo) akzxVarM2.b).d);
        aooh.e(listUnmodifiableList2, "getVoiceButtonsList(...)");
        new alct(listUnmodifiableList2);
        aooh.f((java.lang.Object) r3, "values");
        akzxVarM2.u();
        qxoVar = (defpackage.qxo) akzxVarM2.b;
        alatVar = qxoVar.d;
        if (!alatVar.c()) {
            qxoVar.d = alad.J(alatVar);
        }
        akyl.i((java.lang.Iterable) r3, qxoVar.d);
        aooh.f(str7, "value");
        akzxVarM2.u();
        defpackage.qxo qxoVar6 = (defpackage.qxo) akzxVarM2.b;
        j$.util.Objects.requireNonNull(str7);
        qxoVar6.b |= 2;
        qxoVar6.e = str7;
        java.lang.String string4 = context2.getString(2132017631);
        aooh.e(string4, "getString(...)");
        aooh.f(string4, "value");
        akzxVarM2.u();
        defpackage.qxo qxoVar7 = (defpackage.qxo) akzxVarM2.b;
        j$.util.Objects.requireNonNull(string4);
        qxoVar7.b |= 4;
        qxoVar7.f = string4;
        alad aladVarP2 = akzxVarM2.p();
        aooh.e(aladVarP2, "build(...)");
        j$.util.Optional optionalOf5 = j$.util.Optional.of(new defpackage.qxw((defpackage.qxo) aladVarP2, reoVar));
        aooh.e(optionalOf5, "of(...)");
        return optionalOf5;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [ajct, java.lang.Object] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        if (this.$cid == 0) {
            return new defpackage.qzc((defpackage.rce) this.f, this.c, this.d, this.e, (ajct) this.g, aolnVar, 0);
        }
        amzg amzgVar = this.e;
        java.lang.Object obj2 = this.g;
        return new defpackage.qzc(amzgVar, (defpackage.rfa) obj2, this.d, (android.content.Context) this.f, this.c, aolnVar, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qzc(defpackage.rce rceVar, java.lang.String str, amzg amzgVar, amzg amzgVar2, ajct ajctVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.f = rceVar;
        this.c = str;
        this.d = amzgVar;
        this.e = amzgVar2;
        this.g = ajctVar;
    }
}
