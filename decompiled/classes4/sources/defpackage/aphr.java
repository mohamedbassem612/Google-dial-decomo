package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aphr implements defpackage.aphi {
    private int a = -1;

    @Override // defpackage.aphi
    public final java.util.List a() {
        return java.util.Collections.singletonList("com.oppo.launcher");
    }

    @Override // defpackage.aphi
    public final void b(android.content.Context context, android.content.ComponentName componentName, int i) throws defpackage.aphj {
        if (this.a != i) {
            this.a = i;
            try {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("app_badge_count", i);
                context.getContentResolver().call(android.net.Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (java.lang.String) null, bundle);
            } catch (java.lang.Throwable unused) {
                throw new defpackage.aphj("Unable to execute Badge By Content Provider");
            }
        }
    }
}
