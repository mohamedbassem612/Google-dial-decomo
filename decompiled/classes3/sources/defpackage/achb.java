package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class achb implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ achb(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: alio */
    /* JADX WARN: Type inference failed for: r7v13, types: [agza, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, java.util.Iterator] */
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                adag adagVar = (adag) obj;
                java.lang.Object obj2 = this.a;
                int i = achc.a;
                adagVar.n(" WHERE (account = ?");
                adagVar.p(achc.g((java.lang.String) obj2));
                adagVar.n(")");
                break;
            case 1:
                ((aaeb) this.a).i((com.google.android.gms.common.api.Status) obj);
                break;
            case 2:
                adag adagVar2 = (adag) obj;
                ?? r7 = this.a;
                if (r7.hasNext()) {
                    adagVar2.n(" WHERE (account = ?");
                    adagVar2.p(achc.g((java.lang.String) null));
                    adagVar2.n(" AND (");
                    achc.h(adagVar2, (akiq) r7.next());
                    while (r7.hasNext()) {
                        adagVar2.n(" OR ");
                        achc.h(adagVar2, (akiq) r7.next());
                    }
                    adagVar2.n("))");
                }
                break;
            case 3:
                adag adagVar3 = (adag) obj;
                ?? r8 = this.a;
                if (r8.hasNext()) {
                    adagVar3.n(" WHERE (account = ?");
                    adagVar3.p(achj.f((java.lang.String) null));
                    adagVar3.n(" AND (");
                    achj.g(adagVar3, (defpackage.akkn) r8.next());
                    while (r8.hasNext()) {
                        adagVar3.n(" OR ");
                        achj.g(adagVar3, (defpackage.akkn) r8.next());
                    }
                    adagVar3.n("))");
                }
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                adag adagVar4 = (adag) obj;
                adagVar4.n(" WHERE (account = ?");
                adagVar4.p(achj.f((java.lang.String) this.a));
                adagVar4.n(")");
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                java.lang.String str = (java.lang.String) obj;
                adqy.b.b().l("com/google/android/libraries/micore/telephony/common/resourcemanagers/superpacks/SuperpacksResourceManager", "downloadResource", 156, "SuperpacksResourceManager.java").y("adding superpack %s to whitelist", str);
                ((aigb) this.a).i(str, aikn.a);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                defpackage.agzq.a(this.a, (defpackage.agzu) obj);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                ((defpackage.amdx) this.a).a = (defpackage.agzr) obj;
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                ((aidq) this.a).a = (j$.util.Spliterator) obj;
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                ((alip) obj).m((alio) this.a);
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                ((alip) obj).m((alio) this.a);
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                ((alip) obj).m((alio) this.a);
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                ((alip) obj).m((alio) this.a);
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                ((alip) obj).m((alio) this.a);
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                java.io.InputStream inputStream = (java.io.InputStream) obj;
                java.lang.Object obj3 = this.a;
                try {
                    alud aludVar = ((alje) obj3).d;
                    defpackage.aljc aljcVar = ((alje) obj3).e;
                    aludVar.h(j$.util.Optional.of(aljcVar));
                    ((alje) obj3).i.execute(new akbr(obj3, aljcVar.a(), 14, (byte[]) null));
                    aiql.I(aljcVar.b.eU(new defpackage.afgu(aljcVar, inputStream, 14, null)), new jya(aljcVar, 19), aljcVar.b);
                } catch (alio e) {
                    alje aljeVar = (alje) obj3;
                    aljeVar.c.b(new defpackage.achb(e, 12));
                    aljeVar.c();
                    return;
                }
                break;
            case 15:
                ((alip) obj).m((alio) this.a);
                break;
            case 16:
                ((alip) obj).m((alio) this.a);
                break;
            default:
                ((alip) obj).o((alsi) this.a);
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
            default:
                break;
        }
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
