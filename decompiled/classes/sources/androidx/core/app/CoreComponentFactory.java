package androidx.core.app;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class CoreComponentFactory extends android.app.AppComponentFactory {
    static java.lang.Object a(java.lang.Object obj) {
        java.lang.Object objA;
        return (!(obj instanceof defpackage.duu) || (objA = ((defpackage.duu) obj).a()) == null) ? obj : objA;
    }

    @Override // android.app.AppComponentFactory
    public final android.app.Activity instantiateActivity(java.lang.ClassLoader classLoader, java.lang.String str, android.content.Intent intent) {
        return (android.app.Activity) a(super.instantiateActivity(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    public final android.app.Application instantiateApplication(java.lang.ClassLoader classLoader, java.lang.String str) {
        return (android.app.Application) a(super.instantiateApplication(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    public final android.content.ContentProvider instantiateProvider(java.lang.ClassLoader classLoader, java.lang.String str) {
        return (android.content.ContentProvider) a(super.instantiateProvider(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    public final android.content.BroadcastReceiver instantiateReceiver(java.lang.ClassLoader classLoader, java.lang.String str, android.content.Intent intent) {
        return (android.content.BroadcastReceiver) a(super.instantiateReceiver(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    public final android.app.Service instantiateService(java.lang.ClassLoader classLoader, java.lang.String str, android.content.Intent intent) {
        return (android.app.Service) a(super.instantiateService(classLoader, str, intent));
    }
}
