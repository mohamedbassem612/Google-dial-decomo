package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class gua extends defpackage.aomh implements defpackage.aonn {
    /* synthetic */ boolean a;
    final /* synthetic */ android.content.Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gua(android.content.Context context, defpackage.aoln aolnVar) {
        super(2, aolnVar);
        this.b = context;
    }

    @Override // defpackage.aonn
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        bool.booleanValue();
        return ((defpackage.gua) c(bool, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        boolean z = this.a;
        defpackage.aooc.af(obj);
        java.lang.String str = defpackage.gyi.a;
        android.content.Context context = this.b;
        if (context == null) {
            defpackage.aooh.i("context");
        }
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        defpackage.aooh.e(packageManager, "getPackageManager(...)");
        defpackage.gyi.a(packageManager, new android.content.ComponentName(context, (java.lang.Class<?>) androidx.work.impl.background.systemalarm.RescheduleReceiver.class), z, defpackage.gyg.a);
        return defpackage.aojh.a;
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        defpackage.gua guaVar = new defpackage.gua(this.b, aolnVar);
        guaVar.a = ((java.lang.Boolean) obj).booleanValue();
        return guaVar;
    }
}
