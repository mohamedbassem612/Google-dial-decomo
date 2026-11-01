package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aamr implements defpackage.aame {
    public static final com.google.android.gms.common.api.Status a = new com.google.android.gms.common.api.Status(13, (java.lang.String) null, (android.app.PendingIntent) null, (com.google.android.gms.common.ConnectionResult) null);

    /* JADX WARN: Multi-variable type inference failed */
    static final void b(android.app.Activity activity, android.content.Intent intent, com.google.android.gms.googlehelp.GoogleHelp googleHelp) {
        if (intent.hasExtra("EXTRA_GOOGLE_HELP")) {
            intent.putExtra("EXTRA_GOOGLE_HELP", (android.os.Parcelable) googleHelp);
        } else if (intent.hasExtra("EXTRA_IN_PRODUCT_HELP")) {
            android.os.Parcelable.Creator creator = com.google.android.gms.googlehelp.InProductHelp.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra("EXTRA_IN_PRODUCT_HELP");
            com.google.android.gms.googlehelp.InProductHelp inProductHelp = (com.google.android.gms.googlehelp.InProductHelp) (byteArrayExtra == null ? null : aehj.bS(byteArrayExtra, creator));
            inProductHelp.a = googleHelp;
            aehj.bU(inProductHelp, intent);
        }
        new aanh(android.os.Looper.getMainLooper()).post(new defpackage.wdm(activity, intent, 18));
    }

    public final void a(com.google.android.gms.googlehelp.GoogleHelp googleHelp) {
        java.util.ArrayList arrayList;
        int i = googleHelp.M;
        if (i == 0 || i == 1) {
            defpackage.aiep aiepVar = defpackage.aamw.a;
            synchronized (aiepVar) {
                arrayList = new java.util.ArrayList(aiepVar);
            }
            if (arrayList.isEmpty()) {
                return;
            }
            googleHelp.N = arrayList;
        }
    }
}
