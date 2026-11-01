package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mjf {
    public static final aimz a = aimz.i("com/android/dialer/dialpadview/SpecialCharSequenceMgr");
    public final android.content.Context b;
    public final rlv c;
    public final ajct d;
    public final defpackage.mgb e;
    public final zjs f;
    public final rur g;
    public final defpackage.ve h;
    public final aogc i;

    public mjf(android.content.Context context, rur rurVar, rlv rlvVar, ajct ajctVar, aogc aogcVar, defpackage.ve veVar, defpackage.mgb mgbVar, zjs zjsVar) {
        this.b = context;
        this.g = rurVar;
        this.c = rlvVar;
        this.d = ajctVar;
        this.i = aogcVar;
        this.h = veVar;
        this.e = mgbVar;
        this.f = zjsVar;
    }

    public static boolean a(android.app.Activity activity, java.lang.String str) {
        aimz aimzVar = a;
        aimzVar.b().l("com/android/dialer/dialpadview/SpecialCharSequenceMgr", "handleRegulatoryInfoDisplay", 269, "SpecialCharSequenceMgr.java").v("handle regulatory info display");
        if (!str.equals("*#07#")) {
            return false;
        }
        aimzVar.b().l("com/android/dialer/dialpadview/SpecialCharSequenceMgr", "handleRegulatoryInfoDisplay", 275, "SpecialCharSequenceMgr.java").v("sending intent to settings app");
        try {
            ahqx.l(activity, new android.content.Intent("android.settings.SHOW_REGULATORY_INFO"));
            return true;
        } catch (android.content.ActivityNotFoundException e) {
            a.bq(a.c(), "startActivity() failed: ", "com/android/dialer/dialpadview/SpecialCharSequenceMgr", "handleRegulatoryInfoDisplay", (char) 283, "SpecialCharSequenceMgr.java", e, zct.b);
            return false;
        }
    }
}
