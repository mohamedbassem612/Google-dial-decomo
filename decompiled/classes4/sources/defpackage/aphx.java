package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aphx implements defpackage.aphi {
    @Override // defpackage.aphi
    public final java.util.List a() {
        return java.util.Arrays.asList("com.miui.miuilite", "com.miui.home", "com.miui.miuihome", "com.miui.miuihome2", "com.miui.mihome", "com.miui.mihome2");
    }

    @Override // defpackage.aphi
    public final void b(android.content.Context context, android.content.ComponentName componentName, int i) throws defpackage.aphj {
        java.lang.Object objValueOf;
        try {
            java.lang.Object objNewInstance = java.lang.Class.forName("android.app.MiuiNotification").newInstance();
            java.lang.reflect.Field declaredField = objNewInstance.getClass().getDeclaredField("messageCount");
            declaredField.setAccessible(true);
            if (i == 0) {
                objValueOf = "";
            } else {
                try {
                    objValueOf = java.lang.Integer.valueOf(i);
                } catch (java.lang.Exception unused) {
                    declaredField.set(objNewInstance, java.lang.Integer.valueOf(i));
                    return;
                }
            }
            declaredField.set(objNewInstance, objValueOf.toString());
        } catch (java.lang.Exception unused2) {
            android.content.Intent intent = new android.content.Intent("android.intent.action.APPLICATION_MESSAGE_UPDATE");
            intent.putExtra("android.intent.extra.update_application_component_name", componentName.getPackageName() + '/' + componentName.getClassName());
            intent.putExtra("android.intent.extra.update_application_message_text", (i != 0 ? java.lang.Integer.valueOf(i) : "").toString());
            if (!aoog.f(context, intent)) {
                throw new defpackage.aphj("unable to resolve intent: ".concat(java.lang.String.valueOf(intent.toString())));
            }
            context.sendBroadcast(intent);
        }
    }
}
