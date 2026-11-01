package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aphl implements defpackage.aphi {
    private final /* synthetic */ int $cid;

    public aphl(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aphi
    public final java.util.List a() {
        return this.$cid != 0 ? new java.util.ArrayList(0) : java.util.Arrays.asList("org.adw.launcher", "org.adwfreak.launcher");
    }

    @Override // defpackage.aphi
    public final void b(android.content.Context context, android.content.ComponentName componentName, int i) throws defpackage.aphj {
        if (this.$cid != 0) {
            android.content.Intent intent = new android.content.Intent("android.intent.action.BADGE_COUNT_UPDATE");
            intent.putExtra("badge_count", i);
            intent.putExtra("badge_count_package_name", componentName.getPackageName());
            intent.putExtra("badge_count_class_name", componentName.getClassName());
            if (!aoog.f(context, intent)) {
                throw new defpackage.aphj("unable to resolve intent: ".concat(java.lang.String.valueOf(intent.toString())));
            }
            context.sendBroadcast(intent);
            return;
        }
        android.content.Intent intent2 = new android.content.Intent("org.adw.launcher.counter.SEND");
        intent2.putExtra("PNAME", componentName.getPackageName());
        intent2.putExtra("CNAME", componentName.getClassName());
        intent2.putExtra("COUNT", i);
        if (!aoog.f(context, intent2)) {
            throw new defpackage.aphj("unable to resolve intent: ".concat(java.lang.String.valueOf(intent2.toString())));
        }
        context.sendBroadcast(intent2);
    }
}
