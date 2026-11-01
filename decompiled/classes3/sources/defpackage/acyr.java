package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class acyr implements ajat {
    public final /* synthetic */ acyu a;
    public final /* synthetic */ defpackage.acvr b;
    public final /* synthetic */ defpackage.acvu c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    public /* synthetic */ acyr(acyu acyuVar, defpackage.acvr acvrVar, defpackage.acvu acvuVar, boolean z, boolean z2, int i, int i2) {
        this.a = acyuVar;
        this.b = acvrVar;
        this.c = acvuVar;
        this.d = z;
        this.e = z2;
        this.f = i;
        this.g = i2;
    }

    public final ajcq a(java.lang.Object obj) {
        acyu acyuVar = this.a;
        defpackage.acvu acvuVar = this.c;
        boolean z = this.d;
        boolean z2 = this.e;
        int i = this.f + 1;
        defpackage.acvr acvrVar = this.b;
        int i2 = this.g;
        defpackage.acwa acwaVar = (defpackage.acwa) obj;
        if (acwaVar == defpackage.acwa.DOWNLOAD_COMPLETE) {
            java.lang.String str = acvrVar.c;
            int i3 = adbe.a;
            return acyuVar.i(acvuVar, z, z2, i, i2);
        }
        if (acwaVar == defpackage.acwa.SUBSCRIBED || acwaVar == defpackage.acwa.DOWNLOAD_IN_PROGRESS) {
            java.lang.String str2 = acvrVar.c;
            int i4 = adbe.a;
            return acyuVar.i(acvuVar, z, true, i, i2);
        }
        java.lang.String str3 = acvrVar.c;
        int i5 = adbe.a;
        return acyuVar.i(acvuVar, true, z2, i, i2);
    }
}
