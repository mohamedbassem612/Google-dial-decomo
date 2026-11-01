package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class aclk implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ aclk(defpackage.ahdo ahdoVar, akzc akzcVar, aexf aexfVar, int i) {
        this.$cid = i;
        this.b = ahdoVar;
        this.c = akzcVar;
        this.a = aexfVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Type inference failed for: r0v4, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [aciu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [cer, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj) throws java.lang.Throwable {
        gin ginVar;
        aeco aecoVar;
        int i;
        defpackage.aecp aecpVar;
        int i2;
        int i3 = this.$cid;
        if (i3 == 0) {
            aooh.f((cdh) obj, "$this$DisposableEffect");
            return new bxa((android.content.Context) this.a, (defpackage.aciu) this.b, (java.lang.String) this.c, 4);
        }
        int i4 = 3;
        int i5 = 2;
        if (i3 == 1) {
            defpackage.abgz abgzVar = (defpackage.abgz) obj;
            aooh.f(abgzVar, "result");
            aooh.f(abgzVar, "<this>");
            defpackage.abgy abgyVar = (defpackage.abgy) abgzVar.a;
            int iOrdinal = abgyVar.ordinal();
            if (iOrdinal == 0) {
                i4 = 1;
            } else if (iOrdinal == 1) {
                i4 = 2;
            } else if (iOrdinal != 2) {
                throw new aois();
            }
            afsq.bf((cer) this.a).a(new defpackage.abgv(i4, abgzVar.b));
            int iOrdinal2 = abgyVar.ordinal();
            if (iOrdinal2 == 0) {
                afsq.be((cer) this.b).a();
            } else if (iOrdinal2 != 1) {
                if (iOrdinal2 != 2) {
                    throw new aois();
                }
                afsq.bd((cer) this.c).a();
            }
            return aojh.a;
        }
        if (i3 == 2) {
            gin ginVarA = ((gjh) obj).a("DELETE FROM gnp_experiments WHERE experiment_source = ? AND experiment_type = ? AND insertion_time <= ? ");
            java.lang.Object obj2 = this.c;
            java.lang.Object obj3 = this.b;
            try {
                ginVarA.h(1, agab.bC((aeco) this.a));
                ginVarA.h(2, agab.bD((defpackage.aecp) obj3));
                ginVarA.h(3, agab.bE((j$.time.Instant) obj2));
                ginVarA.m();
                return aojh.a;
            } finally {
                ginVarA.close();
            }
        }
        if (i3 != 3) {
            if (i3 == 4) {
                agoq agoqVar = ((defpackage.agon) obj).b;
                defpackage.ahdo ahdoVar = (defpackage.ahdo) this.b;
                return ahdoVar.b.a((aexf) this.a, (akzc) this.c, ahdoVar.e.s(agoqVar), ahdoVar.d);
            }
            com.google.apps.tiktok.account.AccountId accountId = (com.google.apps.tiktok.account.AccountId) obj;
            defpackage.ahdo ahdoVar2 = (defpackage.ahdo) this.b;
            java.lang.Object obj4 = ahdoVar2.c.b;
            aooh.e(obj4, "get(...)");
            j$.util.Optional optional = (j$.util.Optional) obj4;
            boolean zIsPresent = optional.isPresent();
            java.lang.Object obj5 = this.c;
            java.lang.Object obj6 = this.a;
            if (zIsPresent) {
                return ahvr.I(((defpackage.agra) optional.get()).a(new defpackage.agns(new android.content.Intent())), ahqx.c(new defpackage.ahdm(ahdoVar2, (akzc) obj5, (aexf) obj6)), ajbm.a);
            }
            return ahdoVar2.c((akzc) obj5, accountId, ahdoVar2.a, (aexf) obj6);
        }
        gin ginVarA2 = ((gjh) obj).a((java.lang.String) this.b);
        ?? r2 = this.c;
        try {
            ginVarA2.h(1, agab.bC((aeco) this.a));
            java.util.Iterator it = r2.iterator();
            while (it.hasNext()) {
                ginVarA2.h(i5, agab.bD((defpackage.aecp) it.next()));
                i5++;
            }
            int iS = dzk.S(ginVarA2, "id");
            int iS2 = dzk.S(ginVarA2, "account_name");
            int iS3 = dzk.S(ginVarA2, "experiment_id");
            int iS4 = dzk.S(ginVarA2, "experiment_type");
            int iS5 = dzk.S(ginVarA2, "insertion_time");
            int iS6 = dzk.S(ginVarA2, "experiment_source");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (ginVarA2.m()) {
                int iC = (int) ginVarA2.c(iS);
                java.lang.String strE = ginVarA2.e(iS2);
                int iC2 = (int) ginVarA2.c(iS3);
                int iC3 = (int) ginVarA2.c(iS4);
                defpackage.aecp[] aecpVarArrValues = defpackage.aecp.values();
                int length = aecpVarArrValues.length;
                int i6 = 0;
                while (true) {
                    aecoVar = null;
                    if (i6 >= length) {
                        i = iS;
                        aecpVar = null;
                        break;
                    }
                    aecpVar = aecpVarArrValues[i6];
                    i = iS;
                    if (aecpVar.d == iC3) {
                        break;
                    }
                    i6++;
                    iS = i;
                }
                if (aecpVar == null) {
                    aecpVar = defpackage.aecp.EXPERIMENT_TYPE_UNSPECIFIED;
                }
                defpackage.aecp aecpVar2 = aecpVar;
                j$.time.Instant instantOfEpochMilli = j$.time.Instant.ofEpochMilli(ginVarA2.c(iS5));
                aooh.e(instantOfEpochMilli, "ofEpochMilli(...)");
                int iC4 = (int) ginVarA2.c(iS6);
                aeco[] aecoVarArrValues = aeco.values();
                int length2 = aecoVarArrValues.length;
                int i7 = 0;
                while (true) {
                    if (i7 >= length2) {
                        ginVar = ginVarA2;
                        i2 = iS2;
                        break;
                    }
                    ginVar = ginVarA2;
                    try {
                        aeco aecoVar2 = aecoVarArrValues[i7];
                        i2 = iS2;
                        if (aecoVar2.d == iC4) {
                            aecoVar = aecoVar2;
                            break;
                        }
                        i7++;
                        iS2 = i2;
                        ginVarA2 = ginVar;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        ginVar.close();
                        throw th;
                    }
                }
                if (aecoVar == null) {
                    aecoVar = aeco.a;
                }
                arrayList.add(new defpackage.aecq(iC, strE, iC2, aecpVar2, instantOfEpochMilli, aecoVar));
                iS2 = i2;
                iS = i;
                ginVarA2 = ginVar;
            }
            ginVarA2.close();
            return arrayList;
        } catch (java.lang.Throwable th2) {
            th = th2;
            ginVar = ginVarA2;
        }
    }

    public /* synthetic */ aclk(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ aclk(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }
}
