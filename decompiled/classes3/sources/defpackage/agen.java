package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agen extends aacw {
    /* JADX WARN: Illegal instructions before constructor call */
    public agen() {
        java.lang.String str;
        java.util.Locale locale = java.util.Locale.getDefault();
        java.util.Map map = defpackage.aget.a;
        if (map.containsKey(-1)) {
            str = ((java.lang.String) map.get(-1)) + " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#" + ((java.lang.String) defpackage.aget.b.get(-1)) + ')';
        } else {
            str = "";
        }
        super(new com.google.android.gms.common.api.Status(-1, java.lang.String.format(locale, "Review Error(%d): %s", -1, str), (android.app.PendingIntent) null, (com.google.android.gms.common.ConnectionResult) null));
    }
}
