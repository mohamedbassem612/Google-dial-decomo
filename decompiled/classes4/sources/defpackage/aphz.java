package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aphz implements defpackage.aphi {
    private final android.net.Uri a = android.net.Uri.parse("content://com.android.badge/badge");

    @Override // defpackage.aphi
    public final java.util.List a() {
        return java.util.Collections.singletonList("com.zui.launcher");
    }

    @Override // defpackage.aphi
    public final void b(android.content.Context context, android.content.ComponentName componentName, int i) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("app_badge_count", i);
        context.getContentResolver().call(this.a, "setAppBadgeCount", (java.lang.String) null, bundle);
    }
}
