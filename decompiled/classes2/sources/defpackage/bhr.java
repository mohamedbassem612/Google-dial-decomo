package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class bhr implements aonq {
    private final /* synthetic */ int $cid;

    public /* synthetic */ bhr(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        int i = this.$cid;
        if (i == 0) {
            return defpackage.bhs.a(obj, obj2, obj3, obj4, ((java.lang.Integer) obj5).intValue());
        }
        if (i != 1) {
            return defpackage.bhs.a(obj, obj2, obj3, obj4, ((java.lang.Integer) obj5).intValue());
        }
        android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) obj2;
        boolean zBooleanValue = ((java.lang.Boolean) obj3).booleanValue();
        long j = ((dky) obj5).b;
        java.lang.String string = ((java.lang.CharSequence) obj4).subSequence(dky.c(j), dky.b(j)).toString();
        android.content.Intent className = defpackage.bhb.a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", zBooleanValue).setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        className.putExtra("android.intent.extra.PROCESS_TEXT", string);
        ((android.content.Context) obj).startActivity(className);
        return aojh.a;
    }
}
