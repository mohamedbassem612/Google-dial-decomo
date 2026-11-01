package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vel implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ vel(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v35, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v43, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v46, types: [java.lang.Iterable, java.lang.Object] */
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        int i = 4;
        switch (this.$cid) {
            case 0:
                java.lang.String str = (java.lang.String) obj;
                akzx akzxVar = (akzx) this.a;
                akzxVar.u();
                defpackage.vgm vgmVar = (defpackage.vgm) akzxVar.b;
                defpackage.vgm vgmVar2 = defpackage.vgm.a;
                j$.util.Objects.requireNonNull(str);
                vgmVar.b |= 16;
                vgmVar.g = str;
                break;
            case 1:
                java.lang.String str2 = (java.lang.String) obj;
                akzx akzxVar2 = (akzx) this.a;
                akzxVar2.u();
                defpackage.vgm vgmVar3 = (defpackage.vgm) akzxVar2.b;
                defpackage.vgm vgmVar4 = defpackage.vgm.a;
                j$.util.Objects.requireNonNull(str2);
                vgmVar3.b |= 32;
                vgmVar3.h = str2;
                break;
            case 2:
                java.lang.String str3 = (java.lang.String) obj;
                akzx akzxVar3 = (akzx) this.a;
                akzxVar3.u();
                defpackage.vgm vgmVar5 = (defpackage.vgm) akzxVar3.b;
                defpackage.vgm vgmVar6 = defpackage.vgm.a;
                j$.util.Objects.requireNonNull(str3);
                vgmVar5.b |= 64;
                vgmVar5.i = str3;
                break;
            case 3:
                java.lang.String str4 = (java.lang.String) obj;
                akzx akzxVar4 = (akzx) this.a;
                akzxVar4.u();
                defpackage.vgm vgmVar7 = (defpackage.vgm) akzxVar4.b;
                defpackage.vgm vgmVar8 = defpackage.vgm.a;
                j$.util.Objects.requireNonNull(str4);
                vgmVar7.b |= 128;
                vgmVar7.j = str4;
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                java.lang.String str5 = (java.lang.String) obj;
                akzx akzxVar5 = (akzx) this.a;
                akzxVar5.u();
                defpackage.vgm vgmVar9 = (defpackage.vgm) akzxVar5.b;
                defpackage.vgm vgmVar10 = defpackage.vgm.a;
                j$.util.Objects.requireNonNull(str5);
                vgmVar9.b |= 256;
                vgmVar9.k = str5;
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                java.lang.String str6 = (java.lang.String) obj;
                akzx akzxVar6 = (akzx) this.a;
                akzxVar6.u();
                defpackage.vcn vcnVar = (defpackage.vcn) akzxVar6.b;
                defpackage.vcn vcnVar2 = defpackage.vcn.a;
                j$.util.Objects.requireNonNull(str6);
                vcnVar.c = str6;
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                java.lang.String str7 = (java.lang.String) obj;
                akzx akzxVar7 = (akzx) this.a;
                akzxVar7.u();
                defpackage.vcn vcnVar3 = (defpackage.vcn) akzxVar7.b;
                defpackage.vcn vcnVar4 = defpackage.vcn.a;
                j$.util.Objects.requireNonNull(str7);
                vcnVar3.e = str7;
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                alcf alcfVarA = ven.a((java.lang.String) obj);
                akzx akzxVar8 = (akzx) this.a;
                akzxVar8.u();
                defpackage.vcn vcnVar5 = (defpackage.vcn) akzxVar8.b;
                defpackage.vcn vcnVar6 = defpackage.vcn.a;
                j$.util.Objects.requireNonNull(alcfVarA);
                vcnVar5.d = alcfVarA;
                vcnVar5.b |= 1;
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                android.telephony.SmsMessage smsMessage = (android.telephony.SmsMessage) obj;
                if (smsMessage != null) {
                    ((java.lang.StringBuilder) this.a).append(smsMessage.getMessageBody());
                }
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                this.a.add(new defpackage.vif((java.lang.String) obj));
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                dsd dsdVar = (dsd) obj;
                java.lang.Object obj2 = this.a;
                defpackage.vkt vktVar = (defpackage.vkt) obj2;
                if (!vktVar.b.isPresent()) {
                    vktVar.c = j$.util.Optional.of(dsdVar);
                    dsdVar.a(new defpackage.vet(obj2, i), vktVar.d.d);
                } else {
                    vktVar.a(dsdVar, ((java.lang.Integer) vktVar.b.orElseThrow()).intValue());
                }
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                this.a.add((java.lang.Long) obj);
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                akzx akzxVar9 = (akzx) obj;
                akzxVar9.u();
                defpackage.amto amtoVar = (defpackage.amto) akzxVar9.b;
                defpackage.amto amtoVar2 = defpackage.amto.a;
                java.lang.Object obj3 = this.a;
                j$.util.Objects.requireNonNull(obj3);
                amtoVar.b |= 4;
                amtoVar.j = (java.lang.String) obj3;
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                akzx akzxVar10 = (akzx) obj;
                akzxVar10.u();
                defpackage.amto amtoVar3 = (defpackage.amto) akzxVar10.b;
                defpackage.amto amtoVar4 = defpackage.amto.a;
                alak alakVar = amtoVar3.g;
                if (!alakVar.c()) {
                    amtoVar3.g = alad.H(alakVar);
                }
                java.util.Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    amtoVar3.g.g(((defpackage.amth) it.next()).i);
                }
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                akzx akzxVar11 = (akzx) obj;
                akzxVar11.u();
                defpackage.amto amtoVar5 = (defpackage.amto) akzxVar11.b;
                defpackage.amto amtoVar6 = defpackage.amto.a;
                amtoVar5.d = ((defpackage.wpu) this.a).e;
                amtoVar5.b |= 1;
                break;
            case 15:
                akzx akzxVar12 = (akzx) obj;
                akzxVar12.u();
                defpackage.amto amtoVar7 = (defpackage.amto) akzxVar12.b;
                defpackage.amto amtoVar8 = defpackage.amto.a;
                java.lang.Object obj4 = this.a;
                j$.util.Objects.requireNonNull(obj4);
                amtoVar7.b |= 16;
                amtoVar7.l = (java.lang.String) obj4;
                break;
            case 16:
                akzx akzxVar13 = (akzx) obj;
                akzxVar13.u();
                defpackage.amto amtoVar9 = (defpackage.amto) akzxVar13.b;
                defpackage.amto amtoVar10 = defpackage.amto.a;
                amtoVar9.m = ((defpackage.wpt) this.a).d;
                amtoVar9.b |= 32;
                break;
            case 17:
                akzx akzxVar14 = (akzx) obj;
                akzxVar14.u();
                defpackage.amto amtoVar11 = (defpackage.amto) akzxVar14.b;
                defpackage.amto amtoVar12 = defpackage.amto.a;
                java.lang.Object obj5 = this.a;
                j$.util.Objects.requireNonNull(obj5);
                alat alatVar = amtoVar11.e;
                if (!alatVar.c()) {
                    amtoVar11.e = alad.J(alatVar);
                }
                amtoVar11.e.add(obj5);
                break;
            case 18:
                akzx akzxVar15 = (akzx) obj;
                akzx akzxVarM = defpackage.amtk.a.m();
                akzxVarM.u();
                defpackage.amtk amtkVar = (defpackage.amtk) akzxVarM.b;
                amtkVar.c = ((defpackage.amtj) this.a).v;
                amtkVar.b |= 1;
                akzxVar15.u();
                defpackage.amto amtoVar13 = (defpackage.amto) akzxVar15.b;
                defpackage.amtk amtkVar2 = (defpackage.amtk) akzxVarM.p();
                defpackage.amto amtoVar14 = defpackage.amto.a;
                j$.util.Objects.requireNonNull(amtkVar2);
                alat alatVar2 = amtoVar13.o;
                if (!alatVar2.c()) {
                    amtoVar13.o = alad.J(alatVar2);
                }
                amtoVar13.o.add(amtkVar2);
                break;
            case 19:
                akzx akzxVar16 = (akzx) obj;
                akzxVar16.u();
                defpackage.amto amtoVar15 = (defpackage.amto) akzxVar16.b;
                defpackage.amto amtoVar16 = defpackage.amto.a;
                java.lang.Object obj6 = this.a;
                j$.util.Objects.requireNonNull(obj6);
                alat alatVar3 = amtoVar15.h;
                if (!alatVar3.c()) {
                    amtoVar15.h = alad.J(alatVar3);
                }
                amtoVar15.h.add(obj6);
                break;
            default:
                akzx akzxVar17 = (akzx) obj;
                akzxVar17.u();
                defpackage.amto amtoVar17 = (defpackage.amto) akzxVar17.b;
                defpackage.amto amtoVar18 = defpackage.amto.a;
                java.lang.Object obj7 = this.a;
                j$.util.Objects.requireNonNull(obj7);
                alat alatVar4 = amtoVar17.f;
                if (!alatVar4.c()) {
                    amtoVar17.f = alad.J(alatVar4);
                }
                amtoVar17.f.add(obj7);
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
