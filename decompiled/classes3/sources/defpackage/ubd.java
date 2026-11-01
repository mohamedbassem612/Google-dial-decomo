package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ubd implements defpackage.agyz {
    public static final agxj a = new agxj("SonicSettingsKey");
    private final ajct b;
    private final uav c;

    public ubd(ajct ajctVar, uav uavVar) {
        this.b = ajctVar;
        this.c = uavVar;
    }

    @Override // defpackage.agyz
    public final /* synthetic */ agxk a() {
        return a;
    }

    @Override // defpackage.agyz
    public final ajcq b() {
        ajcq ajcqVarBk;
        uav uavVar = this.c;
        if (uavVar.b.m()) {
            uav.a.d().g(10, java.util.concurrent.TimeUnit.MINUTES).m(aioa.b).l("com/android/dialer/sonic/impl/settings/SonicSettings", "getData", 70, "SonicSettings.java").v("getData called in direct boot mode");
            ajcqVarBk = uav.a();
        } else {
            ajcqVarBk = uavVar.d.bk();
        }
        return ahvr.H(ajcqVarBk, new ubc(0), this.b);
    }
}
