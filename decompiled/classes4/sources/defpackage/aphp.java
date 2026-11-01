package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aphp implements defpackage.aphi {
    @Override // defpackage.aphi
    public final java.util.List a() {
        return java.util.Arrays.asList("com.htc.launcher");
    }

    @Override // defpackage.aphi
    public final void b(android.content.Context context, android.content.ComponentName componentName, int i) throws defpackage.aphj {
        android.content.Intent intent = new android.content.Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", componentName.flattenToShortString());
        intent.putExtra("com.htc.launcher.extra.COUNT", i);
        android.content.Intent intent2 = new android.content.Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent2.putExtra("packagename", componentName.getPackageName());
        intent2.putExtra("count", i);
        if (!aoog.f(context, intent) && !aoog.f(context, intent2)) {
            throw new defpackage.aphj("unable to resolve intent: ".concat(java.lang.String.valueOf(intent2.toString())));
        }
        context.sendBroadcast(intent);
        context.sendBroadcast(intent2);
    }
}
