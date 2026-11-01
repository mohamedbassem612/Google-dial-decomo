package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class acyw implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ acyw(java.lang.Object obj, alad aladVar, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = aladVar;
    }

    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v72, types: [java.lang.Object, java.util.Comparator] */
    public final ajcq a(java.lang.Object obj) {
        int i = 18;
        switch (this.$cid) {
            case 0:
                java.lang.Object obj2 = this.b;
                return ((acyy) this.a).o((defpackage.adbw) obj2, (defpackage.adbw) obj, 1097);
            case 1:
                java.lang.Object obj3 = this.b;
                return ((acyy) this.a).o((defpackage.adbw) obj3, (defpackage.adbw) obj, 1088);
            case 2:
                java.lang.Object obj4 = this.b;
                acyy acyyVar = (acyy) obj4;
                return ahvr.I(acyyVar.n(acyyVar.a.i((defpackage.acwb) this.a)), new defpackage.acyw(obj4, (defpackage.adbw) obj, 7), acyyVar.b);
            case 3:
                java.lang.Object obj5 = this.b;
                acyy acyyVar2 = (acyy) obj5;
                return ahvr.I(acyyVar2.n(acyyVar2.a.h((defpackage.acwb) this.a)), new defpackage.acyw(obj5, (defpackage.adbw) obj, 10), acyyVar2.b);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                java.lang.Object obj6 = this.b;
                return ((acyy) this.a).o((defpackage.adbw) obj6, (defpackage.adbw) obj, 1099);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                java.lang.Object obj7 = this.a;
                acyy acyyVar3 = (acyy) obj7;
                return ahvr.I(acyyVar3.n(acyyVar3.a.d()), new defpackage.acyh(obj7, (defpackage.adbw) obj, (java.util.Comparator) this.b, 15), acyyVar3.b);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                java.lang.Object obj8 = this.a;
                acyy acyyVar4 = (acyy) obj8;
                return ahvr.I(acyyVar4.n(acyyVar4.a.j((java.util.List) this.b)), new defpackage.acyg(obj8, (defpackage.adbw) obj, 16), acyyVar4.b);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                java.lang.Object obj9 = this.b;
                return ((acyy) this.a).o((defpackage.adbw) obj9, (defpackage.adbw) obj, 1089);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                java.lang.Object obj10 = this.b;
                acyy acyyVar5 = (acyy) obj10;
                return ahvr.I(acyyVar5.n(acyyVar5.a.g((defpackage.acwb) this.a)), new defpackage.acyg(obj10, (defpackage.adbw) obj, 14), acyyVar5.b);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                java.lang.Object obj11 = this.b;
                acyy acyyVar6 = (acyy) obj11;
                return ahvr.I(acyyVar6.n(acyyVar6.a.a((defpackage.acvu) this.a)), new defpackage.acyg(obj11, (defpackage.adbw) obj, i), acyyVar6.b);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                java.lang.Object obj12 = this.b;
                return ((acyy) this.a).o((defpackage.adbw) obj12, (defpackage.adbw) obj, 1090);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                java.lang.Object obj13 = this.b;
                return ((acza) this.a).i((defpackage.adbw) obj13, (defpackage.adbw) obj, 1101);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                java.lang.Object obj14 = this.b;
                return ((acza) this.a).i((defpackage.adbw) obj14, (defpackage.adbw) obj, 1102);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                java.lang.Object obj15 = this.b;
                acza aczaVar = (acza) obj15;
                return ahvr.I(aczaVar.b(aczaVar.c.e((defpackage.acwe) this.a)), new defpackage.acyw(obj15, (defpackage.adbw) obj, i), aczaVar.d);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                java.util.List list = (java.util.List) obj;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = list.iterator();
                while (true) {
                    java.lang.Object obj16 = this.a;
                    if (!it.hasNext()) {
                        return abrz.ac(arrayList).E(new kff(obj16, list, arrayList, this.b, 20), ((acza) obj16).d);
                    }
                    arrayList.add(((acza) obj16).b.e((defpackage.acwe) it.next()));
                }
                break;
            case 15:
                java.lang.Object obj17 = this.a;
                acza aczaVar2 = (acza) obj17;
                return ahvr.I(aczaVar2.b(aczaVar2.c.f((aihd) this.b)), new defpackage.acyw(obj17, (defpackage.adbw) obj, 20), aczaVar2.d);
            case 16:
                java.lang.Object obj18 = this.b;
                return ((acza) this.a).i((defpackage.adbw) obj18, (defpackage.adbw) obj, 1104);
            case 17:
                java.lang.Object obj19 = this.b;
                acza aczaVar3 = (acza) obj19;
                return ahvr.I(aczaVar3.b(aczaVar3.c.g((defpackage.acwe) this.a)), new defpackage.acyw(obj19, (defpackage.adbw) obj, 12), aczaVar3.d);
            case 18:
                java.lang.Object obj20 = this.b;
                return ((acza) this.a).i((defpackage.adbw) obj20, (defpackage.adbw) obj, 1100);
            case 19:
                java.lang.Object obj21 = this.a;
                acza aczaVar4 = (acza) obj21;
                return ahvr.I(aczaVar4.b(aczaVar4.c.c()), new defpackage.acyh(obj21, (defpackage.adbw) obj, (java.util.Comparator) this.b, 17), aczaVar4.d);
            default:
                java.lang.Object obj22 = this.b;
                return ((acza) this.a).i((defpackage.adbw) obj22, (defpackage.adbw) obj, 1100);
        }
    }

    public /* synthetic */ acyw(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
