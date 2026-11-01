package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gyi {
    public static final java.lang.String a = defpackage.gsh.b("PackageManagerHelper");
    public static final java.util.HashMap b = new java.util.HashMap();

    public static final void a(android.content.pm.PackageManager packageManager, android.content.ComponentName componentName, boolean z, defpackage.aonn aonnVar) {
        try {
            if (z != ((java.lang.Boolean) aonnVar.a(packageManager, componentName)).booleanValue()) {
                packageManager.setComponentEnabledSetting(componentName, true != z ? 2 : 1, 1);
                defpackage.gsh.a().c(a, componentName.getClassName() + ' ' + (z ? "enabled" : "disabled"));
            }
        } catch (java.lang.Exception e) {
            defpackage.gsh gshVarA = defpackage.gsh.a();
            java.lang.String str = a;
            java.lang.String className = componentName.getClassName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(className);
            sb.append(" could not be ");
            sb.append(true == z ? "enabled" : "disabled");
            gshVarA.d(str, sb.toString(), e);
        }
    }
}
