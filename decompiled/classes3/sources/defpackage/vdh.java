package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vdh implements ajbc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ vdh(int i) {
        this.$cid = i;
        this.a = "/private/vendor/vendor.alu/messaging/MaxGreetingLength";
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, java.util.Map] */
    public final java.lang.Object a(ajyk ajykVar, java.lang.Object obj) throws java.io.IOException {
        switch (this.$cid) {
            case 0:
                android.database.Cursor cursor = (android.database.Cursor) obj;
                return (cursor == null || !cursor.moveToNext()) ? j$.util.Optional.empty() : j$.util.Optional.of(((vdo) this.a).a(cursor));
            case 1:
                android.database.Cursor cursor2 = (android.database.Cursor) obj;
                aimz aimzVar = defpackage.tib.a;
                if (cursor2 == null) {
                    a.bI(defpackage.tib.a.c().m(aioa.b), "empty cursor", "com/android/dialer/searchfragment/contactretriever/impl/Cp2PhoneEntryListRetriever", "fetchPhoneEntriesForEachContactId", (char) 237, "Cp2PhoneEntryListRetriever.java", zct.b);
                    return null;
                }
                cursor2.moveToFirst();
                while (true) {
                    ?? r9 = this.a;
                    if (cursor2.isAfterLast()) {
                        return aigf.i((java.util.Map) r9);
                    }
                    defpackage.tin tinVarB = defpackage.tin.b(cursor2, j$.util.Optional.empty(), 2);
                    java.lang.Long lValueOf = java.lang.Long.valueOf(tinVarB.l);
                    if (r9.containsKey(lValueOf)) {
                        ((java.util.List) r9.get(lValueOf)).add(tinVarB);
                    } else {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(tinVarB);
                        r9.put(lValueOf, arrayList);
                    }
                    cursor2.moveToNext();
                }
                break;
            case 2:
                android.database.Cursor cursor3 = (android.database.Cursor) obj;
                if (cursor3 == null) {
                    return aike.a;
                }
                aift aiftVar = new aift(4);
                while (cursor3.moveToNext()) {
                    aiftVar.i(((vdo) this.a).a(cursor3));
                }
                return aiftVar.h();
            case 3:
                android.database.Cursor cursor4 = (android.database.Cursor) obj;
                return cursor4.moveToNext() ? j$.util.Optional.of(((vdo) this.a).a(cursor4)) : j$.util.Optional.empty();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                vgg vggVar = (vgg) this.a;
                vggVar.i.n(rmw.aO);
                vggVar.j.f(vgg.b);
                return vgg.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                vgg vggVar2 = (vgg) this.a;
                vggVar2.i.n(rmw.aO);
                vggVar2.j.f(vgg.b);
                return vgg.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                defpackage.vih vihVar = (defpackage.vih) ((aigf) obj).get(this.a);
                if (vihVar != null) {
                    return j$.util.Optional.of(((defpackage.viq) vihVar).b().replace("\"", ""));
                }
                a.bI(defpackage.vgs.a.c().m(aioa.b), "can't retrieve imap element from the entry", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/ImapOperations", "fetchVoicemailMaxGreetingLengthFromMetadataInternal", (char) 373, "ImapOperations.java", zct.b);
                return j$.util.Optional.empty();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                aimw aimwVarK = defpackage.vgs.a.c().i(zct.b).k((defpackage.vgv) obj);
                ainp ainpVar = zct.a;
                aimwVarK.i(ainpVar).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/ImapOperations", "updateQuota", 1137, "ImapOperations.java").v("update quota failed");
                defpackage.vgs vgsVar = (defpackage.vgs) this.a;
                vgsVar.j();
                zjv.i(vgsVar.h.a(ainpVar), mgv.dd, (java.util.List) null, (mhc) null, 0, 30);
                return java.lang.Boolean.FALSE;
            default:
                defpackage.vih vihVar2 = (defpackage.vih) ((aigf) obj).get("/private/vendor/vendor.alu/messaging/Greetings/Personal");
                if (vihVar2 == null) {
                    a.bI(defpackage.vgs.a.c().m(aioa.b), "can't retrieve imap element from the entry", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/ImapOperations", "fetchVoicemailGreetingFromMetadataInternal", (char) 315, "ImapOperations.java", zct.b);
                    return j$.util.Optional.empty();
                }
                defpackage.vgs vgsVar2 = (defpackage.vgs) this.a;
                defpackage.vhu vhuVar = new defpackage.vhu(vgsVar2.c);
                vhuVar.s().a(((defpackage.viq) vihVar2).a());
                defpackage.vha vhaVar = vhuVar.c;
                if (vhaVar == null) {
                    a.bI(defpackage.vgs.a.c().m(aioa.b), "mime message body is null", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/ImapOperations", "fetchVoicemailGreetingFromMetadataInternal", (char) 327, "ImapOperations.java", zct.b);
                    return j$.util.Optional.empty();
                }
                java.lang.Long lC = vhuVar.c();
                if (lC == null) {
                    a.bI(defpackage.vgs.a.c().m(aioa.b), "can't retrieve duration", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/ImapOperations", "fetchVoicemailGreetingFromMetadataInternal", (char) 337, "ImapOperations.java", zct.b);
                    return j$.util.Optional.empty();
                }
                java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(vhaVar.a());
                aift aiftVar2 = new aift(4);
                while (true) {
                    int i = bufferedInputStream.read();
                    if (i == -1) {
                        android.telecom.PhoneAccountHandle phoneAccountHandle = vgsVar2.g;
                        defpackage.adrp adrpVarA = defpackage.voy.a();
                        adrpVarA.l(phoneAccountHandle);
                        adrpVarA.k(java.util.concurrent.TimeUnit.SECONDS.toMillis(lC.longValue()));
                        adrpVarA.b = aiftVar2.h();
                        adrpVarA.c = "Personal";
                        return j$.util.Optional.of(adrpVarA.j());
                    }
                    aiftVar2.i(java.lang.Byte.valueOf((byte) i));
                }
                break;
        }
    }

    public /* synthetic */ vdh(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
