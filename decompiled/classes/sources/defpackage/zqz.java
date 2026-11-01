package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
@java.lang.Deprecated
public final class zqz {
    public static final defpackage.aify a;
    public static final defpackage.aify b;
    public static final defpackage.aify c;
    public static final defpackage.aify d;

    static {
        defpackage.aify aifyVarV = defpackage.aify.v("android.permission.READ_CALL_LOG", "android.permission.WRITE_CALL_LOG", "android.permission.READ_PHONE_STATE", "android.permission.MODIFY_PHONE_STATE", "android.permission.SEND_SMS", "android.permission.CALL_PHONE", "com.android.voicemail.permission.ADD_VOICEMAIL", "android.permission.READ_PHONE_NUMBERS");
        a = aifyVarV;
        defpackage.aift aiftVar = new defpackage.aift(4);
        aiftVar.k(aifyVarV);
        aiftVar.i("android.permission.POST_NOTIFICATIONS");
        defpackage.aify aifyVarG = aiftVar.g();
        b = aifyVarG;
        defpackage.aift aiftVar2 = new defpackage.aift(4);
        aiftVar2.k(aifyVarG);
        aiftVar2.i("android.permission.BYPASS_CONCURRENT_RECORD_AUDIO_RESTRICTION");
        c = aiftVar2.g();
        d = defpackage.aify.q("android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS");
        defpackage.aify.r("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION");
    }

    public static boolean a(android.content.Context context, java.lang.String str) {
        return defpackage.dvx.c(context, str) == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.lang.String[] b(android.content.Context context, java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.ailk ailkVarListIterator = ((defpackage.aify) list).listIterator(0);
        while (ailkVarListIterator.hasNext()) {
            java.lang.String str = (java.lang.String) ailkVarListIterator.next();
            if (!a(context, str)) {
                arrayList.add(str);
            }
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
    }
}
