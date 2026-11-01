package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class lkf implements defpackage.ajas {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ lkf(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object, java.util.Map$Entry] */
    /* JADX WARN: Type inference failed for: r0v7, types: [dxx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r12v26, types: [ajat, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v30, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v36, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v47, types: [ahek, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v5, types: [aolr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v10, types: [aclv, java.lang.Object] */
    @Override // defpackage.ajas
    public final defpackage.ajcq a() {
        defpackage.ajcq ajddVar;
        int i = 12;
        int i2 = 7;
        byte[] bArr = null;
        int i3 = 8;
        int i4 = 0;
        switch (this.$cid) {
            case 0:
                j$.util.Optional optional = ((defpackage.lkk) this.a).b;
                optional.isPresent();
                return ((defpackage.lkr) optional.orElseThrow()).b(this.b);
            case 1:
                defpackage.aosp aospVar = defpackage.dsn.a;
                ?? r0 = this.a;
                defpackage.aogc aogcVar = (defpackage.aogc) this.b;
                return defpackage.dsn.a(aogcVar.a, new defpackage.bur(aogcVar, (defpackage.dxx) r0, (defpackage.aoln) null, 4));
            case 2:
                return defpackage.ahvr.F(new defpackage.guy(this.a, 11), this.b);
            case 3:
                java.lang.Object obj = this.a;
                defpackage.sqi sqiVar = (defpackage.sqi) obj;
                boolean zBooleanValue = ((java.lang.Boolean) sqiVar.g.a()).booleanValue();
                java.lang.Object obj2 = this.b;
                if (zBooleanValue) {
                    ((defpackage.aimw) ((defpackage.aimw) defpackage.sqi.a.b()).l("com/android/dialer/phonelookup/composite/CompositePhoneLookup", "getMostRecentInfo", 292, "CompositePhoneLookup.java")).y("Existing phone lookup info: %s", defpackage.aais.aD(obj2));
                }
                defpackage.ajcq ajcqVarO = sqiVar.i.o(sqiVar.h.e(), new defpackage.kjs(obj, obj2, i, bArr));
                defpackage.jtv jtvVar = new defpackage.jtv(obj, obj2, i3);
                defpackage.ajct ajctVar = sqiVar.e;
                long j = defpackage.ahqx.a;
                defpackage.ahqv ahqvVar = new defpackage.ahqv(defpackage.ahns.c(false), jtvVar);
                int i5 = defpackage.ajan.c;
                defpackage.ajam ajamVar = new defpackage.ajam(ajcqVarO, ahqvVar);
                ajcqVarO.c(ajamVar, defpackage.aiql.t(ajctVar, ajamVar));
                sqiVar.c(ajamVar, defpackage.sqi.c);
                ajddVar = ajamVar;
                break;
            case 4:
                defpackage.aihd aihdVar = (defpackage.aihd) this.b;
                java.util.ArrayList arrayList = new java.util.ArrayList(aihdVar.size());
                defpackage.ailj it = aihdVar.iterator();
                while (it.hasNext()) {
                    java.lang.Object obj3 = this.a;
                    defpackage.sqn sqnVar = (defpackage.sqn) it.next();
                    defpackage.ajcq ajcqVarE = sqnVar.e();
                    defpackage.jyx jyxVar = new defpackage.jyx(sqnVar, i3);
                    long j2 = defpackage.ahqx.a;
                    defpackage.ahqv ahqvVar2 = new defpackage.ahqv(defpackage.ahns.c(false), jyxVar);
                    defpackage.ajct ajctVar2 = ((defpackage.sqi) obj3).e;
                    int i6 = defpackage.aizu.d;
                    defpackage.aizt aiztVar = new defpackage.aizt(ajcqVarE, java.lang.Throwable.class, ahqvVar2);
                    ajcqVarE.c(aiztVar, defpackage.aiql.t(ajctVar2, aiztVar));
                    arrayList.add(aiztVar);
                }
                defpackage.ajbh ajbhVar = new defpackage.ajbh(defpackage.aify.j(arrayList), true);
                defpackage.kvf kvfVar = new defpackage.kvf(i2);
                defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
                long j3 = defpackage.ahqx.a;
                defpackage.ahqv ahqvVar3 = new defpackage.ahqv(defpackage.ahns.c(false), kvfVar);
                int i7 = defpackage.ajan.c;
                defpackage.ajam ajamVar2 = new defpackage.ajam(ajbhVar, ahqvVar3);
                ajbhVar.c(ajamVar2, defpackage.aiql.t(ajbmVar, ajamVar2));
                ajddVar = ajamVar2;
                break;
            case 5:
                defpackage.raj rajVar = new defpackage.raj(this.a, 18);
                long j4 = defpackage.ahqx.a;
                defpackage.ajdk ajdkVar = new defpackage.ajdk(new defpackage.ajav(defpackage.ahns.c(false), rajVar, 1));
                this.b.execute(ajdkVar);
                ajddVar = ajdkVar;
                break;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                java.util.ArrayList arrayList2 = new java.util.ArrayList(1);
                defpackage.aclq aclqVar = (defpackage.aclq) this.a;
                defpackage.ailj it2 = ((defpackage.aile) aclqVar.b).iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((defpackage.aclr) it2.next()).a(this.b));
                }
                return new defpackage.anpu(true, defpackage.aify.j(arrayList2)).b(new defpackage.vcz(arrayList2, i3), aclqVar.a);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                j$.util.stream.Stream stream = j$.util.Collection.-EL.stream((java.util.Collection) this.b);
                java.lang.Object obj4 = this.a;
                java.util.Set set = (java.util.Set) stream.filter(new defpackage.tcw(obj4, i2)).collect(j$.util.stream.Collectors.toSet());
                if (set.isEmpty()) {
                    return defpackage.ajcm.a;
                }
                java.util.Set set2 = (java.util.Set) j$.util.Collection.-EL.stream(set).filter(new defpackage.tcw(obj4, i3)).collect(j$.util.stream.Collectors.toSet());
                if (set2.isEmpty()) {
                    return new defpackage.adqr(new defpackage.ajbh(defpackage.aify.j((java.util.List) j$.util.Collection.-EL.stream(set).map(new defpackage.okq(obj4, 6)).collect(j$.util.stream.Collectors.toList())), true));
                }
                ajddVar = new defpackage.ajdd(new defpackage.adnt(set2));
                break;
                break;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return this.a.a(this.b);
            case 9:
                defpackage.ahby ahbyVar = (defpackage.ahby) this.a;
                java.lang.String str = ahbyVar.a;
                defpackage.ahbz ahbzVar = (defpackage.ahbz) this.b;
                defpackage.ajcq ajcqVarC = ((defpackage.aewq) ahbzVar.d).f.c(((defpackage.zzx) ahbzVar.e).t(str)).e ? ((defpackage.aexi) ahbzVar.a.a()).c(ahbyVar.b) : ((defpackage.aexi) ahbzVar.a.a()).b(ahbyVar.b.c);
                defpackage.ahbx ahbxVar = new defpackage.ahbx(new defpackage.rou(17), i4);
                defpackage.ajbm ajbmVar2 = defpackage.ajbm.INSTANCE;
                long j5 = defpackage.ahqx.a;
                defpackage.aizt aiztVar2 = new defpackage.aizt(ajcqVarC, defpackage.aexj.class, new defpackage.ahqv(defpackage.ahns.c(false), ahbxVar));
                ajcqVarC.c(aiztVar2, defpackage.aiql.t(ajbmVar2, aiztVar2));
                return aiztVar2;
            case 10:
                defpackage.ahce ahceVar = (defpackage.ahce) this.b;
                return defpackage.ajan.g(ahceVar.p.a(), defpackage.ahqx.c(new defpackage.adpx(ahceVar, (defpackage.ahax) this.a, 9)), defpackage.ajbm.INSTANCE);
            case 11:
                return ((defpackage.gou) ((defpackage.ahct) this.a).i).y((java.lang.String) this.b);
            case 12:
                return defpackage.ajan.f(defpackage.aiql.G(this.a.a(), 180L, java.util.concurrent.TimeUnit.SECONDS, ((defpackage.ahew) this.b).c), defpackage.ahqx.a(new defpackage.agqh(5)), defpackage.ajbm.INSTANCE);
            default:
                ?? r1 = this.b;
                java.lang.String str2 = (java.lang.String) r1.getKey();
                java.lang.Object objA = ((defpackage.aoin) r1.getValue()).a();
                defpackage.aooh.e(objA, "get(...)");
                defpackage.ahek ahekVar = (defpackage.ahek) objA;
                java.lang.Object obj5 = this.a;
                defpackage.ahew ahewVar = (defpackage.ahew) obj5;
                java.lang.Object objA2 = ahewVar.f.a();
                defpackage.aooh.e(objA2, "get(...)");
                java.lang.Iterable iterable = (java.lang.Iterable) objA2;
                java.util.ArrayList arrayList3 = new java.util.ArrayList(defpackage.ajsz.bl(iterable, 10));
                java.util.Iterator it3 = iterable.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new ahem((ahex) it3.next(), str2, 2));
                }
                return ahewVar.l.d(new defpackage.lkf(ahekVar, obj5, i), defpackage.ahvr.bx(arrayList3));
        }
        return ajddVar;
    }

    public /* synthetic */ lkf(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
