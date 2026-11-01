package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agfa extends defpackage.ageu {
    final /* synthetic */ android.os.IBinder a;
    final /* synthetic */ defpackage.adsq b;

    public agfa(defpackage.adsq adsqVar, android.os.IBinder iBinder) {
        this.a = iBinder;
        j$.util.Objects.requireNonNull(adsqVar);
        this.b = adsqVar;
    }

    @Override // defpackage.ageu
    public final void a() {
        defpackage.agel agelVar;
        android.os.IBinder iBinder = this.a;
        if (iBinder == null) {
            agelVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
            agelVar = iInterfaceQueryLocalInterface instanceof defpackage.agel ? (defpackage.agel) iInterfaceQueryLocalInterface : new defpackage.agel(iBinder);
        }
        java.lang.Object obj = this.b.a;
        defpackage.agfc agfcVar = (defpackage.agfc) obj;
        agfcVar.l = agelVar;
        agfcVar.m.E("linkToDeath", new java.lang.Object[0]);
        try {
            ((defpackage.agfc) obj).l.a.linkToDeath(((defpackage.agfc) obj).i, 0);
        } catch (android.os.RemoteException e) {
            agfcVar.m.D(e, "linkToDeath failed", new java.lang.Object[0]);
        }
        defpackage.agfc agfcVar2 = (defpackage.agfc) this.b.a;
        agfcVar2.f = false;
        java.util.List list = agfcVar2.c;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
        list.clear();
    }
}
