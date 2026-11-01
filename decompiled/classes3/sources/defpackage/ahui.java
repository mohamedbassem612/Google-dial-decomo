package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class ahui extends android.app.Service {
    public defpackage.ydy c;

    protected abstract defpackage.ahuo c();

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return this.c.g();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        anrp anrpVar = new anrp();
        android.content.Context applicationContext = getApplicationContext();
        java.util.HashMap map = new java.util.HashMap();
        map.put("com.google.assistant.appactions.service.proto.AppActionsService", new defpackage.ahul(applicationContext));
        apjb apjbVarAT = anty.aT(map);
        anng anngVar = new anng(anrk.b(this), anrpVar);
        anngVar.i(apjbVarAT);
        anngVar.f(new defpackage.ahun());
        defpackage.ahuk ahukVar = new defpackage.ahuk(this);
        aocv aocvVar = anngVar.a;
        apjb apjbVarB = defpackage.ahus.B(ahukVar);
        ((java.util.HashMap) aocvVar.s.a).put(((anqq) apjbVarB.a).a, apjbVarB);
        this.c = new defpackage.ydy(anngVar.g(), anrpVar);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        defpackage.ydy ydyVar = this.c;
        if (ydyVar != null && ydyVar.a) {
            ((anqk) ydyVar.c).a();
            ydyVar.a = false;
        }
        super.onDestroy();
    }
}
