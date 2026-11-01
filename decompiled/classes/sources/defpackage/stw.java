package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class stw {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/precall/impl/PhoneCallStarter");
    private final defpackage.jxe b;
    private final defpackage.zzx c;
    private final defpackage.zzx d;

    public stw(defpackage.jxe jxeVar, defpackage.aazc aazcVar, defpackage.zzx zzxVar, defpackage.zzx zzxVar2) {
        if (aazcVar == null) {
            defpackage.aooh.i("clock");
        }
        this.b = jxeVar;
        this.c = zzxVar;
        this.d = zzxVar2;
    }

    public static final android.os.Bundle b(defpackage.akzc akzcVar) {
        defpackage.aooh.f(akzcVar, "<this>");
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        defpackage.aooh.e(parcelObtain, "obtain(...)");
        parcelObtain.unmarshall(akzcVar.D(), 0, akzcVar.c());
        parcelObtain.setDataPosition(0);
        android.os.Bundle bundle = parcelObtain.readBundle(akzcVar.getClass().getClassLoader());
        parcelObtain.recycle();
        return bundle;
    }

    public final void a(zrx zrxVar) {
        java.lang.Object next;
        j$.util.Optional optionalEmpty;
        defpackage.aooh.f(zrxVar, "callParameter");
        zsf zsfVar = zrxVar.c == 2 ? (zsf) zrxVar.d : zsf.a;
        defpackage.aooh.e(zsfVar, "getPhoneCallParameter(...)");
        android.net.Uri uri = android.net.Uri.parse(zrxVar.e);
        defpackage.aihd aihdVarE = this.c.e();
        defpackage.aooh.e(aihdVarE, "get(...)");
        java.util.Iterator it = defpackage.ajsz.bX(aihdVarE, new qxq(9)).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((sts) next).b());
        sts stsVar = (sts) next;
        if (stsVar != null) {
            ((defpackage.aimw) a.b().l("com/android/dialer/precall/impl/PhoneCallStarter", "startCall$<anonymous>", 43, "PhoneCallStarter.kt")).y("redirecting call to %s", stsVar.a());
            return;
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.CALL", uri);
        intent.putExtra("android.telecom.extra.START_CALL_WITH_VIDEO_STATE", true != zsfVar.f ? 0 : 3);
        android.os.Bundle bundle = new android.os.Bundle();
        j$.util.Map.-EL.forEach(j$.util.DesugarCollections.unmodifiableMap((zrxVar.c == 2 ? (zsf) zrxVar.d : zsf.a).j), new jwx(new gfw(bundle, 2, (char[]) null), 7));
        j$.util.Map.-EL.forEach(j$.util.DesugarCollections.unmodifiableMap((zrxVar.c == 2 ? (zsf) zrxVar.d : zsf.a).k), new jwx(new gfw(bundle, 3, (short[]) null), 8));
        j$.util.Map.-EL.forEach(j$.util.DesugarCollections.unmodifiableMap((zrxVar.c == 2 ? (zsf) zrxVar.d : zsf.a).l), new jwx(new gfw(bundle, 4, (int[]) null), 9));
        defpackage.aihd aihdVarE2 = this.d.e();
        defpackage.aooh.e(aihdVarE2, "get(...)");
        java.util.Iterator<E> it2 = aihdVarE2.iterator();
        while (it2.hasNext()) {
            ((defpackage.stu) it2.next()).a(bundle, zrxVar);
        }
        int i = zrxVar.c;
        if (((i == 2 ? (zsf) zrxVar.d : zsf.a).b & 1024) != 0) {
            abvz abvzVar = (i == 2 ? (zsf) zrxVar.d : zsf.a).o;
            if (abvzVar == null) {
                abvzVar = abvz.a;
            }
            optionalEmpty = j$.util.Optional.of(abvzVar);
        } else {
            optionalEmpty = j$.util.Optional.empty();
        }
        defpackage.aooh.c(optionalEmpty);
        abwc.d(bundle, optionalEmpty);
        bundle.putLong("android.telecom.extra.CALL_CREATED_TIME_MILLIS", android.os.SystemClock.elapsedRealtime());
        int i2 = zrxVar.c;
        if (((i2 == 2 ? (zsf) zrxVar.d : zsf.a).b & 256) != 0) {
            defpackage.akzc akzcVar = (i2 == 2 ? (zsf) zrxVar.d : zsf.a).m;
            defpackage.aooh.e(akzcVar, "getExternalInCallUiIntentExtras(...)");
            bundle.putAll(b(akzcVar));
        }
        intent.putExtra("android.telecom.extra.OUTGOING_CALL_EXTRAS", bundle);
        if (zsfVar.e) {
            intent.putExtra("IS_EMERGENCY_NUMBER", true);
        }
        if ((zrxVar.b & 8) != 0) {
            zrz zrzVar = zrxVar.g;
            if (zrzVar == null) {
                zrzVar = zrz.a;
            }
            defpackage.aooh.e(zrzVar, "getPhoneAccountHandleInfo(...)");
            intent.putExtra("android.telecom.extra.PHONE_ACCOUNT_HANDLE", defpackage.aehj.cf(zrzVar));
        }
        java.lang.String str = zsfVar.h;
        defpackage.aooh.e(str, "getCallSubject(...)");
        if (str.length() > 0) {
            intent.putExtra("android.telecom.extra.CALL_SUBJECT", zsfVar.h);
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        if ((zsfVar.b & 512) != 0) {
            defpackage.akzc akzcVar2 = zsfVar.n;
            defpackage.aooh.e(akzcVar2, "getExternalPlaceCallExtras(...)");
            bundle2.putAll(b(akzcVar2));
        }
        intent.putExtras(bundle2);
        this.b.c(intent);
    }
}
