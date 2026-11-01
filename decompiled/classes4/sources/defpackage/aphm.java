package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aphm implements defpackage.aphi {
    @Override // defpackage.aphi
    public final java.util.List a() {
        return java.util.Arrays.asList("com.anddoes.launcher");
    }

    @Override // defpackage.aphi
    public final void b(android.content.Context context, android.content.ComponentName componentName, int i) throws defpackage.aphj {
        android.content.Intent intent = new android.content.Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra("package", componentName.getPackageName());
        intent.putExtra("count", i);
        intent.putExtra("class", componentName.getClassName());
        if (!aoog.f(context, intent)) {
            throw new defpackage.aphj("unable to resolve intent: ".concat(java.lang.String.valueOf(intent.toString())));
        }
        context.sendBroadcast(intent);
    }
}
