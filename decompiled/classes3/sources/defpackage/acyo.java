package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class acyo implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ acyo(acyu acyuVar, int i, defpackage.acvu acvuVar, defpackage.acvr acvrVar, defpackage.acwe acweVar, int i2) {
        this.$cid = i2;
        this.b = acyuVar;
        this.a = i;
        this.c = acvuVar;
        this.d = acvrVar;
        this.e = acweVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, rlv] */
    public final ajcq a(java.lang.Object obj) {
        if (this.$cid == 0) {
            if (((java.lang.Boolean) obj).booleanValue() || this.a == 4) {
                return ajcm.a;
            }
            java.lang.Object obj2 = this.e;
            java.lang.Object obj3 = this.d;
            java.lang.Object obj4 = this.c;
            defpackage.acvu acvuVar = (defpackage.acvu) obj4;
            return ((acyu) this.b).r(acvuVar, (defpackage.acvr) obj3, (defpackage.acwe) obj2, acvuVar.l);
        }
        java.lang.Object obj5 = this.e;
        defpackage.uhp uhpVar = (defpackage.uhp) obj5;
        uhpVar.d.n(rmw.ip);
        android.content.Context context = uhpVar.a;
        android.app.Notification notificationBuild = new android.app.Notification.Builder(context, "phone_default").setContentIntent((android.app.PendingIntent) this.d).setCategory("status").setPriority(0).setColor(urg.c(context, 2130969018)).setSmallIcon(2131232042).setLargeIcon(android.graphics.drawable.Icon.createWithResource(context, 2131232149)).setContentText(context.getString(2132020215)).setStyle(new android.app.Notification.BigTextStyle().bigText(context.getString(2132020215))).addAction(new android.app.Notification.Action.Builder(2131231051, context.getString(2132020214), (android.app.PendingIntent) this.c).build()).setContentTitle(context.getString(2132020216)).build();
        java.lang.Object obj6 = uhpVar.e;
        return ((rwi) obj6).h((java.lang.String) this.b, this.a, notificationBuild);
    }

    public /* synthetic */ acyo(defpackage.uhp uhpVar, java.lang.String str, int i, android.app.PendingIntent pendingIntent, android.app.PendingIntent pendingIntent2, int i2) {
        this.$cid = i2;
        this.e = uhpVar;
        this.b = str;
        this.a = i;
        this.d = pendingIntent;
        this.c = pendingIntent2;
    }
}
