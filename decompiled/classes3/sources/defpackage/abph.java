package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class abph implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ abph(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v13, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, java.util.Map] */
    public final java.lang.Object a(java.lang.Object obj) throws aois {
        ?? arrayList;
        int i = 1;
        int i2 = 5;
        int i3 = 3;
        int i4 = 10;
        int i5 = 4;
        byte[] bArr = null;
        switch (this.$cid) {
            case 0:
                android.view.View view = (android.view.View) obj;
                aooh.f(view, "$this$updateStates");
                defpackage.abpg abpgVar = (defpackage.abpg) this.a;
                view.setEnabled(abpgVar.c);
                view.setSelected(abpgVar.b);
                return aojh.a;
            case 1:
                this.a.a(obj);
                return java.lang.Boolean.FALSE;
            case 2:
                ((android.widget.TextView) this.a).setAlpha(((java.lang.Float) obj).floatValue());
                return aojh.a;
            case 3:
                defpackage.abvz abvzVar = (defpackage.abvz) obj;
                aooh.f(abvzVar, "it");
                ((android.os.Bundle) this.a).putByteArray("com.android.dialer.calleeid.CALLEE_ID_DATA", abvzVar.i());
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                cxi cxiVar = (cxi) obj;
                aooh.f(cxiVar, "it");
                ?? r10 = this.a;
                r10.b(java.lang.Integer.valueOf(java.lang.Math.max(((java.lang.Number) r10.a()).intValue(), (int) (cxiVar.h() >> 32))));
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return a.z((czc) this.a, (czb) obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                ((defpackage.acsl) this.a).h.h((float) ((((java.lang.Long) obj).longValue() % 100000000000L) / 1.0E9d));
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.acuc acucVar = defpackage.acuc.a;
                if (((java.lang.Throwable) obj) instanceof java.util.concurrent.CancellationException) {
                    ((android.os.CancellationSignal) this.a).cancel();
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                java.util.List list = (java.util.List) obj;
                aooh.c(list);
                arrayList = new java.util.ArrayList(ajsz.bl(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new defpackage.adds((defpackage.addo) this.a, (qq) it.next()));
                }
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                java.util.List list2 = (java.util.List) obj;
                aooh.c(list2);
                arrayList = new java.util.ArrayList(ajsz.bl(list2, 10));
                java.util.Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new defpackage.adds((defpackage.adei) this.a, (qq) it2.next()));
                }
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                java.util.Map map = (java.util.Map) obj;
                aiof aiofVar = aebs.a;
                aooh.f(map, "it");
                arrayList = new java.util.LinkedHashMap(ajsz.aL(map.size()));
                for (java.util.Map.Entry entry : map.entrySet()) {
                    ?? r1 = this.a;
                    arrayList.put((aduy) ajsz.aN((java.util.Map) r1, entry.getKey()), entry.getValue());
                }
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                java.util.Map map2 = (java.util.Map) obj;
                arrayList = new java.util.LinkedHashMap(ajsz.aL(map2.size()));
                for (java.util.Map.Entry entry2 : map2.entrySet()) {
                    ?? r2 = this.a;
                    arrayList.put((aduy) ajsz.aN((java.util.Map) r2, entry2.getKey()), entry2.getValue());
                }
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                defpackage.afot afotVar = (defpackage.afot) obj;
                aimz aimzVar = defpackage.afny.a;
                aooh.f(afotVar, "content");
                j$.util.Objects.checkIndex(0, 4);
                if (afotVar != null) {
                    java.lang.Object obj2 = this.a;
                    if (afotVar instanceof defpackage.afoq) {
                        ((fvx) obj2).h("AllPhotos");
                    } else if (afotVar instanceof defpackage.afor) {
                        ((fvx) obj2).h("Clusters");
                    } else if (afotVar instanceof defpackage.afos) {
                        ((fvx) obj2).h("MePhotos");
                    }
                    return aojh.a;
                }
                throw new aois();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                java.lang.String str = (java.lang.String) obj;
                aimz aimzVar2 = defpackage.afny.a;
                aooh.f(str, "clusterId");
                ((fvx) this.a).h("Cluster/".concat(java.lang.String.valueOf(str)));
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                defpackage.agki agkiVar = (defpackage.agki) obj;
                aooh.f(agkiVar, "$this$energyShaderConfig");
                defpackage.agkd agkdVar = new defpackage.agkd(i5);
                defpackage.agkl agklVar = new defpackage.agkl((byte[]) null);
                agkdVar.a(agklVar);
                agkiVar.a = agklVar.a();
                java.lang.Object obj3 = this.a;
                defpackage.agkc agkcVar = new defpackage.agkc(obj3, i3);
                defpackage.agkn agknVar = new defpackage.agkn((byte[]) null);
                agkcVar.a(agknVar);
                agkiVar.b = agknVar.a();
                defpackage.agkc agkcVar2 = new defpackage.agkc(obj3, i5);
                defpackage.agko agkoVar = new defpackage.agko((byte[]) null);
                agkcVar2.a(agkoVar);
                agkiVar.c = agkoVar.a();
                defpackage.agkc agkcVar3 = new defpackage.agkc(obj3, i2);
                defpackage.agkb agkbVar = new defpackage.agkb((byte[]) null);
                agkcVar3.a(agkbVar);
                agkiVar.f = agkbVar.a();
                defpackage.agkc agkcVar4 = new defpackage.agkc(obj3, 6);
                defpackage.agkf agkfVar = new defpackage.agkf(bArr);
                agkcVar4.a(agkfVar);
                agkiVar.j = agkfVar.a();
                return aojh.a;
            case 15:
                defpackage.agki agkiVar2 = (defpackage.agki) obj;
                aooh.f(agkiVar2, "$this$copy");
                agkiVar2.b = defpackage.agmc.D(agkiVar2.d(), new defpackage.afno(i3));
                agkiVar2.e = defpackage.agmc.H(agkiVar2.e(), new defpackage.afno(13));
                agkiVar2.f = defpackage.agmc.y(agkiVar2.a(), new defpackage.agkc(this.a, i));
                defpackage.agjo agjoVar = agkiVar2.c;
                if (agjoVar == null) {
                    agjoVar = new defpackage.agjo(null);
                }
                agkiVar2.c = defpackage.agmc.E(agjoVar, new defpackage.agkd(i3));
                return aojh.a;
            case 16:
                defpackage.agjw agjwVar = (defpackage.agjw) obj;
                aooh.f(agjwVar, "$this$configKeyframeSequence");
                agjwVar.b(((defpackage.agke) this.a).g(), new defpackage.afno(i4));
                return aojh.a;
            case 17:
                defpackage.agjw agjwVar2 = (defpackage.agjw) obj;
                aooh.f(agjwVar2, "$this$configKeyframeSequence");
                defpackage.agke agkeVar = (defpackage.agke) this.a;
                agjwVar2.b(agkeVar.d(), new defpackage.afno(i5));
                agjwVar2.b(agkeVar.a(), new defpackage.afno(i2));
                return aojh.a;
            case 18:
                defpackage.agjw agjwVar3 = (defpackage.agjw) obj;
                aooh.f(agjwVar3, "$this$configKeyframeSequence");
                agjwVar3.a = true;
                agjwVar3.b(((defpackage.agke) this.a).c(), new defpackage.afno(8));
                return aojh.a;
            case 19:
                defpackage.agjw agjwVar4 = (defpackage.agjw) obj;
                aooh.f(agjwVar4, "$this$configKeyframeSequence");
                defpackage.agke agkeVar2 = (defpackage.agke) this.a;
                agjwVar4.b(agkeVar2.f(), new defpackage.afno(11));
                agjwVar4.b(agkeVar2.e(), new defpackage.afno(12));
                return aojh.a;
            default:
                defpackage.agkb agkbVar2 = (defpackage.agkb) obj;
                aooh.f(agkbVar2, "$this$copy");
                agkbVar2.i = 0.5f;
                agkbVar2.b();
                agkbVar2.g = 0.0f;
                agkbVar2.c = 0.1f;
                agkbVar2.d = 0.4f;
                agkbVar2.a = 5.0f;
                agkbVar2.b = 16.0f;
                return aojh.a;
        }
        return arrayList;
    }
}
