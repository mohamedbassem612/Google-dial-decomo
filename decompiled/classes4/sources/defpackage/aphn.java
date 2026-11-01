package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aphn implements defpackage.aphi {
    @Override // defpackage.aphi
    public final java.util.List a() {
        return java.util.Arrays.asList("com.asus.launcher");
    }

    @Override // defpackage.aphi
    public final void b(android.content.Context context, android.content.ComponentName componentName, int i) throws defpackage.aphj {
        android.content.Intent intent = new android.content.Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i);
        intent.putExtra("badge_count_package_name", componentName.getPackageName());
        intent.putExtra("badge_count_class_name", componentName.getClassName());
        intent.putExtra("badge_vip_count", 0);
        if (!aoog.f(context, intent)) {
            throw new defpackage.aphj("unable to resolve intent: ".concat(java.lang.String.valueOf(intent.toString())));
        }
        context.sendBroadcast(intent);
    }
}
