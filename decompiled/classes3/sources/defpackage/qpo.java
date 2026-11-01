package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qpo implements ajat {
    public final /* synthetic */ defpackage.qpq a;
    public final /* synthetic */ j$.util.Optional b;
    public final /* synthetic */ defpackage.qpp c;

    public /* synthetic */ qpo(defpackage.qpq qpqVar, j$.util.Optional optional, defpackage.qpp qppVar) {
        this.a = qpqVar;
        this.b = optional;
        this.c = qppVar;
    }

    public final ajcq a(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            defpackage.qpq.a.b().l("com/android/dialer/incall/video/logging/VideoCallLogger", "logSecondAddedCallType", 150, "VideoCallLogger.java").v("do not log the second added call type for conference calls");
            return ajcm.a;
        }
        defpackage.qpp qppVar = this.c;
        j$.util.Optional optional = this.b;
        defpackage.qpq qpqVar = this.a;
        ajcq ajcqVarK = qpqVar.j.k((defpackage.apqr) optional.orElseThrow(), defpackage.qpp.class, new iry(10));
        ajcq ajcqVarAS = qppVar.aS();
        return ahvr.ak(new ajcq[]{ajcqVarK, ajcqVarAS}).o(new hsl(qpqVar, ajcqVarK, ajcqVarAS, 16, (byte[]) null), qpqVar.g);
    }
}
