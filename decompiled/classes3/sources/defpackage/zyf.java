package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zyf implements java.lang.Runnable {
    public static final /* synthetic */ int b = 0;
    private static final aaif c = new aaif("RevokeAccessOperation", new java.lang.String[0]);
    public final defpackage.aafo a;
    private final java.lang.String d;

    public zyf(java.lang.String str) {
        aais.ap(str);
        this.d = str;
        this.a = new defpackage.aafo(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.api.Status status = com.google.android.gms.common.api.Status.c;
        try {
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.d).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = com.google.android.gms.common.api.Status.a;
            } else {
                c.d("Unable to revoke access!");
            }
            c.b(a.bj(responseCode, "Response Code: "));
        } catch (java.io.IOException e) {
            c.d("IOException when revoking access: ".concat(java.lang.String.valueOf(e.toString())));
        } catch (java.lang.Exception e2) {
            c.d("Exception when revoking access: ".concat(java.lang.String.valueOf(e2.toString())));
        }
        this.a.l(status);
    }
}
