package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zjq extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zjq(aazz aazzVar, defpackage.akkw akkwVar, akzc akzcVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = aazzVar;
        this.a = akkwVar;
        this.c = akzcVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.$cid) {
            case 0:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 1:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 2:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 3:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            default:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v7, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v22, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v38, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v21, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v25, types: [ccp, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                aooc.af(obj);
                java.lang.Object obj2 = this.c;
                return ((zjs) this.a).e((android.content.ComponentName) this.b, (java.lang.String) obj2).orElse((java.lang.Object) null);
            case 1:
                aooc.af(obj);
                defpackage.aprf aprfVar = new defpackage.aprf(this.c, (byte[]) null);
                ((defpackage.abtr) this.b).d.put(this.a, aprfVar);
                return aojh.a;
            case 2:
                aooc.af(obj);
                aazz aazzVar = (aazz) this.b;
                aazzVar.c.get();
                java.lang.Object obj3 = this.a;
                aooh.f(obj3, "constraints");
                java.lang.Object obj4 = this.c;
                aooh.f(obj4, "publicKey");
                aish aishVar = aish.e;
                int i = airu.a;
                airs airsVarE = airt.a.e();
                defpackage.akkw akkwVar = (defpackage.akkw) obj3;
                java.lang.String str = akkwVar.c;
                aooh.e(str, "getClientId(...)");
                java.nio.charset.Charset charset = aoqv.a;
                byte[] bytes = str.getBytes(charset);
                aooh.e(bytes, "getBytes(...)");
                airsVarE.h(bytes);
                java.lang.String str2 = akkwVar.d;
                aooh.e(str2, "getSubClientId(...)");
                byte[] bytes2 = str2.getBytes(charset);
                aooh.e(bytes2, "getBytes(...)");
                airsVarE.h(bytes2);
                airsVarE.h(((akzc) obj4).D());
                for (defpackage.akkv akkvVar : akkwVar.e) {
                    java.lang.String str3 = akkvVar.b;
                    aooh.e(str3, "getAttribute(...)");
                    byte[] bytes3 = str3.getBytes(charset);
                    aooh.e(bytes3, "getBytes(...)");
                    airsVarE.h(bytes3);
                    java.lang.String str4 = akkvVar.c;
                    aooh.e(str4, "getValue(...)");
                    byte[] bytes4 = str4.getBytes(charset);
                    aooh.e(bytes4, "getBytes(...)");
                    airsVarE.h(bytes4);
                }
                android.content.Context context = aazzVar.b;
                java.lang.String strK = aishVar.k(airsVarE.o().d());
                aooh.f(context, "context");
                akzc akzcVarW = akzc.w(new aaiz(context).a("hades_persephone_risk", ajsz.aM(new aoiu("blob_meta", strK))));
                aooh.e(akzcVarW, "copyFromUtf8(...)");
                return akzcVarW;
            case 3:
                aooc.af(obj);
                boolean z = this.b instanceof aboh;
                java.lang.Object obj5 = this.a;
                if (z) {
                    defpackage.afpl afplVar = ((defpackage.abom) obj5).c;
                    if (afplVar != null) {
                        java.lang.Object obj6 = this.c;
                        aooh.f(obj6, "key");
                        afplVar.b.add(obj6);
                    }
                } else {
                    defpackage.afpl afplVar2 = ((defpackage.abom) obj5).c;
                    if (afplVar2 != null) {
                        java.lang.Object obj7 = this.c;
                        aooh.f(obj7, "key");
                        afplVar2.b.remove(obj7);
                    }
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                aooc.af(obj);
                java.lang.Object obj8 = this.b;
                if (obj8 != null) {
                    ?? r0 = this.a;
                    ?? r7 = this.c;
                    java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl((java.lang.Iterable) r0, 10));
                    java.util.Iterator it = r0.iterator();
                    while (it.hasNext()) {
                        arrayList.add((java.lang.String) r7.a(it.next()));
                    }
                    java.util.Set setCf = ajsz.cf(arrayList);
                    aooh.f(setCf, "keys");
                    defpackage.afpl afplVar3 = (defpackage.afpl) obj8;
                    afplVar3.a.retainAll(setCf);
                    afplVar3.b.retainAll(setCf);
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                aooc.af(obj);
                a.B((ccp) this.b);
                if (((defpackage.abom) this.c).c == null) {
                    return aojh.a;
                }
                throw null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                aooc.af(obj);
                a.B((ccp) this.b);
                defpackage.afpl afplVar4 = ((defpackage.abom) this.c).c;
                if (afplVar4 != null) {
                    afplVar4.A(((abof) this.a).a);
                }
                return aojh.a;
            default:
                aooc.af(obj);
                defpackage.aboc abocVar = (defpackage.aboc) this.a;
                boolean zIsEmpty = abocVar.b.a.isEmpty();
                ?? r1 = this.b;
                if (zIsEmpty) {
                    a.E((ccp) r1, false);
                    ((defpackage.abom) this.c).c.a.remove("chip_row");
                } else {
                    a.E((ccp) r1, true);
                    java.lang.Object obj9 = this.c;
                    ((defpackage.abom) obj9).c.A(abocVar.a);
                }
                return aojh.a;
        }
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [abol, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [abok, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [abol, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v9, types: [abol, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [aosb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [ccp, java.lang.Object] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        switch (this.$cid) {
            case 0:
                java.lang.Object obj2 = this.a;
                return new defpackage.zjq((zjs) obj2, (android.content.ComponentName) this.b, (java.lang.String) this.c, aolnVar, 0);
            case 1:
                java.lang.Object obj3 = this.b;
                return new defpackage.zjq((defpackage.abtr) obj3, (java.lang.String) this.a, (aosb) this.c, aolnVar, 1);
            case 2:
                java.lang.Object obj4 = this.b;
                return new defpackage.zjq((aazz) obj4, (defpackage.akkw) this.a, (akzc) this.c, aolnVar, 2);
            case 3:
                return new defpackage.zjq((defpackage.abok) this.b, (defpackage.abom) this.a, (java.lang.String) this.c, aolnVar, 3);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return new defpackage.zjq((defpackage.afpl) this.b, (java.util.List) this.a, (aonj) this.c, aolnVar, 4);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return new defpackage.zjq((defpackage.abom) this.c, (defpackage.abol) this.a, (ccp) this.b, aolnVar, 5);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return new defpackage.zjq((defpackage.abom) this.c, this.a, this.b, aolnVar, 6, null);
            default:
                return new defpackage.zjq((defpackage.abol) this.a, (defpackage.abom) this.c, (ccp) this.b, aolnVar, 7);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zjq(defpackage.abok abokVar, defpackage.abom abomVar, java.lang.String str, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = abokVar;
        this.a = abomVar;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zjq(defpackage.abol abolVar, defpackage.abom abomVar, ccp ccpVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = abolVar;
        this.c = abomVar;
        this.b = ccpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zjq(defpackage.abom abomVar, defpackage.abol abolVar, ccp ccpVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = abomVar;
        this.a = abolVar;
        this.b = ccpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zjq(defpackage.abom abomVar, defpackage.abol abolVar, ccp ccpVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = abomVar;
        this.a = abolVar;
        this.b = ccpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zjq(defpackage.abtr abtrVar, java.lang.String str, aosb aosbVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = abtrVar;
        this.a = str;
        this.c = aosbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zjq(defpackage.afpl afplVar, java.util.List list, aonj aonjVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = afplVar;
        this.a = list;
        this.c = aonjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zjq(zjs zjsVar, android.content.ComponentName componentName, java.lang.String str, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = zjsVar;
        this.b = componentName;
        this.c = str;
    }
}
