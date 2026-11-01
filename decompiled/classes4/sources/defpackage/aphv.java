package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aphv implements defpackage.aphi {
    @Override // defpackage.aphi
    public final java.util.List a() {
        return java.util.Arrays.asList("com.transsion.XOSLauncher", "com.transsion.hilauncher", "com.transsion.itel.launcher");
    }

    @Override // defpackage.aphi
    public final void b(android.content.Context context, android.content.ComponentName componentName, int i) {
        android.content.Intent intent = new android.content.Intent("com.mediatek.action.UNREAD_CHANGED");
        intent.putExtra("com.mediatek.intent.extra.UNREAD_COMPONENT", componentName);
        intent.putExtra("com.mediatek.intent.extra.UNREAD_NUMBER", i);
        context.sendBroadcast(intent);
    }
}
